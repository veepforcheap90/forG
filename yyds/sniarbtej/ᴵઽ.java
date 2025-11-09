package yyds.sniarbtej;

import ylt.pmn.zubdqvgt;

public abstract class ᴵઽ {
  public final String ˊ(String paramString) {
    return ˊ(ˑܘ.ᐨẏ(paramString)).ᴵʖ();
  }
  
  private ˑܘ ˊ(ˑܘ paramˑܘ) {
    StringBuilder stringBuilder;
    byte b;
    String str;
    switch (paramˑܘ.ˉｓ()) {
      case 9:
        stringBuilder = new StringBuilder();
        for (b = 0; b < paramˑܘ.ʿপ(); b++)
          stringBuilder.append('['); 
        stringBuilder.append(ˊ(paramˑܘ.ᐨẏ()).ᴵʖ());
        return ˑܘ.ᐨẏ(stringBuilder.toString());
      case 10:
        return ((str = ˍɫ(paramˑܘ.ՙᗮ())) != null) ? ˑܘ.ˊ(str) : paramˑܘ;
      case 11:
        return ˑܘ.ᴵʖ(ﾞл(paramˑܘ.ᴵʖ()));
    } 
    return paramˑܘ;
  }
  
  public final String ᴵʖ(String paramString) {
    return (paramString == null) ? null : ˊ(ˑܘ.ˊ(paramString)).ՙᗮ();
  }
  
  public final String[] ᐨẏ(String[] paramArrayOfString) {
    String[] arrayOfString = null;
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      String str = paramArrayOfString[b];
      if ((str = ᴵʖ(str)) != null) {
        if (arrayOfString == null)
          arrayOfString = (String[])paramArrayOfString.clone(); 
        arrayOfString[b] = str;
      } 
    } 
    return (arrayOfString != null) ? arrayOfString : paramArrayOfString;
  }
  
  public final String ﾞл(String paramString) {
    "ဵ㦱腐ᓊ".toCharArray()[2] = (char)("ဵ㦱腐ᓊ".toCharArray()[2] ^ 0x486D);
    if (ˏȓ$ᴵЃ.E("ဵ㦱腐ᓊ".toCharArray(), (short)29306, (short)2, (short)1).equals(paramString))
      return paramString; 
    "罯ᐟ".toCharArray()[0] = (char)("罯ᐟ".toCharArray()[0] ^ 0x8F7);
    StringBuilder stringBuilder = new StringBuilder(ˏȓ$ᴵЃ.E("罯ᐟ".toCharArray(), (short)17723, (short)4, (short)5));
    ˑܘ[] arrayOfˑܘ;
    int i = (arrayOfˑܘ = ˑܘ.ᐨẏ(paramString)).length;
    for (byte b = 0; b < i; b++) {
      ˑܘ ˑܘ1 = arrayOfˑܘ[b];
      stringBuilder.append(ˊ(ˑܘ1).ᴵʖ());
    } 
    ˑܘ ˑܘ;
    if (zubdqvgt.G(ˑܘ = ˑܘ.ﾞл(paramString), ˑܘ.ᐨẏ)) {
      "鯛ᔫ".toCharArray()[1] = (char)("鯛ᔫ".toCharArray()[1] ^ 0x67EC);
      stringBuilder.append(ˏȓ$ᴵЃ.E("鯛ᔫ".toCharArray(), (short)27813, (short)4, (short)0));
    } else {
      stringBuilder.append(')').append(ˊ(ˑܘ).ᴵʖ());
    } 
    return stringBuilder.toString();
  }
  
  public final Object ᐨẏ(Object paramObject) {
    if (paramObject instanceof ˑܘ)
      return ˊ((ˑܘ)paramObject); 
    if (paramObject instanceof ʹō) {
      Object object;
      boolean bool = (((ʹō)(object = paramObject = paramObject)).ᙆ <= 4) ? true : false;
      return new ʹō(((ʹō)(object = paramObject)).ᙆ, ᴵʖ(((ʹō)(object = paramObject)).ˈהּ), bool ? ʿᵉ(((ʹō)(object = paramObject)).ˈהּ, ((ʹō)(object = paramObject)).name) : ᐨẏ(((ʹō)(object = paramObject)).ˈהּ, ((ʹō)(object = paramObject)).name, ((ʹō)(object = paramObject)).ᴵʖ), bool ? ˊ(((ʹō)(object = paramObject)).ᴵʖ) : ﾞл(((ʹō)(object = paramObject)).ᴵʖ), ((ʹō)(object = paramObject)).ˊ);
    } 
    if (paramObject instanceof ʾܪ) {
      int i;
      Object object;
      Object[] arrayOfObject = new Object[i = ((ʾܪ)(object = paramObject = paramObject)).ᐨẏ.length];
      for (byte b = 0; b < i; b++) {
        byte b1 = b;
        arrayOfObject[b] = ᐨẏ(((ʾܪ)(object = paramObject)).ᐨẏ[b1]);
      } 
      String str = ((ʾܪ)(object = paramObject)).ᴵʖ;
      return new ʾܪ(ﾞл(((ʾܪ)(object = paramObject)).name, str), ˊ(str), (ʹō)ᐨẏ(((ʾܪ)(object = paramObject)).ᐨẏ), arrayOfObject);
    } 
    return paramObject;
  }
  
  public final String ˊ(String paramString, boolean paramBoolean) {
    if (paramString == null)
      return null; 
    ˉῚ ˉῚ = new ˉῚ(paramString);
    ﾟ ﾟ = new ﾟ();
    ـᘢ ـᘢ = ˊ(ﾟ);
    if (paramBoolean) {
      ˉῚ.ˊ(ـᘢ);
    } else {
      ˉῚ.ᐨẏ(ـᘢ);
    } 
    return ﾟ.toString();
  }
  
  @Deprecated
  private ـᘢ ᐨẏ(ـᘢ paramـᘢ) {
    return ˊ(paramـᘢ);
  }
  
  private ـᘢ ˊ(ـᘢ paramـᘢ) {
    return new ͺĹ(paramـᘢ, this);
  }
  
  public String ˊ(String paramString1, String paramString2) {
    return paramString2;
  }
  
  public final String ᴵʖ(String paramString1, String paramString2) {
    String str;
    if ((str = ᴵʖ(paramString1)).equals(paramString1))
      return paramString2; 
    int i = paramString1.lastIndexOf('/');
    int j = str.lastIndexOf('/');
    if (i != -1 && j != -1 && paramString1.substring(i).equals(str.substring(j)))
      return paramString2; 
    "浏宣".toCharArray()[0] = (char)("浏宣".toCharArray()[0] ^ 0x18AF);
    if (str.contains(ˍɫ$יς.J("浏宣".toCharArray(), (short)5917, (short)0, (byte)5))) {
      for (i = str.lastIndexOf('$') + 1; i < str.length() && Character.isDigit(str.charAt(i)); i++);
      return str.substring(i);
    } 
    return paramString2;
  }
  
  public String ᐨẏ(String paramString1, String paramString2, String paramString3) {
    return paramString2;
  }
  
  public String ﾞл(String paramString1, String paramString2) {
    return paramString1;
  }
  
  public static String ʿᵉ(String paramString) {
    return paramString;
  }
  
  public String ʿᵉ(String paramString1, String paramString2) {
    return paramString2;
  }
  
  public static String ʹﮃ(String paramString) {
    return paramString;
  }
  
  public static String ՙᗮ(String paramString) {
    return paramString;
  }
  
  public String ˍɫ(String paramString) {
    return paramString;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᴵઽ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */