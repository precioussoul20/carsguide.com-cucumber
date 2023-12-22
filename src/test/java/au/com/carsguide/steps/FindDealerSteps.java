package au.com.carsguide.steps;

import au.com.carsguide.pages.FindDealersPage;
import au.com.carsguide.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FindDealerSteps {
    @When("I mouse hover on buy+sell tab")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverOnBuyAndSellLink();
    }

    @And("I click Find a Dealer")
    public void iClickFindADealer() {
        new HomePage().clickOnFindDealerLink();
    }

    @Then("I navigate to car-dealers page")
    public void iNavigateToCarDealersPage() {
        Assert.assertEquals(new FindDealersPage().getTextFromFindDealer(),"Find a Car Dealership Near You","Error");
    }

    @And("I should see the dealer names {string} are display on page")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String dealersName) {
       Assert.assertEquals(new FindDealersPage().isCarDealerNameAvailable(dealersName), dealersName, "Error");
    }
}
