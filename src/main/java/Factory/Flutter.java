package Factory;

public class Flutter {


    //Non factory methods
   void refreshUi()
   {
       System.out.println("Refresh UI");
   }
   void setTheme()
   {
       System.out.println("Set theme");
   }

//Factory menthod to get the objet of coresponding UI factory

    public UIFactory getUIFactory(Platform platform)
    {
        return UiFactoryHelper.getUIFactory(platform);
    }


}
