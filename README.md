# E_Book Servlet Project  

A **Java Servlet and JSP web application** for managing e-books. Users can register, login, add new books, view recent books, and manage book information. This project uses **Servlets, JSP, MySQL**, and is deployable on **Apache Tomcat**.  

---

## Table of Contents

1. [Features](#features)  
2. [Technologies Used](#technologies-used)  
3. [Project Structure](#project-structure)  
4. [Setup & Installation](#setup--installation)  
5. [Database Configuration](#database-configuration)  
6. [Running the Project](#running-the-project)  
7. [Usage](#usage)  
8. [Contributing](#contributing)  
9. [License](#license)  

---

## Features

- User **Registration** and **Login** system  
- Add **new books** with category and status (New / Old)  
- View **recently added books**  
- Update and delete book information  
- Clean and responsive **UI using HTML/CSS**  
- Uses **JDBC** to connect with MySQL database  

---

## Technologies Used

- **Java 17+**  
- **Jakarta Servlet API**  
- **JSP (JavaServer Pages)**  
- **HTML5 / CSS3**  
- **MySQL**  
- **Apache Tomcat 10+**  
- **Eclipse IDE**  
- **Maven** (optional for building WAR files)  

---

## Project Structure

E_Book/
├── src/
│ ├── com.servlet # Servlets for handling requests
│ ├── com.dao # Database access objects
│ └── com.entity # Java entity classes
├── WebContent/
│ ├── index.jsp
│ ├── register.jsp
│ ├── login.jsp
│ ├── addBook.jsp
│ ├── viewBooks.jsp
│ └── css/, images/
├── .gitignore
├── pom.xml # If using Maven
└── README.md



---

## Setup & Installation

### 1. Clone the Repository
```bash
git clone https://github.com/Dhanan20jeyan122003/E_Book.git
Open in Eclipse IDE as a Dynamic Web Project.

Configure MySQL database:

Create database ebook-app

Update DBconnect.java with your username & password

Deploy on Apache Tomcat:

Run project on server from Eclipse

Or export as WAR and place in tomcat/webapps/

Access the project in browser:

http://localhost:8080/E_Book

Usage

Register a new user

Login to add/view books

Manage book details easily via web interface

Contributing

Feel free to fork the project and submit pull requests.

License

This project is open source and available under the MIT License.

---

If you want, I can also **make a shorter, GitHub-ready version with badges and project screenshot placeholders** to look more professional. Do you want me to do that?
## Contact

**Developer**: Dhananjeyan M  
**GitHub**: [https://github.com/Dhanan20jeyan122003](https://github.com/Dhanan20jeyan122003)  
**LinkedIn**: [https://www.linkedin.com/in/dhananjeyan-m](https://www.linkedin.com/in/dhananjeyan-m)  
**Email**: dhananjeyan@example.com  

Feel free to reach out for questions, feedback, or collaboration!
