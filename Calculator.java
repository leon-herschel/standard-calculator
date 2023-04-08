package GUIActivity;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private String operator;
	private double operand1;
    private double operand2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setResizable(false);
		setBackground(new Color(240, 240, 240));
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(206, 196, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setEditable(false);
		textField.setBackground(new Color(225, 226, 255));
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 45));
		textField.setBounds(10, 11, 386, 100);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setMargin(new Insets(0, 0, 0, 10));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton percentButton = new JButton("%");
		percentButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	 String displayText = textField.getText();
		         String[] parts = displayText.split("\\s+");
		         if (parts.length == 1) {
		             double operand = Double.parseDouble(parts[0]);
		             double result = operand / 100;
		             textField.setText(Double.toString(result));
		         } else if (parts.length == 3) {
		             double operand1 = Double.parseDouble(parts[0]);
		             double operand2 = Double.parseDouble(parts[2]);
		             double result = operand1 * (operand2 / 100);
		            
		             textField.setText(Double.toString(result));
		         }
		     }
		 });

		percentButton.setBackground(new Color(225, 226, 255));
		percentButton.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		percentButton.setBounds(10, 122, 89, 50);
		contentPane.add(percentButton);
		
		JButton sqrRootButton = new JButton("√");
		sqrRootButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    String displayText = textField.getText();
			    String[] parts = displayText.split("\\s+");
			    if (parts.length == 1) {
			        double operand = Double.parseDouble(parts[0]);
			        double result = Math.sqrt(operand);
			        String formattedResult = String.format("%.14g", result);
			        if (formattedResult.contains(".")) {
			            formattedResult = formattedResult.replaceAll("0+$", "");
			            formattedResult = formattedResult.replaceAll("\\.$", "");
			        }
			        textField.setText(formattedResult);
			    } else if (parts.length == 3) {
			        double operand2 = Double.parseDouble(parts[2]);
			        double result = Math.sqrt(operand2);
			        String formattedResult = String.format("%.14g", result);
			        if (formattedResult.contains(".")) {
			            formattedResult = formattedResult.replaceAll("0+$", "");
			            formattedResult = formattedResult.replaceAll("\\.$", "");
			        }
			        textField.setText(formattedResult);
			    }
			}
		});
		sqrRootButton.setBackground(new Color(225, 226, 255));
		sqrRootButton.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		sqrRootButton.setBounds(109, 122, 89, 50);
		contentPane.add(sqrRootButton);
		
		JButton x2button = new JButton("x²");
		x2button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String displayText = textField.getText();
				    String[] parts = displayText.split("\\s+");
				    if (parts.length == 1) {
				        double operand = Double.parseDouble(parts[0]);
				        double result = Math.pow(operand, 2);
				        String formattedResult = String.format("%.14g", result);
				        if (formattedResult.contains(".")) {
				            formattedResult = formattedResult.replaceAll("0+$", "");
				            formattedResult = formattedResult.replaceAll("\\.$", "");
				        }
				        textField.setText(formattedResult);
				    } else if (parts.length == 3) {
				        double operand2 = Double.parseDouble(parts[2]);
				        double result = Math.pow(operand2, 2);
				        String formattedResult = String.format("%.14g", result);
				        if (formattedResult.contains(".")) {
				            formattedResult = formattedResult.replaceAll("0+$", "");
				            formattedResult = formattedResult.replaceAll("\\.$", "");
				        }
				        textField.setText(formattedResult);
				    }
			}
		});
		x2button.setBackground(new Color(225, 226, 255));
		x2button.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		x2button.setBounds(208, 122, 89, 50);
		contentPane.add(x2button);
		
		JButton reciprocalButton = new JButton("¹/ₓ");
		reciprocalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String displayText = textField.getText();
			    String[] parts = displayText.split("\\s+");
			    if (parts.length == 1) {
			        double operand = Double.parseDouble(parts[0]);
			        double result = 1 / operand;
			        String formattedResult = String.format("%.14g", result);
			        if (formattedResult.contains(".")) {
			            formattedResult = formattedResult.replaceAll("0+$", "");
			            formattedResult = formattedResult.replaceAll("\\.$", "");
			        }
			        textField.setText(formattedResult);
			    } else if (parts.length == 3) {
			        double operand2 = Double.parseDouble(parts[2]);
			        double result = 1 / operand2;
			        String formattedResult = String.format("%.14g", result);
			        if (formattedResult.contains(".")) {
			            formattedResult = formattedResult.replaceAll("0+$", "");
			            formattedResult = formattedResult.replaceAll("\\.$", "");
			        }
			        textField.setText(formattedResult);
			    }
				
			}
		});
		reciprocalButton.setBackground(new Color(225, 226, 255));
		reciprocalButton.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		reciprocalButton.setBounds(307, 122, 89, 50);
		contentPane.add(reciprocalButton);
		
		JButton clearButton = new JButton("C");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
		        operand1 = 0;
		        operand2 = 0;
		        operator = "";
			}
		});
		clearButton.setBackground(new Color(225, 226, 255));
		clearButton.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		clearButton.setBounds(109, 183, 89, 50);
		contentPane.add(clearButton);
		
		JButton backspaceButton = new JButton("\u2190");
		backspaceButton.setBackground(new Color(225, 226, 255));
		backspaceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String displayText = textField.getText();
		        if (displayText.length() > 0) {
		            displayText = displayText.substring(0, displayText.length() - 1);
		            textField.setText(displayText);
		        }
			}
		});
		backspaceButton.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		backspaceButton.setBounds(208, 183, 89, 50);
		contentPane.add(backspaceButton);
		
		JButton clearEntryButton = new JButton("CE");
		clearEntryButton.setBackground(new Color(225, 226, 255));
		clearEntryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String displayText = textField.getText();
		        String[] parts = displayText.split("\\s+");
		        if (parts.length > 1) {
		            textField.setText(displayText.substring(0, displayText.lastIndexOf(parts[parts.length-1])));
		        } else {
		            textField.setText("");
		        }
			}
		});
		clearEntryButton.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		clearEntryButton.setBounds(10, 183, 89, 50);
		contentPane.add(clearEntryButton);
		
		JButton divideButton = new JButton("÷");
		divideButton.setBackground(new Color(225, 226, 255));
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = textField.getText();
		        if (currentText.endsWith("+") || currentText.endsWith("-") || 
		                currentText.endsWith("÷") || currentText.endsWith("×")) {
		         
		            currentText = currentText.substring(0, currentText.length() - 1);
		        }
		        operand1 = Double.parseDouble(currentText);
		        operator = divideButton.getText();
		        textField.setText(currentText + " " + operator + " ");
			}
		});
		divideButton.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		divideButton.setBounds(307, 183, 89, 50);
		contentPane.add(divideButton);
		
		JButton multiplyButton = new JButton("×");
		multiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = textField.getText();
		        if (currentText.endsWith("+") || currentText.endsWith("-") || 
		                currentText.endsWith("÷") || currentText.endsWith("×")) {
		         
		            currentText = currentText.substring(0, currentText.length() - 1);
		        }
		        operand1 = Double.parseDouble(currentText);
		        operator = multiplyButton.getText();
		        textField.setText(currentText + " " + operator + " ");
			}
		});
		multiplyButton.setBackground(new Color(225, 226, 255));
		multiplyButton.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		multiplyButton.setBounds(307, 244, 89, 50);
		contentPane.add(multiplyButton);
		
		JButton subtractButton = new JButton("—");
		subtractButton.setBackground(new Color(225, 226, 255));
		subtractButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = textField.getText();
		        if (currentText.endsWith("+") || currentText.endsWith("-") || 
		                currentText.endsWith("÷") || currentText.endsWith("×")) {
		         
		            currentText = currentText.substring(0, currentText.length() - 1);
		        }
		        operand1 = Double.parseDouble(currentText);
		        operator = "-";
		        textField.setText(currentText + " " + operator + " ");
		    }
		});
		subtractButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		subtractButton.setBounds(307, 305, 89, 50);
		contentPane.add(subtractButton);
		
		JButton addButton = new JButton("+");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = textField.getText();
		        if (currentText.endsWith("+") || currentText.endsWith("-") || 
		                currentText.endsWith("÷") || currentText.endsWith("×")) {
		         
		            currentText = currentText.substring(0, currentText.length() - 1);
		        }
		        operand1 = Double.parseDouble(currentText);
		        operator = addButton.getText();
		        textField.setText(currentText + " " + operator + " ");
			}
		});
		addButton.setBackground(new Color(225, 226, 255));
		addButton.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		addButton.setBounds(307, 366, 89, 50);
		contentPane.add(addButton);
		
		JButton equalsButton = new JButton("=");
		equalsButton.setBackground(new Color(225, 226, 255));
		equalsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String displayText = textField.getText();
			    String[] parts = displayText.split("\\s+");
			    operand2 = Double.parseDouble(parts[parts.length - 1]);
			    switch (operator) {
			        case "+":
			            operand1 += operand2;
			            break;
			        case "-":
			            operand1 -= operand2;
			            break;
			        case "×":
			            operand1 *= operand2;
			            break;
			        case "÷":
			        	if (operand2 == 0) {
			        		textField.setText("∞"); 
			        		return;
			        	} else {
			        		operand1 /= operand2;
			        	}
			            break;
			    }
			    double roundedOperand1 = Math.round(operand1 * 1000000000000.0) / 1000000000000.0;
		        if (roundedOperand1 == Math.floor(roundedOperand1)) {
		            String result = Integer.toString((int) roundedOperand1);
		            if (result.length() > 15) {
		                result = result.substring(0, 15);
		            }
		            textField.setText(result);
		        } else {
		            String result = Double.toString(roundedOperand1);
		            if (result.length() > 15) {
		                result = result.substring(0, 15);
		            }
		            textField.setText(result);
		        }
		    }
		});
		equalsButton.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		equalsButton.setBounds(307, 427, 89, 50);
		contentPane.add(equalsButton);
		
		JButton sevenButton = new JButton("7");
		sevenButton.setBackground(new Color(225, 226, 255));
		sevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + sevenButton.getText());
			}
		});
		sevenButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		sevenButton.setBounds(10, 244, 89, 50);
		contentPane.add(sevenButton);
		
		JButton fourButton = new JButton("4");
		fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + fourButton.getText());
			}
		});
		fourButton.setBackground(new Color(225, 226, 255));
		fourButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		fourButton.setBounds(10, 305, 89, 50);
		contentPane.add(fourButton);
		
		JButton oneButton = new JButton("1");
		oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + oneButton.getText());
			}
		});
		oneButton.setBackground(new Color(225, 226, 255));
		oneButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		oneButton.setBounds(10, 366, 89, 50);
		contentPane.add(oneButton);
		
		JButton eightButton = new JButton("8");
		eightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + eightButton.getText());
			}
		});
		eightButton.setBackground(new Color(225, 226, 255));
		eightButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		eightButton.setBounds(109, 244, 89, 50);
		contentPane.add(eightButton);
		
		JButton fiveButton = new JButton("5");
		fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + fiveButton.getText());
			}
		});
		fiveButton.setBackground(new Color(225, 226, 255));
		fiveButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		fiveButton.setBounds(109, 305, 89, 50);
		contentPane.add(fiveButton);
		
		JButton twoButton = new JButton("2");
		twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + twoButton.getText());
			}
		});
		twoButton.setBackground(new Color(225, 226, 255));
		twoButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		twoButton.setBounds(109, 366, 89, 50);
		contentPane.add(twoButton);
		
		JButton nineButton = new JButton("9");
		nineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + nineButton.getText());
			}
		});
		nineButton.setBackground(new Color(225, 226, 255));
		nineButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		nineButton.setBounds(208, 244, 89, 50);
		contentPane.add(nineButton);
		
		JButton sixButton = new JButton("6");
		sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + sixButton.getText());
			}
		});
		sixButton.setBackground(new Color(225, 226, 255));
		sixButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		sixButton.setBounds(208, 305, 89, 50);
		contentPane.add(sixButton);
		
		JButton threeButton = new JButton("3");
		threeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + threeButton.getText());
			}
		});
		threeButton.setBackground(new Color(225, 226, 255));
		threeButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		threeButton.setBounds(208, 366, 89, 50);
		contentPane.add(threeButton);
		
		JButton plusMinusButton = new JButton("\u00B1");
		plusMinusButton.setBackground(new Color(225, 226, 255));
		plusMinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String displayText = textField.getText();
			    String[] parts = displayText.split("\\s+");
			    if (parts.length == 1) {
			        double operand = Double.parseDouble(parts[0]);
			        double result = -operand;
			        String formattedResult = String.format("%.14g", result);
			        if (formattedResult.contains(".")) {
			            formattedResult = formattedResult.replaceAll("0+$", "");
			            formattedResult = formattedResult.replaceAll("\\.$", "");
			        }
			        textField.setText(formattedResult);
			    } else if (parts.length == 3) {
			        double operand2 = Double.parseDouble(parts[2]);
			        double result = -operand2;
			        String formattedResult = String.format("%.14g", result);
			        if (formattedResult.contains(".")) {
			            formattedResult = formattedResult.replaceAll("0+$", "");
			            formattedResult = formattedResult.replaceAll("\\.$", "");
			        }
			        textField.setText(formattedResult);
			    }
			}
		});
		plusMinusButton.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		plusMinusButton.setBounds(10, 427, 89, 50);
		contentPane.add(plusMinusButton);
		
		JButton zeroButton = new JButton("0");
		zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + zeroButton.getText());
			}
		});
		zeroButton.setBackground(new Color(225, 226, 255));
		zeroButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		zeroButton.setBounds(109, 427, 89, 50);
		contentPane.add(zeroButton);
		
		JButton dotButton = new JButton(".");
		dotButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + dotButton.getText());
			}
		});
		dotButton.setBackground(new Color(225, 226, 255));
		dotButton.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		dotButton.setBounds(208, 427, 89, 50);
		contentPane.add(dotButton);
		
	}
	
}
