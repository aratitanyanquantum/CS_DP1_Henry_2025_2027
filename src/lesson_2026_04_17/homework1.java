package lesson_2026_04_17;

class Ticket {
    private String name;

    public Ticket(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}

class Flight {
    private String flightNumber;
    private int capacity;
    private Ticket[] tickets;
    private int ticketsSold;

    public Flight(String flightNumber, int capacity) {
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.tickets = new Ticket[capacity];
        this.ticketsSold = 0;
    }

    public boolean addTicket(Ticket ticket) {
        if (ticketsSold >= capacity) {
            return false;
        }
        tickets[ticketsSold] = ticket;
        ticketsSold++;
        return true;
    }

    public boolean removeTicket(Ticket ticket) {
        for (int i = 0; i < ticketsSold; i++) {
            if (tickets[i] == ticket) {
                for (int j = i; j < ticketsSold - 1; j++) {
                    tickets[j] = tickets[j + 1];
                }
                tickets[ticketsSold - 1] = null;
                ticketsSold--;
                return true;
            }
        }
        return false;
    }

    public int getSeatsAvailable() {
        return capacity - ticketsSold;
    }

    public void printPassengerList() {
        System.out.println("Flight " + flightNumber + " has passengers:");
        for (int i = 0; i < ticketsSold; i++) {
            System.out.println(tickets[i].getName());
        }
    }
}

public class homework1 {
    public static void main(String[] args) {
        Flight cx619 = new Flight("CX 619", 280);
        Flight aa6914 = new Flight("AA 6914", 266);
        Flight ek89 = new Flight("EK 89", 354);

        Ticket jordan = new Ticket("Jordan Deckard");
        cx619.addTicket(new Ticket("Taylor Ripley"));
        cx619.addTicket(jordan);
        cx619.addTicket(new Ticket("Casey Neo"));
        aa6914.addTicket(new Ticket("Cameron Quaid"));
        aa6914.addTicket(new Ticket("Phoenix Andor"));

        cx619.printPassengerList();
        System.out.println(cx619.getSeatsAvailable());
        cx619.removeTicket(jordan);
        cx619.printPassengerList();
        System.out.println(cx619.getSeatsAvailable());
    }
}