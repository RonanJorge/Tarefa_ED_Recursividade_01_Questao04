package controller;

public class OperacoesController {
	public OperacoesController() {
		super();
	}
	public String inv(String a, int tamanho) {
		/* O ponto de parada será quando a string tiver tamanho zero
		 * e o retorno será um espaço em branco. */
		if(tamanho == 0) {
			/* Se o tamanho da string for maior que zero, a função deverá retornar 
			 * a substring que contém somente a última letra esta string, concatenada
			 * com a própria função sem a última letra da string. */
			return "";
		}
		else {
			return a.substring(tamanho-1,tamanho)+inv(a, tamanho - 1);
		}
	}
}
