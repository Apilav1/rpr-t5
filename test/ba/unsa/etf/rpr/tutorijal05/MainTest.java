package ba.unsa.etf.rpr.tutorijal05;

import static org.junit.jupiter.api.Assertions.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

@ExtendWith(ApplicationExtension.class)
class MainTest {

    private Label display;

    @Start
    public void start (Stage stage) throws Exception {
        Parent mainNode = FXMLLoader.load(Main.class.getResource("digitron.fxml"));
        stage.setScene(new Scene(mainNode));
        stage.show();
        stage.toFront();
    }

    @Test
    public void startWithZero (FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        assertEquals("0", display.getText());
    }

    @Test
    public void numberOne (FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#button1");
        assertEquals("1", display.getText());
    }

    @Test
    public void number123 (FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#button1");
        robot.clickOn("#button2");
        robot.clickOn("#button3");
        assertEquals("123", display.getText());
    }

    @Test
    public void number123Plus456 (FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#button1");
        robot.clickOn("#button2");
        robot.clickOn("#button3");
        robot.clickOn("#plus");
        robot.clickOn("#button4");
        robot.clickOn("#button5");
        robot.clickOn("#button6");
        assertEquals("456", display.getText());
    }

    @Test
    public void number123Plus456Equals (FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#button1");
        robot.clickOn("#button2");
        robot.clickOn("#button3");
        robot.clickOn("#plus");
        robot.clickOn("#button4");
        robot.clickOn("#button5");
        robot.clickOn("#button6");
        robot.clickOn("#jednako");
        assertEquals("579.0", display.getText());
    }

    @Test
    public void dotBtn (FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#button8");
        robot.clickOn("#button8");
        robot.clickOn("#zarez");
        robot.clickOn("#button8");
        robot.clickOn("#button8");
        robot.clickOn("#plus");
        robot.clickOn("#button1");
        robot.clickOn("#jednako");
        assertEquals("89.88", display.getText());
    }

    @Test
    public void zerobtn (FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#button0");
        robot.clickOn("#button0");
        assertEquals("0", display.getText());
    }

    @Test
    public void zeroBtn2 (FxRobot robot) {
        display = robot.lookup("#display").queryAs(Label.class);
        robot.clickOn("#button0");
        robot.clickOn("#button0");
        robot.clickOn("#button1");
        robot.clickOn("#button0");
        assertEquals("10", display.getText());
    }
}