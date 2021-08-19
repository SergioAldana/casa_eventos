package co.edu.utadeo.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmEventos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmEventos frame = new FrmEventos();
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
	public FrmEventos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Eventos");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(339, 313, 134, 45);
		contentPane.add(btnNewButton);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("C:\\Users\\Sergio A. Aldana\\Downloads\\Nueva carpeta\\casa_eventos\\casa-eventos\\src\\co\\edu\\utadeo\\imagenes\\Logo.PNG"));
		lblLogo.setHorizontalAlignment(SwingConstants.TRAILING);
		lblLogo.setBounds(383, 63, 178, 219);
		contentPane.add(lblLogo);
		
		JLabel lblImagenUno = new JLabel("");
		lblImagenUno.setIcon(new ImageIcon("C:\\Users\\Sergio A. Aldana\\Downloads\\Nueva carpeta\\casa_eventos\\casa-eventos\\src\\co\\edu\\utadeo\\imagenes\\imagen_dos.jpg"));
		lblImagenUno.setBounds(32, 214, 245, 166);
		contentPane.add(lblImagenUno);
		
		JLabel lblNewLabel = new JLabel("\"The Star Rover\"");
		lblNewLabel.setFont(new Font("Kristen ITC", Font.BOLD, 32));
		lblNewLabel.setBounds(70, 100, 316, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblLogoDos = new JLabel("Casa de Eventos ");
		lblLogoDos.setFont(new Font("Kristen ITC", Font.BOLD, 32));
		lblLogoDos.setBounds(32, 39, 316, 45);
		contentPane.add(lblLogoDos);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\Sergio A. Aldana\\Downloads\\Nueva carpeta\\casa_eventos\\casa-eventos\\src\\co\\edu\\utadeo\\imagenes\\fondo.jpg"));
		lblFondo.setBounds(0, 0, 584, 411);
		contentPane.add(lblFondo);
	}
}
