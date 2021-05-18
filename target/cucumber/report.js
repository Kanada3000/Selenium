$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('cucumber\oleksandra_Kadatska.feature');
formatter.feature({
  "line": 1,
  "name": "EPAM website",
  "description": "",
  "id": "epam-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Getting to Home page",
  "description": "",
  "id": "epam-website;getting-to-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "page https://investors.epam.com/investors/faq",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click \"epam\" logo",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "get redirected to the main page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.FaqPage()"
});
formatter.result({
  "duration": 10818799500,
  "status": "passed"
});
formatter.match({
  "location": "steps.backToHome()"
});
formatter.result({
  "duration": 7203125000,
  "status": "passed"
});
formatter.match({
  "location": "steps.isRedirectedHome()"
});
formatter.result({
  "duration": 36419800,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Getting to Optimize",
  "description": "",
  "id": "epam-website;getting-to-optimize",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "page https://www.epam.com/",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "hover link Services and click on Optimize",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "get redirected to the Optimize page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.MainPage()"
});
formatter.result({
  "duration": 28604421100,
  "status": "passed"
});
formatter.match({
  "location": "steps.hoverServices()"
});
formatter.result({
  "duration": 12021804500,
  "status": "passed"
});
formatter.match({
  "location": "steps.isRedirectedOptimize()"
});
formatter.result({
  "duration": 9678500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Language change (Ukraine)",
  "description": "",
  "id": "epam-website;language-change-(ukraine)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "page https://www.epam.com/",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "switch location to Ukraine",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "get redirected to https://careers.epam.ua/",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.MainPage()"
});
formatter.result({
  "duration": 33467829700,
  "status": "passed"
});
formatter.match({
  "location": "steps.switchLocation()"
});
formatter.result({
  "duration": 380182700,
  "status": "passed"
});
formatter.match({
  "location": "steps.isRedirectedCareers()"
});
formatter.result({
  "duration": 10017128400,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "FAQ",
  "description": "",
  "id": "epam-website;faq",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "page https://investors.epam.com/investors/faq",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "click on title of question",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "an expanded list of questions and answers should appear",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.FaqPage()"
});
formatter.result({
  "duration": 19097735000,
  "status": "passed"
});
formatter.match({
  "location": "steps.clickTitle()"
});
formatter.result({
  "duration": 85508600,
  "status": "passed"
});
formatter.match({
  "location": "steps.questionsList()"
});
formatter.result({
  "duration": 252157000,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Fixed position of block \"FILTER BY\"",
  "description": "",
  "id": "epam-website;fixed-position-of-block-\"filter-by\"",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "page https://www.epam.com/insights",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "scroll below the \"FILTER BY\"",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "the block \"FILTER BY\" fixed on top of the window",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.InsightsPage()"
});
formatter.result({
  "duration": 35549620300,
  "status": "passed"
});
formatter.match({
  "location": "steps.scrollToFilter()"
});
formatter.result({
  "duration": 321471900,
  "status": "passed"
});
formatter.match({
  "location": "steps.isBlockFixed()"
});
formatter.result({
  "duration": 2256644700,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 27,
      "value": "#"
    }
  ],
  "line": 28,
  "name": "Watching a video with sound",
  "description": "",
  "id": "epam-website;watching-a-video-with-sound",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "page https://www.epam.com/services/consult-and-design",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "click on crossed out picture with speaker",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "this video make sounds",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ConsultPage()"
});
formatter.result({
  "duration": 27748465200,
  "status": "passed"
});
formatter.match({
  "location": "steps.clickSpeaker()"
});
formatter.result({
  "duration": 2462544300,
  "status": "passed"
});
formatter.match({
  "location": "steps.isSounds()"
});
formatter.result({
  "duration": 62386100,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Searching for job",
  "description": "",
  "id": "epam-website;searching-for-job",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "page https://www.epam.com/careers/job-listings",
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
  "location": "steps.JobPage()"
});
formatter.result({
  "duration": 29291352400,
  "status": "passed"
});
formatter.match({
  "location": "steps.fillForm()"
});
formatter.result({
  "duration": 7451384700,
  "status": "passed"
});
formatter.match({
  "location": "steps.jobList()"
});
formatter.result({
  "duration": 235065700,
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
  "name": "page https://www.epam.com/about/who-we-are/history",
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
  "location": "steps.HistoryPage()"
});
formatter.result({
  "duration": 71909040900,
  "status": "passed"
});
formatter.match({
  "location": "steps.clickDots()"
});
formatter.result({
  "duration": 634095300,
  "status": "passed"
});
formatter.match({
  "location": "steps.isCorrectYear()"
});
formatter.result({
  "duration": 46095400,
  "status": "passed"
});
});