import java.util.Scanner;
public class Float {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float h = input.nextFloat();

        // for float we use nextFloat then only it works

        System.out.println(h);
        input.close();
    }
    
}
