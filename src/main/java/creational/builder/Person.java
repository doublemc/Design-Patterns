package creational.builder;

/**
 * Created by michal on 20.02.17.
 *
 * http://www.oodesign.com/builder-pattern.html
 */

class Person {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String salutation;
    private final String streetAddress;
    private final String city;
    private final String state;
    private final boolean isFemale;
    private final boolean isEmployed;

    private Person(String lastName, String firstName, String middleName, String salutation,
                  String streetAddress, String city, String state, boolean isFemale, boolean isEmployed) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.salutation = salutation;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.isFemale = isFemale;
        this.isEmployed = isEmployed;
    }

    public static class PersonBuilder {
        private String lastName;
        private String firstName;
        private String middleName;
        private String salutation;
        private String streetAddress;
        private String city;
        private String state;
        private boolean isFemale;
        private boolean isEmployed;

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder setSalutation(String salutation) {
            this.salutation = salutation;
            return this;
        }

        public PersonBuilder setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public PersonBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public PersonBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public PersonBuilder setIsFemale(boolean isFemale) {
            this.isFemale = isFemale;
            return this;
        }

        public PersonBuilder setIsEmployed(boolean isEmployed) {
            this.isEmployed = isEmployed;
            return this;
        }

        public Person createPerson() {
            return new Person(lastName, firstName, middleName, salutation, streetAddress, city, state, isFemale, isEmployed);
        }
    }
}
