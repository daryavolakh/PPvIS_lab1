import java.awt.*; //используя * подключаем все компоненты данной бибилиотеки
import javax.swing.*;
import java.awt.event.*;


public class MainClass
{
	public static void main(String args[])
	{
		Second frame = new Second();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //указывает операцию, которая будет произведена при закрытии окна.
		frame.setVisible(true); //делаем окно видимым

		
	}
}

