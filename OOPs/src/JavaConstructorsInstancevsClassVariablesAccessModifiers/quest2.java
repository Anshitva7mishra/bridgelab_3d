package OOPs.src.JavaConstructorsInstancevsClassVariablesAccessModifiers;

public class quest2 {

    /* ========== 1. CONSTRUCTORS ========== */

    // 1. Book with default & parameterized constructors
    static class Book {
        private String title;
        private String author;
        private double price;

        public Book() {
            this("Unknown", "Unknown", 0.0);
        }

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public void display() {
            System.out.println("Book: " + title + " by " + author + " Price: " + price);
        }
    }

    // 2. Circle with constructor chaining
    static class Circle {
        private double radius;

        public Circle() {
            this(1.0);
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }
    }

    // 3. Person with copy constructor
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person(Person p) {
            this(p.name, p.age);
        }

        public void show() {
            System.out.println(name + " (" + age + ")");
        }
    }

    // 4. Hotel Booking with default, parameterized, copy
    static class HotelBooking {
        private String guestName;
        private String roomType;
        private int nights;

        public HotelBooking() {
            this("Guest", "Standard", 1);
        }

        public HotelBooking(String guestName, String roomType, int nights) {
            this.guestName = guestName;
            this.roomType = roomType;
            this.nights = nights;
        }

        public HotelBooking(HotelBooking other) {
            this(other.guestName, other.roomType, other.nights);
        }

        public void details() {
            System.out.println(guestName + " booked " + roomType + " for " + nights + " nights.");
        }
    }

    // 5. Library Book System borrow method
    static class LibraryBook {
        private String title;
        private String author;
        private double price;
        private boolean available = true;

        public LibraryBook(String t, String a, double p) {
            title = t;
            author = a;
            price = p;
        }

        public void borrow() {
            if (available) {
                available = false;
                System.out.println(title + " borrowed.");
            } else
                System.out.println(title + " is not available.");
        }
    }

    // 6. Car Rental with cost calc
    static class CarRental {
        private String customerName;
        private String carModel;
        private int rentalDays;
        private static final double RATE = 50.0;

        public CarRental(String name, String model, int days) {
            customerName = name;
            carModel = model;
            rentalDays = days;
        }

        public double totalCost() {
            return rentalDays * RATE;
        }
    }

    /* ========== 2. INSTANCE vs CLASS VARIABLES ========== */

    // Product Inventory
    static class Product {
        private String productName;
        private double price;
        private static int totalProducts = 0;

        public Product(String productName, double price) {
            this.productName = productName;
            this.price = price;
            totalProducts++;
        }

        public void displayProductDetails() {
            System.out.println(productName + " $" + price);
        }

        public static void displayTotalProducts() {
            System.out.println("Total products: " + totalProducts);
        }
    }

    // Online Course Management
    static class Course {
        private String courseName;
        private int duration;
        private double fee;
        private static String instituteName = "Default Institute";

        public Course(String name, int duration, double fee) {
            this.courseName = name;
            this.duration = duration;
            this.fee = fee;
        }

        public void displayCourseDetails() {
            System.out.println(courseName + " | " + duration + " hrs | Fee: " + fee +
                    " | Institute: " + instituteName);
        }

        public static void updateInstituteName(String name) {
            instituteName = name;
        }
    }

    // Vehicle Registration
    static class Vehicle {
        private String ownerName;
        private String vehicleType;
        private static double registrationFee = 500.0;

        public Vehicle(String owner, String type) {
            ownerName = owner;
            vehicleType = type;
        }

        public void displayVehicleDetails() {
            System.out.println(ownerName + " owns a " + vehicleType +
                    " | Fee: " + registrationFee);
        }

        public static void updateRegistrationFee(double fee) {
            registrationFee = fee;
        }
    }

    /* ========== 3. ACCESS MODIFIERS ========== */

    // University Management
    static class Student {
        public int rollNumber;
        protected String name;
        private double cgpa;

        public Student(int r, String n, double c) {
            rollNumber = r;
            name = n;
            cgpa = c;
        }

        public double getCgpa() {
            return cgpa;
        }

        public void setCgpa(double c) {
            cgpa = c;
        }
    }

    static class PostgraduateStudent extends Student {
        public PostgraduateStudent(int r, String n, double c) {
            super(r, n, c);
        }

        public void show() {
            System.out.println("PG Name: " + name);
        } // protected access
    }

    // Book Library System
    static class LibraryBook2 {
        public String ISBN;
        protected String title;
        private String author;

        public LibraryBook2(String i, String t, String a) {
            ISBN = i;
            title = t;
            author = a;
        }

        public void setAuthor(String a) {
            author = a;
        }

        public String getAuthor() {
            return author;
        }
    }

    static class EBook extends LibraryBook2 {
        public EBook(String i, String t, String a) {
            super(i, t, a);
        }

        public void display() {
            System.out.println("ISBN:" + ISBN + " Title:" + title);
        }
    }

    // Bank Account Management
    static class BankAccount {
        public String accountNumber;
        protected String accountHolder;
        private double balance;

        public BankAccount(String no, String holder, double bal) {
            accountNumber = no;
            accountHolder = holder;
            balance = bal;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double b) {
            balance = b;
        }
    }

    static class SavingsAccount extends BankAccount {
        public SavingsAccount(String no, String holder, double bal) {
            super(no, holder, bal);
        }

        public void info() {
            System.out.println("Acc#: " + accountNumber + " Holder: " + accountHolder);
        }
    }

    // Employee Records
    static class Employee {
        public int employeeID;
        protected String department;
        private double salary;

        public Employee(int id, String dept, double sal) {
            employeeID = id;
            department = dept;
            salary = sal;
        }

        public void setSalary(double s) {
            salary = s;
        }

        public double getSalary() {
            return salary;
        }
    }

    static class Manager extends Employee {
        public Manager(int id, String dept, double sal) {
            super(id, dept, sal);
        }

        public void show() {
            System.out.println("Manager ID:" + employeeID + " Dept:" + department);
        }
    }

    /* ========== MAIN DEMO ========== */
    public static void main(String[] args) {
        // Quick demonstration of some classes
        Book b = new Book("Java", "Author A", 499);
        b.display();

        Circle c = new Circle(5);
        System.out.println("Circle area: " + c.area());

        Product p1 = new Product("Laptop", 80000);
        Product p2 = new Product("Phone", 50000);
        Product.displayTotalProducts();

        Course.updateInstituteName("Tech Academy");
        Course course = new Course("Java OOP", 40, 250);
        course.displayCourseDetails();

        PostgraduateStudent pg = new PostgraduateStudent(101, "Alice", 9.1);
        pg.show();

        Manager m = new Manager(1, "IT", 90000);
        m.show();
    }
}
