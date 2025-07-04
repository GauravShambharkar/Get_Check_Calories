public class Fats {
    float food_Source_Weight;
    public Fats(float food_Source_Weight){
        this.food_Source_Weight = food_Source_Weight;
        double Fat_Intake = food_Source_Weight * 9;
        System.out.println("your daily Fats intake : "+Fat_Intake);
    }
}
