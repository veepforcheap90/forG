package yyds.sniarbtej;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public abstract class ٴۉ<T> {
  public abstract void ᐨẏ(Ⴡ paramჁ, T paramT);
  
  private void ᐨẏ(Writer paramWriter, T paramT) {
    Ⴡ ⴡ = new Ⴡ(paramWriter);
    ᐨẏ(ⴡ, paramT);
  }
  
  public final ٴۉ<T> ˊ() {
    return new ʻบ(this);
  }
  
  private String ᐨẏ(T paramT) {
    StringWriter stringWriter = new StringWriter();
    try {
      T t = paramT;
      StringWriter stringWriter1 = stringWriter;
      ٴۉ<T> ٴۉ1 = this;
      Ⴡ ⴡ = new Ⴡ(stringWriter1);
      ٴۉ1.ᐨẏ(ⴡ, t);
    } catch (IOException iOException) {
      throw new AssertionError(iOException);
    } 
    return stringWriter.toString();
  }
  
  public final ᐧｴ ᐨẏ(T paramT) {
    try {
      ʻḽ ʻḽ = new ʻḽ();
      ᐨẏ(ʻḽ, paramT);
      return ʻḽ.ᴵʖ();
    } catch (IOException iOException) {
      throw new ᙆ(iOException);
    } 
  }
  
  public abstract T ᐨẏ(יּ paramיּ);
  
  private T ᐨẏ(Reader paramReader) {
    יּ יּ = new יּ(paramReader);
    return ᐨẏ(יּ);
  }
  
  private T ᐨẏ(String paramString) {
    StringReader stringReader = new StringReader(paramString);
    ٴۉ<T> ٴۉ1 = this;
    יּ יּ = new יּ(stringReader);
    return ٴۉ1.ᐨẏ(יּ);
  }
  
  private T ᐨẏ(ᐧｴ paramᐧｴ) {
    try {
      ڍ ڍ = new ڍ(paramᐧｴ);
      return ᐨẏ(ڍ);
    } catch (IOException iOException) {
      throw new ᙆ(iOException);
    } 
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ٴۉ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */