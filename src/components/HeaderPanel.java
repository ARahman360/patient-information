package components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class HeaderPanel extends JPanel {
	String title;

	public HeaderPanel(String title) {
		this.title = title;
		this.setBackground(Color.WHITE);
		this.setBounds(0, 0, 800, 50);
		this.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 49, 800, 2);
		this.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("BMH");
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setBounds(20, 10, 57, 28);
		this.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		JLabel lblNewLabel = new JLabel(title);
		lblNewLabel.setBounds(308, 10, 185, 28);
		this.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
	}

}
