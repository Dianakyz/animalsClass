public class Predators extends Mammals{

    protected final String food;

    protected Predators(String name, int age, String habitat, int speed, String food) {
        super(name, age, habitat, speed);
        this.food = ValidationUtils.validOrDefault(food, "Пища только животного происхождения.");
    }

    public String getFood() {
        return food;
    }

    public void hunt(){
        System.out.println("Добывает пищу путем охоты на других животных.");
    };

    @Override
    public void eat() {
        System.out.println("Ест пищу только животного происхождения.");
    }

    @Override
    public void sleep() {
        System.out.println("Необходим сон. Иногда могут охотиться по ночам, а спать днем.");
    }

    @Override
    public void move() {
        System.out.println("Ходит на 4 лапах. Быстрый и тихий.");
    }

    public String toString() {
        return "Класс: Млекапотиющие. Хищное животное.Название животного: " + getName() + ". Возраст животного: " + getAge() +
                " лет. Ареал обитания: " + habitat +
                ". Скорость перемещения: " + speed + " км/ч. Тип пищи: " + food + ".";
    }
}
