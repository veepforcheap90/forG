package yyds.sniarbtej;

import java.util.Locale;
import java.util.StringTokenizer;
import ylt.pmn.zubdqvgt;

final class ـІ extends ٴۉ<Locale> {
  private static Locale ᐨẏ(יּ paramיּ) {
    if (zubdqvgt.G(paramיּ.ᐨẏ(), כ.ʽ)) {
      paramיּ.ۦ();
      return null;
    } 
    String str1 = paramיּ.ٴӵ();
    "糔Σ".toCharArray()[0] = (char)("糔Σ".toCharArray()[0] ^ 0xA27);
    StringTokenizer stringTokenizer = new StringTokenizer(str1, ˉﻤ$ͺſ.v("糔Σ".toCharArray(), (short)4874, 1, (short)1));
    String str2 = null;
    String str3 = null;
    String str4 = null;
    if (stringTokenizer.hasMoreElements())
      str2 = stringTokenizer.nextToken(); 
    if (stringTokenizer.hasMoreElements())
      str3 = stringTokenizer.nextToken(); 
    if (stringTokenizer.hasMoreElements())
      str4 = stringTokenizer.nextToken(); 
    return (str3 == null && str4 == null) ? new Locale(str2) : ((str4 == null) ? new Locale(str2, str3) : new Locale(str2, str3, str4));
  }
  
  private static void ᐨẏ(Ⴡ paramჁ, Locale paramLocale) {
    paramჁ.ˊ((paramLocale == null) ? null : paramLocale.toString());
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ـІ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */