package atividade06;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa ();
		int dia;
		int mes;
		int ano;
		p1.setNome(JOptionPane.showInputDialog("Por favor, digite o seu nome"));
		p1.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura utilizando ponto. (Ex: 1.78")));
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu dia de nascimento"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu mes de nascimento"));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu dia de nascimento"));
		
		LocalDate x = LocalDate.of(ano,mes,dia);
		p1.setdataNascimento(x);
		
		p1.mostrarDados();
	}

}
