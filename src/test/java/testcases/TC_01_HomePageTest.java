package testcases;

import org.testng.annotations.Test;

import base.Base;
import pageObjects.P1_HomePage;

public class TC_01_HomePageTest extends Base {

	@Test
	public void emiCalculate() throws InterruptedException {
		P1_HomePage homePage = new P1_HomePage();
		homePage.clckEMICalculatorBtn();
	}

}
