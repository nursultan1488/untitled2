public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];
        heroes[0] = new magic(100, 20, "FIREBALL");
        heroes[1] = new Medic(80, 10, "HEALING", 50);
        heroes[2] = new Warrior(120, 30, "CRITICAL DAMAGE");

        for (Hero hero : heroes) {
            hero.applySuperAbility();

            // Если герой является медиком, увеличиваем его опыт
            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
            }
        }
    }
}
