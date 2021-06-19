package team381.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import engine.Game;
import engine.Player;

public class StartingGameView extends JFrame implements ActionListener {
	private JPanel startMenu;
	private JTextField playerName;
	private JButton startGame;
	private JButton submitName;
	private JLabel PName;
	private Game newGame;
	private JPanel cityPanel;
	private JButton sparta;
	private JButton cairo;
	private JButton rome;
	private JButton selectCity;
	
	
	public StartingGameView() {
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("TERMINATOR");
		//this.setBackground(Color.black);
		
		
		startMenu = new JPanel();
		cityPanel = new JPanel();
		startMenu.setBounds(0, 0, 700, 700);
	    cityPanel.setBounds(0, 700, 700, 700);
		this.add(startMenu, BorderLayout.NORTH);
		this.add(cityPanel, BorderLayout.CENTER);
		
		 
		
		
		playerName = new JTextField();
		playerName.setPreferredSize(new Dimension(300, 50));
		playerName.setText("Enter your name");
		playerName.setEditable(true);
		startMenu.add(playerName, BorderLayout.CENTER);
		
		submitName = new JButton();
		submitName.setText("Submit name");
		startMenu.add(submitName, BorderLayout.CENTER);
		submitName.addActionListener(this);
	    
		
	    startGame = new JButton();
	    startGame.setText("Start game");
	    startGame.addActionListener(this);
	    this.add(startGame, BorderLayout.SOUTH);
	    
	    
//	    for (int i = 0; i < newGame.getAvailableCities().size(); i++) {
//			JButton b =  new JButton();
//			b.addActionListener(this);
//			b.setText(newGame.getAvailableCities().get(i).getName());
//			cityPanel.add(b);
//			cityButtons.add(b); 
//			}
	    
	    
	    
	    
	    sparta = new JButton();
	    sparta.setPreferredSize(new Dimension(300,300));
	    sparta.setText("Sparta");
	    sparta.setFont(new Font("Arial", Font.BOLD, 70));
	    sparta.setOpaque(true);
	    sparta.setForeground(Color.blue);
	    sparta.addActionListener(this);
	    sparta.setBackground(Color.black);
	    cityPanel.add(sparta, BorderLayout.CENTER);
	    
	    rome = new JButton();
	    rome.setPreferredSize(new Dimension(300,300));
	    rome.setText("Rome");
	    rome.setFont(new Font("Arial", Font.BOLD, 70));
	    rome.setOpaque(true);
	    rome.setForeground(Color.blue);
	    rome.addActionListener(this);
	    rome.setBackground(Color.black);
	    cityPanel.add(rome, BorderLayout.CENTER);
	    
	    cairo = new JButton();
	    cairo.setPreferredSize(new Dimension(300,300));
	    cairo.setText("Cairo");
	    cairo.setFont(new Font("Arial", Font.BOLD, 70));
	    cairo.setOpaque(true);
	    cairo.setForeground(Color.blue);
	    cairo.addActionListener(this);
	    cairo.setBackground(Color.black);
	    cityPanel.add(cairo, BorderLayout.CENTER);
	    
	    
	    
	    PName = new JLabel();
	    startMenu.add(PName, BorderLayout.EAST);
	    
	    
	    selectCity = new JButton();
	    selectCity.setText("Select city");
	    cityPanel.add(selectCity, BorderLayout.SOUTH);
	    
	    
	    
	    
	    
	    
	    
		
	    this.validate();
		this.revalidate();

		
	}

	public static void main(String[] args) {
		new StartingGameView();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submitName) {
			 PName.setText("Player: " + playerName.getText());
			 submitName.setEnabled(false);
			//System.out.print("here");
		}
		if (e.getSource() == sparta && selectCity != null) {
			sparta.setIcon(new ImageIcon("images/sparta.png"));
			try {
				newGame = new Game(playerName.getText(), "Sparta");
				newGame.getPlayer().setTreasury(5000);
				rome.setEnabled(false);
				cairo.setEnabled(false);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if (e.getSource() == rome && selectCity != null) {
			rome.setIcon(new ImageIcon("images/rome1.png"));
			try {
				newGame = new Game(playerName.getText(), "Rome");
				newGame.getPlayer().setTreasury(5000);
				sparta.setEnabled(false);
				cairo.setEnabled(false);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
		if (e.getSource() == cairo && selectCity != null) {
			cairo.setIcon(new ImageIcon("images/cairo.png"));
			try {
				newGame = new Game(playerName.getText(), "Cairo");
				newGame.getPlayer().setTreasury(5000);
				rome.setEnabled(false);
				sparta.setEnabled(false);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
