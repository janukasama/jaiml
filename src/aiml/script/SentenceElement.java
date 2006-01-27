package aiml.script;

import aiml.classifier.MatchState;

public class SentenceElement extends NonEmptyElement {

  public String evaluate(MatchState m) {
    return "sentence("+content.evaluate(m)+")";
  }

  public String execute(MatchState m) {
    return "print(sentence("+content.evaluate(m)+"))";
  }
  
  public String toString() {
    return "sentence("+content+")";
  }

}
