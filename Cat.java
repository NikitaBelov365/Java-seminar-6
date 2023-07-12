import java.sql.Date;

public class Cat {
    // Vet Clinic
    String nameCat;
    String owner_name;
    Date birth_year;
    float height;
    float weight;
    String diagnosis;
    int age;

    // Vistavka
    //String name;
    //String owner_name;
    //Date birth_year;
    String breed;
    //String mother;
   // String father;
    float rating;

    //Cucklochev
    //String name;
    //Date birth_year;
    //String breed;
    String actor_umplua;
    String character;
    String mother;
    String father;

    public  Cat (String nameCat, int age, String breed) {
        this.nameCat = nameCat;
        this.age = age;
        this.breed = breed;
    }

    public String toString() {
        return nameCat + age + breed;
    }
}
