import java.util.Scanner;
import java.util.Random;
public class ramdom {
	public static void main(String[] args) {
		String unidades[] =   
	        {"cero", "uno", "dos" ,"tres" ,"cuatro" ,"cinco" ,  
	            "seis" ,"siete" ,"ocho" ,"nueve","diez"};  
	        String especiales[] =   
	        {"once", "doce","trece","catorce", "quince",   
	            "diezciseis", "diecisiete", "dieciocho", "diecinueve"};  
	        String decenas[] =   
	        {"veinte", "treinta","cuarenta","cincuenta", "sesenta",  
	            "setenta", "ochenta", "noventa"}; 
		int num1;
		int num2;
		int num3;
		System.out.println("ingrese un numeros entre 0 y 100");
		Scanner s= new Scanner(System.in);
		num1= s.nextInt();
		System.out.println("ingrese otro numeros entre el anterior y 100");
		num2= s.nextInt();
		num3= (int)(Math.random()*(num2-num1))+num1;		
		 if(num3>=0 && num3<11)  
             System.out.println(unidades[num3]);           
        else if(num3<20)  
            System.out.println(especiales[num3-11]); 	         
         else if(num3<100){  
            int unid = num3 % 10;  
            int dec = num3/10;  
            if(unid == 0)  
                System.out.println(decenas[dec-2]);                  
            else  
                System.out.println(decenas[dec-2]  + " y " + unidades[unid]);  
        }    	
	
	}
}

