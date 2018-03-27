import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Carta {
	HashMap<String, Double> atributosDinamicos; 

	public Carta(){
		atributosDinamicos = new HashMap<String, Double>();
	}
	
	public void add(String clave, Double valor) {
		atributosDinamicos.put(clave, valor);
	} 
	 
	public String mostrarAtributos() {
		String mostrar = "";
		Iterator<String> it = atributosDinamicos.keySet().iterator();
		while(it.hasNext()){
		  String clave = it.next();
		  	mostrar += "Atributo: " + clave + "\n";
		}
		return mostrar;
	}
	
	/**
	 * @param c
	 * @return
	 * Esta funcion compara los atributos de la carta actual con
	 * la carta que viene por parametro
	 */
	public boolean mismaCantAtributosEIguales(Carta c) { 
		boolean resultado = false;
		int contador=0;
		if (this.nroDeAtributos() == c.nroDeAtributos()) {
			Iterator<String> it = atributosDinamicos.keySet().iterator();
			Iterator<String> it2 = c.atributosDinamicos.keySet().iterator();
			while(it.hasNext() && it2.hasNext()){
				String clave = it.next();
				String claveCartaParametro = it2.next();
				if (clave.equals(claveCartaParametro)) {
					contador ++;
				}
			}//CIERRA WHILE
			if (this.nroDeAtributos() == contador) {
				resultado = true;
			} 
		}
		return resultado;		 
	}
	
	public int nroDeAtributos(){
		return atributosDinamicos.size();
	}
	/**
	 * Esta funcion devuelve el valor del hashmap 
	 * pasando la clave por parametro
	 */
	public Double getValor(String val) {
		return atributosDinamicos.get(val);
	}
	public Set<String> getNombreDeAtributos(){
		Set<String>retorno=this.atributosDinamicos.keySet();
		return retorno;
	}
	public boolean tengoEstaKey(String Key) {
		return this.atributosDinamicos.containsKey(Key);
	}

}
