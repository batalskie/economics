import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Annuity {

	private JFrame frame;
	public ButtonGroup bg = new ButtonGroup();
	private DecimalFormat dec = new DecimalFormat("0.00");
	private JPanel panelOrdinary;
	private JPanel panelDeffered;
	private JPanel panelAnnuityDue;
	private JPanel panelPerpetuity;
	private JTextField ordATextField;
	private JTextField yarOrdTextField;
	private JTextField rateOrdiTextField;
	private JTextField FOrdiTextField;
	private JTextField POrdiTextField;
	private JTextField ADefTextField;
	private JTextField yearsDefTextField;
	private JTextField rateDefTextField;
	private JTextField phatFDefTextField;
	private JTextField pDefTextField;
	private JTextField AAnnTextField;
	private JTextField yearAnnTextField;
	private JTextField rateAnnTextField;
	private JTextField PAnnTextField;
	private JTextField FAnnTextField;
	private JTextField APerTextField;
	private JTextField ratePerTextField;
	private JTextField P1PerTextField;
	private JTextField P2PerTextField;
	private JTextField P3PerTextField;
	private JTextField yearPerTextField;
	private JTextField conATextField;
	private JTextField conYearTextField;
	private JTextField rateTextField;
	private JTextField conFTextField;
	private JTextField conPTextField;
	private JPanel panelAnnuityContinous;
	private JComboBox comboBox;
	private JComboBox comboBoxdef;
	private JComboBox comboBoxdue;
	private JComboBox comboBoxperpet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Annuity window = new Annuity();
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
	public Annuity() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.setBounds(100, 100, 745, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.setBounds(10, 11, 89, 23);
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.main(null);
				frame.setVisible(false);
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnMenu);
		
		JLabel lblSimpleInterest = new JLabel("ANNUITY");
		lblSimpleInterest.setBounds(329, 11, 194, 46);
		lblSimpleInterest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimpleInterest.setFont(new Font("Tahoma", Font.PLAIN, 30));
		frame.getContentPane().add(lblSimpleInterest);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 93, 845, 2);
		frame.getContentPane().add(separator);
		
		JRadioButton rdbtnOrdinaryAnnuity = new JRadioButton("ORDINARY ANNUITY");
		rdbtnOrdinaryAnnuity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelOrdinary.show();
				panelDeffered.show(false);
				panelAnnuityDue.show(false);
				panelPerpetuity.show(false);
				panelAnnuityContinous.show(false);
				comboBox.setSelectedIndex(0);
				ordATextField.setText("");
				yarOrdTextField.setText("");
				rateOrdiTextField.setText("");
				FOrdiTextField.setText("");
				POrdiTextField.setText("");
				
			}
		});
		rdbtnOrdinaryAnnuity.setSelected(true);
		rdbtnOrdinaryAnnuity.setBounds(140, 31, 183, 23);
		rdbtnOrdinaryAnnuity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(rdbtnOrdinaryAnnuity);
		
		JRadioButton rdbtnDefferedAnnuity = new JRadioButton("DEFFERED ANNUITY");
		rdbtnDefferedAnnuity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDeffered.show();
				panelOrdinary.show(false);
				panelAnnuityDue.show(false);
				panelPerpetuity.show(false);
				panelAnnuityContinous.show(false);
				comboBoxdef.setSelectedIndex(0);
				ADefTextField.setText("");
				yearsDefTextField.setText("");
				rateDefTextField.setText("");
				phatFDefTextField.setText("");
				pDefTextField.setText("");
			}
		});
		rdbtnDefferedAnnuity.setBounds(140, 64, 183, 23);
		rdbtnDefferedAnnuity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(rdbtnDefferedAnnuity);
		
		JRadioButton rdbtnAnnuityDue = new JRadioButton("ANNUITY DUE");
		rdbtnAnnuityDue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAnnuityDue.show();
				panelOrdinary.show(false);
				panelDeffered.show(false);
				panelPerpetuity.show(false);
				panelAnnuityContinous.show(false);
				comboBoxdue.setSelectedIndex(0);
				AAnnTextField.setText("");
				yearAnnTextField.setText("");
				rateAnnTextField.setText("");
				PAnnTextField.setText("");
				FAnnTextField.setText("");
				
			}
		});
		rdbtnAnnuityDue.setBounds(558, 31, 147, 23);
		rdbtnAnnuityDue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(rdbtnAnnuityDue);
		
		
		bg.add(rdbtnOrdinaryAnnuity);
		bg.add(rdbtnDefferedAnnuity);
		bg.add(rdbtnAnnuityDue);
		
		JRadioButton rdbtnAnnuityContinous = new JRadioButton("ANNUITY CONTINOUS");
		rdbtnAnnuityContinous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDeffered.show(false);
				panelOrdinary.show(false);
				panelAnnuityDue.show(false);
				panelPerpetuity.show(false);
				panelAnnuityContinous.show(true);
				
				conATextField.setText("");
				conYearTextField.setText("");
				rateTextField.setText("");
				conFTextField.setText("");
				conPTextField.setText("");
				
				
			}
		});
		rdbtnAnnuityContinous.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnAnnuityContinous.setBounds(339, 64, 184, 23);
		frame.getContentPane().add(rdbtnAnnuityContinous);
		bg.add(rdbtnAnnuityContinous);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 106, 697, 334);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		panelOrdinary = new JPanel();
		layeredPane.add(panelOrdinary, "name_1504177277432502");
		panelOrdinary.setLayout(null);
		
		JLabel lblA = new JLabel("A :");
		lblA.setBounds(10, 33, 46, 14);
		panelOrdinary.add(lblA);
		
		ordATextField = new JTextField();
		ordATextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ordATextField.setBounds(41, 15, 175, 43);
		panelOrdinary.add(ordATextField);
		ordATextField.setColumns(10);
		
		JLabel lblNoOfYears = new JLabel("No. of Years");
		lblNoOfYears.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoOfYears.setBounds(41, 69, 73, 14);
		panelOrdinary.add(lblNoOfYears);
		
		yarOrdTextField = new JTextField();
		yarOrdTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		yarOrdTextField.setBounds(41, 94, 59, 43);
		panelOrdinary.add(yarOrdTextField);
		yarOrdTextField.setColumns(10);
		
		JLabel lblN = new JLabel("n :");
		lblN.setBounds(10, 110, 46, 14);
		panelOrdinary.add(lblN);
		
		rateOrdiTextField = new JTextField();
		rateOrdiTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rateOrdiTextField.setBounds(41, 177, 59, 43);
		panelOrdinary.add(rateOrdiTextField);
		rateOrdiTextField.setColumns(10);
		
		JLabel lblI = new JLabel("i :");
		lblI.setBounds(10, 195, 46, 14);
		panelOrdinary.add(lblI);
		
		JLabel label = new JLabel("%");
		label.setBounds(110, 195, 46, 14);
		panelOrdinary.add(label);
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double A, i, years, rate, com, n, F, P;
				A = Double.parseDouble(ordATextField.getText());
				years = Double.parseDouble(yarOrdTextField.getText());
				rate = (Double.parseDouble(rateOrdiTextField.getText()))/100;
				switch (comboBox.getSelectedIndex()) {
				case 0: com = 1;
				i = rate/com;
				n = com*years;
				F = A*((Math.pow((1+i), n)-1)/i);
				P = A*((1-(Math.pow((1+i), -n)))/i);
				
				FOrdiTextField.setText(""+dec.format(F));
				POrdiTextField.setText(""+dec.format(P));break;
				case 1: com = 2;
				i = rate/com;
				n = com*years;
				F = A*((Math.pow((1+i), n)-1)/i);
				P = A*((1-(Math.pow((1+i), -n)))/i);
				
				FOrdiTextField.setText(""+dec.format(F));
				POrdiTextField.setText(""+dec.format(P));break;
				case 2:	com = 4;
				i = rate/com;
				n = com*years;
				F = A*((Math.pow((1+i), n)-1)/i);
				P = A*((1-(Math.pow((1+i), -n)))/i);
				
				FOrdiTextField.setText(""+dec.format(F));
				POrdiTextField.setText(""+dec.format(P));break;
				case 3: com = 6;
				i = rate/com;
				n = com*years;
				F = A*((Math.pow((1+i), n)-1)/i);
				P = A*((1-(Math.pow((1+i), -n)))/i);
				
				FOrdiTextField.setText(""+dec.format(F));
				POrdiTextField.setText(""+dec.format(P));break;
				case 4:	com = 12;
				i = rate/com;
				n = com*years;
				F = A*((Math.pow((1+i), n)-1)/i);
				P = A*((1-(Math.pow((1+i), -n)))/i);
				
				FOrdiTextField.setText(""+dec.format(F));
				POrdiTextField.setText(""+dec.format(P));break;
				case 5: com = 24;
				i = rate/com;
				n = com*years;
				F = A*((Math.pow((1+i), n)-1)/i);
				P = A*((1-(Math.pow((1+i), -n)))/i);
				
				FOrdiTextField.setText(""+dec.format(F));
				POrdiTextField.setText(""+dec.format(P));break;
			}
				
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalculate.setBounds(161, 238, 148, 41);
		panelOrdinary.add(btnCalculate);
		
		
		
		FOrdiTextField = new JTextField();
		FOrdiTextField.setEditable(false);
		FOrdiTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		FOrdiTextField.setBounds(432, 66, 206, 56);
		panelOrdinary.add(FOrdiTextField);
		FOrdiTextField.setColumns(10);
		
		POrdiTextField = new JTextField();
		POrdiTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		POrdiTextField.setEditable(false);
		POrdiTextField.setBounds(432, 133, 206, 56);
		panelOrdinary.add(POrdiTextField);
		POrdiTextField.setColumns(10);
		
		JLabel lblF = new JLabel("F :");
		lblF.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblF.setHorizontalAlignment(SwingConstants.CENTER);
		lblF.setBounds(376, 73, 46, 36);
		panelOrdinary.add(lblF);
		
		JLabel lblP = new JLabel("P :");
		lblP.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblP.setBounds(380, 140, 46, 39);
		panelOrdinary.add(lblP);
		
		JLabel lblCompoundingPeriods = new JLabel("Compounding Periods");
		lblCompoundingPeriods.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompoundingPeriods.setBounds(124, 69, 149, 14);
		panelOrdinary.add(lblCompoundingPeriods);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Annually", "Semi - Annually", "Quarterly", "Bi - Monthly", "Monthly", "Semi - monthly"}));
		comboBox.setBounds(144, 94, 99, 22);
		panelOrdinary.add(comboBox);
		
		panelDeffered = new JPanel();
		layeredPane.add(panelDeffered, "name_1504181376915805");
		panelDeffered.setLayout(null);
		
		JLabel lblA_1 = new JLabel("A :");
		lblA_1.setBounds(10, 33, 46, 14);
		panelDeffered.add(lblA_1);
		
		ADefTextField = new JTextField();
		ADefTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ADefTextField.setBounds(41, 15, 175, 43);
		panelDeffered.add(ADefTextField);
		ADefTextField.setColumns(10);
		
		JLabel lblNoOfYears_1 = new JLabel("No. of Years");
		lblNoOfYears_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoOfYears_1.setBounds(41, 69, 73, 14);
		panelDeffered.add(lblNoOfYears_1);
		
		yearsDefTextField = new JTextField();
		yearsDefTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		yearsDefTextField.setBounds(41, 94, 59, 43);
		panelDeffered.add(yearsDefTextField);
		yearsDefTextField.setColumns(10);
		
		JLabel lblCompoundingPeriods_1 = new JLabel("Compounding Periods");
		lblCompoundingPeriods_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompoundingPeriods_1.setBounds(124, 69, 149, 14);
		panelDeffered.add(lblCompoundingPeriods_1);
		
		JLabel lblN_1 = new JLabel("n :");
		lblN_1.setBounds(10, 110, 46, 14);
		panelDeffered.add(lblN_1);
		
		rateDefTextField = new JTextField();
		rateDefTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rateDefTextField.setBounds(41, 177, 59, 43);
		panelDeffered.add(rateDefTextField);
		rateDefTextField.setColumns(10);
		
		JLabel label_1 = new JLabel("%");
		label_1.setBounds(110, 195, 46, 14);
		panelDeffered.add(label_1);
		
		JLabel lblI_1 = new JLabel("i :");
		lblI_1.setBounds(10, 195, 46, 14);
		panelDeffered.add(lblI_1);
		
		JButton btnCalculate_1 = new JButton("CALCULATE");
		btnCalculate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double A, years, i, n, com, Phat, P, rate;
				A = Double.parseDouble(ADefTextField.getText());
				years = Double.parseDouble(yearsDefTextField.getText());
				rate = (Double.parseDouble(rateDefTextField.getText()))/100;
				
				switch (comboBoxdef.getSelectedIndex()) {
				case 0: com = 1;
				i = rate/com;
				n = years*com;
				Phat = A*((1-(Math.pow((1+i), -n)))/i);
				P = Phat/Math.pow((1+i), years);
				
				phatFDefTextField.setText(""+dec.format(Phat));
				pDefTextField.setText(""+dec.format(P));break;
				case 1: com = 2;
				i = rate/com;
				n = years*com;
				Phat = A*((1-(Math.pow((1+i), -n)))/i);
				P = Phat/Math.pow((1+i), years);
				
				phatFDefTextField.setText(""+dec.format(Phat));
				pDefTextField.setText(""+dec.format(P));break;
				case 2:	com = 4;
				i = rate/com;
				n = years*com;
				Phat = A*((1-(Math.pow((1+i), -n)))/i);
				P = Phat/Math.pow((1+i), years);
				
				phatFDefTextField.setText(""+dec.format(Phat));
				pDefTextField.setText(""+dec.format(P));break;
				case 3: com = 6;
				i = rate/com;
				n = years*com;
				Phat = A*((1-(Math.pow((1+i), -n)))/i);
				P = Phat/Math.pow((1+i), years);
				
				phatFDefTextField.setText(""+dec.format(Phat));
				pDefTextField.setText(""+dec.format(P));break;
				case 4:	com = 12;
				i = rate/com;
				n = years*com;
				Phat = A*((1-(Math.pow((1+i), -n)))/i);
				P = Phat/Math.pow((1+i), years);
				
				phatFDefTextField.setText(""+dec.format(Phat));
				pDefTextField.setText(""+dec.format(P));break;
				case 5: com = 24;
				i = rate/com;
				n = years*com;
				Phat = A*((1-(Math.pow((1+i), -n)))/i);
				P = Phat/Math.pow((1+i), years);
				
				phatFDefTextField.setText(""+dec.format(Phat));
				pDefTextField.setText(""+dec.format(P));break;
			}
				
				
			}
		});
		btnCalculate_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalculate_1.setBounds(161, 238, 148, 41);
		panelDeffered.add(btnCalculate_1);
		
		phatFDefTextField = new JTextField();
		phatFDefTextField.setEditable(false);
		phatFDefTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		phatFDefTextField.setBounds(432, 66, 206, 56);
		panelDeffered.add(phatFDefTextField);
		phatFDefTextField.setColumns(10);
		
		pDefTextField = new JTextField();
		pDefTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pDefTextField.setEditable(false);
		pDefTextField.setBounds(432, 133, 206, 56);
		panelDeffered.add(pDefTextField);
		pDefTextField.setColumns(10);
		
		JLabel lblP_1 = new JLabel("P' :");
		lblP_1.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblP_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblP_1.setBounds(376, 73, 46, 36);
		panelDeffered.add(lblP_1);
		
		JLabel lblP_2 = new JLabel("P :");
		lblP_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblP_2.setBounds(380, 140, 46, 39);
		panelDeffered.add(lblP_2);
		
		comboBoxdef = new JComboBox();
		comboBoxdef.setModel(new DefaultComboBoxModel(new String[] {"Annually", "Semi - Annually", "Quarterly", "Bi - Monthly", "Monthly", "Semi - monthly"}));
		comboBoxdef.setBounds(144, 94, 99, 22);
		panelDeffered.add(comboBoxdef);
		
		panelAnnuityDue = new JPanel();
		layeredPane.add(panelAnnuityDue, "name_1504184662980832");
		panelAnnuityDue.setLayout(null);
		
		JLabel label_2 = new JLabel("A :");
		label_2.setBounds(10, 33, 46, 14);
		panelAnnuityDue.add(label_2);
		
		JLabel label_3 = new JLabel("No. of Years");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(41, 69, 73, 14);
		panelAnnuityDue.add(label_3);
		
		JLabel label_4 = new JLabel("Compounding Periods");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(124, 69, 149, 14);
		panelAnnuityDue.add(label_4);
		
		JLabel label_5 = new JLabel("n :");
		label_5.setBounds(10, 110, 46, 14);
		panelAnnuityDue.add(label_5);
		
		JLabel label_6 = new JLabel("%");
		label_6.setBounds(110, 195, 46, 14);
		panelAnnuityDue.add(label_6);
		
		JLabel label_7 = new JLabel("i :");
		label_7.setBounds(10, 195, 46, 14);
		panelAnnuityDue.add(label_7);
		
		JLabel label_8 = new JLabel("P :");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setFont(new Font("Dialog", Font.PLAIN, 30));
		label_8.setBounds(376, 73, 46, 36);
		panelAnnuityDue.add(label_8);
		
		JLabel label_9 = new JLabel("F :");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_9.setBounds(380, 140, 46, 39);
		panelAnnuityDue.add(label_9);
		
		AAnnTextField = new JTextField();
		AAnnTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		AAnnTextField.setBounds(41, 15, 175, 43);
		panelAnnuityDue.add(AAnnTextField);
		AAnnTextField.setColumns(10);
		
		yearAnnTextField = new JTextField();
		yearAnnTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		yearAnnTextField.setText("");
		yearAnnTextField.setBounds(41, 94, 59, 43);
		panelAnnuityDue.add(yearAnnTextField);
		yearAnnTextField.setColumns(10);
		
		rateAnnTextField = new JTextField();
		rateAnnTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rateAnnTextField.setBounds(41, 177, 59, 43);
		panelAnnuityDue.add(rateAnnTextField);
		rateAnnTextField.setColumns(10);
		
		PAnnTextField = new JTextField();
		PAnnTextField.setEditable(false);
		PAnnTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PAnnTextField.setBounds(432, 66, 206, 56);
		panelAnnuityDue.add(PAnnTextField);
		PAnnTextField.setColumns(10);
		
		FAnnTextField = new JTextField();
		FAnnTextField.setEditable(false);
		FAnnTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		FAnnTextField.setBounds(432, 133, 206, 56);
		panelAnnuityDue.add(FAnnTextField);
		FAnnTextField.setColumns(10);
		
		JButton btnCalculate_2 = new JButton("CALCULATE");
		btnCalculate_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double A, i, n, rate, P, F, year, com;
				A = Double.parseDouble(AAnnTextField.getText());
				year = Double.parseDouble(yearAnnTextField.getText());
				rate = (Double.parseDouble(rateAnnTextField.getText()))/100;
				switch (comboBoxdue.getSelectedIndex()) {
				case 0: com = 1;
				i = rate/com;
				n = com*year;
				P = A*((((1-(Math.pow(1+i, -(n-1)))))/i)+1);
				F = (((A*Math.pow(1+i, n+1))-1)/i)-A; 
				
				PAnnTextField.setText(""+dec.format(P));
				FAnnTextField.setText(""+dec.format(F));break;
				case 1: com = 2;
				i = rate/com;
				n = com*year;
				P = A*((((1-(Math.pow(1+i, -(n-1)))))/i)+1);
				F = (((A*Math.pow(1+i, n+1))-1)/i)-A; 
				
				PAnnTextField.setText(""+dec.format(P));
				FAnnTextField.setText(""+dec.format(F));break;
				case 2:	com = 4;
				i = rate/com;
				n = com*year;
				P = A*((((1-(Math.pow(1+i, -(n-1)))))/i)+1);
				F = (((A*Math.pow(1+i, n+1))-1)/i)-A; 
				
				PAnnTextField.setText(""+dec.format(P));
				FAnnTextField.setText(""+dec.format(F));break;
				case 3: com = 6;
				i = rate/com;
				n = com*year;
				P = A*((((1-(Math.pow(1+i, -(n-1)))))/i)+1);
				F = (((A*Math.pow(1+i, n+1))-1)/i)-A; 
				
				PAnnTextField.setText(""+dec.format(P));
				FAnnTextField.setText(""+dec.format(F));break;
				case 4:	com = 12;
				i = rate/com;
				n = com*year;
				P = A*((((1-(Math.pow(1+i, -(n-1)))))/i)+1);
				F = (((A*Math.pow(1+i, n+1))-1)/i)-A; 
				
				PAnnTextField.setText(""+dec.format(P));
				FAnnTextField.setText(""+dec.format(F));break;
				case 5: com = 24;
				i = rate/com;
				n = com*year;
				P = A*((((1-(Math.pow(1+i, -(n-1)))))/i)+1);
				F = (((A*Math.pow(1+i, n+1))-1)/i)-A; 
				
				PAnnTextField.setText(""+dec.format(P));
				FAnnTextField.setText(""+dec.format(F));break;
			}
				
				
			}
		});
		btnCalculate_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalculate_2.setBounds(161, 238, 148, 41);
		panelAnnuityDue.add(btnCalculate_2);
		
		comboBoxdue = new JComboBox();
		comboBoxdue.setModel(new DefaultComboBoxModel(new String[] {"Annually", "Semi - Annually", "Quarterly", "Bi - Monthly", "Monthly", "Semi - monthly"}));
		comboBoxdue.setBounds(146, 94, 99, 22);
		panelAnnuityDue.add(comboBoxdue);
		
		panelPerpetuity = new JPanel();
		layeredPane.add(panelPerpetuity, "name_1504187741384579");
		panelPerpetuity.setLayout(null);
		
		JLabel label_10 = new JLabel("A :");
		label_10.setBounds(10, 33, 46, 14);
		panelPerpetuity.add(label_10);
		
		JLabel label_14 = new JLabel("%");
		label_14.setBounds(110, 195, 46, 14);
		panelPerpetuity.add(label_14);
		
		JLabel label_15 = new JLabel("i :");
		label_15.setBounds(10, 195, 46, 14);
		panelPerpetuity.add(label_15);
		
		JLabel label_12 = new JLabel("Compounding Periods");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBounds(10, 83, 149, 14);
		panelPerpetuity.add(label_12);
		
		JLabel label_16 = new JLabel("P :");
		label_16.setHorizontalAlignment(SwingConstants.LEFT);
		label_16.setFont(new Font("Dialog", Font.PLAIN, 30));
		label_16.setBounds(376, 39, 46, 39);
		panelPerpetuity.add(label_16);
		
		APerTextField = new JTextField();
		APerTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		APerTextField.setBounds(41, 15, 175, 43);
		panelPerpetuity.add(APerTextField);
		APerTextField.setColumns(10);
		
		ratePerTextField = new JTextField();
		ratePerTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ratePerTextField.setBounds(41, 177, 59, 43);
		panelPerpetuity.add(ratePerTextField);
		ratePerTextField.setColumns(10);
		
		P1PerTextField = new JTextField();
		P1PerTextField.setEditable(false);
		P1PerTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		P1PerTextField.setBounds(432, 33, 206, 56);
		panelPerpetuity.add(P1PerTextField);
		P1PerTextField.setColumns(10);
		
		P2PerTextField = new JTextField();
		P2PerTextField.setEditable(false);
		P2PerTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		P2PerTextField.setBounds(432, 129, 206, 56);
		panelPerpetuity.add(P2PerTextField);
		P2PerTextField.setColumns(10);
		
		P3PerTextField = new JTextField();
		P3PerTextField.setEditable(false);
		P3PerTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		P3PerTextField.setBounds(432, 240, 206, 56);
		panelPerpetuity.add(P3PerTextField);
		P3PerTextField.setColumns(10);
		
		JLabel lblPayableAtThe = new JLabel("Payable at the Beginning");
		lblPayableAtThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayableAtThe.setBounds(432, 112, 206, 14);
		panelPerpetuity.add(lblPayableAtThe);
		
		JCheckBox chckbxFirstPaymentDue = new JCheckBox("First Payment Due at End of nth Year");
		chckbxFirstPaymentDue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFirstPaymentDue.isSelected()) {
					yearPerTextField.setEditable(true);
				}else {
					yearPerTextField.setText("");
					P3PerTextField.setText("");
					yearPerTextField.setEditable(false);
				}
			}
		});
		chckbxFirstPaymentDue.setBounds(432, 214, 248, 23);
		panelPerpetuity.add(chckbxFirstPaymentDue);
		
		JRadioButton rdbtnPerpetuity = new JRadioButton("PERPETUITY");
		rdbtnPerpetuity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPerpetuity.show();
				panelOrdinary.show(false);
				panelDeffered.show(false);
				panelAnnuityDue.show(false);
				panelAnnuityContinous.show(false);
				comboBoxperpet.setSelectedIndex(0);
				APerTextField.setText("");
				ratePerTextField.setText("");
				P1PerTextField.setText("");
				P2PerTextField.setText("");
				P3PerTextField.setText("");
				yearPerTextField.setText("");
				yearPerTextField.setEditable(false);
				chckbxFirstPaymentDue.setSelected(false);
				
			}
		});
		rdbtnPerpetuity.setBounds(558, 64, 147, 23);
		rdbtnPerpetuity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(rdbtnPerpetuity);
		
		bg.add(rdbtnPerpetuity);
		
		yearPerTextField = new JTextField();
		yearPerTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		yearPerTextField.setEditable(false);
		yearPerTextField.setBounds(363, 252, 59, 42);
		panelPerpetuity.add(yearPerTextField);
		yearPerTextField.setColumns(10);
		
		JLabel lblNthYear = new JLabel(" nth Year");
		lblNthYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblNthYear.setBounds(363, 227, 59, 14);
		panelPerpetuity.add(lblNthYear);
		
		JButton btnCalculate_3 = new JButton("CALCULATE");
		btnCalculate_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double A, rate, i, com, n, P1, P2, P3;
				A = Double.parseDouble(APerTextField.getText());
				rate = (Double.parseDouble(ratePerTextField.getText()))/100;
				
				switch (comboBox.getSelectedIndex()) {
				case 0: com = 1;
				i = rate/com;
				P1 = A/i;
				P2 = A + (A/i);
				
				P1PerTextField.setText(""+dec.format(P1));
				P2PerTextField.setText(""+dec.format(P2));
				
				if(chckbxFirstPaymentDue.isSelected()) {
					yearPerTextField.setEditable(true);
					n = Double.parseDouble(yearPerTextField.getText());
					P3 = (A/i)/(Math.pow(1+i, n));
					P3PerTextField.setText(""+dec.format(P3));
				}else {
					yearPerTextField.setText("");
					P3PerTextField.setText("");
					yearPerTextField.setEditable(false);
				}break;
				case 1: com = 2;
				i = rate/com;
				P1 = A/i;
				P2 = A + (A/i);
				
				P1PerTextField.setText(""+dec.format(P1));
				P2PerTextField.setText(""+dec.format(P2));
				
				if(chckbxFirstPaymentDue.isSelected()) {
					yearPerTextField.setEditable(true);
					n = Double.parseDouble(yearPerTextField.getText());
					P3 = (A/i)/(Math.pow(1+i, n));
					P3PerTextField.setText(""+dec.format(P3));
				}else {
					yearPerTextField.setText("");
					P3PerTextField.setText("");
					yearPerTextField.setEditable(false);
				}break;
				case 2:	com = 4;
				i = rate/com;
				P1 = A/i;
				P2 = A + (A/i);
				
				P1PerTextField.setText(""+dec.format(P1));
				P2PerTextField.setText(""+dec.format(P2));
				
				if(chckbxFirstPaymentDue.isSelected()) {
					yearPerTextField.setEditable(true);
					n = Double.parseDouble(yearPerTextField.getText());
					P3 = (A/i)/(Math.pow(1+i, n));
					P3PerTextField.setText(""+dec.format(P3));
				}else {
					yearPerTextField.setText("");
					P3PerTextField.setText("");
					yearPerTextField.setEditable(false);
				}break;
				case 3: com = 6;
				i = rate/com;
				P1 = A/i;
				P2 = A + (A/i);
				
				P1PerTextField.setText(""+dec.format(P1));
				P2PerTextField.setText(""+dec.format(P2));
				
				if(chckbxFirstPaymentDue.isSelected()) {
					yearPerTextField.setEditable(true);
					n = Double.parseDouble(yearPerTextField.getText());
					P3 = (A/i)/(Math.pow(1+i, n));
					P3PerTextField.setText(""+dec.format(P3));
				}else {
					yearPerTextField.setText("");
					P3PerTextField.setText("");
					yearPerTextField.setEditable(false);
				}break;
				case 4:	com = 12;
				i = rate/com;
				P1 = A/i;
				P2 = A + (A/i);
				
				P1PerTextField.setText(""+dec.format(P1));
				P2PerTextField.setText(""+dec.format(P2));
				
				if(chckbxFirstPaymentDue.isSelected()) {
					yearPerTextField.setEditable(true);
					n = Double.parseDouble(yearPerTextField.getText());
					P3 = (A/i)/(Math.pow(1+i, n));
					P3PerTextField.setText(""+dec.format(P3));
				}else {
					yearPerTextField.setText("");
					P3PerTextField.setText("");
					yearPerTextField.setEditable(false);
				}break;
				case 5: com = 24;
				i = rate/com;
				P1 = A/i;
				P2 = A + (A/i);
				
				P1PerTextField.setText(""+dec.format(P1));
				P2PerTextField.setText(""+dec.format(P2));
				
				if(chckbxFirstPaymentDue.isSelected()) {
					yearPerTextField.setEditable(true);
					n = Double.parseDouble(yearPerTextField.getText());
					P3 = (A/i)/(Math.pow(1+i, n));
					P3PerTextField.setText(""+dec.format(P3));
				}else {
					yearPerTextField.setText("");
					P3PerTextField.setText("");
					yearPerTextField.setEditable(false);
				}break;
			}
				
				
				
			}
		});
		btnCalculate_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalculate_3.setBounds(161, 238, 148, 41);
		panelPerpetuity.add(btnCalculate_3);
		
		comboBoxperpet = new JComboBox();
		comboBoxperpet.setModel(new DefaultComboBoxModel(new String[] {"Annually", "Semi - Annually", "Quarterly", "Bi - Monthly", "Monthly", "Semi - monthly"}));
		comboBoxperpet.setBounds(41, 108, 99, 22);
		panelPerpetuity.add(comboBoxperpet);
		
		panelAnnuityContinous = new JPanel();
		layeredPane.add(panelAnnuityContinous, "name_972765492231568");
		panelAnnuityContinous.setLayout(null);
		
		JLabel label_11 = new JLabel("A :");
		label_11.setBounds(10, 33, 46, 14);
		panelAnnuityContinous.add(label_11);
		
		JLabel label_13 = new JLabel("No. of Years");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(10, 73, 120, 14);
		panelAnnuityContinous.add(label_13);
		
		JLabel label_18 = new JLabel("n :");
		label_18.setBounds(10, 110, 46, 14);
		panelAnnuityContinous.add(label_18);
		
		JLabel label_19 = new JLabel("%");
		label_19.setBounds(110, 195, 46, 14);
		panelAnnuityContinous.add(label_19);
		
		JLabel label_20 = new JLabel("P :");
		label_20.setHorizontalAlignment(SwingConstants.LEFT);
		label_20.setFont(new Font("Dialog", Font.PLAIN, 30));
		label_20.setBounds(380, 140, 46, 39);
		panelAnnuityContinous.add(label_20);
		
		JLabel label_21 = new JLabel("F :");
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_21.setBounds(376, 73, 46, 36);
		panelAnnuityContinous.add(label_21);
		
		JLabel label_22 = new JLabel("i :");
		label_22.setBounds(10, 195, 46, 14);
		panelAnnuityContinous.add(label_22);
		
		conATextField = new JTextField();
		conATextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		conATextField.setBounds(41, 15, 175, 43);
		panelAnnuityContinous.add(conATextField);
		conATextField.setColumns(10);
		
		conYearTextField = new JTextField();
		conYearTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		conYearTextField.setText("");
		conYearTextField.setBounds(41, 98, 59, 43);
		panelAnnuityContinous.add(conYearTextField);
		conYearTextField.setColumns(10);
		
		rateTextField = new JTextField();
		rateTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rateTextField.setText("");
		rateTextField.setBounds(41, 177, 59, 43);
		panelAnnuityContinous.add(rateTextField);
		rateTextField.setColumns(10);
		
		conFTextField = new JTextField();
		conFTextField.setEditable(false);
		conFTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		conFTextField.setText("");
		conFTextField.setBounds(432, 66, 206, 56);
		panelAnnuityContinous.add(conFTextField);
		conFTextField.setColumns(10);
		
		conPTextField = new JTextField();
		conPTextField.setEditable(false);
		conPTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		conPTextField.setText("");
		conPTextField.setBounds(432, 133, 206, 56);
		panelAnnuityContinous.add(conPTextField);
		conPTextField.setColumns(10);
		
		JButton btnCalculate_4 = new JButton("CALCULATE");
		btnCalculate_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double A, n, r, F, P;
				A = Double.parseDouble(conATextField.getText());
				r = (Double.parseDouble(rateTextField.getText()))/100;
				n = Double.parseDouble(conYearTextField.getText());

				F = (A*((Math.pow(Math.E, r*n)-1)))/((Math.pow(Math.E, r))-1);
				P = A*((1-(Math.pow(Math.E, -(r*n))))/((Math.pow(Math.E, r))-1));
				
				conFTextField.setText(""+dec.format(F));
				conPTextField.setText(""+dec.format(P));
			}
		});
		btnCalculate_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalculate_4.setBounds(161, 238, 148, 41);
		panelAnnuityContinous.add(btnCalculate_4);
		
		
	}
}
