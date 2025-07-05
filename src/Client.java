//public class Client {
//    String name;
//    int age;
//    float weight;
//    double height;
//
//    public void Get_Client_Data(String name, int age, float weight, double height){
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//        this.height = height;
//
//        if(age > 100) System.out.println("Warning : as per the data, system analyse your are overweight due to that you can suffer from lot of health issues get your health check first, or loose you overall body weight and body fat with our system.");
//
//        System.out.println("Client details : ");
//        System.out.println("Name           : "+name);
//        System.out.println("Age            : "+age);
//        System.out.println("Weight         : "+weight);
//        System.out.println("Height         : "+height);
//    }
//
//
////
//    public static void main(String[] args) {
//        Calories calories = new Calories();
//        calories.maintainance_calories(71);
//        calories.calorie_Deficit();
//        calories.calorie_Surplus();
//
//
//    }
//}

// Client class to store client details
public class Client {
    String name;
    int age;
    float weight;
    double height;

    // Method to set and display client data
    public void setClientData(String name, int age, float weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

        // Warning message for age > 100 (you can modify logic to use weight/fat check instead)
        if (age > 100) {
            System.out.println("⚠️ Warning: According to the data, you may be overweight and could suffer health issues. Please get a health check or reduce your body weight/fat.");
        }

        // Display client details
        System.out.println("Client Details:");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Weight : " + weight + " kg");
        System.out.println("Height : " + height + " cm");
    }

    // Getter for weight (used in Calories class)
    public float getWeight() {
        return this.weight;
    }
}
