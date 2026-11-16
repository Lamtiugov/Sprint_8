package ru.yandex.praktikum;

public class Account {
    private String name;
    private boolean isValid;

    public Account(String name) {
        this.name = name;
        isValid = checkNameToEmboss(name);
    }

    public Account() {}

    public boolean checkNameToEmboss(String name) {
        this.name = name;

        // null не подходит
        if (name == null) {
            return false;
        }

        int length = name.length();

        // Длина должна быть от 3 до 19 включительно
        if (length < 3 || length > 19) {
            return false;
        }

        // Подсчитаем количество пробелов
        int spaceCount = 0;

        for (char c : name.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        // Должен быть ровно один пробел
        if (spaceCount != 1) {
            return false;
        }

        // Пробел не должен быть в начале или в конце
        if (name.startsWith(" ") || name.endsWith(" ")) {
            return false;
        }

        return true;
    }
}