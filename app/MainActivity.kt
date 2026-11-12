package com.mapeador.app

import android.app.Activity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.graphics.Color

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(10, 16, 27)
        window.navigationBarColor = Color.rgb(10, 16, 27)

        val webView = WebView(this)
        webView.setBackgroundColor(Color.rgb(10, 16, 27))
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.settings.allowFileAccess = true
        webView.settings.allowContentAccess = false
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()
        setContentView(webView)

        if (savedInstanceState == null) {
            webView.loadUrl("file:///android_asset/mapeador.html")
        } else {
            webView.restoreState(savedInstanceState)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        (window.decorView.findViewById(android.R.id.content) as? android.view.ViewGroup)
            ?.let { group ->
                (0 until group.childCount).forEach { index ->
                    (group.getChildAt(index) as? WebView)?.saveState(outState)
                }
            }
        super.onSaveInstanceState(outState)
    }
}
