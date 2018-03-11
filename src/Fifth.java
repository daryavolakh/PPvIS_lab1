import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

import javax.swing.table.DefaultTableModel;
public class Fifth extends JFrame {
	public Fifth()
	{
		//JFrame frame = new JFrame();
		
		/*setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true); */
		
		setTitle("Task 5");
		setLayout(null);
		setLocationByPlatform(true);
		setSize(250,350);
		
		/*String columns[] = {"first", "second"};
		String rows[][] = {};*/
		
		
		JButton mainButton = new JButton("button");
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JTextField input = new JTextField();		
		
		input.setBounds(35,40,170,25);	
		button1.setBounds(35,70,45,20);		
		button2.setBounds(98,70,45,20);		
		button3.setBounds(158,70,45,20);
		mainButton.setBounds(85,100,70,25);
		
		DefaultTableModel model = new DefaultTableModel();
		JTable table = new JTable(model);
		//AbstractTableModel dtm = (AbstractTableModel)table.getModel();
		//DefaultTableModel dtm = (DefaultTableModel)table.getModel();
		
		model.addColumn("1");
		model.addColumn("2");
		
		//JTable table = new JTable(rows,columns);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(35,135,170,100);

		add(input);
		add(mainButton);
		add(button1);
		add(button2);
		add(button3);
		getContentPane().add(scrollPane);
		//add(model);
		
		mainButton.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent event)
			{
				
			}
				});
	}
}
