package yyds.sniarbtej;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class ﹳܕ {
  final String name;
  
  final String ᴵʖ;
  
  private static final Map<String, String> ʿᵉ;
  
  private ﹳܕ(String paramString1, String paramString2) {
    this.name = paramString1;
    this.ᴵʖ = paramString2;
  }
  
  public ﹳܕ(String paramString, ˑܘ paramˑܘ, ˑܘ[] paramArrayOfˑܘ) {
    this(paramString, ˑܘ.ᐨẏ(paramˑܘ, paramArrayOfˑܘ));
  }
  
  private static ﹳܕ ᐨẏ(Method paramMethod) {
    return new ﹳܕ(paramMethod.getName(), ˑܘ.ᐨẏ(paramMethod));
  }
  
  private static ﹳܕ ᐨẏ(Constructor<?> paramConstructor) {
    "?졆ﮙꕖ욉?択".toCharArray()[5] = (char)("?졆ﮙꕖ욉?択".toCharArray()[5] ^ 0x5A7A);
    return new ﹳܕ(ˏȓ$ᴵЃ.E("?졆ﮙꕖ욉?択".toCharArray(), (short)22837, (short)4, (short)4), ˑܘ.ᐨẏ(paramConstructor));
  }
  
  public static ﹳܕ ᐨẏ(String paramString) {
    boolean bool = false;
    String str1;
    int i = (str1 = paramString).indexOf(' ');
    int j = str1.indexOf('(', i) + 1;
    int k = str1.indexOf(')', j);
    if (i == -1 || j == 0 || k == -1)
      throw new IllegalArgumentException(); 
    String str3 = str1.substring(0, i);
    String str2 = str1.substring(i + 1, j - 1).trim();
    StringBuilder stringBuilder;
    (stringBuilder = new StringBuilder()).append('(');
    while (true) {
      String str;
      int m;
      if ((m = str1.indexOf(',', j)) == -1) {
        str = ᐨẏ(str1.substring(j, k).trim(), false);
      } else {
        str = ᐨẏ(str1.substring(j, m).trim(), false);
        j = m + 1;
      } 
      stringBuilder.append(str);
      if (m == -1) {
        stringBuilder.append(')').append(ᐨẏ(str3, false));
        return new ﹳܕ(str2, stringBuilder.toString());
      } 
    } 
  }
  
  private static ﹳܕ ᐨẏ(String paramString, boolean paramBoolean) {
    int i = paramString.indexOf(' ');
    int j = paramString.indexOf('(', i) + 1;
    int k = paramString.indexOf(')', j);
    if (i == -1 || j == 0 || k == -1)
      throw new IllegalArgumentException(); 
    String str2 = paramString.substring(0, i);
    String str1 = paramString.substring(i + 1, j - 1).trim();
    StringBuilder stringBuilder;
    (stringBuilder = new StringBuilder()).append('(');
    while (true) {
      String str;
      int m;
      if ((m = paramString.indexOf(',', j)) == -1) {
        str = ᐨẏ(paramString.substring(j, k).trim(), false);
      } else {
        str = ᐨẏ(paramString.substring(j, m).trim(), false);
        j = m + 1;
      } 
      stringBuilder.append(str);
      if (m == -1) {
        stringBuilder.append(')').append(ᐨẏ(str2, false));
        return new ﹳܕ(str1, stringBuilder.toString());
      } 
    } 
  }
  
  private static String ᐨẏ(String paramString, boolean paramBoolean) {
    if ("".equals(paramString))
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    int i = 0;
    "껢⾴".toCharArray()[0] = (char)("껢⾴".toCharArray()[0] ^ 0x28F1);
    while ((i = paramString.indexOf(ˍɫ$יς.J("껢⾴".toCharArray(), (short)26400, (short)0, (byte)1), i) + 1) > 0)
      stringBuilder.append('['); 
    paramString = paramString.substring(0, paramString.length() - (stringBuilder.length() << 1));
    String str;
    if ((str = ʿᵉ.get(paramString)) != null) {
      stringBuilder.append(str);
    } else {
      stringBuilder.append('L');
      if (paramString.indexOf('.') < 0) {
        if (!paramBoolean) {
          "⬦屇휄㩧獤ⲽ㼯䰆麾㈘⺂".toCharArray()[8] = (char)("⬦屇휄㩧獤ⲽ㼯䰆麾㈘⺂".toCharArray()[8] ^ 0xDB3);
          stringBuilder.append(ˍɫ$יς.J("⬦屇휄㩧獤ⲽ㼯䰆麾㈘⺂".toCharArray(), (short)2739, (short)3, (byte)0));
        } 
        stringBuilder.append(paramString);
      } else {
        stringBuilder.append(paramString.replace('.', '/'));
      } 
      stringBuilder.append(';');
    } 
    return stringBuilder.toString();
  }
  
  public final String getName() {
    return this.name;
  }
  
  public final String ᴵʖ() {
    return this.ᴵʖ;
  }
  
  private ˑܘ ˊ() {
    return ˑܘ.ﾞл(this.ᴵʖ);
  }
  
  private ˑܘ[] ᐨẏ() {
    return ˑܘ.ᐨẏ(this.ᴵʖ);
  }
  
  public final String toString() {
    return this.name + this.ᴵʖ;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof ﹳܕ))
      return false; 
    paramObject = paramObject;
    return (this.name.equals(((ﹳܕ)paramObject).name) && this.ᴵʖ.equals(((ﹳܕ)paramObject).ᴵʖ));
  }
  
  public final int hashCode() {
    return this.name.hashCode() ^ this.ᴵʖ.hashCode();
  }
  
  static {
    "佮ꢘ례㋦朁".toCharArray()[0] = (char)("佮ꢘ례㋦朁".toCharArray()[0] ^ 0x8C3);
    "길宁".toCharArray()[0] = (char)("길宁".toCharArray()[0] ^ 0x5A61);
    HashMap<Object, Object> hashMap;
    (hashMap = new HashMap<>()).put(ˍɫ$יς.J("佮ꢘ례㋦朁".toCharArray(), (short)23621, (short)5, (byte)0), ˍɫ$יς.J("길宁".toCharArray(), (short)8688, (short)2, (byte)3));
    "ꤥİ끦織".toCharArray()[0] = (char)("ꤥİ끦織".toCharArray()[0] ^ 0x4D74);
    "鰼଼".toCharArray()[0] = (char)("鰼଼".toCharArray()[0] ^ 0x575A);
    hashMap.put(ˍɫ$יς.J("ꤥİ끦織".toCharArray(), (short)8443, (short)0, (byte)5), ˍɫ$יς.J("鰼଼".toCharArray(), (short)8865, (short)3, (byte)5));
    "䕸䗝庚惠".toCharArray()[3] = (char)("䕸䗝庚惠".toCharArray()[3] ^ 0x2D1E);
    "磑".toCharArray()[0] = (char)("磑".toCharArray()[0] ^ 0x13D6);
    hashMap.put(ˍɫ$יς.J("䕸䗝庚惠".toCharArray(), (short)4328, (short)3, (byte)4), ˍɫ$יς.J("磑".toCharArray(), (short)24612, (short)5, (byte)2));
    "?餿魿镴磲妥".toCharArray()[1] = (char)("?餿魿镴磲妥".toCharArray()[1] ^ 0x2F8D);
    "❊啫".toCharArray()[0] = (char)("❊啫".toCharArray()[0] ^ 0x1372);
    hashMap.put(ˍɫ$יς.J("?餿魿镴磲妥".toCharArray(), (short)22374, (short)2, (byte)3), ˍɫ$יς.J("❊啫".toCharArray(), (short)9261, (short)2, (byte)2));
    "僃恏삖䊻ᭅၝ".toCharArray()[0] = (char)("僃恏삖䊻ᭅၝ".toCharArray()[0] ^ 0x2359);
    "娭晭".toCharArray()[0] = (char)("娭晭".toCharArray()[0] ^ 0x37B2);
    hashMap.put(ˍɫ$יς.J("僃恏삖䊻ᭅၝ".toCharArray(), (short)2484, (short)1, (byte)2), ˍɫ$יς.J("娭晭".toCharArray(), (short)13898, (short)5, (byte)5));
    "෎ᜢ屵䆝".toCharArray()[2] = (char)("෎ᜢ屵䆝".toCharArray()[2] ^ 0x23BA);
    "葆堀".toCharArray()[0] = (char)("葆堀".toCharArray()[0] ^ 0xBAA);
    hashMap.put(ˍɫ$יς.J("෎ᜢ屵䆝".toCharArray(), (short)7918, (short)0, (byte)1), ˍɫ$יς.J("葆堀".toCharArray(), (short)9277, (short)2, (byte)1));
    "텇钌⌏鶟媓".toCharArray()[3] = (char)("텇钌⌏鶟媓".toCharArray()[3] ^ 0x475E);
    "య⏆".toCharArray()[0] = (char)("య⏆".toCharArray()[0] ^ 0x47C7);
    hashMap.put(ˍɫ$יς.J("텇钌⌏鶟媓".toCharArray(), (short)924, (short)2, (byte)4), ˍɫ$יς.J("య⏆".toCharArray(), (short)19776, (short)3, (byte)4));
    "惔鬐ꨄﶈ洏㎒".toCharArray()[1] = (char)("惔鬐ꨄﶈ洏㎒".toCharArray()[1] ^ 0x46FD);
    "㔜⤾".toCharArray()[0] = (char)("㔜⤾".toCharArray()[0] ^ 0x1882);
    hashMap.put(ˍɫ$יς.J("惔鬐ꨄﶈ洏㎒".toCharArray(), (short)25205, (short)2, (byte)2), ˍɫ$יς.J("㔜⤾".toCharArray(), (short)29397, (short)4, (byte)2));
    "撱⒅富쫁⡎找䰜瀦".toCharArray()[1] = (char)("撱⒅富쫁⡎找䰜瀦".toCharArray()[1] ^ 0x1677);
    "붞⃸".toCharArray()[0] = (char)("붞⃸".toCharArray()[0] ^ 0x394D);
    hashMap.put(ˍɫ$יς.J("撱⒅富쫁⡎找䰜瀦".toCharArray(), (short)30232, (short)5, (byte)3), ˍɫ$יς.J("붞⃸".toCharArray(), (short)4057, (short)5, (byte)2));
    ʿᵉ = (Map)hashMap;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ﹳܕ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */