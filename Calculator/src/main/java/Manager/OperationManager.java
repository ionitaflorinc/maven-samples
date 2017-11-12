package Manager;

import Model.Operation;

public class OperationManager {
    private static class LazyHolder {
        static final OperationManager INSTANCE = new
                OperationManager();
    }

    public static OperationManager getInstance() {
        return LazyHolder.INSTANCE;
    }

    public Double performOperation(Operation operation) {
        if (operation != null) {
            return operation.performOperation();
        }

        return 0.0;
    }

}
