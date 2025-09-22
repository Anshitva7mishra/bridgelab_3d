package OOPs.src.EncapsulationPolymorphismInterfaceandAbstractClass;


public class question {

    /*
     * =========================================================
     * 1. Employee Management System
     * =========================================================
     */
    interface Department {
        void assignDepartment(String dept);

        String getDepartmentDetails();
    }

    static abstract class Employee {
        private String employeeId;
        private String name;
        private double baseSalary;

        public Employee(String employeeId, String name, double baseSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.baseSalary = baseSalary;
        }

        public String getEmployeeId() {
            return employeeId;
        }

        public String getName() {
            return name;
        }

        public double getBaseSalary() {
            return baseSalary;
        }

        public void setBaseSalary(double salary) {
            if (salary >= 0)
                this.baseSalary = salary;
        }

        public abstract double calculateSalary();

        public void displayDetails() {
            System.out.println("Employee ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
        }
    }

    static class FullTimeEmployee extends Employee implements Department {
        private String department;

        public FullTimeEmployee(String id, String name, double salary) {
            super(id, name, salary);
        }

        @Override
        public double calculateSalary() {
            return getBaseSalary();
        }

        @Override
        public void assignDepartment(String dept) {
            this.department = dept;
        }

        @Override
        public String getDepartmentDetails() {
            return department;
        }
    }

    static class PartTimeEmployee extends Employee implements Department {
        private int hoursWorked;
        private double hourlyRate;
        private String department;

        public PartTimeEmployee(String id, String name, double hourlyRate, int hoursWorked) {
            super(id, name, hourlyRate * hoursWorked);
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

        @Override
        public double calculateSalary() {
            return hourlyRate * hoursWorked;
        }

        @Override
        public void assignDepartment(String dept) {
            this.department = dept;
        }

        @Override
        public String getDepartmentDetails() {
            return department;
        }
    }

    /*
     * =========================================================
     * 2. E-Commerce Platform
     * =========================================================
     */
    interface Taxable {
        double calculateTax();

        String getTaxDetails();
    }

    static abstract class Product {
        private String productId;
        private String name;
        private double price;

        public Product(String productId, String name, double price) {
            this.productId = productId;
            this.name = name;
            this.price = price;
        }

        public String getProductId() {
            return productId;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            if (price >= 0)
                this.price = price;
        }

        public abstract double calculateDiscount();
    }

    static class Electronics extends Product implements Taxable {
        public Electronics(String id, String name, double price) {
            super(id, name, price);
        }

        @Override
        public double calculateDiscount() {
            return getPrice() * 0.10;
        }

        @Override
        public double calculateTax() {
            return getPrice() * 0.18;
        }

        @Override
        public String getTaxDetails() {
            return "18% GST";
        }
    }

    static class Clothing extends Product implements Taxable {
        public Clothing(String id, String name, double price) {
            super(id, name, price);
        }

        @Override
        public double calculateDiscount() {
            return getPrice() * 0.20;
        }

        @Override
        public double calculateTax() {
            return getPrice() * 0.05;
        }

        @Override
        public String getTaxDetails() {
            return "5% GST";
        }
    }

    static class Groceries extends Product {
        public Groceries(String id, String name, double price) {
            super(id, name, price);
        }

        @Override
        public double calculateDiscount() {
            return getPrice() * 0.05;
        }
    }

    /*
     * =========================================================
     * 3. Vehicle Rental System
     * =========================================================
     */
    interface Insurable {
        double calculateInsurance();

        String getInsuranceDetails();
    }

    static abstract class Vehicle {
        private String vehicleNumber;
        private String type;
        private double rentalRate;

        public Vehicle(String number, String type, double rate) {
            this.vehicleNumber = number;
            this.type = type;
            this.rentalRate = rate;
        }

        public String getVehicleNumber() {
            return vehicleNumber;
        }

        public String getType() {
            return type;
        }

        public double getRentalRate() {
            return rentalRate;
        }

        public abstract double calculateRentalCost(int days);
    }

    static class Car extends Vehicle implements Insurable {
        public Car(String num, double rate) {
            super(num, "Car", rate);
        }

        @Override
        public double calculateRentalCost(int days) {
            return days * getRentalRate();
        }

        @Override
        public double calculateInsurance() {
            return 500;
        }

        @Override
        public String getInsuranceDetails() {
            return "Standard Car Insurance";
        }
    }

    static class Bike extends Vehicle implements Insurable {
        public Bike(String num, double rate) {
            super(num, "Bike", rate);
        }

        @Override
        public double calculateRentalCost(int days) {
            return days * getRentalRate();
        }

        @Override
        public double calculateInsurance() {
            return 200;
        }

        @Override
        public String getInsuranceDetails() {
            return "Bike Insurance";
        }
    }

    static class Truck extends Vehicle implements Insurable {
        public Truck(String num, double rate) {
            super(num, "Truck", rate);
        }

        @Override
        public double calculateRentalCost(int days) {
            return days * getRentalRate() + 300;
        }

        @Override
        public double calculateInsurance() {
            return 1000;
        }

        @Override
        public String getInsuranceDetails() {
            return "Truck Insurance";
        }
    }

    /*
     * =========================================================
     * 4. Banking System
     * =========================================================
     */
    interface Loanable {
        void applyForLoan(double amount);

        boolean calculateLoanEligibility();
    }

    static abstract class BankAccount {
        private String accountNumber;
        private String holderName;
        private double balance;

        public BankAccount(String acc, String name, double balance) {
            this.accountNumber = acc;
            this.holderName = name;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public String getHolderName() {
            return holderName;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0)
                balance += amount;
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance)
                balance -= amount;
        }

        public abstract double calculateInterest();
    }

    static class SavingsAccount extends BankAccount implements Loanable {
        public SavingsAccount(String acc, String name, double balance) {
            super(acc, name, balance);
        }

        @Override
        public double calculateInterest() {
            return getBalance() * 0.04;
        }

        @Override
        public void applyForLoan(double amount) {
            System.out.println("Savings loan applied: " + amount);
        }

        @Override
        public boolean calculateLoanEligibility() {
            return getBalance() > 2000;
        }
    }

    static class CurrentAccount extends BankAccount implements Loanable {
        public CurrentAccount(String acc, String name, double balance) {
            super(acc, name, balance);
        }

        @Override
        public double calculateInterest() {
            return getBalance() * 0.01;
        }

        @Override
        public void applyForLoan(double amount) {
            System.out.println("Current loan applied: " + amount);
        }

        @Override
        public boolean calculateLoanEligibility() {
            return getBalance() > 5000;
        }
    }

    /*
     * =========================================================
     * 5. Library Management System
     * =========================================================
     */
    interface Reservable {
        void reserveItem();

        boolean checkAvailability();
    }

    static abstract class LibraryItem {
        private String itemId;
        private String title;
        private String author;

        public LibraryItem(String id, String title, String author) {
            this.itemId = id;
            this.title = title;
            this.author = author;
        }

        public String getItemId() {
            return itemId;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public void getItemDetails() {
            System.out.println("Item: " + title + " by " + author + " (ID: " + itemId + ")");
        }

        public abstract int getLoanDuration();
    }

    static class Book extends LibraryItem implements Reservable {
        public Book(String id, String title, String author) {
            super(id, title, author);
        }

        @Override
        public int getLoanDuration() {
            return 14;
        }

        @Override
        public void reserveItem() {
            System.out.println("Book reserved.");
        }

        @Override
        public boolean checkAvailability() {
            return true;
        }
    }

    static class Magazine extends LibraryItem implements Reservable {
        public Magazine(String id, String title, String author) {
            super(id, title, author);
        }

        @Override
        public int getLoanDuration() {
            return 7;
        }

        @Override
        public void reserveItem() {
            System.out.println("Magazine reserved.");
        }

        @Override
        public boolean checkAvailability() {
            return false;
        }
    }

    static class DVD extends LibraryItem implements Reservable {
        public DVD(String id, String title, String author) {
            super(id, title, author);
        }

        @Override
        public int getLoanDuration() {
            return 3;
        }

        @Override
        public void reserveItem() {
            System.out.println("DVD reserved.");
        }

        @Override
        public boolean checkAvailability() {
            return true;
        }
    }

    /*
     * =========================================================
     * 6. Online Food Delivery System
     * =========================================================
     */
    interface Discountable {
        double applyDiscount();

        String getDiscountDetails();
    }

    static abstract class FoodItem {
        private String itemName;
        private double price;
        private int quantity;

        public FoodItem(String name, double price, int quantity) {
            this.itemName = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getItemName() {
            return itemName;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void getItemDetails() {
            System.out.println(itemName + " | Price: " + price + " | Qty: " + quantity);
        }

        public abstract double calculateTotalPrice();
    }

    static class VegItem extends FoodItem implements Discountable {
        public VegItem(String name, double price, int qty) {
            super(name, price, qty);
        }

        @Override
        public double calculateTotalPrice() {
            return getPrice() * getQuantity();
        }

        @Override
        public double applyDiscount() {
            return calculateTotalPrice() * 0.1;
        }

        @Override
        public String getDiscountDetails() {
            return "10% Veg Discount";
        }
    }

    static class NonVegItem extends FoodItem implements Discountable {
        public NonVegItem(String name, double price, int qty) {
            super(name, price, qty);
        }

        @Override
        public double calculateTotalPrice() {
            return getPrice() * getQuantity() + 50;
        } // extra charge

        @Override
        public double applyDiscount() {
            return calculateTotalPrice() * 0.05;
        }

        @Override
        public String getDiscountDetails() {
            return "5% Non-Veg Discount";
        }
    }

    /*
     * =========================================================
     * 7. Hospital Patient Management
     * =========================================================
     */
    interface MedicalRecord {
        void addRecord(String record);

        void viewRecords();
    }

    static abstract class Patient {
        private String patientId;
        private String name;
        private int age;

        public Patient(String id, String name, int age) {
            this.patientId = id;
            this.name = name;
            this.age = age;
        }

        public String getPatientId() {
            return patientId;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void getPatientDetails() {
            System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
        }

        public abstract double calculateBill();
    }

    static class InPatient extends Patient implements MedicalRecord {
        private double dailyRate;
        private int days;

        public InPatient(String id, String name, int age, double dailyRate, int days) {
            super(id, name, age);
            this.dailyRate = dailyRate;
            this.days = days;
        }

        @Override
        public double calculateBill() {
            return dailyRate * days;
        }

        @Override
        public void addRecord(String record) {
            System.out.println("InPatient record added: " + record);
        }

        @Override
        public void viewRecords() {
            System.out.println("Viewing InPatient records...");
        }
    }

    static class OutPatient extends Patient implements MedicalRecord {
        private double consultationFee;

        public OutPatient(String id, String name, int age, double fee) {
            super(id, name, age);
            this.consultationFee = fee;
        }

        @Override
        public double calculateBill() {
            return consultationFee;
        }

        @Override
        public void addRecord(String record) {
            System.out.println("OutPatient record added: " + record);
        }

        @Override
        public void viewRecords() {
            System.out.println("Viewing OutPatient records...");
        }
    }

    /*
     * =========================================================
     * 8. Ride-Hailing Application
     * =========================================================
     */
    interface GPS {
        String getCurrentLocation();

        void updateLocation(String location);
    }

    static abstract class RideVehicle {
        private String vehicleId;
        private String driverName;
        private double ratePerKm;

        public RideVehicle(String id, String driver, double rate) {
            this.vehicleId = id;
            this.driverName = driver;
            this.ratePerKm = rate;
        }

        public String getVehicleId() {
            return vehicleId;
        }

        public String getDriverName() {
            return driverName;
        }

        public double getRatePerKm() {
            return ratePerKm;
        }

        public void getVehicleDetails() {
            System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/Km: " + ratePerKm);
        }

        public abstract double calculateFare(double distance);
    }

    static class RideCar extends RideVehicle implements GPS {
        private String location;

        public RideCar(String id, String driver, double rate) {
            super(id, driver, rate);
        }

        @Override
        public double calculateFare(double distance) {
            return distance * getRatePerKm();
        }

        @Override
        public String getCurrentLocation() {
            return location;
        }

        @Override
        public void updateLocation(String location) {
            this.location = location;
        }
    }

    static class RideBike extends RideVehicle implements GPS {
        private String location;

        public RideBike(String id, String driver, double rate) {
            super(id, driver, rate);
        }

        @Override
        public double calculateFare(double distance) {
            return distance * getRatePerKm() * 0.9;
        }

        @Override
        public String getCurrentLocation() {
            return location;
        }

        @Override
        public void updateLocation(String location) {
            this.location = location;
        }
    }

    static class RideAuto extends RideVehicle implements GPS {
        private String location;

        public RideAuto(String id, String driver, double rate) {
            super(id, driver, rate);
        }

        @Override
        public double calculateFare(double distance) {
            return distance * getRatePerKm() * 1.1;
        }

        @Override
        public String getCurrentLocation() {
            return location;
        }

        @Override
        public void updateLocation(String location) {
            this.location = location;
        }
    }

    /*
     * =========================================================
     * Main Demonstration
     * =========================================================
     */
    public static void main(String[] args) {
        System.out.println("=== Employee Management ===");
        Employee[] employees = {
                new FullTimeEmployee("E001", "Alice", 50000),
                new PartTimeEmployee("E002", "Bob", 1000, 20)
        };
        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Calculated Salary: " + e.calculateSalary());
        }

        System.out.println("\n=== E-Commerce Platform ===");
        Product[] products = {
                new Electronics("P001", "Laptop", 80000),
                new Clothing("P002", "Shirt", 2000),
                new Groceries("P003", "Apple", 100)
        };
        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println(p.getName() + " Final Price: " + finalPrice);
        }

        System.out.println("\n=== Vehicle Rental ===");
        Vehicle[] vehicles = { new Car("C001", 1000), new Bike("B001", 300), new Truck("T001", 2000) };
        for (Vehicle v : vehicles) {
            double cost = v.calculateRentalCost(3);
            double ins = ((Insurable) v).calculateInsurance();
            System.out.println(v.getType() + " Rental: " + cost + " Insurance: " + ins);
        }

        System.out.println("\n=== Banking System ===");
        BankAccount[] accounts = {
                new SavingsAccount("S001", "John", 5000),
                new CurrentAccount("C001", "Mary", 10000)
        };
        for (BankAccount b : accounts) {
            System.out.println(b.getHolderName() + " Interest: " + b.calculateInterest());
        }

        System.out.println("\n=== Library Management ===");
        LibraryItem[] items = { new Book("L001", "Java Basics", "Author A"), new DVD("L002", "Movie X", "Director B") };
        for (LibraryItem li : items) {
            li.getItemDetails();
            System.out.println("Loan Duration: " + li.getLoanDuration() + " days");
        }

        System.out.println("\n=== Online Food Delivery ===");
        FoodItem[] foods = { new VegItem("Paneer", 150, 2), new NonVegItem("Chicken", 200, 1) };
        for (FoodItem f : foods) {
            f.getItemDetails();
            System.out.println("Total: " + f.calculateTotalPrice());
        }

        System.out.println("\n=== Hospital Management ===");
        Patient[] patients = { new InPatient("P001", "Alex", 30, 1000, 3), new OutPatient("P002", "Sophia", 25, 500) };
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
        }

        System.out.println("\n=== Ride-Hailing ===");
        RideVehicle[] rides = { new RideCar("R001", "Driver1", 10), new RideBike("R002", "Driver2", 8),
                new RideAuto("R003", "Driver3", 9) };
        for (RideVehicle r : rides) {
            r.getVehicleDetails();
            System.out.println("Fare for 15km: " + r.calculateFare(15));
        }
    }
}
