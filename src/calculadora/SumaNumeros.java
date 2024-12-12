/**@author Fernando

@version 1.0
@param numero1 El primer número a sumar.
@param numero2 El segundo número a sumar.*/
//Programa que suma digitos
//Cambio realizado desde rama feature-suma
package calculadora;
import java.util.Scanner;
public class SumaNumeros {
	/**
	 *Este metodo hace la operacion de suma recibiendo los argumentos enteros a,b
	 */
public static void main(String[] args) {
	/**
	 *Este metodo hace la llamada al escanner
	 */
Scanner scanner = new Scanner(System.in);
/**@return El resultado de la suma y resta mostrando en pantalla*/
System.out.print("Ingresa el primer número: ");
int numero1 = scanner.nextInt();
/**@return El resultado de la suma y resta mostrando en pantalla*/
System.out.print("Ingresa el segundo número: ");
int numero2 = scanner.nextInt();
int suma = numero1 + numero2;
/**@return El resultado de la suma*/
System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
//scanner.close();
}
}
