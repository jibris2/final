public class asteriscos {
	public static void main(String[] args) {
		for(int i=1;i<9; i= i+2){
			for(int j = 9-i; j>0;j--)
				System.out.print(" ");
			for(int k = i; k>0;k--)
				System.out.print("* ");
			System.out.println();
		}
		for(int i=9;i>0; i= i-2){
			for(int j =9-i; j>0;j--)
				System.out.print(" ");
			for(int k = i; k>0;k--)
				System.out.print("* ");
			System.out.println();
		}
		
	}

}
