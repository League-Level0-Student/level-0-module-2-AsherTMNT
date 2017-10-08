//    Copyright (c) The League of Amazing Programmers 2013-2017
package conditionals;

import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {

		String username = "Grand Moff Tarkin";
		String passcode = "Zoog";

		boolean match = JOptionPane.showInputDialog("Who is this?").equalsIgnoreCase(username);
		if (match) {
			boolean match1 = JOptionPane.showInputDialog("What is the passcode?").equalsIgnoreCase(passcode);
			if (match1) {
				JOptionPane.showMessageDialog(null, "You have been granted the plans to the Death Star.");
			} else {
				JOptionPane.showMessageDialog(null, "INRUDER!!!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "INTRUDER!!!");
		}
	}
}