package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrarydemoLoginPage {
	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	@FindBy (name="addresstype")
	private WebElement coursedd;
	
	
	
	public SkillrarydemoLoginPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
public void seleniumtrainingtab() {
	seleniumtraining.click();
}
public WebElement getCoursetab() {
	return coursetab;
	
}

public WebElement getCoursedd() {
	return coursedd;
}
}
