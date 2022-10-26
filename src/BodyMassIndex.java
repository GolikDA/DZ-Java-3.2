public class BodyMassIndex {
    double calculate(double mass, double growth) {
        double index = mass / (growth * growth);
        return index;
    }
}
