import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class Calculator1 extends JFrame {

	private JPanel contentPane;
	private double answer,number;	
	int operation=1;
	private JTextField textField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator1 frame = new Calculator1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public void calculate() {
		switch(operation) {
		case 1:
			answer= number + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer));
			break;
		case 2:
			answer= number - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer));
			break;
		case 3:
			answer= number * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer));
			break;
		case 4:
			answer= number / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer));
			break;
		}
	}
	
	
	
	
	public Calculator1() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel secreen = new JPanel();
		secreen.setBounds(10, 0, 392, 67);
		contentPane.add(secreen);
		secreen.setLayout(null);
		
		JLabel lbl = new JLabel("");
		lbl.setBackground(Color.GRAY);
		lbl.setBounds(0, 0, 372, 25);
		secreen.add(lbl);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 34, 362, 33);
		secreen.add(textField);
		textField.setColumns(10);
		
		JPanel control = new JPanel();
		control.setBounds(10, 98, 382, 377);
		contentPane.add(control);
		control.setLayout(new GridLayout(4, 4, 15, 15));
		
		JButton btnNewButton_3 = new JButton("0");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + e.getActionCommand());
			}
		
		});
		
		
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("Calibri", Font.BOLD, 23));
		control.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("=");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lbl.setText("");
			}
		});
		btnNewButton_3_1.setBackground(Color.PINK);
		btnNewButton_3_1.setFont(new Font("Calibri", Font.BOLD, 23));
		control.add(btnNewButton_3_1);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				lbl.setText("");
			}
		});
		
		
		
		btnC.setBackground(Color.PINK);
		btnC.setFont(new Font("Calibri", Font.BOLD, 23));
		control.add(btnC);
		
		JButton btnNewButton_6 = new JButton("+");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(textField.getText());
				operation=1;
				textField.setText("");
				lbl.setText(number + "+");
			}
		});
		
		
		
		btnNewButton_6.setBackground(Color.PINK);
		btnNewButton_6.setFont(new Font("Calibri", Font.BOLD, 23));
		control.add(btnNewButton_6);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + e.getActionCommand());
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 23));
		control.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + e.getActionCommand());
			}
		});
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setFont(new Font("Calibri", Font.BOLD, 23));
		control.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + e.getActionCommand());
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 23));
		control.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("-");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(textField.getText());
				operation=2;
				textField.setText("");
				lbl.setText(number + " -");
			}
		});
		btnNewButton_4.setBackground(Color.PINK);
		btnNewButton_4.setFont(new Font("Calibri", Font.BOLD, 23));
		control.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + e.getActionCommand());
			}
		});
		btnNewButton_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton_5.setFont(new Font("Calibri", Font.BOLD, 23));
		control.add(btnNewButton_5);
		
		JButton btnNewButton_10 = new JButton("5");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + e.getActionCommand());
			}
		});
		btnNewButton_10.setBackground(Color.LIGHT_GRAY);
		btnNewButton_10.setFont(new Font("Calibri", Font.BOLD, 23));
		control.add(btnNewButton_10);
		
		JButton btnNewButton_12 = new JButton("6");
		btnNewButton_12.setBackground(Color.LIGHT_GRAY);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + e.getActionCommand());
			}
		});
		btnNewButton_12.setFont(new Font("Calibri", Font.BOLD, 23));
		control.add(btnNewButton_12);
		
		JButton btnNewButton_11 = new JButton("*");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(textField.getText());
				operation=3;
				textField.setText("");
				lbl.setText(number + " *" );
			}
		});
		btnNewButton_11.setBackground(Color.PINK);
		btnNewButton_11.setFont(new Font("Calibri", Font.BOLD, 23));
		control.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("1");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + e.getActionCommand());
			}
		});
		btnNewButton_13.setBackground(Color.LIGHT_GRAY);
		btnNewButton_13.setFont(new Font("Calibri", Font.BOLD, 23));
		control.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("2");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + e.getActionCommand());
			}
		});
		btnNewButton_14.setBackground(Color.LIGHT_GRAY);
		btnNewButton_14.setFont(new Font("Calibri", Font.BOLD, 23));
		control.add(btnNewButton_14);
		
		JButton btnNewButton_3_2 = new JButton("3");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + e.getActionCommand());
			}
		});
		btnNewButton_3_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3_2.setFont(new Font("Calibri", Font.BOLD, 23));
		control.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_3 = new JButton("/");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(textField.getText());
				operation=4;
				textField.setText("");
				lbl.setText(number + "/");
			}
		});
		btnNewButton_3_3.setBackground(Color.PINK);
		btnNewButton_3_3.setFont(new Font("Calibri", Font.BOLD, 23));
		control.add(btnNewButton_3_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(213, 11, 179, 14);
		contentPane.add(lblNewLabel);
	}
}
