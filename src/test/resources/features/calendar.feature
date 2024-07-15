Feature: Calendar Test

  Scenario Outline: User creates a calendar event
    Given User is logged in with email "<email>", password "<password>", and phone number "<phoneNumber>"
    When User navigates to the specific day "<date>"
    And User creates a new event "<eventText>"
    Then The event "<eventText>" is present in the calendar

    Examples:
    | email | password | phoneNumber | date | eventText |
    | testuser2@gmail.com | blablabla | 12345444 | 2024-07-15 | Training with Cristiano Ronaldo |
#    | testuser3@gmail.com | blablabla | 123456798 | 2024-07-15 | Training with Usain Bolt |