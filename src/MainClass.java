import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;


public class MainClass
{	
	public static void main(String args[])
	{	
		JFrame mainframe = new JFrame();
		mainframe.setTitle("Task");
		mainframe.setSize(265,150);	
		mainframe.setLayout(null);
		mainframe.setLocationByPlatform(true); 
		
		JButton button = new JButton ("START");
		JRadioButton radio1 = new JRadioButton("1");
		JRadioButton radio2 = new JRadioButton("2");
		JRadioButton radio3 = new JRadioButton("3");
		JRadioButton radio4 = new JRadioButton("4");
		JRadioButton radio5 = new JRadioButton("5");
		ButtonGroup bgroup = new ButtonGroup();
		
		bgroup.add(radio1);
		bgroup.add(radio2);
		bgroup.add(radio3);
		bgroup.add(radio4);
		bgroup.add(radio5);		
		
		radio1.setBounds(10,25,40,20);		
		radio2.setBounds(60,25,40,20);		
		radio3.setBounds(110,25,40,20);
		radio4.setBounds(160,25,40,20);		
		radio5.setBounds(210,25,40,20);
		button.setBounds(80,70,80,25);
		
		mainframe.add(radio1);
		mainframe.add(radio2);
		mainframe.add(radio3);
		mainframe.add(radio4);
		mainframe.add(radio5);
		mainframe.add(button);
		
		radio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				First frame1 = new First();
			}
		});
		
		radio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				Second frame2 = new Second();
			}
		});
		
		radio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				Third frame3 = new Third();
			}
		});
		
		radio4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				Fourth frame4 = new Fourth();
			}
		});
		
		radio5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				Fifth frame5 = new Fifth();
			}
		});	
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				DopTask doptask = new DopTask();
			}
		});	
		
	mainframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
	mainframe.setVisible(true);
	}	
}
//управл€ющее окно, по€вл€ютс€ по очереди
