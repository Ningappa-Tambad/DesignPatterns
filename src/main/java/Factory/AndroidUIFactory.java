package Factory;

import Factory.component.Button.AndroidButton;
import Factory.component.Button.Button;
import Factory.component.Menu.AndroidMenu;
import Factory.component.Menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
