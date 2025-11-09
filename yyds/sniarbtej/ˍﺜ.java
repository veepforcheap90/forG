package yyds.sniarbtej;

final class ˍﺜ<T> extends ٴۉ<T> {
  ٴۉ<T> ˊ;
  
  public final void ᐨẏ(ٴۉ<T> paramٴۉ) {
    if (this.ˊ != null)
      throw new AssertionError(); 
    this.ˊ = paramٴۉ;
  }
  
  public final T ᐨẏ(יּ paramיּ) {
    if (this.ˊ == null)
      throw new IllegalStateException(); 
    return this.ˊ.ᐨẏ(paramיּ);
  }
  
  public final void ᐨẏ(Ⴡ paramჁ, T paramT) {
    if (this.ˊ == null)
      throw new IllegalStateException(); 
    this.ˊ.ᐨẏ(paramჁ, paramT);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˍﺜ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */