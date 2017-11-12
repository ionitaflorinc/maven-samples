package Model;

public class OperationSubstract extends Operation {

    public OperationSubstract(Double firstOperator, Double secondOperator) {
        this.firstOperator = firstOperator;
        this.secondOperator = secondOperator;
    }

    @Override
    public Double performOperation() {
        return this.firstOperator - this.secondOperator;
    }
}
