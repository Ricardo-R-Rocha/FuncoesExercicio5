import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
System.out.println("Escreva abaixo o valor de custo do produto: ");

Scanner teclado = new Scanner(System.in);
double custo = teclado.nextDouble();

System.out.println("Escreva abaixo o valor da taxa de imposto: ");
double taxaImposto = teclado.nextDouble();


System.out.println("Retorno: ");

SomaImposto(custo, taxaImposto);

teclado.close();

}

public static void SomaImposto(double custo, double taxaImposto) {

double conta;
    conta = (0.01*taxaImposto)*custo + custo;
    System.out.print("O valor final é de: R$ " + conta);
    
}

}