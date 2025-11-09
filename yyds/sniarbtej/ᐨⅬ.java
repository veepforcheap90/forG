package yyds.sniarbtej;

import java.lang.reflect.Type;
import ylt.pmn.zubdqvgt;

final class ᐨⅬ<T> extends ٴۉ<T> {
  private final ˑĴ ʿᵉ;
  
  private final ٴۉ<T> ˊ;
  
  private final Type ՙᗮ;
  
  ᐨⅬ(ˑĴ paramˑĴ, ٴۉ<T> paramٴۉ, Type paramType) {
    this.ʿᵉ = paramˑĴ;
    this.ˊ = paramٴۉ;
    this.ՙᗮ = paramType;
  }
  
  public final T ᐨẏ(יּ paramיּ) {
    return this.ˊ.ᐨẏ(paramיּ);
  }
  
  public final void ᐨẏ(Ⴡ paramჁ, T paramT) {
    ٴۉ<T> ٴۉ1 = this.ˊ;
    T t = paramT;
    Type<?> type = this.ՙᗮ;
    if (t != null && (zubdqvgt.G(type, Object.class) || type instanceof java.lang.reflect.TypeVariable || type instanceof Class))
      type = t.getClass(); 
    if (!zubdqvgt.G(type = type, this.ՙᗮ))
      if (ٴۉ1 = this.ʿᵉ.ᐨẏ((ʸ)ʸ.ᐨẏ(type)) instanceof ـᓶ && !(this.ˊ instanceof ـᓶ)) {
        ٴۉ1 = this.ˊ;
      } else {
        ٴۉ1 = ٴۉ1;
      }  
    ٴۉ1.ᐨẏ(paramჁ, paramT);
  }
  
  private static Type ᐨẏ(Type<?> paramType, Object paramObject) {
    if (paramObject != null && (zubdqvgt.G(paramType, Object.class) || paramType instanceof java.lang.reflect.TypeVariable || paramType instanceof Class))
      paramType = paramObject.getClass(); 
    return paramType;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᐨⅬ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */