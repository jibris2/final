import java.util.Scanner;
public class hora {
	public static void main(String[] args) {
		String hora;
		int hor;
		int min;
		System.out.println("ingrese una hora con este formato 00:00");
		Scanner s = new Scanner( System.in);
		hora = s.nextLine();
		if (hora.length()==5){
			hor= Integer.parseInt(hora.substring(0,hora.indexOf(":")));
			 min= Integer.parseInt(hora.substring(3,5));
		if(hor>12){
			if(min<60){
				hor= hor-12;
				System.out.println("la hora es "+hor+(":")+min+(" PM"));	
			}
			else if (min==60){
				hor=hor-11;
				System.out.println("la hora es "+hor+(":")+("00")+(" PM"));
			}				
		}
		else if(hor>0){
			System.out.println("la hora es "+hor+(":")+min+(" AM"));
			if (min==60){
				 hor=hor+1;
					System.out.println("la hora es "+hor+(":")+("00")+(" AM"));
		}
		 
		 }
		}
		else 
			System.out.println("ingrese una hora con este formato: 00:00");
		}
		
	}	

	