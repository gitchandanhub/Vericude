package Utility;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFinder 
{
              public static ArrayList<String> findstr(String str)
              {
            	  Pattern ptn = Pattern.compile("jpeg|jpg|png");
            	  String[] parts = ptn.split(str);
            	  Matcher m = ptn.matcher(str);
            	  ArrayList<String> list = new ArrayList<String>();
         	     while(m.find())
         	     {
         	    	 //System.out.println(m.start());
         	    	 int x = m.start();
         	    	 //System.out.println(m.end());
         	    	 int y = m.end();
         	    	// System.out.println(str.subSequence(x-6, y));
         	    	 list.add((String) str.subSequence(x-7, y));
         	    	 
         	     }
				return list;
            	  
              }
}
