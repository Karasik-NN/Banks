package Banks;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;



public class bankomats {

	public static void main(String[] args) {
		String izvele;
		int izvelesID;
		String[]darbibas = {"Jauna karte","Noņemt karte",
				"kartu saraksts","Izsaukt metode",
				"Aizvērt programmu"};
		String[]veidi = {"Noreķinu karte", "Kredit karte"};
		ArrayList<Object>kartes = new ArrayList<>();
		
		do {
			izvele = (String)JOptionPane.showInputDialog(null,
					"Izvelies darbibu","Izvelne",JOptionPane.QUESTION_MESSAGE,
					null,darbibas, darbibas[0]);
			
			if(izvele == null)
				break;
			
			izvelesID = Arrays.asList(darbibas).indexOf(izvele);
			
			switch(izvelesID) {
			case 0:
				izvele = (String)JOptionPane.showInputDialog(null,
						"Izvelies velosipēdu veidu","Izvelne",JOptionPane.QUESTION_MESSAGE,
						null,veidi, veidi[0]);	
				
				izvelesID = Arrays.asList(veidi).indexOf(izvele);	
				String razotajs = Metodes.virknesParbaude("Norādi kartes ražotaju","SwedBank");
				int numurs = (int)Metodes.skaitlaParbaude(
						"Kads ir kartes numurs(uzrakstit pirmas 4 un pedejas 4 ciparas)", 10000000, 99999999);
				int CVC = (int)Metodes.skaitlaParbaude("Kads Bus Kartes CVC2", 100, 999);
				int gads = (int)Metodes.skaitlaParbaude("Kads deriga termiņš(gads)", 2025, 2030);
				int naudu  = (int)Metodes.skaitlaParbaude("Cik Naudas ir kartē", 0, 99999999);
				if (izvelesID == 0) {
					kartes.add(new Banks(CVC,numurs,gads,razotajs, naudu));
					JOptionPane.showMessageDialog(null,"Veiksimi izveidots jauns karte!","Pazinojums",
							JOptionPane.INFORMATION_MESSAGE);
				}
				
				break;
			case 1:
			case 2:
			case 3:
			case 4:
				
			}
		}while(izvelesID != 5);
	

	}

}
