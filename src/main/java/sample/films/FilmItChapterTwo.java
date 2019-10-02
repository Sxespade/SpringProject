package sample.films;

import org.springframework.stereotype.Component;

@Component
public class FilmItChapterTwo implements Film {
    @Override
    public String filmName() {
        return "Фильм It Chapter Two";
    }

    @Override
    public String toString() {
        return "Фильм It Chapter Two";
    }
}

