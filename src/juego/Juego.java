package juego;


import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
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
		
		entorno.dibujarCirculo(200, 300, 25, Color.pink);
		entorno.dibujarRectangulo(300, 500, 100, 300, 0, Color.green);
		entorno.dibujarRectangulo(475, 100, 100, 300, 0, Color.green);
		entorno.escribirTexto("Puntaje:_00", 0, 10);
		
	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Juego juego = new Juego();
	}
}
