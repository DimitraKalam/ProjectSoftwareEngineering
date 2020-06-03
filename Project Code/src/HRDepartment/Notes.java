package HRDepartment;

public class Notes {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Notes(String text) {
        this.text = text;
    }

    public static Notes notesRandom = new Notes("Some random Notes generataed for \n the purpose of the project");
    public static Notes notesRandom1 = new Notes("    Is not as careful in checking work product for errors as he/she could be.\n" +
            "    Tends to miss small errors in work product.\n" +
            "    Required paperwork is completed late or is only partially complete.\n");
    public static Notes notesRandom4 = new Notes("    Managers and co-workers have commented on high levels of accuracy and work productivity.\n" +
            "    Takes pride in work and strives to improve work performance.\n" +
            "    All memos, reports, forms and correspondence are completed on time with no errors.\n");
    public static Notes notesRandom3 = new Notes(            "            \"    Has made frequent errors that are harmful to business operations.\n\" +\n" +
            "            \"    The supervisor/department head has received numerous complaints about the quality of work.\n\" +\n" +
            "            \"    The quality of work produced is unacceptable.\n" +
            "            \"    Does not complete required paperwork.\n");
    public static Notes notesRandom2 = new Notes("    Has less than a 1% error rate on work product.\n" +
            "    Accuracy is excellent.\n" +
            "    Quantity of work produced is outstanding.\n" +
            "\n" +
            " ");
    static Notes[] randomNotesArray = new Notes[]{notesRandom1, notesRandom2,notesRandom3,notesRandom4};

}
