package yyds.sniarbtej;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import ylt.pmn.zubdqvgt;

public final class ʹﭴ extends ٴۉ<Date> {
  public static final ˌ々 ˊ = new ˈट();
  
  private final DateFormat ᐨẏ = DateFormat.getDateTimeInstance(2, 2, Locale.US);
  
  private final DateFormat ˊ = DateFormat.getDateTimeInstance(2, 2);
  
  private Date ᐨẏ(יּ paramיּ) {
    if (zubdqvgt.G(paramיּ.ᐨẏ(), כ.ʽ)) {
      paramיּ.ۦ();
      return null;
    } 
    return ᐨẏ(paramיּ.ٴӵ());
  }
  
  private synchronized Date ᐨẏ(String paramString) {
    try {
      return this.ˊ.parse(paramString);
    } catch (ParseException parseException) {
      try {
        return this.ᐨẏ.parse(paramString);
      } catch (ParseException parseException1) {
        try {
          return ʹᔭ.ᐨẏ(paramString, new ParsePosition(0));
        } catch (ParseException parseException2) {
          throw new ՙĩ(paramString, parseException2);
        } 
      } 
    } 
  }
  
  private synchronized void ᐨẏ(Ⴡ paramჁ, Date paramDate) {
    if (paramDate == null) {
      paramჁ.ʿᵉ();
      return;
    } 
    String str = this.ᐨẏ.format(paramDate);
    paramჁ.ˊ(str);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ʹﭴ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */