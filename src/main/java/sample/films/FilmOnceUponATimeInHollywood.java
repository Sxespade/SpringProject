package sample.films;

import org.springframework.stereotype.Component;

@Component
public class FilmOnceUponATimeInHollywood implements Film {
    @Override
    public String filmName() {
        return "Фильм Once Upon a Time... in Hollywood";
    }

    @Override
    public String toString() {
        return "Фильм Once Upon a Time... in Hollywood";
    }
}
