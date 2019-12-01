package pl.javastart.exercise.streams;

import java.util.List;
import static java.util.stream.Collectors.*;

public class FilteringMachine {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {

        return numberList.stream()
                .filter(number -> number % 2 == 0)
                .collect(toList());
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        return numberList.stream()
                .filter(number -> number >= 20)
                .collect(toList());
    }

    public List<Book> convertToBooks(List<String> titles) {
        return titles.stream()
                .map(Book::new)
                .collect(toList());
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        return titles.stream()
                .map(Book::new)
                .filter(book -> book.getTitle().startsWith("Gra"))
                .collect(toList());
    }
}
