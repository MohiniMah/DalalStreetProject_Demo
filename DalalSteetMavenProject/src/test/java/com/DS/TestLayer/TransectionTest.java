package com.DS.TestLayer;

import org.testng.annotations.Test;

import com.DS.PageLayer.Dashboard_Page;
import com.DS.PageLayer.LoginPage;
import com.DS.PageLayer.Transection_Page;
import com.DS.TestBase.TestBaseClass;

public class TransectionTest extends TestBaseClass {

	@Test
public void getDatafromTransectionPage() throws InterruptedException
	
	{
		dash_Obj.ClickOnTransectionlink();				//	trans_obj.getData();
		trans_obj.getAllData();
	}
	
}
