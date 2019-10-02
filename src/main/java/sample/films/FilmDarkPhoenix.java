package sample.films;

import org.springframework.stereotype.Component;

@Component
public class FilmDarkPhoenix implements Film {
    @Override
    public String filmName() {
        return "Фильм Dark Phoenix";
    }

    @Override
    public String toString() {
        return "Фильм Dark Phoenix";
    }
}
