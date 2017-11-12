package Model;

public class OperationMax extends Operation {

    public OperationMax(Double firstOperator, Double secondOperator) {
        this.firstOperator = firstOperator;
        this.secondOperator = secondOperator;
    }

    @Override
    public Double performOperation() {
        return this.firstOperator > this.secondOperator ? this.firstOperator : this.secondOperator;
    }
}
