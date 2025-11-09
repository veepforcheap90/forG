package yyds.sniarbtej;

import java.util.AbstractMap;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import ylt.pmn.zubdqvgt;

final class ˊᴬ extends AbstractMap<λ, λ> {
  final ˊᴬ ᐨẏ;
  
  final BitSet ᴵʖ;
  
  private Map<λ, λ> ﾞл;
  
  final λ ᐨẏ;
  
  ˊᴬ(ـไ paramـไ, ˊᴬ paramˊᴬ, BitSet paramBitSet) {
    ˊᴬ ˊᴬ1 = paramˊᴬ;
    while (ˊᴬ1 != null) {
      if (zubdqvgt.G(ˊᴬ1.ᴵʖ, paramBitSet)) {
        "嚦ᬝ?정碟䂃⪍댒䱿ὒ?旫暽薶䫰른䇢萝Ꮑ䪣揹「䯅".toCharArray()[19] = (char)("嚦ᬝ?정碟䂃⪍댒䱿ὒ?旫暽薶䫰른䇢萝Ꮑ䪣揹「䯅".toCharArray()[19] ^ 0xE3C);
        throw new IllegalArgumentException(ᐨẏ$ᐝт.W("嚦ᬝ?정碟䂃⪍댒䱿ὒ?旫暽薶䫰른䇢萝Ꮑ䪣揹「䯅".toCharArray(), (short)30417, (byte)0, (short)5) + paramBitSet);
      } 
      ـไ ـไ1 = ˊᴬ1.ᐨẏ;
    } 
    this.ᐨẏ = (ـไ)paramˊᴬ;
    this.ᴵʖ = paramBitSet;
    this.ᐨẏ = (paramˊᴬ == null) ? null : (ـไ)new λ();
    this.ﾞл = new HashMap<>();
    ˊᴬ1 = null;
    for (byte b = 0; b < ((ـс)(paramBitSet = paramـไ.ˊ)).ʿᵉ; b++) {
      Ӏ ӏ;
      if ((ӏ = paramـไ.ˊ.ᐨẏ(b)).ﹳיִ() == 8) {
        λ λ1;
        ӏ = ӏ;
        if (ˊᴬ1 == null)
          λ1 = new λ(); 
        this.ﾞл.put(ӏ, λ1);
      } else if (zubdqvgt.G(ᐨẏ(b), this)) {
        ˊᴬ1 = null;
      } 
    } 
  }
  
  final ˊᴬ ᐨẏ(int paramInt) {
    ـไ ـไ1;
    if (!this.ᴵʖ.get(paramInt))
      return null; 
    if (!this.ᐨẏ.ˊ.get(paramInt))
      return this; 
    ˊᴬ ˊᴬ1 = this;
    for (ـไ ـไ2 = this.ᐨẏ; ـไ2 != null; ـไ2 = ((ˊᴬ)ـไ2).ᐨẏ) {
      if (((ˊᴬ)ـไ2).ᴵʖ.get(paramInt))
        ـไ1 = ـไ2; 
    } 
    return (ˊᴬ)ـไ1;
  }
  
  final λ ᐨẏ(λ paramλ) {
    return (ᐨẏ(this.ᐨẏ.ˊ.ᐨẏ(paramλ))).ﾞл.get(paramλ);
  }
  
  final λ ˊ(λ paramλ) {
    return this.ﾞл.get(paramλ);
  }
  
  public final Set<Map.Entry<λ, λ>> entrySet() {
    throw new UnsupportedOperationException();
  }
  
  private λ ᐨẏ(Object paramObject) {
    return ᐨẏ((λ)paramObject);
  }
  
  public final boolean equals(Object paramObject) {
    throw new UnsupportedOperationException();
  }
  
  public final int hashCode() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˊᴬ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */