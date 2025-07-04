public class Client {
    String name;
    int age;
    float weight;
    double height;

    public void Get_Client_Data(String name, int age, float weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

        if(age > 100) System.out.println("Warning : as per the data, system analyse your are overweight due to that you can suffer from lot of health issues get your health check first, or loose you overall body weight and body fat with our system.");

        System.out.println("Client details : ");
        System.out.println("Name           : "+name);
        System.out.println("Age            : "+age);
        System.out.println("Weight         : "+weight);
        System.out.println("Height         : "+height);
    }
//
//    public static void main(String[] args) {
//        Client client = new Client();
//
//    }
}
