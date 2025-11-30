import java.util.Scanner;

public class sumoftwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First no: ");
        int h = input.nextInt();
        System.out.println("Second no: ");
        int k = input.nextInt();
        System.out.println("Sum: ");
        int sum = h + k;
        input.close();
        System.out.println(sum);
    }
}
