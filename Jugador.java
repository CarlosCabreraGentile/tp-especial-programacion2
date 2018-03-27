import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Set;

public class Jugador {
	String nombre;
	ArrayList<Carta>mazo;
	public Jugador(String name){
		nombre=name;
		mazo=new ArrayList<Carta>();		
	}
	public String getNombre() {
		return nombre;
	}
	
	public void add(Carta c){
		mazo.add(c);
	}
	public void remove(){
		mazo.remove(0);
	}
	public Carta getPrimeraCarta(){
		return mazo.get(0);
	}
	/**
	 * @param n
	 * @return
	 * Esta funcion pide por teclado una opcion valida al
	 * jugador para jugar, y retorna ese valor
	 */
	public String selectAtributo(Set<String> n) {
			String valori="" ;
			boolean control = false;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			do {
				try {
					System.out.println("Ingrese Una de las Opciones mencionadas: ");
					valori = entrada.readLine();
					System.out.println("Atributo Ingresado: " + valori);
					if (n.contains(valori)) {
						control = true;
					}
					else {
						System.out.println("Opcion Invalida");
					}

				} catch (NumberFormatException e) {
					System.out.println("Invalid number");
					control = false;
				} catch (Exception exc) {
					System.out.println("Opcion Invalida");
					control = false;
				}
			} while ((!control));
			return valori;
	}
}
