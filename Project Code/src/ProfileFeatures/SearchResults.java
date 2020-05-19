package ProfileFeatures;
import User;
public class SearchResults {
    private ArrayList<User> users =new ArrayList<User>();
    private String query;
    private ArrayList<User> results =new ArrayList<User>();

    public void searchUserByName(){
        for (User element : users) {
            if(query.equals(element.name))
                results.add(element);

        }
            }
    public ArrayList<User> returnResults(){
        return results;}

    public ArrayList <String> alternativeSearch()
    {
        //find similar searches
        ArrayList<String> similarSearch =new ArrayList<String>();
        return similarSearch;
    }
}
