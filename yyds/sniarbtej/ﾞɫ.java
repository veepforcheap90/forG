package yyds.sniarbtej;

public enum ﾞɫ implements ˌэ {
  ᐨẏ, ˊ, ᴵʖ, ﾞл, ʿᵉ;
  
  private static String ʹﮃ(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < paramString1.length(); b++) {
      char c;
      if (Character.isUpperCase(c = paramString1.charAt(b)) && stringBuilder.length() != 0)
        stringBuilder.append(paramString2); 
      stringBuilder.append(c);
    } 
    return stringBuilder.toString();
  }
  
  private static String ᐨم(String paramString) {
    String str;
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    char c;
    for (c = paramString.charAt(0); b < paramString.length() - 1 && !Character.isLetter(c); c = paramString.charAt(++b))
      stringBuilder.append(c); 
    if (b == paramString.length())
      return stringBuilder.toString(); 
    if (!Character.isUpperCase(c)) {
      c = ++b;
      String str1 = paramString;
      char c1 = Character.toUpperCase(c);
      str = (c < str1.length()) ? (c1 + str1.substring(c)) : String.valueOf(c1);
      return stringBuilder.append(str).toString();
    } 
    return str;
  }
  
  private static String ᐨẏ(char paramChar, String paramString, int paramInt) {
    return (paramInt < paramString.length()) ? (paramChar + paramString.substring(paramInt)) : String.valueOf(paramChar);
  }
  
  static {
    "傐嘞戨Ԁ}஝ᙱ".toCharArray()[4] = (char)("傐嘞戨Ԁ}஝ᙱ".toCharArray()[4] ^ 0x5DDA);
  }
  
  static {
    "?灾?퀧㑺줯뵟ꞏ朅ד䧡琍쮔䛢曐".toCharArray()[5] = (char)("?灾?퀧㑺줯뵟ꞏ朅ד䧡琍쮔䛢曐".toCharArray()[5] ^ 0x63C5);
  }
  
  static {
    "ᣢ➋ཊ暿첽勎朔䅅겑弽镲⛂菻൸Ⅵ悺輧⑾戂▮톹੆ꁀ㥞?ᵓ".toCharArray()[25] = (char)("ᣢ➋ཊ暿첽勎朔䅅겑弽镲⛂菻൸Ⅵ悺輧⑾戂▮톹੆ꁀ㥞?ᵓ".toCharArray()[25] ^ 0x5A90);
  }
  
  static {
    "Bᠲ鉫認鲶癦좎?瑗悙ወ埡惐ᡎ束루䅔咙埘╱篸憧?㪨?玙".toCharArray()[22] = (char)("Bᠲ鉫認鲶癦좎?瑗悙ወ埡惐ᡎ束루䅔咙埘╱篸憧?㪨?玙".toCharArray()[22] ^ 0x2AEC);
  }
  
  static {
    "ཡന᭪棫Մ쫭偄璋Ҳ綊묿⸤웈謸寅쇐轼⟣㖹物".toCharArray()[1] = (char)("ཡന᭪棫Մ쫭偄璋Ҳ綊묿⸤웈謸寅쇐轼⟣㖹物".toCharArray()[1] ^ 0x331E);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ﾞɫ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */