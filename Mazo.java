import java.util.ArrayList;

public class Mazo {
	ArrayList<Carta>mazo;
	
	public Mazo(){
		mazo=new ArrayList<Carta>();
	}
	public void addCarta(Carta c){
		if(mazo.size()==0){
			mazo.add(c);  
			}
		else if (mazo.get(0).mismaCantAtributosEIguales(c)){
			mazo.add(c);
		}else{
			System.out.println("Las cartas no son iguales");
		}		
	}
	
	public Carta getPrimerCarta(){
		return mazo.get(0);
	}

	public int tamañoMazo(){
		return mazo.size();
	}
}
