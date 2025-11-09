package yyds.sniarbtej;

import java.util.Map;

public final class λ extends Ӏ {
  ᔪ ͺо;
  
  public λ() {
    super(-1);
  }
  
  private λ(ᔪ paramᔪ) {
    super(-1);
    this.ͺо = paramᔪ;
  }
  
  public final int ﹳיִ() {
    return 8;
  }
  
  public final ᔪ ﾞл() {
    if (this.ͺо == null)
      this.ͺо = new ᔪ(); 
    return this.ͺо;
  }
  
  public final void ᐨẏ(ˉｓ paramˉｓ) {
    paramˉｓ.ˊ(ﾞл());
  }
  
  public final Ӏ ᐨẏ(Map<λ, λ> paramMap) {
    return paramMap.get(this);
  }
  
  public final void ﹳܕ() {
    this.ͺо = null;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\λ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */