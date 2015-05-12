import java.util.Scanner;
public class piramide_num {
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("ingrese el tamaño de la piramide");
		num= s.nextInt();
			for(int i=num;i>0;i--){
				for(int j =i; j<num;j++)
					System.out.print(" ");
				for(int k = i; k>0;k--)
					System.out.print((num+1-(i))+" ");
				System.out.println();
}
	}

}
			
	

