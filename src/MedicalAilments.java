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
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(Color.WHITE);
		headerPanel.setBounds(0, 0, 800, 50);
		contentPane.add(headerPanel);
		headerPanel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 49, 800, 2);
		headerPanel.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("BMH");
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setBounds(20, 10, 57, 28);
		headerPanel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		JLabel lblNewLabel = new JLabel("Medical Ailments");
		lblNewLabel.setBounds(308, 10, 185, 28);
		headerPanel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JPanel sidebarPanel = new JPanel();
		sidebarPanel.setBackground(Color.WHITE);
		sidebarPanel.setBounds(0, 50, 185, 375);
		contentPane.add(sidebarPanel);
		sidebarPanel.setLayout(null);
		
		JButton btnDashboard = new JButton("DASHBOARD");
		btnDashboard.setBounds(10, 10, 165, 35);
		sidebarPanel.add(btnDashboard);
		
		JButton btnAppoinments = new JButton("APPOINMENTS");
		btnAppoinments.setBounds(10, 55, 165, 35);
		sidebarPanel.add(btnAppoinments);
		
		JButton btnPatientInfo = new JButton("PATIENT INFO");
		btnPatientInfo.setBounds(10, 101, 164, 35);
		sidebarPanel.add(btnPatientInfo);
		
		JButton btnPharmacy = new JButton("PHARMACY");
		btnPharmacy.setBounds(10, 147, 165, 35);
		sidebarPanel.add(btnPharmacy);
		
		JButton btnDoctorReview = new JButton("DOCTOR REVIEW");
		btnDoctorReview.setBounds(10, 193, 165, 35);
		sidebarPanel.add(btnDoctorReview);
		
		JButton btnRestaurant = new JButton("RESTAURANT");
		btnRestaurant.setBounds(10, 239, 165, 35);
		sidebarPanel.add(btnRestaurant);
		
		JButton btnFinance = new JButton("FINANCE");
		btnFinance.setBounds(10, 285, 165, 35);
		sidebarPanel.add(btnFinance);
		
		JLabel lblNewLabel_3 = new JLabel("Made By Abdur Rahman");
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 351, 165, 14);
		sidebarPanel.add(lblNewLabel_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(184, 0, 2, 376);
		sidebarPanel.add(separator_1);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		
		JPanel bodyPanel = new JPanel();
		bodyPanel.setBounds(185, 50, 615, 375);
		contentPane.add(bodyPanel);
		bodyPanel.setLayout(null);
		
		Searchoption = new JTextField();
		Searchoption.setToolTipText("Search");
		Searchoption.setBounds(51, 64, 400, 35);
		bodyPanel.add(Searchoption);
		Searchoption.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("What problem are you facing?");
		lblNewLabel_1.setBounds(51, 169, 198, 25);
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
		


		
		
		JLabel lblNewLabel_1_1 = new JLabel("Can't find relative problem?");
		lblNewLabel_1_1.setBounds(51, 298, 198, 25);
		bodyPanel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(228, 156, 198, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Have any disability? Optional");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(228, 223, 198, 27);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Date of birth");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(228, 291, 88, 27);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Requirements");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_1.setBounds(402, 291, 88, 27);
		contentPane.add(lblNewLabel_1_3_1);
		
		JButton btnNewButton_7 = new JButton("Next");
		btnNewButton_7.setBounds(451, 243, 100, 35);
		bodyPanel.add(btnNewButton_7);
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblRegisteredPatient = new JLabel("Registered Patient");
		lblRegisteredPatient.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRegisteredPatient.setBounds(50, 11, 500, 25);
		bodyPanel.add(lblRegisteredPatient);
		
		JLabel lblNewLabel_2 = new JLabel("BMH");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(10, 9, 57, 28);
		contentPane.add(lblNewLabel_2);
		
		disabilityaddoption = new JTextField();
		disabilityaddoption.setBounds(228, 251, 422, 30);
		contentPane.add(disabilityaddoption);
		disabilityaddoption.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 124, 615, 2);
		bodyPanel.add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(0, 290, 615, 2);
		bodyPanel.add(separator_2_1);
		
		Requirementsfield = new JTextField();
		Requirementsfield.setColumns(10);
		Requirementsfield.setBounds(402, 327, 248, 30);
		contentPane.add(Requirementsfield);
		
		DateofBirth = new JTextField();
		DateofBirth.setColumns(10);
		DateofBirth.setBounds(228, 327, 164, 30);
		contentPane.add(DateofBirth);
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
