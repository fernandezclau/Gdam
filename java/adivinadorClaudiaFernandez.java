package ejercicio;
import java.util.Scanner;
public class adivinadorClaudiaFernandez {
	Scanner inputScaner = new Scanner (System.in);
	//------------------------------------------------------------
		public static void main(String[] args) 
		{
				// TODO Auto-generated method stub
			adivinadorClaudiaFernandez test = new adivinadorClaudiaFernandez(); //Cambiar
			test.adivinadorr(); //Cambiar
		}//Main
		
	//---------------------------------------------------------	
	void adivinadorr () {
		int min= 1;
		int max= 100;
	    int propuesto;
	    boolean empezado = true;
	    int cont = 0;
	    
		System.out.println ("Piense en un número del " + min  + " al " +  max);
		
		
		
		while (empezado == true) {
			if(min>max) {
				System.out.println ("Estas haciendo trampas.");
				 return;
			}
			cont++;
		propuesto = (max+min)/2;  	
			System.out.println ("Indique si es mayor menor o es el número en el que ha pensado.");
			System.out.println (" ");
			System.out.println("Es el número en el que usted ha pensado " + propuesto);
			String respuesta = inputScaner.nextLine();
			
			
		switch (respuesta) {
		
			case "menor":
			case "Menor":
				
				 if(min == max) {
					 System.out.println ("Estas haciendo trampas");
					 return;
				 }
				max = propuesto - 1;
				break;
				
			case "mayor":
			case "Mayor":
				
				 if(min == max) {
					 System.out.println ("Estas haciendo trampas.");
					 return;
				 }
				 
					min = propuesto + 1;
					break;
			case "Igual":
			case "igual":
				
				System.out.println("Lo he logrado!!");
				
				
				empezado = false;
				break;
		}
		

		} System.out.println("Lo he conseguido en tan solo " + cont + " intentos. Soy un máquina jeje.");
	}

}
	

