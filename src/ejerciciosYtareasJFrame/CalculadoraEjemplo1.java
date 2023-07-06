package ejerciciosYtareasJFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class CalculadoraEjemplo1 extends JFrame implements ActionListener {

	private JPanel Panel;
	static JTextField txtCampo;
	private JButton btnNum1,btnNum2, btnNum3, btnNum4, btnNum5, btnNum6, btnNum7, btnNum8, btnNum9, btnNum0, 
					btnSumar, btnRestar, btnMulti, btnDiv, btnIgual, btnPunto, btnBorrado;
	static double valor1, valor2;
	String operacion =" ";
    double resultado = 0.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraEjemplo1 frame = new CalculadoraEjemplo1();
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
	public CalculadoraEjemplo1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 297, 300);
		Panel = new JPanel();
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		iniciarComponentes();
		
		setTitle("CALCULADORA JVOS");
		setResizable(false);
		setLocationRelativeTo(null);	
	}

	private void iniciarComponentes() {
		// TODO Auto-generated method stub
		setContentPane(Panel);
		Panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Calculadora_JVOS");
		lblTitulo.setForeground(new Color(0, 128, 128));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(10, 11, 257, 20);
		Panel.add(lblTitulo);
		
		txtCampo = new JTextField();
		txtCampo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCampo.setBounds(10, 42, 257, 29);
		Panel.add(txtCampo);
		txtCampo.setColumns(10);
		
		btnNum7 = new JButton("7");
		btnNum7.setBounds(10, 82, 46, 23);
		btnNum7.addActionListener(this);
		Panel.add(btnNum7);
		
		btnNum8 = new JButton("8");
		btnNum8.setBounds(66, 82, 46, 23);
		btnNum8.addActionListener(this);
		Panel.add(btnNum8);
		
		btnNum9 = new JButton("9");
		btnNum9.setBounds(122, 82, 46, 23);
		btnNum9.addActionListener(this);
		Panel.add(btnNum9);
		
		btnNum4 = new JButton("4");
		btnNum4.setBounds(10, 116, 46, 23);
		btnNum4.addActionListener(this);
		Panel.add(btnNum4);
		
		btnNum1 = new JButton("1");
		btnNum1.setBounds(10, 150, 46, 23);
		btnNum1.addActionListener(this);
		Panel.add(btnNum1);
		
		btnNum5 = new JButton("5");
		btnNum5.setBounds(66, 116, 46, 23);
		btnNum5.addActionListener(this);
		Panel.add(btnNum5);
		
		btnNum2 = new JButton("2");
		btnNum2.setBounds(66, 150, 46, 23);
		btnNum2.addActionListener(this);
		Panel.add(btnNum2);
		
		btnNum6 = new JButton("6");
		btnNum6.setBounds(122, 116, 46, 23);
		btnNum6.addActionListener(this);
		Panel.add(btnNum6);
		
		btnNum3 = new JButton("3");
		btnNum3.setBounds(122, 150, 46, 23);
		btnNum3.addActionListener(this);
		Panel.add(btnNum3);
		
		btnSumar = new JButton("+");
		btnSumar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSumar.setBounds(178, 82, 89, 23);
		btnSumar.addActionListener(this);
		Panel.add(btnSumar);
		
		btnRestar = new JButton("-");
		btnRestar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRestar.setBounds(178, 116, 89, 23);
		btnRestar.addActionListener(this);
		Panel.add(btnRestar);
		
		btnMulti = new JButton("*");
		btnMulti.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMulti.setBounds(178, 150, 89, 23);
		btnMulti.addActionListener(this);
		Panel.add(btnMulti);
		
		btnNum0 = new JButton("0");
		btnNum0.setBounds(66, 184, 46, 23);
		btnNum0.addActionListener(this);
		Panel.add(btnNum0);
		
		btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDiv.setBounds(178, 184, 89, 23);
		btnDiv.addActionListener(this);
		Panel.add(btnDiv);
		
		btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnIgual.setBounds(122, 184, 46, 23);
		btnIgual.addActionListener(this);
		Panel.add(btnIgual);
		
		btnPunto = new JButton(".");
		btnPunto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPunto.setBounds(10, 184, 46, 23);
		btnPunto.addActionListener(this);
		Panel.add(btnPunto);
		
		btnBorrado = new JButton("C");
		btnBorrado.setBounds(52, 218, 89, 23);
		btnBorrado.addActionListener(this);
		Panel.add(btnBorrado);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String textoBoton = ((JButton) e.getSource()).getText();
        System.out.println("Funcion "+textoBoton);
   
		if (textoBoton.matches("[0-9.]")) {
            txtCampo.setText(txtCampo.getText() + textoBoton);
        } else if (textoBoton.equals("+") || textoBoton.equals("-") ||
                textoBoton.equals("*") || textoBoton.equals("/")) {
            valor1 = Double.parseDouble(txtCampo.getText());
            operacion = textoBoton;
            txtCampo.setText("");
        } else if (textoBoton.equals("=")) {
            valor2 = Double.parseDouble(txtCampo.getText());
            System.out.println("Valor2 " +valor2);
			switch (operacion) {
                case "+":{
                    resultado = valor1 + valor2;
                    break;
                }
                case "-":{
                    resultado = valor1 - valor2;
                    break;
                }
                case "*":{
                    resultado = valor1 * valor2;
                    break;
                }
                case "/":{
                	if(valor2 != 0) {
                		resultado = valor1 / valor2;
                		break;
                	}else {
                		txtCampo.setText("Err");
                	}
                }
            }
			txtCampo.setText(String.valueOf(resultado));
        }
        else if (textoBoton.equals("C")) {
            txtCampo.setText("");
            valor1 = 0;
            valor2= 0;
            resultado = 0;
        }
	}
}