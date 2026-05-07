package lesson_2026_05_08;

public class GClient extends Client
{
    private String groupName;

    public GClient(int id, String c, Dates dateIn, Dates dateOut, Room r, String groupName)
    {
        super(id, c, dateIn, dateOut, r);
        this.groupName = groupName;
    }

    public String getGroupName() { return groupName; }
    public void setGroupName(String groupName) { this.groupName = groupName; }
}
