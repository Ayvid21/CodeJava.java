// import java.util.*;

  class Student {
    String emp_name;
    private int emp_id;

    public void set_id(int id) {
      if(id>0)
      System.out.println(emp_id = id);
      else
      System.out.println("Invalid id");
    }

    public int get_id() {
      return emp_id;
    }

    public void set_name(String name) {
      System.out.println(emp_name = name);
    }

  }

public class MakingClass {
  public static void main(String args[]) {
    Student e = new Student();
    e.set_id(10);
    e.set_name("divya");

  }
}

