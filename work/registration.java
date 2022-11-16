
import java.util.Scanner;
public class evas

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
		
		
	int age ;
	int num1;
	String name ;
	int product;
	int num2;
		
	
	
	System.out.print("Enter Average Mark Obtained in 8 Subjects: ");
	num1 = input.nextInt();

	if(num1>0 && num1<41) {
		System.out.println("Grade is: F9");
	}
	else if(num1>40 && num1<46){
		System.out.println("Grade is: P8");
	}
	
	else if(num1>45 && num1<51){
		System.out.println("Grade is: P7");
	}
	
	else if(num1>50 && num1<56){
		System.out.println("Grade is: C6");
	}
	
	else if(num1>55 && num1<61){
		System.out.println("Grade is: C5");
	}
	
	else if(num1>60 && num1<66){
		System.out.println("Grade is: C4");
	}
	
	
	else if(num1>65 && num1<71){
		System.out.println("Grade is: C3");
	}
	
	else if(num1>70 && num1<76){
		System.out.println("Grade is: D2");
	}
	
	else{
		System.out.println("Grade is: D1");
	}
	
	
//	int product;
	
//	product= (num1 * num2);
//	
	
//System.out.print("My age is " + age);
//
//System.out.print("The product is  " + product);




	}

}

