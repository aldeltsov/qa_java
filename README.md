# Sprint_6
***
## Обязательное задание
1. Клонировать проект.
2. Собери Maven-проект: подключи Jacoco, Mockito и JUnit.
3. Класс Lion не должен зависеть от класса Feline. Используй принцип инъекции зависимостей.
4. Напиши моки с помощью Mockito. Какие именно понадобятся — определи самостоятельно. Напиши тесты на классы Feline, Cat и Lion.
5. Подумай, где можно применить параметризацию. Реализуй параметризованные тесты.
6. Оцени покрытие с помощью Jacoco: оно должно быть не менее 100% для классов Feline, Cat и Lion.

---
Что было использовано для выполнения проекта:
- Java 11
- junit 4.13.2
- maven 3.9.9
- mockito 4.8.0
- jacoco 0.8.7

## Дополнительное задание
1. ~~Создай класс льва Алекса из мультфильма «Мадагаскар». Он будет наследником обычного льва.~~
#### Помимо обычных методов у него есть свои:
- ```getFriends() возвращает список имён его друзей — зебры Марти, бегемотихи Глории и жирафа Мелман; ```
- ```getPlaceOfLiving() возвращает место, где он живёт — Нью-Йоркский зоопарк. ```
- ```также нужно переопределить метод getKittens(), потому что у Алекса нет львят. А ещё — написать свой конструктор, так как в классе Lion нет дефолтного конструктора. Алекс самец, поэтому в конструктор класса Lion всегда будет передаваться одно и то же значение.```
2. ~~Покрой тестами созданный класс.~~