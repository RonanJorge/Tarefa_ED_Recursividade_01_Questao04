/* Nome: Ronan Jorge
 * Data: 27/02/2023
 * Objetivo: 04) Crie uma função recursiva que exiba o resultado da inversão de 
 * uma cadeia de caracteres (Ex.: entrada = teste ; saída = etset):
 * Deve se utilizar a função SUBSTRING da Java
 */

package view;

import javax.swing.JOptionPane;
import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		String a = JOptionPane.showInputDialog("Entre com a cadeia de carecteres.");
		int n = a.length();
		System.out.println("Inversão: "+op.inv(a, n));
	}

}
