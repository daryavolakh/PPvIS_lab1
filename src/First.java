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
public class First extends JFrame{

	public First()
	{
		setTitle("Task 1");
		setSize(250,190);	
		setLayout(null);
		setLocationByPlatform(true); 
		
		JButton button = new JButton ("ADD");
		JTextField input = new JTextField ("", 25);
		Vector<String> items = new Vector<String>();
		JComboBox comboBox = new JComboBox(items);		
		comboBox.setEditable(true); 
		
		comboBox.setBounds(45,40,150,25);
	    input.setBounds(45,10,150,25);
	    button.setBounds(70,90,100,40);
	    
	    add(comboBox);	
	    add(input); 
		add(button);

		button.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent event)
			{
				boolean value = false;
				if (items.size() == 0)
				{
					value = false;
					System.out.println("EMPTY");
				}
				else {
					for (int index = 0; index < items.size(); index = index + 1)
					{											
						if (!input.getText().equals(items.get(index)) & index ==  items.size() - 1)
							{				
									value = false;
									System.out.println("Add");	
									break;
							}
						else if (input.getText().equals(items.get(index)))
						{
							value = true;
							System.out.println("ERROR");
							break;
						}					
					}				
				}
				if (value == false)
					comboBox.addItem(input.getText());
				if (value == true)
					JOptionPane.showMessageDialog(null, "This item exist");					
			}
				});		
	}
	
}


