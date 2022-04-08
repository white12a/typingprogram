package Homework;

public class SimpleCalculator {
    double firstNumber;
    double secondNumber;
    //without parameters and return the value of firstnumber
    public double getFirstNumber(){
        return this.firstNumber=firstNumber;
    }
    // withoit parameters and return the value of lastnumber
    public double getSecondNumber(){
        return this.secondNumber=secondNumber;
    }
    //with one parameter and set the value of firstnumber
    public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
    }
    //with one parameter and set the value of lastnumber
    public void setSecondNumber(double secondNumber){this.secondNumber=secondNumber;}
    //no parameter and return the value of addition
    public double getAdditionResult(){
        double addition=this.firstNumber+this.secondNumber;
        return addition;
    }
    //no paramter and return the value of substraction
    public double getSubtractionResult(){
      double  substarction=this.firstNumber=this.secondNumber;
        return substarction;
    }
    //no params, return result of multiplication
    public double getMultiplicationResult (){
        double multiply = this.firstNumber*this.secondNumber;
        return multiply;
    }

    //no params, return result of division
    public double getDivisionResult (){
        double division = this.secondNumber/this.firstNumber;
        return division;
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());


    }

    }

