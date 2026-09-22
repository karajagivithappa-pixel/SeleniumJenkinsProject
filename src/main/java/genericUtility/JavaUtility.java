package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int randomNumber() {
		Random r=new Random();
		int num=r.nextInt();
		if(num>0) {
			return num; 
		}
		else
			return -num;
	}
	
	public String currentDate() {
		Date d=new Date();
		SimpleDateFormat sim=new SimpleDateFormat("dd-mm-yyyy");
		return sim.format(d);
	}
}
