@sprint01
Feature: ToolsQa Application Form

@User01
Scenario: User Fill Up The Application Form
Given User Enter The Url "https://demoqa.com/automation-practice-form"
When User Enter The First Name As "Sridhar"
And User Enter The Last Name As "Kumar"
Then User Next  To Enter The Email.id

@User02
Scenario: User Fill Up The 2nd Phase
Given User Enter The EmailId "sridharsarvesh@gmail.com"
When User Click On The Radio BUtton
And User Enter The Phone Number
Then User Next To Enter The DOB
@USer03
Scenario: User Enter The 3rd Phase 
Given User Click On The Calander
When User Select The Month Of The Birth
And User Select The Year Of The Birth
And User Select The Date Of The Birth
Then User Next To Enter The Subjects
@User04
Scenario: User Enter The 4th Phase
Given User Enter The Subject Name As "Hindi"
When User Click On The Sports Checkbox
And User Enter The Address In The AddressBox
And User Click On The StateBox
And User Choose The State
Then User Click On The Submit Button
