import javax.swing.JOptionPane;

public class Quest�o02 {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		int soma = numero1 + numero2;
		
		JOptionPane.showMessageDialog(null, "A soma dos n�meros digitados �: " +soma);

	}

}
