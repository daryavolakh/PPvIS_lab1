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
		mainframe.setSize(265,180);	
		mainframe.setLayout(null);
		mainframe.setLocationByPlatform(true); 
		
		JButton buttonStart = new JButton ("START");
		JButton buttonStop = new JButton ("STOP");
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
		buttonStart.setBounds(80,65,80,25);
		buttonStop.setBounds(80,95,80,25);
		
		mainframe.add(radio1);
		mainframe.add(radio2);
		mainframe.add(radio3);
		mainframe.add(radio4);
		mainframe.add(radio5);
		mainframe.add(buttonStart);
		mainframe.add(buttonStop);
		
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
		
		DopTask doptask = new DopTask();
		MyTask task = new MyTask();
		buttonStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				
				doptask.StartTimer();
			}
		});	
		
		buttonStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				doptask.StopTimer();
			}
		});
		
	mainframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
	mainframe.setVisible(true);
	}	
}
//управл€ющее окно, по€вл€ютс€ по очереди
