Feature: FaceBook 
Scenario Outline: FaceBook Login Credentials
Given User Launch The Application Url "https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjM1ODY1NzAyLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D"
When User Enter The Username In "<Username TextBox>"
And User Enter The Password In "<Password TextBox>"
Then User Click On The LogIn Button And It's Navigate Into FaceBook HomePage 

Examples:
|Username|Password|
|Sridhar|1234|
|Sridhar|4321|
|8190983883|8190983883|

