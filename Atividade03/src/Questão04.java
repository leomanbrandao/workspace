import javax.swing.JOptionPane;

public class Quest�o04 {

	public static void main(String[] args) {
		float valorConta = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da conta"));
		
		JOptionPane.showMessageDialog(null, " O valor da conta � " +valorConta+ " reais. Os 10% do gar�om s�o "
				+(valorConta*0.1)+ " reais e o valor final � " +((valorConta*0.1)+valorConta)+ " reais");
	}

}
