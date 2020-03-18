package bob;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class NewReminderSceneController implements Initializable{
    private BobUi application;
    
    public void setApplication(BobUi application){
        this.application = application;
    }
    
    @FXML
    private Button palaa;
    private Button lisää;
    
    @FXML
    private void handleSetPrimaryScene(){
        application.setPrimaryScene();
    }
    
    @FXML
    private void handleNewReminder(){
        application.setPrimaryScene();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // sk i p
    }
    
}
