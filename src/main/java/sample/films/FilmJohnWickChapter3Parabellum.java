package sample.films;

import org.springframework.stereotype.Component;

@Component
public class FilmJohnWickChapter3Parabellum implements Film {
    @Override
    public String filmName() {
        return "Фильм John Wick: Chapter 3 - Parabellum";
    }

    @Override
    public String toString() {
        return "Фильм John Wick: Chapter 3 - Parabellum";
    }
}
