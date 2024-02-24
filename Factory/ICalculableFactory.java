package ResultWorkJava.Factory;

import ResultWorkJava.Model.Calculable;
import ResultWorkJava.Model.ComplexNumber;

public interface ICalculableFactory {
    Calculable create(ComplexNumber primatyArg);
}
