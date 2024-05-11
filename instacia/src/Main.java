import javax.swing.*;
import java.io.*;

public class Main 
{

	public static void main (String[] args) throws IOException
	{
		Estatistica[] estc = new Estatistica[10];
		Metodos m = new Metodos();
		
		for (int i = 0; i < 10; i++)
		{
			estc[i] = new Estatistica();
		}
		
		int opc = 0;
	    
		while (opc!=9)
		{
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro Estatística\n"
					+ "2 - Ler o arquivo das estatiticas\n"
					+ "3 - Consulta por quantidade de acidentes\n"
					+ "4 - Consulta por estatísticas de acidentes\n"
					+ "5 - Acidentes acima da média das 10 cidades\n"
					+ "9 - Finaliza"));
			switch (opc)     
			{
					case 1: 
							estc = m.F_CadastraEstatistica(estc);
							break;
					case 2:
							m.P_LerDados(estc);
							break;
					case 3: 
							m.P_QtdAcidentes (estc);
							break;
					case 4:
							m.P_MaiorMenor (estc);
							break;
					case 5:
							m.P_Acima (estc);
							break;
					case 9: 
							JOptionPane.showMessageDialog(null,"FINALIZADO ");
							break;
					default: 
							JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
							break;
			}
		}
	}	
}
