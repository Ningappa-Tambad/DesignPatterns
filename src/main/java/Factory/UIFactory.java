package Factory;

import Factory.component.Button.Button;
import Factory.component.Menu.Menu;

public interface UIFactory {


    //Factory Methods
    Button createButton();  //Return object of coresponding button

    Menu createMenu(); //Return object of coresponding menu
}
