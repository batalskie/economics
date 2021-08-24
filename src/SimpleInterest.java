import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;

public class SimpleInterest {

	private JFrame frame;
	private JLayeredPane layeredPane;
	public ButtonGroup bg = new ButtonGroup();
	private DecimalFormat dec = new DecimalFormat("0.00");
	Calendar dateFirst = new GregorianCalendar();
	Calendar dateEnd = new GregorianCalendar();
	SimpleDateFormat f = new SimpleDateFormat("MM dd yyyy");
	private JTextField presentValuetextField;
	private JTextField monthTextField;
	private JTextField dayTextField;
	private JTextField rateTextField;
	private JTextField OSITextField;
	private JTextField futureTextField;
	private JTextField esiPrincipalTextField;
	private JTextField esiMonthTextField;
	private JTextField esiDayTextField;
	private JTextField esiYearTextField;
	private JTextField esiMonth2TextField;
	private JTextField esiDay2TextField;
	private JTextField esiYear2TextField;
	private JTextField esiRateTextField;
	private JTextField ESITextField;
	private JTextField esiFutureTextField;
	private JPanel ESIpanel;
	private JPanel OSIpanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleInterest window = new SimpleInterest();
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
	public SimpleInterest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.setBounds(100, 100, 881, 490);
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
		
		JLabel lblSimpleInterest = new JLabel("SIMPLE INTEREST");
		lblSimpleInterest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimpleInterest.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblSimpleInterest.setBounds(296, 11, 294, 46);
		frame.getContentPane().add(lblSimpleInterest);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 93, 845, 2);
		frame.getContentPane().add(separator);
		
		JTextPane txtpnSdfd = new JTextPane();
		txtpnSdfd.setEditable(false);
		txtpnSdfd.setText("FOR MONTH\r\n\"TYPE\" :\r\n\r\n[ 1 ] January\r\n[ 2 ] February\r\n[ 3 ] March\r\n[ 4 ] April\r\n[ 5 ] May\r\n[ 6 ] June\r\n[ 7 ] July\r\n[ 8 ] August\r\n[ 9 ] September\r\n[ 10 ] October\r\n[ 11 ] November\r\n[ 12 ] December");
		txtpnSdfd.setBounds(20, 106, 128, 242);
		frame.getContentPane().add(txtpnSdfd);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(158, 106, 697, 334);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		OSIpanel = new JPanel();
		layeredPane.add(OSIpanel, "name_1075203092567018");
		OSIpanel.setLayout(null);
		
		JLabel lblP = new JLabel("P :");
		lblP.setBounds(10, 48, 25, 14);
		OSIpanel.add(lblP);
		
		presentValuetextField = new JTextField();
		presentValuetextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		presentValuetextField.setBounds(45, 32, 217, 40);
		OSIpanel.add(presentValuetextField);
		presentValuetextField.setColumns(10);
		
		JLabel lblPrincipalpresentWorth = new JLabel("Principal/Present Worth");
		lblPrincipalpresentWorth.setBounds(92, 11, 126, 14);
		OSIpanel.add(lblPrincipalpresentWorth);
		
		JLabel lblN = new JLabel("n :");
		lblN.setBounds(10, 143, 25, 14);
		OSIpanel.add(lblN);
		
		JLabel lblNumberOfInterest = new JLabel("Number of Interest Periods");
		lblNumberOfInterest.setBounds(92, 83, 165, 14);
		OSIpanel.add(lblNumberOfInterest);
		
		JCheckBox chckbxMonths = new JCheckBox("MONTH(S)");
		chckbxMonths.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMonths.isSelected()) {
					monthTextField.setEditable(true);
				}else {
					monthTextField.setText(null);
					monthTextField.setEditable(false);
				}
			}
		});
		chckbxMonths.setBounds(55, 104, 86, 23);
		OSIpanel.add(chckbxMonths);
		
		monthTextField = new JTextField();
		monthTextField.setEditable(false);
		monthTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		monthTextField.setBounds(66, 127, 62, 40);
		OSIpanel.add(monthTextField);
		monthTextField.setColumns(10);
		
		JCheckBox chckbxDays = new JCheckBox("DAY(S)");
		chckbxDays.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxDays.isSelected()) {
					dayTextField.setEditable(true);
				}else {
					dayTextField.setText(null);
					dayTextField.setEditable(false);
				}
			}
		});
		chckbxDays.setBounds(183, 104, 97, 23);
		OSIpanel.add(chckbxDays);
		
		dayTextField = new JTextField();
		dayTextField.setEditable(false);
		dayTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dayTextField.setBounds(193, 127, 62, 40);
		OSIpanel.add(dayTextField);
		dayTextField.setColumns(10);
		
		JLabel lblRateOfInterest = new JLabel("Rate of Interest Per Interest Periods");
		lblRateOfInterest.setBounds(77, 194, 217, 14);
		OSIpanel.add(lblRateOfInterest);
		
		JLabel lblI = new JLabel("i :");
		lblI.setBounds(10, 233, 46, 14);
		OSIpanel.add(lblI);
		
		rateTextField = new JTextField();
		rateTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rateTextField.setBounds(45, 222, 62, 40);
		OSIpanel.add(rateTextField);
		rateTextField.setColumns(10);
		
		JLabel label = new JLabel("%");
		label.setBounds(117, 233, 46, 14);
		OSIpanel.add(label);
		
		JLabel lblOsi = new JLabel("OSI :");
		lblOsi.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblOsi.setBounds(343, 48, 86, 49);
		OSIpanel.add(lblOsi);
		
		OSITextField = new JTextField();
		OSITextField.setEditable(false);
		OSITextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		OSITextField.setBounds(425, 48, 230, 49);
		OSIpanel.add(OSITextField);
		OSITextField.setColumns(10);
		
		JLabel lblAccumulatedAmount = new JLabel("Accumulated Amount / Future Value");
		lblAccumulatedAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccumulatedAmount.setBounds(369, 153, 318, 14);
		OSIpanel.add(lblAccumulatedAmount);
		
		JLabel lblF = new JLabel("F :");
		lblF.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblF.setBounds(369, 180, 46, 49);
		OSIpanel.add(lblF);
		
		futureTextField = new JTextField();
		futureTextField.setEditable(false);
		futureTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		futureTextField.setBounds(425, 182, 230, 49);
		OSIpanel.add(futureTextField);
		futureTextField.setColumns(10);
		
		JRadioButton rdbtnOrdinarySimpleInterest = new JRadioButton("ORDINARY SIMPLE INTEREST");
		rdbtnOrdinarySimpleInterest.setSelected(true);
		rdbtnOrdinarySimpleInterest.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				OSIpanel.show();
				ESIpanel.show(false);
				presentValuetextField.setText("");
				chckbxMonths.setSelected(false);
				monthTextField.setText("");
				monthTextField.setEditable(false);
				chckbxDays.setSelected(false);
				dayTextField.setText("");
				dayTextField.setEditable(false);
				rateTextField.setText("");
				futureTextField.setText("");
				OSITextField.setText("");
				
			}
		});
		rdbtnOrdinarySimpleInterest.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnOrdinarySimpleInterest.setBounds(121, 64, 320, 23);
		frame.getContentPane().add(rdbtnOrdinarySimpleInterest);
		
		bg.add(rdbtnOrdinarySimpleInterest);
		
		//Calculations OSI
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double p, i, n, future, osi;
				p = Double.parseDouble(presentValuetextField.getText());
				i = (Double.parseDouble(rateTextField.getText()))/100.00;
					
					if(monthTextField.isEditable()&&dayTextField.isEditable()) {
						n = ((Double.parseDouble(monthTextField.getText())*30)+(Double.parseDouble(dayTextField.getText())))/360;
						osi = p*n*i;
						future = p + osi ;
						futureTextField.setText(""+dec.format(future));
						OSITextField.setText(""+dec.format(osi));
					}else if(monthTextField.isEditable()) {
						n = (Double.parseDouble(monthTextField.getText())/12);
						osi = p*n*i;
						future = p + osi ;
						futureTextField.setText(""+dec.format(future));
						OSITextField.setText(""+dec.format(osi));
					}else if(dayTextField.isEditable()) {
						n = (Double.parseDouble(dayTextField.getText())/360);
						osi = p*n*i;
						future = p + osi ;
						futureTextField.setText(""+dec.format(future));
						OSITextField.setText(""+dec.format(osi));
					}
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalculate.setBounds(194, 271, 131, 41);
		OSIpanel.add(btnCalculate);
		
		//esi
		ESIpanel = new JPanel();
		layeredPane.add(ESIpanel, "name_1075235143995548");
		ESIpanel.setLayout(null);
		
		JLabel lblP_1 = new JLabel("P :");
		lblP_1.setBounds(10, 47, 31, 14);
		ESIpanel.add(lblP_1);
		
		JLabel lblPrincipalPresent = new JLabel("Principal / Present Worth");
		lblPrincipalPresent.setBounds(88, 11, 152, 14);
		ESIpanel.add(lblPrincipalPresent);
		
		esiPrincipalTextField = new JTextField();
		esiPrincipalTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		esiPrincipalTextField.setBounds(51, 32, 170, 38);
		ESIpanel.add(esiPrincipalTextField);
		esiPrincipalTextField.setColumns(10);
		
		JLabel lblNumberOfInterest_1 = new JLabel("Number of Interest Periods");
		lblNumberOfInterest_1.setBounds(77, 84, 146, 14);
		ESIpanel.add(lblNumberOfInterest_1);
		
		JLabel lblFrom = new JLabel("From :");
		lblFrom.setBounds(128, 108, 46, 14);
		ESIpanel.add(lblFrom);
		
		JLabel lblMonth = new JLabel("MONTH");
		lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonth.setBounds(34, 133, 54, 14);
		ESIpanel.add(lblMonth);
		
		JLabel lblDay = new JLabel("DAY");
		lblDay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDay.setBounds(98, 133, 58, 14);
		ESIpanel.add(lblDay);
		
		JLabel lblYear = new JLabel("YEAR");
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setBounds(166, 133, 86, 14);
		ESIpanel.add(lblYear);
		
		esiMonthTextField = new JTextField();
		esiMonthTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		esiMonthTextField.setBounds(34, 152, 54, 38);
		ESIpanel.add(esiMonthTextField);
		esiMonthTextField.setColumns(10);
		
		esiDayTextField = new JTextField();
		esiDayTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		esiDayTextField.setText("");
		esiDayTextField.setBounds(98, 152, 58, 38);
		ESIpanel.add(esiDayTextField);
		esiDayTextField.setColumns(10);
		
		esiYearTextField = new JTextField();
		esiYearTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		esiYearTextField.setBounds(166, 152, 86, 38);
		ESIpanel.add(esiYearTextField);
		esiYearTextField.setColumns(10);
		
		JLabel lblTo = new JLabel("To :");
		lblTo.setBounds(128, 203, 46, 14);
		ESIpanel.add(lblTo);
		
		esiMonth2TextField = new JTextField();
		esiMonth2TextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		esiMonth2TextField.setBounds(34, 228, 54, 45);
		ESIpanel.add(esiMonth2TextField);
		esiMonth2TextField.setColumns(10);
		
		esiDay2TextField = new JTextField();
		esiDay2TextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		esiDay2TextField.setText("");
		esiDay2TextField.setBounds(100, 228, 56, 45);
		ESIpanel.add(esiDay2TextField);
		esiDay2TextField.setColumns(10);
		
		esiYear2TextField = new JTextField();
		esiYear2TextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		esiYear2TextField.setBounds(166, 228, 86, 45);
		ESIpanel.add(esiYear2TextField);
		esiYear2TextField.setColumns(10);
		
		JLabel lblRateOfInterest_1 = new JLabel("Rate of Interest Periods");
		lblRateOfInterest_1.setBounds(386, 11, 170, 14);
		ESIpanel.add(lblRateOfInterest_1);
		
		JLabel lblI_1 = new JLabel("i :");
		lblI_1.setBounds(350, 47, 46, 14);
		ESIpanel.add(lblI_1);
		
		esiRateTextField = new JTextField();
		esiRateTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		esiRateTextField.setBounds(386, 32, 69, 38);
		ESIpanel.add(esiRateTextField);
		esiRateTextField.setColumns(10);
		
		JLabel label_1 = new JLabel("%");
		label_1.setBounds(465, 47, 46, 14);
		ESIpanel.add(label_1);
		
		JLabel lblEsi = new JLabel("ESI :");
		lblEsi.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEsi.setBounds(292, 167, 114, 37);
		ESIpanel.add(lblEsi);
		
		ESITextField = new JTextField();
		ESITextField.setEditable(false);
		ESITextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ESITextField.setBounds(386, 165, 233, 45);
		ESIpanel.add(ESITextField);
		ESITextField.setColumns(10);
		
		JLabel lblAccumulatedAmount_1 = new JLabel("Accumulated Amount / Future Value");
		lblAccumulatedAmount_1.setBounds(416, 228, 185, 14);
		ESIpanel.add(lblAccumulatedAmount_1);
		
		JLabel lblF_1 = new JLabel("F :");
		lblF_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblF_1.setBounds(292, 259, 54, 37);
		ESIpanel.add(lblF_1);
		
		esiFutureTextField = new JTextField();
		esiFutureTextField.setEditable(false);
		esiFutureTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		esiFutureTextField.setBounds(386, 253, 233, 43);
		ESIpanel.add(esiFutureTextField);
		esiFutureTextField.setColumns(10);
		
		//Calculations
		JButton btnCalculate_1 = new JButton("CALCULATE");
		btnCalculate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pEsi, yearEsi, iEsi, nEsi, futureESI, esi;
				pEsi = Double.parseDouble(esiPrincipalTextField.getText());
				iEsi = (Double.parseDouble(esiRateTextField.getText()))/100.00;
				
				String day1 = esiMonthTextField.getText()+" "+esiDayTextField.getText()+" "+esiYearTextField.getText();
				String day12 = esiMonth2TextField.getText()+" "+esiDay2TextField.getText()+" "+esiYear2TextField.getText();
				try {
				Date dateFirst =f.parse(day1);
				Date dateEnd =f.parse(day12);
					long diff = dateEnd.getTime() - dateFirst.getTime();
					double daysFinal = (diff/(1000*60*60*24));
					
					yearEsi = Double.parseDouble(esiDayTextField.getText());
					if(yearEsi%4==0) {
						yearEsi = 366;
						nEsi = daysFinal/yearEsi;
						esi = pEsi*nEsi*iEsi ;
						futureESI = pEsi + esi;
						yearEsi = 366;
						
						esiFutureTextField.setText(""+dec.format(futureESI));
						ESITextField.setText(""+dec.format(esi));
					}else{
						yearEsi = 365;
						nEsi = daysFinal/yearEsi;
						esi = pEsi*nEsi*iEsi ;
						futureESI = pEsi + esi;
						esiFutureTextField.setText(""+dec.format(futureESI));
						ESITextField.setText(""+dec.format(esi));
					}
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCalculate_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalculate_1.setBounds(360, 94, 170, 38);
		ESIpanel.add(btnCalculate_1);
		
		
		JRadioButton rdbtnExactSimpleInterest = new JRadioButton("EXACT SIMPLE INTEREST");
		rdbtnExactSimpleInterest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ESIpanel.show();
				OSIpanel.show(false);
				esiPrincipalTextField.setText("");
				esiMonthTextField.setText("");
				esiMonth2TextField.setText("");
				esiDayTextField.setText("");
				esiDay2TextField.setText("");
				esiYearTextField.setText("");
				esiYear2TextField.setText("");
				esiRateTextField.setText("");
				ESITextField.setText("");
				esiFutureTextField.setText("");
				
				
			}
		});
		rdbtnExactSimpleInterest.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnExactSimpleInterest.setBounds(499, 64, 269, 23);
		frame.getContentPane().add(rdbtnExactSimpleInterest);
		
		
		bg.add(rdbtnExactSimpleInterest);
	}
}
