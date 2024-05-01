import javax.swing.*;

public class Main 
{

	public static void main (String[] args)
	{
		Estatistica[] estc = new Estatistica[10];
		Metodos m = new Metodos();
		
		int opc = 0;
	    
		while (opc!=9)
		{
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro Estatística \n "
					+ "2 - Consulta por quantidade de acidentes \n"
					+ "3 - Consulta por estatísticas de acidentes \n "
					+ "4 - Acidentes acima da média das 10 cidades\n"
					+ "9 - Finaliza"));
			switch (opc)     
			{
					case 1: 
							estc = m.F_CadastraEstatistica(estc);
							break;
					case 2: 
							m.P_QtdAcidentes (estc);
							break;
					case 3:
							m.P_MaiorMenor (estc);
							break;
					case 4:
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
