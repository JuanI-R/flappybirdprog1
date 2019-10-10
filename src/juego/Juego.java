package juego;


import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
	private int y = 300;
	private int x1 = 300;
	private int x2 = 475;
	private Entorno entorno;
	
	// Variables y métodos propios de cada grupo
	// ...
	
	Juego()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "TorreMágica - Grupo Apellido1 - Apellido2 -Apellido3 - V0.01", 800, 600);
		
		// Inicializar lo que haga falta para el juego
		// ...
		
		// Inicia el juego!
		this.entorno.iniciar();

	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y 
	 * por lo tanto es el método más importante de esta clase. Aquí se debe 
	 * actualizar el estado interno del juego para simular el paso del tiempo 
	 * (ver el enunciado del TP para mayor detalle).
	 */
	public void tick()
	{
		// Procesamiento de un instante de tiempo
		// ...
		if (entorno.estaPresionada(entorno.TECLA_ARRIBA)) {
			y-=1;
		}
		else {
			y+=1;
		}
		x1--;
		x2--;
		entorno.dibujarCirculo(200, y, 25, Color.pink);
		entorno.dibujarRectangulo(x1, 500, 100, 300, 0, Color.green);
		entorno.dibujarRectangulo(x2, 100, 100, 300, 0, Color.green);
		entorno.escribirTexto("Puntaje:_00", 0, 10);
		if (x1==0) {
			x1=800;
		}
		if (x2==0) {
			x2=800;
		}
		
		
	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Juego juego = new Juego();
	}
}
