Feature: Search article in the by keyword

  Scenario Outline: Searching Article
    Given Danny is browsing the article blog
    When he selects the article to read article
      | article |
      |<article> |
    Then he should see information about article
      | article |
      |<article> |
    And he should see by post by author
      | author        |
      | <author>      |
    Examples:
      | author        | article                                           |
      | Jahzeel Lopez |  What QA automation is all about                   |
      | Sofia Gonzalez|  Why Fintech in Latin America Is Having a Boom     |