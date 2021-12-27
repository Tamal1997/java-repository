import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicInicialization {

	public static void main(String[] args)throws NumberFormatException,IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(isr);
		
		
		//BufferedReader ob1=new BufferedReader(new InputStreamReader(System.in));
		
		int a,b;
		String name;
		char x;
		
		System.out.println("Enter your name: ");
		name=ob.readLine();
		System.out.println(name);
		
		System.out.println("Enter any character value: ");
		x=(char)ob.read();
		System.out.println(x);
		
		System.out.println("Enter the value of a:");
		a=Integer.parseInt(ob.readLine());
		
		System.out.println("Enter the value of b:");
		b=Integer.parseInt(ob.readLine());
		
		System.out.println("sum="+(a+b));
		// TODO Auto-generated method stub

	}

}
