package OOPs.src.Inheritance;

/**
 * quest3.java
 *
 * Solutions for all the given inheritance problems combined into a single file.
 * Demonstrates: single, multilevel, hierarchical, and hybrid inheritance,
 * along with best practices for inheritance in Java.
 *
 * Compile: javac -d . quest3.java
 * Run: java OOPs.src.Inheritance.quest3
 */
public class quest3 {

    /*
     * =========================================================
     * 1. Animal Hierarchy – Basic Inheritance & Polymorphism
     * =========================================================
     */
    static class Animal {
        protected String name;
        protected int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void makeSound() {
            System.out.println("Generic animal sound");
        }
    }

    static class Dog extends Animal {
        public Dog(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " barks: Woof!");
        }
    }

    static class Cat extends Animal {
        public Cat(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " meows: Meow!");
        }
    }

    static class Bird extends Animal {
        public Bird(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " chirps: Tweet!");
        }
    }

    /*
     * =========================================================
     * 2. Employee Management System
     * =========================================================
     */
    static class Employee {
        protected String name;
        protected int id;
        protected double salary;

        public Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        public void displayDetails() {
            System.out.println("Employee: " + name + " | ID: " + id + " | Salary: " + salary);
        }
    }

    static class Manager extends Employee {
        private int teamSize;

        public Manager(String name, int id, double salary, int teamSize) {
            super(name, id, salary);
            this.teamSize = teamSize;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Team Size: " + teamSize);
        }
    }

    static class Developer extends Employee {
        private String programmingLanguage;

        public Developer(String name, int id, double salary, String lang) {
            super(name, id, salary);
            this.programmingLanguage = lang;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Programming Language: " + programmingLanguage);
        }
    }

    static class Intern extends Employee {
        private String mentor;

        public Intern(String name, int id, double salary, String mentor) {
            super(name, id, salary);
            this.mentor = mentor;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Mentor: " + mentor);
        }
    }

    /*
     * =========================================================
     * 3. Vehicle and Transport System
     * =========================================================
     */
    static class Vehicle {
        protected int maxSpeed;
        protected String fuelType;

        public Vehicle(int maxSpeed, String fuelType) {
            this.maxSpeed = maxSpeed;
            this.fuelType = fuelType;
        }

        public void displayInfo() {
            System.out.println("Max Speed: " + maxSpeed + " | Fuel: " + fuelType);
        }
    }

    static class Car extends Vehicle {
        private int seatCapacity;

        public Car(int maxSpeed, String fuelType, int seatCapacity) {
            super(maxSpeed, fuelType);
            this.seatCapacity = seatCapacity;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Seat Capacity: " + seatCapacity);
        }
    }

    static class Truck extends Vehicle {
        private int loadCapacity;

        public Truck(int maxSpeed, String fuelType, int loadCapacity) {
            super(maxSpeed, fuelType);
            this.loadCapacity = loadCapacity;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Load Capacity: " + loadCapacity + " tons");
        }
    }

    static class Motorcycle extends Vehicle {
        private boolean hasSidecar;

        public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
            super(maxSpeed, fuelType);
            this.hasSidecar = hasSidecar;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Has Sidecar: " + hasSidecar);
        }
    }

    /*
     * =========================================================
     * Single Inheritance – Library & Smart Home
     * =========================================================
     */
    static class Book {
        protected String title;
        protected int publicationYear;

        public Book(String title, int year) {
            this.title = title;
            this.publicationYear = year;
        }

        public void displayInfo() {
            System.out.println("Book: " + title + " (" + publicationYear + ")");
        }
    }

    static class Author extends Book {
        private String name;
        private String bio;

        public Author(String title, int year, String name, String bio) {
            super(title, year);
            this.name = name;
            this.bio = bio;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Author: " + name + " | Bio: " + bio);
        }
    }

    static class Device {
        protected String deviceId;
        protected String status;

        public Device(String deviceId, String status) {
            this.deviceId = deviceId;
            this.status = status;
        }

        public void displayStatus() {
            System.out.println("Device " + deviceId + " is " + status);
        }
    }

    static class Thermostat extends Device {
        private int temperatureSetting;

        public Thermostat(String id, String status, int temp) {
            super(id, status);
            this.temperatureSetting = temp;
        }

        @Override
        public void displayStatus() {
            super.displayStatus();
            System.out.println("Temperature Setting: " + temperatureSetting + "°C");
        }
    }

    /*
     * =========================================================
     * Multilevel Inheritance – Orders & Courses
     * =========================================================
     */
    static class Order {
        protected String orderId;
        protected String orderDate;

        public Order(String id, String date) {
            this.orderId = id;
            this.orderDate = date;
        }

        public String getOrderStatus() {
            return "Order Placed";
        }
    }

    static class ShippedOrder extends Order {
        protected String trackingNumber;

        public ShippedOrder(String id, String date, String trackingNumber) {
            super(id, date);
            this.trackingNumber = trackingNumber;
        }

        @Override
        public String getOrderStatus() {
            return "Shipped";
        }
    }

    static class DeliveredOrder extends ShippedOrder {
        private String deliveryDate;

        public DeliveredOrder(String id, String date, String tracking, String deliveryDate) {
            super(id, date, tracking);
            this.deliveryDate = deliveryDate;
        }

        @Override
        public String getOrderStatus() {
            return "Delivered on " + deliveryDate;
        }
    }

    static class Course {
        protected String courseName;
        protected int duration;

        public Course(String name, int duration) {
            this.courseName = name;
            this.duration = duration;
        }
    }

    static class OnlineCourse extends Course {
        protected String platform;
        protected boolean isRecorded;

        public OnlineCourse(String name, int duration, String platform, boolean isRecorded) {
            super(name, duration);
            this.platform = platform;
            this.isRecorded = isRecorded;
        }
    }

    static class PaidOnlineCourse extends OnlineCourse {
        private double fee;
        private double discount;

        public PaidOnlineCourse(String name, int duration, String platform, boolean recorded,
                double fee, double discount) {
            super(name, duration, platform, recorded);
            this.fee = fee;
            this.discount = discount;
        }

        public double finalFee() {
            return fee - (fee * discount / 100);
        }
    }

    /*
     * =========================================================
     * Hierarchical Inheritance – Bank & School
     * =========================================================
     */
    static class BankAccount {
        protected String accountNumber;
        protected double balance;

        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void displayAccountType() {
            System.out.println("Generic Bank Account");
        }
    }

    static class SavingsAccount extends BankAccount {
        private double interestRate;

        public SavingsAccount(String acc, double bal, double rate) {
            super(acc, bal);
            this.interestRate = rate;
        }

        @Override
        public void displayAccountType() {
            System.out.println("Savings Account with interest: " + interestRate + "%");
        }
    }

    static class CheckingAccount extends BankAccount {
        private double withdrawalLimit;

        public CheckingAccount(String acc, double bal, double limit) {
            super(acc, bal);
            this.withdrawalLimit = limit;
        }

        @Override
        public void displayAccountType() {
            System.out.println("Checking Account with withdrawal limit: " + withdrawalLimit);
        }
    }

    static class FixedDepositAccount extends BankAccount {
        private int term;

        public FixedDepositAccount(String acc, double bal, int term) {
            super(acc, bal);
            this.term = term;
        }

        @Override
        public void displayAccountType() {
            System.out.println("Fixed Deposit Account for " + term + " years");
        }
    }

    static class Person {
        protected String name;
        protected int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Teacher extends Person {
        private String subject;

        public Teacher(String name, int age, String subject) {
            super(name, age);
            this.subject = subject;
        }

        public void displayRole() {
            System.out.println(name + " teaches " + subject);
        }
    }

    static class Student extends Person {
        private int grade;

        public Student(String name, int age, int grade) {
            super(name, age);
            this.grade = grade;
        }

        public void displayRole() {
            System.out.println(name + " is a grade " + grade + " student");
        }
    }

    static class Staff extends Person {
        private String department;

        public Staff(String name, int age, String department) {
            super(name, age);
            this.department = department;
        }

        public void displayRole() {
            System.out.println(name + " works in " + department + " department");
        }
    }

    /*
     * =========================================================
     * Hybrid Inheritance via Interfaces – Restaurant & Vehicle
     * =========================================================
     */
    interface Worker {
        void performDuties();
    }

    static class Chef extends Person implements Worker {
        public Chef(String name, int age) {
            super(name, age);
        }

        @Override
        public void performDuties() {
            System.out.println(name + " cooks delicious meals.");
        }
    }

    static class Waiter extends Person implements Worker {
        public Waiter(String name, int age) {
            super(name, age);
        }

        @Override
        public void performDuties() {
            System.out.println(name + " serves customers efficiently.");
        }
    }

    interface Refuelable {
        void refuel();
    }

    static class BaseVehicle {
        protected int maxSpeed;
        protected String model;

        public BaseVehicle(int maxSpeed, String model) {
            this.maxSpeed = maxSpeed;
            this.model = model;
        }
    }

    static class ElectricVehicle extends BaseVehicle {
        public ElectricVehicle(int maxSpeed, String model) {
            super(maxSpeed, model);
        }

        public void charge() {
            System.out.println(model + " is charging.");
        }
    }

    static class PetrolVehicle extends BaseVehicle implements Refuelable {
        public PetrolVehicle(int maxSpeed, String model) {
            super(maxSpeed, model);
        }

        @Override
        public void refuel() {
            System.out.println(model + " is refueling with petrol.");
        }
    }

    /*
     * =========================================================
     * Main Demonstration
     * =========================================================
     */
    public static void main(String[] args) {
        System.out.println("=== Animal Hierarchy ===");
        Animal[] animals = {
                new Dog("Buddy", 3),
                new Cat("Whiskers", 2),
                new Bird("Tweety", 1)
        };
        for (Animal a : animals)
            a.makeSound();

        System.out.println("\n=== Employee Management ===");
        Employee[] staff = {
                new Manager("Alice", 101, 90000, 10),
                new Developer("Bob", 102, 70000, "Java"),
                new Intern("Charlie", 103, 20000, "Alice")
        };
        for (Employee e : staff)
            e.displayDetails();

        System.out.println("\n=== Vehicle System ===");
        Vehicle[] fleet = {
                new Car(180, "Petrol", 5),
                new Truck(120, "Diesel", 10),
                new Motorcycle(150, "Petrol", false)
        };
        for (Vehicle v : fleet)
            v.displayInfo();

        System.out.println("\n=== Single Inheritance ===");
        Author a1 = new Author("Effective Java", 2018, "Joshua Bloch", "Expert Java Developer");
        a1.displayInfo();
        Thermostat t1 = new Thermostat("TH001", "On", 24);
        t1.displayStatus();

        System.out.println("\n=== Multilevel Inheritance ===");
        DeliveredOrder dOrder = new DeliveredOrder("O123", "2025-09-01", "TRK987", "2025-09-05");
        System.out.println("Order Status: " + dOrder.getOrderStatus());
        PaidOnlineCourse poc = new PaidOnlineCourse("AI Basics", 40, "Udemy", true, 1000, 20);
        System.out.println("Course: " + poc.courseName + " Final Fee: " + poc.finalFee());

        System.out.println("\n=== Hierarchical Inheritance ===");
        BankAccount[] accounts = {
                new SavingsAccount("SAV001", 5000, 4.5),
                new CheckingAccount("CHK001", 3000, 1000),
                new FixedDepositAccount("FD001", 10000, 5)
        };
        for (BankAccount acc : accounts)
            acc.displayAccountType();
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        Student stu = new Student("Lily", 15, 10);
        Staff staffMember = new Staff("John", 35, "Administration");
        teacher.displayRole();
        stu.displayRole();
        staffMember.displayRole();

        System.out.println("\n=== Hybrid Inheritance ===");
        Worker chef = new Chef("Gordon", 55);
        Worker waiter = new Waiter("Emily", 28);
        chef.performDuties();
        waiter.performDuties();
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda Civic");
        ev.charge();
        pv.refuel();
    }
}
