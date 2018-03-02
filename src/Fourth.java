import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Fourth extends JFrame{
	public Fourth() 
	{
		setTitle("Task 3");
		setLayout(null);
		setLocationByPlatform(true);
		setSize(250,190);
		
		JButton button = new JButton("let's go!");
		JTextField input = new JTextField();
		JCheckBox checkbox_1 = new JCheckBox("one"); 
		JCheckBox checkbox_2 = new JCheckBox("two");
		JCheckBox checkbox_3 = new JCheckBox("three");
		ButtonGroup bgroup = new ButtonGroup();
		
		bgroup.add(checkbox_1);
		bgroup.add(checkbox_2);
		bgroup.add(checkbox_3);
		
		input.setBounds(35,40,170,25);		
		checkbox_1.setBounds(35,70,50,20);		
		checkbox_2.setBounds(95,70,50,20);		
		checkbox_3.setBounds(155,70,50,20);
		button.setBounds(85,95,70,25);	
		
		add(button);
		add(input);
		add(checkbox_1);
		add(checkbox_2);
		add(checkbox_3);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				for(Enumeration<AbstractButton> buttons = bgroup.getElements(); buttons.hasMoreElements();)
				{
					AbstractButton temp_button = buttons.nextElement();
					if (temp_button.getText().equals(input.getText()))
					{
						temp_button.setSelected(true);   //сохранять предыдущие отмеченные!!!
					}
				}
			}
		});

	}
}
