package Sockets;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChatServidor {

	private JFrame frame;
	private JTextField areaTexto;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatServidor window = new ChatServidor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ChatServidor() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton botonEnviar = new JButton("Enviar");
		botonEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonEnviar.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(botonEnviar);
		
		JButton botonIniciarServidor = new JButton("Iniciar Servidor");
		botonIniciarServidor.setBounds(319, 11, 105, 23);
		frame.getContentPane().add(botonIniciarServidor);
		
		areaTexto = new JTextField();
		areaTexto.setBounds(10, 228, 315, 20);
		frame.getContentPane().add(areaTexto);
		areaTexto.setColumns(10);
		
		JTextArea areaMensajes = new JTextArea();
		areaMensajes.setBounds(10, 45, 414, 171);
		frame.getContentPane().add(areaMensajes);
	}
}