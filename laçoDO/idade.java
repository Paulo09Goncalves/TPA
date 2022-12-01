package licaoLaco;
import java.util.Scanner;
public class idade {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int anoAtual, anoNascimento, idade, velho = 0, novo = 0;
		System.out.println("Digite o ano atual : ");
		anoAtual = in.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o ano de nascimento do usuario"+i+":");
			anoNascimento = in.nextInt();
			idade = anoAtual - anoNascimento;
			System.out.println(idade);
			if(idade < novo) {
				novo = idade;
			}
			if(idade > velho) {
				velho = idade;
			}
		}
		System.out.println("O usuario mais velho tem"+velho+"anos, e o mais novo tem"+novo+"anos");
	}
}
