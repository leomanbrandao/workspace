import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		String palavraChave = JOptionPane.showInputDialog("Digite a palavra de acesso");
		
		if(palavraChave.equals("Java-2021"))
		{
			JOptionPane.showMessageDialog(null, "Permiss�o aprovada");
		}
		else 
		{
			for (int i=5; i >=1; i--)
			{
				JOptionPane.showInputDialog("Tente novamente. Voc� ainda tem " +i+ " tentativas");
			}
		}

	}

}
