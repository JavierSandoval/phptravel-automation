package starter.ui.post;

import org.openqa.selenium.By;

public class PostPage {

    public static By ADD_BUTTON = By.xpath("//button[@type='submit'][contains(text(),'Add')]");
    public static By POST_TITLE = By.xpath("//input[@name='title']");
    public static By PERMALINK = By.xpath("//input[@name='slug']");
    public static By POST_BODY = By.xpath("//body/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/iframe[1]");
    //public static By POST_BODY = By.cssSelector("body.cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders:nth-child(2) > p:nth-child(1)");
    public static By SEO_KEYWORDS = By.xpath("//input[@name='keywords']");
    public static By SEO_DESCRIPTION = By.xpath("//input[@name='metadesc']");
    public static By CATEGORY = By.xpath("//select[@name='category']");
    //public static By RELATED_POST = By.xpath("");
    public static By SUBMIT_BUTTON = By.xpath("//button[contains(text(),'Submit')]");
    public static By NEW_POST = By.xpath("//tr/td/a[contains(text(),'Defining Extreme Sport')]");
}
