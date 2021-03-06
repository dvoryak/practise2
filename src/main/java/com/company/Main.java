package main.java.com.company;

import main.java.com.company.controller.MainController;
import main.java.com.company.service.FillerBookStorage;
import main.java.com.company.view.BookView;

public class Main {

    public static void main(String[] args) {
        FillerBookStorage filler = new FillerBookStorage();
        filler.fill();
        BookView view = new BookView();
        MainController controller = new MainController(view);
        view.setController(controller);
        controller.run();
    }
}
