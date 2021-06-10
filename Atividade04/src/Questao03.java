import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número qualquer"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número qualquer"));
		int diferenca = 0;
		StringBuilder numeros = new StringBuilder();
		if( num1 > num2)
		{
			
			diferenca = num1-num2;
			
			for (int i = 1; i < diferenca; i++)
			{
				int valor = num2+i;
				numeros.append(valor).append(",");
								
			}
			JOptionPane.showMessageDialog(null, "Os numeros que estão entre " +num2+ " e " +num1+ " são \n" +numeros.toString());
		}
			else if (num2 > num1)
			{
				diferenca = num2 - num1;
				for (int i = 1; i < diferenca; i++)
				{
					int valor = num1+i;
					numeros.append(valor).append(",");
					
				}
				JOptionPane.showMessageDialog(null, "Os numeros que estão entre " +num1+ " e " +num2+ " são \n" +numeros.toString());
			}
			else
			{
				JOptionPane.showMessageDialog(null, " Você digitou números iguais");
			}
		
		}
}




