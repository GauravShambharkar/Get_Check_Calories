
// Protein calculation class
class Protein {
    float foodSourceWeight;

    public Protein(float foodSourceWeight) {
        this.foodSourceWeight = foodSourceWeight;
        double proteinIntake = foodSourceWeight * 4;  // 1g protein = 4 kcal
        System.out.println("Protein Intake: " + proteinIntake + " kcal");
    }
}
