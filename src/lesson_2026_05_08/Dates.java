package lesson_2026_05_08;

public class Dates
{
    private int day;
    private int month;
    private int year;

    public Dates(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }

    public static int StayDays(Dates x, Dates y)
    {
        // method that calculates the number of nights between x and y
        return 0;
    }
}