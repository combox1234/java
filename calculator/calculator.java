import java.util.Scanner;

import methods.asmd;

public class calculator {
    public static void main(String a[]){
        System.out.println("hi \nhello");
        Scanner sc = new Scanner(System.in);
        int option;
        do{
            System.out.print("Enter first number:");
            double num1 = sc.nextDouble();
            System.out.print("");
            System.out.print("Enter first number:");
            double num2 = sc.nextDouble();
            System.out.print("");
            System.out.print("1. Add \n2. Sub \n3. multiply \n4. divide \nEnter you input :");
            option = sc.nextInt();
            asmd m = new asmd(num1, num2);

            switch(option){
                case 1:
                    System.out.println("the sum of " + num1 + " and " + num2 + " is " + m.add());
                    break;
                case 2:
                    System.out.println("the differene of " + num1 + " and " + num2 + " is " + m.sub());
                    break;
                case 3:
                    System.out.println("the product of " + num1 + " and " + num2 + " is " + m.mul());
                    break;
                case 4:
                    System.out.println("the quotient of " + num1 + " and " + num2 + " is " + m.div());
                    break;
                case 0:
                    break;
                default :
                    System.out.println("Invalid Optio please check again");
                    break;
                }
        }while(option != 0  );
        sc.close();
    }
}
