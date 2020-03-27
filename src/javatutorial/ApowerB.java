package javatutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ApowerB {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int m=pow(a,b);
		System.out.println(m);
		s.close();
	
		/*BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		String[] input = new String[2]; 
		System.out.print("Please enter two integers: "); 
		try {
			input = in.readLine().split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		} 

		int a = Integer.parseInt(input[0]); 
		int b = Integer.parseInt(input[1]);
		int m=pow(a,b);
		System.out.println(m); */
	}
	static int pow(int a,int b){
		int c=1;
		for (int d=b;d>0;d--){
			c=c*a;
			}
		return c;
		
	}

}
