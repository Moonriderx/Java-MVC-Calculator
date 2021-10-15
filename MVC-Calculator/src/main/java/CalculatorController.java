import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener(new CalculateListener());
    }


    class CalculateListener implements ActionListener {



        public void actionPerformed(ActionEvent actionEvent) {
            int firstNumber = 0;
            int secondNumber = 0;

            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.addTwoNumbers(firstNumber, secondNumber);

                theView.setCalculationSolution(theModel.getCalculationValue());
            }

            catch (NumberFormatException ex) {
                theView.displayErrorMessage("You need to enter two integers");
            }
        }
    }
}
