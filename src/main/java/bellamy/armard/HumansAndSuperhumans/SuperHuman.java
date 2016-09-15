package bellamy.armard.HumansAndSuperhumans;

/**
 * Created by armardbellamy on 9/15/16.
 */
public class SuperHuman extends Human{

    public enum Type {GOOD, BAD}

    private Type type;
    private String heroName;
    private String superAbility;

    public SuperHuman(String name, int age, Gender gender, String occupation, String address, Type type, String heroName, String superAbility){
        super( name,  age,  gender,  occupation,  address);
        this.type = type;
        this.heroName = heroName;
        this.superAbility = superAbility;
    }

    public void setType(Type type){
        this.type = type;

    }

    public Type getType(){
        return type;
    }

    public void setHeroName(String name){
        this.heroName = name;
    }

    public String getHeroName(){
        return heroName;
    }

    public void setSuperAbility(String superPower){
        this.superAbility = superPower;
    }

    public String getSuperAbility(){
        return superAbility;
    }



}
