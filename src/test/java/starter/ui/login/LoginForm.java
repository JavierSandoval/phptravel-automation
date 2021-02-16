package starter.ui.login;

import org.openqa.selenium.By;

public class LoginForm {

    public static By USERNAME_FIELD = By.xpath("//input[@type='text']");
    public static By PASSWORD_FIELD = By.xpath("//input[@type='password']");
    public static By LOGIN_BUTTON = By.xpath("//button[@type='submit']");
}
