package HW9.task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws PassportException {
        Passport vova = new Passport("Владимир", "Сергеевич", "Сергеев",  "07.10.1990", 124444);
        Passport ivan = new Passport("Иван", "Васильевич", "Иванов",  "01.01.1970", 165452);
        Passport dima = new Passport("Дмитрий", "Петрович", "Рогов",  "08.03.1992", 122442);
        Passport masha = new Passport("Мария", "Дмитриевна", "Орлова",  "16.05.1985", 126877);
        Passport kira = new Passport("Кира", "Ильинична", "Новикова",  "24.12.1991", 124444);

        PassportDateBase base1 = new PassportDateBase();
        base1.savePassport(vova);
        base1.savePassport(dima);
        base1.savePassport(kira);
        System.out.println(base1);

        base1.searchPassport(165452);



    }

}
