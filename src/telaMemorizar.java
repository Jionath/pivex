import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;


public class telaMemorizar {

	private JFrame frmMemorize;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaMemorizar window = new telaMemorizar();
					window.frmMemorize.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telaMemorizar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMemorize = new JFrame();
		frmMemorize.getContentPane().setBackground(Color.WHITE);
		frmMemorize.setTitle("MEMORIZE");
		frmMemorize.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Pasta Sincronizada\\Dropbox\\programa\u00E7\u00E3o_java\\arquivos_eclipse\\tela-projeto-pivex\\img\\icon-logo.png"));
		frmMemorize.setBounds(100, 100, 381, 354);
		frmMemorize.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMemorize.getContentPane().setLayout(null);
		
		JMenuBar menuBarra = new JMenuBar();
		menuBarra.setBackground(Color.WHITE);
		menuBarra.setBounds(0, 0, 800, 34);
		frmMemorize.getContentPane().add(menuBarra);
		
		JMenu mnNovo = new JMenu("NOVO");
		mnNovo.setBackground(Color.WHITE);
		mnNovo.setIcon(new ImageIcon("D:\\Pasta Sincronizada\\Dropbox\\programa\u00E7\u00E3o_java\\arquivos_eclipse\\tela-projeto-pivex\\img\\new.png"));
		menuBarra.add(mnNovo);
		
		JMenuItem mntmAreaNovo = new JMenuItem("\u00C1rea");
		mntmAreaNovo.setBackground(Color.WHITE);
		mntmAreaNovo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mnNovo.add(mntmAreaNovo);
		
		JMenuItem mntmAssuntoNovo = new JMenuItem("Assunto");
		mntmAssuntoNovo.setBackground(Color.WHITE);
		mntmAssuntoNovo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mnNovo.add(mntmAssuntoNovo);
		
		JMenuItem mntmPerguntaNovo = new JMenuItem("Pergunta");
		mntmPerguntaNovo.setBackground(Color.WHITE);
		mntmPerguntaNovo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mnNovo.add(mntmPerguntaNovo);
		
		JMenu mnEditar = new JMenu("EDITAR");
		mnEditar.setHorizontalAlignment(SwingConstants.CENTER);
		mnEditar.setIcon(new ImageIcon("D:\\Pasta Sincronizada\\Dropbox\\programa\u00E7\u00E3o_java\\arquivos_eclipse\\tela-projeto-pivex\\img\\edit.png"));
		menuBarra.add(mnEditar);
		
		JMenuItem mntmAreaEditar = new JMenuItem("\u00C1rea");
		mntmAreaEditar.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mntmAreaEditar.setBackground(Color.WHITE);
		mnEditar.add(mntmAreaEditar);
		
		JMenuItem mntmAssuntoEditar = new JMenuItem("Assunto");
		mntmAssuntoEditar.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mntmAssuntoEditar.setBackground(Color.WHITE);
		mnEditar.add(mntmAssuntoEditar);
		
		JMenuItem mntmPerguntaEditar = new JMenuItem("Pergunta");
		mntmPerguntaEditar.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mntmPerguntaEditar.setBackground(Color.WHITE);
		mnEditar.add(mntmPerguntaEditar);
		
		JMenuItem mntmRespostaEditar = new JMenuItem("Resposta");
		mntmRespostaEditar.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mntmRespostaEditar.setBackground(Color.WHITE);
		mnEditar.add(mntmRespostaEditar);
		
		JMenu mnDeletar = new JMenu("DELETAR");
		mnDeletar.setIcon(new ImageIcon("D:\\Pasta Sincronizada\\Dropbox\\programa\u00E7\u00E3o_java\\arquivos_eclipse\\tela-projeto-pivex\\img\\dell.png"));
		menuBarra.add(mnDeletar);
		
		JMenuItem mntmAreaDeletar = new JMenuItem("\u00C1rea");
		mntmAreaDeletar.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mntmAreaDeletar.setBackground(Color.WHITE);
		mnDeletar.add(mntmAreaDeletar);
		
		JMenuItem mntmAssuntoDeletar = new JMenuItem("Assunto");
		mntmAssuntoDeletar.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mntmAssuntoDeletar.setBackground(Color.WHITE);
		mnDeletar.add(mntmAssuntoDeletar);
		
		JMenuItem mntmRespostaDeletar = new JMenuItem("Pergunta");
		mntmRespostaDeletar.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mntmRespostaDeletar.setBackground(Color.WHITE);
		mnDeletar.add(mntmRespostaDeletar);
		
		JMenuItem menuItem_6 = new JMenuItem("Resposta");
		menuItem_6.setFont(new Font("SansSerif", Font.PLAIN, 12));
		menuItem_6.setBackground(Color.WHITE);
		mnDeletar.add(menuItem_6);
	}
}
