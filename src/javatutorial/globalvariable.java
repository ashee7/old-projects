package javatutorial;

import java.util.Scanner;

public class globalvariable {  
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String[] a= new String[3];
	a=s.nextLine().split(" ");
	for(int i=0;i<3;i++)
		System.out.print(a[i]+" ");
	s.close();
	}
}