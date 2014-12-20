package test;

import org.junit.Assert;
import org.owasp.esapi.ESAPI;
import org.owasp.esapi.Encoder;
import org.owasp.esapi.Validator;

public class Test {
  
  @org.junit.Test
  public void testValidation() {

    Validator instance = ESAPI.validator();
    Assert.assertTrue(instance.isValidInput("test", "eduardo.macarron@mail.com", "Email", 100, false));    
    
  }

  @org.junit.Test
  public void testEncoding() {

    Encoder encoder = ESAPI.encoder();
    Assert.assertEquals("&lt;b&gt;test&lt;&#x2f;b&gt;", encoder.encodeForHTML("<b>test</b>"));    
    
  }
  
}
