package sample.cinemas;

import org.springframework.stereotype.Component;

@Component
public class ShelkovoCinemaFirst implements Cinema {
    @Override
    public String aboutCinema() {
        return null;
    }

    @Override
    public String toString() {
        return "Shelkovo Cinema First";
    }
}
