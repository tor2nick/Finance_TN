$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Expenses.feature");
formatter.feature({
  "name": "Расход",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "Расход",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь переходит на страницу входа",
  "keyword": "Given "
});
formatter.match({
  "location": "com.Finance.step_definitions.Login_StepDefinitions.user_Navigates_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь входит в систему с действительными учетными данными администратора на второй странице входа.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.Finance.step_definitions.Login_StepDefinitions.user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь кликает \u0027Добавить платеж\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.Finance.step_definitions.Payments_StepDefinitions.user_clicks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь выбирает \u0027Расход\u0027 radio button",
  "keyword": "When "
});
formatter.match({
  "location": "com.Finance.step_definitions.Expenses_StepDefinitions.user_selects_radio_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь выбирает \u0027Уменьшаемый план\u0027 from dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "com.Finance.step_definitions.Expenses_StepDefinitions.user_selects_from_dropdown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Сумма факт\u0027, \u0027Счет отправителя\u0027 and \u0027Счет получателя\u0027 is disappeared",
  "keyword": "Then "
});
formatter.match({
  "location": "com.Finance.step_definitions.Expenses_StepDefinitions.and_is_disappeared(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Когда\u0027 block is disappeared",
  "keyword": "And "
});
formatter.match({
  "location": "com.Finance.step_definitions.Expenses_StepDefinitions.block_is_disappeared(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Related Payments appeared",
  "keyword": "And "
});
formatter.match({
  "location": "com.Finance.step_definitions.Expenses_StepDefinitions.related_Payments_appeared()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь переходит на страницу входа",
  "keyword": "Given "
});
formatter.match({
  "location": "com.Finance.step_definitions.Login_StepDefinitions.user_Navigates_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь входит в систему с действительными учетными данными администратора на второй странице входа.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.Finance.step_definitions.Login_StepDefinitions.user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь попадает на главную страницу",
  "keyword": "Then "
});
formatter.match({
  "location": "com.Finance.step_definitions.Login_StepDefinitions.userLandsOnTheHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Payments.feature");
formatter.feature({
  "name": "Новый платеж",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "Новый платеж",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь переходит на страницу входа",
  "keyword": "Given "
});
formatter.match({
  "location": "com.Finance.step_definitions.Login_StepDefinitions.user_Navigates_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь входит в систему с действительными учетными данными администратора на второй странице входа.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.Finance.step_definitions.Login_StepDefinitions.user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь попадает на главную страницу",
  "keyword": "Then "
});
formatter.match({
  "location": "com.Finance.step_definitions.Login_StepDefinitions.userLandsOnTheHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь кликает \u0027Добавить платеж\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.Finance.step_definitions.Payments_StepDefinitions.user_clicks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Пользователь попадает на \u0027Добавить платеж\u0027 page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.Finance.step_definitions.Payments_StepDefinitions.user_lands_on_the_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});