package Strategy;

public class WalkPathCalculator implements PathCalculator {

    @Override
    public void findPath(String source, String destination) {

        System.out.println("Path via walk from "+source+ " to " +destination);
    }
}
