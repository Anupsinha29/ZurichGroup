package com.MiWay.automationTestScript;

import java.util.Map;

import org.MiWay.LifeInsurenceObjectRepositery.AddClientPage;
import org.MiWay.LifeInsurenceObjectRepositery.ClientStatusPage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.MiWay.Genericutility.BaseClass;
import com.MiWay.Genericutility.IConstantUtility;

public class AutomationScriptSearchBar4Test extends BaseClass {

	@Test
	public void AutomateSearchclientAndDeleteclientt()   {
		AddClientPage client=new AddClientPage(driver);
		ClientStatusPage status=new ClientStatusPage(driver);
		comman.Client();
		excel.openExcel(IConstantUtility.Excel_Path);
		
		Map<String, String> map = excel.getDataFromExcelbyMap("ClientDetails");
		client.addClientfromexcel(map);
		
		String clientid = client.checkclientId();
		System.out.println(clientid);
		
		Map<String, String> map1 = excel.getDataFromExcelbyMap("NomineeDetails");
		client.addNomineeFromexcel(map1);
		
		
		comman.homePage();
		comman.searchBox(excel.getdata("ClientDetails", "Name"));
		comman.clickclientstatus();

		status.editClient();
		comman.searchBox(excel.getdata("ClientDetails", "Name"));	
		//status.submitClient();
		
		
		
	//Assert.assertEquals(client.checkclientId(), clientid);
		//Reporter.log("Testcase pass",true);
		
		comman.logout();
		web.closeBrowser(driver);
		excel.closeExcelworkbook();
	
	
	
	}
	
	
}



