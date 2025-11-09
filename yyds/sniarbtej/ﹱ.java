package yyds.sniarbtej;

public class ﹱ {
  private String name;
  
  private String ᴶ;
  
  private String গ;
  
  private int ᒬ;
  
  public ﹱ() {}
  
  static boolean ᐨẏ(CharSequence paramCharSequence1, boolean paramBoolean, int paramInt1, CharSequence paramCharSequence2, int paramInt2, int paramInt3) {
    if (paramCharSequence1 instanceof String && paramCharSequence2 instanceof String)
      return ((String)paramCharSequence1).regionMatches(false, 0, (String)paramCharSequence2, 0, paramInt3); 
    paramBoolean = false;
    paramInt1 = 0;
    paramInt2 = paramInt3;
    while (paramInt2-- > 0) {
      paramInt3 = paramCharSequence1.charAt(paramBoolean++);
      char c = paramCharSequence2.charAt(paramInt1++);
      if (paramInt3 != c)
        return false; 
    } 
    return true;
  }
  
  public ﹱ(String paramString1, String paramString2, String paramString3, int paramInt) {
    this.name = paramString1;
    this.ᴶ = paramString2;
    this.গ = paramString3;
    this.ᒬ = paramInt;
  }
  
  public void ᐨẏ(ˍɫ paramˍɫ) {
    paramˍɫ.ᐨẏ(this.name, this.ᴶ, this.গ, this.ᒬ);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ﹱ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */