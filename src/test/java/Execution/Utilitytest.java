package Execution;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import Utility.NumberReader;

public class Utilitytest 
{
	@Test
	public void g() throws AWTException, InterruptedException
	{
	NumberReader  nr = new NumberReader();
	nr.EnterText("C:/Users/cchauhan/Desktop/lions sitting on the rock.jpg");
	

	}
}

