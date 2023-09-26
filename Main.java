import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String testando = "Testando strings, 1 2 3";
		if (testando.equals("Testando strings, 1 2 3")){
			System.out.println("if satisfeito");
		}
		if (testando.contains("Testando")) {
			System.out.println("A frase " + testando + " contém 'testando'");
		}
		String[] palavras = testando.split(" ");
		for (int i = 0; i < palavras.length; i++){
			System.out.println("A palavra com o índice " + i + " É:");
			System.out.println(palavras[i]);
		}
		String data = "09/26/2023";
		String[] numeros = data.split("/");
		String dataFormatada = "";
		for (int i = 0; i < numeros.length; i++) {
			int num = Integer.parseInt(numeros[i]);
			if (num > 12 && i == 2) {
				dataFormatada = numeros[1] + "/" + numeros[0] + "/" + numeros[2];
			}
		}
		System.out.println("A data " + data + " está em formato americano, segue formato Brasileiro.");
		System.out.println(dataFormatada);
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Digite um número");
		
		String numero = myObj.nextLine();
		
		if (numero.length() == 0) {
			System.out.println("Nenhum número foi digitado");
		}
		
		if (numero.length() < 10 && numero.length() != 0) {
			System.out.println("Número pequeno de mais, por favor, reformule-o.");
		}
		
		if (numero.length() >= 10) {
			numberFormatter(numero);
		}
	}

	private static void numberFormatter(String numero) {
		switch(numero.length()){
		case 10:
			if (numero.contains("55")) {
				System.out.println("Número incorreto");
			} else {
				String numbers = "";
				char[] digitos = numero.toCharArray();
				for (int i = 2; i < digitos.length; i++) {
					numbers = numbers + digitos[i];
				}
				numero = "55" + digitos[0] + digitos[1] + "9" + numbers;
				System.out.println(numero);
			}
			break;
		case 11:
			if (numero.contains("55")) {
				System.out.println("Número incorreto");
			} else {
				numero = "55" + numero;
				System.out.println(numero);
			}
			break;
		case 12:
			char[] digitos = numero.toCharArray();
			String numbers = "";
			for (int i = 4; i < digitos.length; i++) {
				numbers = numbers + digitos[i];
			}
			numbers = "9" + numbers;
			numbers = digitos[2] + "" + digitos[3] + numbers;
			numero = digitos[0] + "" + digitos[1] + numbers;
			System.out.println(numero);
			break;
		case 13:
			System.out.println(numero);
			break;
		default:
			System.out.println("Número incorreto, por favor reformule-o.");
		}
	}
}