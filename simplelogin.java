import java.util.Scanner;
public class simplelogin {
    static String name = null, username = null;
    static int pass;

    static void signup() {
        Scanner s = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter your name: ");
        name = s.nextLine();
        System.out.print("Enter your username: ");
        username = s.nextLine();
        System.out.print("Enter your password: ");
        pass = s.nextInt();
        s.nextLine(); 
        System.out.println("Thank you, " + name + ", for signing up with us!");
    }

    static void signin() {
        if (name == null || username == null) {
            System.out.println("You need to sign up first!");
            return;
        }

        Scanner s = new Scanner(System.in);

        int usernameAttempts = 0;
        while (usernameAttempts < 5) {
            System.out.print("Enter your username: ");
            String uname = s.nextLine();
            usernameAttempts++;

            if (uname.equals(username)) {
                System.out.println("Correct username, now enter your password.");

            
                int passwordAttempts = 0;
                while (passwordAttempts < 5) {
                    System.out.print("Enter your Password: ");
                    int mypass = s.nextInt();
                    s.nextLine(); 
                    passwordAttempts++;

                    if (mypass == pass) {
                        System.out.println("Correct Password! Welcome back!");
                        return; 
                    } 
                    else {
                        System.out.println("__________________________________");
                        System.out.println("Attempt: " + passwordAttempts);
                        System.out.println("Incorrect Password, Try again!");
                    }

                    if (passwordAttempts == 5) {
                        System.out.println("__________________________________");
                        System.out.println("Too many attempts. Try again later!");
                        System.out.println("__________________________________");
                    }
                }
                return; 
            } else {
                System.out.println("__________________________________");
                System.out.println("Attempt: " + usernameAttempts);
                System.out.println("Incorrect Username, Try again!");
            }

            if (usernameAttempts == 5) {
                System.out.println("__________________________________");
                System.out.println("Too many attempts. Try again later!");
                System.out.println("__________________________________");
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String choice = "y";

        while (choice.equals("y")) {
            System.out.println("\n1. Sign Up");
            System.out.println("2. Sign In");
            System.out.print("Enter your choice: ");
            int ch = s.nextInt();
            s.nextLine();

            switch (ch) {
                case 1:
                    signup();
                    break;
                case 2:
                    signin();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = s.nextLine();
        }
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("Thank you for using our simple login system!");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    }
}
