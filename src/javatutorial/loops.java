package javatutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class loops { 
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		String[] input = new String[n]; 
		int[] a=new int[n];

		//System.out.print("Please enter two integers: "); 
		try {
			input = in.readLine().split(" ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(input[i]);
			System.out.print(a[i]+" ");
		}
		//a = Integer.parseInt(input[0]); 
		//b = Integer.parseInt(input[1]); 

		//System.out.println("You input: " + a + " and " + b); 
		
		scn.close();
	}

/*	BufferedReader in = new BufferedReader( 
new InputStreamReader( 
System.in)); 

String[] input = new String[2]; 
int a; 
int b; 

System.out.print("Please enter two integers: "); 
input = in.readLine().split(" "); 

a = Integer.parseInt(input[0]); 
b = Integer.parseInt(input[1]); 

System.out.println("You input: " + a + " and " + b); */
}