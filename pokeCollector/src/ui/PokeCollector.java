package ui;

import java.util.Scanner;
import model.Collection;
import model.User;



public class PokeCollector {
	private Collection myCollection;
	private Scanner sc; 
	
	
	public PokeCollector() {
		sc= new Scanner(System.in);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PokeCollector pc= new PokeCollector();
		
	
		System.out.println("Iniciando la aplicación");
		
		int option=0;
		
		do{
			
			option= pc.showMenu();
			pc.executeOperation(option);
			
		}while (option!=0);
		
	}
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Menú principal, seleccione una opción\n" +
				"(1) Para crear una colección \n" +
				"(2) Para crear, editar o eliminar un álbum \n" +
				"(3) Para mostrar la información de los albums en la colección \n"+
				"(4) Para agregar un pokemon un álbum\n"+
				"(0) Para salir"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			createCollection() ;
			break;
		case 2:
			showMenuAlbum() ;
			break;
		case 3:
			System.out.println(myCollection.showAlbums());
			break;
	
		case 4:
			addPokeInAlbum();
			break;
		
		default:
			System.out.println("Error, opción no válida");
		
		}
	}

	private void createCollection(){
		System.out.println("Ingrese los datos de una colección");
		String nom;
		int day, month, year;


		System.out.println("nombre completo usuario principal");
		nom= sc.nextLine();
		System.out.println("\nnombre de usuario principal");
		String nomUsuario= sc.nextLine();
		System.out.println("\nEdad: ");
		int edad= sc.nextInt();
		

		System.out.println("\nAre there other owners to this collection? \n(1) Yes \n(2) No");
		int entry1 = sc.nextInt();
		sc.nextLine();
		int entry = -1;
		if (entry1 == 1){
			for(int i= 0; i < 2; i++){
				System.out.println("Otro usuario" + (i+1));
				
				System.out.println("nombre completo: ");
				String nom1= sc.nextLine();
				System.out.println("\nnombre de usuario: ");
				String nomUsuario1= sc.nextLine();
				System.out.println("Edad: ");
				int edad1= sc.nextInt();
				myCollection.addUser(nom1, nomUsuario1, edad1);
				System.out.println("Desea ingresar mas usuarios? El maximo son tres incluyendo el principal. (1) Yes \\n (2) No ");
				entry = sc.nextInt(); 
				switch (entry) {
					case 2:
						i = 10;
						break;
				
					default:
						break;
				}
			}
		}

		System.out.println("fecha");
		

		System.out.println("dia");
		day= sc.nextInt();
		sc.nextLine();

		System.out.println("mes");
		month= sc.nextInt();
		sc.nextLine();

		System.out.println("año");
		year= sc.nextInt();
		sc.nextLine();


		//myCollection = new Collection(nom, new Date(day, month, year));

		myCollection = new Collection(nom,nomUsuario, edad, day, month, year);

		System.out.println("La Colección  "+ nom + " fue creada");
		
	}



	private void addPokeInAlbum() {
		
		
	}

	private void showMenuAlbum() {
		int option=0;
		System.out.println(
				"Menú Album\n" +
				"(1) Para crear un álbum\n" +
				"(2) Para editar un álbum\n"+
				"(3) Para eliminar un álbum\n"+
				"(0) Para volver"
				);
		option= sc.nextInt();
		sc.nextLine();
		
		switch(option) {
		case 1:
			createAlbum();
			break;
		case 2:
			editAlbum();
			break;
		case 3: 
			deleteAlbum();
			break;
		
		}
		
	}
	private void deleteAlbum() {
		
	}
	private void editAlbum() {
		
	}
	private void createAlbum() {

		if(myCollection.hasAlbums()) {

			System.out.println("Digite los datos del album a crear ");


			System.out.println("Nombre de la región del album:");
			String nom= sc.nextLine();

		
			System.out.println("Cantidad de pokemones de la región");
			int num = sc.nextInt();
			sc.nextLine();
			

			myCollection.addAlbum(nom, num);

			System.out.println("El album \""+ nom +"\" ha sido creado con éxito\n");

			
		}else {
			System.out.println("No puede crearse el álbum porque se llegó al límite\n");
		}
		
	}
}
	

	
	
	


