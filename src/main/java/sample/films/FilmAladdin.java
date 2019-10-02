package sample.films;

import org.springframework.stereotype.Component;

@Component
public class FilmAladdin implements Film {
    @Override
    public String filmName() {
        return "Фильм Aladdin";
    }

    @Override
    public String toString() {
        return "Фильм Aladdin";
    }
}
