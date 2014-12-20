package test;

import org.junit.Assert;
import org.owasp.esapi.ESAPI;
import org.owasp.esapi.Encoder;
import org.owasp.esapi.Validator;

public class Test {
  
  @org.junit.Test
  public void testValidation() {

    Validator instance = ESAPI.validator();
    Assert.assertTrue(instance.isValidInput("test", "jeff.williams@aspectsecurity.com", "Email", 100, false));    
    
  }

  @org.junit.Test
  public void testEncoding() {

    Encoder encoder = ESAPI.encoder();
    System.out.println(encoder.encodeForHTML("<b>hola</b>"));    
    
  }
  
}
