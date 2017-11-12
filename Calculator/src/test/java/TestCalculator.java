import Manager.OperationManager;
import Model.*;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class TestCalculator {

    private OperationManager manager;

    @Before
    public void setUpManager() {
        manager = OperationManager.getInstance();
    }

    @Test
    public void testOperations() {
        Operation operationAdd = new OperationAdd(3.0, 5.0);
        assertTrue(manager.performOperation(operationAdd) == 8.0);

        Operation operationSubstract = new OperationSubstract(3.0, 5.0);
        assertTrue(manager.performOperation(operationSubstract) == -2.0);

        Operation operationMultiply = new OperationMultiply(3.0, 5.0);
        assertTrue(manager.performOperation(operationMultiply) == 15.0);

        Operation operationDivide = new OperationDivide(10.0, 5.0);
        assertTrue(manager.performOperation(operationDivide) == 2.0);

        Operation operationMax = new OperationMax(10.0, 5.0);
        assertTrue(manager.performOperation(operationMax) == 10.0);

        Operation operationMin = new OperationMin(10.0, 5.0);
        assertTrue(manager.performOperation(operationMin) == 5.0);

        Operation operationSqrt = new OperationSqrt(25.0);
        assertTrue(manager.performOperation(operationSqrt) == 5.0);
    }

}
