package yyds.sniarbtej;

import java.util.Set;

public final class ɟ implements ן {
  public final int ʿᵉ;
  
  public final Set<Ӏ> ᐨẏ;
  
  public ɟ(int paramInt) {
    this(paramInt, new ˊᕝ<>());
  }
  
  public ɟ(int paramInt, Ӏ paramӀ) {
    this.ʿᵉ = paramInt;
    this.ᐨẏ = new ˊᕝ<>(paramӀ);
  }
  
  public ɟ(int paramInt, Set<Ӏ> paramSet) {
    this.ʿᵉ = paramInt;
    this.ᐨẏ = paramSet;
  }
  
  public final int ˍɫ() {
    return this.ʿᵉ;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof ɟ))
      return false; 
    paramObject = paramObject;
    return (this.ʿᵉ == ((ɟ)paramObject).ʿᵉ && this.ᐨẏ.equals(((ɟ)paramObject).ᐨẏ));
  }
  
  public final int hashCode() {
    return this.ᐨẏ.hashCode();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ɟ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */