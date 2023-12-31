package view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;

public class SistemaJavalar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SistemaJavalar() {

		Panels panels = new Panels();
		getContentPane().setBackground(Color.darkGray);

		// Set the layout of the frame to GridBagLayout
		setLayout(new GridBagLayout());

		// Configure GridBagConstraints for the ButtonPanel
		GridBagConstraints gbcButtonPanel = new GridBagConstraints();
		gbcButtonPanel.gridx = 0; // Column 0
		gbcButtonPanel.gridy = 0; // Row 0
		gbcButtonPanel.weightx = 0.2; // Horizontal weight
		gbcButtonPanel.weighty = 1.0; // Vertical weight
		gbcButtonPanel.fill = GridBagConstraints.BOTH; // Fill both axes
		gbcButtonPanel.insets = new Insets(0, 0, 0, 2); // Add right margin for spacing

		// Configure GridBagConstraints for the planetary
		GridBagConstraints gbcPlanetary = new GridBagConstraints();
		gbcPlanetary.gridx = 1; // Column 1
		gbcPlanetary.weightx = 12.0; // Horizontal weight
		gbcPlanetary.weighty = 2.0; // Vertical weight (higher to occupy more vertical space)
		gbcPlanetary.fill = GridBagConstraints.BOTH; // Fill both axes
		gbcPlanetary.insets = new Insets(0, 2, 0, 0); // Add left margin for spacing

		// will add the panel to the frame
		add(panels.ButtonPanel, gbcButtonPanel);
		add(panels.planetary, gbcPlanetary);

		// Frame settings
		setVisible(true);
		setSize(1100, 750);
		setTitle(" javalar system");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setResizable(false);
		setLocationRelativeTo(null);

	}
}
