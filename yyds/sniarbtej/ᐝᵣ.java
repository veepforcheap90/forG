package yyds.sniarbtej;

final class ᐝᵣ {
  private ᔪ ᴵʖ;
  
  private ᔪ ﾞл;
  
  private ᔪ ʿᵉ;
  
  private int ڊ;
  
  private String ﹳיִ;
  
  private ᐝᵣ ᐨẏ;
  
  ᐝᵣ(ᔪ paramᔪ1, ᔪ paramᔪ2, ᔪ paramᔪ3, int paramInt, String paramString) {
    this.ᴵʖ = paramᔪ1;
    this.ﾞл = paramᔪ2;
    this.ʿᵉ = paramᔪ3;
    this.ڊ = paramInt;
    this.ﹳיִ = paramString;
  }
  
  private ᐝᵣ(ᐝᵣ paramᐝᵣ, ᔪ paramᔪ1, ᔪ paramᔪ2) {
    this(paramᔪ1, paramᔪ2, paramᐝᵣ.ʿᵉ, paramᐝᵣ.ڊ, paramᐝᵣ.ﹳיִ);
    this.ᐨẏ = paramᐝᵣ.ᐨẏ;
  }
  
  static ᐝᵣ ᐨẏ(ᐝᵣ paramᐝᵣ, ᔪ paramᔪ1, ᔪ paramᔪ2) {
    if (paramᐝᵣ == null)
      return null; 
    paramᐝᵣ.ᐨẏ = ᐨẏ(paramᐝᵣ.ᐨẏ, paramᔪ1, paramᔪ2);
    int i = paramᐝᵣ.ᴵʖ.ʻบ;
    int j = paramᐝᵣ.ﾞл.ʻบ;
    int k = paramᔪ1.ʻบ;
    int m = (paramᔪ2 == null) ? Integer.MAX_VALUE : paramᔪ2.ʻบ;
    if (k >= j || m <= i)
      return paramᐝᵣ; 
    if (k <= i)
      return (m >= j) ? paramᐝᵣ.ᐨẏ : new ᐝᵣ(paramᐝᵣ, paramᔪ2, paramᐝᵣ.ﾞл); 
    if (m >= j)
      return new ᐝᵣ(paramᐝᵣ, paramᐝᵣ.ᴵʖ, paramᔪ1); 
    paramᐝᵣ.ᐨẏ = new ᐝᵣ(paramᐝᵣ, paramᔪ2, paramᐝᵣ.ﾞл);
    return new ᐝᵣ(paramᐝᵣ, paramᐝᵣ.ᴵʖ, paramᔪ1);
  }
  
  static int ᐨẏ(ᐝᵣ paramᐝᵣ) {
    byte b = 0;
    for (paramᐝᵣ = paramᐝᵣ; paramᐝᵣ != null; paramᐝᵣ = paramᐝᵣ.ᐨẏ)
      b++; 
    return b;
  }
  
  static int ˊ(ᐝᵣ paramᐝᵣ) {
    return 2 + 8 * ᐨẏ(paramᐝᵣ);
  }
  
  static void ᐨẏ(ᐝᵣ paramᐝᵣ, ʿᵉ paramʿᵉ) {
    paramʿᵉ.ˊ(ᐨẏ(paramᐝᵣ));
    for (paramᐝᵣ = paramᐝᵣ; paramᐝᵣ != null; paramᐝᵣ = paramᐝᵣ.ᐨẏ)
      paramʿᵉ.ˊ(paramᐝᵣ.ᴵʖ.ʻบ).ˊ(paramᐝᵣ.ﾞл.ʻบ).ˊ(paramᐝᵣ.ʿᵉ.ʻบ).ˊ(paramᐝᵣ.ڊ); 
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᐝᵣ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */