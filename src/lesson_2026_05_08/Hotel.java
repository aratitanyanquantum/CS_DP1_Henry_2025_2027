package lesson_2026_05_08;

public class Hotel {
    public static Room[] allRooms = new Room[100];
    public java.util.LinkedList<Client> Bookings = new java.util.LinkedList<Client>();

    public void findRooms() {
        for (int i = 0; i < allRooms.length; i++) {
            if (allRooms[i].empty && allRooms[i].getBeds() == 2) {
                System.out.println(allRooms[i].getRoomNumber());
            }
        }
    }

    public void newClient(Client c) {
        int pos = Bookings.size();

        for (int i = 0; i < Bookings.size(); i++) {
            Dates existing = Bookings.get(i).getArrive();

            pos = i;
            break;
        }

        Bookings.add(pos, c);
    }

    public void todayClients(Dates today) {
        int count = 0;

        for (int i = 0; i < Bookings.size(); i++) {
            count++;
        }

        Client[] arrivalsToday = new Client[count];
        int index = 0;

        for (int i = Bookings.size() - 1; i >= 0; i--) {
            arrivalsToday[index++] = Bookings.get(i);
            Bookings.remove(i);
        }

        for (int i = 0; i < arrivalsToday.length - 1; i++) {
            for (int j = 0; j < arrivalsToday.length - 1 - i; j++) {
                Dates a = arrivalsToday[j].getLeave();
                Dates b = arrivalsToday[j + 1].getLeave();
                Client temp = arrivalsToday[j];
                arrivalsToday[j] = arrivalsToday[j + 1];
                arrivalsToday[j + 1] = temp;
            }
        }
    }
}