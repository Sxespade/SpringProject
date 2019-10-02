package sample.cinemas;

import org.springframework.stereotype.Component;

@Component
public class ShelkovoCinemaSecond implements Cinema {

    @Override
    public String aboutCinema() {
        return null;
    }

    @Override
    public String toString() {
        return "Shelkovo Cinema Second";
    }
}
