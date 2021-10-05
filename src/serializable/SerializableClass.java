package serializable;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableClass {
    public static void main(String[] args) {
        Administrator boss = new Administrator("Jhon", 800000, 2005, 12, 15);
        boss.setIncentive(5000);
        Employee[] personal = new Employee[3];
        personal[0] = boss;
        personal[1] = new Employee("Ana", 22000, 10, 1, 12);
        personal[2] = new Employee("Manuel", 35000, 2009, 8, 20);
        try {
            ObjectOutputStream writing_file = new ObjectOutputStream(new FileOutputStream("C:/Users/kenisito/Desktop/java_ser/employee.txt"));
            writing_file.writeObject(personal);
            writing_file.close();
            ObjectInputStream recover_file=new ObjectInputStream(new FileInputStream("C:/Users/kenisito/Desktop/java_ser/employee.txt"));
            Employee[] personal_recover=(Employee[])recover_file.readObject();
            personal_recover.clone();
            for (Employee e:personal_recover){
                System.out.println(e);
            }
        } catch (Exception e) {

        }

    }

}

