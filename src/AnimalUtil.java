import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalUtil {

    private static List<String> names = new ArrayList<>();
    private static Random random =new Random();

    static {
        names.add("Cowey");
        names.add("Alfred");
        names.add("Beth");
        names.add("Bob");
    }

    List<String> furColor= List.of("Brown","White","Spotted", "Shaded","patched");

    public String generateFurColor(){
        return furColor.get(random.nextInt(furColor.size()));
    }

    public String generateName(){
        return names.get(random.nextInt(names.size()));
    } // generate random name

   public NewBreed generateNewBreed(){
        int r= random.nextInt(3);
        switch(r){
            case 1:
                return NewBreed.Glam;
            case 2:
                return NewBreed.Halo;
            case 3:
                return NewBreed.Petty;
            case 4:
                return NewBreed.Decan;
        }
       return null;
   }
   List<Integer> muscle = List.of(10,13,17,19,25);
    public int MuscleDensity(){
        return muscle.get(random.nextInt(muscle.size()));

    }

   public int newMuscleDensity(Animal A1, Animal A2){
        return (A1.muscle_density+A2.muscle_density)/2;
   }
   public Gender generateGender(){
       int r = random.nextInt(2);
       if (r == 1) {
           return Gender.Cow;
       } else {
           return Gender.Bull;

       }
   }
}
