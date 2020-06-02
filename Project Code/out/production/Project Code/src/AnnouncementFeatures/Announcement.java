package AnnouncementFeatures;

public class Announcement
{
    // The name of the announcement
    private String Name;

    // The announcement information
    private String Info;

    // Default Constructor
    public Announcement(String name, String info)
    {
        Name = name;
        Info = info;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String getInfo()
    {
        return Info;
    }

    public void setInfo(String info)
    {
        Info = info;
    }
}
