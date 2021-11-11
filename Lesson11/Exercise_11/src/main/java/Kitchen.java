public class Kitchen extends Employee
{
    long serviceCharge;

    public Kitchen(String id, String name, int age, long basicSalary, long serviceCharge)
    {
        super(id, name, age, basicSalary);
        this.serviceCharge=serviceCharge;
    }

    public long getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public long calculatorSalary()
    {
        return basicSalary+serviceCharge;
    }
}
