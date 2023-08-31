import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {

			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {

			System.out.println("O segundo parâmetro deve ser maior que o primeiro");

			for (int i = 0; parametroDois <= parametroUm; i++) {
				System.out.println("Digite o segundo parâmetro");
				parametroDois = terminal.nextInt();

			}
			contar(parametroUm, parametroDois);
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		int contagem = parametroDois - parametroUm;

		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException();
		}

		for (int i = 1; i <= contagem; i++) {
			System.out.println("Contagem " + i);
		}
	}
}