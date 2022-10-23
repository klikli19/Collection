package HW10.task1;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("Иванов Иван", "555-222-32");
        phonebook.put("Смирнов Сергей", "565-223-92");
        phonebook.put("Алексеев Олег", "533-297-32");
        phonebook.put("Гагин Валерий", "354-654-32");
        phonebook.put("Шиловм Тимофей", "456-222-92");
        phonebook.put("Любимова Кристина", "505-292-32");
        phonebook.put("Ухова Ксения", "530-212-32");
        phonebook.put("Зимина Вера", "566-244-32");
        phonebook.put("Дмитриев Василий", "531-211-32");
        phonebook.put("Акулова Арина", "555-222-77");
        phonebook.put("Семенова Валентина", "558-622-32");
        phonebook.put("Кузнецова Ирина", "666-254-32");
        phonebook.put("Шмелева Юлия", "995-662-32");
        phonebook.put("Раков Петр", "565-652-32");
        phonebook.put("Бизин Дмитрий", "674-222-32");
        phonebook.put("Михалев Павел", "444-001-32");
        phonebook.put("Волков Алексей", "555-223-02");
        phonebook.put("Кукушкина Марина", "354-262-32");
        phonebook.put("Чехов Антон", "555-266-32");
        phonebook.put("Тимофеева Нина", "555-222-65");
        System.out.println(phonebook.size());
        System.out.println(phonebook.get("Чехов Антон"));
        for (Map.Entry<String, String> entry: phonebook.entrySet()) {
            System.out.println(entry);
        }
    }
}
