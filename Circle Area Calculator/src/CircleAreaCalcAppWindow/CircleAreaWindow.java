package CircleAreaCalcAppWindow;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class CircleAreaWindow {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircleAreaWindow window = new CircleAreaWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CircleAreaWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Calculate Area");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Maiandra GD", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num1; double ans;
				try {
					num1 = Double.parseDouble(textField.getText());
					if(num1 > 0) {
					ans = num1*num1*3.14;
					textField_1.setText(Double.toString(ans));
					}
					if(num1 < 0) {
					JOptionPane.showMessageDialog(null, "Please enter a positive number");
					}
					}
				catch(Exception r) {
					JOptionPane.showMessageDialog(null, "Please Enter a valid number");
				}
			}
		});
		btnNewButton.setBounds(144, 83, 133, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField.setBounds(168, 46, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Please Enter Your Radius");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(123, 11, 187, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblTheAreaOf = new JLabel("The area of your circle is:");
		lblTheAreaOf.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTheAreaOf.setBounds(10, 142, 196, 56);
		frame.getContentPane().add(lblTheAreaOf);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_1.setBounds(216, 162, 133, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
