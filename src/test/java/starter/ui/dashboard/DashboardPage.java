package starter.ui.dashboard;

import org.openqa.selenium.By;

public class DashboardPage {

    public static By BLOG_ITEM = By.xpath("//body/div[3]/nav[1]/div[2]/ul[1]/li[14]/a[1]");
    public static By POSTS = By.xpath("//li/ul/li/a[contains(text(),'Posts')]");
    public static By BLOG_CATEGORIES = By.xpath("//li/ul/li/a[contains(text(),'Blog Categories')]");
}
