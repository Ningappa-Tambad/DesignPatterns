package Factory;

import Factory.component.Button.Button;
import Factory.component.Button.WindowsButton;
import Factory.component.Menu.Menu;
import Factory.component.Menu.WindowsMenu;

public class WIndowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
