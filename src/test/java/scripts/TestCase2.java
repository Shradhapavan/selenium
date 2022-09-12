package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryLoginPage;
import pomPages.SkillrarydemoLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass {
@Test
public void tc2() throws IOException {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.Skillrarydemoapplication();
		
		SkillrarydemoLoginPage sd=new SkillrarydemoLoginPage(driver);
		utilities.switchingTabs(driver);
		utilities.dropDown(sd.getCoursedd(), pdata.getPropertydata("coursedd"));
		
		TestingPage tp = new TestingPage(driver);
		utilities.dragDrop(driver, tp.getSeleniumtraining(), tp.getCarttab());
		Point loc = tp.getFacebook().getLocation();
		int x=loc.getX();
		int y=loc.getY();
		
		utilities.scrollBar(driver,x,y);
		tp.facebookicon();
	}
	
	
}

