public class BmiService {

    public float calculate(int kilo, float metres) {

        float index;

        index = kilo / (metres * metres);
        return (int) index;

    }
}
