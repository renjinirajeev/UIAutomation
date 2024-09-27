Feature: Add to cart functionality

  Scenario: verify user can  perform add to cart function

    Given user opens the website
    Then verify user is on home page
    When user search an element "product.Name"
    Then verify user is on searched element page
    When user click an the first item
    Then verify user is on searched first item page
    When user click add to cart
    Then verify user added the product successfully

