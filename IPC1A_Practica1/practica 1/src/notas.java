import java.util.Scanner;
public class notas {
	public static void main(String[] args) {
		int num1,num2,num3,num4,num5,num6,num7 =0;
		System.out.println("ingrese 6 notas");
		Scanner s= new Scanner(System.in);
		num1= s.nextInt();
		num2= s.nextInt();
		num3= s.nextInt();
		num4= s.nextInt();
		num5= s.nextInt();
		num6= s.nextInt();
		num7= (num1+num2+num3+num4+num5+num6)/6;
		if (num7<59)
			System.out.println("La nota es E "+num7);
			else if (num7<69)
				System.out.println("La nota es D "+num7);
			else if (num7<79)
				System.out.println("La nota es c "+num7);
			else if(num7<89)
				System.out.println("La nota es B "+num7);
			else
				System.out.println("La nota es A "+num7);
	}

}
