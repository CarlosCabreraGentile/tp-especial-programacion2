
public abstract class TipoDeJuego {
	Jugador j1;
	Jugador j2;
	Mazo m1;
	public TipoDeJuego(Jugador j1,Jugador j2,Mazo m1) {
		this.j1=j1;
		this.j2=j2;
		this.m1=m1;
		
	}
	public abstract void jugar();
	/**
	 * Esta funcion reparte el mazo para los
	 * jugadores, si el mazo es impar se guarda la ultima carta en un aux y se elimina del mazo,
	 * luego se reparte normalmente y al final se agrega la carta que se guardo en aux al mazo
	 */
	
	public void repartirMazo() {
		if (m1.tamañoMazo() % 2 != 0) {
			m1.mazo.remove(m1.tamañoMazo() - 1);
		}
		for (int i = 0; i < m1.tamañoMazo(); i++) {
			if ((i == 0) || (i % 2 == 0)) {
				this.j1.add(this.m1.mazo.get(i));
			} else {
				this.j2.add(this.m1.mazo.get(i));
			}
		}
	}
	/**
	 * @param c1
	 * @param c2
	 * @param opcion
	 * Esta funcion compara el valor de las cartas y procesa el resultado
	 */
	public void procesar(Carta c1, Carta c2, String opcion) {
		Jugador aux;
		if (c1.getValor(opcion) == c2.getValor(opcion)) {
			this.j1.mazo.add(c1);
			this.j2.mazo.add(c2);
			System.out.println("Empate ");
			System.out.println("");
		} else if (c1.getValor(opcion) < c2.getValor(opcion)) {
			this.j2.mazo.add(c1);
			this.j2.mazo.add(c2);
			aux=j1;
			j1=j2;
			j2=aux;
			System.out.println("Ganador de la ronda: "+j1.getNombre());
			System.out.println("");
		} else if (c1.getValor(opcion) > c2.getValor(opcion)) {
			this.j1.mazo.add(c1);
			this.j1.mazo.add(c2);
			System.out.println("Ganador de la ronda: "+j1.getNombre());
			System.out.println("");
		}

	}
}
