package orientacaoaobjeto.conceito;

import javax.swing.JOptionPane;

public class TestePessoaGrafico {

	public static void main(String[] args) {
		
		String cpf = JOptionPane.showInputDialog("digite o cpf");
		
		String nome = JOptionPane.showInputDialog("digite o nome");
		
		String idadeString = JOptionPane.showInputDialog("digite a idade");
		
		Integer idade = Integer.parseInt(idadeString);

		String telefone = JOptionPane.showInputDialog("digite o telefone");
		
		String endereco = JOptionPane.showInputDialog("digite o endereço");
		/*
		Pessoa p01 = new Pessoa(cpf,nome,idade,telefone,endereco);

		JOptionPane.showMessageDialog(null, p01);
		*/
	}
}
