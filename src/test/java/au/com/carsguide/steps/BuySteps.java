package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarSearchPage;
import au.com.carsguide.pages.ProductPage;
import au.com.carsguide.pages.UsedCarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BuySteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover on buy+sell link")
    public void iMouseHoverOnBuySellLink() {
        new HomePage().mouseHoverOnBuyAndSellLink();
    }

    @And("I click Search Cars link")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnCarSearchLink();
    }

    @Then("I navigate to new and used car search page")
    public void iNavigateToNewAndUsedCarSearchPage() {
        Assert.assertEquals(new NewAndUsedCarSearchPage().getTextFromNewAndUsedCarSearchPage(),"New & Used Car Search - carsguide" , "Error");
    }

    @And("I select make {string}")
    public void iSelectMake(String make) {
        new NewAndUsedCarSearchPage().selectCarMake(make);
    }

    @And("I select model {string}")
    public void iSelectModel(String model) {
        new NewAndUsedCarSearchPage().selectCarModel(model);
    }

    @And("I select location {string}")
    public void iSelectLocation(String location) {
        new NewAndUsedCarSearchPage().selectCarLocation(location);
    }

    @And("I select price {string}")
    public void iSelectPrice(String price) {
        new NewAndUsedCarSearchPage().selectCarPrice(price);
    }

    @And("I click on Find My Next Car tab")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCarTab();
    }

    @Then("I should see the make {string} in results")
    public void iShouldSeeTheMakeInResults(String make) {
        Assert.assertTrue(new ProductPage().getTextFromResults().contains(make));
    }

    @Given("I am homepage")
    public void iAmHomepage() {
    }

    @And("I click Used link")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedCarLink();
    }

    @Then("I navigate to Used Cars For Sale Page")
    public void iNavigateToUsedCarsForSalePage() {
        Assert.assertEquals(new UsedCarPage().getTextFromUsedCarForSale(),"Used Cars For Sale", "Error");
    }
}
