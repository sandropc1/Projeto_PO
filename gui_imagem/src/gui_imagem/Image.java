package gui_imagem;

import javax.swing.*;

public class Image extends JFrame{

	private static final long serialVersionUID = 1L;

	JFrame frame;
	JLabel display;
	ImageIcon imagem;
	
	public Image(String nome) {
	
		frame = new JFrame("Teste de daltonismo");
		frame.setDefaultCloseOperation(1);
		
		try {
			imagem = new ImageIcon(getClass().getResource(nome));
			display = new JLabel(imagem);
			frame.add(display);
			
		}catch(Exception e) {//O Exception est� generalizado mas normalmento e a exess�o seria de NullPointer
			System.out.println("Imagem n�o encontrada");
			e.printStackTrace();
		}
		frame.setSize(400,400);
		frame.setVisible(true);
	}

}
