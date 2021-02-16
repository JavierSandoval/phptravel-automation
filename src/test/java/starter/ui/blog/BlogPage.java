package starter.ui.blog;

import org.openqa.selenium.By;

public class BlogPage {

    public static By ADD_BUTTON = By.xpath("//button[@type='button'][contains(text(),'Add')]");
    public static By CATEGORY_NAME = By.xpath("//input[@name='name'][@placeholder='Name'][@value='']");
    public static By STATUS = By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/select[1]");
    public static By NAME_IN_VIETNAMESE = By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[3]/div[1]/input[1]");
    public static By NAME_IN_RUSSIAN = By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[4]/div[1]/input[1]");
    public static By NAME_IN_ARABIC = By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[5]/div[1]/input[1]");
    public static By NAME_IN_FARSI = By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[6]/div[1]/input[1]");
    public static By NAME_IN_TURKISH = By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[7]/div[1]/input[1]");
    public static By NAME_IN_FRENCH = By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[8]/div[1]/input[1]");
    public static By NAME_IN_SPANISH = By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[9]/div[1]/input[1]");
    public static By NAME_IN_GERMAN = By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[10]/div[1]/input[1]");
    public static By SUBMIT_ADD_BUTTON = By.xpath("//button[@type='submit'][contains(text(),'Add')]");
    public static By CATEGORY_ITEM = By.xpath("//tr/td[contains(text(),'extreme sports')]");
}
