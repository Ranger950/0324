import java.util.Scanner;

public class A1113365_0324_1 {
    private static class Animal {
        private String name;
        private double height;
        private double weight;
        private double speed;

        public Animal(String name, double height, double weight, double speed) {
            this.name = name;
            this.height = height;
            this.weight = weight;
            this.speed = speed;
        }

        public void show() {
            System.out.println("Name: " + name);
            System.out.println("Height: " + height + " cm");
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Speed: " + speed + " km/h");
        }

        public double distance(int time, double acceleration) {
            return time * acceleration * speed;
        }

        public double distance(int time) {
            return time * speed;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Animal("雪寶", 1.1, 52, 100);
        animals[1] = new Animal("驢子", 99, 1.5, 200);
        animals[2] = new Animal("安那", 1.7, 48, 120);
        animals[3] = new Animal("愛沙", 1.7, 50, 120);

        for (Animal animal : animals) {
            animal.show();
        }

        Scanner scanner = new Scanner(System.in);

        for (Animal animal : animals) {
            System.out.print("Enter time (minutes) for " + animal.getName() + ": ");
            int time = scanner.nextInt();

            System.out.print("Enter acceleration for " + animal.getName() + ": ");
            double acceleration = scanner.nextDouble();

            double distance = animal.distance(time, acceleration);
            System.out.println(animal.getName() + " runs " + distance + " km.");
        }
    }
}
