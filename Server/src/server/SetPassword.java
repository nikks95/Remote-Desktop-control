package server;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class SetPassword extends JFrame implements ActionListener{
	
	static String port = "4908";
	
	private JPanel panel,panel1;
	private JLabel label1;
	private JButton okButton,cancelButton;
	
	public SetPassword() {
		 label1=new JLabel();
		 label1.setText("Would you like to start the Server?");
		 
		 this.setLayout(new BorderLayout());
		 
		 okButton = new JButton("Yes..");
		 cancelButton = new JButton("No");
		 
		 panel=new JPanel(new GridLayout(1,1));
		 panel1=new JPanel(new GridLayout(2,1));
		 
		 panel.add(okButton);
		 panel.add(cancelButton);
		 
		 panel1.add(label1);
		 panel1.add(panel);
		 
		 add(panel1,BorderLayout.CENTER);
		 
		 this.setResizable(false);
		 
		 okButton.addActionListener(this);
		 cancelButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==okButton)
		{
			this.dispose();
			new InitConnection(Integer.parseInt(port));
		}
		else if(e.getSource()==cancelButton) {
			this.dispose();
			System.exit(0);
		}
		
	}

}
