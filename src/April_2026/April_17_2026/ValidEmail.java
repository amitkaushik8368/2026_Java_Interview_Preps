package April_2026.April_17_2026;

import java.util.Scanner;

public class ValidEmail
{
    /**
     *  amit@live.com - Valid
     *  amit@dasda - Not valid
     */

    public static void main(String[] args)
    {
        System.out.println("Enter the email ID: ");
        Scanner scanner = new Scanner(System.in);
        String emailID = scanner.nextLine();
        scanner.close();


        String regex = "^[A-Za-z0-9-_+.]+@[A-Za-z0-9-.]+\\.[A-Za-z]{2,}$";

        if (emailID.trim().matches(regex))
        {
            System.out.println("Valid Email");
        }
        else System.out.println("Invalid Email");

    }
}
