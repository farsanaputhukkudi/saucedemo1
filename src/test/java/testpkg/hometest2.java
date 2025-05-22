package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Homepage;

public class hometest2 extends Baseclass
{
@Test
public void test1() throws Exception
{
	Homepage page=new Homepage(driver);
	page.addtocart();
	page.clickcart();
	page.checkout();
	page.fill("fars","nas", "890");
	page.logout();
	
}
}
