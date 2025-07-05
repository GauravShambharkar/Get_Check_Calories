// Class to calculate calorie information based on client data
class Calories {

    Client client = new Client(); // store the reference to the existing client object
    float weight = client.weight;
    // Constructor receives a client object


    // Constructor receives the existing client object
    public Calories(Client client) {
        this.client = client;
    }

    // Maintenance calories = weight x 15 (sample formula, can vary)
    public void maintenanceCalories() {
        double maintenance = weight * 15;
        System.out.println("Maintenance Calories: " + maintenance + " kcal/day");
    }

    // Calorie deficit (for fat loss)
    public void calorieDeficit() {
        double deficit = (weight * 15) - 500;
        System.out.println("Calorie Deficit Target: " + deficit + " kcal/day");
    }

    // Calorie surplus (for muscle gain)
    public void calorieSurplus() {
        double surplus = (weight * 15) + 500;
        System.out.println("Calorie Surplus Target: " + surplus + " kcal/day");
    }
}
