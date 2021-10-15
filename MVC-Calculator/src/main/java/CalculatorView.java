import java.awt.event.ActionListener;
import javax.swing.*;


public class CalculatorView extends JFrame {

    private JTextField firstNumber = new JTextField(10);
    private JTextField secondNumber = new JTextField(10);
    private JTextField calculationSolution = new JTextField(10);

    private JLabel additionLabel = new JLabel("+");
    private JButton calculateButton = new JButton("Calculate");

    CalculatorView() {
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calculationSolution);

        this.add(calcPanel); // add the panel to JFrame
    }

    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());

    }

    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());

    }

    public int getSolution() {
        return Integer.parseInt(calculationSolution.getText());
    }

    public void setCalculationSolution(int solution) {
        calculationSolution.setText(Integer.toString(solution));
    }

    void addCalculationListener(ActionListener listenerForCalcButton) {
        calculateButton.addActionListener(listenerForCalcButton);
    }

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
