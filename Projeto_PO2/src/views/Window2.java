package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Toolkit;

public class Window2 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup bgCores = new ButtonGroup();
	private JRadioButton rbCor1;
	private JRadioButton rbCor2;
	private JLabel lbInst;
	private ImageIcon img = new ImageIcon("fundo_verde.jpg");
	private ImageIcon img1 = new ImageIcon("fundo_vermelho.jpg");
	private ImageIcon img2 = new ImageIcon("fundo_amarelo.jpg");
	private JLabel lbImagem;
	private JLabel lbNometeste;
	private JButton btnTeste;
	private JButton btTeste2;
	private JButton btsubmit;
	private int daltTest1;
	private int testeatual;
	private JButton rbTeste1;
	private JButton rbTeste3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window2 frame = new Window2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Window2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Window2.class.getResource("/resources/luz_512.png")));
		
		initComponents();
		createEvents();
	}

	private void initComponents() {
		
		
		setTitle("Teste de Daltonismo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lbNometeste = new JLabel("Teste:");
		lbNometeste.setFont(new Font("Arial", Font.PLAIN, 18));
		
		lbInst = new JLabel("Qual a cor mostrada pela imagem acima?");
		lbInst.setFont(new Font("Arial", Font.PLAIN, 18));
		
		rbCor1 = new JRadioButton("Vermelho");
		rbCor1.setFont(new Font("Arial", Font.PLAIN, 12));

		bgCores.add(rbCor1);

		rbCor2 = new JRadioButton("Verde");
		rbCor2.setFont(new Font("Arial", Font.PLAIN, 12));

		bgCores.add(rbCor2);

		lbImagem = new JLabel("");
		lbImagem.setIcon(img);

		btnTeste = new JButton("Protanopia");
		
		
		if(testeatual == 0) {
			rbCor1 = new JRadioButton("Vermelho");
			rbCor1.setFont(new Font("Arial", Font.PLAIN, 12));

			bgCores.add(rbCor1);

			rbCor2 = new JRadioButton("Verde");
			rbCor2.setFont(new Font("Arial", Font.PLAIN, 12));

			bgCores.add(rbCor2);

			lbImagem = new JLabel("");
			lbImagem.setIcon(img);

			btnTeste = new JButton("Protanopia");
		}
		
		if(testeatual == 1) {
			rbCor1 = new JRadioButton("Marrom");
			rbCor1.setFont(new Font("Arial", Font.PLAIN, 12));
			
			bgCores.add(rbCor1);
			
			rbCor2 = new JRadioButton("Vermelho");
			rbCor2.setFont(new Font("Arial", Font.PLAIN, 12));
			
			bgCores.add(rbCor2);
			
			lbImagem = new JLabel("");
			lbImagem.setIcon(img1);
			
			btnTeste = new JButton("Deuteranopia");
			}
			
		if(testeatual == 2) {
			rbCor1 = new JRadioButton("Rosa");
			rbCor1.setFont(new Font("Arial", Font.PLAIN, 12));
			
			bgCores.add(rbCor1);
			
			rbCor2 = new JRadioButton("Amarelo");
			rbCor2.setFont(new Font("Arial", Font.PLAIN, 12));
			
			bgCores.add(rbCor2);
			
			lbImagem = new JLabel("");
			lbImagem.setIcon(img2);
			
			btnTeste = new JButton("Trinatopia");
			}
		
		btsubmit = new JButton("Submit");
		
		rbTeste1 = new JButton("1");
		
		btTeste2 = new JButton("2");
		
		rbTeste3 = new JButton("3");
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lbInst))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(21)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lbNometeste)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(btnTeste))
										.addComponent(lbImagem, GroupLayout.PREFERRED_SIZE, 518, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(rbCor1)
									.addGap(18)
									.addComponent(rbCor2)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btsubmit)))
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(rbTeste3, 0, 0, Short.MAX_VALUE)
								.addComponent(rbTeste1, 0, 0, Short.MAX_VALUE)
								.addComponent(btTeste2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(86))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbNometeste)
						.addComponent(btnTeste))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rbTeste1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btTeste2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rbTeste3))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lbImagem, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
							.addComponent(lbInst)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(rbCor1)
								.addComponent(btsubmit)
								.addComponent(rbCor2))))
					.addContainerGap())
		);
		
		
		

		contentPane.setLayout(gl_contentPane);
		
	}
	
	private void createEvents() {
		
		rbCor1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			}
		});
		
		rbCor2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnTeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(testeatual == 0) {
					JOptionPane.showMessageDialog(null,"A visão é composta por tons de bege, marrom, verde e cinza, sendo que o verde se torna semelhante ao vermelho.");	
					
				}else {
					if(testeatual == 1) {
						JOptionPane.showMessageDialog(null,"A visão é composta por variações da cor marrom, sendo que as cores verde e vermelho são as mais prejudicadas.");				
					}else {
						if(testeatual == 2) {
							JOptionPane.showMessageDialog(null,"Essa é a condição mais rara de daltonismo, que prejudica a visão das cores azul e amarelo. As tonalidades de azul que o portador desse variação enxerga são diferentes e o amarelo é percebido como um rosa claro.");
			
							}
						}
						
					}
				}
				
				
			}
				);
		
		rbTeste1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				testeatual = 0;
				initComponents();
				createEvents();
			}
		});
		
		btTeste2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				testeatual = 1;
				initComponents();
				createEvents();
			}
		});
		
		rbTeste3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				testeatual = 2;
				initComponents();
				createEvents();
			}
		});
		
		btsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rbCor1.isSelected()) {
					daltTest1 = 0;
				}else {
					daltTest1 = 1;
				}
					
			}
		});
		
	}
}
