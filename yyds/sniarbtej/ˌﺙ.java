package yyds.sniarbtej;

import java.math.BigDecimal;
import ylt.pmn.zubdqvgt;

public final class ˌﺙ extends Number {
  private final String ʹл;
  
  public ˌﺙ(String paramString) {
    this.ʹл = paramString;
  }
  
  public final int intValue() {
    try {
      return Integer.parseInt(this.ʹл);
    } catch (NumberFormatException numberFormatException) {
      try {
        return (int)Long.parseLong(this.ʹл);
      } catch (NumberFormatException numberFormatException1) {
        return (new BigDecimal(this.ʹл)).intValue();
      } 
    } 
  }
  
  public final long longValue() {
    try {
      return Long.parseLong(this.ʹл);
    } catch (NumberFormatException numberFormatException) {
      return (new BigDecimal(this.ʹл)).longValue();
    } 
  }
  
  public final float floatValue() {
    return Float.parseFloat(this.ʹл);
  }
  
  public final double doubleValue() {
    return Double.parseDouble(this.ʹл);
  }
  
  public final String toString() {
    return this.ʹл;
  }
  
  private Object ʹﮃ() {
    return new BigDecimal(this.ʹл);
  }
  
  public final int hashCode() {
    return this.ʹл.hashCode();
  }
  
  public final boolean equals(Object paramObject) {
    if (zubdqvgt.G(this, paramObject))
      return true; 
    if (paramObject instanceof ˌﺙ) {
      paramObject = paramObject;
      return (zubdqvgt.G(this.ʹл, ((ˌﺙ)paramObject).ʹл) || this.ʹл.equals(((ˌﺙ)paramObject).ʹл));
    } 
    return false;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˌﺙ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */