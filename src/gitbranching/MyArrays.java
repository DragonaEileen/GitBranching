package gitbranching;

/**
 * Esta clase contendrá varios arrays de ninguna utilidad y métodos dados en ellos
 * 
 * @author Eileen
 */
public class MyArrays {

	/* Atributos */
	/**
	 * Array que contendrá un tren de enteros
	 */
	int trenecito[];
	
	/**
	 * Array que contendrá números random
	 */
	int arrayRandom[];
	
	/**
	 * Array que contendrá palabras clave
	 */
	String claves[];
	
	
	/* Metodos */
	/**
	 * Este método rellena el tren y lo devuelve
	 * 
	 * @param num Longitud del tren
	 * @return trenecito La Array de enteros
	 */
	int[] dameTren(int num) {
		
		trenecito = new int[num];
		
		for(int i = 0; i < trenecito.length; i++) {
			
			trenecito[i] = (int) (Math.random()*10);
			
		}//Fin For Relleno
		
		return trenecito;
		
	}
	
}
