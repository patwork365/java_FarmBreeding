public class Main {
    public static void main(String[] args) {


        AnimalUtil animalUtil=new AnimalUtil();
        AngusBreed angusBreed =new AngusBreed(animalUtil.generateGender(),animalUtil.generateFurColor(),30,animalUtil.MuscleDensity(), animalUtil.generateName(), "Crooked");
        System.out.println(angusBreed);

        JerseyBreed jerseyBreed =new JerseyBreed(animalUtil.generateGender(),animalUtil.generateFurColor(),40,animalUtil.MuscleDensity(), animalUtil.generateName());
        System.out.println(jerseyBreed);

        System.out.println(angusBreed.getGender());
        System.out.println(jerseyBreed.getGender());

     if ((angusBreed.getGender().equals(Gender.Bull) && (jerseyBreed.getGender().equals(Gender.Cow))) ||
             angusBreed.gender.equals(Gender.Cow)&&jerseyBreed.getGender().equals(Gender.Bull)){
         HaloBreed haloBreed = new HaloBreed(animalUtil.generateGender(), animalUtil.generateFurColor(), 55, animalUtil.newMuscleDensity(angusBreed,jerseyBreed), animalUtil.generateName());
         System.out.println("Breeding can happen :  New species is  " +haloBreed);
         System.out.println("New Breed life expectancy is " + haloBreed.getLifeExpectancy() + "  yrs");
         haloBreed.produceMeat();
         haloBreed.produceMilk();
         }else{
         System.out.println("Same gender cannot breed, try again");
         }

     //Life expectancy is coming as 0 for NewBreed Halo is always 0
        // I want milk quantity only for gender=cow in jerseybreed and AngusBreed



    }
}