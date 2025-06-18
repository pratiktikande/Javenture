
# 🚀 GitHub Commands Cheat Sheet

A complete list of GitHub and Git commands from **Basic** to **Advanced** 

---

## 🧰 Basic Git Commands

| Command | Description |
|--------|-------------|
| `git init` | 🆕 Initialize a new Git repository |
| `git clone <repo-url>` | 📥 Clone a repository into a new directory |
| `git status` | 📋 Show the working tree status |
| `git add <file>` | ➕ Add file contents to the index |
| `git commit -m "message"` | 💬 Record changes to the repository |
| `git config --global user.name "Name"` | 🧑 Set the global username |
| `git config --global user.email "email@example.com"` | 📧 Set the global email |

---

## 🔁 Branching & Merging

| Command | Description |
|--------|-------------|
| `git branch` | 🌿 List branches |
| `git branch <name>` | 🌱 Create a new branch |
| `git checkout <branch>` | 🔀 Switch branches |
| `git checkout -b <name>` | 🚀 Create and switch to a new branch |
| `git merge <branch>` | 🔗 Merge a branch into the current one |
| `git branch -d <branch>` | 🗑️ Delete a branch |

---

## 🌐 Remote Repositories

| Command | Description |
|--------|-------------|
| `git remote add origin <url>` | 🔗 Add a remote repository |
| `git remote -v` | 👀 View remote URLs |
| `git push origin <branch>` | 🚀 Push a branch to remote |
| `git push -u origin <branch>` | 📤 Push and set upstream |
| `git pull` | 📥 Fetch and merge from origin |
| `git fetch` | 📡 Download objects and refs |

---

## 🕵️‍♂️ Inspection & Comparison

| Command | Description |
|--------|-------------|
| `git log` | 🕰️ View commit history |
| `git diff` | 🔍 Show changes between commits |
| `git show <commit>` | 👁️ See specific commit |
| `git blame <file>` | 🤔 Who changed what and when |

---

## 🛠️ Advanced Git Commands

| Command | Description |
|--------|-------------|
| `git stash` | 📦 Stash changes in a dirty working directory |
| `git stash pop` | 🎯 Apply stashed changes |
| `git rebase <branch>` | 🔁 Reapply commits on top of another base |
| `git cherry-pick <commit>` | 🍒 Apply the changes from a specific commit |
| `git revert <commit>` | ↩️ Revert a commit |
| `git reset --hard <commit>` | 💣 Reset history and working directory |
| `git clean -fd` | 🧹 Remove untracked files and directories |

---

## 🔐 GitHub Authentication

- Use a **Personal Access Token (PAT)** instead of password for HTTPS
- Create token: ⚙️ GitHub Settings → Developer Settings → Tokens

```bash
git remote set-url origin https://<token>@github.com/username/repo.git
```

---

## 📦 GitHub CLI (`gh`)

| Command | Description |
|--------|-------------|
| `gh auth login` | 🔐 Authenticate GitHub CLI |
| `gh repo clone owner/repo` | 📥 Clone using GitHub CLI |
| `gh issue list` | 📝 List issues |
| `gh pr create` | 🔀 Create pull request |
| `gh repo view` | 👁️ View repo details |

---

