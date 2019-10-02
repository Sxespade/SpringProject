package sample.films;

import org.springframework.stereotype.Component;

@Component
public class FilmTheLionKing implements Film {
    @Override
    public String filmName() {
        return "Фильм the Lion King";
    }

    @Override
    public String toString() {
        return "Фильм the Lion King";
    }
}
