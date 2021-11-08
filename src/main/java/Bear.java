public class Bear {
    private String name;
    private int age;
    private double weight;
    private char gender;

    public Bear(String name, int age, double weight, char gender){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public Double getWeight(){
        return this.weight;
    }

    public boolean bearReadyToHibernate(){
        if(this.weight >= 80.00){
            return true;

        }
        else{
            return false;
        }
    }


    public char getGender() {
        return gender;
    }
}
