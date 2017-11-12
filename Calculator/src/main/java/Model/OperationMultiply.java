package Model;

public class OperationMultiply extends Operation {

    public OperationMultiply(Double firstOperator, Double secondOperator) {
        this.firstOperator = firstOperator;
        this.secondOperator = secondOperator;
    }

    @Override
    public Double performOperation() {
        return this.firstOperator * this.secondOperator;
    }
}
