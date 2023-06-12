public class Calculator {
    private iOperation operation;
    public void setOperation(iOperation operation) {
        this.operation = operation;
    }
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        if (operation == null) {
            throw new IllegalStateException("Operation is not set");
        }
        return operation.execute(a, b);
    }
}
