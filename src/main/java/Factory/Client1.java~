package Factory;

import Factory.component.Button.Button;
import Factory.component.Menu.Menu;

public class Client1
{
    public static void main(String[] args) {

        Flutter flutter = new Flutter();

        //From flutter, we should be able to get the factory based on platform

        UIFactory uiFactory= flutter.getUIFactory(Platform.ANDROID);

        Button button=uiFactory.createButton();
        button.displayButton();

        Menu menu=uiFactory.createMenu();
        menu.displayMenu();
    }
}
