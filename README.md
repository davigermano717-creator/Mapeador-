# MAPEADOR — projeto inicial Android

Este projeto empacota a prévia HTML do MAPEADOR em um aplicativo Android simples usando WebView.

## O que esta primeira APK faz
- Abre a interface MAPEADOR localmente, sem depender de hospedagem.
- Mostra o editor visual demonstrativo e os campos X/Y manuais.
- Permite testar a interface e salvar perfis no armazenamento local do WebView.

## O que NÃO faz ainda
- Não mapeia mouse/teclado para comandos dentro do Free Fire.
- Não cria uma sobreposição sobre outros aplicativos.
- Não altera o DPI físico do mouse nem a sensibilidade real do jogo.
- Não é uma versão funcional equivalente ao Panda Mouse Pro.

## Compilar usando GitHub Actions (pode ser feito pelo navegador do celular)
1. Crie um repositório novo no GitHub chamado `MAPEADOR`.
2. Extraia este ZIP no celular.
3. Envie todos os arquivos e pastas extraídos para a raiz do repositório, preservando a pasta `.github/workflows`.
4. No GitHub, abra a aba **Actions**.
5. Se aparecer a confirmação para permitir workflows, confirme.
6. Escolha **Build MAPEADOR APK** e toque em **Run workflow** (ou faça um commit na branch `main` para disparar o build).
7. Aguarde o workflow terminar com sucesso.
8. Abra a execução concluída, vá até **Artifacts** e baixe `MAPEADOR-debug`.
9. Extraia o ZIP do artifact e instale `app-debug.apk` no Android. Se o Android pedir, permita a instalação para o navegador/gerenciador de arquivos usado.

## Compilar no Android Studio (computador)
1. Abra a pasta deste projeto no Android Studio.
2. Aguarde a sincronização do Gradle.
3. Selecione **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
4. O APK de depuração será gerado em `app/build/outputs/apk/debug/`.

## Próxima etapa técnica
Migrar as partes importantes da interface para componentes Android nativos e implementar/testar separadamente reconhecimento de dispositivos, serviço de sobreposição e permissões, sem contornar proteções de jogos.
