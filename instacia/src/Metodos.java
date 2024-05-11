import javax.swing.JOptionPane;
import java.util.Random;
import java.io.*;


class Metodos
{

	public Estatistica[] F_CadastraEstatistica(Estatistica[] et) throws IOException
	{
		String fileName = "ArquivoEstatistica.txt";
		
		int i = 0;
		String cid[] = {"a", "b" ,"c" ,"d" ,"e" ,"f" ,"g" ,"h" ,"i", "j"} ;
		BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
		
		Random r = new Random();		
		
		for (i = 0; i<10; i++)
		{
			et[i].cod_Cidade = i + 1;
			et[i].nome_Cidade = cid[i];
			et[i].qtd_Acidente = r.nextInt(100);
			
			gravar.write(Integer.toString(et[i].cod_Cidade));gravar.newLine();
			gravar.write(et[i].nome_Cidade);gravar.newLine();
			gravar.write(Integer.toString(et[i].qtd_Acidente));gravar.newLine();
			
		}
		gravar.close();
		
		JOptionPane.showMessageDialog(null,"gravação concluida");
		return et;
	}

	void P_QtdAcidentes (Estatistica[] et)
	{
		int i = 0;
		int op = 0;
		int valor = 0;
		int valor2 = 0;
		boolean b = false;
		
		while (op !=9)
		{
			op = Integer.parseInt(JOptionPane.showInputDialog("digite o metedo de busca:\n"
				+ "1 - Por valor exato de acidentes\n"
				+ "2 - Por intervalo de numeros de acidentes\n"
				+ "9 - volta"));
		
			switch (op)
			{
				
				case 1:
					
					valor = Integer.parseInt(JOptionPane.showInputDialog("digite o numero de acidentes que deseja buscar:"));
					for(i=0; i<10; i++)
					{
						if (valor == et[i].qtd_Acidente)
						{
							JOptionPane.showMessageDialog(null,"A cidade que tem " + valor + "  acidentes é: " + et[i].nome_Cidade + " cod: " + et[i].cod_Cidade);
						}
					}
					break;
				
				
				case 2:
					
					while (b == false)
					{
						valor = Integer.parseInt(JOptionPane.showInputDialog("digite o menor numero do intervalo de valores que você deseja buscar:"));
						valor2 = Integer.parseInt(JOptionPane.showInputDialog("digite o maior numero do intervalo de valores que você deseja buscar:"));
					
						if (valor < valor2)
						{
							b = true;
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Valor invalido");
						}
					}
					for(i=0; i<10; i++)
					{
						if (valor <= et[i].qtd_Acidente && valor2 >= et[i].qtd_Acidente)
						{
						JOptionPane.showMessageDialog(null,"A cidade que tem " + et[i].qtd_Acidente + "  acidentes é: " + et[i].nome_Cidade + " cod: " + et[i].cod_Cidade);
						}
					}
					
					b= false;
					break;
				
				
				case 9:
					break;
				
				
				default:
					JOptionPane.showMessageDialog(null,"Valor invalido");
					break;
			}
		}
	}
	
	void P_MaiorMenor (Estatistica[] et)
	{
		int i = 0;
		int op = 0;
		int valor = 0;
		
		while (op !=9)
		{
			op = Integer.parseInt(JOptionPane.showInputDialog("digite o que deseja buscar:\n"
				+ "1 - maior número de acidentes\n"
				+ "2 - menor número de acidentes\n"
				+ "9 - volta"));
		
			switch (op)
			{
				
				case 1:
					
					for(i=0; i<10; i++)
					{	
						if (valor < et[i].qtd_Acidente)
						{
							valor =  et[i].qtd_Acidente;
						}
					}
					for(i=0; i<10; i++)
					{
						if (valor == et[i].qtd_Acidente)
						{
							JOptionPane.showMessageDialog(null,"A cidade que tem mais acidentes, é: " + et[i].nome_Cidade + " cod: " + et[i].cod_Cidade + " o número de acidentes nessa cidade foi: " + valor);
						}
					}
					break;
				
				
				case 2:
					
					for(i=0; i<10; i++)
					{	
						if (valor > et[i].qtd_Acidente)
						{
							valor =  et[i].qtd_Acidente;
						}
					}
					for(i=0; i<10; i++)
					{
						if (valor == et[i].qtd_Acidente)
						{
							JOptionPane.showMessageDialog(null,"A cidade que tem menos acidentes, é: " + et[i].nome_Cidade + " cod: " + et[i].cod_Cidade + " o número de acidentes nessa cidade foi: " + valor);
						}
					}
					break;
					
				case 9:
					break;
				
				default:
					JOptionPane.showMessageDialog(null,"Valor invalido");
					break;
					
			}
		}
	}
	
	void P_Acima (Estatistica[] et)
	{
		int i = 0;
		int soma = 0;
		int média = 0;
		
		for (i = 0; i<10; i++)
		{
			soma = soma + et[i].qtd_Acidente;
		}
		
		média = soma/10;
		
		for (i = 0; i<10; i++)
		{
			
			if (et[i].qtd_Acidente >= média)
			{
				JOptionPane.showMessageDialog(null,"A cidade " + et[i].nome_Cidade + " possui uma quantidade de acidentes maior que a media das 10 cidades \n"
						+ "média do número de acidentes: " + média + "\n"
						+ "numero de acidentes da cidade: " + et[i].qtd_Acidente);
			}
		}
	}
	
	void P_LerDados (Estatistica[] et) throws IOException
	{	
		String fileName = "ArquivoEstatistica.txt";
		BufferedReader ler = new BufferedReader (new FileReader(fileName));
		
		int i = 0;
				
		for (i = 0; i<10; i++)
		{
			et[i].cod_Cidade = Integer.parseInt(ler.readLine());
			et[i].nome_Cidade = ler.readLine();
			et[i].qtd_Acidente = Integer.parseInt(ler.readLine());
			
			JOptionPane.showMessageDialog(null,"cod da cidade: " + et[i].cod_Cidade + "\n"
					+ "nome da cidade: " + et[i].nome_Cidade + "\n"
					+ "numero de acidentes: " + et[i].qtd_Acidente);
			
			
		}	
		ler.close();
	}
	
}
