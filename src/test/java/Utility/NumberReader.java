package Utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Arrays;

public class NumberReader 
{
    
    public static void readnum(String x) throws AWTException
    {
    	for(int i = 0; i<x.length(); i++)
    	{
    		char c = x.charAt(i);
    		int a = Integer.parseInt(String.valueOf(c));
    		Robot robot = new Robot();
    		if(a==0)
    		{
    			robot.keyPress(KeyEvent.VK_0);
    			robot.keyRelease(KeyEvent.VK_0);
    		}
    		if(a==1)
    		{
    			robot.keyPress(KeyEvent.VK_1);
    			robot.keyRelease(KeyEvent.VK_1);
    		}
    		if(a==2)
    		{
    			robot.keyPress(KeyEvent.VK_2);
    			robot.keyRelease(KeyEvent.VK_2);
    		}
    		if(a==3)
    		{
    			robot.keyPress(KeyEvent.VK_3);
    			robot.keyRelease(KeyEvent.VK_3);
    		}
    		if(a==4)
    		{
    			robot.keyPress(KeyEvent.VK_4);
    			robot.keyRelease(KeyEvent.VK_4);
    		}
    		if(a==5)
    		{
    			robot.keyPress(KeyEvent.VK_5);
    			robot.keyRelease(KeyEvent.VK_5);
    		}
    		if(a==6)
    		{
    			robot.keyPress(KeyEvent.VK_6);
    			robot.keyRelease(KeyEvent.VK_6);
    		}
    		if(a==7)
    		{
    			robot.keyPress(KeyEvent.VK_7);
    			robot.keyRelease(KeyEvent.VK_7);
    		}
    		if(a==8)
    		{
    			robot.keyPress(KeyEvent.VK_8);
    			robot.keyRelease(KeyEvent.VK_8);
    		}
    		if(a==9)
    		{
    			robot.keyPress(KeyEvent.VK_9);
    			robot.keyRelease(KeyEvent.VK_9);
    		}
    	}
    }
    public static void PressEnter() throws AWTException, InterruptedException 
	{
    	Thread.sleep(2000);
    	Robot robot = new Robot();
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	System.out.println("Enter Via robot is pressed");
	}
    public static void EnterText(String x) throws AWTException
    {
    	Robot robot = new Robot();
    	
    		
    		char[] strchar= x.toCharArray();
    		//Arrays.toString(strchar);
    		for(int i = 0; i<strchar.length; i++)
    		{
    			 			
    			System.out.println(strchar[i]);
    			char c = x.charAt(i);
    			String mystr = String.valueOf(c);
    			if(mystr.equalsIgnoreCase("A"))
    			{
    				robot.keyPress(KeyEvent.VK_A);
        			robot.keyRelease(KeyEvent.VK_A);
    			}
    			if(mystr.equalsIgnoreCase("B"))
    			{
    				robot.keyPress(KeyEvent.VK_B);
        			robot.keyRelease(KeyEvent.VK_B);
    			}if(mystr.equalsIgnoreCase("C"))
    			{
    				robot.keyPress(KeyEvent.VK_C);
        			robot.keyRelease(KeyEvent.VK_C);
    			}if(mystr.equalsIgnoreCase("D"))
    			{
    				robot.keyPress(KeyEvent.VK_D);
        			robot.keyRelease(KeyEvent.VK_D);
    			}if(mystr.equalsIgnoreCase("E"))
    			{
    				robot.keyPress(KeyEvent.VK_E);
        			robot.keyRelease(KeyEvent.VK_E);
    			}if(mystr.equalsIgnoreCase("F"))
    			{
    				robot.keyPress(KeyEvent.VK_F);
        			robot.keyRelease(KeyEvent.VK_F);
    			}if(mystr.equalsIgnoreCase("G"))
    			{
    				robot.keyPress(KeyEvent.VK_G);
        			robot.keyRelease(KeyEvent.VK_G);
    			}if(mystr.equalsIgnoreCase("H"))
    			{
    				robot.keyPress(KeyEvent.VK_H);
        			robot.keyRelease(KeyEvent.VK_H);
    			}if(mystr.equalsIgnoreCase("I"))
    			{
    				robot.keyPress(KeyEvent.VK_I);
        			robot.keyRelease(KeyEvent.VK_I);
    			}if(mystr.equalsIgnoreCase("J"))
    			{
    				robot.keyPress(KeyEvent.VK_J);
        			robot.keyRelease(KeyEvent.VK_J);
    			}if(mystr.equalsIgnoreCase("K"))
    			{
    				robot.keyPress(KeyEvent.VK_K);
        			robot.keyRelease(KeyEvent.VK_K);
    			}if(mystr.equalsIgnoreCase("L"))
    			{
    				robot.keyPress(KeyEvent.VK_L);
        			robot.keyRelease(KeyEvent.VK_L);
    			}if(mystr.equalsIgnoreCase("M"))
    			{
    				robot.keyPress(KeyEvent.VK_M);
        			robot.keyRelease(KeyEvent.VK_M);
    			}if(mystr.equalsIgnoreCase("N"))
    			{
    				robot.keyPress(KeyEvent.VK_N);
        			robot.keyRelease(KeyEvent.VK_N);
    			}if(mystr.equalsIgnoreCase("O"))
    			{
    				robot.keyPress(KeyEvent.VK_O);
        			robot.keyRelease(KeyEvent.VK_O);
    			}if(mystr.equalsIgnoreCase("P"))
    			{
    				robot.keyPress(KeyEvent.VK_P);
        			robot.keyRelease(KeyEvent.VK_P);
    			}if(mystr.equalsIgnoreCase("Q"))
    			{
    				robot.keyPress(KeyEvent.VK_Q);
        			robot.keyRelease(KeyEvent.VK_Q);
    			}if(mystr.equalsIgnoreCase("R"))
    			{
    				robot.keyPress(KeyEvent.VK_R);
        			robot.keyRelease(KeyEvent.VK_R);
    			}if(mystr.equalsIgnoreCase("S"))
    			{
    				robot.keyPress(KeyEvent.VK_S);
        			robot.keyRelease(KeyEvent.VK_S);
    			}if(mystr.equalsIgnoreCase("T"))
    			{
    				robot.keyPress(KeyEvent.VK_T);
        			robot.keyRelease(KeyEvent.VK_T);
    			}if(mystr.equalsIgnoreCase("U"))
    			{
    				robot.keyPress(KeyEvent.VK_U);
        			robot.keyRelease(KeyEvent.VK_U);
    			}if(mystr.equalsIgnoreCase("V"))
    			{
    				robot.keyPress(KeyEvent.VK_V);
        			robot.keyRelease(KeyEvent.VK_V);
    			}if(mystr.equalsIgnoreCase("W"))
    			{
    				robot.keyPress(KeyEvent.VK_W);
        			robot.keyRelease(KeyEvent.VK_W);
    			}if(mystr.equalsIgnoreCase("X"))
    			{
    				robot.keyPress(KeyEvent.VK_X);
        			robot.keyRelease(KeyEvent.VK_X);
    			}if(mystr.equalsIgnoreCase("Y"))
    			{
    				robot.keyPress(KeyEvent.VK_Y);
        			robot.keyRelease(KeyEvent.VK_Y);
    			}
    			if(mystr.equalsIgnoreCase("Z"))
    			{
    				robot.keyPress(KeyEvent.VK_Z);
        			robot.keyRelease(KeyEvent.VK_Z);
    			}
    			if(mystr.equalsIgnoreCase("/"))
    			{
    				robot.keyPress(KeyEvent.VK_SLASH);
        			robot.keyRelease(KeyEvent.VK_SLASH);
        			//robot.keyPress(KeyEvent.VK_SLASH);
        			//robot.keyRelease(KeyEvent.VK_SLASH);
    			}
    			if(mystr.equalsIgnoreCase(":"))
    			{
    				robot.keyPress(KeyEvent.VK_SHIFT);
    				robot.keyPress(KeyEvent.VK_SEMICOLON);
    				
    				robot.keyRelease(KeyEvent.VK_SHIFT);
    				robot.keyRelease(KeyEvent.VK_SEMICOLON);
    			}
    			if(mystr.equalsIgnoreCase("."))
    			{
    				robot.keyPress(KeyEvent.VK_DECIMAL);
        			robot.keyRelease(KeyEvent.VK_DECIMAL);
    			}
    		}
    	
    }
}
