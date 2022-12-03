import java.util.Random;

public class AryShireBreed extends Animal{


        public AryShireBreed(Gender gender, String furColor, int milk_quality, int muscle_density, String name) {
            super(gender, furColor, milk_quality, muscle_density, name);
        }

        @Override
        public Gender getGender() {
            return gender;
        }
        // Can i setup the gender in the constructor itself
        @Override
        public Gender setGender() {
            Random random = new Random();
            int r = random.nextInt(2);
            if (r == 1) {
                this.gender= Gender.Cow;
            } else {
                this.gender= Gender.Bull;

            }
           return gender;
        }


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