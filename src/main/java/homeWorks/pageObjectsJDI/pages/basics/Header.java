package homeWorks.pageObjectsJDI.pages.basics;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import homeWorks.entities.User;
import io.qameta.allure.Step;
import org.testng.Assert;

public class Header extends Section {

    @Css("#user-icon")
    public Button userIcon;

    @Css(".profile-photo span")
    private Text userFullName;

    @Css(".nav [href = 'metals-colors.html']")
    private Button metalsAndColor;

    @Step("Verify that User Name on the left top of Home Page header is displayed and have a correct name")
    public void checkUserNameAfterLogIn(User user) {
        Assert.assertTrue(userFullName.isDisplayed());
        Assert.assertTrue(userFullName.getText().contains(user.getName()));
    }

    @Step("Open \"Metals and Colors\" page")
    public void clickOnMetalsAndColorsButton() {
        metalsAndColor.click();
    }
}
