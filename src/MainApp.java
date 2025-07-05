public class MainApp {

    public static void main(String[] args) {

        // Step 1: Create a client and input their data
        Client client = new Client();
        client.setClientData("John Doe", 28, 71.0f, 175.0d);  // name, age, weight, height

        // Step 2: Pass client object to Calories class
        Calories calories = new Calories(client);
        calories.maintenanceCalories();
        calories.calorieDeficit();
        calories.calorieSurplus();

        // Step 3: Calculate macros based on food weight
        System.out.println("\nMacronutrient Breakdown:");
        new Carbohydrates(150);  // 150g carb source
        new Protein(120);        // 120g protein source
        new Fats(70);            // 70g fat source
    }
}
