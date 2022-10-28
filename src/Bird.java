public abstract class Bird extends Animals {

    public String habitat;
    protected Bird(String name, int age, String habitat) {
        super(name, age);
        setHabitat(habitat);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = ValidationUtils.validOrDefault(habitat, "информация не указана");
    }

    @Override
    public void eat() {
        System.out.println("Едят червяков, жуков и себе подобных.");
    }

    @Override
    public void sleep() {
        System.out.println("Сон необходим. Есть ночные, есть дневные птицы.");
    }

    @Override
    public void move() {
        System.out.println("Летают/не летают или ходят");
    }
}
