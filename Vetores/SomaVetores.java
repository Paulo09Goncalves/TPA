package Vetores;
import java.util.*;
public class SomaVetores {
	public static void main (String[]args) {
		Scanner in= new Scanner (System.in);
		final int TAM= 10;
		int A[], B[],C[],i;
		
		A= new int [TAM];
		B= 	new int [TAM];
		C= new int [TAM];
		for(i=0; i<TAM; i++){
			System.out.println("digite o"+(i+1)+ "numero");
			a[i]= in.nextInt();
			System.out.println("Digite o"+(i+1)+ "numero");
			b[i]= in.nextInt();
			c[i]=a[i]+b[i];
			System.out.println("A soma é"+c[i]);
			
		}
	}
}
