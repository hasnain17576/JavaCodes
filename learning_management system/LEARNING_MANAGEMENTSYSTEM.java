import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LEARNING_MANAGEMENTSYSTEM {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Pattern pattern = Pattern.compile("[a-zA-Z]+\\d+"); // Password pattern e.g. abc123
            
            int savedId = -1;
            String enrolledCourses = "";
            String savedName = "";
            String savedPassword = "";
            boolean isAccountCreated = false;
            
            System.out.println("===== LEARNING MANAGEMENT SYSTEM =====");
            
            int choose = 0;
            
            do {
                try {
                    System.out.println("\n1. Login");
                    System.out.println("2. Create an account");
                    System.out.println("3. Exit");
                    System.out.print("Choose an option: ");
                    choose = input.nextInt();
                    input.nextLine(); // Clear buffer
                    switch (choose) {
                        case 2 ->                             {
                                System.out.print("Enter student ID (3 digits): ");
                                int id = input.nextInt();
                                input.nextLine(); // Clear buffer
                                if (id < 100 || id > 999) {
                                    System.out.println("ID must be 3 digits.");
                                    continue;
                                }       System.out.print("Enter name: ");
                                String name = input.nextLine();
                                System.out.print("Enter password (letters followed by digits, e.g. abc123): ");
                                String pass = input.nextLine();
                                Matcher match = pattern.matcher(pass);
                                if (match.matches()) {
                                    if (isAccountCreated && id == savedId) {
                                        System.out.println("ID already exists!");
                                    } else {
                                        savedId = id;
                                        savedName = name;
                                        savedPassword = pass;
                                        isAccountCreated = true;
                                        System.out.println("✅ Account created successfully!");
                                    }
                                } else {
                                    System.out.println("❌ Invalid password format. Use letters followed by digits.");
                                }                                  }
                        case 1 ->                             {
                                if (!isAccountCreated) {
                                    System.out.println("❌ No account exists. Please create one first.");
                                    continue;
                                }       System.out.print("Enter ID: ");
                                int id = input.nextInt();
                                input.nextLine(); // Clear buffer
                                System.out.print("Enter password: ");
                                String pass = input.nextLine();
                                if (id == savedId && pass.equals(savedPassword)) {
                                    int choice = 0;
                                    
                                    do {
                                        try {
                                            System.out.println("\n--- Student Dashboard ---");
                                            System.out.println("1. Enroll in Courses");
                                            System.out.println("2. Take Quiz");
                                            System.out.println("3. View Status");
                                            System.out.println("4. Logout");
                                            System.out.print("Choose option: ");
                                            choice = input.nextInt();
                                            
                                            switch (choice) {
                                                case 1 -> {
                                                    System.out.println("Available Courses:");
                                                    System.out.println("1. Java");
                                                    System.out.println("2. Python");
                                                    System.out.println("3. C++");
                                                    System.out.println("4. Machine Learning");
                                                    System.out.println("5. Artificial Intelligence");
                                                    System.out.print("Choose course number to enroll: ");
                                                    int course = input.nextInt();
                                                    String courseName = "";
                                                     switch (course) {
                                                        case 1 -> courseName = "Java";
                                                        case 2 -> courseName = "Python";
                                                        case 3 -> courseName = "C++";
                                                        case 4 -> courseName = "Machine Learning";
                                                        case 5 -> courseName = "Artificial Intelligence";
                                                        default -> {
                                                            System.out.println("❌ Invalid course selected.");
                                                            continue;
                                                    }
                                                    }
                                                    if (!enrolledCourses.contains(courseName)) {
                                                        enrolledCourses += courseName + ", ";
                                                        System.out.println("✅ Enrolled in " + courseName + " successfully!");
                                                    } else {
                                                        System.out.println("⚠️ Already enrolled in " + courseName + ".");
                                                    }
                                                }
                                                case 2 -> {
                                                    System.out.println("--- Quiz Time ---");
                                                    char[] answers = new char[5];
                                                    input.nextLine(); // clear buffer
                                                    for (int i = 0; i < answers.length; i++) {
                                                        switch (i) {
                                                            case 0 -> System.out.print("1. 2+2=?\nA.2\nB.3\nC.6\nD.4\nAnswer: ");
                                                            case 1 -> System.out.print("2. 2+3=?\nA.2\nB.5\nC.6\nD.4\nAnswer: ");
                                                            case 2 -> System.out.print("3. 2*8=?\nA.2\nB.3\nC.6\nD.16\nAnswer: ");
                                                            case 3 -> System.out.print("4. 16/4=?\nA.2\nB.3\nC.4\nD.8\nAnswer: ");
                                                            case 4 -> System.out.print("5. 27/3=?\nA.9\nB.3\nC.6\nD.4\nAnswer: ");
                                                        }
                                                        answers[i] = input.nextLine().toUpperCase().charAt(0);
                                                    }   char[] keys = {'D', 'B', 'D', 'C', 'A'};
                                                    int correctCount = 0;
                                                    for (int i = 0; i < keys.length; i++) {
                                                        if (answers[i] == keys[i]) {
                                                            correctCount++;
                                                        }
                                                    }   System.out.println("✅ You got " + correctCount + " out of 5 correct.");
                                                }
                                                case 3 -> {
                                                    System.out.println("--- Student Status ---");
                                                    System.out.println("ID: " + savedId);
                                                    System.out.println("Name: " + savedName);
                                                    System.out.println("Enrolled Courses: " + (enrolledCourses.isEmpty() ? "None" : enrolledCourses));
                                                }
                                                case 4 -> System.out.println("🔒 Logged out.");
                                                default -> System.out.println("❌ Invalid option.");
                                            }

                                        } catch (InputMismatchException e) {
                                            System.out.println("⚠️ Invalid input. Please enter numbers only.");
                                            input.nextLine(); // Clear buffer
                                        }
                                        
                                    } while (choice != 4);
                                    
                                } else {
                                    System.out.println("❌ Invalid ID or password.");
                                }                                  }
                        case 3 -> System.out.println("👋 Exiting... Thank you!");
                        default -> System.out.println("❌ Invalid option. Try again.");
                    }
                    
                } catch (InputMismatchException e) {
                    System.out.println("⚠️ Invalid input. Please enter numbers only.");
                    input.nextLine(); // Clear buffer
                }
                
            } while (choose != 3);
        } // Password pattern e.g. abc123
    }
}
