package org.MiWay.Practice;

import org.MiWay.LifeInsurenceObjectRepositery.AddClientPage;
import org.MiWay.LifeInsurenceObjectRepositery.ClientStatusPage;

import com.MiWay.Genericutility.BaseClass;
import com.MiWay.Genericutility.IConstantUtility;

public class Payments1TEstNG  extends BaseClass{
	
	
	public void AutomateSearchclientAndDeleteclient() {
		AddClientPage client = new AddClientPage(driver);
		ClientStatusPage status = new ClientStatusPage(driver);
		comman.Client();
		excel.openExcel(IConstantUtility.Excel_Path);
	}

}
