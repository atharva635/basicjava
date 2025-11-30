import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        while(true){
            System.out.println("Type operation: ");
            char ch = input.next().trim().charAt(0);
            if(ch=='+' || ch =='-' || ch =='*' || ch == '/' || ch == '%'){
                
            System.out.println("Enter 1: ");
            int n = input.nextInt();
              System.out.println("Enter 2: ");
            int m = input.nextInt();
            if(ch=='+'){
                result = n+m;
            }
            if(ch=='-'){
                result = n-m;
            }
            if(ch=='*'){
                result = n*m;
            }
            if(ch=='/'){
                result = n/m;
            }
            if(ch=='%'){
                result = n%m;
            }
                    
                
                else if(ch=='x' || ch=='X'){
                    System.out.println("Null");
                }
                else{
                    System.out.println("Invalid Operator");
                }
                   System.out.println(result);
            }
                input.close();
                
            }
            
        }

        
    }

