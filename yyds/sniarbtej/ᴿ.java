package yyds.sniarbtej;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import ylt.pmn.zubdqvgt;

public final class ᴿ extends ٴۉ<Time> {
  private static ˌ々 ˊ;
  
  private final DateFormat ᴵʖ;
  
  public ᴿ() {
    "蹚怆ᝲ쬡菥㠷垆洂숰㣬".toCharArray()[7] = (char)("蹚怆ᝲ쬡菥㠷垆洂숰㣬".toCharArray()[7] ^ 0x125F);
    this.ᴵʖ = new SimpleDateFormat(ˍɫ$יς.J("蹚怆ᝲ쬡菥㠷垆洂숰㣬".toCharArray(), (short)21995, (short)1, (byte)3));
  }
  
  private synchronized Time ᐨẏ(יּ paramיּ) {
    if (zubdqvgt.G(paramיּ.ᐨẏ(), כ.ʽ)) {
      paramיּ.ۦ();
      return null;
    } 
    try {
      Date date = this.ᴵʖ.parse(paramיּ.ٴӵ());
      return new Time(date.getTime());
    } catch (ParseException parseException) {
      throw new ՙĩ(parseException);
    } 
  }
  
  private synchronized void ᐨẏ(Ⴡ paramჁ, Time paramTime) {
    paramჁ.ˊ((paramTime == null) ? null : this.ᴵʖ.format(paramTime));
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᴿ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */