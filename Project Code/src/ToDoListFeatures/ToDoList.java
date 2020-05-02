package ToDoListFeatures;

import java.util.Vector;

public class ToDoList
{
    Vector<ToDoListEntry> EntryVector;

    public ToDoList()
    {
        EntryVector = new Vector<>();
    }

    public void addNewEntry(ToDoListEntry entry)
    {
        EntryVector.add(entry);
    }
}
