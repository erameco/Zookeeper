class Bat extends Mammal {
    public Bat() {
        energyLevel = 300;
    }

    public void eatHumans() {
    System.out.println("so- well, never mind");
    energyLevel += 25;

    }

    public void attackTown() {
        System.out.println("Fireeeeeeee");
        energyLevel += 100;
    }

    public void Fly() {
        System.out.println("kra kra kra");
        energyLevel -= 50;
    }

}
