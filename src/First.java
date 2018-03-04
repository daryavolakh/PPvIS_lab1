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
		setLocationByPlatform(true);  //расположение на экране
		
		JButton button = new JButton ("ADD");
		JTextField input = new JTextField ("", 25);
		Vector<String> items = new Vector<String>();
		JComboBox comboBox = new JComboBox(items);		
		comboBox.setEditable(true); //чтобы можно было редактировать
		
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
				//String text = input.getText();	
				
			
				int itemsCount=comboBox.getModel().getSize();

				for (int index = 0; index < itemsCount; index++)
				{
					Object itemValue=comboBox.getItemAt(index);
					
					if (itemValue.toString() == input.getText())
						{						
						JOptionPane.showMessageDialog(null, "This item doesn't exist");
						System.out.println("ERROR");
						}
						/*System.out.println("Element exist!!!");
						JDialog dialog = new JDialog (new Second(), "ERROR");
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setSize(150,100);
						dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
						dialog.setVisible(true);*/						
					else if (index == items.size()-1)
					{
						comboBox.addItem(input.getText());
						System.out.println("Add");						
					}						
				}
				
			}
				});		
	}
	
}


