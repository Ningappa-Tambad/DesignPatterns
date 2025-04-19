package Strategy;

public class CarPathCalculator implements PathCalculator
{

    @Override
    public void findPath(String source, String destination) {

        System.out.println("Path via car from " +source+ " to "+destination);
    }
}
