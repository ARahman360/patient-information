import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class medicalailments extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		btnNewButton.setBounds(10, 42, 164, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DASHBOARD");
		btnNewButton_1.setBounds(10, 95, 164, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DASHBOARD");
		btnNewButton_2.setBounds(10, 154, 164, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DASHBOARD");
		btnNewButton_3.setBounds(10, 206, 164, 35);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("DASHBOARD");
		btnNewButton_4.setBounds(10, 262, 164, 35);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("DASHBOARD");
		btnNewButton_5.setBounds(10, 307, 164, 35);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("DASHBOARD");
		btnNewButton_6.setBounds(10, 354, 164, 35);
		contentPane.add(btnNewButton_6);
	}
}
