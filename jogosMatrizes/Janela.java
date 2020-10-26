package jogosMatrizes;

import javax.swing.JFrame;

public class Janela {

	public static void main(String[] args) {
		
		//Autor: Joao Vitor Souza Pioner Data: 22/10/2020 7:29 h
		// Ultima atualizacao: 21:37 h
		JFrame frame = new JFrame("Tic Tae Toe");
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXITE_ON_CLOSE EH PARA QUANDO EU FECHAR O PROGRAMA O MESMO TERMINAR
		frame.setVisible(true);
		frame.setResizable(false);
		
		JogoDaVelha velha = new JogoDaVelha();
		velha.setBounds(0, 0, 600, 600);
		frame.add(velha);
		
		frame.addMouseListener(velha);
	}

}
