# Simple-CRUD-Application
Rest приложение с реализацией функций : \
Create\
Read\
Update\
Delete\
Изначально имеется импровизированная база данных ( list"<"Person> ) \
По url:http://localhost:8081/people выводится вся импровизированная база данных, а так же имеется возможность добавить нового человека. \
По url:http://localhost:8081/people/{id} выводится информация по человеку с данным id, а так же имеется возможность отредактировать человека,удалить его ,вернуться на главное меню.\
Так же в данной программе реализована валидация форм,благодаря которой : \
нельзя ввести имя в котором количество букв меньше 2 и больше 20,\
нельзя ввести фамилию в которой количество букв меньше 2 и больше 20,\
нельзя ввести отрицательный возраст,\
емаил вводится по шаблону