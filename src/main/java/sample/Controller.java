package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import sample.cinemas.Cinema;
import sample.city.City;
import sample.films.Film;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class Controller implements Initializable {

    @FXML
    TextField txt;

    @FXML
    private ListView<Cinema> obsCinemas;

    @FXML
    private ListView<Film> obsFilms;

    @FXML
    private ComboBox<City> btnCombo;

    Repository repository;

    private City city;

    private City city2;

    private ObservableList obsCity = FXCollections.observableArrayList();



    @Autowired
    public void setCity(@Qualifier("korolev") City city) {
        this.city = city;
    }

    @Autowired
    public void setCity2(@Qualifier("shelkovo") City city2) {
        this.city2 = city2;
    }

    @Autowired
    public void setRepository(Repository repository) {
        this.repository = repository;
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

            obsCity.add(city);
            obsCity.add(city2);
            btnCombo.setItems(obsCity);
        System.out.println(city.getCinema1());


        btnCombo.setOnAction((EventHandler) ->{
            if (btnCombo.getValue() == obsCity.get(0)) {
                korolevSelect();
            }
            if (btnCombo.getValue() == obsCity.get(1)) {
                shelkovoSelect();
            }
        });

    }

    void korolevSelect() {
        obsCinemas.setItems(city.obsListCinema());
        obsFilms.setItems(city.obsListFilmsFirstCinema());
        txt.setText(city.aboutCity());
    }

    void shelkovoSelect() {
        obsCinemas.setItems(city2.obsListCinema());
        obsFilms.setItems(city2.obsListFilmsFirstCinema());
        txt.setText(city2.aboutCity());
    }

}
