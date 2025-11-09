package yyds.sniarbtej;

public class ˌᑦ {
  public final ᔪ ᴵʖ;
  
  public final ᔪ ﾞл;
  
  public final ᔪ ʿᵉ;
  
  public final int ڊ;
  
  public final String ﹳיִ;
  
  public ˌᑦ ᴵʖ;
  
  private ˌᑦ() {
    throw new UnsupportedOperationException();
  }
  
  public static <T> T ˊ(T paramT) {
    if (paramT == null)
      throw new NullPointerException(); 
    return paramT;
  }
  
  public static void ﾞл(boolean paramBoolean) {
    if (!paramBoolean)
      throw new IllegalArgumentException(); 
  }
  
  public ˌᑦ(ᔪ paramᔪ1, ᔪ paramᔪ2, ᔪ paramᔪ3, int paramInt, String paramString) {
    this.ᴵʖ = (ˌᑦ)paramᔪ1;
    this.ﾞл = paramᔪ2;
    this.ʿᵉ = paramᔪ3;
    this.ڊ = paramInt;
    this.ﹳיִ = paramString;
  }
  
  private ˌᑦ(ˌᑦ paramˌᑦ, ᔪ paramᔪ1, ᔪ paramᔪ2) {
    this(paramᔪ1, paramᔪ2, paramˌᑦ.ʿᵉ, paramˌᑦ.ڊ, paramˌᑦ.ﹳיִ);
    this.ᴵʖ = paramˌᑦ.ᴵʖ;
  }
  
  public static ˌᑦ ᐨẏ(ˌᑦ paramˌᑦ, ᔪ paramᔪ1, ᔪ paramᔪ2) {
    if (paramˌᑦ == null)
      return null; 
    paramˌᑦ.ᴵʖ = ᐨẏ(paramˌᑦ.ᴵʖ, paramᔪ1, paramᔪ2);
    int i = ((ᔪ)paramˌᑦ.ᴵʖ).ʻบ;
    int j = paramˌᑦ.ﾞл.ʻบ;
    int k = paramᔪ1.ʻบ;
    int m = (paramᔪ2 == null) ? Integer.MAX_VALUE : paramᔪ2.ʻบ;
    if (k >= j || m <= i)
      return paramˌᑦ; 
    if (k <= i)
      return (m >= j) ? paramˌᑦ.ᴵʖ : new ˌᑦ(paramˌᑦ, paramᔪ2, paramˌᑦ.ﾞл); 
    if (m >= j)
      return new ˌᑦ(paramˌᑦ, (ᔪ)paramˌᑦ.ᴵʖ, paramᔪ1); 
    paramˌᑦ.ᴵʖ = new ˌᑦ(paramˌᑦ, paramᔪ2, paramˌᑦ.ﾞл);
    return new ˌᑦ(paramˌᑦ, (ᔪ)paramˌᑦ.ᴵʖ, paramᔪ1);
  }
  
  public static int ᐨẏ(ˌᑦ paramˌᑦ) {
    byte b = 0;
    for (paramˌᑦ = paramˌᑦ; paramˌᑦ != null; paramˌᑦ = paramˌᑦ.ᴵʖ)
      b++; 
    return b;
  }
  
  public static int ˊ(ˌᑦ paramˌᑦ) {
    return 2 + 8 * ᐨẏ(paramˌᑦ);
  }
  
  public static void ᐨẏ(ˌᑦ paramˌᑦ, ʿᵉ paramʿᵉ) {
    paramʿᵉ.ˊ(ᐨẏ(paramˌᑦ));
    for (paramˌᑦ = paramˌᑦ; paramˌᑦ != null; paramˌᑦ = paramˌᑦ.ᴵʖ)
      paramʿᵉ.ˊ(((ᔪ)paramˌᑦ.ᴵʖ).ʻบ).ˊ(paramˌᑦ.ﾞл.ʻบ).ˊ(paramˌᑦ.ʿᵉ.ʻบ).ˊ(paramˌᑦ.ڊ); 
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˌᑦ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */