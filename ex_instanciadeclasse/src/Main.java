import javax.swing.JOptionPane;
import java.io.IOException;

public class Main 
{
	public static void principal(String[] args)
	{
		Metodos m = new Metodos(); 
		Estatistica[] Estatic = new Estatistica[10];		
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
							Estatic = m.FCADRASTRAESTATISTICA (Estatic);;
	                         break;
					case 2: 
							m.PQTDACIDENTES (Estatic);
	                         break;
					case 3:
							m.PMAIORMENOR (Estatic);
							break;
					case 4:
							m.PACIMA (Estatic);
							break;
					case 9: 
	            			JOptionPane.showMessageDialog(null,"FINALIZADO ");
	                         break;
					default: 
						JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
				}

	}
	
	
	
	
	
	
	
}
