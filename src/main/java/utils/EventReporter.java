package utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.events.WebDriverListener;

public class EventReporter implements WebDriverListener {

    @Override
    public void beforeAccept(Alert alert) {
        // custom implementation goes here
        System.out.println("Clicking on"+alert.getText());
    }
}
