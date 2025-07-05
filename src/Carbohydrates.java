// Carbohydrate calculation class
class Carbohydrates {
    float foodSourceWeight;

    public Carbohydrates(float foodSourceWeight) {
        this.foodSourceWeight = foodSourceWeight;
        double carbIntake = foodSourceWeight * 4;  // 1g carb = 4 kcal
        System.out.println("Carbohydrate Intake: " + carbIntake + " kcal");
    }
}
