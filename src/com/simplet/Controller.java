package com.simplet;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.awt.event.ActionEvent;

public class Controller {

    @FXML Label close;

    @FXML
    public void close(){
        Main.mainStage.close();
    }

    @FXML
    void handleMouseEnterEvent(MouseEvent event){
        if(event.getSource().equals(close)){
            close.setStyle("-fx-text-fill : #FF0000");
            return;
        }

        ((Label) event.getSource()).setStyle("-fx-text-fill : #f6b603");
        ((Label) event.getSource()).getGraphic().setStyle("-fx-fill : #f6b603");
    }

    @FXML
    void handleMouseExitEvent(MouseEvent event){
        if(event.getSource().equals(close)){
            close.setStyle("-fx-text-fill : #FE8C23");
            return;
        }

        ((Label) event.getSource()).setStyle("-fx-text-fill : #727797");
        ((Label) event.getSource()).getGraphic().setStyle("-fx-fill : #727797");
    }


}
