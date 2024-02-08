import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import components.BodyPanel;
import components.HeaderPanel;
import components.SidebarPanel;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
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
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

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
		setBounds(100, 100, 812, 463);
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
		
		
		JButton btnNewButton_7_1 = new JButton("Back");
		btnNewButton_7_1.setBounds(5, 306, 85, 31);
		bodyPanel.add(btnNewButton_7_1);
		btnNewButton_7_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewLabel_1 = new JLabel("Confirm booking?");
		lblNewLabel_1.setBounds(237, 0, 118, 27);
		bodyPanel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(150, 32, 290, 35);
		bodyPanel.add(btnConfirm);
		
		JButton btnLater = new JButton("Later");
		btnLater.setBounds(150, 77, 290, 35);
		bodyPanel.add(btnLater);
		btnLater.setBackground(new Color(255, 255, 255));
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 134, 600, 2);
		bodyPanel.add(separator_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Your visit number:");
		lblNewLabel_1_1.setBounds(5, 144, 140, 27);
		bodyPanel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("88888888");
		lblNewLabel_1_1_1.setBounds(150, 178, 140, 27);
		bodyPanel.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnNewButton_7_1_1 = new JButton("Back");
		btnNewButton_7_1_1.setBounds(513, 306, 85, 31);
		bodyPanel.add(btnNewButton_7_1_1);
		btnNewButton_7_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
