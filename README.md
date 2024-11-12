# Calculator
Задача. Консольное приложение “Калькулятор”
Описание: Приложение должно читать из консоли введенные пользователем строки, числа, арифметические операции, проводимые между ними и выводить в консоль результат их выполнения.
Реализуйте класс Main с методом public static String calc(String input). Метод должен принимать строку с арифметическим выражением между двумя числами и возвращать строку с результатом их выполнения. Вы можете добавлять свои импорты, классы и методы. 
Добавленные классы не должны иметь модификаторы доступа (public или другие).
Требования:
Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. Данные передаются в одну строку (смотрите пример)! Решения, в которых каждое число и арифметическая операция передаются с новой строки считаются неверными.
Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.
Калькулятор умеет работать только с целыми числами.
При вводе пользователем неподходящих чисел приложение выводит исключение и завершает свою работу.
При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выводит исключение и завершает свою работу.
Результатом операции деления является целое число, остаток отбрасывается. 
Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль.


Пример работы программы:
Input: 1 + 2
Output: 3
Input: 1
Output: throws Exception //т.к. строка не является математической операцией
Input: 1 + 2 1
Output: throws Exception 
Input: 1 + 2 + 3
Output: throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)


Список материалов для решения задачи
Чтобы не терять время на изучение лишней информации мы подготовили для Вас список материалов по темам, которые необходимо изучить для выполнения Тестового задания. 
1. Основы синтаксиса Java: классы, объекты, методы, типы данных Java для начинающих
Переменные. Примитивные типы данных Java для начинающих
Java для начинающих. Методы в Java
Java для начинающих. Тип возвращаемого значения метода
2. Арифметические операции в Java
Java для начинающих. Арифметические операции
3. Класс String, работа со строками. Преобразование строки в число
Строки(String). Ссылочные типы данных
Класс String и его методы
4. Циклы в Java, работа с массивами
Массивы в Java
Цикл for each, Массивы строк
Параметры метода
5. Условные операторы, сравнение, switch case
Оператор switch
Условный оператор if
6. Работа с исключениями в Java (дополнительно)
Исключения (часть 1). Обработка исключений
Исключения (часть 2). Выбрасывание исключений








Рекомендация
Если что-то не работает, горит красным и тд. попробуйте пройтись по коду медленно и вдумчиво, возможно проблема в лишней/недостающей скобке или точке с запятой. 
Также для отладки приложения и нахождения проблемных мест,
в среде разработки IntelliJ IDEA предусмотрен режим debug. Смотреть видео


Как отправить решение ?
Вам необходимо создать себе аккаунт на GitHub, создать репозиторий и загрузить в него своё решение.
Инструкция по работе с git и GitHub. Читать
Далее, необходимо отправить ссылку на репозиторий с Вашим заданием на нашу почту java@edme.pro 
Тема письма — “ТЗ Java”. 
Тело письма:
Ваше ФИО
Ссылка на Ваш репозиторий (проверьте, что по ссылке открывается решённое задание и оно соответствует требованиям и примерам)
