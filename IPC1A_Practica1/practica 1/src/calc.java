import java.util.Scanner;
public class calc {
	public static void main(String[] args) {
		int a;
		int b;
		String opcion;
		Scanner s= new Scanner(System.in);
		Scanner z= new Scanner(System.in);
		System.out.println("ingrese el primer numero");
		a= s.nextInt();
		System.out.println("ingrese el segundo numero");
		b= s.nextInt();
		System.out.println("ingrese una opcion (s)para sumar, (r)para restar, (m)para multiplicar y (d) para dividir ");
		opcion= z.nextLine();
		if (opcion.equals("s")){
			System.out.println("la suma es de "+ (a+b));
		}
		if (opcion.equals("r")){
			System.out.println("la resta es de "+ (a-b));
		}
		if (opcion.equals("m")){
			System.out.println("la multiplicacion es de "+ (a*b));
		}
		if (opcion.equals("d")){
			System.out.println("la divicion es de "+ (a/b));
		}
	}

}
