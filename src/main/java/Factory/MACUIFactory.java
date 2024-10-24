package Factory;

import Factory.component.Button.Button;
import Factory.component.Button.MACButton;
import Factory.component.Menu.MacMenu;
import Factory.component.Menu.Menu;

public class MACUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MACButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}
