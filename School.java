package models;
import java.util.ArrayList;
public class School {
    private ArrayList<Person> members;
    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);    }

    public ArrayList<Person> getMembers() {
        return members;
    }
    public void setMembers(ArrayList<Person> members) {
        this.members = members;
    }
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < members.size(); i++) {
            result = result + members.get(i).toString() + "\n";
        }
        return result;
    }
}
