import java.util.ArrayList;
import java.util.Iterator;

public class System {
    int uniqueInt = 0;
    private ArrayList<Employeein> Staff = new ArrayList<>();

    public ArrayList<Employeein> getMyList(){
        return Staff;
    }



    public void addEmployee(String name, String ename, int age, float salary){
         Staff.add(new Employeein(name,ename,age,salary));
    }


    public void removeEmployee(int index){
        Staff.remove(index);
    }



    public int newId(){
        uniqueInt = uniqueInt + 1;
        return uniqueInt;
    }

    public void increaseSalaryForOne(int a, int amount){
        Staff.get(a).increaseSalary(amount);

    }


    public void increaseSalaryEveryOne(int a){
        Iterator<Employeein> itr = getMyList().iterator();
        while(itr.hasNext()){
            Employeein employee = itr.next();
            employee.increaseSalary(a);
        }
    }


}




