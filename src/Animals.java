public abstract class Animals {

    private final String name;
    private int age;

    public Animals(String name, int age) {
        this.name = ValidationUtils.validOrDefault(name, "информация не указана");
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            this.age = Math.abs(age);
        } else {
            this.age = age;
        }
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();
}
