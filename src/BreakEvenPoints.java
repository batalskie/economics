import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class BreakEvenPoints {
	
	private DecimalFormat dec = new DecimalFormat("0.00");

	private JFrame frmBreakEvenPoints;
	private JTextField vcTextField;
	private JTextField spTextField;
	private JTextField fcTextField;
	private JTextField unitTextField;
	private JTextField dollarTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakEvenPoints window = new BreakEvenPoints();
					window.frmBreakEvenPoints.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BreakEvenPoints() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBreakEvenPoints = new JFrame();
		frmBreakEvenPoints.setTitle("BREAK EVEN POINTS");
		frmBreakEvenPoints.setResizable(false);
		frmBreakEvenPoints.setBounds(100, 100, 450, 491);
		frmBreakEvenPoints.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBreakEvenPoints.getContentPane().setLayout(null);
		
		JLabel lblFixedCost = new JLabel("FIXED COST :");
		lblFixedCost.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFixedCost.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFixedCost.setBounds(10, 43, 141, 30);
		frmBreakEvenPoints.getContentPane().add(lblFixedCost);
		
		JLabel lblSellingPrice = new JLabel("SELLING PRICE :");
		lblSellingPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSellingPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSellingPrice.setBounds(10, 84, 141, 30);
		frmBreakEvenPoints.getContentPane().add(lblSellingPrice);
		
		JLabel lblVariableCost = new JLabel("VARIABLE COST :");
		lblVariableCost.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVariableCost.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVariableCost.setBounds(10, 121, 141, 30);
		frmBreakEvenPoints.getContentPane().add(lblVariableCost);
		
		vcTextField = new JTextField();
		vcTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		vcTextField.setColumns(10);
		vcTextField.setBounds(161, 123, 207, 30);
		frmBreakEvenPoints.getContentPane().add(vcTextField);
		
		spTextField = new JTextField();
		spTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		spTextField.setColumns(10);
		spTextField.setBounds(161, 86, 207, 30);
		frmBreakEvenPoints.getContentPane().add(spTextField);
		
		fcTextField = new JTextField();
		fcTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fcTextField.setColumns(10);
		fcTextField.setBounds(161, 45, 207, 30);
		frmBreakEvenPoints.getContentPane().add(fcTextField);
		
		JButton button_1 = new JButton("CALCULATE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double fc, sp, vc, bu, bd;
				String buS;
			
				fc = Double.parseDouble(fcTextField.getText());
				sp = Double.parseDouble(spTextField.getText());
				vc = Double.parseDouble(vcTextField.getText());
				
				bu = fc/(sp-vc);
				buS = Double.toString(bu);
				if(buS.contains(".")) {
					bu +=1;
					unitTextField.setText(""+bu);
					bd = bu*sp;
					dollarTextField.setText(""+dec.format(bd));
					
					
				}else {
					unitTextField.setText(""+bu);
					bd = bu*sp;
					dollarTextField.setText(""+dec.format(bd));
				}
				
				
				
				
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBounds(161, 164, 141, 23);
		frmBreakEvenPoints.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("CLEAR");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fcTextField.setText("");
				spTextField.setText("");
				vcTextField.setText("");
				unitTextField.setText("");
				dollarTextField.setText("");
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_2.setBounds(339, 164, 75, 23);
		frmBreakEvenPoints.getContentPane().add(button_2);
		
		JLabel lblUnits = new JLabel("B (UNITS)");
		lblUnits.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnits.setBounds(10, 286, 424, 14);
		frmBreakEvenPoints.getContentPane().add(lblUnits);
		
		unitTextField = new JTextField();
		unitTextField.setHorizontalAlignment(SwingConstants.CENTER);
		unitTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		unitTextField.setEditable(false);
		unitTextField.setColumns(10);
		unitTextField.setBounds(10, 311, 414, 30);
		frmBreakEvenPoints.getContentPane().add(unitTextField);
		
		JLabel lblBdollar = new JLabel("B (DOLLAR)");
		lblBdollar.setHorizontalAlignment(SwingConstants.CENTER);
		lblBdollar.setBounds(10, 352, 424, 14);
		frmBreakEvenPoints.getContentPane().add(lblBdollar);
		
		JLabel lblBreakPoint = new JLabel("B     R     E     A     K          E     V     E     N          P     O     I     N     T     S");
		lblBreakPoint.setHorizontalAlignment(SwingConstants.CENTER);
		lblBreakPoint.setBounds(10, 236, 424, 14);
		frmBreakEvenPoints.getContentPane().add(lblBreakPoint);
		
		dollarTextField = new JTextField();
		dollarTextField.setHorizontalAlignment(SwingConstants.CENTER);
		dollarTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		dollarTextField.setEditable(false);
		dollarTextField.setColumns(10);
		dollarTextField.setBounds(10, 377, 414, 30);
		frmBreakEvenPoints.getContentPane().add(dollarTextField);
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.main(null);
				frmBreakEvenPoints.setVisible(false);
			}
		});
		btnMenu.setBounds(10, 11, 89, 23);
		frmBreakEvenPoints.getContentPane().add(btnMenu);
	}

}
