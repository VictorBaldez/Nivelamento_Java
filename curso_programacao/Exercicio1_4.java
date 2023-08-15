package curso_programacao;

public class Exercicio1_4 {
	public static void main(String[]args) {
		float x = 3.0f;
		float y = 4.0f;
		float z = -5.0f;
		float A,B,C;
		
		A = (float) Math.sqrt(x);
		B = (float)Math.sqrt(y);
		C = (float)Math.sqrt(z);
		
		System.out.printf("Raiz quadrada de %.2f é %.2f\n",x,A);
		System.out.printf("Raiz quadrada de %.2f é %.2f\n",y,B);
		System.out.printf("Raiz quadrada de %.2f é %.2f\n",z,C);
		
		A = (float) Math.pow(x,2);
		B = (float)Math.pow(y,3);
		C = (float)Math.pow(z,4);
		
		System.out.printf("O valor de %.2f elevado a 2 é %.2f\n",x,A);
		System.out.printf("O valor de %.2f elevado a 3 é %.2f\n",y,B);
		System.out.printf("O valor de %.2f elevado a 4 é %.2f\n",z,C);
		
		A = (float) Math.abs(x);
		B = (float)Math.abs(y);
		C = (float)Math.abs(z);
		
		System.out.printf("O valor absoluto de %.2f é %.2f\n",x,A);
		System.out.printf("O valor absoluto de %.2f é %.2f\n",y,B);
		System.out.printf("O valor absoluto de %.2f é %.2f\n",z,C);
	}
}