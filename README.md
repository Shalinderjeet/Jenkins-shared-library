

PS C:\Users\abhia\IdeaProjects\Jenkins-shared-library> git status
fatal: not a git repository (or any of the parent directories): .git

PS C:\Users\abhia\IdeaProjects\Jenkins-shared-library> git init
Initialized empty Git repository in C:/Users/abhia/IdeaProjects/Jenkins-shared-library/.git/

PS C:\Users\abhia\IdeaProjects\Jenkins-shared-library> git remote add origin https://github.com/Shalinderjeet/Jenkins-shared-library.git
PS C:\Users\abhia\IdeaProjects\Jenkins-shared-library> git add .

PS C:\Users\abhia\IdeaProjects\Jenkins-shared-library> git commit -m "initial commit"
[master (root-commit) 608fab4] initial commit
 8 files changed, 60 insertions(+)
 create mode 100644 .idea/.gitignore
 create mode 100644 .idea/misc.xml
 create mode 100644 .idea/modules.xml
 create mode 100644 .idea/runConfigurations.xml
 create mode 100644 .idea/vcs.xml
 create mode 100644 Jenkins-shared-library.iml
 create mode 100644 vars/buildImage.groovy
 create mode 100644 vars/buildJar.groovy
