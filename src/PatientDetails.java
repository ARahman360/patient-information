import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import components.HeaderPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class PatientDetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_1_2;
	private JLabel lblNewLabel_1_1_2_1;
	private JButton btnNewButton_7;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JSeparator separator;
	private JLabel lblNewLabel_1_1_2_3;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_1_1_3;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_1_1_4;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_1_1_2_2;
	private JLabel lblNewLabel_12;
	private JSeparator separator_1;
	private JLabel lblNewLabel_1_1_2_4;
	private JLabel lblNewLabel_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					PatientDetails frame = new PatientDetails();
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
	public PatientDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Header Panel
		HeaderPanel headerPanel = new HeaderPanel("Patient Details");
		headerPanel.setBounds(0, 0, 800, 50);
		contentPane.add(headerPanel);
		
		lblNewLabel_1 = new JLabel("Patient name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 60, 141, 27);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_1_1 = new JLabel("Patient age");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 112, 141, 27);
		contentPane.add(lblNewLabel_1_1);
		
		lblNewLabel_1_1_1 = new JLabel("Mobile number ");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(10, 164, 141, 27);
		contentPane.add(lblNewLabel_1_1_1);
		
		lblNewLabel_1_1_2 = new JLabel("Email");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2.setBounds(10, 216, 141, 27);
		contentPane.add(lblNewLabel_1_1_2);
		
		lblNewLabel_1_1_2_1 = new JLabel("Address");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2_1.setBounds(10, 268, 141, 27);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		btnNewButton_7 = new JButton("Go back");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_7.setBounds(717, 387, 85, 31);
		contentPane.add(btnNewButton_7);
		
		lblNewLabel = new JLabel("Abdur Rahman");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 86, 141, 27);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("Abdur Rahman");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 138, 141, 27);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Abdur Rahman");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 190, 141, 27);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Abdur Rahman");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(10, 242, 141, 27);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Abdur Rahman");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(10, 294, 141, 27);
		contentPane.add(lblNewLabel_5);
		
		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(369, 50, 1, 350);
		contentPane.add(separator);
		
		lblNewLabel_1_1_2_3 = new JLabel("Medical problem");
		lblNewLabel_1_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2_3.setBounds(10, 321, 141, 27);
		contentPane.add(lblNewLabel_1_1_2_3);
		
		lblNewLabel_6 = new JLabel("Abdur Rahman");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(10, 347, 141, 27);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Kin's name");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(380, 60, 141, 27);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Abdur Rahman");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_8.setBounds(380, 86, 141, 27);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_1_2 = new JLabel("Relation with patient");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(380, 112, 141, 27);
		contentPane.add(lblNewLabel_1_2);
		
		lblNewLabel_9 = new JLabel("Abdur Rahman");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_9.setBounds(380, 138, 141, 27);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_1_1_3 = new JLabel("Mobile number ");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_3.setBounds(380, 164, 141, 27);
		contentPane.add(lblNewLabel_1_1_3);
		
		lblNewLabel_10 = new JLabel("Abdur Rahman");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_10.setBounds(380, 190, 141, 27);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_1_1_4 = new JLabel("Email");
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_4.setBounds(380, 216, 141, 27);
		contentPane.add(lblNewLabel_1_1_4);
		
		lblNewLabel_11 = new JLabel("Abdur Rahman");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_11.setBounds(380, 242, 141, 27);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_1_1_2_2 = new JLabel("Address");
		lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2_2.setBounds(380, 268, 141, 27);
		contentPane.add(lblNewLabel_1_1_2_2);
		
		lblNewLabel_12 = new JLabel("Abdur Rahman");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_12.setBounds(380, 294, 141, 27);
		contentPane.add(lblNewLabel_12);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(385, 326, 415, 2);
		contentPane.add(separator_1);
		
		lblNewLabel_1_1_2_4 = new JLabel("Visit number");
		lblNewLabel_1_1_2_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2_4.setBounds(380, 333, 141, 27);
		contentPane.add(lblNewLabel_1_1_2_4);
		
		lblNewLabel_13 = new JLabel("88888888");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_13.setBounds(380, 359, 141, 27);
		contentPane.add(lblNewLabel_13);
	}

}
