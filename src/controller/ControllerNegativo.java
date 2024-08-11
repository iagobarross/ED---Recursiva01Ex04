/*4. Crie uma função recursiva que exiba o total de elementos nega�vos de um vetor de inteiros, de N
posições, passado como parâmetro:
O código deve trazer como comentários:
A condição de parada
Como escrever a função para o termo n em função do termo anterior
*/
package controller;

public class ControllerNegativo {

	public ControllerNegativo() {
		super();
	}
	
	public int somaNegativos(int[] vet, int tamanho) {
		int soma = 0;
		if(tamanho == 0) {
			return 0; //Quando tamanho chegar a 0, significa que o vetor foi percorrido por completo.
		} else if (vet[tamanho - 1] < 0) {
			soma ++;
			return soma + somaNegativos(vet, tamanho - 1);//Se o numero do indice for negativo, soma o contador e chama a funcao novamente com indice anterior.
		} else {
			return soma + somaNegativos(vet, tamanho - 1);//Se o numero nao for negativo, chama-se a funcao recursiva com o indice anterior.
		}
	}
}
