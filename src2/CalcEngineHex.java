
public class CalcEngineHex extends CalcEngine {

    public void numberPressed(int number)
    {
        if(buildingDisplayValue) {
            // Incorporate this digit.
            displayValue = displayValue*16+ number;
        }
        else {
            // Start building a new number.
            displayValue = number;
            buildingDisplayValue = true;
        }
    }

    private void calculateResult()
    {
        switch(lastOperator) {
            case '+':
                displayValue = leftOperand + displayValue;
                haveLeftOperand = true;
                leftOperand = displayValue;
                break;
            case '-':
                displayValue = leftOperand - displayValue;
                haveLeftOperand = true;
                leftOperand = displayValue;
                break;
            case '/':
                displayValue = leftOperand / displayValue;
                haveLeftOperand = true;
                leftOperand = displayValue;
                break;
            case '*':
                displayValue = leftOperand * displayValue;
                haveLeftOperand = true;
                leftOperand = displayValue;
                break;
            default:
                keySequenceError();
                break;
        }
    }

}
