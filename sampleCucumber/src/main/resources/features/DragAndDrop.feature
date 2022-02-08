Feature: DragAndDropSlider
Scenario: Verify whether value change to 95 or not 
Given Open LambdaTests Selenium Playground
	And click Drag & Drop Sliders under Progress Bars & Sliders 
	And Select the slider Default value 15
	When drag the bar to make it 95 by
	Then validating whether the range value shows 95
	
