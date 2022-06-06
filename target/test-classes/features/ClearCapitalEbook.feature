Feature: Ebook Functionality

  Agile story: As a user, when I am on eBook page, I should see Get your copy option

  @ebook
  Scenario: Validate Get your Copy script
    Given user is on Clear Capital homepage
    When user pointer hover over Resources
    And user selects ebooks
    Then validate that "GET YOUR COPY" is visible

  @ScenarioOutline
  Scenario Outline: Validate Resources page features
    Given user is on Clear Capital homepage
    When user clicks on Resources
    And user clicks "<viewResources>"
    Then validate that "<resource>"is visible

    Examples:
      | viewResources    | resource     |
      | View White Papers | White Papers |
      | View Newsroom     | Newsroom     |
      | View Glossary     | Glossary     |

@wip
    Scenario: validate n elements are visible
      Given user is on this page
      When user clicks on add element "6" times
      Then verify new element was added "6" times



