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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BookingConfirmation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingConfirmation frame = new BookingConfirmation();
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
	public BookingConfirmation() {
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
		
		JLabel lblBookingConfirmation = new JLabel("Booking confirmation");
		lblBookingConfirmation.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBookingConfirmation.setBounds(278, 11, 228, 28);
		contentPane_1.add(lblBookingConfirmation);
		
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
		
		JButton btnNewButton_7_1 = new JButton("Back");
		btnNewButton_7_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_7_1.setBounds(196, 366, 85, 31);
		contentPane_1.add(btnNewButton_7_1);
		
		JLabel lblNewLabel_1 = new JLabel("Confirm booking?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(428, 60, 118, 27);
		contentPane_1.add(lblNewLabel_1);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfirm.setBounds(341, 92, 290, 35);
		contentPane_1.add(btnConfirm);
		
		JButton btnLater = new JButton("Later");
		btnLater.setBackground(new Color(255, 255, 255));
		btnLater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLater.setBounds(341, 137, 290, 35);
		contentPane_1.add(btnLater);
	}
}
