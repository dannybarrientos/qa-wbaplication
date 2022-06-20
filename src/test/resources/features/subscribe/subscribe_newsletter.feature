Feature: Subscribe email to our newsletter

  Scenario Outline:  Subscribe to our newsletter!
    Given Danny is browsing the article blog
    When he into the parameter
      | email |
      |<email> |
    Then he should be presented with the message
      | message |
      |<message> |
    Examples:
     | email                      | message                                 |
     | dannybarrientos12@gmail.com|  Thank you for subscribing! Stay tuned. |