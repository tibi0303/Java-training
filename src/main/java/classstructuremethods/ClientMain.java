package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Nagy Tibor");
        client.setYear(35);
        client.setAddress("Budapest IX.");

        System.out.println(client.getName()+ ", " +client.getYear()+ ", " +client.getAddress());

        client.migrate("Budapest III.");
        System.out.println("New address: " +client.getAddress());
    }
}
