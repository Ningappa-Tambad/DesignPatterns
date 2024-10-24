package Factory;

import Factory.component.Button.Button;
import Factory.component.Button.IOSButton;
import Factory.component.Menu.IOSMenu;
import Factory.component.Menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
