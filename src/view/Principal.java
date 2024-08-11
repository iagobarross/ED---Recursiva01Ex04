package view;

import controller.ControllerNegativo;

public class Principal {

	public static void main(String[] args) {
		ControllerNegativo contNeg = new ControllerNegativo();
		int[] vet = {2, -5, 8, 1, -4, -6, 9, -15};
		int tamanho = vet.length;
		
		int soma = contNeg.somaNegativos(vet, tamanho);
		System.out.println("A quantidade de números negativos no vetor é: " + soma);
	}

}
