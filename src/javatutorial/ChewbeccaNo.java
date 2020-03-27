package javatutorial;

import java.util.Scanner;

public class ChewbeccaNo {
	public static long chewbeccNo(long no){
		long m=0,o=1,n=0;;
		while(no>9){
			m=no%10;
			no=no/10;
			if(m<5){
			}
			else{
				m=9-m;
			}
			n=n+o*m;
			o=10*o;
		}
		if(no<5 || no==9){
		}
		else
			no=9-no;
		n=n+o*no;
		return n;
	}

	public static void main(String[] args) {
		long no;
		Scanner scn =new Scanner(System.in);
		System.out.println("enter a no.");
		no = scn.nextLong();
		
		System.out.println(chewbeccNo(no));
		scn.close();
	}

}
