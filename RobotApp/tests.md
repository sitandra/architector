# Протокол тестирования
Разработать тесты под проекта системы управления роботом пылесосом (достаточно один протокол):
1) Предложить и разработать E2E тесты
2) Предложить и разработать приёмочные тесты (UAT) для сценариев Use case

Тесты сдаются в виде протокола(pdf, doc, docx, xls) или ссылка на документ на платформах ( https://www.postman.com/ или https://www.gurock.com/testrail/)

(Со звездочкой) Разработать Unit Test для разработанного для проекта кода.

Инструменты:
* https://app.diagrams.net/
* https://www.gurock.com/testrail/
* https://www.postman.com/

## UAT тесты
| UseCase             | Действие     | Ожидание   | Результат
|:---------------------|:-------------|:---------------------|:---------------------
| Войти в облако через код SMS | Ввести номер телефона, а на следующей странице – код SMS | Пришло SMS, переключился экран на ввод кода, после ввода кода пользователь успешно вошел в облако и видит список устройств | 
| Войти в облако через код на email | Ввести email, а на следующей странице – код из email | Пришел код на указанный email, переключился экран на ввод кода, после ввода кода пользователь успешно вошел в облако и видит список устройств | 
| Выйти | Нажать кнопку "Выйти" | Пользователь выходит из приложения, приложение забывает все данные пользователя и при повторном входе предлагает войти в облако | 
| Просмотреть список пылесосов | Посмотреть на то, что загрузилось после входа в облако | Отображается список пылесосов | 
| Добавить пылесос | Нажать кнопку "Добавить пылесос" | Появляются инструкции на экране, которые приводят к добавлению пылесоса в список пылесосов | 
| Массовое управление: включить все устройства | Нажать кнопку "Включить все устройства" | Все устройства включаются | 
| Массовое управление: выключить все устройства | Нажать кнопку "Выключить все устройства" | Все устройства выключаются | 
| Массовое управление: Вернуть на базу все устройства | Нажать кнопку "Вернуть на базу все устройства" | Все устройства возвращаются на базу | 
| Выбрать пылесос (открыть карточку пылесоса) | Нажать на карточку пылесоса | Открывается страничка выбранного пылесоса | 
| Удалить пылесос              | Смахнуть влево карточку пылесоса | Появляется окно подвтерждения, если нажать "Да", то пылесос удаляется из списка | 
| Переименовать пылесос       | Нажать кнопку "Переименовать пылесос" и ввести другое имя | Пылесос переименовывается на страничке пылесоса и на странице со списком пылесосов | 
| Просмотреть состояние заряда  | Посмотреть на иконку"Состояние заряда" в списке и на странице пылесоса | Отображается состояние заряда пылесоса, на обеих страницах одинаковое и примерно соответствует реальному | 
| Просмотреть состояние контейнера | Посмотреть на иконку "Состояние контейнера" в списке и на странице пылесоса | Отображается состояние контейнера пылесоса, на обеих страницах одинаковое и примерно соответствует реальному | 
| Просмотреть состояние бака         | Посмотреть на иконку "Состояние бака" в списке и на странице пылесоса | Отображается состояние бака пылесоса, на обеих страницах одинаковое и примерно соответствует реальному | 
| Просмотреть состояние статуса    | Посмотреть на иконку "Состояние статуса" в списке и на странице пылесоса | Отображается состояние статуса пылесоса, на обеих страницах одинаковое и соответствует реальному | 
| Отправить пылесос создавать карту помещения | Нажать кнопку "Настройка, а там "Создать/обновить карту помещения" | Пылесос отправляется создавать карту помещения, а по завершению приложение отображает карту помещения | 
| Настроить расписание | Нажать кнопку "Настройка", выбрать день недели и установить время уборки | Расписание сохраняется, пылесос включается в заданное время | 
| Настроить ограничение области работы по имеющейся карте помещения | Нажать кнопку "Настроить ограничение области работы", закрасить области, которые пылесос не должен посещать, включить пылесос | Ограничение области работы настраивается, пылесос избегает закрашенных мест карты и не проезжает по ним | 
| Переключить пылесос на автоматическое управление | На странице пылесоса нажать "Включить" | Пылесос начнет уборку в автоматическом режиме | 
| Переключить пылесос на ручное управление | Нажать кнопку "Ручное управление" | Пылесос переключается на ручное управление и ожидает команд от пользователя, сам не едет | 
| Управлять пылесосом с помощью джойстика | Использовать джойстик для управления пылесосом | Джойстик используется для управления пылесосом, пылесос изменяет вектор движения в соответствии с указаниями пользователя | 
| Изменить режим уборки (влажный/сухой) | Нажать кнопку "Изменить режим уборки" в ручном режиме, а затем в автоматическом | Режим уборки изменяется на влажный/сухой, пылесос подключает контейнер с водой при влажной уборке и выключает при сухой в обоих режимах | 
| Выключить пылесос | Нажать кнопку "Выключить пылесос" в ручном режиме, а затем в автоматическом | Пылесос выключается в обоих режимах | 
| Включить пылесос  | Нажать кнопку "Включить пылесос" в ручном режиме, а затем в автоматическом | Пылесос включается в обоих режимах | 
| Вернуть пылесос на базу своим ходом | Нажать кнопку "Вернуть на базу своим ходом" в ручном режиме, а затем в автоматическом | Пылесос возвращается на базу в обоих режимах |