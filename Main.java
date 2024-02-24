package ResultWorkJava;

import ResultWorkJava.Factory.ICalculableFactory;
import ResultWorkJava.Factory.LogCalculableFactory;
import ResultWorkJava.Logger.ConsoleLogger;
import ResultWorkJava.View.ViewCalculator;

public class Main {
        public static void main(String[] args) {
            ICalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());
            ViewCalculator view = new ViewCalculator(calculableFactory);
            view.run();
        }

}

