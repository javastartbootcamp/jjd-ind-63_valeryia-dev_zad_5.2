package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(50, 22.1, false);
        RoomInfo print = new RoomInfo();
        print.roomInfo(room);
    }
}
