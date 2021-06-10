import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		String aluno = JOptionPane.showInputDialog("Digite o nome do aluno");
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota final do aluno"));
		if ( nota >=7 ) 
		{
			JOptionPane.showMessageDialog(null, "O aluno " +aluno+ " está com a nota " +nota+ " e foi aprovado." );
		}
		else if (nota >= 4 && nota <=7 ) 
		{
			JOptionPane.showMessageDialog(null, "O aluno " +aluno+ " está com a nota " +nota+ " e ficou de recuperação." );
		}
		else if (nota < 4)
		{
			JOptionPane.showMessageDialog(null,"O aluno " +aluno+ " está com a nota " +nota+ " e foi reprovado." );
		}
	}

}
