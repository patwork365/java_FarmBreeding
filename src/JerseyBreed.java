import java.util.Random;

public class JerseyBreed extends Animal{


    private Gender gender;
    private String furColor;
    private int milk_quality;  // I want milk quantity only for gender=cow
    private int muscle_density;
    private String name;

    public JerseyBreed(Gender gender, String furColor, int milk_quality, int muscle_density, String name) {
        super(gender, furColor, milk_quality, muscle_density, name);
        this.gender = gender;
        this.furColor = furColor;
        this.milk_quality = milk_quality;
        this.muscle_density = muscle_density;
        this.name = name;
    }

    @Override
    public String toString() {
        return "JerseyBreed{" +
                "gender=" + gender +
                ", furColor='" + furColor + '\'' +
                ", milk_quality=" + milk_quality +
                ", muscle_density=" + muscle_density +
                ", name='" + name + '\'' +
                '}';
    }
}