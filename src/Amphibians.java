import java.util.Objects;

public class Amphibians extends Animals{

    private String habitat;

    public Amphibians(String name, int age, String habitat) {
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
    public void eat(){
        System.out.println("Земноводные едят себе подобных?");
    };

    @Override
    public void sleep(){
        System.out.println("Спят в движении");
    };

    @Override
    public void move(){
        System.out.println("Ползают, плавают.");
    };

    public void hunt() {
        System.out.println("Земноводные охотяться в воде.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians that = (Amphibians) o;
        return habitat.equals(that.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat);
    }

    public String toString() {
        return "Класс: Земноводные. Название животного: " + getName() + ". Возраст животного: " + getAge() +
                " лет. Ареал обитания: " + habitat + ".";
    }
}
