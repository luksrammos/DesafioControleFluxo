import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		
        System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();
		
        sc.close();

        ContadorParametros contador = new ContadorParametros(parametroUm, parametroDois);

        try {
            contador.contar();
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}