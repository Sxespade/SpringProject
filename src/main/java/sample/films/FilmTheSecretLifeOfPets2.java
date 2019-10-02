package sample.films;

import org.springframework.stereotype.Component;

@Component
public class FilmTheSecretLifeOfPets2 implements Film {
    @Override
    public String filmName() {
        return "Мультфильм The Secret Life of Pets 2";
    }

    @Override
    public String toString() {
        return "Мультфильм The Secret Life of Pets 2";
    }
}
