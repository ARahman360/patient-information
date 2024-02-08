import java.awt.EventQueue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.SystemColor;

import components.SidebarPanel;
import components.HeaderPanel;
import components.BodyPanel;

public class MedicalAilments extends JFrame {
	Connection connection = null;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Searchoption;

	public MedicalAilments() {
		setTitle("BMH : Medical Ailments");
		connection = DBConn.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 465);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Header Panel
		HeaderPanel headerPanel = new HeaderPanel("Medical Ailments");
		contentPane.add(headerPanel);
		
		// Sidebar Panel
		SidebarPanel sidebarPanel = new SidebarPanel();
		contentPane.add(sidebarPanel);
		
		// Body Panel
		BodyPanel bodyPanel = new BodyPanel();
		contentPane.add(bodyPanel);
		
		// ------ start code here ------
		
		Searchoption = new JTextField();
		Searchoption.setToolTipText("Search");
		Searchoption.setBounds(51, 63, 302, 35);
		bodyPanel.add(Searchoption);
		Searchoption.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("What problem are you facing?");
		lblNewLabel_1.setBounds(51, 169, 500, 25);
		bodyPanel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
//		------- Ailment Selection -------
		JComboBox ailmentSelector = new JComboBox();
		ailmentSelector.setBounds(51, 197, 500, 35);
		bodyPanel.add(ailmentSelector);
		
		String queryString = "SELECT DISTINCT description FROM ailments";
	    try {
	        Statement stmt = connection.createStatement();
	        ResultSet rs = stmt.executeQuery(queryString);
	        while (rs.next()) {
	        	ailmentSelector.addItem(rs.getString(1));
	        }
	        rs.close();
	        stmt.close();
	        connection.close();
	    } catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
		
		JButton btnNewButton_7 = new JButton("Next");
		btnNewButton_7.setBounds(352, 243, 200, 35);
		bodyPanel.add(btnNewButton_7);
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblRegisteredPatient = new JLabel("Registered Patient");
		lblRegisteredPatient.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRegisteredPatient.setBounds(50, 11, 500, 25);
		bodyPanel.add(lblRegisteredPatient);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 124, 615, 2);
		bodyPanel.add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(0, 290, 615, 2);
		bodyPanel.add(separator_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Search Patient");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(51, 36, 500, 25);
		bodyPanel.add(lblNewLabel_1_1);
		
		JLabel lblNewPatient = new JLabel("New Patient");
		lblNewPatient.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewPatient.setBounds(51, 137, 500, 25);
		bodyPanel.add(lblNewPatient);
		
		JLabel lblNewLabel_1_2 = new JLabel("Can't find your problem?");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(51, 303, 500, 25);
		bodyPanel.add(lblNewLabel_1_2);
		
		JButton btnNewButton_7_1 = new JButton("Add Problem");
		btnNewButton_7_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_7_1.setBounds(51, 329, 200, 35);
		bodyPanel.add(btnNewButton_7_1);
		
		JButton btnNewButton_7_2 = new JButton("Search");
		btnNewButton_7_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_7_2.setBounds(352, 63, 200, 35);
		bodyPanel.add(btnNewButton_7_2);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedicalAilments frame = new MedicalAilments();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
