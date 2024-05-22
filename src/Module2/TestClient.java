package Module2;

public class TestClient {
    public static void main(String[] args) {
        Client client=new Client("nuray@gmail.com","78.122.254.211","sarayshik 5/1","https://assl");
        ClientValidator clientValidator=new ClientValidator();

        System.out.println(clientValidator.validateIP(client.ip));
    }
}
