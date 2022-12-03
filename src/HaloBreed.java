public class HaloBreed extends Animal implements Produce{

    int lifeExpectancy;

    public HaloBreed(Gender gender, String furColor, int milk_quality, int muscle_density, String name) {
        super(gender, furColor, milk_quality, muscle_density, name);
    }

    @Override
    public void produceMeat() {
        int meatQty=10;
        System.out.println(" Meat produced is " + meatQty + "  pounds");
    }

    @Override
    public void produceMilk() {
        int milkQty=15;
        System.out.println(" Milk produced is " + milkQty + "  liters");
    }
    public int getLifeExpectancy() {
        return lifeExpectancy;
    }
    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = 12;
    }

    @Override
    public String toString() {
        return "HaloBreed{" +
                "gender=" + gender +
                ", furColor='" + furColor + '\'' +
                ", milk_quality=" + milk_quality +
                ", muscle_density=" + muscle_density +
                ", name='" + name + '\'' +
                '}';
    }
}
