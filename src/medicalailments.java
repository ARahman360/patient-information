import java.awt.EventQueue;

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

public class medicalailments extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Searchoption;
	private JTextField disabilityaddoption;
	private JTextField Requirementsfield;
	private JTextField DateofBirth;

	/**
	 * Launch the application. Change from Rashed
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					medicalailments frame = new medicalailments();
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
	public medicalailments() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("DASHBOARD");
		btnNewButton.setBounds(10, 55, 164, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("APPOINMENTS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(10, 100, 164, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("PATIENT INFO");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(10, 145, 164, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("PHARMACY");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(10, 190, 164, 35);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("DOCTOR REVIEW");
		btnNewButton_4.setBounds(10, 235, 164, 35);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("RESTAURANT");
		btnNewButton_5.setBounds(10, 280, 164, 35);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("FINANCE");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBounds(10, 327, 164, 35);
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel = new JLabel("Medical Ailments");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(309, 10, 185, 28);
		contentPane.add(lblNewLabel);
		
		Searchoption = new JTextField();
		Searchoption.setBounds(309, 59, 341, 27);
		contentPane.add(Searchoption);
		Searchoption.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("What problem are you facing?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(228, 89, 198, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Can't find relative problem?");
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
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_7.setBounds(706, 387, 85, 31);
		contentPane.add(btnNewButton_7);
		
		JLabel lblNewLabel_2 = new JLabel("BMH");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(10, 9, 57, 28);
		contentPane.add(lblNewLabel_2);
		
		disabilityaddoption = new JTextField();
		disabilityaddoption.setBounds(228, 251, 422, 30);
		contentPane.add(disabilityaddoption);
		disabilityaddoption.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 47, 781, 11);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(184, 57, 2, 305);
		contentPane.add(separator_1);
		
		Requirementsfield = new JTextField();
		Requirementsfield.setColumns(10);
		Requirementsfield.setBounds(402, 327, 248, 30);
		contentPane.add(Requirementsfield);
		
		DateofBirth = new JTextField();
		DateofBirth.setColumns(10);
		DateofBirth.setBounds(228, 327, 164, 30);
		contentPane.add(DateofBirth);
	}
}
