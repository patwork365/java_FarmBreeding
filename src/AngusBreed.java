import java.util.Random;

public class AngusBreed extends Animal {

     private String HornType;  //can this be a new parameter ??


    public AngusBreed(Gender gender, String furColor, int milk_quality, int muscle_density, String name,String hornType) {
        super(gender, furColor, milk_quality, muscle_density, name);
    }


    // Can i setup the gender in the constructor itself
//    @Override
//    public Gender setGender() {
//        Random random = new Random();
//        int r = random.nextInt(2);
//
//        System.out.println(r);
//        if (r == 1) {
//            this.gender= Gender.Cow;
//        } else {
//            this.gender= Gender.Bull;
//
//        }
//         return gender;
//    }

    @Override
    public String toString() {
        return "AngusBreed{" +
                "gender='" + gender + '\'' +
                ", furColor='" + furColor + '\'' +
                ", milk_quality=" + milk_quality +
                ", muscle_density=" + muscle_density +
                ", name='" + name + '\'' +
                '}';
    }
}