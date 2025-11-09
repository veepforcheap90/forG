package yyds.sniarbtej;

import java.util.List;
import java.util.Map;

public final class יᔭ extends Ӏ {
  private int ˊﻠ;
  
  private int ᔇ;
  
  public λ ʿᵉ;
  
  public List<λ> ﾞл;
  
  public יᔭ(int paramInt1, int paramInt2, λ paramλ, λ... paramVarArgs) {
    super(170);
    this.ˊﻠ = paramInt1;
    this.ᔇ = paramInt2;
    this.ʿᵉ = paramλ;
    this.ﾞл = ٴᐤ.ᐨẏ(paramVarArgs);
  }
  
  public final int ﹳיִ() {
    return 11;
  }
  
  public final void ᐨẏ(ˉｓ paramˉｓ) {
    ᔪ[] arrayOfᔪ = new ᔪ[this.ﾞл.size()];
    byte b = 0;
    int i = arrayOfᔪ.length;
    while (b < i) {
      arrayOfᔪ[b] = ((λ)this.ﾞл.get(b)).ﾞл();
      b++;
    } 
    paramˉｓ.ᐨẏ(this.ˊﻠ, this.ᔇ, this.ʿᵉ.ﾞл(), arrayOfᔪ);
    ˊ(paramˉｓ);
  }
  
  public final Ӏ ᐨẏ(Map<λ, λ> paramMap) {
    return (new יᔭ(this.ˊﻠ, this.ᔇ, ᐨẏ(this.ʿᵉ, paramMap), ᐨẏ(this.ﾞл, paramMap))).ᐨẏ(this);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\יᔭ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */