package yyds.sniarbtej;

import java.util.Collections;
import java.util.Map;

public final class ᴵЃ extends ᴵઽ {
  private final Map<String, String> ʹﮃ;
  
  private ᴵЃ(Map<String, String> paramMap) {
    this.ʹﮃ = paramMap;
  }
  
  private ᴵЃ(String paramString1, String paramString2) {
    this.ʹﮃ = Collections.singletonMap(paramString1, paramString2);
  }
  
  public final String ᐨẏ(String paramString1, String paramString2, String paramString3) {
    return ((paramString1 = ˍɫ(paramString1 + '.' + paramString2 + paramString3)) == null) ? paramString2 : paramString1;
  }
  
  public final String ﾞл(String paramString1, String paramString2) {
    "앱Ο".toCharArray()[0] = (char)("앱Ο".toCharArray()[0] ^ 0x1AD2);
    return ((paramString2 = ˍɫ(ᐨẏ$ᐝт.W("앱Ο".toCharArray(), (short)11659, (byte)1, (short)0) + paramString1 + paramString2)) == null) ? paramString1 : paramString2;
  }
  
  public final String ˊ(String paramString1, String paramString2) {
    return ((paramString1 = ˍɫ(paramString1 + '.' + paramString2)) == null) ? paramString2 : paramString1;
  }
  
  public final String ʿᵉ(String paramString1, String paramString2) {
    return ((paramString1 = ˍɫ(paramString1 + '.' + paramString2)) == null) ? paramString2 : paramString1;
  }
  
  public final String ˍɫ(String paramString) {
    return this.ʹﮃ.get(paramString);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᴵЃ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */