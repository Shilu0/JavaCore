public abstract class Employee
{
    String id;
    String name;
    int age;
    long basicSalary;

    public Employee(String id, String name, int age, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public abstract long calculatorSalary();

    @Override
    public String toString()
    {
        return "Id: "+id+" | Tên: "+name+" | Tuổi: "+age+" | Tổng lương: "+calculatorSalary();
    }
}
