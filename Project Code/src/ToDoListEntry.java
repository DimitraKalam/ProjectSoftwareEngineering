import java.util.Date;

public class ToDoListEntry
{
    // The to - do list entry name
    private String Name;

    // The to - do list entry text
    private String Text;

    // The date that this entry was last modified
    private Date LastModificationDate;

    // Default Constructor
    public ToDoListEntry(String name, String text, Date lastModificationDate)
    {
        Name = name;
        Text = text;
        LastModificationDate = lastModificationDate;
    }

    public String getName()
    {
        return Name;
    }

    public String getText()
    {
        return Text;
    }

    public Date getLastModificationDate()
    {
        return LastModificationDate;
    }
}
