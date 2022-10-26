        public class Main {
            public static void main(String[] args) {
                BodyMassIndex service = new BodyMassIndex();
                double mass = 70; //вес в кг
                double growth = 1.78; //рост в метрах
                double index = service.calculate(mass,growth);
                System.out.println(index);
            }

        }