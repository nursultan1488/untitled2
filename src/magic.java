public class magic extends Hero {
    public magic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил супер способность " + getSuperAbilityType());
    }
}



