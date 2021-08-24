import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frmTopicMenu;
	public ButtonGroup bg = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmTopicMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTopicMenu = new JFrame();
		frmTopicMenu.setResizable(false);
		frmTopicMenu.setTitle("TOPIC MENU");
		frmTopicMenu.setBounds(100, 100, 723, 490);
		frmTopicMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTopicMenu.getContentPane().setLayout(null);
		
		JLabel lblCalculator = new JLabel("CALCULATOR");
		lblCalculator.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculator.setBounds(212, 11, 325, 56);
		frmTopicMenu.getContentPane().add(lblCalculator);
		
		JLabel lblengineeringEconomics = new JLabel("(Engineering Economics)");
		lblengineeringEconomics.setHorizontalAlignment(SwingConstants.CENTER);
		lblengineeringEconomics.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblengineeringEconomics.setBounds(165, 59, 389, 48);
		frmTopicMenu.getContentPane().add(lblengineeringEconomics);
		
		JRadioButton rdbtnSimpleInterest = new JRadioButton("SIMPLE INTEREST");
		rdbtnSimpleInterest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleInterest.main(null);
				frmTopicMenu.setVisible(false);
		
			}
		});
		rdbtnSimpleInterest.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnSimpleInterest.setBounds(124, 114, 354, 33);
		frmTopicMenu.getContentPane().add(rdbtnSimpleInterest);
		
		JRadioButton rdbtnCompoundInterest = new JRadioButton("COMPOUND INTEREST");
		rdbtnCompoundInterest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompoundInterest.main(null);
				frmTopicMenu.setVisible(false);
			}
		});
		rdbtnCompoundInterest.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnCompoundInterest.setBounds(124, 166, 354, 33);
		frmTopicMenu.getContentPane().add(rdbtnCompoundInterest);
		
		JRadioButton rdbtnContinousCompoundinglenders = new JRadioButton("CONTINOUS COMPOUNDING (LENDER'S VIEWSPOINT)");
		rdbtnContinousCompoundinglenders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContinousCompounding.main(null);
				frmTopicMenu.setVisible(false);
			}
		});
		rdbtnContinousCompoundinglenders.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnContinousCompoundinglenders.setBounds(124, 218, 514, 33);
		frmTopicMenu.getContentPane().add(rdbtnContinousCompoundinglenders);
		
		JRadioButton rdbtnAnnuity = new JRadioButton("ANNUITY");
		rdbtnAnnuity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Annuity.main(null);
				frmTopicMenu.setVisible(false);
			}
		});
		rdbtnAnnuity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnAnnuity.setBounds(124, 270, 172, 33);
		frmTopicMenu.getContentPane().add(rdbtnAnnuity);
		
		
		
		JRadioButton rdbtnDepreciationMethods = new JRadioButton("DEPRECIATION METHODS");
		rdbtnDepreciationMethods.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Depreciation.main(null);
				frmTopicMenu.setVisible(false);
			}
		});
		rdbtnDepreciationMethods.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnDepreciationMethods.setBounds(124, 321, 514, 33);
		frmTopicMenu.getContentPane().add(rdbtnDepreciationMethods);
		
		JRadioButton rdbtnBreakEvenPoints = new JRadioButton("BREAK EVEN POINTS");
		rdbtnBreakEvenPoints.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BreakEvenPoints.main(null);
				frmTopicMenu.setVisible(false);
			}
		});
		rdbtnBreakEvenPoints.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnBreakEvenPoints.setBounds(124, 373, 480, 33);
		frmTopicMenu.getContentPane().add(rdbtnBreakEvenPoints);
		
		bg.add(rdbtnSimpleInterest);
		bg.add(rdbtnCompoundInterest);
		bg.add(rdbtnContinousCompoundinglenders);
		bg.add(rdbtnAnnuity);
		bg.add(rdbtnDepreciationMethods);
		bg.add(rdbtnBreakEvenPoints);
	}
}
