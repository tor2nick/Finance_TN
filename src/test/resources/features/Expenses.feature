@wip
Feature: Расход
  Scenario: Расход

    Given Пользователь переходит на страницу входа
    Given Пользователь входит в систему с действительными учетными данными администратора на второй странице входа.
    When Пользователь кликает 'Добавить платеж'
    When Пользователь выбирает 'Расход' radio button
    And Пользователь выбирает 'Уменьшаемый план' from dropdown
    Then 'Сумма факт', 'Счет отправителя' and 'Счет получателя' is disappeared
    And 'Когда' block is disappeared
    And Related Payments appeared