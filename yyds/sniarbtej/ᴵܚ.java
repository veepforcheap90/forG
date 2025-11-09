package yyds.sniarbtej;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class ᴵܚ extends AbstractSet<Map.Entry<K, V>> {
  ᴵܚ(ᐝᎫ paramᐝᎫ) {}
  
  public final int size() {
    return this.ᐨẏ.ʿᵉ;
  }
  
  public final Iterator<Map.Entry<K, V>> iterator() {
    return new ιっ(this);
  }
  
  public final boolean contains(Object paramObject) {
    return (paramObject instanceof Map.Entry && this.ᐨẏ.ᐨẏ((Map.Entry<?, ?>)paramObject) != null);
  }
  
  public final boolean remove(Object paramObject) {
    if (!(paramObject instanceof Map.Entry))
      return false; 
    if ((paramObject = this.ᐨẏ.ᐨẏ((Map.Entry<?, ?>)paramObject)) == null)
      return false; 
    this.ᐨẏ.ᐨẏ((ـᔭ)paramObject, true);
    return true;
  }
  
  public final void clear() {
    this.ᐨẏ.clear();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᴵܚ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */