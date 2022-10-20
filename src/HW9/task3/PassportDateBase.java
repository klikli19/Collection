package HW9.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PassportDateBase {
    private final List<Passport> passportList = new ArrayList<>();

    public void savePassport(Passport passport) throws PassportException {
        Passport passport1 = searchPassport(passport.getNumberOfPassport());
        if (passport1 == null) {
            passportList.add(passport);
        } else {
            passport1.setSurname(passport.getSurname());
            passport1.setName(passport.getName());
            passport1.setPatronymic(passport.getPatronymic());
            passport1.setDateOfBirth(passport.getDateOfBirth());
        }
    }


    public Passport searchPassport(int number) {
        for (Passport passport : passportList) {
            if (passport.getNumberOfPassport().equals(number)) {
                return passport;
            }
        }
        return null;
    }



    @Override
    public String toString() {
        return "PassportDateBase{" +
                "passportList=" + passportList +
                '}';
    }
}
