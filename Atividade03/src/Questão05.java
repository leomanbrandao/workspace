import javax.swing.JOptionPane;

public class Questão05 {

	public static void main(String[] args) {
		float horasTrabalhadas = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
		float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de cada hora"));
		
		JOptionPane.showMessageDialog(null, "Você trabalhou por " +horasTrabalhadas+ " horas");
		JOptionPane.showMessageDialog(null, "Seu salário esse mês será de " +(+horasTrabalhadas*+valorHora)+ " reais");
				
	}

}
