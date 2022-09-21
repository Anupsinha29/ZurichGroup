package org.MiWay.Practice;

import org.testng.annotations.Test;

import com.MiWay.Genericutility.BaseClass;
import com.MiWay.Genericutility.ListnerImplementation;

public class ScreenShotPractice2 extends BaseClass {
	
	@Test
	public void Screenshot() {
		ListnerImplementation.stest.assignAuthor("Anup Sinha");
		ListnerImplementation.stest.assignCategory("smoke");
		
	}

}
