package gui_imagem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RadioButton extends JFrame implements ActionListener{

	JRadioButton um = new JRadioButton("Vermelho");
	JRadioButton dois = new JRadioButton("Azul");
	
	ButtonGroup grupo = new ButtonGroup();
	
	public RadioButton() {
		setLayout(new FlowLayout());
		
		add(um);
		add(dois);

		grupo.add(um);
		grupo.add(dois);

		
		um.addActionListener(this);
		dois.addActionListener(this);

		setTitle("Qual era a cor da imagem?");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==um) {
		System.out.println("Você é daltonico");
		
		}
		else if(e.getSource()== dois) {
		System.out.println("Você não é daltonico");
		
		}
	}
	
}
