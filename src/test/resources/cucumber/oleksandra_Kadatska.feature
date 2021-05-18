Feature: EPAM website

  Scenario: Getting to Home page
    Given page https://investors.epam.com/investors/faq
    When click "epam" logo
    Then get redirected to the main page

  Scenario: Getting to Optimize
    Given page https://www.epam.com/
    When hover link Services and click on Optimize
    Then get redirected to the Optimize page

  Scenario: Language change (Ukraine)
    Given page https://www.epam.com/
    When switch location to Ukraine
    Then get redirected to https://careers.epam.ua/

  Scenario: FAQ
    Given page https://investors.epam.com/investors/faq
    When click on title of question
    Then an expanded list of questions and answers should appear

  Scenario: Fixed position of block "FILTER BY"
    Given page https://www.epam.com/insights
    When scroll below the "FILTER BY"
    Then the block "FILTER BY" fixed on top of the window
#
  Scenario: Watching a video with sound
    Given page https://www.epam.com/services/consult-and-design
    When click on crossed out picture with speaker
    Then this video make sounds

  Scenario: Searching for job
    Given page https://www.epam.com/careers/job-listings
    When fill and submit a form
    Then get a list of chosen jobs

  Scenario: View the history
    Given page https://www.epam.com/about/who-we-are/history
    When click on white dots left from picture
    Then see history in chosen year