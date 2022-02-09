package composition;

public class PersonalMain {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "AB1234");
        System.out.println(person.personToString());

        Address address = new Address("Magyarország", "Budapest", "XI. ker", "1090");
        person.moveTo(address);

        System.out.println(person.getAddress().addressToString());
    }
}
