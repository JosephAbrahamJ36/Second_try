package com.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.library.Base_class;
import com.pages.OrgHrmLogin_Page;

public class OrgHrmLogin_TestCase extends Base_class{

   OrgHrmLogin_Page ohl;
	
	
	@Test
	
	public void logintestcase() throws InterruptedException, IOException {
		ohl= new OrgHrmLogin_Page(driver);
		ohl.logindetails();
		Thread.sleep(3000);
	}
}
