import java.util.Scanner;
public class contraseña {

	public static void main(String[] args) {
		String palabra;
		System.out.println("ingrese una cadena de texto");
		Scanner s= new Scanner(System.in);
		palabra= s.nextLine();
		for(int i=0;i<palabra.length();i++){
			System.out.print("*");
		}
			System.out.println(" ");
			System.out.println(palabra);
	}

}
