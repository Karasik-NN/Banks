package Banks;

import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Metodes {
	public static String virknesParbaude(String zinojums, String noklusejums) {
		String virkne;
		do {
		virkne = JOptionPane.showInputDialog(zinojums, noklusejums);
		if (virkne == null) return null;
		} while (!Pattern.matches("^[\\p{L} ]+$", virkne));
		return virkne;
		}
	
	public static double skaitlaParbaude(String zinojums, double min, double max) {
		String ievade;
		double skaitlis;
		while (true) {
		ievade = JOptionPane.showInputDialog(null, zinojums, "Datu ievade", JOptionPane.INFORMATION_MESSAGE);
		if (ievade == null) return -1;

		try {
		skaitlis = Integer.parseInt(ievade);
		if (skaitlis < min || skaitlis > max) {
		JOptionPane.showMessageDialog(null, "Noradits nekorets intervals", "Nekorekti dati", JOptionPane.WARNING_MESSAGE);
		continue;
		}
		return skaitlis;
		} catch (NumberFormatException e) {
		JOptionPane.showMessageDialog(null, "Netika ievadits vesels skaitlis", "Nekorekti dati", JOptionPane.ERROR_MESSAGE);
		}
		}
		}
}
