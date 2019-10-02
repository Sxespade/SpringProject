package sample.films;

import org.springframework.stereotype.Component;

@Component
public class FilmTheAngryBirdsMovie2 implements Film {
    @Override
    public String filmName() {
        return "Мультфильм The Angry Birds Movie 2";
    }

    @Override
    public String toString() {
        return "Мультфильм The Angry Birds Movie 2";
    }

}
