//Kekoa McWilliams
//CS1400
//Assignment 6
//12/7/23
public class Person {
    private String name;
    private int age;
    private String favoriteFood;

    public Person(String name, int age, String favoriteFood) {
        this.name = name;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }

    public Person(Person otherPerson) {
        this.name = otherPerson.getName();
        this.age = otherPerson.getAge();
        this.favoriteFood = otherPerson.getFavoriteFood();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        if (age != person.age) return false;
        if (!name.equals(person.name)) return false;
        return favoriteFood.equals(person.favoriteFood);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", favoriteFood='" + favoriteFood + '\'' +
                '}';
    }
}
