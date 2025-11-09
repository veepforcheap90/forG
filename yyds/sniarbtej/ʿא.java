package yyds.sniarbtej;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class ʿא extends AbstractSet<Map.Entry<K, V>> {
  ʿא(ᐝʶ paramᐝʶ) {}
  
  public final int size() {
    return this.ˊ.ʿᵉ;
  }
  
  public final Iterator<Map.Entry<K, V>> iterator() {
    return new ﹹ(this);
  }
  
  public final boolean contains(Object paramObject) {
    return (paramObject instanceof Map.Entry && this.ˊ.ᐨẏ((Map.Entry<?, ?>)paramObject) != null);
  }
  
  public final boolean remove(Object paramObject) {
    if (!(paramObject instanceof Map.Entry))
      return false; 
    if ((paramObject = this.ˊ.ᐨẏ((Map.Entry<?, ?>)paramObject)) == null)
      return false; 
    this.ˊ.ᐨẏ((ˎǰ)paramObject, true);
    return true;
  }
  
  public final void clear() {
    this.ˊ.clear();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ʿא.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */