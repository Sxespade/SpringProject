package sample.cinemas;

import org.springframework.stereotype.Component;

@Component
public class KorolevCinemaSecond implements Cinema {
    @Override
    public String aboutCinema() {
        return null;
    }

    @Override
    public String toString() {
        return "Korolev Cinema Second";
    }
}
