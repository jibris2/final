import java.util.Scanner;
public class Areas {
	public static void main(String[] args) {
		String opcion;
		System.out.println("ingrese una opcion para calcular (letras en mayuscula) ");
		System.out.println("C para un circulo");
		System.out.println("U para un cuadrado");
		System.out.println("T para un triangulo equilatero");
		Scanner s = new Scanner( System.in);
		opcion= s.nextLine();
		if(opcion.equals("C")) {
			System.out.println("ingrese el radio");
			int radio;
			radio= s.nextInt();
			System.out.println("el perimetro es "+(radio*6.2816));
			System.out.println("el area es "+((radio*radio)*3.1416));
		}
		if(opcion.equals("U")) {
			System.out.println("ingrese un lado");
			int lado;
			lado= s.nextInt();
			System.out.println("el perimetro es "+(lado*4));
			System.out.println("el area es "+((lado*lado)));
		}
		
			if(opcion.equals("T")) {
				System.out.println("ingrese el lado");
				int l;
				l= s.nextInt();
				System.out.println("ingrese la altura");
				int altura;
				altura= s.nextInt();
				System.out.println("ingrese la base");
				int base;
					base= s.nextInt();
					System.out.println("el perimetro es "+(l*3));
					System.out.println("el area es "+((altura*base)/2));
			}
			
	}

}
