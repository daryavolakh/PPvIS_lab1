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
import java.util.*;
public class Second extends JFrame{

	public Second()
	{
		setTitle("My window");
		setSize(250,190);	
		setLayout(null);
		setLocationByPlatform(true);  //расположение на экране
		
		JButton button = new JButton ("ADD");
		JTextField input = new JTextField ("", 25);
		Vector<String> items = new Vector<String>();
		items.addElement("Hello");
		items.addElement("Bye");
		//String[] items = {""};
		JComboBox comboBox = new JComboBox(items);
		
		comboBox.setEditable(true); //чтобы можно было редактировать
		
		comboBox.setBounds(45,40,150,25);
		add(comboBox);	   //getContentPane(). 
	    
	    input.setBounds(45,10,150,25);
	    add(input); 
	    
	    button.setBounds(70,90,100,40);
		add(button);
		
		//public void bAddActionPerformed(java.awt.event.ActionEvent event) {
			
		//внутри - исполнитель этого события
		button.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent event)
			{
				String text = input.getText();	
				
				for (int index = 0; index < items.size(); index++)
				{
					if (items.get(index) != text && index == items.size()-1)
					{
						comboBox.addItem(text);
						System.out.println("Add");
					}
				}
				/*for (int index = 0; index < items.size(); index++)
				{
					if (items.get(index) == text)
						{System.out.println("Element exist!!!");}						
					else if (index == items.size()-1)
					{System.out.println("Add");*/
						
						//}						
				//}
				
			}
				});		
	}
}


