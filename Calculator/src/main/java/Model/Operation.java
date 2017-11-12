package Model;

public abstract class Operation {
    protected Double firstOperator;
    protected Double secondOperator;

    public Double getFirstOperator() {
        return firstOperator;
    }

    public void setFirstOperator(Double firstOperator) {
        this.firstOperator = firstOperator;
    }

    public Double getSecondOperator() {
        return secondOperator;
    }

    public void setSecondOperator(Double secondOperator) {
        this.secondOperator = secondOperator;
    }

    public abstract Double performOperation();

    @Override
    public String toString() {
        return "OperationInterface{" +
                "firstOperator=" + firstOperator +
                ", secondOperator=" + secondOperator +
                '}';
    }
}
