
public class BusquedaOr extends MecanismoBusqueda{
	MecanismoBusqueda m1;
	MecanismoBusqueda m2;
	public BusquedaOr(MecanismoBusqueda m1,MecanismoBusqueda m2) {
		this.m1=m1;
		this.m2=m2;
	}
	@Override
	public boolean cumple(Carta c1) {
		return ((m1.cumple(c1)) || (m2.cumple(c1)));
	}

}