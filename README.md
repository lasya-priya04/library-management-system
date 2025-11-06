                                                                          Library Management System
📝 Overview

The Library Management System is a full-stack Java web application built using Spring Boot.
It helps manage books, users, and transactions efficiently in a digital library setup.
Users can register, log in, browse available books, issue and return them, and administrators can manage the inventory.

🧩 Project Structure

bookstore-main/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── <your_package_name>/
│   │   │       ├── controllers/       # Handles web requests
│   │   │       ├── models/            # Entity classes for database tables
│   │   │       ├── repositories/      # Spring Data JPA interfaces
│   │   │       └── services/          # Business logic and service layer
│   │   │
│   │   ├── resources/
│   │   │   ├── static/                # Static files (CSS, JS, images)
│   │   │   │   └── images/            # Bookstore and UI images
│   │   │   ├── templates/             # Thymeleaf HTML templates
│   │   │   │   ├── aboutus.html
│   │   │   │   ├── bookList.html
│   │   │   │   ├── bookRegister.html
│   │   │   │   ├── home.html
│   │   │   │   ├── login.html
│   │   │   │   ├── myBooks.html
│   │   │   │   ├── register.html
│   │   │   │   └── settings.html
│   │   │   └── application.properties # Configuration (DB, server port, etc.)
│   │
│   └── test/                          # Unit and integration tests
│
├── target/                            # Compiled output (auto-generated)
├── .gitignore                         # Ignored files for Git
├── .gitattributes                     # Git attributes
├── pom.xml                            # Maven dependencies and build config
└── README.md                          # Project documentation

⚙️ Technologies Used

Backend: Spring Boot (Java)
Frontend: HTML, CSS
Database: MySQL
Build Tool: Maven
Version Control: Git & GitHub
IDE: Visual Studio Code

🚀 Features

👩‍🏫 For Users:
Register and log in securely
Browse available books
Borrow and return books
View personal issued book list

🧑‍💼 For Admins:
Add, update, and remove books
View registered users
Manage issued books and records

🧑‍💻 Contributor
Burugula Lasya Priya
Backend Developer

💬 Contact
For any queries or collaborations:
📧 2200030016cseh@gmail.com
🔗 https://www.linkedin.com/in/lasya-priya-burugula/
