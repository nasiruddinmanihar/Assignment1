package Nasir;

public class ques3 {
	public static void main(String[] args){
		int n=15;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i-j>=5|| i+j>=19) {
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
