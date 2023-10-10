package edact4;

public class edact {

		    public static void main(String[] args) {
		       Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Introdueix el primer nombre: ");
		        double nombre1 = scanner.nextDouble();
		        
		        System.out.print("Introdueix el segon nombre: ");
		        double nombre2 = scanner.nextDouble();
		        
		        double producte = nombre1 * nombre2;
		        
		        
		        System.out.println("El producte de " + nombre1 + " i " + nombre2 + " és " + producte);
		        
		       
		        scanner.close();
		    }
		}





