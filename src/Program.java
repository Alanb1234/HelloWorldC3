import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // initialize the username and password
        String username = "admin";
        String password = "PaSSword!!!";

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        int counter = 3;

        while (counter > 0){

            System.out.println("Enter username:");
            String usernameInput = myObj.nextLine(); // Read username input

            System.out.println("Enter password:");
            String userPasswordInput = myObj.nextLine(); // Read username input

            // Checks if the credentials entered are correct
            if (usernameInput.toLowerCase().equals(username) && userPasswordInput.equals(password) ){
                System.out.println("Access Granted");

                break;

            }else{
                System.out.println("Access Denied");

                counter--;

            }

        }

    }

}
