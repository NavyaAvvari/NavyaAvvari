package com.qa.alibabatestdata;
import com.qa.ExcelUtility.*;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Alibaba.pages.TestBase;

public class TC_Alibaba extends TestBase {

	@Test(priority = 1, dataProvider = "getData")
	public void Alibaba(String Input1, String Input2) throws InterruptedException {

		ap.getSigninlink().click();
		ap.getEmailid().sendKeys(Input1);
		ap.getPassword().sendKeys(Input2);
		Boolean C = ap.getChechinbox().isSelected();
		Reporter.log("checkin Box is selected", true);
		ap.getSigninbtn().click();
		Thread.sleep(5000);

		ap.getSearchbox().sendKeys("watches");
		ap.getSearchbox().submit();
		Thread.sleep(2000);

		WebElement ele = ap.getMyaccountaction();
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		WebElement ele1 = ap.getSignout();
		action.moveToElement(ele1).perform();
		ap.getSignout().click();

	}

	@DataProvider
	public String[][] getData() throws IOException {

		String xPath = "C:\\Users\\kaveri\\git\\TC_Alibaba\\AlibabaShopping\\src\\test\\java\\com\\qa\\alibabatestdata\\TestData.xlsx";
		String xSheet = "Sheet1";
		int rowCount = ExcelUtility.getRowCount(xPath, xSheet);
		int cellCount = ExcelUtility.getCellCount(xPath, xSheet, rowCount);

		String[][] data = new String[rowCount][cellCount];

		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				data[i - 1][j] = ExcelUtility.getCellData(xPath, xSheet, i, j);
			}
		}
		return data;

	}

}
