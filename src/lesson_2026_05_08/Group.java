package lesson_2026_05_08;

public class Group
{
    private String name; // name of group
    private int number;  // number of rooms allocated to the group

    public Group(String name, int number)
    {
        this.name = name;
        this.number = number;
    }

    public String getName() { return name; }
    public int getNumber() { return number; }

    int[] gRooms = new int[number];
    // array to hold room numbers allocated to the group

    public double bill(int[] gRooms)
    {
        double total = 0;
        for (int i = 0; i < gRooms.length; i++)
        {
            total += Hotel.allRooms[gRooms[i] - 1].getPrice();
        }
        System.out.println(name);
        System.out.println(total);
        return total;
    }
}
