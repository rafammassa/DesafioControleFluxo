import java.security.InvalidParameterException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (InvalidParameterException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
            e.printStackTrace();
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws InvalidParameterException {
        if(parametroUm > parametroDois) {
            throw new InvalidParameterException();
        }
        int contagem = parametroDois - parametroUm;
        System.out.println("Contagem = " + contagem);
        for(int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}