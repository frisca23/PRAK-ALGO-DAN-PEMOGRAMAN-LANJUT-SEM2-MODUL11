import java.util.Scanner;
public class Calculator {
   public static void main(String[] args)
   {
	   Scanner in = new Scanner(System.in);
	   System.out.println("Enter numbers: ");
	   double f = in.nextDouble();
	   double s = in.nextDouble();
	   System.out.print("Enter an operator (+, -, *, /,%):");
	   char op = in.next().charAt(0);//op=operator
	   double r; //result
	   switch(op)
	   {
		   case '+':
		   r = f + s;
		   System.out.println(" The sum is = "+r);
		   break;
		   case '-':
		   r = f - s;
		   System.out.println(" The difference is = "+r);
		   break;
		   case '*':
		   r = f * s;
		   System.out.println(" The product is = "+r);
		   break;
		   case '/':
		   r = f / s;
		   System.out.println(" The quotient is = "+r);
		   break;
		   case '%':
		   r= f%s;
		   System.out.println("The remainder is= "+r);
		   // if operator doesn't match any case constant (+, -, *, /)
		   default:
		   System.out.println("Error! operator is not correct");
		   break;
       }
    }
}