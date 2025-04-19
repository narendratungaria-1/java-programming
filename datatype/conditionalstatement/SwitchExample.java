package conditionalstatement;

import java.util.*;
public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number");
        double num1 = sc.nextDouble();
        System.out.println("enter the second number");
        double num2 = sc.nextDouble();
        System.out.println("chose an operation");
        System.out.println("1. addition");
        System.out.println("2. subtracton");
        System.out.println("3. multiply");
        System.out.println("4. divide");
        System.out.println("5. modulus");
        System.out.println("enter you choice: ");
        int choice = sc.nextInt();

        /*
        case number likhne k baad (->) iska use krne pr break statement  nhi lgana pdta
         */
        switch(choice){
            case 1:
                double add = num1+num2;
                System.out.println("addition: "+add);
                break;
            case 2:
                double sub = num1-num2;
                System.out.println("subtration: "+sub);
                break;
            case 3:
                double multiply = num1*num2;
                System.out.println("multiply: "+multiply);
                break;
            case 4:
                double divide = num1/num2;
                System.out.println("divide: "+divide);
                break;
            case 5:
                double modul = num1%num2;
                System.out.println("modual: "+modul);
                break;
            default:
                System.out.println("invalid chose of opetion number");
        }
    }

}
