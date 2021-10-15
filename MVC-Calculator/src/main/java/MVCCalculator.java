public class MVCCalculator {
    public static void main(String[] args) {
        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();

        CalculatorController controller = new CalculatorController(theView, theModel);

        theView.setVisible(true);
    }
}
