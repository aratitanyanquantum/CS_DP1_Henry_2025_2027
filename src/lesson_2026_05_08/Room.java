package lesson_2026_05_08;

public class Room
{
    private int roomNumber;
    private int beds;
    private double price;
    public boolean empty;

    public Room(int roomNumber, int beds, double price, boolean empty)
    {
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.price = price;
        this.empty = empty;
    }

    public int getRoomNumber() { return roomNumber; }
    public int getBeds() { return beds; }
    public double getPrice() { return price; }
    public boolean isEmpty() { return empty; }
    public void setEmpty(boolean empty) { this.empty = empty; }
}


