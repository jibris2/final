import java.util.Scanner;
public class fechas {
	public static void main(String[] args) {
		int dia;
		int mes;
		int a�o;
		int dia1;
		int mes1;
		int a�o1;
		Scanner s = new Scanner( System.in);
		System.out.println("ingrese un dia");
		dia=s.nextInt();
		System.out.println("ingrese un mes");
		mes=s.nextInt();
		System.out.println("ingrese un a�o");
		a�o=s.nextInt();
		System.out.println("ingrese otro dia");
		dia1=s.nextInt();
		System.out.println("ingrese otro mes");
		mes1=s.nextInt();
		System.out.println("ingrese otro a�o");
		a�o1=s.nextInt();
		if(a�o>a�o1){
			if(mes>mes1){
				if(dia>dia1){
					System.out.println("la diferencia de dias es de "+((a�o-a�o1)*360+(mes-mes1)*60+(dia-dia1)));	
				}
				else{
					System.out.println("la diferencia de dias es de "+((a�o-a�o1)*360+(mes-mes1)*60+(dia1-dia)));
				}			
			}
			else if(mes1>mes){
				if(dia>dia1){
					System.out.println("la diferencia de dias es de "+((a�o-a�o1)*360+(mes1-mes)*60+(dia-dia1)));	
				}
				else{
					System.out.println("la diferencia de dias es de "+((a�o-a�o1)*360+(mes1-mes)*60+(dia1-dia)));
				}
			}		
				}
		else if (a�o1>a�o){
			if(mes>mes1){
				if(dia>dia1){
					System.out.println("la diferencia de dias es de "+((a�o1-a�o)*360+(mes-mes1)*60+(dia-dia1)));	
				}
				System.out.println("la diferencia de dias es de "+((a�o1-a�o)*360+(mes-mes1)*60+(dia1-dia)));	
			}
			else if(mes1>mes){
				if(dia>dia1){
					System.out.println("la diferencia de dias es de "+((a�o1-a�o)*360+(mes1-mes)*60+(dia-dia1)));	
				}
				else{
					System.out.println("la diferencia de dias es de "+((a�o1-a�o)*360+(mes1-mes)*60+(dia1-dia)));
				}
			}
					
				}
		}
			
		}
			
	


