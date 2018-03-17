import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;

public class DopTask {	
	public Timer timer = new Timer();
	public MyTask task = new MyTask();
	public void StartTimer() { 
        timer.schedule(task, 0, 2000);        
    }
	
	public void StopTimer()
	{
		timer.cancel();		
	}
}

