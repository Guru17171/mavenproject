package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
@Test
public void createCustomer() {
	Reporter.log("createCustomer",true);
}
@Test
public void deleteCustomer() {
	Reporter.log("deleteCustomer",true);
}
}
