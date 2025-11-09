package yyds.sniarbtej;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

final class Ӵ extends ٴۉ<AtomicLongArray> {
  Ӵ(ٴۉ paramٴۉ) {}
  
  private void ᐨẏ(Ⴡ paramჁ, AtomicLongArray paramAtomicLongArray) {
    paramჁ.ᐨẏ();
    byte b = 0;
    int i = paramAtomicLongArray.length();
    while (b < i) {
      this.ᐨẏ.ᐨẏ(paramჁ, Long.valueOf(paramAtomicLongArray.get(b)));
      b++;
    } 
    paramჁ.ˊ();
  }
  
  private AtomicLongArray ᐨẏ(יּ paramיּ) {
    ArrayList<Long> arrayList = new ArrayList();
    paramיּ.ᵘ();
    while (paramיּ.hasNext()) {
      long l = ((Number)this.ᐨẏ.ᐨẏ(paramיּ)).longValue();
      arrayList.add(Long.valueOf(l));
    } 
    paramיּ.ˑܥ();
    int i = arrayList.size();
    AtomicLongArray atomicLongArray = new AtomicLongArray(i);
    for (byte b = 0; b < i; b++)
      atomicLongArray.set(b, ((Long)arrayList.get(b)).longValue()); 
    return atomicLongArray;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\Ӵ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */