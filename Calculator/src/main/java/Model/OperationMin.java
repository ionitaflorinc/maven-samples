package Model;

public class OperationMin extends Operation {

    public OperationMin(Double firstOperator, Double secondOperator) {
        this.firstOperator = firstOperator;
        this.secondOperator = secondOperator;
    }

    @Override
    public Double performOperation() {
        return this.firstOperator < this.secondOperator ?  this.firstOperator : this.secondOperator;
    }
}
