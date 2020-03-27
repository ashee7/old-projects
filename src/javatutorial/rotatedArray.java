package javatutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class rotatedArray {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scn=new Scanner(System.in);
		//int k=scn.nextInt();
		//int n=k;
		createArray(scn.nextInt());
		
		scn.close();
	}
	
	static void createArray(int n)throws IOException {//array created and rotated
		InputStreamReader r=new InputStreamReader(System.in);    
		BufferedReader in = new BufferedReader(r);
				
		Scanner scn=new Scanner(System.in);
		int[][] k=new int[n][n];
		String[] input = new String[n]; 
		
			for(int j=0;j<n;j++){
					input = in.readLine().split(" ");
					for(int i=0;i<n;i++)
						k[j][i]=Integer.parseInt(input[i]);
			}
		
		
			//rotation takes place here
			for(int j=(n-1);j>=0;j--){
				for(int i=0;i<n;i++){
					System.out.print(k[i][j]+" ");
				}
				System.out.print("\n");
			}
		
		
		scn.close();
	}

}






/*


Scanner scn=new Scanner(System.in);
int n=4;//scn.nextInt();

createArray(n);

scn.close();
}

static void createArray(int n)throws IOException {//array created and rotated
InputStreamReader r=new InputStreamReader(System.in);    
BufferedReader in = new BufferedReader(r); 
Scanner scn=new Scanner(System.in);
int[][] k=new int[n][n];
String[] input = new String[n]; 

	for(int j=0;j<n;j++){
			input = in.readLine().split(" ");
			for(int i=0;i<n;i++)
				k[j][i]=Integer.parseInt(input[j]);
	}


	//rotation takes place here
	for(int j=(n-1);j>=0;j--){
		for(int i=0;i<n;i++){
			System.out.print(k[i][j]+" ");
		}
		System.out.print("\n");
	}


scn.close();*/
