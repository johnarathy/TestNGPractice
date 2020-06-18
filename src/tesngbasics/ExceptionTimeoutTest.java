package tesngbasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.exec.util.StringUtils;
import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
//	@Test(invocationTimeOut = 2,expectedExceptions = NumberFormatException.class)
//	public void timeoutTest() {
//		int i=1;
//		while(i==1) {
//			System.out.println(i);
//		}
//	}
	@Test()
	public void exceptionTest() {
//		String s= "100A";
//		Integer.parseInt(s);
//		int i = (int) Math.pow(10, 5);
		List<String> frndsList = new ArrayList<String>();
		frndsList.add("U1,U2");
		frndsList.add("U3,U4");
		frndsList.add("U2,U1");
		frndsList.add("U1,U5");
		List<String> op = new ArrayList<String>();
        Collections.sort(frndsList);
       for (String str: frndsList){
           String s1 = str.substring(0,2);
           String s2 = str.substring(3,5);
           if(!s1.equals(s2)){
               op.add(str);
           }
           if((!(str.contains(s1) && str.contains(s2))|| (!(str.contains(s2)&&str.contains(s1))))){
        	   System.out.println(str);
           }
       }
      System.out.println(op);

		
		
		
	}
}
