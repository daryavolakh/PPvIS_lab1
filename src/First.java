import java.awt.*;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;
import java.awt.List;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.border.*;

import java.util.*;
public class First {
public JFrame frame = new JFrame();
	public First()
	{
		//JFrame frame = new JFrame();
		
		frame.setTitle("Task 1");
		frame.setSize(250,190);	
		frame.setLayout(null);
		frame.setLocationByPlatform(true); 
		
		JButton button = new JButton ("ADD");
		JTextField input = new JTextField ("", 25);
		Vector<String> items = new Vector<String>();
		JComboBox comboBox = new JComboBox(items);		
		comboBox.setEditable(true); 
		
		comboBox.setBounds(45,40,150,25);
	    input.setBounds(45,10,150,25);
	    button.setBounds(70,90,100,40);
	    
	    frame.add(comboBox);	
	    frame.add(input); 
	    frame.add(button);

		button.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent event)
			{
				boolean itemExist = false;
				if (items.size() == 0)
					itemExist = false;
				else {
					for (int index = 0; index < items.size(); index = index + 1)
					{											
						if (!input.getText().equals(items.get(index)) & index ==  items.size() - 1)
							{				
							itemExist = false;
									break;
							}
						else if (input.getText().equals(items.get(index)))
						{
							itemExist = true;
							break;
						}					
					}				
				}
				if (itemExist == false)
					comboBox.addItem(input.getText());
				if (itemExist == true)
					JOptionPane.showMessageDialog(null, "This item exist");		
				input.setText(null);
			}
				});	
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		frame.setVisible(true);
	}
	
	void Close()
	{
		frame.dispose();
	}

	
}


