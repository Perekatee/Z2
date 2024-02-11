public class BmiService {

    public int calculate(int kilo, float metres) {

        float index;

        index = kilo / (metres * metres);
        return (int) index;

    }
}
