import java.util.Objects;

public class NonFlyBird extends Bird {

    private final String fly;

    public NonFlyBird(String name, int age, String habitat, String fly) {
        super(name, age, habitat);
        this.fly = ValidationUtils.validOrDefault(fly, "Не летает. Только ходит.");
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
        System.out.println("ходят");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NonFlyBird that = (NonFlyBird) o;
        return fly.equals(that.fly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fly);
    }

    public String toString() {
        return "Класс: Нелетающие птицы. Название животного: " + getName() + ". Возраст животного: " + getAge() +
                " лет. Ареал обитания: " + habitat + ". Тип передвижения: " + fly;
    }
}
