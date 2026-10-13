public class App {

    public static void main(String[] args) {

        Person p1 = new Person.Builder("Kevin", "kevin@gmail.com")
                .setUniversity("MIT")
                .setAddress("Wall Street")
                .setAge(23)
                .build();

        System.out.println(p1);

        Person p2 = new Person.Builder("Kevin", "kevin@gmail.com").build();
        System.out.println(p2);

        Person p3 = new Person.Builder("Kevin", "kevin@gmail.com")
                .setUniversity("MIT")
                .build();
        System.out.println(p3);
    }
}
