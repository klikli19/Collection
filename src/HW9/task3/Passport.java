package HW9.task3;

import java.util.*;

public class Passport {
    private String name;
    private String patronymic;
    private String surname;
    private String dateOfBirth;
    private Integer numberOfPassport;


    public Passport(String name, String patronymic, String surname, String dateOfBirth, Integer numberOfPassport) throws PassportException {
        setName(name);
        this.patronymic = patronymic;
        setSurname(surname);
        if (dateOfBirth == null || dateOfBirth.isBlank()) {
            throw new PassportException("Не указаны данные");
        } else {
            this.dateOfBirth = dateOfBirth;
        }
        if (numberOfPassport == null || numberOfPassport < 0) {
            throw new PassportException("Не указаны данные");
        } else {
            this.numberOfPassport = numberOfPassport;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws PassportException {
        if (name == null || name.isBlank()) {
            throw new PassportException("Не указаны данные");
        } else {
            this.name = name;
        }
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws PassportException {
        if (surname == null || surname.isBlank()) {
            throw new PassportException("Не указаны данные");
        } else {
            this.surname = surname;
        }
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Integer getNumberOfPassport() {
        return numberOfPassport;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNumberOfPassport(Integer numberOfPassport) {
        this.numberOfPassport = numberOfPassport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(name, passport.name) && Objects.equals(patronymic, passport.patronymic) &&
                Objects.equals(surname, passport.surname) && Objects.equals(dateOfBirth, passport.dateOfBirth) &&
                Objects.equals(numberOfPassport, passport.numberOfPassport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, patronymic, surname, dateOfBirth, numberOfPassport);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", numberOfPassport=" + numberOfPassport +
                '}' + "\n";
    }
}
