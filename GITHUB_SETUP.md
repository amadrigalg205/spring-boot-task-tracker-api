# How to Add This Project to GitHub

## Step 1: Initialize Git Repository
```bash
git init
```

## Step 2: Add All Files
```bash
git add .
```

## Step 3: Create Initial Commit
```bash
git commit -m "Initial commit: Spring Boot Task Tracker API"
```

## Step 4: Create a New Repository on GitHub
1. Go to https://github.com
2. Click the "+" icon in the top right corner
3. Select "New repository"
4. Name it (e.g., "tasktracker" or "spring-boot-task-tracker")
5. **Do NOT** initialize with README, .gitignore, or license (we already have these)
6. Click "Create repository"

## Step 5: Add GitHub Remote and Push
After creating the repository, GitHub will show you commands. Use these:

```bash
# Add the remote repository (replace YOUR_USERNAME and REPO_NAME)
git remote add origin https://github.com/YOUR_USERNAME/REPO_NAME.git

# Rename branch to main (if needed)
git branch -M main

# Push to GitHub
git push -u origin main
```

## Alternative: Using SSH
If you have SSH keys set up with GitHub:
```bash
git remote add origin git@github.com:YOUR_USERNAME/REPO_NAME.git
git branch -M main
git push -u origin main
```

## That's it!
Your project is now on GitHub. You can view it at:
`https://github.com/YOUR_USERNAME/REPO_NAME`


