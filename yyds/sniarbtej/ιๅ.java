package yyds.sniarbtej;

public final class ιๅ extends ᐨẏ {
  private final ᐨᘂ ᐨẏ;
  
  private ιๅ(ᐨᘂ paramᐨᘂ) {
    this(null, paramᐨᘂ);
  }
  
  public ιๅ(ᐨẏ paramᐨẏ, ᐨᘂ paramᐨᘂ) {
    super(589824, paramᐨẏ);
    this.ᐨẏ = paramᐨᘂ;
  }
  
  public final void ᐨẏ(String paramString, Object paramObject) {
    this.ᐨẏ.ᐨẏ(paramString, paramObject);
    super.ᐨẏ(paramString, paramObject);
  }
  
  public final void ᐨẏ(String paramString1, String paramString2, String paramString3) {
    this.ᐨẏ.ᐨẏ(paramString1, paramString2, paramString3);
    super.ᐨẏ(paramString1, paramString2, paramString3);
  }
  
  public final ᐨẏ ᐨẏ(String paramString1, String paramString2) {
    ᐨᘂ ᐨᘂ1 = this.ᐨẏ.ᐨẏ(paramString1, paramString2);
    return new ιๅ(super.ᐨẏ(paramString1, paramString2), ᐨᘂ1);
  }
  
  public final ᐨẏ ᐨẏ(String paramString) {
    ᐨᘂ ᐨᘂ1 = this.ᐨẏ.ᐨẏ(paramString);
    return new ιๅ(super.ᐨẏ(paramString), ᐨᘂ1);
  }
  
  public final void ᐨẏ() {
    this.ᐨẏ.ᴵઽ();
    super.ᐨẏ();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ιๅ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */