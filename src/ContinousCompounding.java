import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ContinousCompounding {

	private JFrame frame;
	private DecimalFormat dec = new DecimalFormat("0.00");
	private JTextField presentTextField;
	private JTextField yearsTextField;
	private JTextField rateTextField;
	private JTextField futureTextField;
	private JComboBox comboBoxcontinuee;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContinousCompounding window = new ContinousCompounding();
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
	public ContinousCompounding() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.setBounds(100, 100, 688, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.main(null);
				frame.setVisible(false);
			}
		});
		btnMenu.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnMenu);
		
		JLabel lblSimpleInterest = new JLabel("CONTINOUS COMPOUNDING");
		lblSimpleInterest.setBounds(148, 11, 408, 46);
		lblSimpleInterest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimpleInterest.setFont(new Font("Tahoma", Font.PLAIN, 30));
		frame.getContentPane().add(lblSimpleInterest);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 93, 845, 2);
		frame.getContentPane().add(separator);
		
		JLabel lbllendersViewspoint = new JLabel("(LENDER'S VIEWSPOINT)");
		lbllendersViewspoint.setBounds(206, 51, 307, 31);
		lbllendersViewspoint.setHorizontalAlignment(SwingConstants.CENTER);
		lbllendersViewspoint.setFont(new Font("Tahoma", Font.ITALIC, 20));
		frame.getContentPane().add(lbllendersViewspoint);
		
		JLabel lblPresentValue = new JLabel("Present Value");
		lblPresentValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresentValue.setBounds(35, 106, 217, 14);
		frame.getContentPane().add(lblPresentValue);
		
		JLabel lblP = new JLabel("P :");
		lblP.setBounds(10, 142, 46, 14);
		frame.getContentPane().add(lblP);
		
		presentTextField = new JTextField();
		presentTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		presentTextField.setBounds(47, 131, 210, 46);
		frame.getContentPane().add(presentTextField);
		presentTextField.setColumns(10);
		
		JLabel lblNoOfYears = new JLabel("No. of Years");
		lblNoOfYears.setBounds(57, 188, 74, 14);
		frame.getContentPane().add(lblNoOfYears);
		
		JLabel lblNoOfCompounding = new JLabel("No. of Compounding Periods");
		lblNoOfCompounding.setBounds(168, 188, 188, 14);
		frame.getContentPane().add(lblNoOfCompounding);
		
		yearsTextField = new JTextField();
		yearsTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		yearsTextField.setBounds(47, 213, 84, 46);
		frame.getContentPane().add(yearsTextField);
		yearsTextField.setColumns(10);
		
		JLabel lblRateOfInterest = new JLabel("Rate of Interest");
		lblRateOfInterest.setHorizontalAlignment(SwingConstants.CENTER);
		lblRateOfInterest.setBounds(35, 270, 114, 14);
		frame.getContentPane().add(lblRateOfInterest);
		
		rateTextField = new JTextField();
		rateTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rateTextField.setBounds(47, 295, 84, 49);
		frame.getContentPane().add(rateTextField);
		rateTextField.setColumns(10);
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double p, r, m , n, future;
				p = Double.parseDouble(presentTextField.getText());
				n = Double.parseDouble(yearsTextField.getText());
				r = (Double.parseDouble(rateTextField.getText()))/100;
				switch (comboBoxcontinuee.getSelectedIndex()) {
				case 0: m = 1;
future = p*(Math.pow((1+(r/m)), m*n));
				
				futureTextField.setText(""+dec.format(future));break;
				case 1: m = 2;
future = p*(Math.pow((1+(r/m)), m*n));
				
				futureTextField.setText(""+dec.format(future));break;
				case 2:	m = 4;
future = p*(Math.pow((1+(r/m)), m*n));
				
				futureTextField.setText(""+dec.format(future));break;
				case 3: m = 6;
future = p*(Math.pow((1+(r/m)), m*n));
				
				futureTextField.setText(""+dec.format(future));break;
				case 4:	m = 12;
future = p*(Math.pow((1+(r/m)), m*n));
				
				futureTextField.setText(""+dec.format(future));break;
				case 5: m = 24;
future = p*(Math.pow((1+(r/m)), m*n));
				
				futureTextField.setText(""+dec.format(future));break;
			}
				
				
				
				
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalculate.setBounds(150, 385, 155, 46);
		frame.getContentPane().add(btnCalculate);
		
		JLabel lblN = new JLabel("n :");
		lblN.setBounds(10, 232, 34, 14);
		frame.getContentPane().add(lblN);
		
		JLabel lblI = new JLabel("i :");
		lblI.setBounds(10, 312, 34, 14);
		frame.getContentPane().add(lblI);
		
		JLabel lblF = new JLabel("F :");
		lblF.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblF.setBounds(330, 245, 56, 55);
		frame.getContentPane().add(lblF);
		
		futureTextField = new JTextField();
		futureTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		futureTextField.setEditable(false);
		futureTextField.setBounds(396, 250, 226, 55);
		frame.getContentPane().add(futureTextField);
		futureTextField.setColumns(10);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				presentTextField.setText("");
				yearsTextField.setText("");
				rateTextField.setText("");
				futureTextField.setText("");
				comboBoxcontinuee.setSelectedIndex(0);
			}
		});
		btnClear.setBounds(467, 312, 89, 23);
		frame.getContentPane().add(btnClear);
		
		comboBoxcontinuee = new JComboBox();
		comboBoxcontinuee.setModel(new DefaultComboBoxModel(new String[] {"Annually", "Semi - Annually", "Quarterly", "Bi - Monthly", "Monthly", "Semi - monthly"}));
		comboBoxcontinuee.setBounds(188, 213, 99, 22);
		frame.getContentPane().add(comboBoxcontinuee);
	}

}
