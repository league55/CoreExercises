package patterns.MVC;

import java.util.Scanner;

/**
 *
 */
public class Controller {
    View view;
    Model model;

    public Controller(){
        this.view = new View();
        this.model = new Model();

        Scanner sc = new Scanner(System.in);
        model.setTheString(sc.nextLine());
        view.show(model.changeString());

    }
}
