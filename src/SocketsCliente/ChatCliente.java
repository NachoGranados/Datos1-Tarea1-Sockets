package SocketsCliente;

import java.awt.EventQueue;

import SocketsCliente.MainCliente;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChatCliente {

	private JFrame frame;
	public static JTextField areaTexto;
	public static JTextArea areaMensajes;

	public void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatCliente window = new ChatCliente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
	public ChatCliente() {
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
				
				String texto = areaTexto.getText();
				
				MainCliente.cliente.enviarMensaje(texto);
				areaMensajes.setText(areaMensajes.getText() + "Cliente: " + texto + "\n");
				areaTexto.setText("");
				
			}
		});
		
		botonEnviar.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(botonEnviar);
		
		JButton botonConectarse = new JButton("Conectarse");
		botonConectarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainCliente.iniciarCliente("127.0.0.1");
				
			}
		});
		
		botonConectarse.setBounds(335, 11, 89, 23);
		frame.getContentPane().add(botonConectarse);
		
		JLabel labelCliente = new JLabel("Cliente");
		labelCliente.setBounds(10, 11, 60, 23);
		frame.getContentPane().add(labelCliente);
		
		areaTexto = new JTextField();
		areaTexto.setBounds(10, 230, 315, 20);
		frame.getContentPane().add(areaTexto);
		areaTexto.setColumns(10);
		
		areaMensajes = new JTextArea();
		areaMensajes.setBounds(10, 45, 414, 171);
		frame.getContentPane().add(areaMensajes);
	}

}
