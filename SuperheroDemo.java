//Kekoa McWilliams
//CS1400
//Assignment 6
//12/7/23
public class SuperheroDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Bruce Wayne", 35, "Burgers");
        Person person2 = new Person("Diana Prince", 500, "Ice Cream");

        Superhero superhero1 = new Superhero("Clark Kent", 30, "Pizza", "Superman", "Flight", "The S stands for Hope");
        Superhero superhero2 = new Superhero("Peter Parker", 25, "Pasta", "Spiderman", "Web-Slinging", "I'm Spiderman");

        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);

        System.out.println("\nSuperhero 1: " + superhero1);
        System.out.println("Superhero 2: " + superhero2);

        superhero1.speak(); 
        superhero2.speak();

        Superhero.catchVillain(); 

        System.out.println("\nTotal number of villains caught: " + Superhero.villainsCaught());
    }
}