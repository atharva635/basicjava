import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Your Number: ");
        int n = input.nextInt();
        System.out.print("Your reverse number is : ");
        while(n!=0){
            int h = n%10;
            System.out.print(h);
            n = n/10;
        }
        input.close();

    }
}
