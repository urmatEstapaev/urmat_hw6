public class Skeleton extends Boss {
    private int counter;


    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String printInfo() {
        return "skeleton name: " + getName() + ", skeleton health: " + getHealth() + ", skeleton damage: " +
                getDamage() + ", skeleton has weapon: " + getWeapon().getWeaponType() + ", skeleton counter of arrows: " + getCounter();

    }
}

