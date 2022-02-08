$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DragAndDrop.feature");
formatter.feature({
  "line": 1,
  "name": "DragAndDropSlider",
  "description": "",
  "id": "draganddropslider",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verify whether value change to 95 or not",
  "description": "",
  "id": "draganddropslider;verify-whether-value-change-to-95-or-not",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Open LambdaTests Selenium Playground",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "click Drag \u0026 Drop Sliders under Progress Bars \u0026 Sliders",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "Select the slider Default value 15",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "drag the bar to make it 95 by",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "validating whether the range value shows 95",
  "keyword": "Then "
});
formatter.match({
  "location": "DragDrop.open_LambdaTests_Selenium_Playground()"
});
formatter.result({
  "duration": 1510289700,
  "status": "passed"
});
formatter.match({
  "location": "DragDrop.click_Drag_Drop_Sliders_under_Progress_Bars_Sliders()"
});
formatter.result({
  "duration": 2046230700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 32
    }
  ],
  "location": "DragDrop.select_the_slider_Default_value(int)"
});
formatter.result({
  "duration": 347800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "95",
      "offset": 24
    }
  ],
  "location": "DragDrop.drag_the_bar_to_make_it_by(int)"
});
formatter.result({
  "duration": 1171492800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "95",
      "offset": 41
    }
  ],
  "location": "DragDrop.validating_whether_the_range_value_shows(int)"
});
formatter.result({
  "duration": 3289154500,
  "status": "passed"
});
formatter.uri("InputFormSubmit.feature");
formatter.feature({
  "line": 1,
  "name": "InputFormSubmit",
  "description": "",
  "id": "inputformsubmit",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Submit form and verify it",
  "description": "",
  "id": "inputformsubmit;submit-form-and-verify-it",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Open the lambdatest selenium-playground page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "click Input Form Submit under Input Forms",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "Click Submit without filling in any information in the form",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Assert \"Please fill out this field.\" error message",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Fill in Name, Email, and other fields",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click Submit",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Once submitted, validate the success message \"Thanks for contacting us, we will get back to you shortly.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "InputFormSubmit.open_the_lambdatest_selenium_playground_page()"
});
formatter.result({
  "duration": 1100360600,
  "status": "passed"
});
formatter.match({
  "location": "InputFormSubmit.click_Input_Form_Submit_under_Input_Forms()"
});
formatter.result({
  "duration": 1950757000,
  "status": "passed"
});
formatter.match({
  "location": "InputFormSubmit.click_Submit_without_filling_in_any_information_in_the_form()"
});
formatter.result({
  "duration": 805361900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please fill out this field.",
      "offset": 8
    }
  ],
  "location": "InputFormSubmit.assert_error_message(String)"
});
formatter.result({
  "duration": 679996500,
  "status": "passed"
});
formatter.match({
  "location": "InputFormSubmit.fill_in_Name_Email_and_other_fields()"
});
formatter.result({
  "duration": 10687893500,
  "status": "passed"
});
formatter.match({
  "location": "InputFormSubmit.click_Submit()"
});
formatter.result({
  "duration": 817723500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thanks for contacting us, we will get back to you shortly.",
      "offset": 46
    }
  ],
  "location": "InputFormSubmit.once_submitted_validate_the_success_message(String)"
});
formatter.result({
  "duration": 3247923100,
  "status": "passed"
});
formatter.uri("SimpleFormDemo.feature");
formatter.feature({
  "line": 2,
  "name": "SimpleDemoForm",
  "description": "",
  "id": "simpledemoform",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify entered message is displayed or not",
  "description": "",
  "id": "simpledemoform;verify-entered-message-is-displayed-or-not",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open LambdaTests Selenium Playground from",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click Simple Form Demo under Input Forms",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Validate that the URL contains simple-form-demo",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Create a variable to enter values in the Enter Message text box",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click Get Checked Value",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Validate whether the same text message is displayed under the Your Message section",
  "keyword": "Then "
});
formatter.match({
  "location": "SimpleFormDemo.open_LambdaTests_Selenium_Playground_from()"
});
formatter.result({
  "duration": 1210801900,
  "status": "passed"
});
formatter.match({
  "location": "SimpleFormDemo.click_Simple_Form_Demo_under_Input_Forms()"
});
formatter.result({
  "duration": 2850869900,
  "status": "passed"
});
formatter.match({
  "location": "SimpleFormDemo.validate_that_the_URL_contains_simple_form_demo()"
});
formatter.result({
  "duration": 422597800,
  "status": "passed"
});
formatter.match({
  "location": "SimpleFormDemo.create_a_variable_to_enter_values_in_the_Enter_Message_text_box()"
});
formatter.result({
  "duration": 919774100,
  "status": "passed"
});
formatter.match({
  "location": "SimpleFormDemo.click_Get_Checked_Value()"
});
formatter.result({
  "duration": 920636700,
  "status": "passed"
});
formatter.match({
  "location": "SimpleFormDemo.validate_whether_the_same_text_message_is_displayed_under_the_Your_Message_section()"
});
formatter.result({
  "duration": 3357480800,
  "status": "passed"
});
});;