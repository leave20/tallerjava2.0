package serializable;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * La serialización es el objeto convertido en bites
 * dicho objeto serializado lo podemos llevar a distintos recursos y
 * volver a deserializarlo
 */

public class Employee implements Serializable {
    private final String name;
    private double salary;
    private int month;
    private int day;
    private final Date dateContract;


    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        dateContract = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public Date getDateContract() {
        return dateContract;
    }

    void upSalary(double porcentaje) {
        double upload = salary * porcentaje / 100;
        salary += upload;
    }

    @Override
    public String toString() {
        return "Employee " +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", month=" + month +
                ", day=" + day +
                ", dateContract=" + dateContract;
    }
}

