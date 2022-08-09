import java.util.Scanner;

public class LoginScript {
    public static void main(String[] args) {
       Scanner Scan = new Scanner (System.in);

        //Declaring the variables
        String Username;
        String Password;

        Password = "Password";
        Username = "Admin";
        //user will input the input1
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = input1.next();
        //user will input for password
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = input2.next();

        //error message for clicking on the return button
        if(!username.isEmpty()){
            System.out.println("Please, Enter the Username");
        }
        else{
            System.out.println("Enter the password");
        }

        if (username.equals(Username) && password.equals(Password)) {

            System.out.println("you have been validated");
        } else if (username.equals(Username)) {
            System.out.println("Invalid Password!");  // user will enter the username
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
        } else { //system will check the password
            System.out.println("Invalid Username & Password!");
        }
    }
}
