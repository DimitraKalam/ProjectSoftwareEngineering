package Dimitris.ToDoListFeatures;

import java.util.Vector;

public class ToDoList
{
    Vector<ToDoListEntry> EntryVector;

    String Name;

    public ToDoList(String name) {
        Name = name;
    }

    public ToDoList()
    {
        EntryVector = new Vector<>();
    }

    public void addNewEntry(ToDoListEntry entry)
    {
        EntryVector.add(entry);
    }
}
