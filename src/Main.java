public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setName("David");
        boss.setHealth(100);
        boss.setDamage(40);
        Weapon weapon = new Weapon();
        weapon.setWeaponType(WeaponType.FIREARM);
        boss.setWeapon(weapon);
        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setName("Robert");
        skeleton1.setHealth(90);
        skeleton1.setDamage(20);
        skeleton1.setCounter(70);
        weapon.setWeaponType(WeaponType.COLD_WEAPON);
        skeleton1.setWeapon(weapon);
        System.out.println(skeleton1.printInfo());

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setName("Urmat");
        skeleton2.setHealth(150);
        skeleton2.setDamage(30);
        skeleton2.setCounter(80);
        weapon.setWeaponType(WeaponType.CHEMICAL_WEAPON);
        skeleton2.setWeapon(weapon);
        System.out.println(skeleton2.printInfo());

    }
}
