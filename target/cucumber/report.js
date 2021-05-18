$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('cucumber\oleksandra_Kadatska.feature');
formatter.feature({
  "line": 1,
  "name": "EPAM website",
  "description": "",
  "id": "epam-website",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#  Scenario: Getting to Home page"
    },
    {
      "line": 4,
      "value": "#    Given open faq page"
    },
    {
      "line": 5,
      "value": "#    When click \"epam\" logo"
    },
    {
      "line": 6,
      "value": "#    Then get redirected to the main page"
    },
    {
      "line": 7,
      "value": "#"
    },
    {
      "line": 8,
      "value": "#  Scenario: Getting to Optimize"
    },
    {
      "line": 9,
      "value": "#    Given open main page"
    },
    {
      "line": 10,
      "value": "#    When hover link Services and click on Optimize"
    },
    {
      "line": 11,
      "value": "#    Then get redirected to the Optimize page"
    },
    {
      "line": 13,
      "value": "#  Scenario: Language change (Ukraine)"
    },
    {
      "line": 14,
      "value": "#    Given open main page"
    },
    {
      "line": 15,
      "value": "#    When switch location to Ukraine"
    },
    {
      "line": 16,
      "value": "#    Then get redirected to https://careers.epam.ua/"
    },
    {
      "line": 18,
      "value": "#  Scenario: FAQ"
    },
    {
      "line": 19,
      "value": "#    Given open faq page"
    },
    {
      "line": 20,
      "value": "#    When click on title of question"
    },
    {
      "line": 21,
      "value": "#    Then an expanded list of questions and answers should appear"
    },
    {
      "line": 22,
      "value": "#"
    },
    {
      "line": 23,
      "value": "#  Scenario: Fixed position of block \"FILTER BY\""
    },
    {
      "line": 24,
      "value": "#    Given open insights page"
    },
    {
      "line": 25,
      "value": "#    When scroll below the \"FILTER BY\""
    },
    {
      "line": 26,
      "value": "#    Then the block \"FILTER BY\" fixed on top of the window"
    },
    {
      "line": 27,
      "value": "#"
    },
    {
      "line": 28,
      "value": "#  Scenario: Watching a video with sound"
    },
    {
      "line": 29,
      "value": "#    Given open consult page"
    },
    {
      "line": 30,
      "value": "#    When click on crossed out picture with speaker"
    },
    {
      "line": 31,
      "value": "#    Then this video make sounds"
    },
    {
      "line": 32,
      "value": "#"
    }
  ],
  "line": 33,
  "name": "Searching for job",
  "description": "",
  "id": "epam-website;searching-for-job",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "open job page",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "fill and submit a form",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "get a list of chosen jobs",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "job",
      "offset": 5
    }
  ],
  "location": "steps.openPage(String)"
});
formatter.result({
  "duration": 12432035400,
  "status": "passed"
});
formatter.match({
  "location": "steps.fillForm()"
});
formatter.result({
  "duration": 7275517900,
  "status": "passed"
});
formatter.match({
  "location": "steps.jobList()"
});
formatter.result({
  "duration": 1139708900,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "View the history",
  "description": "",
  "id": "epam-website;view-the-history",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "open history page",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "click on white dots left from picture",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "see history in chosen year",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "history",
      "offset": 5
    }
  ],
  "location": "steps.openPage(String)"
});
formatter.result({
  "duration": 13874801900,
  "status": "passed"
});
formatter.match({
  "location": "steps.clickDots()"
});
formatter.result({
  "duration": 148071300,
  "status": "passed"
});
formatter.match({
  "location": "steps.isCorrectYear()"
});
formatter.result({
  "duration": 29156500,
  "status": "passed"
});
});