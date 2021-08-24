import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CompoundInterest {

	private JFrame frame;
	public ButtonGroup bg = new ButtonGroup();
	private DecimalFormat dec = new DecimalFormat("0.00");
	private JTextField presentNRITextField;
	private JTextField yearsNRITextField;
	private JTextField rateNRITextField;
	private JTextField NRITextField;
	private JTextField nominalRateERITextField;
	private JTextField compoundERIextField;
	private JTextField ERTextField;
	private JComboBox comboBoxnomin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompoundInterest window = new CompoundInterest();
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
	public CompoundInterest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.setBounds(100, 100, 723, 490);
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
		
		JLabel lblSimpleInterest = new JLabel("COMPOUND INTEREST");
		lblSimpleInterest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimpleInterest.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblSimpleInterest.setBounds(179, 11, 323, 46);
		frame.getContentPane().add(lblSimpleInterest);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 93, 845, 2);
		frame.getContentPane().add(separator);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 106, 691, 334);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel NRIpanel = new JPanel();
		layeredPane.add(NRIpanel, "name_1497213352528064");
		NRIpanel.setLayout(null);
		
		JLabel lblP = new JLabel("P :");
		lblP.setBounds(10, 57, 33, 14);
		NRIpanel.add(lblP);
		
		JLabel lblPresentValue = new JLabel("Present Value");
		lblPresentValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresentValue.setBounds(64, 11, 136, 14);
		NRIpanel.add(lblPresentValue);
		
		presentNRITextField = new JTextField();
		presentNRITextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		presentNRITextField.setBounds(42, 36, 215, 49);
		NRIpanel.add(presentNRITextField);
		presentNRITextField.setColumns(10);
		
		JLabel lblNo = new JLabel("No. of Years");
		lblNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNo.setBounds(52, 96, 84, 14);
		NRIpanel.add(lblNo);
		
		JLabel lblNoOfCompounding = new JLabel("No. of Compounding Periods/Years");
		lblNoOfCompounding.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoOfCompounding.setBounds(146, 96, 215, 14);
		NRIpanel.add(lblNoOfCompounding);
		
		yearsNRITextField = new JTextField();
		yearsNRITextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		yearsNRITextField.setBounds(62, 121, 64, 49);
		NRIpanel.add(yearsNRITextField);
		yearsNRITextField.setColumns(10);
		
		JLabel lblN = new JLabel("n :");
		lblN.setBounds(10, 142, 33, 14);
		NRIpanel.add(lblN);
		
		JLabel lblRateOfInterest = new JLabel("Rate of Interest");
		lblRateOfInterest.setHorizontalAlignment(SwingConstants.CENTER);
		lblRateOfInterest.setBounds(23, 181, 128, 14);
		NRIpanel.add(lblRateOfInterest);
		
		rateNRITextField = new JTextField();
		rateNRITextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rateNRITextField.setBounds(42, 206, 84, 49);
		NRIpanel.add(rateNRITextField);
		rateNRITextField.setColumns(10);
		
		JLabel lblI = new JLabel("i :");
		lblI.setBounds(10, 227, 33, 14);
		NRIpanel.add(lblI);
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pNri, yearsNri, comNri, rateNri, NRI, i;
				pNri = Double.parseDouble(presentNRITextField.getText());
				yearsNri = Double.parseDouble(yearsNRITextField.getText());
				rateNri = (Double.parseDouble(rateNRITextField.getText()))/100;
		
				switch (comboBoxnomin.getSelectedIndex()) {
				case 0: comNri = 1;
				i = 1+(rateNri/comNri);
				NRI =pNri * (Math.pow(i, yearsNri*comNri));
				
				NRITextField.setText(""+dec.format(NRI));break;
				case 1: comNri = 2;
				i = 1+(rateNri/comNri);
				NRI =pNri * (Math.pow(i, yearsNri*comNri));
				
				NRITextField.setText(""+dec.format(NRI));break;
				case 2:	comNri = 4;
				i = 1+(rateNri/comNri);
				NRI =pNri * (Math.pow(i, yearsNri*comNri));
				
				NRITextField.setText(""+dec.format(NRI));break;
				case 3: comNri = 6;
				i = 1+(rateNri/comNri);
				NRI =pNri * (Math.pow(i, yearsNri*comNri));
				
				NRITextField.setText(""+dec.format(NRI));break;
				case 4:	comNri = 12;
				i = 1+(rateNri/comNri);
				NRI =pNri * (Math.pow(i, yearsNri*comNri));
				
				NRITextField.setText(""+dec.format(NRI));break;
				case 5: comNri = 24;
				i = 1+(rateNri/comNri);
				NRI =pNri * (Math.pow(i, yearsNri*comNri));
				
				NRITextField.setText(""+dec.format(NRI));break;
			}
			
				
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalculate.setBounds(186, 268, 158, 39);
		NRIpanel.add(btnCalculate);
		
		JLabel lblF = new JLabel("F :");
		lblF.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblF.setBounds(401, 161, 48, 39);
		NRIpanel.add(lblF);
		
		NRITextField = new JTextField();
		NRITextField.setEditable(false);
		NRITextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		NRITextField.setBounds(459, 142, 208, 53);
		NRIpanel.add(NRITextField);
		NRITextField.setColumns(10);
		
		comboBoxnomin = new JComboBox();
		comboBoxnomin.setModel(new DefaultComboBoxModel(new String[] {"Annually", "Semi - Annually", "Quarterly", "Bi - Monthly", "Monthly", "Semi - monthly"}));
		comboBoxnomin.setBounds(201, 121, 99, 22);
		NRIpanel.add(comboBoxnomin);
		
		JPanel ERIpanel = new JPanel();
		layeredPane.add(ERIpanel, "name_1497226831003197");
		ERIpanel.setLayout(null);
		
		JLabel lblNominalInterestRate = new JLabel("Nominal Interest Rate");
		lblNominalInterestRate.setBounds(85, 23, 172, 14);
		ERIpanel.add(lblNominalInterestRate);
		
		nominalRateERITextField = new JTextField();
		nominalRateERITextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nominalRateERITextField.setBounds(44, 48, 198, 54);
		ERIpanel.add(nominalRateERITextField);
		nominalRateERITextField.setColumns(10);
		
		JLabel lblNumberOfCompounding = new JLabel("Number of Compounding Periods/Year");
		lblNumberOfCompounding.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumberOfCompounding.setBounds(10, 141, 266, 14);
		ERIpanel.add(lblNumberOfCompounding);
		
		compoundERIextField = new JTextField();
		compoundERIextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		compoundERIextField.setBounds(44, 166, 198, 54);
		ERIpanel.add(compoundERIextField);
		compoundERIextField.setColumns(10);
		
		JButton btnCalculate_1 = new JButton("CALCULATE");
		btnCalculate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double rateEri, comEri, ER;
				rateEri = (Double.parseDouble(nominalRateERITextField.getText()))/100;
				comEri = Double.parseDouble(compoundERIextField.getText());
				ER = (Math.pow((1+rateEri), comEri))-1;
				ERTextField.setText(""+dec.format(ER));
			}
		});
		btnCalculate_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalculate_1.setBounds(143, 263, 172, 41);
		ERIpanel.add(btnCalculate_1);
		
		ERTextField = new JTextField();
		ERTextField.setEditable(false);
		ERTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ERTextField.setBounds(412, 116, 214, 54);
		ERIpanel.add(ERTextField);
		ERTextField.setColumns(10);
		
		JLabel lblEr = new JLabel("ER :");
		lblEr.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEr.setBounds(346, 117, 56, 46);
		ERIpanel.add(lblEr);
		
		JLabel lblEffectiveRate = new JLabel("Effective Rate");
		lblEffectiveRate.setBounds(458, 88, 156, 14);
		ERIpanel.add(lblEffectiveRate);
		
		JRadioButton rdbtnNominalRateOf = new JRadioButton("NOMINAL RATE OF INTEREST");
		rdbtnNominalRateOf.setSelected(true);
		rdbtnNominalRateOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NRIpanel.show();
				ERIpanel.show(false);
				presentNRITextField.setText("");
				yearsNRITextField.setText("");
				comboBoxnomin.setSelectedIndex(0);
				rateNRITextField.setText("");
				NRITextField.setText("");
			}
		});
		rdbtnNominalRateOf.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNominalRateOf.setBounds(29, 64, 303, 23);
		frame.getContentPane().add(rdbtnNominalRateOf);
		
		JRadioButton rdbtnEffectiveRateOf = new JRadioButton("EFFECTIVE RATE OF INTEREST");
		rdbtnEffectiveRateOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ERIpanel.show();
				NRIpanel.show(false);
				nominalRateERITextField.setText("");
				compoundERIextField.setText("");
				ERTextField.setText("");
			}
			
		});
		rdbtnEffectiveRateOf.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnEffectiveRateOf.setBounds(360, 64, 323, 23);
		frame.getContentPane().add(rdbtnEffectiveRateOf);
		bg.add(rdbtnNominalRateOf);
		bg.add(rdbtnEffectiveRateOf);
		
	}
}
