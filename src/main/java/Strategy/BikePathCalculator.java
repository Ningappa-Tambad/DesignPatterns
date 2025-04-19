package Strategy;

public class BikePathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String destination) {


        System.out.println("Path via bike from " + source + " to " + destination);
    }
}
