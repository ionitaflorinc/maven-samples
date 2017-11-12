package Model;

public class OperationSqrt extends Operation {

    public OperationSqrt(Double operator) {
        this.firstOperator = operator;
    }

    @Override
    public Double performOperation() {
        return Math.sqrt(this.firstOperator);
    }
}
