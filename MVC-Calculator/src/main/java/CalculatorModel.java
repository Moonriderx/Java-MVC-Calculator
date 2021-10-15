public class CalculatorModel {

    private int calculationValue; // contains data

    public void addTwoNumbers(int num1, int num2) { // perform operation

        calculationValue = num1 + num2;

    }

    public int getCalculationValue() { // provide access to the data
        return calculationValue;
    }


}
