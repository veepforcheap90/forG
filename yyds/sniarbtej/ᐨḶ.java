package yyds.sniarbtej;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class ᐨḶ<T> implements Iterator<T> {
  private T ʽ;
  
  private T ʾܪ;
  
  ᐨḶ(T paramT1, T paramT2) {
    this.ʽ = paramT1;
    this.ʾܪ = paramT2;
  }
  
  public final boolean hasNext() {
    return (this.ʽ != null);
  }
  
  public final T next() {
    if (this.ʽ == null)
      throw new NoSuchElementException(); 
    T t = this.ʽ;
    this.ʽ = this.ʾܪ;
    this.ʾܪ = null;
    return t;
  }
  
  public final void remove() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᐨḶ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */