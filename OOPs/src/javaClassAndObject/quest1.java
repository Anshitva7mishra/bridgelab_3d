package OOPs.src.javaClassAndObject;

public class quest1 {

    /* ========== Level 1 Programs ========== */

    // 1. Employee Details
    static class Employee {
        private String name;
        private int id;
        private double salary;

        Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        public void displayEmployee() {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee id: " + id);
            System.out.println("Employee Salary: " + salary);
        }
    }

    // 2. Circle Area & Circumference
    static class Circle {
        private double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        public void areaCircle() {
            System.out.printf("Area of circle: %.4f%n", Math.PI * radius * radius);
        }

        public void circumferenceCircle() {
            System.out.printf("Circumference of circle: %.4f%n", 2 * Math.PI * radius);
        }
    }

    // 3. Book Details
    static class HandBook {
        private String bookTitle;
        private String bookAuthor;
        private double price;

        HandBook(String bookTitle, String bookAuthor, double price) {
            this.bookTitle = bookTitle;
            this.bookAuthor = bookAuthor;
            this.price = price;
        }

        public void displayBookDetails() {
            System.out.println("Title: " + bookTitle);
            System.out.println("Author: " + bookAuthor);
            System.out.println("Price: " + price);
        }
    }

    // 4. Inventory Items
    static class Items {
        private String[] itemCode;
        private String[] itemName;
        private double[] price;

        Items(String[] itemName, String[] itemCode, double[] price) {
            this.itemCode = itemCode;
            this.itemName = itemName;
            this.price = price;
        }

        public void displayItems(int i) {
            System.out.println("itemCode : " + itemCode[i]);
            System.out.println("itemPrice : " + price[i]);
            System.out.println("itemName : " + itemName[i]);
            System.out.println("----------------------------");
        }
    }

    // 5. Mobile Phone Details
    static class MobilePhone {
        private String brand;
        private String model;
        private double price;

        MobilePhone(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        public void displayMobile() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: " + price);
            System.out.println("------------------------------");
        }
    }

    /* ========== Level 2 Programs ========== */

    // 1. Student Grades
    static class StudentsGrades {
        private String name;
        private String rollNumber;
        private double[] marks;

        StudentsGrades(String name, String rollNumber, double[] marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }

        public String calculateGrade() {
            double total = 0;
            for (double m : marks)
                total += m;
            double avg = total / marks.length;

            if (avg >= 80)
                return "Grade A";
            else if (avg >= 60)
                return "Grade B";
            else if (avg >= 50)
                return "Grade C";
            else if (avg >= 40)
                return "Grade D";
            else
                return "Grade F";
        }

        public void displayStudent() {
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            for (int i = 0; i < marks.length; i++) {
                System.out.println("Mark " + (i + 1) + ": " + marks[i]);
            }
            System.out.println(calculateGrade());
        }
    }

    // 2. Bank Account
    static class BankAccount {
        private String accountHolder;
        private String accountNumber;
        private double balance;

        BankAccount(String accountHolder, String accountNumber, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        }

        public void displayBalance() {
            System.out.println("Current balance: " + balance);
        }
    }

    // 3. Palindrome Checker
    static class PalindromeChecker {
        private String text;

        PalindromeChecker(String text) {
            this.text = text;
        }

        public boolean isPalindrome() {
            String clean = text.replaceAll("\\s", "").toLowerCase();
            return clean.equals(new StringBuilder(clean).reverse().toString());
        }

        public void displayResult() {
            System.out.println(text + (isPalindrome() ? " is palindrome" : " is not palindrome"));
        }
    }

    // 4. Movie Ticket
    static class MovieTicket {
        private String movieName;
        private String seatNumber = "Null";
        private double price = 0.0;
        private boolean isBooked = false;

        MovieTicket(String movieName) {
            this.movieName = movieName;
        }

        public void bookTicket(String seatNumber, double price) {
            if (isBooked) {
                System.out.println("Ticket already booked!");
            } else {
                this.seatNumber = seatNumber;
                this.price = price;
                this.isBooked = true;
                System.out.println("Ticket booked for movie: " + movieName);
                System.out.println("Seat Number: " + seatNumber + ", Price: " + price);
            }
        }

        public void displayTicket() {
            if (isBooked) {
                System.out.println("Ticket for " + movieName + " Seat: " + seatNumber + " Price: " + price);
            } else {
                System.out.println("No ticket booked yet.");
            }
        }
    }

    // 5. Shopping Cart
    static class CartItem {
        private String itemName;
        private double price;
        private int quantity;

        CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        public void addItem(int qty) {
            quantity += qty;
            System.out.println("Added " + qty + " of " + itemName);
        }

        public void removeItem(int qty) {
            if (qty > quantity) {
                System.out.println("Not enough items to remove.");
            } else {
                quantity -= qty;
                System.out.println("Removed " + qty + " of " + itemName);
            }
        }

        public double totalCost() {
            return price * quantity;
        }

        public void displayItem() {
            System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
        }
    }

    /* ========== Demo Main ========== */
    public static void main(String[] args) {
        // Quick demo of a few classes:
        new Employee("Rohan", 1, 500000).displayEmployee();
        Circle c = new Circle(2.5);
        c.areaCircle();
        c.circumferenceCircle();
        new HandBook("2 States", "Chetan Bhagat", 500).displayBookDetails();
        new MobilePhone("VIVO", "V29", 15999).displayMobile();
        new StudentsGrades("Alice", "ECE001", new double[] { 80, 70, 75 }).displayStudent();
        BankAccount acc = new BankAccount("Lynda", "123456789", 700);
        acc.deposit(200);
        acc.withdraw(100);
        acc.displayBalance();
        new PalindromeChecker("A man a plan a canal Panama").displayResult();
        MovieTicket t = new MovieTicket("Dragon");
        t.bookTicket("A10", 120);
        t.displayTicket();
        CartItem cart = new CartItem("Laptop", 999.99, 1);
        cart.addItem(2);
        cart.removeItem(1);
        cart.displayItem();
        System.out.println("Cart total: $" + cart.totalCost());
    }
}
