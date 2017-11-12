package Model;

public class OperationAdd extends Operation {

    public OperationAdd(Double firstOperator, Double secondOperator) {
        this.firstOperator = firstOperator;
        this.secondOperator = secondOperator;
    }

    @Override
    public Double performOperation() {
        return this.firstOperator + this.secondOperator;
    }

}
