import java.util.Scanner;
public class Dibujo {

	public static void main(String[] args) {
		int l;
		System.out.println("ingrese un numero");
		Scanner s= new Scanner(System.in);
		l= s.nextInt();
		for(int i=0;i<l;i++){
			System.out.println();
			for(int j=0;j<l;++j){
				if((i==0)||(i==l-1)||(j==0)||(j==l-1)){
				System.out.print("* ");
			}
			else
				System.out.print("  ");
			}
		}
	}

}
