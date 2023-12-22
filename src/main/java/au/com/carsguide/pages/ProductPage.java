package au.com.carsguide.pages;


import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[@class='h1Text search--title']")
    WebElement productResultsText;
    public String getTextFromResults(){
        return getTextFromElement(productResultsText);
    }

}
