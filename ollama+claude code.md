# Claude + Ollama Setup Guide (Windows)

This guide explains how to install and configure **Claude CLI** with **Ollama** on a Windows system.



## Download Claude CLI

Download the Claude executable from the link below:

```text
https://storage.googleapis.com/claude-code-dist-86c565f3-f756-42ad-8dfa-d59b1c096819/claude-code-releases/2.1.109/win32-x64/claude.exe
````

Save it to a convenient location (e.g., `C:\Tools\Claude\`).



## Download Ollama

Download the Ollama installer:

```text
https://release-assets.githubusercontent.com/github-production-release-asset/658928958/a0a7cb2e-03b6-40b5-a107-b5b6a5cbefb8
```

> Note: This is a time-limited signed URL. Download it as soon as possible.



## Install Ollama

1. Run the downloaded `OllamaSetup.exe`
2. Follow the installation wizard
3. Use default settings unless required otherwise
4. Complete installation



## Install Claude CLI

Open PowerShell and run:

```powershell
claude install latest
```



## Configure Environment Variables

Run PowerShell as **Administrator** and execute the following commands.

### Add Claude binaries to PATH

```powershell
[Environment]::SetEnvironmentVariable(
  "PATH",
  $env:PATH + ";C:\Users\y.pektas\.local\bin",
  "User"
)
```

### Set Git Bash path for Claude

```powershell
[Environment]::SetEnvironmentVariable(
  "CLAUDE_CODE_GIT_BASH_PATH",
  "C:\Users\y.pektas\AppData\Local\Programs\Git\bin\bash.exe",
  "User"
)
```


## Start Claude with Ollama

Once everything is installed, start the integration:

```powershell
ollama launch claude
```



## Done

If everything is configured correctly, Claude should now run via Ollama.



## Notes

* Restart your terminal after modifying environment variables
* Ensure Git is installed before using Claude integration
* Verify Ollama service is running if launch fails
