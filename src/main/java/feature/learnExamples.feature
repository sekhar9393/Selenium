Feature: Create Lead
Scenario Outline: Create Lead Test Case Verification

Given open Browser
And load URL
And maximimize the window
And Enter UserName
And Enter Password
And Click LoginButton
And Click CRMSFA
And Click Leads
And Click Create Lead
And Enter FirstName <fName>
And Enter LastName <lName>
And Enter CompanyName <cName>
Then CreateLeadButton

Examples:
|fName|lName|cName|
|Ajith|Kumar|Veeram|
|Vijay|Joseph|Jilla|
|Surya|Sivakumar|TSK|