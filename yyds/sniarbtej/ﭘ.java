package yyds.sniarbtej;

import java.math.BigDecimal;
import java.math.BigInteger;
import ylt.pmn.zubdqvgt;

public final class ﭘ extends ᐧｴ {
  private static final Class<?>[] ᐨẏ = new Class[] { 
      int.class, long.class, short.class, float.class, double.class, byte.class, boolean.class, char.class, Integer.class, Long.class, 
      Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class };
  
  public Object ﾞл;
  
  public ﭘ(Boolean paramBoolean) {
    ᐨم(paramBoolean);
  }
  
  public ﭘ(Number paramNumber) {
    ᐨم(paramNumber);
  }
  
  public ﭘ(String paramString) {
    ᐨم(paramString);
  }
  
  public ﭘ(Character paramCharacter) {
    ᐨم(paramCharacter);
  }
  
  ﭘ(Object paramObject) {
    ᐨم(paramObject);
  }
  
  private ﭘ ˊ() {
    return this;
  }
  
  private void ᐨم(Object paramObject) {
    char c;
    if (paramObject instanceof Character) {
      c = ((Character)paramObject).charValue();
      this.ﾞл = String.valueOf(c);
      return;
    } 
    ˌᑦ.ﾞл((c instanceof Number || ᐨẏ(c)));
    this.ﾞл = c;
  }
  
  public final boolean ᔪ() {
    return this.ﾞл instanceof Boolean;
  }
  
  final Boolean ᐨẏ() {
    return (Boolean)this.ﾞл;
  }
  
  public final boolean ᴵƚ() {
    ﭘ ﭘ1;
    return ((ﭘ1 = this).ﾞл instanceof Boolean) ? ((Boolean)(ﭘ1 = this).ﾞл).booleanValue() : Boolean.parseBoolean(ᐨم());
  }
  
  public final boolean ʿλ() {
    return this.ﾞл instanceof Number;
  }
  
  public final Number ᐨẏ() {
    return (this.ﾞл instanceof String) ? new ˌﺙ((String)this.ﾞл) : (Number)this.ﾞл;
  }
  
  public final boolean ˉｓ() {
    return this.ﾞл instanceof String;
  }
  
  public final String ᐨم() {
    ﭘ ﭘ1;
    return ((ﭘ1 = this).ﾞл instanceof Number) ? ᐨẏ().toString() : (((ﭘ1 = this).ﾞл instanceof Boolean) ? ((Boolean)(ﭘ1 = this).ﾞл).toString() : (String)this.ﾞл);
  }
  
  public final double ᐨẏ() {
    ﭘ ﭘ1;
    return ((ﭘ1 = this).ﾞл instanceof Number) ? ᐨẏ().doubleValue() : Double.parseDouble(ᐨم());
  }
  
  public final BigDecimal ᐨẏ() {
    return (this.ﾞл instanceof BigDecimal) ? (BigDecimal)this.ﾞл : new BigDecimal(this.ﾞл.toString());
  }
  
  public final BigInteger ᐨẏ() {
    return (this.ﾞл instanceof BigInteger) ? (BigInteger)this.ﾞл : new BigInteger(this.ﾞл.toString());
  }
  
  public final float ᐨẏ() {
    ﭘ ﭘ1;
    return ((ﭘ1 = this).ﾞл instanceof Number) ? ᐨẏ().floatValue() : Float.parseFloat(ᐨم());
  }
  
  public final long ˊ() {
    ﭘ ﭘ1;
    return ((ﭘ1 = this).ﾞл instanceof Number) ? ᐨẏ().longValue() : Long.parseLong(ᐨم());
  }
  
  public final short ᐨẏ() {
    ﭘ ﭘ1;
    return ((ﭘ1 = this).ﾞл instanceof Number) ? ᐨẏ().shortValue() : Short.parseShort(ᐨم());
  }
  
  public final int ٴᖟ() {
    ﭘ ﭘ1;
    return ((ﭘ1 = this).ﾞл instanceof Number) ? ᐨẏ().intValue() : Integer.parseInt(ᐨم());
  }
  
  public final byte ᐨẏ() {
    ﭘ ﭘ1;
    return ((ﭘ1 = this).ﾞл instanceof Number) ? ᐨẏ().byteValue() : Byte.parseByte(ᐨم());
  }
  
  public final char ᐨẏ() {
    return ᐨم().charAt(0);
  }
  
  private static boolean ᐨẏ(Object<?> paramObject) {
    if (paramObject instanceof String)
      return true; 
    paramObject = (Object<?>)paramObject.getClass();
    Class<?>[] arrayOfClass;
    int i = (arrayOfClass = ᐨẏ).length;
    for (byte b = 0; b < i; b++) {
      Class<?> clazz;
      if ((clazz = arrayOfClass[b]).isAssignableFrom((Class<?>)paramObject))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return (this.ﾞл == null) ? 31 : (ᐨẏ(this) ? (int)((l = ᐨẏ().longValue()) ^ l >>> 32L) : ((this.ﾞл instanceof Number) ? (int)((l = Double.doubleToLongBits(ᐨẏ().doubleValue())) ^ l >>> 32L) : this.ﾞл.hashCode()));
  }
  
  public final boolean equals(Object paramObject) {
    if (zubdqvgt.G(this, paramObject))
      return true; 
    if (paramObject == null || !zubdqvgt.G(getClass(), paramObject.getClass()))
      return false; 
    paramObject = paramObject;
    if (this.ﾞл == null)
      return (((ﭘ)paramObject).ﾞл == null); 
    if (ᐨẏ(this) && ᐨẏ((ﭘ)paramObject))
      return (ᐨẏ().longValue() == paramObject.ᐨẏ().longValue()); 
    if (this.ﾞл instanceof Number && ((ﭘ)paramObject).ﾞл instanceof Number) {
      double d1 = ᐨẏ().doubleValue();
      double d2 = paramObject.ᐨẏ().doubleValue();
      return (d1 == d2 || (Double.isNaN(d1) && Double.isNaN(d2)));
    } 
    return this.ﾞл.equals(((ﭘ)paramObject).ﾞл);
  }
  
  private static boolean ᐨẏ(ﭘ paramﭘ) {
    return (paramﭘ.ﾞл instanceof Number) ? ((number = (Number)paramﭘ.ﾞл instanceof BigInteger || number instanceof Long || number instanceof Integer || number instanceof Short || number instanceof Byte)) : false;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ﭘ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */