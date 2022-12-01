package licaoLaco;
import java.util.Scanner;
public class licaoLacoDO {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int i=0;
		do {
			i=i+2;	
			System.out.println(i);
		}while(i<500);
		System.out.println("Fim do Programa!");
		i++;
	}
}