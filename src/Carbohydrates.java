public class Carbohydrates {
    float food_Source_Weight;
    public Carbohydrates(float food_Source_Weight){
        this.food_Source_Weight = food_Source_Weight;
        double Carb_Intake = food_Source_Weight * 4;
        System.out.println("your daily Carb intake : "+Carb_Intake);
    }
}
