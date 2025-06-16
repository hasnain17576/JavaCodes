import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\w+\\d+");

        int savedId = 0;
        String enrolledCourses = "";
        String savedName = "";
        String savedPassword = "";

        System.out.println(" LEARNING MANAGEMENT SYSTEM ");

        while (true) {
            try {
                System.out.println("\nMain Menu:");
                System.out.println("1. Login");
                System.out.println("2. Create an account");
                System.out.println("3. Exit");
                System.out.print("Choose an option (1-3): ");

                int choose = input.nextInt();
                input.nextLine(); 

                if (choose == 3) {
                    System.out.println("Exiting... Thank you!");
                    break;
                }

                switch (choose) {
                    case 1: {
                        try {
                            System.out.print("Enter ID (3 digits): ");
                            int id = input.nextInt();
                            input.nextLine();

                            System.out.print("Enter password: ");
                            String pass = input.nextLine().trim();

                            if (id == savedId && pass.equals(savedPassword)) {
                                boolean loggedIn = true;
                                while (loggedIn) {
                                    try {
                                        System.out.println("\n--- Student Dashboard ---");
                                        System.out.println("1. Enroll in Courses");
                                        System.out.println("2. Take Quiz");
                                        System.out.println("3. View Status");
                                        System.out.println("4. Logout");
                                        System.out.print("Enter your choice: ");
                                        int choice = input.nextInt();

                                        switch (choice) {
                                            case 1: {
                                                System.out.println("Available Courses:");
                                                System.out.println("1. Java");
                                                System.out.println("2. Python");
                                                System.out.println("3. C++");
                                                System.out.println("4. Machine Learning");
                                                System.out.println("5. AI");
                                                System.out.print("Enter course number: ");
                                                int course = input.nextInt();

                                                String courseName = "";
                                                switch (course) {
                                                    case 1: courseName = "Java";
                                                     break;
                                                    case 2: courseName = "Python";
                                                     break;
                                                    case 3: courseName = "C++";
                                                     break;
                                                    case 4: courseName = "Machine Learning";
                                                     break;
                                                    case 5: courseName = "AI";
                                                     break;
                                                    default: courseName = null;
                                                }

                                                if (courseName != null) {
                                                    if (!enrolledCourses.contains(courseName)) {
                                                        enrolledCourses += courseName + ", ";
                                                        System.out.println("Successfully enrolled in " + courseName);
                                                    } else {
                                                        System.out.println("You are already enrolled in " + courseName);
                                                    }
                                                } else {
                                                    System.out.println("Invalid course number.");
                                                }
                                                break;
                                            }

                                            case 2: {
                                                System.out.println("Quiz Started:");
                                                input.nextLine(); 
                                                char[] answers = new char[5];

                                                for (int i = 0; i < 5; i++) {
                                                    switch (i) {
                                                        case 0: System.out.print("Q1: 2+2=? A.2 B.3 C.6 D.4\nAnswer: "); break;
                                                        case 1: System.out.print("Q2: 2+3=? A.2 B.5 C.6 D.4\nAnswer: "); break;
                                                        case 2: System.out.print("Q3: 2*8=? A.2 B.3 C.6 D.16\nAnswer: "); break;
                                                        case 3: System.out.print("Q4: 16/4=? A.2 B.3 C.4 D.8\nAnswer: "); break;
                                                        case 4: System.out.print("Q5: 27/3=? A.9 B.3 C.6 D.4\nAnswer: "); break;
                                                    }

                                                    try {
                                                        answers[i] = input.next().toUpperCase().charAt(0);
                                                    } catch (Exception e) {
                                                        System.out.println("Invalid input. Skipping question.");
                                                        answers[i] = ' ';
                                                        input.nextLine();
                                                    }
                                                }

                                                char[] keys = {'D', 'B', 'D', 'C', 'A'};
                                                int correct = 0;
                                                for (int i = 0; i < 5; i++) {
                                                    if (answers[i] == keys[i]) correct++;
                                                }
                                                System.out.println("You got " + correct + "/5 correct.");
                                                break;
                                            }

                                            case 3: {
                                                System.out.println("\n--- Student Info ---");
                                                System.out.println("ID: " + savedId);
                                                System.out.println("Name: " + savedName);
                                                System.out.println("Enrolled Courses: " + (enrolledCourses.isEmpty() ? "None" : enrolledCourses));
                                                break;
                                            }

                                            case 4: {
                                                System.out.println("Logging out...");
                                                loggedIn = false;
                                                break;
                                            }

                                            default: {
                                                System.out.println("Invalid dashboard choice.");
                                            }
                                        }

                                    } catch (InputMismatchException e) {
                                        System.out.println("Please enter a valid number.");
                                        input.nextLine();
                                    } catch (Exception e) {
                                        System.out.println("Unexpected error in dashboard: " + e.getMessage());
                                        input.nextLine();
                                    }
                                }
                            } else {
                                System.out.println("Incorrect ID or password.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid ID. Enter numeric digits only.");
                            input.nextLine();
                        } catch (Exception e) {
                            System.out.println("Error during login: " + e.getMessage());
                            input.nextLine();
                        }
                        break;
                    }

                    case 2: {
                        try {
                            System.out.print("Enter student ID (3 digits): ");
                            int id = input.nextInt();
                            input.nextLine();

                            if (String.valueOf(id).length() != 3) {
                                System.out.println("ID must be exactly 3 digits.");
                                break;
                            }

                            System.out.print("Enter name: ");
                            String name = input.nextLine().trim();
                            if (name.isEmpty()) {
                                System.out.println("Name cannot be empty.");
                                break;
                            }

                            System.out.print("Enter password (letters and digits): ");
                            String pass = input.nextLine().trim();
                            if (pass.isEmpty()) {
                                System.out.println("Password cannot be empty.");
                                break;
                            }

                            Matcher matcher = pattern.matcher(pass);
                            if (!matcher.matches()) {
                                System.out.println("Invalid password format. Include letters and end with digits.");
                            } else if (id == savedId) {
                                System.out.println("This ID is already registered.");
                            } else {
                                savedId = id;
                                savedName = name;
                                savedPassword = pass;
                                enrolledCourses = "";
                                System.out.println("Account created successfully!");
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("ID must be numeric.");
                            input.nextLine();
                        } catch (Exception e) {
                            System.out.println("Something went wrong: " + e.getMessage());
                            input.nextLine();
                        }
                        break;
                    }

                    default: {
                        System.out.println("Please choose a valid option (1-3).");
                        break;
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine(); 
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
                input.nextLine();
            }
        }

        input.close();
    }
}


