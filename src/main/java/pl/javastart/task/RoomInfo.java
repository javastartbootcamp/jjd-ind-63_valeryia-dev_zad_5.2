package pl.javastart.task;

public class RoomInfo {
    public void roomInfo(Room room) {
        System.out.println("Temperatura pokoju:" + room.getTemperature());
        System.out.println("Czy została obniżona temperatura w pokoju?\n" + room.lowerTemperature());
        if (room.lowerTemperature()) {
            System.out.println("Temperatura po zmianie:" + room.getTemperature());
        } else {
            System.out.println("Temperatura się nie zmieniła");
        }
    }
}

