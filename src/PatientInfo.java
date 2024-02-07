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

public class PatientInfo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public PatientInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPatientInfo = new JLabel("Patient Info ");
		lblPatientInfo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPatientInfo.setBounds(310, 10, 126, 28);
		contentPane.add(lblPatientInfo);
		
		JLabel lblNewLabel_2 = new JLabel("BMH");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(10, 10, 57, 28);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 48, 781, 11);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton("DASHBOARD");
		btnNewButton.setBounds(10, 58, 164, 35);
		contentPane.add(btnNewButton);
		
		JButton btnAppoinments = new JButton("APPOINMENTS");
		btnAppoinments.setBounds(10, 103, 164, 35);
		contentPane.add(btnAppoinments);
		
		JButton btnPatientInfo = new JButton("PATIENT INFO");
		btnPatientInfo.setBounds(10, 148, 164, 35);
		contentPane.add(btnPatientInfo);
		
		JButton btnPharmacy = new JButton("PHARMACY");
		btnPharmacy.setBounds(10, 193, 164, 35);
		contentPane.add(btnPharmacy);
		
		JButton btnDoctorReview = new JButton("DOCTOR REVIEW");
		btnDoctorReview.setBounds(10, 238, 164, 35);
		contentPane.add(btnDoctorReview);
		
		JButton btnFinance = new JButton("RESTAURANT");
		btnFinance.setBounds(10, 283, 164, 35);
		contentPane.add(btnFinance);
		
		JButton btnFinance_1 = new JButton("FINANCE");
		btnFinance_1.setBounds(10, 328, 164, 35);
		contentPane.add(btnFinance_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(184, 58, 2, 305);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Personal details");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(196, 58, 141, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("First name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(196, 89, 141, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Surname");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(377, 89, 141, 27);
		contentPane.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(194, 111, 164, 30);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(374, 111, 164, 30);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Age");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(196, 141, 141, 27);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(194, 164, 164, 30);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Mobile number ");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2.setBounds(196, 193, 141, 27);
		contentPane.add(lblNewLabel_1_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(194, 214, 242, 30);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Email");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2_1.setBounds(196, 246, 141, 27);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(196, 267, 342, 30);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Address");
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2_1_1.setBounds(196, 294, 141, 27);
		contentPane.add(lblNewLabel_1_1_2_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(194, 316, 344, 30);
		contentPane.add(textField_5);
		
		JButton btnNewButton_7 = new JButton("Next");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_7.setBounds(706, 366, 85, 31);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_7_1 = new JButton("Back");
		btnNewButton_7_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_7_1.setBounds(196, 366, 85, 31);
		contentPane.add(btnNewButton_7_1);
	}
}
