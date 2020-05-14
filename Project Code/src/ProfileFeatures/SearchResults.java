package ProfileFeatures;
import User;
public class SearchResults {
    private ArrayList<User> users =new ArrayList<User>;
    private String query;
    private ArrayList<User> results =new ArrayList<User>;

    public ArrayList<User> return_Results(){
        for (User element : users) {
            if( query== element.name)
                results.add(element);
            return results;
        }

    }
}
