public abstract class Mammals extends Animals {

    private String habitat;
    private int speed;

    public Mammals(String name, int age, String habitat, int speed) {
        super(name, age);
        setHabitat(habitat);
        setSpeed(speed);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = ValidationUtils.validOrDefault(habitat, "информация не указана");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0) {
            this.speed = Math.abs(speed);
        } else {
            this.speed = speed;
        }
    }

    @Override
    public abstract void eat();

    @Override
    public abstract void sleep();

    @Override
    public abstract void move();


}
