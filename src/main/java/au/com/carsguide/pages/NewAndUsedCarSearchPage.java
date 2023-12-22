package au.com.carsguide.pages;


import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NewAndUsedCarSearchPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement newAndUsedCarSearchPageText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement carMake;
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement carModel;
    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement carLocation ;
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement carPrice;
    @CacheLookup
    @FindBy(id = "search-submit")
    WebElement findMyNextCarTab;



    public void selectCarMake(String make){
        selectByVisibleTextFromDropDown(carMake, make);
    }
    public void selectCarModel(String model){
        selectByVisibleTextFromDropDown(carModel,model);
    }
    public void selectCarLocation(String location){
        selectByVisibleTextFromDropDown(carLocation,location);
    }
    public void selectCarPrice(String price){
        selectByVisibleTextFromDropDown(carPrice, price);
    }
    public void clickOnFindMyNextCarTab(){
        clickOnElement(findMyNextCarTab);
    }

    public String getTextFromNewAndUsedCarSearchPage(){
        return getTextFromElement(newAndUsedCarSearchPageText);
    }

}
