package yyds.sniarbtej;

public final class ᐧȑ extends ᴵƚ {
  private ᐨᘂ ˊ;
  
  private ᐧȑ(ᐨᘂ paramᐨᘂ) {
    this(null, paramᐨᘂ);
  }
  
  public ᐧȑ(ᴵƚ paramᴵƚ, ᐨᘂ paramᐨᘂ) {
    super(589824, paramᴵƚ);
    this.ˊ = paramᐨᘂ;
  }
  
  public final ᐨẏ ᐨẏ(String paramString, boolean paramBoolean) {
    ᐨᘂ ᐨᘂ1 = this.ˊ.ˊ(paramString, paramBoolean);
    return new ιๅ(super.ᐨẏ(paramString, paramBoolean), ᐨᘂ1);
  }
  
  public final ᐨẏ ᐨẏ(int paramInt, ˏɪ paramˏɪ, String paramString, boolean paramBoolean) {
    ᐨᘂ ᐨᘂ1 = this.ˊ.ﾞл(paramInt, paramˏɪ, paramString, paramBoolean);
    return new ιๅ(super.ᐨẏ(paramInt, paramˏɪ, paramString, paramBoolean), ᐨᘂ1);
  }
  
  public final void ᴵʖ(ᴵʖ paramᴵʖ) {
    this.ˊ.ʹﮃ(paramᴵʖ);
    super.ᴵʖ(paramᴵʖ);
  }
  
  public final void ᐨẏ() {
    this.ˊ.ᐨר();
    super.ᐨẏ();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᐧȑ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */