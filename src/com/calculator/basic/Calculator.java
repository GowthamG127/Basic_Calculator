package com.calculator.basic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ButtonGroup;

public class Calculator {

	double first_number,second_number,result,power;
	String operator,answer;
	
	private JFrame frame;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 415, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Rufscript", Font.BOLD, 20));
		textField.setBounds(12, 24, 380, 54);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_0.getText();
				textField.setText(number);
			}
		});
		button_0.setBounds(12, 322, 92, 42);
		frame.getContentPane().add(button_0);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_7.getText();
				textField.setText(number);
			}
		});
		button_7.setBounds(12, 160, 92, 42);
		frame.getContentPane().add(button_7);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_4.getText();
				textField.setText(number);
			}
		});
		button_4.setBounds(12, 214, 92, 42);
		frame.getContentPane().add(button_4);
		
		JButton button_decimal = new JButton(".");
		button_decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_decimal.getText();
				textField.setText(number);
			}
		});
		button_decimal.setBounds(12, 376, 92, 42);
		frame.getContentPane().add(button_decimal);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_8.getText();
				textField.setText(number);
			}
		});
		button_8.setBounds(116, 160, 92, 42);
		frame.getContentPane().add(button_8);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_5.getText();
				textField.setText(number);
			}
		});
		button_5.setBounds(116, 214, 92, 42);
		frame.getContentPane().add(button_5);
		
		JButton button_00 = new JButton("00");
		button_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_00.getText();
				textField.setText(number);
			}
		});
		button_00.setBounds(116, 322, 92, 42);
		frame.getContentPane().add(button_00);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_9.getText();
				textField.setText(number);
			}
		});
		button_9.setBounds(220, 160, 92, 42);
		frame.getContentPane().add(button_9);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_6.getText();
				textField.setText(number);
			}
		});
		button_6.setBounds(220, 214, 92, 42);
		frame.getContentPane().add(button_6);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_1.getText();
				textField.setText(number);
			}
		});
		button_1.setBounds(12, 268, 92, 42);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setBounds(116, 268, 92, 42);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_2.getText();
				textField.setText(number);
			}
		});
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_3.getText();
				textField.setText(number);
			}
		});
		button_3.setBounds(220, 268, 92, 42);
		frame.getContentPane().add(button_3);
		
		JButton button_addition = new JButton("+");
		button_addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_number=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operator = "+";
			}
		});
		button_addition.setBounds(324, 322, 68, 96);
		frame.getContentPane().add(button_addition);
		
		JButton button_subtraction = new JButton("-");
		button_subtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_number=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operator = "-";
			}
		});
		button_subtraction.setBounds(324, 268, 68, 42);
		frame.getContentPane().add(button_subtraction);
		
		JButton button_division = new JButton("/");
		button_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_number=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operator = "/";
			}
		});
		button_division.setBounds(324, 160, 68, 42);
		frame.getContentPane().add(button_division);
		
		JButton button_percentage = new JButton("%");
		button_percentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_number=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operator = "%";
			}
		});
		button_percentage.setBounds(116, 376, 92, 42);
		frame.getContentPane().add(button_percentage);
		
		JButton button_multiplication = new JButton("*");
		button_multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_number=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operator = "*";
			}
		});
		button_multiplication.setBounds(324, 214, 68, 42);
		frame.getContentPane().add(button_multiplication);
		
		JButton button_Clear = new JButton("C");
		button_Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		button_Clear.setBounds(324, 106, 68, 42);
		frame.getContentPane().add(button_Clear);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button_Backspace =null;
				if(textField.getText().length()>0) {
					StringBuilder string = new StringBuilder(textField.getText());
					string.deleteCharAt(textField.getText().length()-1);
					button_Backspace = string.toString();
					textField.setText(button_Backspace);
				}
			}
		});
		btnBack.setBounds(220, 106, 92, 42);
		frame.getContentPane().add(btnBack);
		
		JButton button_equals = new JButton("=");
		button_equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	String answer;
				second_number = Double.parseDouble(textField.getText());
				if(operator =="+") {
					result = first_number + second_number;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operator =="-") {
					result = first_number - second_number;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operator == "*") {
					result = first_number * second_number;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operator == "/") {
					result = first_number / second_number;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operator == "%") {
					result = first_number % second_number;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operator == "^") {
					power = 1;
					while(second_number !=0) {
						power *=first_number;
						--second_number;
					}
					answer = String.format("%.2f", power);
					textField.setText(answer);
				}
			}
		});
		button_equals.setBounds(220, 376, 92, 42);
		frame.getContentPane().add(button_equals);
		
		JButton btnEx = new JButton("^");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_number=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operator = "^";
			}
		});
		btnEx.setBounds(220, 322, 92, 42);
		frame.getContentPane().add(btnEx);
		
		JTextPane txtpnGowthamG = new JTextPane();
		txtpnGowthamG.setBackground(Color.GRAY);
		txtpnGowthamG.setFont(new Font("Rufscript", Font.BOLD | Font.ITALIC, 30));
		txtpnGowthamG.setText(" gowtham g");
		txtpnGowthamG.setBounds(12, 106, 196, 42);
		frame.getContentPane().add(txtpnGowthamG);
	}
}
