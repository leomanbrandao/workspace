import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		
		if( num1 > num2)
		{
			JOptionPane.showMessageDialog(null, +num1+ " � maior que " +num2);
		}
		else if (num1 < num2)
		{
			JOptionPane.showMessageDialog(null, +num2+ " � maior que " +num1);
		}
		else
		{
			JOptionPane.showMessageDialog(null, +num1+ " � igual a " +num2);
		}

	}

}
