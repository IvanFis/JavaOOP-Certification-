package ResultWorkJava.Factory;

import ResultWorkJava.Model.Calculable;
import ResultWorkJava.Logger.Logable;
import ResultWorkJava.Model.ComplexCalculator;
import ResultWorkJava.Model.ComplexNumber;
import ResultWorkJava.Model.LogCalculator;

public class LogCalculableFactory implements ICalculableFactory {
   private Logable logable;

    public LogCalculableFactory(Logable logable) {
        this.logable = logable;
    }


    @Override
    public Calculable create(ComplexNumber primatyArg) {
        return new LogCalculator(new ComplexCalculator(primatyArg),logable);
    }


}
