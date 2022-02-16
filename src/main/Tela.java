package main;

import java.awt.Color;

import javax.swing.JFrame;

public class Tela extends JFrame{
	
	public Tela() {
		configurarJanela();
	}
	private void configurarJanela() {
		setSize(500,400);
		setLocationRelativeTo(null);
		setLayout(null);
		setTitle("Main");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.DARK_GRAY);
		setVisible(true);

	}
	public void confgButton() {
		JButton botao = new JButton();
	}
	
	public static void main (String[]args) {
		Tela tela = new Tela();
		System.out.println("ok");
	}

}
