import javax.swing.JOptionPane;

public class Questão04 {

	public static void main(String[] args) {
		float valorConta = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da conta"));
		
		JOptionPane.showMessageDialog(null, " O valor da conta é " +valorConta+ " reais. Os 10% do garçom são "
				+(valorConta*0.1)+ " reais e o valor final é " +((valorConta*0.1)+valorConta)+ " reais");
	}

}
