
public class BusquedaMenor extends MecanismoBusqueda{
	String nombre;
	double valor;
	public BusquedaMenor(String nombre,double valor) {
		this.nombre=nombre;
		this.valor=valor;
	}
	public boolean cumple(Carta c1) {	
		
		if (c1.tengoEstaKey(nombre)) {
			return (c1.getValor(nombre)<valor);
		}
		return false;		
	}

}
