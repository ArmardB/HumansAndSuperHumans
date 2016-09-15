package bellamy.armard.HumansAndSuperhumans;

/**
 * Created by armardbellamy on 9/15/16.
 */
public class Human {

    public enum Gender {MALE, FEMALE}

    private String name;
    private int age;
    private Gender gender;
    private String occupation;
    private String address;

    public Human(String name, int age, Gender gender, String occupation, String address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.address = address;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(Gender gender ){
        this.gender = gender;
    }

    public Gender getGender(){
        return gender;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    public String getOccupation(){
        return occupation;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

}
