//Kekoa McWilliams
//CS1400
//Assignment 6
//12/7/23
public class Superhero extends Person {
    private String superHeroName;
    private String superPower;
    private String catchPhrase;

    private static int totalNumberVillainsCaught = 0;

    public Superhero(String name, int age, String favoriteFood, String superHeroName, String superPower, String catchPhrase) {
        super(name, age, favoriteFood);
        this.superHeroName = superHeroName;
        this.superPower = superPower;
        this.catchPhrase = catchPhrase;
    }

    public String getSuperHeroName() {
        return superHeroName;
    }

    public void setSuperHeroName(String superHeroName) {
        this.superHeroName = superHeroName;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public void speak() {
        System.out.println(catchPhrase);
    }

    @Override
    public String toString() {
        return super.toString() + " Superhero{" +
                "superHeroName='" + superHeroName + '\'' +
                ", superPower='" + superPower + '\'' +
                ", catchPhrase='" + catchPhrase + '\'' +
                '}';
    }

    public static void catchVillain() {
        totalNumberVillainsCaught++;
    }

    public static int villainsCaught() {
        return totalNumberVillainsCaught;
    }
}