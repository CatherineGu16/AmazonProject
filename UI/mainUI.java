package UI;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;

//Creates Main UI
public class mainUI extends JFrame{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainUI frame = new mainUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//
	public mainUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 650);
		setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 650, 100);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		txtCasInspired = new JTextField();
		txtCasInspired.setEditable(false);
		txtCasInspired.setFont(new Font("Courier", Font.BOLD | Font.ITALIC, 32));
		txtCasInspired.setForeground(new Color(255, 255, 0));
		txtCasInspired.setText("C.A.S. Inspired");
		txtCasInspired.setBackground(new Color(30, 144, 255));
		txtCasInspired.setBounds(0, 0, 321, 63);
		panel.add(txtCasInspired);
		txtCasInspired.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(10, 61, 469, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		btnSearch.setBackground(Color.YELLOW);
		btnSearch.setBounds(465, 61, 111, 33);
		panel.add(btnSearch);
		
		JButton btnLogin = new JButton("Login ");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new loginUI().setVisible(true);
		
				
			}
		});
		btnLogin.setBounds(533, 0, 117, 29);
		panel.add(btnLogin);
		
		JButton btnCheckout = new JButton("Checkout");
		btnCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ShoppingCartUI().setVisible(true);
			}
		});
		btnCheckout.setBounds(533, 22, 117, 29);
		panel.add(btnCheckout);
		
		JMenuBar menuBar_1 = new JMenuBar();
		setJMenuBar(menuBar_1);
		
		JMenuItem mntmBts = new JMenuItem("BTS");
		menuBar_1.add(mntmBts);
		
		JMenuItem mntmMusic = new JMenuItem("Music");
		menuBar_1.add(mntmMusic);
		
		JMenuItem mntmElectronics = new JMenuItem("Electronics");
		menuBar_1.add(mntmElectronics);
		
		JMenuItem mntmApparel = new JMenuItem("Apparel");
		menuBar_1.add(mntmApparel);
		
		JMenuItem mntmSnacks = new JMenuItem("Snacks");
		menuBar_1.add(mntmSnacks);
		
		JMenuItem mntmOther = new JMenuItem("Other");
		menuBar_1.add(mntmOther);
		
	
		
		
	}
	public int main;
	private JTextField txtCasInspired;
	private JTextField textField;
}
