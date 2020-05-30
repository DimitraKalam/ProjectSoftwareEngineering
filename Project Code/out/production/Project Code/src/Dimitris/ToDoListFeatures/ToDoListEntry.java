package Dimitris.ToDoListFeatures;

import java.util.Date;

public class ToDoListEntry
{
    // The to - do list entry name
    private String Name;

    // The to - do list entry information
    private String Info;

    // The date that this entry was last modified
    private Date LastModificationDate;

    // Default Constructor
    public ToDoListEntry(String name, String text, Date lastModificationDate)
    {
        Name = name;
        Info = text;
        LastModificationDate = lastModificationDate;
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

    public Date getLastModificationDate()
    {
        return LastModificationDate;
    }

    public void setLastModificationDate(Date lastModificationDate)
    {
        LastModificationDate = lastModificationDate;
    }
}
