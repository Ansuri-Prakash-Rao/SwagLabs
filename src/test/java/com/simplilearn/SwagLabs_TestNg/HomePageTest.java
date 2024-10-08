package com.simplilearn.SwagLabs_TestNg;

import org.testng.annotations.Test;

import pages.homepage;
import pages.loginpage;

public class HomePageTest extends BaseClass{


	@Test
	public void TC01_AddToCartTest() {
		loginpage lp = new loginpage();
		homepage hp = new homepage();
		lp.loginToSwagLabs("standard_user", "secret_sauce");
		hp.verifyHomePage();
		hp.itemAddToCart("Sauce Labs Backpack");
		hp.verifyNumberOfItemAddedToCart(1);
	}
}
