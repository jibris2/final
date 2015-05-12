import java.util.Scanner;
public class multi {
	public static void main(String[] args) {
		int num;
		System.out.println("ingrese un numero del 1 al 10 para saber su tabla de multiplicar");
		Scanner s = new Scanner(System.in);
		num= s.nextInt();
		for(int i =10;i>0;i--){
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}

}
