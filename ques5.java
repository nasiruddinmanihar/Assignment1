package Nasir;

public class ques5 {
	
	public static void main(String[] args){
		int n=10;
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) {
				if(i==0||j==(n-1)/2 || i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();		
												
		}
		
		System.out.println();
		{
		
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) {
				if(j==0||j==n-1||i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		}
		System.out.println();
		{
			
			for(int i=0;i<n;i++) 
			{
				for(int j=0;j<n;j++) {
					if(j==0||i==0||i==n-1||i==(n-1)/2) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
		}
		
		System.out.println();
		
		{
			
			for(int i=0;i<n;i++) 
			{
				for(int j=0;j<n;j++) {
					if(j==1&&i!=n-1||i==n-1&&j>2&&j<8||j==9&&i!=n-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
		}
		
		System.out.println();
		
		{
			
			for(int i=0;i<n;i++) 
			{
				for(int j=0;j<n;j++) {
					if(j==0||i==0&&j>=0&&j<5 || j==5 && i>0&&i<5 || i==5&&j>=0&&j<5||i-j==5) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
		System.out.println();
		
		
		{
			for(int i=0;i<n;i++) 
			{
				for(int j=0;j<n;j++) {
					if(j==1&&i!=0&&i!=n-1||j==9 && i!=0 && i!=n-1||i==0&&j>2&&j<8 || i==n-1&&j>2&&j<8 ) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		System.out.println();
		{
		
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) {
				if(j==0||j==n-1||i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		}
		
		
		
					
	}
	
	
}


