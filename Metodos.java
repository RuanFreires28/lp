import javax.swing.JOptionPane;
import java.util.Random;

class Metodos
{

	public Estatistica[] F_CadastraEstatistica(Estatistica[] et)
	{
		int i = 0;

		Random r = new Random();		
		
		for (i = 0; i<10; i++)
		{
			et[i].cod_Cidade = Integer.parseInt(JOptionPane.showInputDialog("insira o código da cidade"));
			//et[i].cod_Cidade = i + 1;
			et[i].nome_Cidade = JOptionPane.showInputDialog("Insira o nome da cidade");
			et[i].qtd_Acidente = r.nextInt(100);
			//et[i].qtd_Acidente = Integer.parseInt(JOptionPane.showInputDialog("insira a qtd de acidentes"));
			
			JOptionPane.showMessageDialog(null,"cod da cidade: " + et[i].cod_Cidade + "\n"
					+ "nome da cidade: " + et[i].nome_Cidade + "\n"
					+ "numero de acidentes: " + et[i].qtd_Acidente);
		}
		return et;
	}

	void P_QtdAcidentes (Estatistica[] et)
	{}
	
	void P_MaiorMenor (Estatistica[] et)
	{}
	
	void P_Acima (Estatistica[] et)
	{}
	
	
}
