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
public class First extends JFrame{

	public First()
	{
		setTitle("Task 1");
		setSize(250,190);	
		setLayout(null);
		setLocationByPlatform(true);  //������������ �� ������
		
		JButton button = new JButton ("ADD");
		JTextField input = new JTextField ("", 25);
		Vector<String> items = new Vector<String>();
		JComboBox comboBox = new JComboBox(items);		
		comboBox.setEditable(true); //����� ����� ���� �������������
		
		comboBox.setBounds(45,40,150,25);
	    input.setBounds(45,10,150,25);
	    button.setBounds(70,90,100,40);
	    
	    add(comboBox);	
	    add(input); 
		add(button);
		
		//public void bAddActionPerformed(java.awt.event.ActionEvent event) {
			
		//������ - ����������� ����� �������
		button.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent event)
			{
				//String text = input.getText();	
				comboBox.addItem(input.getText());
				/*for (int index = 0; index < items.size(); index++)
				{
					if (items.get(index) != text && index == items.size()-1)
					{
						
						System.out.println("Add");
					}
				}
				for (int index = 0; index < items.size(); index++)
				{
					if (items.get(index) == text)
						{
						System.out.println("Element exist!!!");
						JDialog dialog = new JDialog (new Second(), "ERROR");
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setSize(150,100);
						dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
						dialog.setVisible(true);}						
					else if (index == items.size()-1)
					{System.out.println("Add");
						
						}						
				}*/
				
			}
				});		
	}
}


