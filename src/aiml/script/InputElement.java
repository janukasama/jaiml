package aiml.script;

import aiml.classifier.MatchState;

public class InputElement extends MultiIndexedElement {

  public String evaluate(MatchState m) {
    return "$_input[" + i1 + "," + i2 + "]";
  }

  public String toString() {
    return "$_input[" + i1 + "," + i2 + "]";
  }

}
