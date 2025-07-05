
// Fat calculation class
class Fats {
    float foodSourceWeight;
    public Fats(float foodSourceWeight) {
        this.foodSourceWeight = foodSourceWeight;
        double fatIntake = foodSourceWeight * 9;  // 1g fat = 9 kcal
        System.out.println("Fat Intake: " + fatIntake + " kcal");
    }
}
