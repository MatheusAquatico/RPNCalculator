package rpn;

import java.util.Scanner;
import java.util.Stack;

public class RPNCalc {

	public static void main(String[] args) {
		Stack<Double> stack = new Stack<>();
		Scanner scan = new Scanner(System.in);
		double res=0;
		String var;
		System.out.println("Digite sua string de operação no console em formato RPN e aperte duas vezes enter");
		while(scan.hasNextLine()){
			var= scan.nextLine();
			if (var.equals(""))
		        break;
			char op= var.charAt(0);
			double a,b=0;
			switch(op){
				case '+':
					a= stack.lastElement();
					stack.pop();
					b= stack.lastElement();
					stack.pop();
					stack.push(b+a);
					break;
				case '-':
					a= stack.lastElement();
					stack.pop();
					b= stack.lastElement();
					stack.pop();
					stack.push(b-a);
					break;
				case '/':
					a= stack.lastElement();
					stack.pop();
					b= stack.lastElement();
					stack.pop();
					if(a==0) {
						System.out.println("Um número não pode ser dividido por 0!");
					}else {
						stack.push(b/a);
					}
					break;
				case '*':
					a= stack.lastElement();
					stack.pop();
					b= stack.lastElement();
					stack.pop();
					stack.push(b*a);
					break;
				case '^':
					a= stack.lastElement();
					stack.pop();
					b= stack.lastElement();
					stack.pop();
					stack.push(Math.pow(b, a));
					break;
			    default:
			    	double num= Double.parseDouble(var);
			    	stack.push(num);
			    	break;
			    	
			}
			
		}
		System.out.println("Resultado:");
		res= stack.firstElement();
		System.out.println(res);

	}

}
