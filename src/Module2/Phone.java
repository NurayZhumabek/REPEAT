package Module2;

public class Phone {
    long number;
    String model;
    int weight;

    public Phone(long number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Number: " + number);
        System.out.println("Weight: " + weight);

    }

    void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public long getNumber() {
        return number;
    }

    void receiveCall(String name, String number) {
        System.out.println("Calling: " + name + "  Phone number is " + number);
    }

    void sendMessage(int[] number) {
        {
            for (int i = 0; i < number.length; i++) {
                System.out.println("A message has been sent to the number " + number[i]);

            }
        }

    }

    public static void main(String[] args) {
        Phone iphone = new Phone(77770727, "Iphone 15", 150);
        Phone oppo = new Phone(707734311, "OPPO a65", 160);
        Phone samsung = new Phone(77787633, "S22", 174);
        iphone.display();
        oppo.display();
        samsung.display();
        iphone.receiveCall("Nura");
        oppo.receiveCall("Assel", "707 777 22 11");
        samsung.sendMessage(new int[]{7077787, 7772341, 77732412});

    }
}
