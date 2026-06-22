# 🏋️ GYM Management System

> A comprehensive, full-featured gym management application built in Java. Designed to streamline gym operations, manage memberships, track workouts, and handle administrative tasks efficiently.

[![Java](https://img.shields.io/badge/Java-11+-ED8936?style=flat-square&logo=java)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-green.svg?style=flat-square)](LICENSE)
[![Status](https://img.shields.io/badge/Status-Active-brightgreen.svg?style=flat-square)](https://github.com/naimulislamsaikat/GYM-Management-System)

---

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Architecture](#architecture)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
- [Usage](#usage)
- [Key Components](#key-components)
- [Database Design](#database-design)
- [Best Practices](#best-practices)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)
- [License](#license)

---

## 📖 Overview

The **GYM Management System** is an enterprise-level Java application designed to automate and optimize gym operations. This system provides comprehensive solutions for managing gym members, memberships, trainers, classes, equipment, and billing operations through an intuitive user interface.

Built as a university capstone project, this application demonstrates advanced Java programming concepts including object-oriented design, database management, and GUI development.

---

## ✨ Features

### Member Management
- 👤 Create, update, and delete member profiles
- 📊 Track member subscription status and membership history
- 💳 Manage membership plans with flexible pricing options
- 📅 Monitor membership expiration dates and renewals

### Trainer Management
- 👨‍🏫 Maintain trainer profiles and qualifications
- 📋 Track trainer schedules and assigned classes
- ⭐ Monitor trainer performance and ratings

### Class & Schedule Management
- 📅 Schedule fitness classes with multiple time slots
- 📌 Manage class capacity and enrollment
- 🔄 Support for recurring classes and one-time sessions
- 👥 Track class attendance

### Billing & Payment
- 💰 Generate and manage invoices
- 💳 Track payment transactions
- 📈 Generate billing reports and revenue analytics
- ⚠️ Monitor outstanding payments

### Equipment Management
- 🏋️ Inventory tracking for gym equipment
- 🔧 Maintenance scheduling and history
- ⚡ Equipment availability status

### Administrative Features
- 👨‍💼 User authentication and role-based access control
- 📊 Comprehensive reporting and analytics
- 🔍 Search and filter functionality
- 📁 Data export capabilities

---

## 🏗️ Architecture

This application follows a **layered architecture pattern**:

```
┌─────────────────────────┐
│   Presentation Layer    │  (GUI/User Interface)
├─────────────────────────┤
│   Business Logic Layer  │  (Service/Management Classes)
├─────────────────────────┤
│   Data Access Layer     │  (DAO/Database Operations)
├─────────────────────────┤
│   Database Layer        │  (SQL Database)
└─────────────────────────┘
```

---

## 🛠️ Technologies Used

| Technology | Purpose | Version |
|-----------|---------|---------|
| **Java** | Core Language | 11+ |
| **Swing** | GUI Framework | Built-in |
| **JDBC** | Database Connectivity | Built-in |
| **SQL** | Database Language | Latest |
| **MySQL/SQLite** | Database | Latest |

---

## 📁 Project Structure

```
GYM-Management-System/
├── src/
│   ├── main/
│   │   ├── gui/                 # Swing GUI Components
│   │   │   ├── MainWindow.java
│   │   │   ├── MemberPanel.java
│   │   │   ├── TrainerPanel.java
│   │   │   └── ...
│   │   ├── service/             # Business Logic
│   │   │   ├── MemberService.java
│   │   │   ├── BillingService.java
│   │   │   ├── ClassService.java
│   │   │   └── ...
│   │   ├── dao/                 # Database Access Objects
│   │   │   ├── MemberDAO.java
│   │   │   ├── TrainerDAO.java
│   │   │   └── ...
│   │   ├── model/               # Data Models
│   │   │   ├── Member.java
│   │   │   ├── Trainer.java
│   │   │   ├── MembershipPlan.java
│   │   │   └── ...
│   │   ├── database/            # Database Configuration
│   │   │   └── DatabaseConnection.java
│   │   └── Main.java            # Application Entry Point
│   └── test/                    # Unit Tests (Optional)
├── resources/
│   └── config.properties        # Configuration Files
├── database/
│   └── schema.sql               # Database Schema
├── docs/
│   └── USER_GUIDE.md           # User Documentation
├── README.md                    # This File
└── LICENSE                      # License File
```

---

## 🚀 Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Version 11 or higher
- **Database**: MySQL 5.7+ or SQLite 3
- **IDE**: IntelliJ IDEA, Eclipse, or any Java IDE
- **Git**: For version control

### Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/naimulislamsaikat/GYM-Management-System.git
   cd GYM-Management-System
   ```

2. **Set Up Database**
   ```bash
   # For MySQL
   mysql -u root -p < database/schema.sql
   
   # Update database credentials in src/main/database/DatabaseConnection.java
   ```

3. **Build the Project**
   ```bash
   # Using IDE: Build > Build Project
   # Or using command line with Maven/Gradle (if configured)
   javac -d bin src/main/**/*.java
   ```

### Running the Application

```bash
# From the project root
java -cp bin:lib/* main.Main

# Or run directly from your IDE by selecting Main.java and clicking Run
```

---

## 💻 Usage

### Basic Workflow

1. **Launch Application**: Run the application using the steps above
2. **Login**: Enter your credentials (default: admin/admin for first-time setup)
3. **Navigate**: Use the menu to access different modules
4. **Manage Data**: Add, update, or view gym information
5. **Generate Reports**: Use the reporting feature to analyze data

### User Roles

| Role | Permissions |
|------|-------------|
| **Admin** | Full access to all features |
| **Manager** | Can manage members, classes, trainers |
| **Trainer** | Can view assigned classes and members |
| **Receptionist** | Can manage billing and member check-ins |

---

## 🔧 Key Components

### MemberService
Handles all member-related operations including registration, profile updates, and membership management.

### BillingService
Manages invoices, payments, and financial transactions with comprehensive reporting.

### ClassService
Orchestrates class scheduling, enrollment, and attendance tracking.

### DatabaseConnection
Singleton pattern implementation for managing database connections efficiently.

---

## 🗄️ Database Design

The system uses a relational database with the following core tables:

- **Members**: Stores member information and contact details
- **Trainers**: Maintains trainer profiles and credentials
- **MembershipPlans**: Defines available membership tiers and pricing
- **Classes**: Stores fitness class information
- **Enrollments**: Tracks member-to-class relationships
- **Billing**: Records transactions and payment history
- **Equipment**: Inventory and maintenance records

---

## ✅ Best Practices Implemented

✓ **Object-Oriented Design**: Proper encapsulation, inheritance, and polymorphism  
✓ **Separation of Concerns**: Clear division between UI, business logic, and data access  
✓ **Design Patterns**: DAO pattern, Singleton pattern, MVC principles  
✓ **Exception Handling**: Comprehensive error handling and user feedback  
✓ **Code Documentation**: Javadoc comments for public methods  
✓ **Database Transactions**: Atomic operations for data consistency  
✓ **Input Validation**: Data validation at multiple layers  
✓ **Security**: Password encryption and role-based access control  

---

## 🚀 Future Enhancements

- [ ] REST API integration for mobile app support
- [ ] Advanced analytics dashboard with charts and graphs
- [ ] Email notifications for membership renewals
- [ ] Attendance tracking via QR codes
- [ ] Integration with payment gateways
- [ ] Member mobile app
- [ ] Backup and restore functionality
- [ ] Multi-location gym support
- [ ] Advanced reporting with custom queries
- [ ] Performance optimization for large datasets

---

## 🤝 Contributing

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 📞 Support & Contact

For questions, issues, or suggestions, feel free to:
- Open an [Issue](https://github.com/naimulislamsaikat/GYM-Management-System/issues)
- Contact: [Your Contact Information]

---

## 📚 Additional Resources

- [Java Documentation](https://docs.oracle.com/javase/11/)
- [JDBC Tutorial](https://docs.oracle.com/javase/tutorial/jdbc/)
- [Swing GUI Documentation](https://docs.oracle.com/javase/tutorial/uiswing/)

---

<div align="center">

**[⬆ back to top](#-gym-management-system)**

Made with ❤️ by [Naimul Islam Saikat](https://github.com/naimulislamsaikat)

</div>
