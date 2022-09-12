package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryLoginPage;
import pomPages.SkillrarydemoLoginPage;

public class TestCase1 extends BaseClass {
@Test

public void tc1(){
	SkillraryLoginPage s = new SkillraryLoginPage(driver);
	s.gearsbutton();
	s.Skillrarydemoapplication();
	utilities.switchingTabs(driver);
	
	SkillrarydemoLoginPage sd = new SkillrarydemoLoginPage(driver);
	utilities.mouseHover(driver, sd.getCoursetab());
	sd.seleniumtrainingtab();
	
	AddtoCartPage d = new AddtoCartPage(driver);
	utilities.doubleClick(driver, d.getAddbtn());
	d.addtocartbtn();
	utilities.alertPopup(driver);
	
}
}
