public class Boss extends GameEntity {
    private Weapon weapon;


    @Override
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "boss name: " + getName() + ", boss health: " + getHealth() + ", boss damage: " +
                getDamage() + ", boss has weapon: " + getWeapon().getWeaponType();
    }
}
