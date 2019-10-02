package sample.city;

import javafx.collections.ObservableList;
import sample.cinemas.Cinema;

public interface City {

    String aboutCity();

    ObservableList obsListCinema();

    ObservableList obsListFilmsFirstCinema();

    String toString();

    Cinema getCinema1();

}
