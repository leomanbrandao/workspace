import javax.swing.JOptionPane;

public class Quest�o05 {

	public static void main(String[] args) {
		float horasTrabalhadas = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
		float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de cada hora"));
		
		JOptionPane.showMessageDialog(null, "Voc� trabalhou por " +horasTrabalhadas+ " horas");
		JOptionPane.showMessageDialog(null, "Seu sal�rio esse m�s ser� de " +(+horasTrabalhadas*+valorHora)+ " reais");
				
	}

}
