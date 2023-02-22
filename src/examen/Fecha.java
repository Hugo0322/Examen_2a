package examen;
/**
 * La clase Fecha es una simple clase que a través de unas condiciones (if) davelverá si los datos obtenidos componen una fecha válida
 * 
 * @author dam103
 *
 */
public class Fecha {
	/**
	 * El método validarFecha consiste en a través de 3 valores int recogidos como dia mes y anio determinar si la fecha representada por los 
 * 3 será válida (devolviendo un true) o falsa (devolviendo un false)
	 * 
	 * @param anio Variable de tipo int que representa el año de la fecha introducida
	 * @param mes Variable de tipo int que representa el mes de la fecha introducida
	 * @param dia Variable de tipo int que representa el dia de la fecha introducida
	 * @return devuelve el valor booleano de una variable inicializada dentro de sí misma
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		// Inicializo la variable fechaValida
		boolean fechaValida = false;
		// Restrinjo los valores que pueden tener los valores recogidos en el método para que se ajusten a mi visión de una fecha válida
		// es decir, no puedo tener ni dias ni meses ni años negativos
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			// Añado otra condición necesaria para que mis fechas ssean válidas, los meses no pueden superar el número 22 y los días no pueden superar el día 31
			if ((mes <= 12) && (dia <= 31)) {
				// Delimito Febrero a 28 (No contaríamos lo años visiestos)
				if (mes == 2) {
					fechaValida = dia <= 28;
				// Si el mes es par delimitos los días máximos a 30
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				// Si el més no es ninguno de los anteriores, su máximo de días sera 31
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		// Devuelvo el booleano que indicará si la fecha es válida o no según mis criterios
		return fechaValida;
	}
}