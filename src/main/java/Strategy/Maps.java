package Strategy;

import javax.print.attribute.standard.Destination;
import javax.xml.transform.Source;

public class Maps {

    public void findPath(String source,String destination,Mode mode)
    {
        PathCalculator pathCalculator=PathCalculatorFactory.getPathCalculator(mode);
        pathCalculator.findPath(source, destination);
    }
}
