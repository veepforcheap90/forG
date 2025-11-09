package yyds.sniarbtej;

public class ˉῚ {
  private static String ᐧǏ;
  
  private static String ιՆ;
  
  private static String וּ;
  
  private static String ﻥ;
  
  private static String ˊᕝ = ᐨẏ$ᐝт.W("籪倽넥屟螒ꬫ覿ᱸ".toCharArray(), (short)5579, (byte)3, (short)2).intern();
  
  private static String ᐨḶ;
  
  private final String ˌᔹ;
  
  public ˉῚ() {}
  
  public ˉῚ(String paramString) {
    this.ˌᔹ = paramString;
  }
  
  public void ᐨẏ(ـᘢ paramـᘢ) {
    int j;
    String str;
    int i = (str = this.ˌᔹ).length();
    if (str.charAt(0) == '<') {
      int k;
      j = 2;
      do {
        k = str.indexOf(':', j);
        paramـᘢ.ʾ(str.substring(j - 1, k));
        j = k + 1;
        if ((k = str.charAt(j)) == 76 || k == 91 || k == 84)
          j = ᐨẏ(str, j, paramـᘢ.ˊ()); 
        while ((k = str.charAt(j++)) == 58)
          j = ᐨẏ(str, j, paramـᘢ.ʿᵉ()); 
      } while (k != 62);
    } else {
      j = 0;
    } 
    if (str.charAt(j) == '(') {
      while (str.charAt(++j) != ')')
        j = ᐨẏ(str, j, paramـᘢ.ʹﮃ()); 
      for (j = ᐨẏ(str, j + 1, paramـᘢ.ՙᗮ()); j < i; j = ᐨẏ(str, j + 1, paramـᘢ.ᴵʖ()));
    } else {
      for (j = ᐨẏ(str, j, paramـᘢ.ˍɫ()); j < i; j = ᐨẏ(str, j, paramـᘢ.ﾞл()));
    } 
  }
  
  public void ˊ(ـᘢ paramـᘢ) {
    ᐨẏ(this.ˌᔹ, 0, paramـᘢ);
  }
  
  private static int ᐨẏ(String paramString, int paramInt, ـᘢ paramـᘢ) {
    while (true) {
      int i;
      int j;
      boolean bool1;
      boolean bool2;
      paramInt = paramInt;
      char c;
      switch (c = paramString.charAt(paramInt++)) {
        case 'B':
        case 'C':
        case 'D':
        case 'F':
        case 'I':
        case 'J':
        case 'S':
        case 'V':
        case 'Z':
          paramـᘢ.ᐨẏ(c);
          return paramInt;
        case '[':
          paramـᘢ = paramـᘢ.ᐨẏ();
          paramInt = paramInt;
          paramString = paramString;
          continue;
        case 'T':
          i = paramString.indexOf(';', paramInt);
          paramـᘢ.ͺо(paramString.substring(paramInt, i));
          return i + 1;
        case 'L':
          j = paramInt;
          bool1 = false;
          bool2 = false;
          while (true) {
            if ((i = paramString.charAt(paramInt++)) == 46 || i == 59) {
              if (!bool1) {
                String str = paramString.substring(j, paramInt - 1);
                if (bool2) {
                  paramـᘢ.ᐨم(str);
                } else {
                  paramـᘢ.ʾܪ(str);
                } 
              } 
              if (i == 59) {
                paramـᘢ.ᐨẏ();
              } else {
                j = paramInt;
                bool1 = false;
                bool2 = true;
                continue;
              } 
            } else {
              if (i == 60) {
                String str = paramString.substring(j, paramInt - 1);
                if (bool2) {
                  paramـᘢ.ᐨم(str);
                } else {
                  paramـᘢ.ʾܪ(str);
                } 
                boolean bool = true;
                while ((i = paramString.charAt(paramInt)) != 62) {
                  switch (i) {
                    case 42:
                      paramInt++;
                      paramـᘢ.ʹл();
                      continue;
                    case 43:
                    case 45:
                      paramInt = ᐨẏ(paramString, paramInt + 1, paramـᘢ.ᐨẏ(i));
                      continue;
                  } 
                  paramInt = ᐨẏ(paramString, paramInt, paramـᘢ.ᐨẏ('='));
                } 
              } 
              continue;
            } 
            return paramInt;
          } 
      } 
      throw new IllegalArgumentException();
    } 
  }
  
  static {
    "싔픞ꖠꊷꚂ垜丫".toCharArray()[4] = (char)("싔픞ꖠꊷꚂ垜丫".toCharArray()[4] ^ 0x6D38);
    וּ = ᐨẏ$ᐝт.W("싔픞ꖠꊷꚂ垜丫".toCharArray(), (short)25372, (byte)0, (short)3).intern();
    "韰ᄏ䓜䱧鍗碣".toCharArray()[5] = (char)("韰ᄏ䓜䱧鍗碣".toCharArray()[5] ^ 0x6B1A);
    ﻥ = ᐨẏ$ᐝт.W("韰ᄏ䓜䱧鍗碣".toCharArray(), (short)16311, (byte)5, (short)4).intern();
    "ㅑꗱ紙⩍禎✧䀼뻍ʈ".toCharArray()[4] = (char)("ㅑꗱ紙⩍禎✧䀼뻍ʈ".toCharArray()[4] ^ 0x7E02);
    ᐧǏ = ᐨẏ$ᐝт.W("ㅑꗱ紙⩍禎✧䀼뻍ʈ".toCharArray(), (short)8012, (byte)5, (short)1).intern();
    "〮ﶦ㟄狶ᵈꕰ奼㐮".toCharArray()[3] = (char)("〮ﶦ㟄狶ᵈꕰ奼㐮".toCharArray()[3] ^ 0x2717);
    ιՆ = ᐨẏ$ᐝт.W("〮ﶦ㟄狶ᵈꕰ奼㐮".toCharArray(), (short)32381, (byte)3, (short)4).intern();
    "∞⸻唵祢낺⭱".toCharArray()[4] = (char)("∞⸻唵祢낺⭱".toCharArray()[4] ^ 0xADA);
    ᐨḶ = ᐨẏ$ᐝт.W("∞⸻唵祢낺⭱".toCharArray(), (short)764, (byte)4, (short)0).intern();
  }
  
  static {
    "籪倽넥屟螒ꬫ覿ᱸ".toCharArray()[2] = (char)("籪倽넥屟螒ꬫ覿ᱸ".toCharArray()[2] ^ 0x5EB5);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˉῚ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */