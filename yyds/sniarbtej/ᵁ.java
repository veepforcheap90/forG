package yyds.sniarbtej;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ylt.pmn.zubdqvgt;

abstract class ᵁ<T> implements Iterator<T> {
  private ˎǰ<K, V> ᴵʖ = this.ˊ.ˊ.ᴵʖ;
  
  private ˎǰ<K, V> ﾞл = null;
  
  private int יᵉ = this.ˊ.יๆ;
  
  private ᵁ(ᐝʶ paramᐝʶ) {}
  
  public final boolean hasNext() {
    return !zubdqvgt.G(this.ᴵʖ, this.ˊ.ˊ);
  }
  
  final ˎǰ<K, V> ᐨẏ() {
    ˎǰ<K, V> ˎǰ1;
    if (zubdqvgt.G(ˎǰ1 = this.ᴵʖ, this.ˊ.ˊ))
      throw new NoSuchElementException(); 
    if (this.ˊ.יๆ != this.יᵉ)
      throw new ConcurrentModificationException(); 
    this.ᴵʖ = ˎǰ1.ᴵʖ;
    return this.ﾞл = ˎǰ1;
  }
  
  public final void remove() {
    if (this.ﾞл == null)
      throw new IllegalStateException(); 
    this.ˊ.ᐨẏ(this.ﾞл, true);
    this.ﾞл = null;
    this.יᵉ = this.ˊ.יๆ;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᵁ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */