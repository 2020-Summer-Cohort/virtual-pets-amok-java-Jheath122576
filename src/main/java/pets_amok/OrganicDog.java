package pets_amok;

public class OrganicDogg extends OrganicClass {
    private int happiness;
    private int health;
    private int boredem;

    public OrganicDogg(String name, String description) {
        super(name, description);
        this.cleanDogCage = 3;
    }

    private int cleanDogCage;

    public int getCleanDogCage() {
    return cleanDogCage;
    }

    public void walkDog() {
        happiness ++;
        health ++;
        cleanDogCage --;
        boredem--;

        public void cleanCage() {
        cleanDogCage -= 3;
        happiness += 3;
        health += 3;

        public void dogTick() {
            tick();
            cleanDogCage++;

        }
    }

}
