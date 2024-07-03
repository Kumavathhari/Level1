package Level1;

public class Dog {
    String breed;
    int age;
    double weight;

    public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public int calculateHumanAge(){
        if (age<=2){
            return (int) (age*10.5);
        }else {
            return (int) (2*10.5)+(age-2)*4;
        }
    }

    public void details(){
        System.out.println("bread : "+breed);
        System.out.println("age : "+age+" year ... in human age : "+calculateHumanAge()+" years.");
        System.out.println("weight : "+weight+" kg.");
    }

    public static void main(String[] args) {
        Dog d = new Dog("leo",5,18);
        d.details();
    }
}
