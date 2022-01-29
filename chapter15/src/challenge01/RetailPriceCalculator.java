package challenge01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.text.TableView;
import java.awt.*;
import java.text.DecimalFormat;

public class RetailPriceCalculator extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        DecimalFormat df = new DecimalFormat("#,###.00");


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_RIGHT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));


        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 3, 1);


        grid.setStyle("-fx-background-color:white");

        Label userName = new Label("Wholesale:");
        grid.add(userName, 0, 1);

        TextField wt = new TextField();
        grid.add(wt, 1, 1);

        Label pw = new Label("Markup:");
        grid.add(pw, 0, 2);

        TextField mt = new TextField();
        grid.add(mt, 1, 2);


        // button
        Button btn = new Button("Calculate");
        HBox hbBtn = new HBox(10);

        Label result = new Label("");

        hbBtn.setAlignment(Pos.BOTTOM_LEFT);
        hbBtn.getChildren().add(btn);
        hbBtn.getChildren().add(result);

        btn.setOnAction(e-> {

            double wholesale_price = Double.parseDouble(wt.getText().toString());
            double markup = Double.parseDouble(mt.getText().toString());

            markup = markup/100;

            double retail_price = wholesale_price + (wholesale_price * markup);

            result.setText("$"+df.format(retail_price));
        });

        grid.add(hbBtn, 1, 4);
        Scene scene = new Scene(grid, 300, 250);
        primaryStage.setTitle("Retail Price Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}

