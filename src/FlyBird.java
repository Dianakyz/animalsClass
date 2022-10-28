import java.util.Objects;

public class FlyBird extends Bird {

    protected final String fly;
    protected FlyBird(String name, int age, String habitat, String fly) {
        super(name, age, habitat);
        this.fly = ValidationUtils.validOrDefault(fly, "Летает");
    }

    public String getFly() {
        return fly;
    }

    public void eat() {
        System.out.println("Едят червяков, жуков и себе подобных.");
    }

    @Override
    public void sleep() {
        System.out.println("Сон необходим. Есть ночные, есть дневные птицы.");
    }

    @Override
    public void move() {
        System.out.println("Летают и ходят");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlyBird flyBird = (FlyBird) o;
        return fly.equals(flyBird.fly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fly);
    }

    public String toString() {
        return "Класс: Летающие птицы. Название животного: " + getName() + ". Возраст животного: " + getAge() +
                " лет. Ареал обитания: " + habitat + ". Тип передвижения: " + fly;
    }
}
