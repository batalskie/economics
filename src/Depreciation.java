import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;

public class Depreciation {

	private JFrame frmDepreciationMethods;
	private DecimalFormat dec = new DecimalFormat("0.00");
	public ButtonGroup bg = new ButtonGroup();
	private JPanel menuPanel;
	private JPanel straightPanel;
	private JPanel sinkingPanel;
	private JPanel sumPanel;
	private JPanel decliningPanel;
	private JPanel doubleDecPanel;
	private JPanel workingPanel;
	private JPanel constantPanel;
	private JPanel outputPpanel;
	private JTextField fcTextField;
	private JTextField svTextField;
	private JTextField yearTextField;
	private JTextField thisYearTextField;
	private JTextField annualTextField;
	private JTextField totalTextField;
	private JTextField bvTextField;
	private JCheckBox chckbxTotalDepreciationAfter;
	private JTextField svStraightextField;
	private JTextField fcStraightTextField;
	private JTextField yearStraighTextField;
	private JTextField anStraightTextField;
	private JTextField totaldStraightTextField;
	private JTextField xStraightTextField;
	private JTextField bvStraightTextField;
	private JTextField iStraightextField;
	private JCheckBox checkBoxStraight;
	private JTextField fcSumTextField;
	private JTextField yearSumTextField;
	private JTextField svSumTextField;
	private JTextField anSumTextField;
	private JTextField bvAfterSumTextField;
	private JTextField mSumTextField;
	private JTextField bvSumTextField;
	private JCheckBox checkBoxSum;
	private JTextField fcDecTextField;
	private JTextField svDecTextField;
	private JTextField yearDecTextField;
	private JTextField kDecTextField;
	private JTextField depDecTextField;
	private JTextField bvDecTextField;
	private JTextField mDecTextField;
	private JTextField fcDouTextField;
	private JTextField yearDouTextField;
	private JTextField bvDouTextField;
	private JTextField mDouTextField;
	private JTextField totalWorTextField;
	private JTextField fcWorTextField;
	private JTextField svWorTextField;
	private JTextField depWorTextField;
	private JTextField svOutTextField;
	private JTextField fcOutTextField;
	private JTextField totalOutTextField;
	private JTextField depOutTextField;
	private JTextField fcConTextField;
	private JTextField svConTextField;
	private JTextField totalConTextField;
	private JTextField depConTextField;
	private JTextField depRateDecTextField;
	private JCheckBox chckbxDepreciationRateDec;
	private JCheckBox chckbxBookValueAfterDec;
	private JTextField depDouTextField;
	private JTextField depYTextField;
	private JCheckBox chckbxDepreciationThisYear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Depreciation window = new Depreciation();
					window.frmDepreciationMethods.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Depreciation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDepreciationMethods = new JFrame();
		frmDepreciationMethods.setTitle("DEPRECIATION METHODS");
		frmDepreciationMethods.setResizable(false);
		frmDepreciationMethods.setBounds(100, 100, 450, 491);
		frmDepreciationMethods.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDepreciationMethods.getContentPane().setLayout(new CardLayout(0, 0));
		
		JLayeredPane layeredPane = new JLayeredPane();
		frmDepreciationMethods.getContentPane().add(layeredPane, "name_298216331423039");
		layeredPane.setLayout(new CardLayout(0, 0));
		
		menuPanel = new JPanel();
		layeredPane.add(menuPanel, "name_299918591761121");
		menuPanel.setLayout(null);
		
		JLabel lblDepreciation = new JLabel("DEPRECIATION");
		lblDepreciation.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDepreciation.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepreciation.setBounds(10, 11, 414, 33);
		menuPanel.add(lblDepreciation);
		
		JRadioButton rdbtnStraightLineMethod = new JRadioButton("STRAIGHT LINE METHOD");
		rdbtnStraightLineMethod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDepreciationMethods.setTitle("STRAIGHT LINE METHOD");
				straightPanel.setVisible(true);
				sinkingPanel.setVisible(false);
				sumPanel.setVisible(false);
				decliningPanel.setVisible(false);
				doubleDecPanel.setVisible(false);
				workingPanel.setVisible(false);
				constantPanel.setVisible(false);
				outputPpanel.setVisible(false);
				menuPanel.setVisible(false);
				
			}
		});
		rdbtnStraightLineMethod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnStraightLineMethod.setBounds(70, 70, 354, 23);
		menuPanel.add(rdbtnStraightLineMethod);
		
		JRadioButton rdbtnSinkingFundMethod = new JRadioButton("SINKING FUND METHOD");
		rdbtnSinkingFundMethod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDepreciationMethods.setTitle("SINKING FUND METHOD");
				straightPanel.setVisible(false);
				sinkingPanel.setVisible(true);
				sumPanel.setVisible(false);
				decliningPanel.setVisible(false);
				doubleDecPanel.setVisible(false);
				workingPanel.setVisible(false);
				constantPanel.setVisible(false);
				outputPpanel.setVisible(false);
				menuPanel.setVisible(false);
			}
		});
		rdbtnSinkingFundMethod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnSinkingFundMethod.setBounds(70, 111, 354, 23);
		menuPanel.add(rdbtnSinkingFundMethod);
		
		JRadioButton rdbtnSumOfYears = new JRadioButton("SUM OF YEARS DIGIT METHOD");
		rdbtnSumOfYears.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDepreciationMethods.setTitle("SUM OF YEARS DIGIT METHOD");
				straightPanel.setVisible(false);
				sinkingPanel.setVisible(false);
				sumPanel.setVisible(true);
				decliningPanel.setVisible(false);
				doubleDecPanel.setVisible(false);
				workingPanel.setVisible(false);
				constantPanel.setVisible(false);
				outputPpanel.setVisible(false);
				menuPanel.setVisible(false);
			}
		});
		rdbtnSumOfYears.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnSumOfYears.setBounds(70, 150, 354, 23);
		menuPanel.add(rdbtnSumOfYears);
		
		JRadioButton rdbtnDecliningBalanceMethod = new JRadioButton("DECLINING BALANCE METHOD");
		rdbtnDecliningBalanceMethod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDepreciationMethods.setTitle("DECLINING BALANCE METHOD");
				straightPanel.setVisible(false);
				sinkingPanel.setVisible(false);
				sumPanel.setVisible(false);
				decliningPanel.setVisible(true);
				doubleDecPanel.setVisible(false);
				workingPanel.setVisible(false);
				constantPanel.setVisible(false);
				outputPpanel.setVisible(false);
				menuPanel.setVisible(false);
			}
		});
		rdbtnDecliningBalanceMethod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnDecliningBalanceMethod.setBounds(70, 188, 354, 23);
		menuPanel.add(rdbtnDecliningBalanceMethod);
		
		JRadioButton rdbtnDoubleDecliningBalace = new JRadioButton("DOUBLE DECLINING BALACE METHOD");
		rdbtnDoubleDecliningBalace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDepreciationMethods.setTitle("DOUBLE DECLINING BALANCE METHOD");
				straightPanel.setVisible(false);
				sinkingPanel.setVisible(false);
				sumPanel.setVisible(false);
				decliningPanel.setVisible(false);
				doubleDecPanel.setVisible(true);
				workingPanel.setVisible(false);
				constantPanel.setVisible(false);
				outputPpanel.setVisible(false);
				menuPanel.setVisible(false);
			}
		});
		rdbtnDoubleDecliningBalace.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnDoubleDecliningBalace.setBounds(70, 237, 354, 23);
		menuPanel.add(rdbtnDoubleDecliningBalace);
		
		JRadioButton rdbtnWorkingHoursMethod = new JRadioButton("WORKING HOURS METHOD / MACHINE HOUR METHOD");
		rdbtnWorkingHoursMethod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDepreciationMethods.setTitle("WORKING HOURS METHOD / MACHINE HOUR METHOD");
				straightPanel.setVisible(false);
				sinkingPanel.setVisible(false);
				sumPanel.setVisible(false);
				decliningPanel.setVisible(false);
				doubleDecPanel.setVisible(false);
				workingPanel.setVisible(true);
				constantPanel.setVisible(false);
				outputPpanel.setVisible(false);
				menuPanel.setVisible(false);
			}
		});
		rdbtnWorkingHoursMethod.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnWorkingHoursMethod.setBounds(70, 280, 354, 23);
		menuPanel.add(rdbtnWorkingHoursMethod);
		
		JRadioButton rdbtnConstantUnit = new JRadioButton("CONSTANT UNIT METHOD");
		rdbtnConstantUnit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDepreciationMethods.setTitle("CONSTANT UNIT METHOD");
				straightPanel.setVisible(false);
				sinkingPanel.setVisible(false);
				sumPanel.setVisible(false);
				decliningPanel.setVisible(false);
				doubleDecPanel.setVisible(false);
				workingPanel.setVisible(false);
				constantPanel.setVisible(true);
				outputPpanel.setVisible(false);
				menuPanel.setVisible(false);
			}
		});
		rdbtnConstantUnit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnConstantUnit.setBounds(70, 325, 354, 23);
		menuPanel.add(rdbtnConstantUnit);
		
		JRadioButton rdbtnOutputMethod = new JRadioButton("OUTPUT METHOD");
		rdbtnOutputMethod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDepreciationMethods.setTitle("OUTPUT METHOD");
				straightPanel.setVisible(false);
				sinkingPanel.setVisible(false);
				sumPanel.setVisible(false);
				decliningPanel.setVisible(false);
				doubleDecPanel.setVisible(false);
				workingPanel.setVisible(false);
				constantPanel.setVisible(false);
				outputPpanel.setVisible(true);
				menuPanel.setVisible(false);
			}
		});
		rdbtnOutputMethod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnOutputMethod.setBounds(70, 364, 354, 23);
		menuPanel.add(rdbtnOutputMethod);
		
		straightPanel = new JPanel();
		layeredPane.add(straightPanel, "name_299918643299154");
		straightPanel.setLayout(null);
		
		JButton btnDepeciationMethods = new JButton("DEPECIATION METHODS");
		btnDepeciationMethods.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDepreciationMethods.setTitle("DEPRECIATION MENU");
				straightPanel.setVisible(false);
				sinkingPanel.setVisible(false);
				sumPanel.setVisible(false);
				decliningPanel.setVisible(false);
				doubleDecPanel.setVisible(false);
				workingPanel.setVisible(false);
				constantPanel.setVisible(false);
				outputPpanel.setVisible(false);
				menuPanel.setVisible(true);
			}
		});
		btnDepeciationMethods.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnDepeciationMethods.setBounds(10, 11, 151, 23);
		straightPanel.add(btnDepeciationMethods);
		
		JLabel lblFirstCost = new JLabel("FIRST COST :");
		lblFirstCost.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstCost.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFirstCost.setBounds(20, 54, 141, 30);
		straightPanel.add(lblFirstCost);
		
		JLabel lblSalvageCost = new JLabel("SALVAGE COST :");
		lblSalvageCost.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSalvageCost.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSalvageCost.setBounds(20, 95, 141, 30);
		straightPanel.add(lblSalvageCost);
		
		JLabel lblYear = new JLabel("YEAR :");
		lblYear.setHorizontalAlignment(SwingConstants.RIGHT);
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblYear.setBounds(20, 132, 141, 30);
		straightPanel.add(lblYear);
		
		fcTextField = new JTextField();
		fcTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fcTextField.setBounds(171, 56, 207, 30);
		straightPanel.add(fcTextField);
		fcTextField.setColumns(10);
		
		svTextField = new JTextField();
		svTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		svTextField.setColumns(10);
		svTextField.setBounds(171, 97, 207, 30);
		straightPanel.add(svTextField);
		
		yearTextField = new JTextField();
		yearTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		yearTextField.setColumns(10);
		yearTextField.setBounds(171, 134, 207, 30);
		straightPanel.add(yearTextField);
		
		thisYearTextField = new JTextField();
		thisYearTextField.setEditable(false);
		thisYearTextField.setHorizontalAlignment(SwingConstants.CENTER);
		thisYearTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		thisYearTextField.setColumns(10);
		thisYearTextField.setBounds(365, 325, 59, 30);
		straightPanel.add(thisYearTextField);
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double fc, sv, n, x, ad, totald, bv;
				fc = Double.parseDouble(fcTextField.getText());
				sv = Double.parseDouble(svTextField.getText());
				n = Double.parseDouble(yearTextField.getText());
				
				ad = (fc-sv)/n;
				
				annualTextField.setText(""+dec.format(ad));
				
				
				if(chckbxTotalDepreciationAfter.isSelected()) {
					
					x = Double.parseDouble(thisYearTextField.getText());
					totald = ((fc-sv)/n)*x;
					bv = fc - totald;
					
					totalTextField.setText(""+dec.format(totald));
					bvTextField.setText(""+dec.format(bv));
				
				}
				
				
				
				
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalculate.setBounds(171, 175, 141, 23);
		straightPanel.add(btnCalculate);
		
		JLabel lblAnnualDepreciation = new JLabel("ANNUAL DEPRECIATION");
		lblAnnualDepreciation.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnnualDepreciation.setBounds(10, 233, 424, 14);
		straightPanel.add(lblAnnualDepreciation);
		
		chckbxTotalDepreciationAfter = new JCheckBox("TOTAL DEPRECIATION AFTER                                                    THIS YEAR");
		chckbxTotalDepreciationAfter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTotalDepreciationAfter.isSelected()) {
					thisYearTextField.setEditable(true);
				}else {
					thisYearTextField.setText("");
					totalTextField.setText("");
					bvTextField.setText("");
					thisYearTextField.setEditable(false);
					
					
				}
			}
		});
		chckbxTotalDepreciationAfter.setBounds(20, 295, 414, 23);
		straightPanel.add(chckbxTotalDepreciationAfter);
		
		
		annualTextField = new JTextField();
		annualTextField.setEditable(false);
		annualTextField.setHorizontalAlignment(SwingConstants.CENTER);
		annualTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		annualTextField.setColumns(10);
		annualTextField.setBounds(10, 258, 414, 30);
		straightPanel.add(annualTextField);
		
		totalTextField = new JTextField();
		totalTextField.setHorizontalAlignment(SwingConstants.CENTER);
		totalTextField.setEditable(false);
		totalTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		totalTextField.setColumns(10);
		totalTextField.setBounds(30, 325, 325, 30);
		straightPanel.add(totalTextField);
		
		JLabel lblBookValue = new JLabel("BOOK VALUE");
		lblBookValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookValue.setBounds(10, 366, 424, 14);
		straightPanel.add(lblBookValue);
		
		bvTextField = new JTextField();
		bvTextField.setEditable(false);
		bvTextField.setHorizontalAlignment(SwingConstants.CENTER);
		bvTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		bvTextField.setColumns(10);
		bvTextField.setBounds(10, 391, 414, 30);
		straightPanel.add(bvTextField);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fcTextField.setText("");
				svTextField.setText("");
				yearTextField.setText("");
				annualTextField.setText("");
				chckbxTotalDepreciationAfter.setSelected(false);
				thisYearTextField.setText("");
				thisYearTextField.setEditable(false);
				totalTextField.setText("");
				bvTextField.setText("");
				
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnClear.setBounds(349, 175, 75, 23);
		straightPanel.add(btnClear);
		
		sinkingPanel = new JPanel();
		layeredPane.add(sinkingPanel, "name_299918691304350");
		sinkingPanel.setLayout(null);
		
		JButton button = new JButton("DEPECIATION METHODS");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDepreciationMethods.setTitle("DEPRECIATION MENU");
				straightPanel.setVisible(false);
				sinkingPanel.setVisible(false);
				sumPanel.setVisible(false);
				decliningPanel.setVisible(false);
				doubleDecPanel.setVisible(false);
				workingPanel.setVisible(false);
				constantPanel.setVisible(false);
				outputPpanel.setVisible(false);
				menuPanel.setVisible(true);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 8));
		button.setBounds(10, 11, 151, 23);
		sinkingPanel.add(button);
		
		JLabel label = new JLabel("FIRST COST :");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(20, 54, 141, 30);
		sinkingPanel.add(label);
		
		svStraightextField = new JTextField();
		svStraightextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		svStraightextField.setColumns(10);
		svStraightextField.setBounds(171, 97, 207, 30);
		sinkingPanel.add(svStraightextField);
		
		JLabel label_1 = new JLabel("SALVAGE COST :");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(20, 95, 141, 30);
		sinkingPanel.add(label_1);
		
		fcStraightTextField = new JTextField();
		fcStraightTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fcStraightTextField.setColumns(10);
		fcStraightTextField.setBounds(171, 56, 207, 30);
		sinkingPanel.add(fcStraightTextField);
		
		JLabel label_2 = new JLabel("YEAR :");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(20, 132, 141, 30);
		sinkingPanel.add(label_2);
		
		yearStraighTextField = new JTextField();
		yearStraighTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		yearStraighTextField.setColumns(10);
		yearStraighTextField.setBounds(171, 134, 207, 30);
		sinkingPanel.add(yearStraighTextField);
		
		JButton button_7 = new JButton("CALCULATE");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double fc, sv, i, n, x, ad, bv, totald;
				fc = Double.parseDouble(fcStraightTextField.getText());
				sv = Double.parseDouble(svStraightextField.getText());
				n = Double.parseDouble(yearStraighTextField.getText());
				i = (Double.parseDouble(iStraightextField.getText()))/100;
				
				ad = ((fc-sv)*i)/((Math.pow(1+i, n))-1);
				
				anStraightTextField.setText(""+dec.format(ad));
			
				if(checkBoxStraight.isSelected()) {
					
					x = Double.parseDouble(xStraightTextField.getText());
					totald = (ad*(Math.pow(1+i, x)-1))/i;
					bv = fc - totald;
					
					totaldStraightTextField.setText(""+dec.format(totald));
					bvStraightTextField.setText(""+dec.format(bv));
				
				}
				
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_7.setBounds(171, 218, 141, 23);
		sinkingPanel.add(button_7);
		
		JButton button_8 = new JButton("CLEAR");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fcStraightTextField.setText("");
				svStraightextField.setText("");
				yearStraighTextField.setText("");
				iStraightextField.setText("");
				anStraightTextField.setText("");
				totaldStraightTextField.setText("");
				xStraightTextField.setText("");
				xStraightTextField.setEditable(false);
				bvStraightTextField.setText("");
				checkBoxStraight.setSelected(false);
				
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_8.setBounds(343, 220, 75, 23);
		sinkingPanel.add(button_8);
		
		JLabel label_3 = new JLabel("ANNUAL DEPRECIATION");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(10, 254, 424, 14);
		sinkingPanel.add(label_3);
		
		anStraightTextField = new JTextField();
		anStraightTextField.setHorizontalAlignment(SwingConstants.CENTER);
		anStraightTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		anStraightTextField.setEditable(false);
		anStraightTextField.setColumns(10);
		anStraightTextField.setBounds(10, 279, 414, 30);
		sinkingPanel.add(anStraightTextField);
		
		checkBoxStraight = new JCheckBox("TOTAL DEPRECIATION AFTER                                                    THIS YEAR");
		checkBoxStraight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkBoxStraight.isSelected()) {
					xStraightTextField.setEditable(true);
				}else {
					totaldStraightTextField.setText("");
					xStraightTextField.setText("");
					bvStraightTextField.setText("");
					xStraightTextField.setEditable(false);
				}
			}
		});
		checkBoxStraight.setBounds(20, 316, 414, 23);
		sinkingPanel.add(checkBoxStraight);
		
		totaldStraightTextField = new JTextField();
		totaldStraightTextField.setHorizontalAlignment(SwingConstants.CENTER);
		totaldStraightTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		totaldStraightTextField.setEditable(false);
		totaldStraightTextField.setColumns(10);
		totaldStraightTextField.setBounds(30, 346, 325, 30);
		sinkingPanel.add(totaldStraightTextField);
		
		xStraightTextField = new JTextField();
		xStraightTextField.setHorizontalAlignment(SwingConstants.CENTER);
		xStraightTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		xStraightTextField.setEditable(false);
		xStraightTextField.setColumns(10);
		xStraightTextField.setBounds(365, 346, 59, 30);
		sinkingPanel.add(xStraightTextField);
		
		JLabel label_4 = new JLabel("BOOK VALUE");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(10, 387, 424, 14);
		sinkingPanel.add(label_4);
		
		bvStraightTextField = new JTextField();
		bvStraightTextField.setHorizontalAlignment(SwingConstants.CENTER);
		bvStraightTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		bvStraightTextField.setEditable(false);
		bvStraightTextField.setColumns(10);
		bvStraightTextField.setBounds(10, 412, 414, 30);
		sinkingPanel.add(bvStraightTextField);
		
		iStraightextField = new JTextField();
		iStraightextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		iStraightextField.setColumns(10);
		iStraightextField.setBounds(171, 175, 104, 30);
		sinkingPanel.add(iStraightextField);
		
		JLabel label_5 = new JLabel("%");
		label_5.setBounds(285, 187, 46, 14);
		sinkingPanel.add(label_5);
		
		JLabel lblInterest = new JLabel("INTEREST :");
		lblInterest.setHorizontalAlignment(SwingConstants.RIGHT);
		lblInterest.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInterest.setBounds(20, 173, 141, 30);
		sinkingPanel.add(lblInterest);
		
		sumPanel = new JPanel();
		layeredPane.add(sumPanel, "name_299918742401633");
		sumPanel.setLayout(null);
		
		JButton button_1 = new JButton("DEPECIATION METHODS");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDepreciationMethods.setTitle("DEPRECIATION MENU");
				straightPanel.setVisible(false);
				sinkingPanel.setVisible(false);
				sumPanel.setVisible(false);
				decliningPanel.setVisible(false);
				doubleDecPanel.setVisible(false);
				workingPanel.setVisible(false);
				constantPanel.setVisible(false);
				outputPpanel.setVisible(false);
				menuPanel.setVisible(true);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_1.setBounds(10, 11, 151, 23);
		sumPanel.add(button_1);
		
		JLabel label_6 = new JLabel("FIRST COST :");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_6.setBounds(20, 54, 141, 30);
		sumPanel.add(label_6);
		
		JLabel label_7 = new JLabel("SALVAGE COST :");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(20, 95, 141, 30);
		sumPanel.add(label_7);
		
		fcSumTextField = new JTextField();
		fcSumTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fcSumTextField.setColumns(10);
		fcSumTextField.setBounds(171, 56, 207, 30);
		sumPanel.add(fcSumTextField);
		
		yearSumTextField = new JTextField();
		yearSumTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		yearSumTextField.setColumns(10);
		yearSumTextField.setBounds(171, 134, 207, 30);
		sumPanel.add(yearSumTextField);
		
		JLabel label_8 = new JLabel("YEAR :");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_8.setBounds(20, 132, 141, 30);
		sumPanel.add(label_8);
		
		svSumTextField = new JTextField();
		svSumTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		svSumTextField.setColumns(10);
		svSumTextField.setBounds(171, 97, 207, 30);
		sumPanel.add(svSumTextField);
		
		JButton button_9 = new JButton("CALCULATE");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double fc, sv, year, n, m, ad,  bv, duYear;
				fc = Double.parseDouble(fcSumTextField.getText());
				sv = Double.parseDouble(svSumTextField.getText());
				n = Double.parseDouble(yearSumTextField.getText());
				year = (n/2)*(1+n);
				
				int sum = 0;
				for(int i = 1;i<=n;i++) {
					sum = sum+i;
					
				}
				ad = (fc-sv)*(sum/year);
				anSumTextField.setText(""+dec.format(ad));
				bv = fc - ad;
				bvSumTextField.setText(""+dec.format(bv));
				
				if(chckbxDepreciationThisYear.isSelected()) {
					duYear = Double.parseDouble(depYTextField.getText());
					
					for(int i=1;i<duYear;i++) {
						
						n -=1;
						
					}
					ad = (fc - sv)*(n/sum);
					
					anSumTextField.setText(""+dec.format(ad));
					
					bv = fc - ad;
					bvSumTextField.setText(""+dec.format(bv));
			
				}

				if(checkBoxSum.isSelected()) {
					m = Double.parseDouble(mSumTextField.getText());
					n +=1;
					double sum1 = 0;
					for(int i=1;i<=m;i++) {
						n -=1;
						sum1 = sum1 + n;
					}
					bv = (fc - sv)*(sum1/sum);
					
					bvAfterSumTextField.setText(""+dec.format(bv));
					
					
					
				}
				
				
				
				
				
				
				
				
				
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_9.setBounds(171, 175, 141, 23);
		sumPanel.add(button_9);
		
		JButton button_10 = new JButton("CLEAR");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fcSumTextField.setText("");
				svSumTextField.setText("");
				yearSumTextField.setText("");
				anSumTextField.setText("");
				checkBoxSum.setSelected(false);
				bvAfterSumTextField.setText("");
				mSumTextField.setText("");
				bvAfterSumTextField.setText("");
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_10.setBounds(349, 175, 75, 23);
		sumPanel.add(button_10);
		
		anSumTextField = new JTextField();
		anSumTextField.setHorizontalAlignment(SwingConstants.CENTER);
		anSumTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		anSumTextField.setEditable(false);
		anSumTextField.setColumns(10);
		anSumTextField.setBounds(30, 258, 325, 30);
		sumPanel.add(anSumTextField);
		
		checkBoxSum = new JCheckBox("BOOK VALUE AFTER                                                                     THIS YEAR");
		checkBoxSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBoxSum.isSelected()) {
					mSumTextField.setEditable(true);
				}else {
					mSumTextField.setEditable(false);
					mSumTextField.setText("");
					bvAfterSumTextField.setText("");
					
				}
			}
		});
		checkBoxSum.setBounds(20, 361, 414, 23);
		sumPanel.add(checkBoxSum);
		
		bvAfterSumTextField = new JTextField();
		bvAfterSumTextField.setHorizontalAlignment(SwingConstants.CENTER);
		bvAfterSumTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		bvAfterSumTextField.setEditable(false);
		bvAfterSumTextField.setColumns(10);
		bvAfterSumTextField.setBounds(30, 391, 325, 30);
		sumPanel.add(bvAfterSumTextField);
		
		mSumTextField = new JTextField();
		mSumTextField.setHorizontalAlignment(SwingConstants.CENTER);
		mSumTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mSumTextField.setEditable(false);
		mSumTextField.setColumns(10);
		mSumTextField.setBounds(365, 391, 59, 30);
		sumPanel.add(mSumTextField);
		
		JLabel label_10 = new JLabel("BOOK VALUE");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(10, 299, 424, 14);
		sumPanel.add(label_10);
		
		bvSumTextField = new JTextField();
		bvSumTextField.setHorizontalAlignment(SwingConstants.CENTER);
		bvSumTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		bvSumTextField.setEditable(false);
		bvSumTextField.setColumns(10);
		bvSumTextField.setBounds(10, 324, 414, 30);
		sumPanel.add(bvSumTextField);
		
		depYTextField = new JTextField();
		depYTextField.setHorizontalAlignment(SwingConstants.CENTER);
		depYTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		depYTextField.setEditable(false);
		depYTextField.setColumns(10);
		depYTextField.setBounds(365, 258, 59, 30);
		sumPanel.add(depYTextField);
		
		chckbxDepreciationThisYear = new JCheckBox("THIS YEAR");
		chckbxDepreciationThisYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxDepreciationThisYear.isSelected()) {
					depYTextField.setEditable(true);
				}else {
					depYTextField.setText("");
					depYTextField.setEditable(false);
				}
			}
		});
		chckbxDepreciationThisYear.setBounds(344, 228, 90, 23);
		sumPanel.add(chckbxDepreciationThisYear);
		
		JLabel lblDepreciation_2 = new JLabel("DEPRECIATION AFTER Nth YEAR");
		lblDepreciation_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepreciation_2.setBounds(100, 233, 228, 14);
		sumPanel.add(lblDepreciation_2);
		
		decliningPanel = new JPanel();
		layeredPane.add(decliningPanel, "name_299918878243114");
		decliningPanel.setLayout(null);
		
		JButton button_2 = new JButton("DEPECIATION METHODS");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDepreciationMethods.setTitle("DEPRECIATION MENU");
				straightPanel.setVisible(false);
				sinkingPanel.setVisible(false);
				sumPanel.setVisible(false);
				decliningPanel.setVisible(false);
				doubleDecPanel.setVisible(false);
				workingPanel.setVisible(false);
				constantPanel.setVisible(false);
				outputPpanel.setVisible(false);
				menuPanel.setVisible(true);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_2.setBounds(10, 11, 151, 23);
		decliningPanel.add(button_2);
		
		JLabel label_11 = new JLabel("FIRST COST :");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_11.setBounds(20, 54, 141, 30);
		decliningPanel.add(label_11);
		
		fcDecTextField = new JTextField();
		fcDecTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fcDecTextField.setColumns(10);
		fcDecTextField.setBounds(171, 56, 207, 30);
		decliningPanel.add(fcDecTextField);
		
		JLabel label_12 = new JLabel("SALVAGE COST :");
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_12.setBounds(20, 95, 141, 30);
		decliningPanel.add(label_12);
		
		svDecTextField = new JTextField();
		svDecTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		svDecTextField.setColumns(10);
		svDecTextField.setBounds(171, 97, 207, 30);
		decliningPanel.add(svDecTextField);
		
		JLabel label_13 = new JLabel("YEAR :");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_13.setBounds(20, 132, 141, 30);
		decliningPanel.add(label_13);
		
		yearDecTextField = new JTextField();
		yearDecTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		yearDecTextField.setColumns(10);
		yearDecTextField.setBounds(171, 134, 207, 30);
		decliningPanel.add(yearDecTextField);
		
		kDecTextField = new JTextField();
		kDecTextField.setEditable(false);
		kDecTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		kDecTextField.setColumns(10);
		kDecTextField.setBounds(171, 175, 104, 30);
		decliningPanel.add(kDecTextField);
		
		JLabel label_15 = new JLabel("%");
		label_15.setBounds(285, 187, 46, 14);
		decliningPanel.add(label_15);
		
		JButton button_11 = new JButton("CALCULATE");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double fc, sv, k, n, m, bv, depR, dm;
				fc = Double.parseDouble(fcDecTextField.getText());
				n = Double.parseDouble(yearDecTextField.getText());
				if(chckbxDepreciationRateDec.isSelected()) {
					k = (Double.parseDouble(kDecTextField.getText()))/100;
					sv = fc*(Math.pow(1-k, n));
					
					svDecTextField.setText(""+dec.format(sv));
					
					depR = fc-sv;
					
					depRateDecTextField.setText(""+dec.format(depR));
					
				}else {
					sv = Double.parseDouble(svDecTextField.getText());
					k = 1 -(Math.pow(sv/fc, 1/n));
					
					kDecTextField.setText(""+dec.format(k));
					
					depR = fc-sv;
					
					depRateDecTextField.setText(""+dec.format(depR));
				}
				if(chckbxBookValueAfterDec.isSelected()) {
					m = Double.parseDouble(mDecTextField.getText());
					System.out.println(k);
					bv = fc *(Math.pow(1-k, m));
					dm = fc*(Math.pow(1-k, m-1))*k;
					
					bvDecTextField.setText(""+dec.format(bv));
					depDecTextField.setText(""+dec.format(dm));
					
					
					
				}
				
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_11.setBounds(171, 218, 141, 23);
		decliningPanel.add(button_11);
		
		JButton button_12 = new JButton("CLEAR");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fcDecTextField.setText("");
				svDecTextField.setText("");
				svDecTextField.setEditable(true);
				yearDecTextField.setText("");
				kDecTextField.setText("");
				kDecTextField.setEditable(false);
				bvDecTextField.setText("");
				mDecTextField.setText("");
				depDecTextField.setText("");
				depRateDecTextField.setText("");
				chckbxBookValueAfterDec.setSelected(false);
				chckbxDepreciationRateDec.setSelected(false);
				
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_12.setBounds(343, 220, 75, 23);
		decliningPanel.add(button_12);
		
		depDecTextField = new JTextField();
		depDecTextField.setHorizontalAlignment(SwingConstants.CENTER);
		depDecTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		depDecTextField.setEditable(false);
		depDecTextField.setColumns(10);
		depDecTextField.setBounds(10, 421, 414, 30);
		decliningPanel.add(depDecTextField);
		
		chckbxBookValueAfterDec = new JCheckBox("BOOK VALUE AFTER                                                                     THIS YEAR");
		chckbxBookValueAfterDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBookValueAfterDec.isSelected()) {
					mDecTextField.setEditable(true);
					
				}else {
					mDecTextField.setEditable(false);
					mDecTextField.setText("");
					depDecTextField.setText("");
					bvDecTextField.setText("");
				}
			}
		});
		chckbxBookValueAfterDec.setBounds(20, 325, 414, 23);
		decliningPanel.add(chckbxBookValueAfterDec);
		
		bvDecTextField = new JTextField();
		bvDecTextField.setHorizontalAlignment(SwingConstants.CENTER);
		bvDecTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		bvDecTextField.setEditable(false);
		bvDecTextField.setColumns(10);
		bvDecTextField.setBounds(30, 355, 325, 30);
		decliningPanel.add(bvDecTextField);
		
		mDecTextField = new JTextField();
		mDecTextField.setHorizontalAlignment(SwingConstants.CENTER);
		mDecTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mDecTextField.setEditable(false);
		mDecTextField.setColumns(10);
		mDecTextField.setBounds(365, 355, 59, 30);
		decliningPanel.add(mDecTextField);
		
		JLabel lblDepreciationAtSaid = new JLabel("DEPRECIATION AT SAID YEAR");
		lblDepreciationAtSaid.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepreciationAtSaid.setBounds(10, 396, 424, 14);
		decliningPanel.add(lblDepreciationAtSaid);
		
		chckbxDepreciationRateDec = new JCheckBox("   DEPRECIATION RATE :");
		chckbxDepreciationRateDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxDepreciationRateDec.isSelected()) {
					kDecTextField.setEditable(true);
					svDecTextField.setEditable(false);
					svDecTextField.setText("");
					
				}else {
					kDecTextField.setEditable(false);
					svDecTextField.setEditable(true);
					kDecTextField.setText("");
					
				}
			}
		});
		chckbxDepreciationRateDec.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxDepreciationRateDec.setBounds(10, 177, 151, 23);
		decliningPanel.add(chckbxDepreciationRateDec);
		
		JLabel lblDepreciation_1 = new JLabel("DEPRECIATION (known value of Depreciation Rate)");
		lblDepreciation_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepreciation_1.setBounds(10, 263, 424, 14);
		decliningPanel.add(lblDepreciation_1);
		
		depRateDecTextField = new JTextField();
		depRateDecTextField.setHorizontalAlignment(SwingConstants.CENTER);
		depRateDecTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		depRateDecTextField.setEditable(false);
		depRateDecTextField.setColumns(10);
		depRateDecTextField.setBounds(10, 288, 414, 30);
		decliningPanel.add(depRateDecTextField);
		
		doubleDecPanel = new JPanel();
		layeredPane.add(doubleDecPanel, "name_299918939657241");
		
		JButton button_3 = new JButton("DEPECIATION METHODS");
		button_3.setBounds(10, 11, 151, 23);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDepreciationMethods.setTitle("DEPRECIATION MENU");
				straightPanel.setVisible(false);
				sinkingPanel.setVisible(false);
				sumPanel.setVisible(false);
				decliningPanel.setVisible(false);
				doubleDecPanel.setVisible(false);
				workingPanel.setVisible(false);
				constantPanel.setVisible(false);
				outputPpanel.setVisible(false);
				menuPanel.setVisible(true);
			}
		});
		doubleDecPanel.setLayout(null);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 8));
		doubleDecPanel.add(button_3);
		
		JLabel label_14 = new JLabel("FIRST COST :");
		label_14.setBounds(20, 54, 141, 30);
		label_14.setHorizontalAlignment(SwingConstants.RIGHT);
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		doubleDecPanel.add(label_14);
		
		fcDouTextField = new JTextField();
		fcDouTextField.setBounds(171, 56, 207, 30);
		fcDouTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fcDouTextField.setColumns(10);
		doubleDecPanel.add(fcDouTextField);
		
		yearDouTextField = new JTextField();
		yearDouTextField.setBounds(171, 97, 207, 30);
		yearDouTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		yearDouTextField.setColumns(10);
		doubleDecPanel.add(yearDouTextField);
		
		JLabel label_17 = new JLabel("YEAR :");
		label_17.setBounds(20, 95, 141, 30);
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		doubleDecPanel.add(label_17);
		
		JButton button_13 = new JButton("CALCULATE");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double fc,  k, n, m, bv,  dm;
				fc = Double.parseDouble(fcDouTextField.getText());
				n = Double.parseDouble(yearDouTextField.getText());
				m = Double.parseDouble(mDouTextField.getText());
				
				k = 2/n;				
				bv = fc *(Math.pow(1-k, m));
				dm = fc*(Math.pow(1-k, m-1))*k;
					
				bvDouTextField.setText(""+dec.format(bv));
				depDouTextField.setText(""+dec.format(dm));
					
					
					
			}
		});
		button_13.setBounds(176, 242, 141, 23);
		button_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		doubleDecPanel.add(button_13);
		
		JButton button_14 = new JButton("CLEAR");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fcDouTextField.setText("");
				svDouTextField.setText("");
				svDouTextField.setEditable(true);
				yearDouTextField.setText("");
				kDouTtextField.setText("");
				kDouTtextField.setEditable(false);
				bvDouTextField.setText("");
				mDouTextField.setText("");
				depDouTextField.setText("");
				depDouTextField.setText("");
				checkBoxBookDou.setSelected(false);
				checkBoxDouble.setSelected(false);
			}
		});
		button_14.setBounds(349, 244, 75, 23);
		button_14.setFont(new Font("Tahoma", Font.BOLD, 9));
		doubleDecPanel.add(button_14);
		
		bvDouTextField = new JTextField();
		bvDouTextField.setHorizontalAlignment(SwingConstants.CENTER);
		bvDouTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		bvDouTextField.setEditable(false);
		bvDouTextField.setColumns(10);
		bvDouTextField.setBounds(20, 189, 325, 30);
		doubleDecPanel.add(bvDouTextField);
		
		mDouTextField = new JTextField();
		mDouTextField.setHorizontalAlignment(SwingConstants.CENTER);
		mDouTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mDouTextField.setColumns(10);
		mDouTextField.setBounds(365, 189, 59, 30);
		doubleDecPanel.add(mDouTextField);
		
		JLabel lblDepreciationknownValue = new JLabel("DEPRECIATION AT THE SAID YEAR");
		lblDepreciationknownValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepreciationknownValue.setBounds(10, 293, 424, 14);
		doubleDecPanel.add(lblDepreciationknownValue);
		
		depDouTextField = new JTextField();
		depDouTextField.setHorizontalAlignment(SwingConstants.CENTER);
		depDouTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		depDouTextField.setEditable(false);
		depDouTextField.setColumns(10);
		depDouTextField.setBounds(10, 318, 414, 30);
		doubleDecPanel.add(depDouTextField);
		
		JLabel label_9 = new JLabel("");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_9.setBounds(20, 136, 141, 30);
		doubleDecPanel.add(label_9);
		
		JLabel lblBookValueAfter = new JLabel("BOOK VALUE AFTER                                                                     THIS YEAR");
		lblBookValueAfter.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookValueAfter.setBounds(20, 164, 424, 14);
		doubleDecPanel.add(lblBookValueAfter);
		
		workingPanel = new JPanel();
		layeredPane.add(workingPanel, "name_299918992453662");
		
		JButton button_4 = new JButton("DEPECIATION METHODS");
		button_4.setBounds(10, 11, 151, 23);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDepreciationMethods.setTitle("DEPRECIATION MENU");
				straightPanel.setVisible(false);
				sinkingPanel.setVisible(false);
				sumPanel.setVisible(false);
				decliningPanel.setVisible(false);
				doubleDecPanel.setVisible(false);
				workingPanel.setVisible(false);
				constantPanel.setVisible(false);
				outputPpanel.setVisible(false);
				menuPanel.setVisible(true);
			}
		});
		workingPanel.setLayout(null);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 8));
		workingPanel.add(button_4);
		
		JLabel label_20 = new JLabel("FIRST COST :");
		label_20.setBounds(20, 54, 141, 30);
		label_20.setHorizontalAlignment(SwingConstants.RIGHT);
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		workingPanel.add(label_20);
		
		totalWorTextField = new JTextField();
		totalWorTextField.setBounds(171, 134, 207, 30);
		totalWorTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		totalWorTextField.setColumns(10);
		workingPanel.add(totalWorTextField);
		
		JLabel label_21 = new JLabel("SALVAGE COST :");
		label_21.setBounds(20, 95, 141, 30);
		label_21.setHorizontalAlignment(SwingConstants.RIGHT);
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 15));
		workingPanel.add(label_21);
		
		fcWorTextField = new JTextField();
		fcWorTextField.setBounds(171, 56, 207, 30);
		fcWorTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fcWorTextField.setColumns(10);
		workingPanel.add(fcWorTextField);
		
		JLabel lblTotalNumberOf = new JLabel("TOTAL NUMBER");
		lblTotalNumberOf.setBounds(20, 134, 141, 14);
		lblTotalNumberOf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalNumberOf.setFont(new Font("Tahoma", Font.PLAIN, 9));
		workingPanel.add(lblTotalNumberOf);
		
		svWorTextField = new JTextField();
		svWorTextField.setBounds(171, 97, 207, 30);
		svWorTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		svWorTextField.setColumns(10);
		workingPanel.add(svWorTextField);
		
		JButton button_15 = new JButton("CALCULATE");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double fc, sv, total, d;
				fc = Double.parseDouble(fcWorTextField.getText());
				sv = Double.parseDouble(svWorTextField.getText());
				total = Double.parseDouble(totalWorTextField.getText());
				d = (fc-sv)/total;
				
				depWorTextField.setText(""+dec.format(d));
			}
		});
		button_15.setBounds(171, 175, 141, 23);
		button_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		workingPanel.add(button_15);
		
		JButton button_16 = new JButton("CLEAR");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fcWorTextField.setText("");
				svWorTextField.setText("");
				totalWorTextField.setText("");
				depWorTextField.setText("");
			}
		});
		button_16.setBounds(349, 175, 75, 23);
		button_16.setFont(new Font("Tahoma", Font.BOLD, 9));
		workingPanel.add(button_16);
		
		JLabel lblDepreciationPerHour = new JLabel("DEPRECIATION PER HOUR");
		lblDepreciationPerHour.setBounds(10, 271, 424, 14);
		lblDepreciationPerHour.setHorizontalAlignment(SwingConstants.CENTER);
		workingPanel.add(lblDepreciationPerHour);
		
		depWorTextField = new JTextField();
		depWorTextField.setBounds(10, 296, 414, 30);
		depWorTextField.setHorizontalAlignment(SwingConstants.CENTER);
		depWorTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		depWorTextField.setEditable(false);
		depWorTextField.setColumns(10);
		workingPanel.add(depWorTextField);
		
		JLabel lblOfHours = new JLabel("OF HOURS");
		lblOfHours.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOfHours.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblOfHours.setBounds(20, 146, 141, 14);
		workingPanel.add(lblOfHours);
		
		constantPanel = new JPanel();
		layeredPane.add(constantPanel, "name_299919065418503");
		constantPanel.setLayout(null);
		
		JButton button_5 = new JButton("DEPECIATION METHODS");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDepreciationMethods.setTitle("DEPRECIATION MENU");
				straightPanel.setVisible(false);
				sinkingPanel.setVisible(false);
				sumPanel.setVisible(false);
				decliningPanel.setVisible(false);
				doubleDecPanel.setVisible(false);
				workingPanel.setVisible(false);
				constantPanel.setVisible(false);
				outputPpanel.setVisible(false);
				menuPanel.setVisible(true);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_5.setBounds(10, 11, 151, 23);
		constantPanel.add(button_5);
		
		JLabel label_23 = new JLabel("FIRST COST :");
		label_23.setHorizontalAlignment(SwingConstants.RIGHT);
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_23.setBounds(20, 54, 141, 30);
		constantPanel.add(label_23);
		
		fcConTextField = new JTextField();
		fcConTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fcConTextField.setColumns(10);
		fcConTextField.setBounds(171, 56, 207, 30);
		constantPanel.add(fcConTextField);
		
		JLabel label_24 = new JLabel("SALVAGE COST :");
		label_24.setHorizontalAlignment(SwingConstants.RIGHT);
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_24.setBounds(20, 95, 141, 30);
		constantPanel.add(label_24);
		
		svConTextField = new JTextField();
		svConTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		svConTextField.setColumns(10);
		svConTextField.setBounds(171, 97, 207, 30);
		constantPanel.add(svConTextField);
		
		totalConTextField = new JTextField();
		totalConTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		totalConTextField.setColumns(10);
		totalConTextField.setBounds(171, 134, 207, 30);
		constantPanel.add(totalConTextField);
		
		JButton button_17 = new JButton("CALCULATE");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double fc, sv, total, d;
				fc = Double.parseDouble(fcConTextField.getText());
				sv = Double.parseDouble(svConTextField.getText());
				total = Double.parseDouble(totalConTextField.getText());
				d = (fc-sv)/total;
				
				depConTextField.setText(""+dec.format(d));
			}
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_17.setBounds(171, 175, 141, 23);
		constantPanel.add(button_17);
		
		JButton button_18 = new JButton("CLEAR");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fcConTextField.setText("");
				svConTextField.setText("");
				totalConTextField.setText("");
				depConTextField.setText("");
			}
		});
		button_18.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_18.setBounds(349, 175, 75, 23);
		constantPanel.add(button_18);
		
		JLabel lblDepreciationChargePer = new JLabel("DEPRECIATION CHARGE PER UNIT");
		lblDepreciationChargePer.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepreciationChargePer.setBounds(10, 271, 424, 14);
		constantPanel.add(lblDepreciationChargePer);
		
		depConTextField = new JTextField();
		depConTextField.setHorizontalAlignment(SwingConstants.CENTER);
		depConTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		depConTextField.setEditable(false);
		depConTextField.setColumns(10);
		depConTextField.setBounds(10, 296, 414, 30);
		constantPanel.add(depConTextField);
		
		JLabel lblOfUnits = new JLabel("OF UNITS");
		lblOfUnits.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOfUnits.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblOfUnits.setBounds(20, 146, 141, 14);
		constantPanel.add(lblOfUnits);
		
		JLabel label_27 = new JLabel("TOTAL NUMBER");
		label_27.setHorizontalAlignment(SwingConstants.RIGHT);
		label_27.setFont(new Font("Tahoma", Font.PLAIN, 9));
		label_27.setBounds(20, 134, 141, 14);
		constantPanel.add(label_27);
		
		outputPpanel = new JPanel();
		layeredPane.add(outputPpanel, "name_299919122893254");
		outputPpanel.setLayout(null);
		
		JButton button_6 = new JButton("DEPECIATION METHODS");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDepreciationMethods.setTitle("DEPRECIATION MENU");
				straightPanel.setVisible(false);
				sinkingPanel.setVisible(false);
				sumPanel.setVisible(false);
				decliningPanel.setVisible(false);
				doubleDecPanel.setVisible(false);
				workingPanel.setVisible(false);
				constantPanel.setVisible(false);
				outputPpanel.setVisible(false);
				menuPanel.setVisible(true);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_6.setBounds(10, 11, 151, 23);
		outputPpanel.add(button_6);
		
		JLabel label_28 = new JLabel("FIRST COST :");
		label_28.setHorizontalAlignment(SwingConstants.RIGHT);
		label_28.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_28.setBounds(20, 54, 141, 30);
		outputPpanel.add(label_28);
		
		svOutTextField = new JTextField();
		svOutTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		svOutTextField.setColumns(10);
		svOutTextField.setBounds(171, 97, 207, 30);
		outputPpanel.add(svOutTextField);
		
		JLabel label_29 = new JLabel("SALVAGE COST :");
		label_29.setHorizontalAlignment(SwingConstants.RIGHT);
		label_29.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_29.setBounds(20, 95, 141, 30);
		outputPpanel.add(label_29);
		
		fcOutTextField = new JTextField();
		fcOutTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fcOutTextField.setColumns(10);
		fcOutTextField.setBounds(171, 56, 207, 30);
		outputPpanel.add(fcOutTextField);
		
		totalOutTextField = new JTextField();
		totalOutTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		totalOutTextField.setColumns(10);
		totalOutTextField.setBounds(171, 156, 207, 30);
		outputPpanel.add(totalOutTextField);
		
		JButton button_19 = new JButton("CALCULATE");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double fc, sv, total, d;
				fc = Double.parseDouble(fcOutTextField.getText());
				sv = Double.parseDouble(svOutTextField.getText());
				total = Double.parseDouble(totalOutTextField.getText());
				d = (fc-sv)/total;
				
				depOutTextField.setText(""+dec.format(d));
			}
		});
		button_19.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_19.setBounds(171, 217, 141, 23);
		outputPpanel.add(button_19);
		
		JButton button_20 = new JButton("CLEAR");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fcOutTextField.setText("");
				svOutTextField.setText("");
				totalOutTextField.setText("");
				depOutTextField.setText("");
			}
		});
		button_20.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_20.setBounds(349, 219, 75, 23);
		outputPpanel.add(button_20);
		
		JLabel lblDepreciationPerUnit = new JLabel("DEPRECIATION PER UNIT");
		lblDepreciationPerUnit.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepreciationPerUnit.setBounds(10, 271, 424, 14);
		outputPpanel.add(lblDepreciationPerUnit);
		
		depOutTextField = new JTextField();
		depOutTextField.setHorizontalAlignment(SwingConstants.CENTER);
		depOutTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		depOutTextField.setEditable(false);
		depOutTextField.setColumns(10);
		depOutTextField.setBounds(10, 296, 414, 30);
		outputPpanel.add(depOutTextField);
		
		JLabel lblOutputDuringLife = new JLabel("OUTPUT DURING LIFE");
		lblOutputDuringLife.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOutputDuringLife.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblOutputDuringLife.setBounds(20, 168, 141, 14);
		outputPpanel.add(lblOutputDuringLife);
		
		JLabel lblTotalUnitsOf = new JLabel("TOTAL UNITS OF");
		lblTotalUnitsOf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalUnitsOf.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblTotalUnitsOf.setBounds(20, 156, 141, 14);
		outputPpanel.add(lblTotalUnitsOf);
		
		JLabel lblOfProperty = new JLabel("OF PROPERTY");
		lblOfProperty.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOfProperty.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblOfProperty.setBounds(20, 179, 141, 14);
		outputPpanel.add(lblOfProperty);
		
		bg.add(rdbtnStraightLineMethod);
		bg.add(rdbtnSinkingFundMethod);
		bg.add(rdbtnSumOfYears);
		bg.add(rdbtnDecliningBalanceMethod);
		bg.add(rdbtnDoubleDecliningBalace);
		bg.add(rdbtnWorkingHoursMethod);
		bg.add(rdbtnConstantUnit);
		bg.add(rdbtnOutputMethod);
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.main(null);
				frmDepreciationMethods.setVisible(false);
			}
		});
		btnMenu.setBounds(10, 11, 89, 23);
		menuPanel.add(btnMenu);
		
	}
}
