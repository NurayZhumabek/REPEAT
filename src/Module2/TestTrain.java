package Module2;

import java.time.LocalTime;

public class TestTrain {
    public static void main(String[] args) {
        Train train[] = new Train[5];

        train[0] = new Train("Astana", 12, LocalTime.of(12, 30, 12));
        train[1] = new Train("Almaty", 13, LocalTime.of(13, 30, 00));
        train[2] = new Train("London", 34, LocalTime.of(21, 30, 30));
        train[3] = new Train("Astana", 60, LocalTime.of(18, 20, 00));
        train[4] = new Train("Ankara", 22, LocalTime.of(10, 50, 00));
        Train train1 = new Train();
        train1.sortByNumber(train);
        train1.sortByDestination(train);
      for (Train tr:train){
            tr.display();      }
    }
}
