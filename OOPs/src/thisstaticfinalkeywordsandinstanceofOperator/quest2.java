package OOPs.src.thisstaticfinalkeywordsandinstanceofOperator;

public class quest2 {

    /*
     * ===========================
     * Sample 1: BankAccount
     * ===========================
     */
    static class BankAccount {
        private static String bankName = "State Bank of India";
        private static int totalAccounts = 0;

        private final String accountNumber; // final: assigned once
        private String accountHolderName;
        private double balance;

        // constructor uses this to set fields
        public BankAccount(String accountHolderName, String accountNumber, double balance) {
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber; // final assigned here
            this.balance = balance;
            totalAccounts++;
        }

        public static void getTotalAccounts() {
            System.out.println("Total number of accounts: " + totalAccounts);
        }

        public void displayAccountDetails() {
            if (this instanceof BankAccount) { // instanceof check
                System.out.println("Bank Name: " + bankName);
                System.out.println("Account Holder: " + accountHolderName);
                System.out.println("Account Number: " + accountNumber);
                System.out.println("Balance: $" + balance);
            } else {
                System.out.println("Invalid account instance.");
            }
        }

        public void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount;
                System.out.println("Deposited: $" + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= this.balance) {
                this.balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        }
    }

    /*
     * ===========================
     * Sample 2: Book / Library
     * ===========================
     */
    static class Book {
        private static String libraryName;
        private String title;
        private String author;
        private final String isbn; // final

        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        public static void setLibraryName(String name) {
            libraryName = name;
        }

        public static void displayLibraryName() {
            System.out.println("Library Name: " + libraryName);
        }

        public void displayBookDetails() {
            if (this instanceof Book) {
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("ISBN: " + isbn);
            } else {
                System.out.println("Not a Book instance.");
            }
        }
    }

    /*
     * ===========================
     * Sample 3: Company / Employee
     * ===========================
     */
    static class Company {
        private static String companyName;
        private static int totalEmployees = 0;

        private String name;
        private final int id; // final
        private String designation;

        public Company(String name, int id, String designation) {
            this.name = name;
            this.id = id;
            this.designation = designation;
            totalEmployees++;
        }

        public static void setCompanyName(String name) {
            companyName = name;
        }

        public static void displayTotalEmployees() {
            System.out.println("Total Employees: " + totalEmployees);
        }

        public void displayEmployeeDetails() {
            if (this instanceof Company) {
                System.out.println("Company Name: " + companyName);
                System.out.println("Employee ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Designation: " + designation);
            } else {
                System.out.println("Not an Employee instance.");
            }
        }
    }

    /*
     * ===========================
     * Sample 4: Product / Shopping
     * ===========================
     */
    static class Product {
        private static double discount = 0.0; // shared across all products

        private final String productID; // final
        private String productName;
        private double price;
        private int quantity;

        public Product(String productID, String productName, double price, int quantity) {
            this.productID = productID;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public static void updateDiscount(double newDiscount) {
            if (newDiscount >= 0.0 && newDiscount <= 100.0) {
                discount = newDiscount;
            } else {
                System.out.println("Invalid discount value. Must be 0-100.");
            }
        }

        public double getDiscountedPrice() {
            return price - (price * discount / 100.0);
        }

        public void displayProductDetails() {
            if (this instanceof Product) {
                System.out.println("Product ID: " + productID);
                System.out.println("Product Name: " + productName);
                System.out.println("Price: $" + price);
                System.out.println("Quantity: " + quantity);
                System.out.println("Discount: " + discount + "%");
                System.out.println("Price after Discount: $" + getDiscountedPrice());
            } else {
                System.out.println("Not a Product instance.");
            }
        }
    }

    /*
     * ===========================
     * Sample 5: Student / University
     * ===========================
     */
    static class Student {
        private static String universityName;
        private static int totalStudents = 0;

        private final int rollNumber; // final
        private String name;
        private char grade;

        public Student(String name, int rollNumber, char grade) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.grade = grade;
            totalStudents++;
        }

        public static void setUniversityName(String name) {
            universityName = name;
        }

        public static void displayTotalStudents() {
            System.out.println("Total Students Enrolled: " + totalStudents);
        }

        public void displayStudentDetails() {
            if (this instanceof Student) {
                System.out.println("University Name: " + universityName);
                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Name: " + name);
                System.out.println("Grade: " + grade);
            } else {
                System.out.println("Not a Student instance.");
            }
        }

        public void updateGrade(char newGrade) {
            if (this instanceof Student) {
                this.grade = newGrade;
                System.out.println("Grade updated to: " + newGrade);
            } else {
                System.out.println("Cannot update grade on non-student object.");
            }
        }
    }

    /*
     * ===========================
     * Sample 6: Vehicle Registration
     * ===========================
     */
    static class Vehicle {
        private static double registrationFee = 100.0;

        private final String registrationNumber; // final
        private String ownerName;
        private String vehicleType;

        public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
            this.registrationNumber = registrationNumber;
        }

        public static void updateRegistrationFee(double newFee) {
            if (newFee >= 0.0) {
                registrationFee = newFee;
            } else {
                System.out.println("Invalid registration fee.");
            }
        }

        public void displayRegistrationDetails() {
            if (this instanceof Vehicle) {
                System.out.println("Owner Name: " + ownerName);
                System.out.println("Vehicle Type: " + vehicleType);
                System.out.println("Registration Number: " + registrationNumber);
                System.out.println("Registration Fee: $" + registrationFee);
            } else {
                System.out.println("Not a Vehicle instance.");
            }
        }
    }

    /*
     * ===========================
     * Sample 7: Patient / Hospital
     * ===========================
     */
    static class Patient {
        private static String hospitalName;
        private static int totalPatients = 0;

        private final String patientID; // final
        private String name;
        private int age;
        private String ailment;

        public Patient(String name, int age, String ailment, String patientID) {
            this.name = name;
            this.age = age;
            this.ailment = ailment;
            this.patientID = patientID;
            totalPatients++;
        }

        public static void setHospitalName(String name) {
            hospitalName = name;
        }

        public static int getTotalPatients() {
            return totalPatients;
        }

        public void displayPatientDetails() {
            if (this instanceof Patient) {
                System.out.println("Hospital Name: " + hospitalName);
                System.out.println("Patient ID: " + patientID);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Ailment: " + ailment);
            } else {
                System.out.println("Not a Patient instance.");
            }
        }
    }

    /*
     * ===========================
     * Central main() demonstrating all samples
     * ===========================
     */
    public static void main(String[] args) {
        System.out.println("----- Sample 1: BankAccount -----");
        BankAccount acc1 = new BankAccount("Lynda Princy", "ACC12345", 1000.00);
        BankAccount acc2 = new BankAccount("Prince Danish", "ACC67890", 500.00);
        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();
        System.out.println();
        BankAccount.getTotalAccounts();
        System.out.println("Performing transactions on Account 1:");
        acc1.deposit(200);
        acc1.withdraw(150);
        acc1.displayAccountDetails();
        System.out.println();

        System.out.println("----- Sample 2: Book / Library -----");
        Book.setLibraryName("Egmore Library");
        Book.displayLibraryName();
        Book b1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        b1.displayBookDetails();
        System.out.println();

        System.out.println("----- Sample 3: Company / Employees -----");
        Company.setCompanyName("Tech Solutions Inc.");
        Company emp1 = new Company("Thamarai", 101, "Software Engineer");
        Company emp2 = new Company("Rohan", 102, "Project Manager");
        Company.displayTotalEmployees();
        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();
        System.out.println();

        System.out.println("----- Sample 4: Product / Shopping -----");
        Product.updateDiscount(10.0);
        Product p1 = new Product("P001", "Laptop", 1200.00, 5);
        Product p2 = new Product("P002", "Smartphone", 800.00, 10);
        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();

        System.out.println("----- Sample 5: Student / University -----");
        Student.setUniversityName("Global University");
        Student s1 = new Student("Hemashree", 101, 'A');
        Student s2 = new Student("Sharmila", 102, 'B');
        Student.displayTotalStudents();
        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();
        System.out.println("Updating Sharmila's grade to A:");
        s2.updateGrade('A');
        s2.displayStudentDetails();
        System.out.println();

        System.out.println("----- Sample 6: Vehicle Registration -----");
        Vehicle.updateRegistrationFee(150.0);
        Vehicle v1 = new Vehicle("Honest raj", "Sedan", "ABC123");
        Vehicle v2 = new Vehicle("Price danish", "SUV", "XYZ789");
        v1.displayRegistrationDetails();
        System.out.println();
        v2.displayRegistrationDetails();
        System.out.println();

        System.out.println("----- Sample 7: Patient / Hospital -----");
        Patient.setHospitalName("City Hospital");
        Patient pt1 = new Patient("Lathika", 30, "Flu", "P001");
        Patient pt2 = new Patient("Lidiya", 45, "Fracture", "P002");
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
        pt1.displayPatientDetails();
        System.out.println();
        pt2.displayPatientDetails();
    }
}
