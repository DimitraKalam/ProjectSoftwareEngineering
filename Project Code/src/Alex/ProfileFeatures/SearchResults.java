package Alex.ProfileFeatures;

import java.util.ArrayList;

public class SearchResults {
    private ArrayList<Employee> users =new ArrayList<Employee>();
    private String query;
    private ArrayList<Employee> results =new ArrayList<Employee>();

    public void searchEmployeeByName(){
        for (Employee element : users) {
            if(query.equals(element.getName()))
                results.add(element);

        }
            }
    public ArrayList<Employee> returnResults(){
        return results;}

    public ArrayList <String> alternativeSearch()
    {
        //find similar searches
        ArrayList<String> similarSearch =new ArrayList<String>();
        return similarSearch;
    }
     public ChatFeature createChat(){return null;}
}
