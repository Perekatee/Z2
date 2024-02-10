public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kilo = 98;
        float metres = 1.87f;
        float index = service.calculate(kilo, metres);
        System.out.println(index);

    }
}