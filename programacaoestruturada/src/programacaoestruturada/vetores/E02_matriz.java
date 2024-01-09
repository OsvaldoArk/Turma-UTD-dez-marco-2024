package programacaoestruturada.vetores;

public class E02_matriz {

	public static void main(String[] args) {
		
		String[][] notas = new String[3][2];
		
		notas[0][0] = "Angelina";
		notas[0][1] = "10";
		
		notas[1][0] = "Pedro";
		notas[1][1] = "8";
		
		notas[2][0] = "Henrique";
		notas[2][1] = "9";
		
		System.out.println("nome\t nota");
		System.out.printf("%s %s\n",notas[0][0],notas[0][1]);
		System.out.printf("%s\t %s\n",notas[1][0],notas[1][1]);		
		System.out.printf("%s %s\n",notas[2][0],notas[2][1]);

	}
}
