
public class JuegoDeCartasPorTurnos extends TipoDeJuego{
	int rondas;
	public JuegoDeCartasPorTurnos(int rondas,Jugador j1, Jugador j2,Mazo m1) {
		super(j1, j2, m1);
		this.rondas=rondas;
	}
	@Override
	/**
	 * Esta funcion llama a  los metodos que intervienen en el juego
	 * para q este se pueda llevar a cabo.
	 */
	public void jugar() {
		int contador=0;
		boolean exit=false; 
		System.out.println(this.m1.getPrimerCarta().mostrarAtributos());
		this.repartirMazo();
		while ((this.rondas>contador)&&(!exit)) {
			if((this.j1.mazo.size() == 0) || (this.j2.mazo.size() == 0)) {
				exit=true;
			}else {
				String opcion= this.j1.selectAtributo(this.m1.getPrimerCarta().getNombreDeAtributos());
				Carta aux1 = this.j1.getPrimeraCarta();
				Carta aux2 = this.j2.getPrimeraCarta();
				this.j1.remove();
				this.j2.remove();
				this.procesar(aux1, aux2, opcion);
				contador++;
			}
		}
		System.out.println("Enhorabuena ha ganado: " + this.j1.getNombre());
	}
	
}
