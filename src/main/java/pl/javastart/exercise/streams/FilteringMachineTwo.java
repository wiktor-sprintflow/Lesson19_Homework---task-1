package pl.javastart.exercise.streams;

import java.util.List;
import static java.util.stream.Collectors.*;

public class FilteringMachineTwo {

    private static final String NICKNAME_TEMPLATE = "%s_%s";

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        return ppl.stream()
                .filter(person -> person.getAge() < 18)
                .map(Person::getName)
                .collect(toList());
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        return people.stream()
                .map(person -> new User(person.getName(), person.getAge(), String.format(NICKNAME_TEMPLATE, person.getName(), person.getAge())))
                .collect(toList());
    }
}
