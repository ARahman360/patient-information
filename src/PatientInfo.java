import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
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
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

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
		lblNewLabel_1_1.setBounds(10, 47, 141, 27);
		bodyPanel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1_2 = new JLabel("Surname");
		lblNewLabel_1_2.setBounds(155, 47, 141, 27);
		bodyPanel.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setBounds(10, 69, 135, 30);
		bodyPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(152, 69, 135, 30);
		bodyPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Date of birth");
		lblNewLabel_1_1_1.setBounds(12, 99, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 122, 140, 30);
		bodyPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Mobile number ");
		lblNewLabel_1_1_2.setBounds(10, 150, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_2);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 172, 140, 30);
		bodyPanel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Email");
		lblNewLabel_1_1_2_1.setBounds(10, 200, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_2_1);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 225, 277, 30);
		bodyPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Address");
		lblNewLabel_1_1_2_1_1.setBounds(10, 253, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_2_1_1);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 276, 277, 30);
		bodyPanel.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("Next");
		btnNewButton_7.setBounds(523, 330, 85, 31);
		bodyPanel.add(btnNewButton_7);
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnNewButton_7_1 = new JButton("Back");
		btnNewButton_7_1.setBounds(10, 330, 85, 31);
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
		separator.setBounds(300, 0, 1, 315);
		bodyPanel.add(separator);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(311, 276, 277, 30);
		bodyPanel.add(textField_6);
		
		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Address");
		lblNewLabel_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2_1_1_1.setBounds(311, 253, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_2_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(311, 225, 277, 30);
		bodyPanel.add(textField_7);
		
		JLabel lblNewLabel_1_1_2_1_2 = new JLabel("Email");
		lblNewLabel_1_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2_1_2.setBounds(311, 200, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_2_1_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(311, 172, 140, 30);
		bodyPanel.add(textField_8);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Mobile number ");
		lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2_2.setBounds(311, 150, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_2_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(311, 122, 140, 30);
		bodyPanel.add(textField_9);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Relation");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(313, 99, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_1_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(311, 69, 135, 30);
		bodyPanel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(456, 69, 135, 30);
		bodyPanel.add(textField_11);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Surname");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(456, 47, 141, 27);
		bodyPanel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("First name");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_3.setBounds(311, 47, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 316, 615, 4);
		bodyPanel.add(separator_1);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					PatientInfo frame = new PatientInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
