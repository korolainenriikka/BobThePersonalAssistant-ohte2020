package bob;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BobUi extends Application {
    
    private Stage stage;
    private Scene primaryScene;
    private Scene newReminderScene;
    
    @Override
    public void init() throws Exception{
        FXMLLoader primarySceneLoader = new FXMLLoader(getClass().getResource("/fxml/primaryScene.fxml"));
        Parent primaryRoot = primarySceneLoader.load();
        PrimarySceneController primarySceneController = primarySceneLoader.getController();
        primarySceneController.setApplication(this);
        primaryScene = new Scene(primaryRoot);
        
        FXMLLoader newReminderSceneLoader = new FXMLLoader(getClass().getResource("/fxml/newReminderScene.fxml"));
        Parent newReminderSceneRoot = newReminderSceneLoader.load();
        NewReminderSceneController newReminderSceneController = newReminderSceneLoader.getController();
        newReminderSceneController.setApplication(this);
        newReminderScene = new Scene(newReminderSceneRoot);
    }

    @Override
    public void start(Stage primaryStage)  {
        this.stage = primaryStage;
        primaryStage.setScene(primaryScene);
        primaryStage.setTitle("bob the personal assistant <3");
        stage.show();
    }
    
    public void setPrimaryScene(){
        stage.setScene(primaryScene);
    }
    
    public void setNewReminderScene(){
        stage.setScene(newReminderScene);
    }
    
    public static void main(String[] args) {
        launch(BobUi.class);
    }
}