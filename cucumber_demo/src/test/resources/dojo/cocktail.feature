Feature: Cocktail Ordering

  As Romeo, I want to offer a drink to Juliette so that we can discuss together (and maybe more).

  Scenario Outline: Creating an empty order
    Given "<From>" who wants to buy a drink
    When  an order is declared for "<to>"
    Then  there <numberOfCocktails> cocktail in the order

Examples:
    | From           | to     | numberOfCocktails |
    | issos          | nicola |                 0 |

