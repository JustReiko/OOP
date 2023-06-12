import java.util.Scanner;

public class App { 
   
   public Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {

       View view = new View();
       Calculator calculator = new Calculator();

       int choice = 0;
       while (choice != 4) {
           view.showMenu();
           choice = view.getMenuChoice();

           switch (choice) {
               case 1:
                   ComplexNumber num1 = view.getComplexNumber();
                   ComplexNumber num2 = view.getComplexNumber();
                   calculator.setOperation(new LoggingDecorator(OperationFactory.createOperation("addition")));
                   ComplexNumber sum = calculator.execute(num1, num2);
                   break;
               case 2:
                   ComplexNumber num3 = view.getComplexNumber();
                   ComplexNumber num4 = view.getComplexNumber();
                   calculator.setOperation(new LoggingDecorator(OperationFactory.createOperation("division")));
                   ComplexNumber div = calculator.execute(num3, num4);
                   break;
               case 3:
                   ComplexNumber num5 = view.getComplexNumber();
                   ComplexNumber num6 = view.getComplexNumber();
                   calculator.setOperation(new LoggingDecorator(OperationFactory.createOperation("multiplication")));
                   ComplexNumber product = calculator.execute(num5, num6);
                   break;
               case 4:
                   System.out.println("Выход");
                   break;
               default:
                   System.out.println("Некорректный выбор");
           }
       }
   }
}