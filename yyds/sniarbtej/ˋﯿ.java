package yyds.sniarbtej;

final class ˋﯿ implements CharSequence {
  char[] ˊ;
  
  public final int length() {
    return this.ˊ.length;
  }
  
  public final char charAt(int paramInt) {
    return this.ˊ[paramInt];
  }
  
  public final CharSequence subSequence(int paramInt1, int paramInt2) {
    return new String(this.ˊ, paramInt1, paramInt2 - paramInt1);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˋﯿ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */