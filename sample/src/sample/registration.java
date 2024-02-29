package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;

public class registration {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
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
	public registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(0, 0, 160));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"cse", "ece", "mech"}));
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(178, 122, 84, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(184, 11, 88, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(75, 91, 64, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Branch");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(75, 130, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("User Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(75, 52, 80, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 218, 6));
		passwordField.setBounds(178, 85, 84, 20);
		frame.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 219, 13));
		textField.setBounds(177, 44, 85, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(75, 167, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBackground(new Color(221, 168, 153));
		r2.setBounds(270, 163, 88, 23);
		frame.getContentPane().add(r2);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBackground(new Color(221, 168, 153));
		r1.setBounds(184, 163, 64, 23);
		frame.getContentPane().add(r1);
		
		JLabel lblNewLabel_6 = new JLabel("City");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(75, 205, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(221, 168, 153));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"paris", "czech", "india"}));
		comboBox_1.setMaximumRowCount(3);
		comboBox_1.setBounds(178, 201, 84, 22);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb1.getText();
				String branch=(String) cb1.getSelectedItem();
				String city=(String) cb2.getSelectedItem();
				RadioButtonGroup rgb=new RadioButtonGroup();
				rgb.add(r1);
				rgb.add(r2);
				String gender;
				if(rgb.isSelected(r1))
					gender="male";
				if(rgb.isSelected(r2))
					gender="Female";
				
			}
		});
		btnNewButton.setBounds(173, 234, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\de4d0f200bb9f25b8c80aa50fd048f.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 257);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
