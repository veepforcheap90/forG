package yyds.sniarbtej;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ylt.pmn.zubdqvgt;

public final class ˋℷ extends ᐧｴ implements Iterable<ᐧｴ> {
  private final List<ᐧｴ> ʻᒱ = new ArrayList<>();
  
  private ˋℷ ᐨẏ() {
    ˋℷ ˋℷ1 = new ˋℷ();
    for (ᐧｴ ᐧｴ1 : this.ʻᒱ)
      ˋℷ1.ᐨẏ(ᐧｴ1.ᐨẏ()); 
    return ˋℷ1;
  }
  
  private void ᐨẏ(Boolean paramBoolean) {
    this.ʻᒱ.add((paramBoolean == null) ? ڊ.ᐨẏ : new ﭘ(paramBoolean));
  }
  
  private void ᐨẏ(Character paramCharacter) {
    this.ʻᒱ.add((paramCharacter == null) ? ڊ.ᐨẏ : new ﭘ(paramCharacter));
  }
  
  private void ᐨẏ(Number paramNumber) {
    this.ʻᒱ.add((paramNumber == null) ? ڊ.ᐨẏ : new ﭘ(paramNumber));
  }
  
  private void ʿλ(String paramString) {
    this.ʻᒱ.add((paramString == null) ? ڊ.ᐨẏ : new ﭘ(paramString));
  }
  
  public final void ᐨẏ(ᐧｴ paramᐧｴ) {
    if (paramᐧｴ == null)
      paramᐧｴ = ڊ.ᐨẏ; 
    this.ʻᒱ.add(paramᐧｴ);
  }
  
  private void ᐨẏ(ˋℷ paramˋℷ) {
    this.ʻᒱ.addAll(paramˋℷ.ʻᒱ);
  }
  
  private ᐧｴ ᐨẏ(int paramInt, ᐧｴ paramᐧｴ) {
    return this.ʻᒱ.set(paramInt, paramᐧｴ);
  }
  
  private boolean ᐨẏ(ᐧｴ paramᐧｴ) {
    return this.ʻᒱ.remove(paramᐧｴ);
  }
  
  private ᐧｴ ᐨẏ(int paramInt) {
    return this.ʻᒱ.remove(paramInt);
  }
  
  private boolean ˊ(ᐧｴ paramᐧｴ) {
    return this.ʻᒱ.contains(paramᐧｴ);
  }
  
  private int size() {
    return this.ʻᒱ.size();
  }
  
  public final Iterator<ᐧｴ> iterator() {
    return this.ʻᒱ.iterator();
  }
  
  private ᐧｴ ˊ(int paramInt) {
    return this.ʻᒱ.get(paramInt);
  }
  
  public final Number ᐨẏ() {
    if (this.ʻᒱ.size() == 1)
      return ((ᐧｴ)this.ʻᒱ.get(0)).ᐨẏ(); 
    throw new IllegalStateException();
  }
  
  public final String ᐨم() {
    if (this.ʻᒱ.size() == 1)
      return ((ᐧｴ)this.ʻᒱ.get(0)).ᐨم(); 
    throw new IllegalStateException();
  }
  
  public final double ᐨẏ() {
    if (this.ʻᒱ.size() == 1)
      return ((ᐧｴ)this.ʻᒱ.get(0)).ᐨẏ(); 
    throw new IllegalStateException();
  }
  
  public final BigDecimal ᐨẏ() {
    if (this.ʻᒱ.size() == 1)
      return ((ᐧｴ)this.ʻᒱ.get(0)).ᐨẏ(); 
    throw new IllegalStateException();
  }
  
  public final BigInteger ᐨẏ() {
    if (this.ʻᒱ.size() == 1)
      return ((ᐧｴ)this.ʻᒱ.get(0)).ᐨẏ(); 
    throw new IllegalStateException();
  }
  
  public final float ᐨẏ() {
    if (this.ʻᒱ.size() == 1)
      return ((ᐧｴ)this.ʻᒱ.get(0)).ᐨẏ(); 
    throw new IllegalStateException();
  }
  
  public final long ˊ() {
    if (this.ʻᒱ.size() == 1)
      return ((ᐧｴ)this.ʻᒱ.get(0)).ˊ(); 
    throw new IllegalStateException();
  }
  
  public final int ٴᖟ() {
    if (this.ʻᒱ.size() == 1)
      return ((ᐧｴ)this.ʻᒱ.get(0)).ٴᖟ(); 
    throw new IllegalStateException();
  }
  
  public final byte ᐨẏ() {
    if (this.ʻᒱ.size() == 1)
      return ((ᐧｴ)this.ʻᒱ.get(0)).ᐨẏ(); 
    throw new IllegalStateException();
  }
  
  public final char ᐨẏ() {
    if (this.ʻᒱ.size() == 1)
      return ((ᐧｴ)this.ʻᒱ.get(0)).ᐨẏ(); 
    throw new IllegalStateException();
  }
  
  public final short ᐨẏ() {
    if (this.ʻᒱ.size() == 1)
      return ((ᐧｴ)this.ʻᒱ.get(0)).ᐨẏ(); 
    throw new IllegalStateException();
  }
  
  public final boolean ᴵƚ() {
    if (this.ʻᒱ.size() == 1)
      return ((ᐧｴ)this.ʻᒱ.get(0)).ᴵƚ(); 
    throw new IllegalStateException();
  }
  
  public final boolean equals(Object paramObject) {
    return (zubdqvgt.G(paramObject, this) || (paramObject instanceof ˋℷ && ((ˋℷ)paramObject).ʻᒱ.equals(this.ʻᒱ)));
  }
  
  public final int hashCode() {
    return this.ʻᒱ.hashCode();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˋℷ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */