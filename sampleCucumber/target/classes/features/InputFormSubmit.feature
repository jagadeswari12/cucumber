Feature: InputFormSubmit
Scenario: Submit form and verify it
Given Open the lambdatest selenium-playground page
	And click Input Form Submit under Input Forms
	And Click Submit without filling in any information in the form
	And Assert "Please fill out this field." error message
	And Fill in Name, Email, and other fields
	When click Submit
	Then Once submitted, validate the success message "Thanks for contacting us, we will get back to you shortly."