import javax.swing.JOptionPane;

public class Questão02 {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		int soma = numero1 + numero2;
		
		JOptionPane.showMessageDialog(null, "A soma dos números digitados é: " +soma);

	}

}
