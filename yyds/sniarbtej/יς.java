package yyds.sniarbtej;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import ylt.pmn.zubdqvgt;

final class יς implements ListIterator {
  private Ӏ ˊ;
  
  private Ӏ ᐨẏ;
  
  private Ӏ ʿᵉ;
  
  יς(ـс paramـс, int paramInt) {
    ـс ـс1;
    if (paramInt < 0 || paramInt > (ـс1 = paramـс).ʿᵉ)
      throw new IndexOutOfBoundsException(); 
    if (paramInt == (ـс1 = paramـс).ʿᵉ) {
      this.ˊ = null;
      this.ᐨẏ = (ـс)(ـс1 = paramـс).ﾞл;
      return;
    } 
    Ӏ ӏ = (paramـс = paramـс).ᴵʖ;
    for (byte b = 0; b < paramInt; b++)
      ӏ = ӏ.ˊ; 
    this.ˊ = ӏ;
    this.ᐨẏ = (ـс)ӏ.ᐨẏ;
  }
  
  public final boolean hasNext() {
    return (this.ˊ != null);
  }
  
  public final Object next() {
    if (this.ˊ == null)
      throw new NoSuchElementException(); 
    Ӏ ӏ = this.ˊ;
    this.ᐨẏ = (ـс)ӏ;
    this.ˊ = ӏ.ˊ;
    this.ʿᵉ = ӏ;
    return ӏ;
  }
  
  public final void remove() {
    if (this.ʿᵉ != null) {
      if (zubdqvgt.G(this.ʿᵉ, this.ˊ)) {
        this.ˊ = this.ˊ.ˊ;
      } else {
        this.ᐨẏ = (ـс)((Ӏ)this.ᐨẏ).ᐨẏ;
      } 
      Ӏ ӏ1 = this.ʿᵉ;
      ـс ـс1;
      (ـс1 = this.ᐨẏ).ʿᵉ--;
      Ӏ ӏ2 = ӏ1.ˊ;
      Ӏ ӏ3 = ӏ1.ᐨẏ;
      if (ӏ2 == null) {
        if (ӏ3 == null) {
          ـс1.ᴵʖ = null;
          ـс1.ﾞл = null;
        } else {
          ӏ3.ˊ = null;
          ـс1.ﾞл = ӏ3;
        } 
      } else if (ӏ3 == null) {
        ـс1.ᴵʖ = ӏ2;
        ӏ2.ᐨẏ = null;
      } else {
        ӏ3.ˊ = ӏ2;
        ӏ2.ᐨẏ = ӏ3;
      } 
      ـс1.ᐨẏ = null;
      ӏ1.ͺᴲ = -1;
      ӏ1.ᐨẏ = null;
      ӏ1.ˊ = null;
      this.ʿᵉ = null;
      return;
    } 
    throw new IllegalStateException();
  }
  
  public final boolean hasPrevious() {
    return (this.ᐨẏ != null);
  }
  
  public final Object previous() {
    if (this.ᐨẏ == null)
      throw new NoSuchElementException(); 
    ـс ـс1 = this.ᐨẏ;
    this.ˊ = (Ӏ)ـс1;
    this.ᐨẏ = (ـс)((Ӏ)ـс1).ᐨẏ;
    this.ʿᵉ = (Ӏ)ـс1;
    return ـс1;
  }
  
  public final int nextIndex() {
    if (this.ˊ == null) {
      ـс ـс1;
      return (ـс1 = this.ᐨẏ).ʿᵉ;
    } 
    if (this.ᐨẏ.ᐨẏ == null)
      this.ᐨẏ.ᐨẏ = this.ᐨẏ.ᐨẏ(); 
    return this.ˊ.ͺᴲ;
  }
  
  public final int previousIndex() {
    if (this.ᐨẏ == null)
      return -1; 
    if (this.ᐨẏ.ᐨẏ == null)
      this.ᐨẏ.ᐨẏ = this.ᐨẏ.ᐨẏ(); 
    return ((Ӏ)this.ᐨẏ).ͺᴲ;
  }
  
  public final void add(Object paramObject) {
    if (this.ˊ != null) {
      this.ᐨẏ.ᴵʖ(this.ˊ, (Ӏ)paramObject);
    } else if (this.ᐨẏ != null) {
      Ӏ ӏ1 = (Ӏ)paramObject;
      ـс ـс2 = this.ᐨẏ;
      ـс ـс1;
      (ـс1 = this.ᐨẏ).ʿᵉ++;
      Ӏ ӏ2;
      if ((ӏ2 = ((Ӏ)ـс2).ˊ) == null) {
        ـс1.ﾞл = ӏ1;
      } else {
        ӏ2.ᐨẏ = ӏ1;
      } 
      ((Ӏ)ـс2).ˊ = ӏ1;
      ӏ1.ˊ = ӏ2;
      ӏ1.ᐨẏ = (Ӏ)ـс2;
      ـс1.ᐨẏ = null;
      ӏ1.ͺᴲ = 0;
    } else {
      this.ᐨẏ.ᐨẏ((Ӏ)paramObject);
    } 
    this.ᐨẏ = (ـс)paramObject;
    this.ʿᵉ = null;
  }
  
  public final void set(Object paramObject) {
    if (this.ʿᵉ != null) {
      Ӏ ӏ2 = (Ӏ)paramObject;
      Ӏ ӏ1 = this.ʿᵉ;
      ـс ـс1 = this.ᐨẏ;
      Ӏ ӏ3 = ӏ1.ˊ;
      ӏ2.ˊ = ӏ3;
      if (ӏ3 != null) {
        ӏ3.ᐨẏ = ӏ2;
      } else {
        ـс1.ﾞл = ӏ2;
      } 
      ӏ3 = ӏ1.ᐨẏ;
      ӏ2.ᐨẏ = ӏ3;
      if (ӏ3 != null) {
        ӏ3.ˊ = ӏ2;
      } else {
        ـс1.ᴵʖ = ӏ2;
      } 
      if (ـс1.ᐨẏ != null) {
        int i = ӏ1.ͺᴲ;
        ـс1.ᐨẏ[i] = ӏ2;
        ӏ2.ͺᴲ = i;
      } else {
        ӏ2.ͺᴲ = 0;
      } 
      ӏ1.ͺᴲ = -1;
      ӏ1.ᐨẏ = null;
      ӏ1.ˊ = null;
      if (zubdqvgt.G(this.ʿᵉ, this.ᐨẏ)) {
        this.ᐨẏ = (ـс)paramObject;
        return;
      } 
      this.ˊ = (Ӏ)paramObject;
      return;
    } 
    throw new IllegalStateException();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\יς.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */