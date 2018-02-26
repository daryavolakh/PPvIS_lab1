import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.border.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Second extends JFrame{

	public JButton button = new JButton ("ADD");
	public JTextField input = new JTextField ("", 25);
	public String[] items = {""};
	public JComboBox comboBox = new JComboBox(items);
	public Second()
	{
		setTitle("My window");
		setSize(250,190);	
		setLayout(null);
		setLocationByPlatform(true);  //расположение на экране
		
		comboBox.setEditable(true); //чтобы можно было редактировать
		
		comboBox.setBounds(45,40,150,25);
		getContentPane().add(comboBox);	    
	    
	    input.setBounds(45,10,150,25);
	    getContentPane().add(input);
	    
	    button.setBounds(70,90,100,40);
		getContentPane().add(button);
		
		button.addActionListener(new ListenerAction());
	}
	
	class ListenerAction implements ActionListener{
		public void actionPerformed(ActionEvent event)
		{
			
			
		}

	}

	


	
}


