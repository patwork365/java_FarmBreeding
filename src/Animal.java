import java.util.Random;

public abstract class Animal {

    public Gender gender; // from the class Gender only Cow or Bull
    public String furColor; // will generate random from ArrayList
    public int milk_quality;
    public int muscle_density;
    public String name;  // will generate from ArrayList

    public Animal(Gender gender, String furColor, int milk_quality, int muscle_density, String name) {
        this.gender = gender;
        this.furColor = furColor;
        this.milk_quality = milk_quality;
        this.muscle_density = muscle_density;
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

//    public void setGender(Gender gender) {this.gender = gender; }


    public Gender setGender() {
        Random random = new Random();
        int r = random.nextInt(2);

        System.out.println(r);
        if (r == 1) {
            this.gender= Gender.Cow;
        } else {
            this.gender= Gender.Bull;

        }
        return gender;
    }
    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getMilk_quality() {
        return milk_quality;
    }

    public void setMilk_quality(int milk_quality) {
        this.milk_quality = milk_quality;
    }

    public int getMuscle_density() {
        return muscle_density;
    }

    public void setMuscle_density(int muscle_density) {
        this.muscle_density = muscle_density;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}