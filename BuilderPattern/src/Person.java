public class Person {

    // compulsory
    private final String name;
    private final String email;

    // optional
    private final String address;
    private final String university;
    private final int age;

    // private: only the Builder can create a Person
    private Person(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.address = builder.address;
        this.university = builder.university;
        this.age = builder.age;
    }

    public static class Builder {

        // compulsory
        private final String name;
        private final String email;

        // optional
        private String address;
        private String university;
        private int age;

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", email=" + email
                + ", address=" + address + ", university=" + university
                + ", age=" + age + "]";
    }
}