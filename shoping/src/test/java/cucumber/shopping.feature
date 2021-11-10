Feature: Shopping Site Testing
Scenario Outline: Checking Entire Modeule In A Single Feature
Given User Enter The Url As "http://automationpractice.com/index.php"
When User Click On The Sigining In Button
And User Enter The Email As "<Email Id>"
And User Enter The Password As "<password>"
And User Click On The Signin Button
And Sleep
And User Perfrom Into Dress Section
And User Click On The Casual Dress
And User Scroll The Window Upto Post
And User Click On The Image That Navigate Into Frame Page
And User Entering Into Frame Page
And User Add The Quantity Of The Product
And User Select The Size Of The Product
And User Click On The Add To Cart And Its Navigate Into The AddSummary Page
And User Back Into The Parent/Default Page
And User Click On The Add To Cart Summary And Its Navigate Into Purchase Summary
And User Click On The Checkout PurchaseSummary And Its Navigate Into Address Confirm Page
And User Enter The Message For The Address LandMark
And User Click The Address Confirm Button And Its Navigate Into The Truck Page
And User click The Radio button For Truck
And User Click The Preceed To Carrier Button And Its Navigate Into Banking Page
And User Clcik On The Mode Of PayMent
And User Enter The Submit Button To Payment And Its Navigate Into Logout Page
Then User Click On The Logout Button 
Examples:
|Email Id|password|
|green@gmail.com|wewe1234|
|greens@gmail.com|Ashur@12345|
|greenes@gmail.com|dwe1234|