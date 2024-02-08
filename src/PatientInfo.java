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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PatientInfo extends JFrame {
	private String selectedProblem;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFirstName;
	private JTextField textSurName;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	public PatientInfo(String selectedProblem) {
		this.selectedProblem = selectedProblem;
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
		
		textFirstName = new JTextField();
		textFirstName.setBounds(10, 69, 135, 30);
		bodyPanel.add(textFirstName);
		textFirstName.setColumns(10);
		
		textSurName = new JTextField();
		textSurName.setBounds(152, 69, 135, 30);
		bodyPanel.add(textSurName);
		textSurName.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Date of birth");
		lblNewLabel_1_1_1.setBounds(12, 99, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 122, 140, 30);
		bodyPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Mobile number ");
		lblNewLabel_1_1_2.setBounds(155, 99, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_2);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_3 = new JTextField();
		textField_3.setBounds(155, 121, 132, 30);
		bodyPanel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Email");
		lblNewLabel_1_1_2_1.setBounds(10, 158, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_2_1);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 183, 277, 30);
		bodyPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Address");
		lblNewLabel_1_1_2_1_1.setBounds(10, 211, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_2_1_1);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 234, 277, 52);
		bodyPanel.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("Next");
		btnNewButton_7.setBounds(523, 330, 85, 31);
		bodyPanel.add(btnNewButton_7);
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton goBackButton = new JButton("Back");
		goBackButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				MedicalAilments medicalAilments = new MedicalAilments();
				medicalAilments.setVisible(true);
			}
		});
		goBackButton.setBounds(10, 330, 85, 31);
		bodyPanel.add(goBackButton);
		goBackButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
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
		
		JLabel lblPatientsProblem = new JLabel("Patient's Problem:");
		lblPatientsProblem.setForeground(Color.DARK_GRAY);
		lblPatientsProblem.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPatientsProblem.setBounds(105, 328, 403, 20);
		bodyPanel.add(lblPatientsProblem);
		
		JLabel problemDetailsText = new JLabel("Problem Details");
		problemDetailsText.setFont(new Font("Tahoma", Font.PLAIN, 14));
		problemDetailsText.setBounds(105, 345, 408, 20);
		problemDetailsText.setText(selectedProblem);
		bodyPanel.add(problemDetailsText);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(313, 234, 277, 52);
		bodyPanel.add(textField_6);
		
		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Address");
		lblNewLabel_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2_1_1_1.setBounds(313, 211, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_2_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(313, 183, 277, 30);
		bodyPanel.add(textField_7);
		
		JLabel lblNewLabel_1_1_2_1_2 = new JLabel("Email");
		lblNewLabel_1_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2_1_2.setBounds(313, 158, 141, 27);
		bodyPanel.add(lblNewLabel_1_1_2_1_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(458, 121, 132, 30);
		bodyPanel.add(textField_8);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Mobile number ");
		lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2_2.setBounds(458, 99, 135, 27);
		bodyPanel.add(lblNewLabel_1_1_2_2);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					PatientInfo frame = new PatientInfo("Example Problem");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
