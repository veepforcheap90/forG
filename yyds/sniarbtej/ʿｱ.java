package yyds.sniarbtej;

import java.util.ArrayList;
import java.util.List;
import ylt.pmn.zubdqvgt;

final class ʿｱ {
  private λ ᴵʖ;
  
  private boolean[] ˊ;
  
  private List<ʿশ> ʹл;
  
  ʿｱ(λ paramλ, int paramInt, ʿশ paramʿশ) {
    this.ᴵʖ = paramλ;
    this.ˊ = new boolean[paramInt];
    this.ʹл = new ArrayList<>();
    this.ʹл.add(paramʿশ);
  }
  
  ʿｱ(ʿｱ paramʿｱ) {
    this.ᴵʖ = paramʿｱ.ᴵʖ;
    this.ˊ = (boolean[])paramʿｱ.ˊ.clone();
    this.ʹл = new ArrayList<>(paramʿｱ.ʹл);
  }
  
  public final boolean ᐨẏ(ʿｱ paramʿｱ) {
    boolean bool = false;
    byte b;
    for (b = 0; b < this.ˊ.length; b++) {
      if (paramʿｱ.ˊ[b] && !this.ˊ[b]) {
        this.ˊ[b] = true;
        bool = true;
      } 
    } 
    if (zubdqvgt.G(paramʿｱ.ᴵʖ, this.ᴵʖ))
      for (b = 0; b < paramʿｱ.ʹл.size(); b++) {
        ʿশ ʿশ = paramʿｱ.ʹл.get(b);
        if (!this.ʹл.contains(ʿশ)) {
          this.ʹл.add(ʿশ);
          bool = true;
        } 
      }  
    return bool;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ʿｱ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */