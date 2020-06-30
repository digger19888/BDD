Feature: As a user I want to get ability to use menu section

  @smoke
  Scenario: Products sections should contains appropriate columns
    Given the user opens Google Cloud website
    When the user clicks on the "Products" section
    And the user clicks on the "Cloud Storage" item
    Then there are 7 items in the left-side menu
    And left-side menu contain the following links
      | Benefits                            |
      | Key features                        |
      | Customers                           |
      | What's new                          |
      | VM migration to Compute Engine      |
      | Genomics data processing            |
      | BYOL or use license-included images |
