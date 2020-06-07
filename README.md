# Угадай число

> Лабораторная работа

Программа после запуска генерирует случайное число.

![Запуск](https://github.com/TwistOli/Guess_the_number/blob/master/screenshots/1.%20start%20%E2%80%94%20small.jpg)

При **пустом** поле ввода программа сообщит что *строка пуста*.

![Строка пуста](https://github.com/TwistOli/Guess_the_number/blob/master/screenshots/2.%20empty%20line%20%E2%80%94%20small.jpg)

Производим следующую проверку "на дурака" и вводим что-либо кроме чисел. К примеру **1q**. 
Вывод будет следующим : *Cтрока содержит не числа или не только числа.*

![Ошибка](https://github.com/TwistOli/Guess_the_number/blob/master/screenshots/3.%20wrong%20%E2%80%94%20small.jpg)

Далее вводим любое число и видим - загаданное число меньше, чем введенное.

![Нужно число по-больше](https://github.com/TwistOli/Guess_the_number/blob/master/screenshots/4.%20more%20%E2%80%94%20small.jpg)

Подобное правило работает и для очень большого числа (*прим. скриншот ниже*).

![Нужно число по-меньше](https://github.com/TwistOli/Guess_the_number/blob/master/screenshots/5.%20less%20%E2%80%94%20small.jpg)

Как только число было угаданно мы увидим сообщение *Молодец, ты угадал число*. 
Строка ввода при этом очистится, а программа загадает новое число.

![Это победа!](https://github.com/TwistOli/Guess_the_number/blob/master/screenshots/6.%20win%20%E2%80%94%20small.jpg)

