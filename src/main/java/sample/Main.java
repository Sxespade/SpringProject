package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        FXMLLoader loader = ctx.getBean(FXMLLoaderProvider.class).getLoader("/sample.fxml");
        Parent root = loader.load();
        primaryStage.setTitle("TODO app");
        primaryStage.setScene(new Scene(root, 600, 325));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
