package com.sevenmartsupermarket.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sevenmartsupermarket.base.Base;
import com.sevenmartsupermarket.pages.LoginPage;
import com.sevenmartsupermarket.pages.PushNotificationsPage;
import com.sevenmartsupermarket.utilities.ExcelRead;

public class PushNotificationsTest extends Base {
	PushNotificationsPage pushNotificationsPage;
	LoginPage loginPage;
	ExcelRead excelRead=new ExcelRead();
	SoftAssert softassert=new SoftAssert();;
	@Test(groups = "smoke")
	public void verifyPushNotificationMessage() throws InterruptedException {
		pushNotificationsPage=new PushNotificationsPage(driver);
		loginPage=new LoginPage(driver);
		loginPage.login();
		excelRead.setExcelFile("PushNotifications", "Notification"); 
		pushNotificationsPage.clickOnPushNotifications();
		String title=excelRead.getCellData(1, 0);
		String description=excelRead.getCellData(1, 1);
		pushNotificationsPage.sendNotifications(title, description);
		softassert.assertTrue(pushNotificationsPage.isSuccessAlertDisplayed());
		softassert.assertAll();
	}
}
