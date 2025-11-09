package yyds.sniarbtej;

import java.util.AbstractSet;
import java.util.Iterator;

final class ιะ extends AbstractSet<K> {
  ιะ(ᐝᎫ paramᐝᎫ) {}
  
  public final int size() {
    return this.ᐨẏ.ʿᵉ;
  }
  
  public final Iterator<K> iterator() {
    return new ﭕ(this);
  }
  
  public final boolean contains(Object paramObject) {
    return this.ᐨẏ.containsKey(paramObject);
  }
  
  public final boolean remove(Object paramObject) {
    return (this.ᐨẏ.ˊ(paramObject) != null);
  }
  
  public final void clear() {
    this.ᐨẏ.clear();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ιะ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */