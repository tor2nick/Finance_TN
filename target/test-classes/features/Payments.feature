@wip
Feature: Новый платеж
  Scenario: Новый платеж

    Given Пользователь переходит на страницу входа
    Given Пользователь входит в систему с действительными учетными данными администратора на второй странице входа.
    Then Пользователь попадает на главную страницу
    When Пользователь кликает 'Добавить платеж'
    Then Пользователь попадает на 'Добавить платеж' page