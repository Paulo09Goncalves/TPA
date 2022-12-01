package licaoLaco;
import java.util.Scanner;
public class anoAtual {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int anoAtual, nascimento, idade, resposta = 1;	
		System.out.println("Digite o ano atual :");
		anoAtual = in.nextInt();

		do {
			System.out.println("Digite o ano de nascimento :");
			nascimento = in.nextInt();
			idade=anoAtual-nascimento;
			System.out.println("idade: "+idade+"anos");
			if (idade >= 18) {
				System.out.println("Você já é adulto");	
			} else {
				System.out.println("Você não é adulto");
			}
			System.out.println("Deseja continuar?" + "\n[1] - Sim" + "\n[2] - Não");
			resposta = in.nextInt();
		} while (resposta == 1);
	}
}
