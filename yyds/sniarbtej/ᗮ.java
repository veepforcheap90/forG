package yyds.sniarbtej;

public final class ᗮ extends ˍɫ {
  private String ˈהּ;
  
  private final String ᵕ;
  
  private int ᐝᴲ;
  
  private ˉｓ ˊ;
  
  private ᗮ(String paramString, ˍɫ paramˍɫ) {
    this(589824, paramString, paramˍɫ);
  }
  
  private ᗮ(int paramInt, String paramString, ˍɫ paramˍɫ) {
    super(589824, paramˍɫ);
    this.ᵕ = paramString;
  }
  
  public final void ᐨẏ(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
    super.ᐨẏ(paramInt1, paramInt2, paramString1, paramString2, paramString3, paramArrayOfString);
    this.ˈהּ = paramString1;
  }
  
  public final ˉｓ ᐨẏ(int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
    ˉｓ ˉｓ1;
    "襯蔓醴榝츬촩፳䇂".toCharArray()[3] = (char)("襯蔓醴榝츬촩፳䇂".toCharArray()[3] ^ 0x4021);
    if (ᐝᵣ$ﾞﾇ.j("襯蔓醴榝츬촩፳䇂".toCharArray(), (short)13387, 0, (short)4).equals(paramString1)) {
      String str = this.ᵕ + this.ᐝᴲ++;
      ˉｓ1 = super.ᐨẏ(10, str, paramString2, paramString3, paramArrayOfString);
      if (this.ˊ == null)
        this.ˊ = super.ᐨẏ(10, paramString1, paramString2, (String)null, (String[])null); 
      this.ˊ.ᐨẏ(184, this.ˈהּ, str, paramString2, false);
    } else {
      ˉｓ1 = super.ᐨẏ(ˉｓ1, paramString1, paramString2, paramString3, paramArrayOfString);
    } 
    return ˉｓ1;
  }
  
  public final void ᐨẏ() {
    if (this.ˊ != null) {
      this.ˊ.ʹﮃ(177);
      this.ˊ.ʿᵉ(0, 0);
    } 
    super.ᐨẏ();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᗮ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */