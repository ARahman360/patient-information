import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import components.SidebarPanel;
import components.HeaderPanel;
import components.BodyPanel;
import java.awt.Color;

public class PatientInfo extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	public PatientInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Header Panel
		HeaderPanel headerPanel = new HeaderPanel("Patient Info");
		contentPane.add(headerPanel);
		
		// Sidebar Panel
		SidebarPanel sidebarPanel = new SidebarPanel();
		contentPane.add(sidebarPanel);
		
		// Body Panel
		BodyPanel bodyPanel = new BodyPanel();
		contentPane.add(bodyPanel);
		
		JLabel lblNewLabel_1_1 = new JLabel("First name");
		lblNewLabel_1_1.setBounds(12, 47, 141, 27);
		bodyPanel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1_2 = new JLabel("Surname");
		lblNewLabel_1_2.setBounds(166, 47, 141, 27);
		bodyPanel.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setBounds(10, 69, 141, 30);
		bodyPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 69, 140, 30);
		bodyPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Age");
		lblNewLabel_1_1_1.setBounds(12, 99, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 122, 140, 30);
		bodyPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Mobile number ");
		lblNewLabel_1_1_2.setBounds(162, 99, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_2);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_3 = new JTextField();
		textField_3.setBounds(160, 120, 140, 30);
		bodyPanel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Email");
		lblNewLabel_1_1_2_1.setBounds(14, 159, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_2_1);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_4 = new JTextField();
		textField_4.setBounds(14, 180, 294, 30);
		bodyPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Address");
		lblNewLabel_1_1_2_1_1.setBounds(14, 207, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_2_1_1);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_5 = new JTextField();
		textField_5.setBounds(12, 229, 300, 30);
		bodyPanel.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("Next");
		btnNewButton_7.setBounds(512, 308, 85, 31);
		bodyPanel.add(btnNewButton_7);
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnNewButton_7_1 = new JButton("Back");
		btnNewButton_7_1.setBounds(64, 344, 85, 31);
		bodyPanel.add(btnNewButton_7_1);
		btnNewButton_7_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblPatientInformation = new JLabel("Patient Information");
		lblPatientInformation.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPatientInformation.setBounds(10, 11, 294, 25);
		bodyPanel.add(lblPatientInformation);
		
		JLabel lblKinsInformation = new JLabel("Kin's Information");
		lblKinsInformation.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblKinsInformation.setBounds(314, 11, 294, 25);
		bodyPanel.add(lblKinsInformation);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(308, 0, 1, 375);
		bodyPanel.add(separator);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientInfo frame = new PatientInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
