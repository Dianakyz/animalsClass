public class Main {
    public static void main(String[] args) {
        Herbivores gazel = new Herbivores("Газель", 2, "Саванна", 50, null);
        Herbivores giraf = new Herbivores("Жираф", -3, "Саванна", 30, null);
        Herbivores horse = new Herbivores("Лошадь", 7, "Повсеместно", 80, null);

        Predators geena = new Predators("Гиена", 5, "Саванна", 80, null);
        Predators tigr = new Predators("Тигр", 8, "Россия", 90, null);
        Predators bear = new Predators("Медведь", -10, "Россия", 40, null);

        Amphibians frog = new Amphibians("Лягушка", 1, "Повсеместно");
        Amphibians ush = new Amphibians("Уж пресноводный", -4, "Россия");

        FlyBird chaika = new FlyBird("Чайка", 3, "Прибрежные зоны", null);
        FlyBird albatros = new FlyBird("Альбатрос", 7, "Север", null);
        FlyBird sokol = new FlyBird("Сокол", 1, "Северная широта", null);

        NonFlyBird pavlin = new NonFlyBird("Павлин", 3, "Южные широты", null);
        NonFlyBird pingvin = new NonFlyBird("Пингвин", 7, "Антарктика", null);
        NonFlyBird dodo = new NonFlyBird("Птица Додо", 100, null, null);

        System.out.println(gazel);
        System.out.println(giraf);
        System.out.println(horse);
        System.out.println(geena);
        System.out.println(tigr);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(ush);
        System.out.println(chaika);
        System.out.println(albatros);
        System.out.println(sokol);
        System.out.println(pavlin);
        System.out.println(pingvin);
        System.out.println(dodo);

    }
}