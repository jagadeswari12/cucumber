
Feature: SimpleDemoForm
Scenario: Verify entered message is displayed or not
Given Open LambdaTests Selenium Playground from
	And Click Simple Form Demo under Input Forms
	And Validate that the URL contains simple-form-demo
	And Create a variable to enter values in the Enter Message text box
	When Click Get Checked Value
	Then Validate whether the same text message is displayed under the Your Message section
 