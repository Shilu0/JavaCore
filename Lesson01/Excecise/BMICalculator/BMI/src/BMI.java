public class BMI 
{
    public void BMICalculatorVoid() {
        double weight = 70;
        double height = 1.8;        
        System.out.println(weight / (height * height));
    }
    
    public double BMICalculatorDouble() {
        double weight = 70;
        double height = 1.8;
        return weight / (height * height);
    }

    public double BMICalculatorParameter(double weight, double height) {
        return weight / (height * height);
    }
}