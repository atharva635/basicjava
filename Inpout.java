import java.util.Scanner;
public class Inpout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // This creates a Scanner object named input.
        //System.in means keyboard input.
        //Now you can use input.nextInt(), input.nextLine(), etc., to read input from the user.

        System.out.println("Your no to print: ");
        int rollno = input.nextInt();

        //this reads an integer value given by user
        
        System.out.println("Your no is: " + rollno);
        input.close();
        
    }
}
