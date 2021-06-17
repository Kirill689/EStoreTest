Feature: Test E store

  Scenario: Put item in cart, than remove it
    Then Select "autoSearchkeyWords"
    Then "autoSearchkeyWords" field input "Двухсторонний ремень из экокожи"
    Then Hover on "1" item in list to see available sizes
    Then Select "1" available size in list
    Then Click on "addProductToCart"
    Then CLick on product cart "nbArticles"
    Then Assert that item "Двухсторонний ремень из экокожи" is in cart
    Then Remove item "Двухсторонний ремень из экокожи" from cart
    Then Check that "Двухсторонний ремень из экокожи" was removed from cart

