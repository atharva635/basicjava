import java.util.Scanner;

public class reapeatnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        long n = input.nextLong();
        System.out.println("No. how many times it repeat: ");
        long m = input.nextLong();
        int count =0;
        while(n!=0){
            long h = n%10;
            if(h==m){
                count++;

            }
            n = n/10;

        }
         System.out.println("Repeats times: ");
        System.out.println(count);
        input.close();
    }
}
