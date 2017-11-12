package Model;

public class OperationDivide extends Operation {

    public OperationDivide(Double firstOperator, Double secondOperator) {
        this.firstOperator = firstOperator;
        this.secondOperator = secondOperator;
    }

    @Override
    public Double performOperation() {
        return this.firstOperator / this.secondOperator;
    }
}
