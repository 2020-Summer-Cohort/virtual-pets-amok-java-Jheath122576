package pets_amok;

public abstract OrganicClass extends VirtualPet {

public abstract class OrganicPet extends VirtualPet {

    private Integer hunger;
    private Integer thirst;
    protected Integer waste;

    public OrganicPet(String petName, Integer health, Integer happiness, Integer hunger, Integer thirst, Integer waste) {
        super(petName, health, happiness);
        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;
    }

    public Integer getHunger() {
        return hunger;
    }

    public Integer getThirst() {
        return thirst;
    }

    public Integer getWaste() {
        return waste;
    }

    public void feedPet() {
        hunger = hunger - 5;
        happiness++;
        waste++;
        health++;
    }

    public void givePetWater() {
        thirst = thirst - 3;
        waste++;
        happiness++;
        health++;
    }

    @Override
    public void playWithPet() {
        super.playWithPet();
        hunger++;
        thirst++;
        health++;
    }

    @Override
    protected boolean needsAreHigh() {
        return getHunger() < 50 && getThirst() < 50 && getWaste() < 50 && super.needAreHigh();


    }

    public void givePottyBreak() {
        waste = waste - 2;
        happiness++;
        health++;
    }

    public void tick() {
        hunger++;
        thirst++;
        waste++;
        super.tick();
    }

}
