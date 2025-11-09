package yyds.sniarbtej;

import java.lang.reflect.Type;
import java.util.Map;
import ylt.pmn.zubdqvgt;

public final class ˏﾁ implements ˌ々 {
  private final ˍʶ ᐨẏ;
  
  private final boolean ιˠ;
  
  public ˏﾁ(ˍʶ paramˍʶ, boolean paramBoolean) {
    this.ᐨẏ = paramˍʶ;
    this.ιˠ = paramBoolean;
  }
  
  public final <T> ٴۉ<T> ᐨẏ(ˑĴ paramˑĴ, ʸ<T> paramʸ) {
    ʸ<T> ʸ1;
    Type type1 = (ʸ1 = paramʸ).ՙᗮ;
    Class<? super T> clazz = (ʸ1 = paramʸ).ᐨم;
    if (!Map.class.isAssignableFrom(clazz))
      return null; 
    clazz = (Class)ˑỲ.ᐨẏ(type1);
    Type[] arrayOfType = ˑỲ.ᐨẏ(type1, clazz);
    Type type2 = arrayOfType[0];
    ˑĴ ˑĴ1 = paramˑĴ;
    ˑĴ1 = (zubdqvgt.G(type2, boolean.class) || zubdqvgt.G(type2, Boolean.class)) ? (ˑĴ)ﾞｽ.ʾ : (ˑĴ)ˑĴ1.ᐨẏ(ʸ.ᐨẏ(type2));
    ٴۉ<?> ٴۉ = paramˑĴ.ᐨẏ(ʸ.ᐨẏ(arrayOfType[1]));
    ʿн<T> ʿн = this.ᐨẏ.ᐨẏ(paramʸ);
    ˏﮐ<Object, Object> ˏﮐ;
    return (ٴۉ)(ˏﮐ = new ˏﮐ<>(this, paramˑĴ, arrayOfType[0], (ٴۉ<?>)ˑĴ1, arrayOfType[1], ٴۉ, (ʿн)ʿн));
  }
  
  private static ٴۉ<?> ᐨẏ(ˑĴ paramˑĴ, Type paramType) {
    return (ٴۉ<?>)((zubdqvgt.G(paramType, boolean.class) || zubdqvgt.G(paramType, Boolean.class)) ? ﾞｽ.ʾ : paramˑĴ.ᐨẏ(ʸ.ᐨẏ(paramType)));
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˏﾁ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */