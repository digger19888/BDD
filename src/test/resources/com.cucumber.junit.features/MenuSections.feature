Feature: As a user I want to get ability to use menu section

  @smoke
  Scenario Outline: Pricing section should contains appropriate columns
    Given the user opens Google Cloud website
    When the user clicks on the "Products" section
    And the user clicks on the "<title>" item
    Then page with title "<title>" is displayed
    Examples:
      | title          |
      | Compute Engine |
      | Cloud Storage  |