import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final double CALCULO_MINUTO = 60, MUDANCA_ESTADO = 27;
	    double minutos, totalMudanca;
		
		System.out.print("Insira a quantidade de minutos: ");
		minutos= in.nextInt();
	
		totalMudanca= (minutos*CALCULO_MINUTO)/MUDANCA_ESTADO;
		
	
		System.out.print("o Semáforo dentro de " + minutos + " minuto, mudou de estado aproximadamente um total de " + totalMudanca +" vezes. ");
		
	}
}
