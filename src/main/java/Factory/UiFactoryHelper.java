package Factory;

public class UiFactoryHelper
{


    public static UIFactory getUIFactory(Platform platform) {
        switch (platform) {
            case ANDROID:
                return new AndroidUIFactory();
            case IOS:
                return new IOSUIFactory();
            case WINDOWS:
                return new WIndowsUIFactory();
            default:
                throw new IllegalArgumentException("Unknown platform: " + platform);
        }
    }
    }
