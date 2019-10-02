package sample.cinemas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import sample.films.Film;

@Component
public class KorolevCinemaFirst implements Cinema {

    Film filmAladdin;

    private String nameCinema = "KorolevCinemaFirst";

    @Override
    public String aboutCinema() {
        return "В кинотеатре " + nameCinema + " идут следующие фильмы: ";
    }

    @Override
    public String toString() {
        return "Korolev Cinema First";
    }

    @Autowired
    @Qualifier("filmAladdin")
    public void setFilmAladdin(Film filmAladdin) {
        this.filmAladdin = filmAladdin;
    }
}
