package yyds.sniarbtej;

import java.util.Iterator;
import java.util.Map;
import ylt.pmn.zubdqvgt;

public final class ـᓶ<T> extends ٴۉ<T> {
  private final ʿн<T> ᐨẏ;
  
  private final Map<String, ᖦ> ᴵƚ;
  
  private ـᓶ(ʿн<T> paramʿн, Map<String, ᖦ> paramMap) {
    this.ᐨẏ = paramʿн;
    this.ᴵƚ = paramMap;
  }
  
  public final T ᐨẏ(יּ paramיּ) {
    if (zubdqvgt.G(paramיּ.ᐨẏ(), כ.ʽ)) {
      paramיּ.ۦ();
      return null;
    } 
    T t = this.ᐨẏ.ʿᵉ();
    try {
      paramיּ.ᐨ();
      while (paramיּ.hasNext()) {
        String str = paramיּ.ͺо();
        ᖦ ᖦ;
        if ((ᖦ = this.ᴵƚ.get(str)) == null || !ᖦ.ﹳܕ) {
          paramיּ.ˏⅭ();
          continue;
        } 
        ᖦ.ᐨẏ(paramיּ, t);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw new ՙĩ(illegalStateException);
    } catch (IllegalAccessException illegalAccessException) {
      throw new AssertionError(illegalAccessException);
    } 
    paramיּ.ﾞঽ();
    return t;
  }
  
  public final void ᐨẏ(Ⴡ paramჁ, T paramT) {
    if (paramT == null) {
      paramჁ.ʿᵉ();
      return;
    } 
    paramჁ.ᴵʖ();
    try {
      Iterator<ᖦ> iterator = this.ᴵƚ.values().iterator();
      while (iterator.hasNext()) {
        ᖦ ᖦ;
        if ((ᖦ = iterator.next()).ˊ(paramT)) {
          paramჁ.ᐨẏ(ᖦ.name);
          ᖦ.ᐨẏ(paramჁ, paramT);
        } 
      } 
    } catch (IllegalAccessException illegalAccessException) {
      throw new AssertionError(illegalAccessException);
    } 
    paramჁ.ﾞл();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ـᓶ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */