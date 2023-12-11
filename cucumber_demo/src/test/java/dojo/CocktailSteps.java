package dojo;


import static org.junit.Assert.assertEquals;
import java.util.List;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;



public class CocktailSteps {
 private Order order;
    @Given("{string} who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink(String demandeur) {
         order = new Order();
         order.declareOwner(demandeur);
    }

    @When("an order is declared for {string}")
           public void an_order_is_declared_for(String declaredFor) {
            order.declareTarget(declaredFor);
            
    }

   @Then("there {int} cocktail in the order")
    public void the_order_should_contain_cocktails(int expectedCocktailCount) {
        List<String> cocktails = order.getCocktails();
        assertEquals(expectedCocktailCount, cocktails.size());
    }


}