package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Densidad;
import modelo.Dificultad;

import javax.swing.JLabel;

public class UI extends JFrame {
	
	private JPanel contentPane;
	public JPanelOpciones jPanelOpciones;

	
	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		jPanelOpciones=new JPanelOpciones();
		contentPane.add(jPanelOpciones, BorderLayout.SOUTH);
	}

	public void tomaValores(Densidad densidad, Dificultad dificultad) {
		System.out.println(densidad+" "+dificultad);
		
	}

	public JButton getBtnIniciar() {
		return jPanelOpciones.getBtnIniciar();
	}

	public JComboBox getCmbDificultad() {
		return jPanelOpciones.getCmbDificultad();
	}

	public JComboBox getCmbDensidad() {
		return jPanelOpciones.getCmbDensidad();
	}

}
