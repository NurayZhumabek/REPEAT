package Module2;

import java.time.LocalTime;

public class Train {
    String destination;
    int number;
    LocalTime departureTime;

    public Train() {
    }

    public Train(String destination, int number, LocalTime departureTime) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
    }
    public void display(){
        System.out.println("Destination address: "+destination);
        System.out.println("The number of train: "+number);
        System.out.println("Departure time train: " +departureTime);
        System.out.println();

    }
    public Train[] sortByNumber(Train train[]){
        Train temp;
        for (int i = 0; i < train.length; i++) {
            for (int j =i+1; j < train.length; j++) {
                if (train[i].number>train[j].number){
                    temp=train[i];
                    train[i]=train[j];
                    train[j]=temp;

                }

            }
        }

        return train;

}
    public Train[] sortByDestination(Train[] train) {
        Train temp;
        Train time;
        for (int i = 0; i < train.length; i++) {
            for (int j = i + 1; j < train.length; j++) {
                // Сравниваем строки места назначения
                if (train[i].destination.compareTo(train[j].destination) > 0) {


                    temp = train[i];
                    train[i] = train[j];
                    train[j] = temp;
                }
                if (train[i].destination.equals(train[j].destination)){
                    if (train[i].departureTime.compareTo(train[j].departureTime)>0){
                        time = train[i];
                        train[i] = train[j];
                        train[j] = time;
                    }
                }
            }
        }
        // Выводим отсортированные места назначения для проверки
        for (int i = 0; i < train.length; i++) {
            System.out.println(train[i].destination+"   " +train[i].departureTime);
        }
        return train;
    }
}
