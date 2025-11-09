package yyds.sniarbtej;

import java.lang.reflect.Type;
import java.util.Collection;

public final class ˑє implements ˌ々 {
  private final ˍʶ ᐨẏ;
  
  public ˑє(ˍʶ paramˍʶ) {
    this.ᐨẏ = paramˍʶ;
  }
  
  public final <T> ٴۉ<T> ᐨẏ(ˑĴ paramˑĴ, ʸ<T> paramʸ) {
    ʸ<T> ʸ1;
    Type type = (ʸ1 = paramʸ).ՙᗮ;
    Class<? super T> clazz = (ʸ1 = paramʸ).ᐨم;
    if (!Collection.class.isAssignableFrom(clazz))
      return null; 
    type = ˑỲ.ᐨẏ(type, clazz);
    ٴۉ<?> ٴۉ = paramˑĴ.ᐨẏ(ʸ.ᐨẏ(type));
    ʿн<T> ʿн = this.ᐨẏ.ᐨẏ(paramʸ);
    ͺſ<T> ͺſ;
    return ͺſ = new ͺſ(paramˑĴ, type, ٴۉ, (ʿн)ʿн);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˑє.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */