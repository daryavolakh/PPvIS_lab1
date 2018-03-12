import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class Fifth{
	public Fifth()
	{
		JFrame frame = new JFrame();
		
		frame.setTitle("Task 5");
		frame.setLayout(null);
		frame.setLocationByPlatform(true);
		frame.setSize(250,350);
		
		Vector<String> columns = new Vector<String>();
		columns.add("1");
		columns.add("2");
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JTextField input = new JTextField();		
		
		input.setBounds(35,40,170,25);	
		button1.setBounds(35,75,45,25);		
		button2.setBounds(98,75,45,25);		
		button3.setBounds(158,75,45,25);
		
		DefaultTableModel model = new DefaultTableModel(columns, 0);
		
		JTable table = new JTable();
		table.setModel(model);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(170,100));
		scrollPane.setBounds(35,135,170,100);

		frame.add(input);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.getContentPane().add(scrollPane);
		
		button1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						Vector<String> curRow = new Vector<String>();
						if (input.getText().equals(""))
							JOptionPane.showMessageDialog(null, "Empty line!");	
						else 
						{
							curRow.add(input.getText());
							model.addRow(curRow);
						}
						input.setText(null);
						
					}
				});
		
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				int[] selectedRow = table.getSelectedRows();  
				selectedRow[0] = table.convertRowIndexToModel(selectedRow[0]);
				Object value = model.getValueAt(selectedRow[0], 0);
				if (value.equals(""))
				{
					Object value2 = model.getValueAt(selectedRow[0], 1);
					model.setValueAt(value2,selectedRow[0],1);
				}
				else
				{
					model.setValueAt("",selectedRow[0],0);
					model.setValueAt(value,selectedRow[0],1);
				}
			}
		});
		
		button3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				int[] selectedRow = table.getSelectedRows();  
				selectedRow[0] = table.convertRowIndexToModel(selectedRow[0]);
				Object value = model.getValueAt(selectedRow[0], 1);
				if (value.equals(""))
				{
					Object value2 = model.getValueAt(selectedRow[0], 0);
					model.setValueAt(value2,selectedRow[0],0);
				}
				else
				{
					model.setValueAt("",selectedRow[0],1);
					model.setValueAt(value,selectedRow[0],0);
				}
			}
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);
	}
}
