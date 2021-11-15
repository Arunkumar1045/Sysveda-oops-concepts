package oops;

public class encapsulation{
    private int id;
    private String empName;
    private int empAge;

    public int getEmpempid(){
        return id;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpid(int newValue){
        id = newValue;
    }
}

