import org.example.model.User;
import org.example.service.TransliterationService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransliterationServiceTest {

    @Test
    public void transliterateUserUserWithFullNames() {
        // Создаем пользователя с полным именем
        User user = new User("Анталья", "Ивановна", "Некрасова-Илларионова");

        // Вызываем метод транслитерации
        TransliterationService.transliterateUser(user);

        // Проверяем результаты транслитерации
        assertEquals("Antalya", user.getTransliteratedFirstName());
        assertEquals("Ivanovna", user.getTransliteratedMiddleName());
        assertEquals("Nekrasova-Illarionova", user.getTransliteratedLastName());
    }

    @Test
    void transliterateUserWithOnlyFirstName() {
        // Создаем пользователя только с firstName, включающим в себя все имена
        User user = new User();
        user.setFirstName("Анталья Ивановна Некрасова-Илларионова");

        // Вызываем метод транслитерации
        TransliterationService.transliterateUser(user);

        // Проверяем результаты транслитерации
        assertEquals("Antalya Ivanovna Nekrasova-Illarionova", user.getTransliteratedFirstName());
        assertEquals("", user.getTransliteratedMiddleName());  // Проверяем, что middleName остается пустым
        assertEquals("", user.getTransliteratedLastName());  // Проверяем, что lastName остается пустым
    }
}
