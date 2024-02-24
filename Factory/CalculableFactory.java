package ResultWorkJava.Factory;

import ResultWorkJava.Model.Calculable;
import ResultWorkJava.Model.ComplexCalculator;
import ResultWorkJava.Model.ComplexNumber;
import Seminar4.Calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(ComplexNumber primaryArg){
        return new ComplexCalculator(primaryArg);
    }
}
