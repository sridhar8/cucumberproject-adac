Feature: Demo Page
Scenario: Demo Page Regiteration
Given User Enter The Url "https://demoqa.com/automation-practice-form"
When User Enter The Firstname as "Srdhar"
And User Enter The Lastname as "Kumar"
And User Enter The EmailId as "sridharsarvesh@gmail.com"
And User Select The Gender by Radio Button
And User Enter The Mobile Number As "8190983883"
And User Click The Calander
And User Select The Month Of Birth
And User Select The Year Of Birth
And User Select The Date Of Birth
And User Select The Subject
And User Select The Hobby By TickBox
And User Enter The Address As "HI"
And User Click The State
And User Select The State
Then  User Click The Submit Button And Its Navigate Into The All Details Page