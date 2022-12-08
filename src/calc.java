import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btnPlus;
	private JButton btnResult;
	private JButton btn_6;
	private JButton btn_9;
	private JButton btnClear;

	double num1, num2, result;
	String action = "", finalResult;
	private JButton btnMinus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc frame = new calc();
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
	public calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField.setBounds(22, 26, 466, 61);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = "1";
				number = textField.getText() + number;
				textField.setText(number);

			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn1.setBounds(22, 201, 95, 61);
		contentPane.add(btn1);

		btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = "2";
				number = textField.getText() + number;
				textField.setText(number);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn_2.setBounds(146, 201, 95, 61);
		contentPane.add(btn_2);

		btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = "3";
				number = textField.getText() + number;
				textField.setText(number);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn_3.setBounds(283, 201, 95, 61);
		contentPane.add(btn_3);

		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// String number="+";
				// number=textField.getText()+ number;
				// textField.setText(number);

				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnPlus.setBounds(393, 129, 95, 61);
		contentPane.add(btnPlus);

		btnResult = new JButton("=");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(textField.getText());
				finalResult = "";

				
				switch (action) {
				case "+":
					result = num1 + num2;
					finalResult = String.format("%.0f + %.0f = %.0f", num1, num2, result);
					break;

				case "-":
					result = num1 - num2;
					finalResult = String.format("%.0f - %.0f = %.0f", num1, num2, result);
					break;
					
				case "*":
					result = num1 * num2;
					finalResult = String.format("%.0f X %.0f = %.0f", num1, num2, result);
					break;
					
				case "/":
					result = num1 / num2;
					finalResult = String.format("%.0f / %.0f = %.2f", num1, num2, result);
					break;
				}
				textField.setText(finalResult);

			}
		});
		btnResult.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnResult.setBounds(283, 448, 205, 61);
		contentPane.add(btnResult);

		btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = "6";
				number = textField.getText() + number;
				textField.setText(number);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn_6.setBounds(283, 283, 95, 61);
		contentPane.add(btn_6);

		btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = "9";
				number = textField.getText() + number;
				textField.setText(number);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn_9.setBounds(283, 366, 95, 61);
		contentPane.add(btn_9);

		btnClear = new JButton("<-");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);

					textField.setText(str.toString());
				}
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnClear.setBounds(206, 129, 172, 61);
		contentPane.add(btnClear);

		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnMinus.setBounds(393, 201, 95, 61);
		contentPane.add(btnMinus);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = "4";
				number = textField.getText() + number;
				textField.setText(number);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn_4.setBounds(22, 283, 95, 61);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = "5";
				number = textField.getText() + number;
				textField.setText(number);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn_5.setBounds(146, 283, 95, 61);
		contentPane.add(btn_5);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = "7";
				number = textField.getText() + number;
				textField.setText(number);
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn_7.setBounds(22, 366, 95, 61);
		contentPane.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = "8";
				number = textField.getText() + number;
				textField.setText(number);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn_8.setBounds(146, 366, 95, 61);
		contentPane.add(btn_8);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnReset.setBounds(22, 129, 154, 61);
		contentPane.add(btnReset);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = "0";
				number = textField.getText() + number;
				textField.setText(number);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn_0.setBounds(146, 448, 95, 61);
		contentPane.add(btn_0);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "*";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnMultiply.setBounds(393, 283, 95, 61);
		contentPane.add(btnMultiply);
		
		JButton btnDevide = new JButton("/");
		btnDevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "/";
			}
		});
		btnDevide.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnDevide.setBounds(393, 366, 95, 61);
		contentPane.add(btnDevide);
	}
}
