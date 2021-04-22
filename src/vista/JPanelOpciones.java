package vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import modelo.Densidad;
import modelo.Dificultad;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPanelOpciones extends JPanel {
	private JButton btnIniciar;
	private JComboBox cmbDificultad;
	private JComboBox cmbDensidad;

	
	/**
	 * Create the panel.
	 */
	public JPanelOpciones() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {70, 100, 70, 100, 100};
		gridBagLayout.rowHeights = new int[] {0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Densidad");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		cmbDensidad = new JComboBox();
		for (Densidad densidad : Densidad.values()) {
			cmbDensidad.addItem(densidad);
		}
		GridBagConstraints gbc_cmbDensidad = new GridBagConstraints();
		gbc_cmbDensidad.insets = new Insets(0, 0, 0, 5);
		gbc_cmbDensidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbDensidad.gridx = 1;
		gbc_cmbDensidad.gridy = 0;
		add(cmbDensidad, gbc_cmbDensidad);
		
		JLabel lblNewLabel_1 = new JLabel("Dificultad");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		cmbDificultad = new JComboBox();
		for (Dificultad dificultad : Dificultad.values()) {
			cmbDificultad.addItem(dificultad);
		}
		GridBagConstraints gbc_cmbDificultad = new GridBagConstraints();
		gbc_cmbDificultad.insets = new Insets(0, 0, 0, 5);
		gbc_cmbDificultad.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbDificultad.gridx = 3;
		gbc_cmbDificultad.gridy = 0;
		add(cmbDificultad, gbc_cmbDificultad);
		
		btnIniciar = new JButton("Iniciar");
		
		GridBagConstraints gbc_btnIniciar = new GridBagConstraints();
		gbc_btnIniciar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnIniciar.gridx = 4;
		gbc_btnIniciar.gridy = 0;
		add(btnIniciar, gbc_btnIniciar);

	}
	public JButton getBtnIniciar() {
		return btnIniciar;
	}
	public JComboBox getCmbDificultad() {
		return cmbDificultad;
	}
	public JComboBox getCmbDensidad() {
		return cmbDensidad;
	}

}
