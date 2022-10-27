import java.util.Objects;

public class Herbivores extends Mammals{

    protected final String food;

    protected Herbivores(String name, int age, String habitat, int speed, String food) {
        super(name, age, habitat, speed);
        this.food = ValidationUtils.validOrDefault(food, "Пища только растительного вида.");
    }

    public String getFood() {
        return food;
    }

    public void graze() {
        System.out.println("Добывает растительную пищу на пастбищах.");
    }

    @Override
    public void eat() {
        System.out.println("Ест только растительную пищу.");
    }

    @Override
    public void sleep() {
        System.out.println("Необходим длительный ночной сон.");
    }

    @Override
    public void move() {
        System.out.println("Передвигается на 4 лапах. Имеет 4 копыта.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores that = (Herbivores) o;
        return food.equals(that.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food);
    }

    @Override
    public String toString() {
        return "Класс: Млекапотиющие. Травоядное животное. Название животного: " + getName() + ". Возраст животного: " + getAge() +
                " лет. Ареал обитания: " + habitat +
                ". Скорость перемещения: " + speed + " км/ч. Тип пищи: " + food + ".";
    }
}
