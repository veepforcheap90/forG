package yyds.sniarbtej;

import java.util.Iterator;
import java.util.ListIterator;
import ylt.pmn.zubdqvgt;

public final class ـс implements Iterable<Ӏ> {
  public int ʿᵉ;
  
  public Ӏ ᴵʖ;
  
  public Ӏ ﾞл;
  
  public Ӏ[] ᐨẏ;
  
  public final int size() {
    return this.ʿᵉ;
  }
  
  public final Ӏ ᴵʖ() {
    return this.ᴵʖ;
  }
  
  public final Ӏ ﾞл() {
    return this.ﾞл;
  }
  
  public final Ӏ ᐨẏ(int paramInt) {
    if (paramInt < 0 || paramInt >= this.ʿᵉ)
      throw new IndexOutOfBoundsException(); 
    if (this.ᐨẏ == null)
      this.ᐨẏ = ᐨẏ(); 
    return this.ᐨẏ[paramInt];
  }
  
  private boolean ᐨẏ(Ӏ paramӀ) {
    Ӏ ӏ;
    for (ӏ = this.ᴵʖ; ӏ != null && !zubdqvgt.G(ӏ, paramӀ); ӏ = ӏ.ˊ);
    return (ӏ != null);
  }
  
  public final int ᐨẏ(Ӏ paramӀ) {
    if (this.ᐨẏ == null)
      this.ᐨẏ = ᐨẏ(); 
    return paramӀ.ͺᴲ;
  }
  
  public final void ᐨẏ(ˉｓ paramˉｓ) {
    for (Ӏ ӏ = this.ᴵʖ; ӏ != null; ӏ = ӏ.ˊ)
      ӏ.ᐨẏ(paramˉｓ); 
  }
  
  public final ListIterator<Ӏ> ᐨẏ() {
    boolean bool = false;
    ـс ـс1 = this;
    return new יς(ـс1, 0);
  }
  
  private ListIterator<Ӏ> ᐨẏ(int paramInt) {
    return new יς(this, 0);
  }
  
  public final Ӏ[] ᐨẏ() {
    byte b = 0;
    Ӏ ӏ = this.ᴵʖ;
    Ӏ[] arrayOfӀ = new Ӏ[this.ʿᵉ];
    while (ӏ != null) {
      arrayOfӀ[b] = ӏ;
      ӏ.ͺᴲ = b++;
      ӏ = ӏ.ˊ;
    } 
    return arrayOfӀ;
  }
  
  public final void ᐨẏ(Ӏ paramӀ1, Ӏ paramӀ2) {
    Ӏ ӏ = paramӀ1.ˊ;
    paramӀ2.ˊ = ӏ;
    if (ӏ != null) {
      ӏ.ᐨẏ = paramӀ2;
    } else {
      this.ﾞл = paramӀ2;
    } 
    ӏ = paramӀ1.ᐨẏ;
    paramӀ2.ᐨẏ = ӏ;
    if (ӏ != null) {
      ӏ.ˊ = paramӀ2;
    } else {
      this.ᴵʖ = paramӀ2;
    } 
    if (this.ᐨẏ != null) {
      int i = paramӀ1.ͺᴲ;
      this.ᐨẏ[i] = paramӀ2;
      paramӀ2.ͺᴲ = i;
    } else {
      paramӀ2.ͺᴲ = 0;
    } 
    paramӀ1.ͺᴲ = -1;
    paramӀ1.ᐨẏ = null;
    paramӀ1.ˊ = null;
  }
  
  public final void ᐨẏ(Ӏ paramӀ) {
    this.ʿᵉ++;
    if (this.ﾞл == null) {
      this.ᴵʖ = paramӀ;
      this.ﾞл = paramӀ;
    } else {
      this.ﾞл.ˊ = paramӀ;
      paramӀ.ᐨẏ = this.ﾞл;
    } 
    this.ﾞл = paramӀ;
    this.ᐨẏ = null;
    paramӀ.ͺᴲ = 0;
  }
  
  private void ᐨẏ(ـс paramـс) {
    if (paramـс.ʿᵉ == 0)
      return; 
    this.ʿᵉ += paramـс.ʿᵉ;
    if (this.ﾞл == null) {
      this.ᴵʖ = paramـс.ᴵʖ;
      this.ﾞл = paramـс.ﾞл;
    } else {
      Ӏ ӏ = paramـс.ᴵʖ;
      this.ﾞл.ˊ = ӏ;
      ӏ.ᐨẏ = this.ﾞл;
      this.ﾞл = paramـс.ﾞл;
    } 
    this.ᐨẏ = null;
    paramـс.ˊ(false);
  }
  
  private void ˊ(Ӏ paramӀ) {
    this.ʿᵉ++;
    if (this.ᴵʖ == null) {
      this.ᴵʖ = paramӀ;
      this.ﾞл = paramӀ;
    } else {
      this.ᴵʖ.ᐨẏ = paramӀ;
      paramӀ.ˊ = this.ᴵʖ;
    } 
    this.ᴵʖ = paramӀ;
    this.ᐨẏ = null;
    paramӀ.ͺᴲ = 0;
  }
  
  public final void ˊ(ـс paramـс) {
    if (paramـс.ʿᵉ == 0)
      return; 
    this.ʿᵉ += paramـс.ʿᵉ;
    if (this.ᴵʖ == null) {
      this.ᴵʖ = paramـс.ᴵʖ;
      this.ﾞл = paramـс.ﾞл;
    } else {
      Ӏ ӏ = paramـс.ﾞл;
      this.ᴵʖ.ᐨẏ = ӏ;
      ӏ.ˊ = this.ᴵʖ;
      this.ᴵʖ = paramـс.ᴵʖ;
    } 
    this.ᐨẏ = null;
    paramـс.ˊ(false);
  }
  
  public final void ˊ(Ӏ paramӀ1, Ӏ paramӀ2) {
    this.ʿᵉ++;
    Ӏ ӏ;
    if ((ӏ = paramӀ1.ˊ) == null) {
      this.ﾞл = paramӀ2;
    } else {
      ӏ.ᐨẏ = paramӀ2;
    } 
    paramӀ1.ˊ = paramӀ2;
    paramӀ2.ˊ = ӏ;
    paramӀ2.ᐨẏ = paramӀ1;
    this.ᐨẏ = null;
    paramӀ2.ͺᴲ = 0;
  }
  
  public final void ᐨẏ(Ӏ paramӀ, ـс paramـс) {
    if (paramـс.ʿᵉ == 0)
      return; 
    this.ʿᵉ += paramـс.ʿᵉ;
    Ӏ ӏ1 = paramـс.ᴵʖ;
    Ӏ ӏ2 = paramـс.ﾞл;
    Ӏ ӏ3;
    if ((ӏ3 = paramӀ.ˊ) == null) {
      this.ﾞл = ӏ2;
    } else {
      ӏ3.ᐨẏ = ӏ2;
    } 
    paramӀ.ˊ = ӏ1;
    ӏ2.ˊ = ӏ3;
    ӏ1.ᐨẏ = paramӀ;
    this.ᐨẏ = null;
    paramـс.ˊ(false);
  }
  
  public final void ᴵʖ(Ӏ paramӀ1, Ӏ paramӀ2) {
    this.ʿᵉ++;
    Ӏ ӏ;
    if ((ӏ = paramӀ1.ᐨẏ) == null) {
      this.ᴵʖ = paramӀ2;
    } else {
      ӏ.ˊ = paramӀ2;
    } 
    paramӀ1.ᐨẏ = paramӀ2;
    paramӀ2.ˊ = paramӀ1;
    paramӀ2.ᐨẏ = ӏ;
    this.ᐨẏ = null;
    paramӀ2.ͺᴲ = 0;
  }
  
  private void ˊ(Ӏ paramӀ, ـс paramـс) {
    if (paramـс.ʿᵉ == 0)
      return; 
    this.ʿᵉ += paramـс.ʿᵉ;
    Ӏ ӏ1 = paramـс.ᴵʖ;
    Ӏ ӏ2 = paramـс.ﾞл;
    Ӏ ӏ3;
    if ((ӏ3 = paramӀ.ᐨẏ) == null) {
      this.ᴵʖ = ӏ1;
    } else {
      ӏ3.ˊ = ӏ1;
    } 
    paramӀ.ᐨẏ = ӏ2;
    ӏ2.ˊ = paramӀ;
    ӏ1.ᐨẏ = ӏ3;
    this.ᐨẏ = null;
    paramـс.ˊ(false);
  }
  
  public final void ᴵʖ(Ӏ paramӀ) {
    this.ʿᵉ--;
    Ӏ ӏ1 = paramӀ.ˊ;
    Ӏ ӏ2 = paramӀ.ᐨẏ;
    if (ӏ1 == null) {
      if (ӏ2 == null) {
        this.ᴵʖ = null;
        this.ﾞл = null;
      } else {
        ӏ2.ˊ = null;
        this.ﾞл = ӏ2;
      } 
    } else if (ӏ2 == null) {
      this.ᴵʖ = ӏ1;
      ӏ1.ᐨẏ = null;
    } else {
      ӏ2.ˊ = ӏ1;
      ӏ1.ᐨẏ = ӏ2;
    } 
    this.ᐨẏ = null;
    paramӀ.ͺᴲ = -1;
    paramӀ.ᐨẏ = null;
    paramӀ.ˊ = null;
  }
  
  public final void ˊ(boolean paramBoolean) {
    this.ʿᵉ = 0;
    this.ᴵʖ = null;
    this.ﾞл = null;
    this.ᐨẏ = null;
  }
  
  private void clear() {
    ˊ(false);
  }
  
  public final void ʻᒱ() {
    for (Ӏ ӏ = this.ᴵʖ; ӏ != null; ӏ = ӏ.ˊ) {
      if (ӏ instanceof λ) {
        λ λ;
        (λ = (λ)ӏ).ͺо = null;
      } 
    } 
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ـс.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */