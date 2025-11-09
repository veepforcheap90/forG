package yyds.sniarbtej;

import java.io.Writer;

final class ŀ extends Writer {
  private final Appendable ᐨẏ;
  
  private final ˋﯿ ᐨẏ = new ˋﯿ();
  
  private ŀ(Appendable paramAppendable) {
    this.ᐨẏ = (ˋﯿ)paramAppendable;
  }
  
  public final void write(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    this.ᐨẏ.ˊ = paramArrayOfchar;
    this.ᐨẏ.append(this.ᐨẏ, paramInt1, paramInt1 + paramInt2);
  }
  
  public final void write(int paramInt) {
    this.ᐨẏ.append((char)paramInt);
  }
  
  public final void flush() {}
  
  public final void close() {}
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ŀ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */