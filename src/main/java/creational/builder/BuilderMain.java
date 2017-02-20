package creational.builder;

/**
 * Created by michal on 20.02.17.
 */
public class BuilderMain {
    private Person person1 = new Person.PersonBuilder()
            .setFirstName("Michal")
            .setLastName("x")
            .setCity("Gdansk")
            .setIsEmployed(true)
            .setStreetAddress("depends")
            .createPerson();
}
