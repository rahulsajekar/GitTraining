# GitTraining
Practice of GIT fundamental concepts.
Git is used for Version Control.

### Git process
Working Directory ||  Staging Area ||  Local repository  ||   Remote repository

git add --------> || git commit--->||  git push ----->   ||


### Commands
1) git init -> Initialize the empty repository 
2) git status -> shows status of all files
3) git add <filename> -> track the file
4) git commit <filename> -> commit/save the file to the local repository
5) git push -> Push local repo to remote repo
6) git restore <filename> -> get the last commited version of file
7) git pull origin master -> fetch all the changes from remote repository to local repository
8) git checkout branchName -> switch to another Branch
9) git checkout -b branchName -> create new branch and switched to that branch
10) git log --> shows the commit history
	- git log -2 --> shows two most recent commits
	- git log --author=rahul --> shows all commits made by rahul
	- git log --before=2021-02-25 --> shows all commits made before date
	- git log --after=2021-02-25 --> shows all commits made after date
	- git log --stat --> shows changes made in every file
	- git log --oneline --> Shows all commits in one line
11) git diff <branch 1 name> <branch 2 name> --> Shows difference between two branches file to file

### Connecting Github using SSH key from new Device
1) Generate SSH key
        ssh-keygen -t rsa -b 4096 -C "rahulsajekar93@gmail.com"
2) Create agent
        eval `ssh-agent -s`
3) Add SSH key to agent
        ssh-add ~/.ssh/id_rsa
4) Copy SSH key to Clipboard
        clip < ~/.ssh/id_rsa.pub
5) Add SSH key to GitHub Account
        GitHub Profile Settings -> SSH and GPG key -> new SSH key -> paste SSH key

### Connecting to Remote Repository
1) Add remote repository as a main
    git remote add origin <github repo url>
2) Push to remote repository
    git push -u origin main

### Creating and Pushing in New Branch
1) Create a New Branch
	git checkout -b newBranch
2) Pushing to new Branch
	git push -u origin newBranch


