public class OperationFactory {
    public static iOperation createOperation(String type) {
      switch (type) {
         case "addition":
            return new Addition();
         case "multiplication":
            return new Multiplication();
         case "division":
            return new Division();
         default:
            throw new IllegalArgumentException("Неизвестный тип операции: " + type);
      }
   }
}
