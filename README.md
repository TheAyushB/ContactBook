# 📇 Java Contact Book (Command-Line App)

A simple command-line Contact Book written in Java to showcase OOP concepts like encapsulation, abstraction, and modularity.

---

## 🛠 Features

- ✅ Add new contacts
- ✅ View all contacts (sorted alphabetically)
- ✅ Search contact by name
- ✅ Update contact (name, phone, email)
- ✅ Delete contact by name
- ✅ Export contacts to `contacts.txt`
- ✅ Handles invalid user input gracefully (e.g., entering strings for menu options)

---

## 🔍 OOP Concepts Used

- **Encapsulation** – Private fields and public getters/setters in `Contact.java`
- **Abstraction** – Logical separation of responsibilities into methods
- **Modularity** – Clean separation of classes and methods
- **Collections** – Used `ArrayList` and `Iterator` for managing contacts
- **Stream API** – Used to perform checks like duplicate names

---

## 📂 Project Structure

```tree
ContactBook/
├── src/
│ ├── Contact.java // Contact model class
│ └── ContactBook.java // Main app logic
├── contacts.txt // (Generated after exporting)