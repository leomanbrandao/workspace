import javax.swing.JOptionPane;

public class Questao01 {
	
	public static void main (String [] args) 
	{
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número qualquer"));
		int n1 = numero - 1 ;
		int n2 = numero + 1;
		
		JOptionPane.showMessageDialog(null, "Os números vizinhos são " +n1+ " e " +n2);
		}
	}
