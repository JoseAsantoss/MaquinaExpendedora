import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	private static Scanner sc;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		ArrayList<Bebida> beb = new ArrayList<Bebida>();
		
		char op;
		
		do {
			
			op = mostrarMenu();
			
			switch(op) {
				case '1':
					beb.add(new Bebida("Coca Cola", 1.30F));
					System.out.println("Su Coca Cola gracias");
					break;
				case '2':
					beb.add(new Bebida("Fanta Naranja", 1.20F));
					System.out.println("Su Fanta Naranja gracias");
					break;
				case '3':
					beb.add(new Bebida("Fanta Limón", 1.20F));
					System.out.println("Su Fanta Limón gracias");
					break;
				case '4':
					beb.add(new Bebida("Agua", 1.00F));
					System.out.println("Su Agua gracias");
					break;
				case '5':
					System.out.println("Gracias por usar el servicio");
					System.out.println("INFORME DE VENTAS");
					informeVentas(beb);
					sc.close();
					break;
				default:
					System.out.println("Opción incorrecta");
			}
		}while(op != '5');
		

	}
	
	public static char mostrarMenu() {
		String opcion;
		
			System.out.println("MÁQUINA DE BEBIDAS");
			System.out.println("***************************");
			System.out.println("1. Coca Cola ------ 1.30 €;");
			System.out.println("2. Fanta Naranja -- 1.30 €;");
			System.out.println("3. Fanta Limón ---- 1.30 €;");
			System.out.println("4. Agua ----------- 1.30 €;");
			System.out.println("5. Apagar máquina;");
			System.out.println("***************************");
			System.out.println("¿Qué opción elige?");
		
		opcion = sc.nextLine();
				
		return opcion.charAt(0);
	}
	
	public static void informeVentas(ArrayList<Bebida> bebida) {
		float acum = 0.00F;
		for(Bebida drink: bebida) {
			System.out.println(drink.toString());
			acum = acum + drink.getPrecio();
		}
		
		
		System.out.println("RECAUDACIÓN: " + acum);
	}
	
}

	
