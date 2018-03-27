import java.util.ArrayList;

/**
 * Creamos la clase organizador q va a tener los mazos 
 * y los mecanismos de busqueda.
 * A su vez se puede setear el tipo de juego q el organizador decida.
 */
public class Organizador {
	ArrayList<Mazo>mazos;
	TipoDeJuego game;
	MecanismoBusqueda mecanismo;
 
	public Organizador(TipoDeJuego game,MecanismoBusqueda mecanismo) {
		this.game=game;
		mazos = new ArrayList<Mazo>();
		this.mecanismo=mecanismo;
	}

	public static void main(String[] args) {
		/*CARTA 1*/
		Carta c1 = new Carta();
		c1.add("Fuerza", 50.0);
		c1.add("Velocidad", 10.0);
		c1.add("Peso", 20.0);
		
		/* CARTA 2 */
		Carta c2 = new Carta();
		c2.add("Fuerza", 60.0);
		c2.add("Velocidad", 9.0);
		c2.add("Peso", 19.0);
		
		/*CARTA 2*/
		Carta c3 = new Carta();
		c3.add("Fuerza", 30.0);
		c3.add("Velocidad", 60.0);
		c3.add("Peso", 41.0);
		
		/*CARTA 4*/
		Carta c4 = new Carta();
		c4.add("Fuerza", 45.0);
		c4.add("Velocidad", 22.0);
		c4.add("Peso", 1.0);
		
		/*CARTA 5*/
		Carta c5 = new Carta();
		c5.add("Fuerza", 2.0);
		c5.add("Velocidad", 2.0);
		c5.add("Peso", 2.0);
//		c5.add("Peleas", 1.0);
		
		Mazo m1 = new Mazo(); 
		m1.addCarta(c1);
		m1.addCarta(c2);
		m1.addCarta(c3);
		m1.addCarta(c4);
		m1.addCarta(c5);
/********************************FIN MAZO 1***********************************************************/		
		/*CARTA 1b*/
		Carta c1b = new Carta();
		c1b.add("Fuerza", 5.0);
//		c1b.add("Velocidad", 10.0);
//		c1b.add("Peso", 20.0);
		
		/* CARTA 2b */
		Carta c2b = new Carta();
		c2b.add("Fuerza", 6.0);
//		c2b.add("Velocidad", 9.0);
//		c2b.add("Peso", 19.0);
		
		/*CARTA 3b*/
		Carta c3b = new Carta();
		c3b.add("Fuerza", 16.0);
//		c3b.add("Velocidad", 11.0);
//		c3b.add("Peso", 21.0);
		
		/*CARTA 4b*/
		Carta c4b = new Carta();
		c4b.add("Fuerza", 30.0);
//		c4b.add("Velocidad", 1.0);
//		c4b.add("Peso", 1.0);
//		c4b.add("Peleas", 1.0);
		
		Mazo m2 = new Mazo(); 
		m2.addCarta(c1b);
		m2.addCarta(c2b);
		m2.addCarta(c3b);
		m2.addCarta(c4b);		
		
/********************************FIN MAZO 2***********************************************************/	
		/*CARTA 1c*/
		Carta c1c = new Carta();
		c1c.add("Fuerza", 5.0);
		c1c.add("Velocidad", 10.0);
//		c1c.add("Peso", 20.0);
		
		/* CARTA 2c */
		Carta c2c = new Carta();
		c2c.add("Fuerza", 6.0);
		c2c.add("Velocidad", 4.0);
//		c2c.add("Peso", 19.0);
		
		/*CARTA 3bc*/
		Carta c3c = new Carta();
		c3c.add("Fuerza", 22.0);
		c3c.add("Velocidad", 11.0);
//		c3c.add("Peso", 21.0);
		
		/*CARTA 4c*/
		Carta c4c = new Carta();
		c4c.add("Fuerza", 40.0);
		c4c.add("Velocidad", 30.0);
//		c4c.add("Peso", 1.0);
//		c4c.add("Peleas", 1.0);
		
		Mazo m3 = new Mazo(); 
		m3.addCarta(c1c);
		m3.addCarta(c2c);
		m3.addCarta(c3c);
		m3.addCarta(c4c);		
		
/********************************FIN MAZO 3***********************************************************/	
		/*CARTA 1d*/
		Carta c1d = new Carta();
		c1d.add("Fuerza", 5.0);
		c1d.add("Velocidad", 10.0);
		c1d.add("Peso", 20.0);
		c1d.add("Peleas", 2.0);
		
		/* CARTA 2d */
		Carta c2d = new Carta();
		c2d.add("Fuerza", 6.0);
		c2d.add("Velocidad", 9.0);
		c2d.add("Peso", 19.0);
		c2d.add("Peleas", 4.0);
		
		/*CARTA 3d*/
		Carta c3d = new Carta();
		c3d.add("Fuerza", 20.0);
		c3d.add("Velocidad", 11.0);
		c3d.add("Peso", 21.0);
		c3d.add("Peleas", 10.0);
		
		/*CARTA 4d*/
		Carta c4d = new Carta();
		c4d.add("Fuerza", 18.0);
		c4d.add("Velocidad", 1.0);
		c4d.add("Peso", 1.0);
		c4d.add("Peleas", 1.0);
		
		/*CARTA 5d*/
		Carta c5d = new Carta();
		c5d.add("Fuerza", 22.0);
		c5d.add("Velocidad", 9.0);
		c5d.add("Peso", 34.0);
		c5d.add("Peleas", 70.0);
		
		Mazo m4 = new Mazo(); 
		m4.addCarta(c1d);
		m4.addCarta(c2d);
		m4.addCarta(c3d);
		m4.addCarta(c4d);
		m4.addCarta(c5d);
		
/********************************FIN MAZO 4***********************************************************/	
		
		
		Jugador j1 = new Jugador("Masi");
		Jugador j2 = new Jugador("Charly"); 
				 
		TipoDeJuego juego = new JuegoDeCartasNormal(j1, j2, m1);  
		TipoDeJuego juego2 = new JuegoDeCartasPorTurnos(5,j1, j2, m1);
		MecanismoBusqueda mb1 = new BusquedaMayor("Fuerza", 10.0);
		MecanismoBusqueda mb2 = new BusquedaIgual("Velocidad", 9.0);
		MecanismoBusqueda mb3 = new BusquedaOr(mb1, mb2); 
		Organizador o1 = new Organizador(juego, mb3);
		o1.addMazo(m1);
		o1.addMazo(m2);
		o1.addMazo(m3);
		o1.addMazo(m4);
		
//		System.out.println(o1.busqueda());
		o1.setTipoDeJuego(juego2);
		o1.jugar();
		
	}
	
	public void jugar() { 
		this.game.jugar();
	}
	
	public void setTipoDeJuego(TipoDeJuego t1) {
		this.game=t1;
	}
	
	public void setMecanismoBusqueda(MecanismoBusqueda t1) {
		this.mecanismo=t1;
	}
	
	public void addMazo(Mazo m) {
		this.mazos.add(m);
	}
	/*En esta funcion relizamos la busqueda de  
	 * las cartas q cumplan con los mecanismos
	 */
	public ArrayList<Carta> busqueda(){
		ArrayList<Carta>retorno=new ArrayList<Carta>();
		for (int i = 0; i < this.mazos.size(); i++) {
			Mazo m=this.mazos.get(i);
			for (int j = 0; j < m.tamañoMazo(); j++) {
				if(mecanismo.cumple(m.mazo.get(j))) {
					retorno.add(m.mazo.get(j));
				}
			}
		}
		if (retorno.size() != 0) {
			return retorno;
		}
		else {
			System.out.println("No hubo coincidencias");
			return retorno;
		}		
	}


}
