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
       if(platform.equals(platform.ANDROID))
       {
           return new AndroidUIFactory();
       }
       else if (platform.equals(Platform.IOS))
       {
           return new IOSUIFactory();
       }
       else if (platform.equals(Platform.MAC))
       {
          return new MACUIFactory();
       }
       else if(platform.equals(Platform.WINDOWS))
       {
           return new WIndowsUIFactory();
       }
       return null;




    }


}
