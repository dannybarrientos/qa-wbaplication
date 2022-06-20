Feature: Search article in the by keyword

  Scenario: Searching Article
    Given Danny is browsing the article blog
    When he selects the article to read <Sort Order>
    Then he should see information about article
    And he should see by post by author