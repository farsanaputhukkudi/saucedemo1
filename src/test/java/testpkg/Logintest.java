package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Loginpage;
import utilities.saucedemoexcel;



	public class Logintest extends Baseclass{
		@Test
		public void test1() throws Exception
		{
			Loginpage page=new Loginpage(driver);
			String xl="C:\\Users\\farsa\\saucedemo.xlsx\\";
			String sheet="Sheet1";
			int rowcount=saucedemoexcel.getRowcount(xl, sheet);
			for(int i=1;i<=rowcount;i++)
			{
				String username=saucedemoexcel.getcellvalues(xl, sheet, i, 0);
				String passwrd=saucedemoexcel.getcellvalues(xl, sheet, i, 1);
				page.login(username, passwrd);
				page.click();
				
			}

}
}