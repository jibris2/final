import java.util.Scanner;
public class fechas {
	public static void main(String[] args) {
		int dia;
		int mes;
		int año;
		int dia1;
		int mes1;
		int año1;
		Scanner s = new Scanner( System.in);
		System.out.println("ingrese un dia");
		dia=s.nextInt();
		System.out.println("ingrese un mes");
		mes=s.nextInt();
		System.out.println("ingrese un año");
		año=s.nextInt();
		System.out.println("ingrese otro dia");
		dia1=s.nextInt();
		System.out.println("ingrese otro mes");
		mes1=s.nextInt();
		System.out.println("ingrese otro año");
		año1=s.nextInt();
		if(año>año1){
			if(mes>mes1){
				if(dia>dia1){
					System.out.println("la diferencia de dias es de "+((año-año1)*360+(mes-mes1)*60+(dia-dia1)));	
				}
				else{
					System.out.println("la diferencia de dias es de "+((año-año1)*360+(mes-mes1)*60+(dia1-dia)));
				}			
			}
			else if(mes1>mes){
				if(dia>dia1){
					System.out.println("la diferencia de dias es de "+((año-año1)*360+(mes1-mes)*60+(dia-dia1)));	
				}
				else{
					System.out.println("la diferencia de dias es de "+((año-año1)*360+(mes1-mes)*60+(dia1-dia)));
				}
			}		
				}
		else if (año1>año){
			if(mes>mes1){
				if(dia>dia1){
					System.out.println("la diferencia de dias es de "+((año1-año)*360+(mes-mes1)*60+(dia-dia1)));	
				}
				System.out.println("la diferencia de dias es de "+((año1-año)*360+(mes-mes1)*60+(dia1-dia)));	
			}
			else if(mes1>mes){
				if(dia>dia1){
					System.out.println("la diferencia de dias es de "+((año1-año)*360+(mes1-mes)*60+(dia-dia1)));	
				}
				else{
					System.out.println("la diferencia de dias es de "+((año1-año)*360+(mes1-mes)*60+(dia1-dia)));
				}
			}
					
				}
		}
			
		}
			
	


