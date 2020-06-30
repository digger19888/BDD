Feature: As a user I want to get ability to use menu section

  @smoke
  Scenario: Pricing section should contains appropriate columns
    Given the user opens Google Cloud website
    When the user clicks on the "Products" section
    And the user clicks on the "Compute Engine" item
    Then page with title "Compute Engine" is displayed