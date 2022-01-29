public class User extends Account {
    private int id;
    private String name;
    private Account acc;

    public User(String name, int id, Account acc){
        this.name = name;
        this.id = id;
        this.acc = acc;
    }


    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getID(){
        return this.id;
    }
    public void setID(int id){
        this.id = id;
    }
}
