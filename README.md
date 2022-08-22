Create a shared library based on java-maven-app project 

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

PS C:\Users\abhia\IdeaProjects\Jenkins-shared-library> git push -u origin master
Enumerating objects: 12, done.
Counting objects: 100% (12/12), done.
Delta compression using up to 8 threads
Compressing objects: 100% (11/11), done.
Writing objects: 100% (12/12), 1.89 KiB | 644.00 KiB/s, done.
Total 12 (delta 0), reused 0 (delta 0), pack-reused 0
remote:
remote: Create a pull request for 'master' on GitHub by visiting:
remote:      https://github.com/Shalinderjeet/Jenkins-shared-library/pull/new/master
remote:
To https://github.com/Shalinderjeet/Jenkins-shared-library.git


----------------------------------------------------------------------------------------------------------------------------------


Manage Jenkins->Configure System->Global Pipeline Libraries->Add

