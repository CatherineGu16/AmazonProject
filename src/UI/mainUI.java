package UI;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import Linked_List.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import Search.*;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
//Creates Main UI
public class mainUI extends JFrame{
	
	public String User;
	public static JTextField Usernames = new JTextField();
	
	public int main;
	private JTextField txtCasInspired;
	private JTextField textField;
	private JTextField ItemCode;
	private JTextField Quantity;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainUI frame = new mainUI();
					frame.createLayout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void createLayout() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 645);
		setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 638, 100);
		panel.setBackground(new Color(30, 144, 255));
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
		
		//
		
		Usernames.setText("Guest");
		Usernames.setBounds(510, 11, 120, 20);
		Usernames.setEditable(false);
		panel.add(Usernames);
		Usernames.setColumns(10);
		
		
		
		
		JTextPane txtpnYop = new JTextPane();
		txtpnYop.setBounds(115, 232, -46, 65);
		txtpnYop.setText("yop");
		getContentPane().add(txtpnYop);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(153, 100, 485, 487);
		getContentPane().add(scrollPane);
		
		
				
		
		JTextPane MainTextBox = new JTextPane();
		scrollPane.setViewportView(MainTextBox);
		MainTextBox.setBackground(Color.WHITE);
		MainTextBox.setEditable(false);
		MainTextBox.setFont(new Font("Georgia", Font.PLAIN, 20));
		MainTextBox.setText("Welcome to C.A.S. Inspired! ");
		
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search = textField.getText();
				
				MainTextBox.setText("Yeet");
				
			}
		});
		btnSearch.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		btnSearch.setBackground(Color.YELLOW);
		btnSearch.setBounds(465, 61, 111, 33);
		panel.add(btnSearch);
		
		//
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(635, 0, 153, 587);
		panel_1.setBackground(Color.YELLOW);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCheckout = new JButton("Checkout");
		btnCheckout.setBounds(10, 523, 133, 23);
		panel_1.add(btnCheckout);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 215, 133, 297);
		panel_1.add(scrollPane_1);
		
		JTextPane CartList = new JTextPane();
		CartList.setText("Your Cart is Empty");
		CartList.setEditable(false);
		scrollPane_1.setViewportView(CartList);
		
		ItemCode = new JTextField();
		ItemCode.setBounds(10, 95, 96, 20);
		panel_1.add(ItemCode);
		ItemCode.setColumns(10);
		
		Quantity = new JTextField();
		Quantity.setColumns(10);
		Quantity.setBounds(10, 148, 96, 20);
		panel_1.add(Quantity);
		
		JButton btnLogin = new JButton("Login ");
		btnLogin.setBounds(54, 0, 89, 20);
		panel_1.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("Item #");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 70, 96, 20);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantity");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 116, 77, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cart");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(10, 190, 63, 23);
		panel_1.add(lblNewLabel_2);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new loginUI().setVisible(true);
		
				
			}
		});
		btnCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ShoppingCartUI().setVisible(true);
			}
		});
		
		
		JButton addToCart = new JButton("Add to Cart");
		addToCart.setBounds(10, 170, 135, 15);
		panel_1.add(addToCart);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 100, 153, 487);
		getContentPane().add(scrollPane_2);
		
		JPanel ImagePanel = new JPanel();
		ImagePanel.setBackground(new Color(255, 250, 205));
		scrollPane_2.setViewportView(ImagePanel);
		ImagePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel image1 = new JLabel("");
	    image1.setBackground(Color.WHITE);
		ImagePanel.add(image1);
		
		
		JLabel image2 = new JLabel("");
		image2.setBackground(Color.WHITE);
		ImagePanel.add(image2);
		//Thuggs.setIcon(new ImageIcon("src/uggly.jpg"));
	
		JLabel image3 = new JLabel("");
		image3.setBackground(Color.WHITE);
		ImagePanel.add(image3);
		
		JLabel image4 = new JLabel("");
		ImagePanel.add(image4);
		
		JLabel image5 = new JLabel("");
		ImagePanel.add(image5);
		
		JLabel image6 = new JLabel("");
		ImagePanel.add(image6);
		
		JLabel image7 = new JLabel("");
		ImagePanel.add(image7);
		
		JLabel image8 = new JLabel("");
		ImagePanel.add(image8);
		
		JLabel image9 = new JLabel("");
		ImagePanel.add(image9);
		
		JLabel image10 = new JLabel("");
		ImagePanel.add(image10);
	

		
	    addToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		
		JMenuBar menuBar_1 = new JMenuBar();
		setJMenuBar(menuBar_1);
		
		//Apparel button
				JMenuItem mntmApparel = new JMenuItem("Apparel");
				mntmApparel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						MainTextBox.setText(Apparel.main(null));
				
						image1.setText("Item #001");
						image2.setIcon(new ImageIcon("src/uggly.jpg"));
						image3.setIcon(new ImageIcon("src/uggly.jpg"));
						image4.setIcon(new ImageIcon("src/uggly.jpg"));
						image5.setIcon(new ImageIcon("src/uggly.jpg"));
						image6.setIcon(new ImageIcon("src/uggly.jpg"));
						image7.setIcon(new ImageIcon("src/uggly.jpg"));
						image8.setIcon(new ImageIcon("src/uggly.jpg"));
						image9.setIcon(new ImageIcon("src/uggly.jpg"));
						image10.setIcon(new ImageIcon("src/uggly.jpg"));
						
						}
				});
				menuBar_1.add(mntmApparel);
				
		//BTS album button
		JMenuItem mntmBts = new JMenuItem("BTS");
		mntmBts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainTextBox.setText(BTS_Albums.main(null));
				image1.setIcon(new ImageIcon("src/uggly.jpg"));
				image2.setIcon(new ImageIcon("src/uggly.jpg"));
				image3.setIcon(new ImageIcon("src/uggly.jpg"));
				image4.setIcon(new ImageIcon("src/uggly.jpg"));
				image5.setIcon(new ImageIcon("src/uggly.jpg"));
				image6.setIcon(new ImageIcon("src/uggly.jpg"));
				image7.setIcon(new ImageIcon("src/uggly.jpg"));
				image8.setIcon(new ImageIcon("src/uggly.jpg"));
				image9.setIcon(new ImageIcon("src/uggly.jpg"));
				image10.setIcon(new ImageIcon("src/uggly.jpg"));
		
			
			}
		});
		menuBar_1.add(mntmBts);
		
		//Electronic button
				JMenuItem mntmElectronics = new JMenuItem("Electronics");
				mntmElectronics.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						MainTextBox.setText(Electronics.main(null));
						image1.setIcon(new ImageIcon("src/uggly.jpg"));
						image2.setIcon(new ImageIcon("src/uggly.jpg"));
						image3.setIcon(new ImageIcon("src/uggly.jpg"));
						image4.setIcon(new ImageIcon("src/uggly.jpg"));
						image5.setIcon(new ImageIcon("src/uggly.jpg"));
						image6.setIcon(new ImageIcon("src/uggly.jpg"));
						image7.setIcon(new ImageIcon("src/uggly.jpg"));
						image8.setIcon(new ImageIcon("src/uggly.jpg"));
						image9.setIcon(new ImageIcon("src/uggly.jpg"));
						image10.setIcon(new ImageIcon("src/uggly.jpg"));
					}
				});
				menuBar_1.add(mntmElectronics);
				
		//Music button
		JMenuItem mntmMusic = new JMenuItem("Music");
		mntmMusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainTextBox.setText(Music.main(null));
			}
		});
		menuBar_1.add(mntmMusic);
		
		
		
		
		
		//Snacks button
		JMenuItem mntmSnacks = new JMenuItem("Snacks");
		mntmSnacks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainTextBox.setText(Snacks.main(null));
			}
		});
		menuBar_1.add(mntmSnacks);
		
		//Other button
		JMenuItem mntmOther = new JMenuItem("Other");
		mntmOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainTextBox.setText(Other.main(null));
			}
		});
		menuBar_1.add(mntmOther);
		
	
	
	}
	
	//
	public mainUI() {
		//createLayout();
		
	}
}
