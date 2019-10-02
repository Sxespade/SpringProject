package sample.city;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import sample.cinemas.Cinema;
import sample.films.Film;

@Component
public class Korolev implements City {

    private String str = "Королёв";
    private int countCinemas;
    private int countFilms;
    private Cinema cinema1;
    private Cinema cinema2;
    private Film film1;
    private Film film2;
    private Film film3;
    private Film film4;
    private ObservableList obsFilms;


    @Override
    public String aboutCity() {
        return "В городе " + str + ": " + countCinemas + " кинотетра(ов).\n В которых идёт " + countFilms + " фильма(ов): ";
    }

    @Autowired
    @Qualifier("korolevCinemaFirst")
    public void setCinema1(Cinema cinema1) {
        this.cinema1 = cinema1;
    }

    @Autowired
    @Qualifier("korolevCinemaSecond")
    public void setCinema2(Cinema cinema2) {
        this.cinema2 = cinema2;
    }

    public Cinema getCinema1() {
        return cinema1;
    }

    public Cinema getCinema2() {
        return cinema2;
    }

    @Override
    public ObservableList obsListCinema() {
        ObservableList obs = FXCollections.observableArrayList();
        obs.add(cinema1);
        obs.add(cinema2);
        countCinemas = obs.size();
        return obs;
    }

    @Autowired
    @Qualifier("filmOnceUponATimeInHollywood")
    public void setFilm1(Film film1) {
        this.film1 = film1;
    }

    @Autowired
    @Qualifier("filmJohnWickChapter3Parabellum")
    public void setFilm2(Film film2) {
        this.film2 = film2;
    }

    @Autowired
    @Qualifier("filmAladdin")
    public void setFilm3(Film film3) {
        this.film3 = film3;
    }

    @Autowired
    @Qualifier("filmTheAngryBirdsMovie2")
    public void setFilm4(Film film4) {
        this.film4 = film4;
    }

    @Override
    public ObservableList obsListFilmsFirstCinema() {
        ObservableList obs = FXCollections.observableArrayList();
        obs.add(film1);
        obs.add(film2);
        obs.add(film3);
        obs.add(film4);
        this.countFilms = obs.size();
        this.obsFilms = obs;
        return obs;
    }

    @Override
    public String toString() {
        return "Korolev";
    }
}
