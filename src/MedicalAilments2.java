import java.awt.EventQueue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
import java.awt.Color;
import java.awt.SystemColor;

public class MedicalAilments2 extends JFrame {
	Connection connection = null;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Searchoption;
	private JTextField disabilityaddoption;
	private JTextField Requirementsfield;
	private JTextField DateofBirth;
	private JTextField textField;

	public MedicalAilments2() {
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
		Searchoption.setBounds(125, 10, 400, 35);
		bodyPanel.add(Searchoption);
		Searchoption.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("What problem are you facing?");
		lblNewLabel_1.setBounds(50, 50, 198, 25);
		bodyPanel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(50, 77, 500, 35);
		bodyPanel.add(comboBox);
		
		JLabel lblNewLabel_1_1 = new JLabel("Can't find relative problem?");
		lblNewLabel_1_1.setBounds(50, 122, 198, 25);
		bodyPanel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setBounds(50, 147, 500, 35);
		bodyPanel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("Next");
		btnNewButton_7.setBounds(465, 333, 85, 35);
		bodyPanel.add(btnNewButton_7);
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewLabel_1_2 = new JLabel("Have any disability? Optional");
		lblNewLabel_1_2.setBounds(50, 192, 198, 25);
		bodyPanel.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		disabilityaddoption = new JTextField();
		disabilityaddoption.setBounds(50, 217, 500, 35);
		bodyPanel.add(disabilityaddoption);
		disabilityaddoption.setColumns(10);
		
		DateofBirth = new JTextField();
		DateofBirth.setBounds(50, 287, 240, 35);
		bodyPanel.add(DateofBirth);
		DateofBirth.setColumns(10);
		
		Requirementsfield = new JTextField();
		Requirementsfield.setBounds(310, 287, 240, 35);
		bodyPanel.add(Requirementsfield);
		Requirementsfield.setColumns(10);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Requirements");
		lblNewLabel_1_3_1.setBounds(310, 262, 88, 25);
		bodyPanel.add(lblNewLabel_1_3_1);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1_3 = new JLabel("Date of birth");
		lblNewLabel_1_3.setBounds(50, 262, 88, 25);
		bodyPanel.add(lblNewLabel_1_3);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1_4 = new JLabel("Search:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4.setBounds(75, 10, 50, 35);
		bodyPanel.add(lblNewLabel_1_4);
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPharmacy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPatientInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAppoinments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedicalAilments2 frame = new MedicalAilments2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
