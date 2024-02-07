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

public class KinsInfo extends JFrame {

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
					KinsInfo frame = new KinsInfo();
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
	public KinsInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 799, 407);
		contentPane.add(contentPane_1);
		
		JLabel lblKinsInfo = new JLabel("Kin's Info");
		lblKinsInfo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblKinsInfo.setBounds(310, 10, 126, 28);
		contentPane_1.add(lblKinsInfo);
		
		JLabel lblNewLabel_2 = new JLabel("BMH");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(10, 10, 57, 28);
		contentPane_1.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 48, 781, 11);
		contentPane_1.add(separator);
		
		JButton btnNewButton = new JButton("DASHBOARD");
		btnNewButton.setBounds(10, 58, 164, 35);
		contentPane_1.add(btnNewButton);
		
		JButton btnAppoinments = new JButton("APPOINMENTS");
		btnAppoinments.setBounds(10, 103, 164, 35);
		contentPane_1.add(btnAppoinments);
		
		JButton btnPatientInfo = new JButton("PATIENT INFO");
		btnPatientInfo.setBounds(10, 148, 164, 35);
		contentPane_1.add(btnPatientInfo);
		
		JButton btnPharmacy = new JButton("PHARMACY");
		btnPharmacy.setBounds(10, 193, 164, 35);
		contentPane_1.add(btnPharmacy);
		
		JButton btnDoctorReview = new JButton("DOCTOR REVIEW");
		btnDoctorReview.setBounds(10, 238, 164, 35);
		contentPane_1.add(btnDoctorReview);
		
		JButton btnFinance = new JButton("RESTAURANT");
		btnFinance.setBounds(10, 283, 164, 35);
		contentPane_1.add(btnFinance);
		
		JButton btnFinance_1 = new JButton("FINANCE");
		btnFinance_1.setBounds(10, 328, 164, 35);
		contentPane_1.add(btnFinance_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(184, 58, 2, 305);
		contentPane_1.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Kin's details");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(196, 58, 141, 27);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("First name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(196, 89, 141, 27);
		contentPane_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Surname");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(377, 89, 141, 27);
		contentPane_1.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(194, 111, 164, 30);
		contentPane_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(374, 111, 164, 30);
		contentPane_1.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Relation");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(196, 141, 141, 27);
		contentPane_1.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(194, 164, 242, 30);
		contentPane_1.add(textField_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Mobile number ");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2.setBounds(196, 193, 141, 27);
		contentPane_1.add(lblNewLabel_1_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(196, 215, 242, 30);
		contentPane_1.add(textField_3);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Email");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2_1.setBounds(196, 246, 141, 27);
		contentPane_1.add(lblNewLabel_1_1_2_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(196, 268, 342, 30);
		contentPane_1.add(textField_4);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Address");
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2_1_1.setBounds(196, 294, 141, 27);
		contentPane_1.add(lblNewLabel_1_1_2_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(194, 316, 344, 30);
		contentPane_1.add(textField_5);
		
		JButton btnNewButton_7 = new JButton("Next");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_7.setBounds(706, 366, 85, 31);
		contentPane_1.add(btnNewButton_7);
		
		JButton btnNewButton_7_1 = new JButton("Back");
		btnNewButton_7_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_7_1.setBounds(196, 366, 85, 31);
		contentPane_1.add(btnNewButton_7_1);
	}
}
