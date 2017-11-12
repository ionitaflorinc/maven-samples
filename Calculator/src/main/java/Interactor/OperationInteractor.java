package Interactor;

import Manager.OperationManager;
import Model.*;

import java.util.Scanner;

public class OperationInteractor {
    public static void main(String [] args) {
        OperationManager manager = OperationManager.getInstance();
        Boolean keepAlive = true;
        Scanner reader = new Scanner(System.in);

        while (keepAlive) {
            printMenu();

            Operation operation = null;

            System.out.println("Enter choice");
            int choice = reader.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("First Operand");
                    Double firstOperand = reader.nextDouble();

                    System.out.println("Second Operand");
                    Double secondOperand = reader.nextDouble();

                    operation = new OperationAdd(firstOperand, secondOperand);
                    break;
                }
                case 2: {
                    System.out.println("First Operand");
                    Double firstOperand = reader.nextDouble();

                    System.out.println("Second Operand");
                    Double secondOperand = reader.nextDouble();

                    operation = new OperationSubstract(firstOperand, secondOperand);
                    break;
                }
                case 3: {
                    System.out.println("First Operand");
                    Double firstOperand = reader.nextDouble();

                    System.out.println("Second Operand");
                    Double secondOperand = reader.nextDouble();

                    operation = new OperationMultiply(firstOperand, secondOperand);
                    break;
                }
                case 4: {
                    System.out.println("First Operand");
                    Double firstOperand = reader.nextDouble();

                    System.out.println("Second Operand");
                    Double secondOperand = reader.nextDouble();

                    operation = new OperationDivide(firstOperand, secondOperand);
                    break;
                }
                case 5: {
                    System.out.println("First Operand");
                    Double firstOperand = reader.nextDouble();

                    System.out.println("Second Operand");
                    Double secondOperand = reader.nextDouble();

                    operation = new OperationMax(firstOperand, secondOperand);
                    break;
                }
                case 6: {
                    System.out.println("First Operand");
                    Double firstOperand = reader.nextDouble();

                    System.out.println("Second Operand");
                    Double secondOperand = reader.nextDouble();

                    operation = new OperationMin(firstOperand, secondOperand);
                    break;
                }
                case 7: {
                    System.out.println("Operand");
                    Double operand = reader.nextDouble();

                    operation = new OperationSqrt(operand);
                    break;
                }
                case 0: {
                    keepAlive = false;
                    reader.close();
                    break;
                }
            }

            Double result = manager.performOperation(operation);
            System.out.println(result.toString());
        }
    }

    public static void printMenu() {
        System.out.println("Options");
        System.out.println("\t1. Addition");
        System.out.println("\t2. Substraction");
        System.out.println("\t3. Multiplication");
        System.out.println("\t4. Division");
        System.out.println("\t5. Max");
        System.out.println("\t6. Min");
        System.out.println("\t7. Sqrt");
        System.out.println("\t0. Exit");
    }
}
