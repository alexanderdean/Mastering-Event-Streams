package events.ch02.events;

import java.util.List;
import com.google.gson.Gson;

public class PerformCalculationEvent extends Event {

  private final DirectObject directObject;

  public PerformCalculationEvent(String hostname, String operation, String[] args, Integer result) {
    super(hostname, "perform");
    this.directObject = new DirectObject(operation, args, result);
  }

  private class DirectObject {
    private final Calculation calculation;

    public DirectObject(String operation, String[] args, Integer result) {
      this.calculation = new Calculation(operation, args, result);
    }
  }

  private class Calculation {
    private final String operation;
    private final String[] args;
    private final Integer result;

    public Calculation(String operation, String[] args, Integer result) {
      this.operation = operation;
      this.args = args;
      this.result = result;
    }
  }
}
