package org.example.service;

import org.example.model.User;


public class TransliterationService {

    public static void transliterateUser(User user) {
        String fullName;

        //Проверяем заполнены ли фамилия и отчество
        boolean isHaveMiddleAndLastNames = !user.getMiddleName().isEmpty() && !user.getLastName().isEmpty();

        //Получаем полное имя
        if (isHaveMiddleAndLastNames) {
            fullName = user.getFirstName() + " " + user.getMiddleName() + " " + user.getLastName();
        } else {
            fullName = user.getFirstName();
        }

        //Получаем транслитерацию с помощью сервиса
        String transliteratedFullName = Transliteration.transliterate(fullName);

        //Присваиваем транслитерации юзернеймов в соответсвующие поля, в зависимости от того как первоночально были заполнены имена у юзера
        if (isHaveMiddleAndLastNames) {
            String[] transliteratedNames = transliteratedFullName.split(" ");
            user.setTransliteratedFirstName(transliteratedNames[0]);
            user.setTransliteratedMiddleName(transliteratedNames[1]);
            user.setTransliteratedLastName(transliteratedNames[2]);
        } else {
            user.setTransliteratedFirstName(transliteratedFullName);
            user.setTransliteratedMiddleName("");
            user.setTransliteratedLastName("");
        }
    }
}
