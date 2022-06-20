
Feature: Login's all good

  Rule: Customers needs to provide valid credentials to access the site


    Example: Danny logs in with Colin's valid credentials
      Given Danny is on the login page
      When Danny logs in with valid credentials
      Then he should be presented the product catalog


    Scenario Outline: Login's with invalid credentials
      Given Danny is on the login page
      When Danny attempts to login with the following credentials:
        | username   | password   |
        | <username> | <password> |
      Then he should be presented with the error message <message>
      Examples:
        | username        | password       | message                                                     |
        | standard_user   | wrong_password | Username and password do not match any user in this service |
        | unknown_user    | secret_blackFactor    | Username and password do not match any user in this service |
        | unknown_user    | wrong_password | Username and password do not match any user in this service |
        | locked_out_user | secret_blackFactor  | Sorry, this user has been locked out.                       |