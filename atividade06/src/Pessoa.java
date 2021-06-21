package atividade06;



	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	import javax.swing.JOptionPane;

	
		public class Pessoa {
			
			private String nome;
			private LocalDate dataNascimento;
			private float altura;
			
			
			public int calculaIdade ()
			{
				LocalDate hoje = LocalDate.now();	
				if(hoje.getMonthValue() < dataNascimento.getMonthValue())
				{
					return hoje.getYear() - dataNascimento.getYear() - 1;
				}
				else if (hoje.getMonthValue() == dataNascimento.getMonthValue()) 
				{
					if(hoje.getDayOfMonth() < dataNascimento.getDayOfMonth())
					{
						return hoje.getYear() - dataNascimento.getYear() - 1;
					}
				}
				return hoje.getYear() - dataNascimento.getYear();
				}
			
			public void mostrarDados ()
			{
				JOptionPane.showMessageDialog(null, imprimePessoa());
			}
			
			public String getDataFormato ()
			{
				DateTimeFormatter formatoCorreto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				return dataNascimento.format(formatoCorreto);
			}
					
			public String getNome() 
			{
				return nome;
			}
			public void setNome (String nome) 
			{
				this.nome = nome;
			}
			public LocalDate getdataNascimento() 
			{
				return dataNascimento;
			}
			public void setdataNascimento (LocalDate dataNascimento) 
			{
				this.dataNascimento = dataNascimento;
			}
			public double getAltura() 
			{
				return altura;
			}
			public void setAltura (float altura) 
			{
				this.altura = altura;
			}
			
			public String imprimePessoa()
			{
				return "O seu nome é " +nome+ ", você nasceu em : " +getDataFormato()+ ". Você tem " +calculaIdade()+ " anos e " +altura+ " metros";
			}
			
	}

