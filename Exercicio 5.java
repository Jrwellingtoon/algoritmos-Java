import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final double CALCULO_MINUTO = 60, MUDANCA_ESTADO = 20;
		double minutos;
		int totalMudanca;
		
		System.out.print("Insira a quantidade de minutos: ");
		minutos= in.nextdouble();
		
		minutos = (minutos*CALCULO_MINUTO);
		
		totalMudanca = minutos/MUDANCA_ESTADO;
		
		System.out.print("O total de mudanças foi : " + totalMudanca);
		
	}
}
