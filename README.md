# RecipeApp-Improved

![Image 21 06 2025 г , 14_20_09](https://github.com/user-attachments/assets/1caeda1d-a496-4a17-aef2-2759100de76d)

A **Java console application** that helps you manage recipes stored in an **SQLite database**. The app demonstrates clean architecture (model, repository, service) and basic database integration.

---

## 📌 Features

✅ Add a new recipe (title, ingredients, instructions, category)  
✅ List all recipes  
✅ Uses **SQLite** for data persistence  
✅ Clean, layered structure (easy to extend)  
✅ Simple command-line interface  

---

## 🗂 Project Structure
```
RecipeApp-Improved/
 ├── src/
 │     ├── Main.java               // Entry point
 │     ├── Recipe.java             // Model class
 │     ├── RecipeRepository.java   // Database logic
 │     └── DatabaseManager.java    // DB connection and init
 ├── recipes.db (generated at runtime)
 └── README.md                     // This file
```

---

## 🚀 How to build and run

### 1️⃣ Download dependencies
Make sure you have **sqlite-jdbc.jar** in your classpath. You can download it from [https://bitbucket.org/xerial/sqlite-jdbc/downloads/](https://bitbucket.org/xerial/sqlite-jdbc/downloads/)

### 2️⃣ Compile
```bash
javac -cp .:sqlite-jdbc.jar src/*.java
```
(Windows users: replace `:` with `;`)

### 3️⃣ Run
```bash
java -cp .:sqlite-jdbc.jar src/Main
```

### Example usage
```
Add new recipe (title, ingredients, instructions, category):
Spaghetti Bolognese
Pasta, minced meat, tomato sauce
Boil pasta, cook meat, mix together
Main Course

All recipes:
Spaghetti Bolognese - Main Course
```

---

## 💡 Future Improvements
- Swing GUI client
- Export recipes to CSV
- Search by ingredient or keyword
- Unit tests
- REST API version

---

## 📌 Author
Antonia Ivanova  
[GitHub](https://github.com/antoniq3298)  
[LinkedIn](https://www.linkedin.com/in/antonia-ivanova)

---

## ⚠ Notes
- The database file `recipes.db` will be created automatically in the working directory.
- Tested with Java 17.
- Make sure SQLite JDBC driver is available at runtime.

---

## 🌟 How to upload to GitHub
1️⃣ Create a repository `RecipeApp-Improved` on GitHub.  
2️⃣ Initialize git locally:
```bash
git init
git add .
git commit -m "Initial commit: RecipeApp Improved version with SQLite"
git branch -M main
git remote add origin https://github.com/antoniq3298/RecipeApp-Improved.git
git push -u origin main
```
