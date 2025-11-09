package yyds.sniarbtej;

import ylt.pmn.zubdqvgt;

public final class ʴ extends ᐨẏ {
  private String ᴵʖ;
  
  private ᴵઽ ᐨẏ;
  
  @Deprecated
  private ʴ(ᐨẏ paramᐨẏ, ᴵઽ paramᴵઽ) {
    this((String)null, paramᐨẏ, paramᴵઽ);
  }
  
  private ʴ(String paramString, ᐨẏ paramᐨẏ, ᴵઽ paramᴵઽ) {
    this(589824, paramString, paramᐨẏ, paramᴵઽ);
  }
  
  @Deprecated
  private ʴ(int paramInt, ᐨẏ paramᐨẏ, ᴵઽ paramᴵઽ) {
    this(paramInt, null, paramᐨẏ, paramᴵઽ);
  }
  
  protected ʴ(int paramInt, String paramString, ᐨẏ paramᐨẏ, ᴵઽ paramᴵઽ) {
    super(paramInt, paramᐨẏ);
    this.ᴵʖ = paramString;
    this.ᐨẏ = paramᴵઽ;
  }
  
  public final void ᐨẏ(String paramString, Object paramObject) {
    super.ᐨẏ(ᐨẏ(paramString), this.ᐨẏ.ᐨẏ(paramObject));
  }
  
  public final void ᐨẏ(String paramString1, String paramString2, String paramString3) {
    super.ᐨẏ(ᐨẏ(paramString1), this.ᐨẏ.ˊ(paramString2), paramString3);
  }
  
  public final ᐨẏ ᐨẏ(String paramString1, String paramString2) {
    ᐨẏ ᐨẏ1;
    return ((ᐨẏ1 = super.ᐨẏ(ᐨẏ(paramString1), this.ᐨẏ.ˊ(paramString2))) == null) ? null : (zubdqvgt.G(ᐨẏ1, this.ᐨẏ) ? this : ᐨẏ(paramString2, ᐨẏ1));
  }
  
  public final ᐨẏ ᐨẏ(String paramString) {
    ᐨẏ ᐨẏ1;
    return ((ᐨẏ1 = super.ᐨẏ(ᐨẏ(paramString))) == null) ? null : (zubdqvgt.G(ᐨẏ1, this.ᐨẏ) ? this : ᐨẏ((String)null, ᐨẏ1));
  }
  
  @Deprecated
  private ᐨẏ ᐨẏ(ᐨẏ paramᐨẏ) {
    return new ʴ(this.ᐨẏ, null, paramᐨẏ, this.ᐨẏ);
  }
  
  private ᐨẏ ᐨẏ(String paramString, ᐨẏ paramᐨẏ) {
    return (new ʴ(this.ᐨẏ, paramString, paramᐨẏ, this.ᐨẏ)).ˊ(ᐨẏ(paramᐨẏ));
  }
  
  final ᐨẏ ˊ(ᐨẏ paramᐨẏ) {
    ʴ ʴ1;
    return (zubdqvgt.G(paramᐨẏ.getClass(), getClass()) && (ʴ1 = (ʴ)paramᐨẏ).ᐨẏ == this.ᐨẏ && zubdqvgt.G(ʴ1.ᐨẏ, this.ᐨẏ) && zubdqvgt.G(ʴ1.ᐨẏ, this.ᐨẏ)) ? this : paramᐨẏ;
  }
  
  private String ᐨẏ(String paramString) {
    return (this.ᴵʖ == null) ? paramString : this.ᐨẏ.ˊ(this.ᴵʖ, paramString);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ʴ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */