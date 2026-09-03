# Lab 03: Git and GitHub

This repository documents my practice with
local Git, GitHub, branches, and pull requests.

## README Responses

### 1.1 After initialization

(base) ➜ lab03-exercises git:(main) ls -la
total 0
drwxr-xr-x 3 ahyoungyoo staff 96 Sep 3 10:36 .
drwxr-xr-x 8 ahyoungyoo staff 256 Sep 3 10:36 ..
drwxr-xr-x 9 ahyoungyoo staff 288 Sep 3 10:36 .git

### 1.2 First git status

(base) ➜ lab03-exercises git:(main) ✗ git status
On branch main

No commits yet

Untracked files:
(use "git add <file>..." to include in what will be committed)
README.md

nothing added to commit but untracked files present (use "git add" to track)

### 1.3 After the first commit

(base) ➜ lab03-exercises git:(main) git status
On branch main
nothing to commit, working tree clean

### 1.4 git log

(base) ➜ lab03-exercises git:(main) git status
git log --oneline

5149c5f (HEAD -> main) Create lab README

### 1.5 git diff

Paste the `git status` and `git diff` commands and their output.

(base) ➜ lab03-exercises git:(main) ✗ git status
On branch main
Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git restore <file>..." to discard changes in working directory)
modified: README.md

no changes added to commit (use "git add" and/or "git commit -a")

diff --git a/README.md b/README.md
index 500eb23..627930b 100644
--- a/README.md
+++ b/README.md
@@ -1,5 +1,8 @@

# Lab 03: Git and GitHub

+This repository documents my practice with
+local Git, GitHub, branches, and pull requests.

- ## README Responses

How does this `git status` differ from the one in **1.2**?
Before, It only showed untracked files because there was no change. But in #1.5, it noticed that there was change, and i didn't do commit

### 1.6 Git command reflections

In one or two sentences each, what does each command do?

- `git init`: it is used for setting. It does basic setting to use git
- `git status`: It shows our status (ex. files untracked, commits)
- `git add`: It add file to track.
- `git commit`: It captures moment.
- `git log`: It shows commit logs.
- `git diff`: It shows differences in local file.

### 1.7 Repository link

### 1.8 Comparing approaches

In your own words:

- How does the nested-loop approach check for a duplicate?
- How does the set-based approach check for a duplicate?
- What is the runtime and memory trade-off of each?

### 1.9 Pull request merge options

In your own words, what does each GitHub merge option do?

- Create a merge commit
- Squash and merge
- Rebase and merge
