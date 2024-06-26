
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int dias;
	    final double MULTA = 1.80;
	    double resultadoMulta;
	    Scanner scanner = new Scanner (System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("valor Multa : 1,80 R$");
        System.out.println("--------------------------------------------------");
	    System.out.printf("Informe a quantidade de dias que atrasou a entrega: ");
	    dias = scanner.nextInt();
	    
        resultadoMulta= MULTA*dias;
	    
	    System.out.print("O total a ser pago é :" + resultadoMulta);
	    
	    
	}
}
