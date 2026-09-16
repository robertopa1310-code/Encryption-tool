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
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller.Checking;
import Controller.Methods;

public class InitialView extends JFrame {
	
	private Checking check = new Checking();
	
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
		manager m1 = new manager();
		ButtonIntroduceFile.addActionListener(m1);
		Accept.addActionListener(m1);
		
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
			if(e.getSource().equals(Accept)) {
				if(check.CheckingText(TextPasswordInput.getText().strip()) && check.CheckingText(ArchivePath.getText().strip())) {
					int Correct = JOptionPane.showConfirmDialog(null, "this password is correct "+TextPasswordInput.getText());
					if(Correct == 0) {
						try {
							Methods me = new Methods(text[decision.getSelectedIndex()], ArchivePath.getText(), TextPasswordInput.getText().strip());
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, "Error when trying to take the path or the password.","Error",JOptionPane.ERROR_MESSAGE);
						}
					}
				}else {
					JOptionPane.showMessageDialog(null, "fail text","Error",JOptionPane.ERROR_MESSAGE);
				}
			}else if(e.getSource().equals(ButtonIntroduceFile)) {
				JFileChooser choose = new JFileChooser();
				int options = choose.showOpenDialog(InitialView.this);
				if(options == JFileChooser.APPROVE_OPTION) {
					ArchivePath.setText(""+choose.getSelectedFile());
				}
				
			}
		}
	}
	
}