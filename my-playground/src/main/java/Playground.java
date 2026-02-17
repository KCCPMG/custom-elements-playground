import org.json.JSONObject;
import java.util.Optional;

public class Playground {

  public static void main(String[] args) {
    System.out.println("\n\n\nHello World");

    JSONObject jsonTest = new JSONObject();

    jsonTest.put("strTest", "this is the value for strTest");
    System.out.println("jsonTest: " + jsonTest);

    StringObject so = new StringObject(jsonTest);
    System.out.println("so: " + so.getValue());

    ComplexConstructor first = new ComplexConstructor(jsonTest);
    jsonTest.put("strOptional", "This is an optional string");
    ComplexConstructor second = new ComplexConstructor(jsonTest);
    jsonTest.put("bOptional", false);
    ComplexConstructor third = new ComplexConstructor(jsonTest);
    jsonTest.put("bOptional", true);
    ComplexConstructor fourth = new ComplexConstructor(jsonTest);

    System.out.println("\nfirst: " + first);
    System.out.println("\nsecond: " + second);
    System.out.println("\nthird: " + third);
    System.out.println("\nfourth: " + fourth);
  }

}


class StringObject {

  private String value;

  public StringObject(JSONObject jsonIn) {
    this.value = jsonIn.getString("strTest");
  }

  public String getValue() {
    return this.value;
  }
}


class ComplexConstructor {

  private String strTest;
  private Optional<String> optionalTestString; 
  private Optional<Boolean> optionalTestBoolean; // Optional requires that the type argument be an Object, not a primitive


  public ComplexConstructor(JSONObject jsonIn) {

    // expected to always exist
    this.strTest = jsonIn.getString("strTest");

    // may or may not exist
    if (jsonIn.has("strOptional") && jsonIn.get("strOptional") instanceof String strOptional) {
      this.optionalTestString = Optional.of(strOptional);
    } else {
      this.optionalTestString = Optional.empty();
    }

    // may or may not exist
    if (jsonIn.has("bOptional") && jsonIn.get("bOptional") instanceof Boolean bOptional) {
      // boolean is a primitive and cannot be used with the instanceof
      // Boolean serves this purpose, and if the value is null, it will still return false
      this.optionalTestBoolean = Optional.of(bOptional);
    } else {
      this.optionalTestBoolean = Optional.empty();
    }
  }

  public String toString() {

    String optionalTestStringDescriptor = "";
    // String optionalTestBooleanDescriptor = "";

    // straightforward, but unsafe
    if (optionalTestString.isPresent()) {
      optionalTestStringDescriptor = "\n\toptionalTestString: " + this.optionalTestString.get();
    }

    // safer, requires arrow function
    String optionalTestBooleanDescriptor = "\n\toptionalTestBoolean: " + optionalTestBoolean
      .map((val -> val.toString()))
      .orElse("(not provided)");

    return (
      "\n\tstrTest: " + this.strTest +
      optionalTestStringDescriptor +
      optionalTestBooleanDescriptor
    );
  }

}