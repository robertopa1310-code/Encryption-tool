package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InitialView extends JFrame {
	
	private String[] text = {
		"Encript","Decript"	
	};
	
	private JComboBox<String> decision = new JComboBox<String>(text);
	private JLabel LabelDescriptionChoice = new JLabel("Methods");
	private JButton Accept = new JButton("Accept");
	private JPanel up = new JPanel(new GridLayout(0,2));
	private JTextField ArchivePath = new JTextField(15);
	private JButton ButtonIntroduceFile = new JButton("search");
	private JLabel TextPassword = new JLabel("Password:");
	private JTextField TextPasswordInput = new JTextField();
	private JPanel down = new JPanel(new FlowLayout());
	private JPanel leftSide = new JPanel(new GridLayout(2,0));
	
	public InitialView() throws HeadlessException {
		super("Initial View");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		this.add(up,BorderLayout.CENTER);
		this.add(down,BorderLayout.SOUTH);
		this.add(leftSide,BorderLayout.WEST);
		upPanelSetting();
		downPanelSettings();
		leftSideSettings();
		
		
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	private void upPanelSetting() {
		ArchivePath.setEditable(false);
		up.add(ArchivePath);
		up.add(ButtonIntroduceFile);
		up.add(TextPassword);
		up.add(TextPasswordInput);
	}
	
	private void downPanelSettings() {
		Accept.setPreferredSize(new Dimension(150,25));
		down.add(Accept);
	}
	
	private void leftSideSettings() {
		leftSide.add(LabelDescriptionChoice);
		leftSide.add(decision);
	}
	
	
	private class manager implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}