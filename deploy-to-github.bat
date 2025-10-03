@echo off
REM Script to deploy the organized project structure to GitHub
REM This script helps organize and push the Module 5 project to the Module-6_Project_6 repository

echo ========================================
echo Deploying to GitHub Repository
echo ========================================
echo.

echo Step 1: Initializing Git repository (if not already done)
git init
echo.

echo Step 2: Adding all files to Git
git add .
echo.

echo Step 3: Committing changes
git commit -m "Organize Module 5 Project into separate folder structure

- Created Module-5-Project folder for better organization
- Moved all Module 5 files into dedicated folder
- Added comprehensive README for Module 5 project
- Updated root README to explain project structure
- Maintained all testing, documentation, and build files"
echo.

echo Step 4: Adding remote repository
git remote add origin https://github.com/larrycameron/Module-6_Project_6.git
echo.

echo Step 5: Pushing to GitHub
git branch -M main
git push -u origin main
echo.

echo ========================================
echo Deployment Complete!
echo ========================================
echo.
echo Your project is now organized as follows:
echo - Module-5-Project/ contains all Module 5 files
echo - Root README.md explains the overall structure
echo - Each project has its own dedicated documentation
echo.
echo Visit: https://github.com/larrycameron/Module-6_Project_6
echo.
pause
