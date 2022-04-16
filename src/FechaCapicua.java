
import java.util.Scanner;

public class FechaCapicua {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una fecha (usa / para separar los dias, mes y año): ");
		String fecha = teclado.next();
			
		esCapicua(fecha);
		
		teclado.close();
	}

	public static boolean esCapicua(String fecha) {
		System.out.print("La fecha es "+fecha+". ");
		
		String fechaSIN = "";
		String[] nume = fecha.split("/");
		for (int i = 0; i < nume.length; i++) {
			fechaSIN += nume[i];
		}
		fechaSIN = fechaSIN.replace(" ", "");
		System.out.print("Sin / es "+fechaSIN);
		
		int n = Integer.parseInt(fechaSIN);
		String num = "" + n;
		String resultado = "";
		int pos = num.length() - 1;
		do {
			resultado += num.charAt(pos);
			pos--;
		} while (pos >= 0);
		int resu = Integer.parseInt(resultado);
		System.out.print(". La fecha al revés es "+resu+". ");
	
		int a = Integer.parseInt(fechaSIN);
		
		int numalreves = resu;
		if (a == numalreves) {
			System.out.println("Esa fecha es capicua");
			return true;
		} else {
			System.out.println("Esa fecha NO es capicua");
			return false;
		}
	}

}
