public class Protien {
    float food_Source_Weight;

    public Protien(float food_Source_Weight){
        this.food_Source_Weight = food_Source_Weight;
        double protien_Intake = food_Source_Weight * 4;
        System.out.println("your daily protien intake is : " +protien_Intake);
    }
}
