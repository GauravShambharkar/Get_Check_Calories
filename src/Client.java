public class Client {
    String name;
    int age;
    float weight;
    float height;

    public void Get_Client_Data(String name, int age, float weight, float height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

        System.out.println("Client details : ");
        System.out.println("Name           : "+name);
        System.out.println("Age            : "+age);
        System.out.println("Weight         : "+weight);
        System.out.println("Height         : "+height);
    }

}
