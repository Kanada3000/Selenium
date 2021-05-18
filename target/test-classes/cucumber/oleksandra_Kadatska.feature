Feature: EPAM website

#  Scenario: Getting to Home page
#    Given open faq page
#    When click "epam" logo
#    Then get redirected to the main page
#
#  Scenario: Getting to Optimize
#    Given open main page
#    When hover link Services and click on Optimize
#    Then get redirected to the Optimize page

#  Scenario: Language change (Ukraine)
#    Given open main page
#    When switch location to Ukraine
#    Then get redirected to https://careers.epam.ua/

#  Scenario: FAQ
#    Given open faq page
#    When click on title of question
#    Then an expanded list of questions and answers should appear
#
#  Scenario: Fixed position of block "FILTER BY"
#    Given open insights page
#    When scroll below the "FILTER BY"
#    Then the block "FILTER BY" fixed on top of the window
#
#  Scenario: Watching a video with sound
#    Given open consult page
#    When click on crossed out picture with speaker
#    Then this video make sounds
#
  Scenario: Searching for job
    Given open job page
    When fill and submit a form
    Then get a list of chosen jobs

  Scenario: View the history
    Given open history page
    When click on white dots left from picture
    Then see history in chosen year