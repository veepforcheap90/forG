package yyds.sniarbtej;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import ylt.pmn.zubdqvgt;

public final class ˑܘ {
  private static int ʹｼ = 0;
  
  private static int ιʲ = 1;
  
  private static int ˑЇ = 2;
  
  private static int ʳ = 3;
  
  private static int Ӵ = 4;
  
  private static int ﹳﬧ = 5;
  
  private static int ܝ = 6;
  
  private static int ᐝэ = 7;
  
  private static int ˋℷ = 8;
  
  private static int ﾞṙ = 9;
  
  private static int ʻﺕ = 10;
  
  private static int ʼוּ = 11;
  
  private static final int ˊΎ = 12;
  
  private static final String ٴᖟ = ˉﻤ$ͺſ.v("㮶꭯絥ꥶ죜㈞텍峎੷".toCharArray(), (short)7168, 1, (short)4).intern();
  
  public static final ˑܘ ᐨẏ = new ˑܘ(0, ˉﻤ$ͺſ.v("㊬茰殎藠䚗Ừ䯴掏৥".toCharArray(), (short)23744, 5, (short)3).intern(), 0, 1);
  
  public static final ˑܘ ˊ = new ˑܘ(1, ˉﻤ$ͺſ.v("폣杍ៜ副?翓엞䈱?䂟".toCharArray(), (short)5450, 5, (short)5).intern(), 1, 2);
  
  public static final ˑܘ ᴵʖ = new ˑܘ(2, ˉﻤ$ͺſ.v("臝崓糉뱸譗泯冋㒸噅".toCharArray(), (short)25662, 2, (short)5).intern(), 2, 3);
  
  public static final ˑܘ ﾞл = new ˑܘ(3, ˉﻤ$ͺſ.v("Ⲅ粇໼画ᇁ鋎׳ꬬ흸橫".toCharArray(), (short)27568, 3, (short)3).intern(), 3, 4);
  
  public static final ˑܘ ʿᵉ = new ˑܘ(4, ˉﻤ$ͺſ.v("쀨ᑔ浡粁툛趿騙刮".toCharArray(), (short)15684, 1, (short)1).intern(), 4, 5);
  
  public static final ˑܘ ʹﮃ = new ˑܘ(5, ˉﻤ$ͺſ.v("滚㩝藴㈛늨絑꣭᧪".toCharArray(), (short)16162, 0, (short)0).intern(), 5, 6);
  
  public static final ˑܘ ՙᗮ = new ˑܘ(6, ˉﻤ$ͺſ.v("ퟬ邵㪋듘举ﺥ翈ᵪ豑ᳬ".toCharArray(), (short)27478, 0, (short)0).intern(), 6, 7);
  
  public static final ˑܘ ˍɫ = new ˑܘ(7, ˉﻤ$ͺſ.v("讀ᦓ㶂㋤놼ꟳ뱷㊳".toCharArray(), (short)22060, 1, (short)3).intern(), 7, 8);
  
  public static final ˑܘ ʽ = new ˑܘ(8, ˉﻤ$ͺſ.v("덈倐쎆䗔궐霡껶陖ႎ瑙".toCharArray(), (short)15598, 4, (short)1).intern(), 8, 9);
  
  private final int ᴵӴ;
  
  private final String ˊɼ;
  
  private final int ʽｲ;
  
  private final int ᒉ;
  
  private ˑܘ(int paramInt1, String paramString, int paramInt2, int paramInt3) {
    this.ᴵӴ = paramInt1;
    this.ˊɼ = paramString;
    this.ʽｲ = paramInt2;
    this.ᒉ = paramInt3;
  }
  
  public static ˑܘ ᐨẏ(String paramString) {
    return ᐨẏ(paramString, 0, paramString.length());
  }
  
  public static ˑܘ ᐨẏ(Class<?> paramClass) {
    if (paramClass.isPrimitive()) {
      if (zubdqvgt.G(paramClass, int.class))
        return ʹﮃ; 
      if (zubdqvgt.G(paramClass, void.class))
        return ᐨẏ; 
      if (zubdqvgt.G(paramClass, boolean.class))
        return ˊ; 
      if (zubdqvgt.G(paramClass, byte.class))
        return ﾞл; 
      if (zubdqvgt.G(paramClass, char.class))
        return ᴵʖ; 
      if (zubdqvgt.G(paramClass, short.class))
        return ʿᵉ; 
      if (zubdqvgt.G(paramClass, double.class))
        return ʽ; 
      if (zubdqvgt.G(paramClass, float.class))
        return ՙᗮ; 
      if (zubdqvgt.G(paramClass, long.class))
        return ˍɫ; 
      throw new AssertionError();
    } 
    paramClass = paramClass;
    StringBuilder stringBuilder = new StringBuilder();
    ᐨẏ(paramClass, stringBuilder);
    return ᐨẏ(stringBuilder.toString());
  }
  
  private static ˑܘ ᐨẏ(Constructor<?> paramConstructor) {
    return ᐨẏ(ᐨẏ(paramConstructor));
  }
  
  private static ˑܘ ᐨẏ(Method paramMethod) {
    return ᐨẏ(ᐨẏ(paramMethod));
  }
  
  public final ˑܘ ᐨẏ() {
    int i = ʿপ();
    return ᐨẏ(this.ˊɼ, this.ʽｲ + i, this.ᒉ);
  }
  
  public static ˑܘ ˊ(String paramString) {
    return new ˑܘ((paramString.charAt(0) == '[') ? 9 : 12, paramString, 0, paramString.length());
  }
  
  public static ˑܘ ᴵʖ(String paramString) {
    return new ˑܘ(11, paramString, 0, paramString.length());
  }
  
  private static ˑܘ ᐨẏ(ˑܘ paramˑܘ, ˑܘ... paramVarArgs) {
    return ᐨẏ(ᐨẏ(paramˑܘ, paramVarArgs));
  }
  
  private ˑܘ[] ᐨẏ() {
    return ᐨẏ(ᴵʖ());
  }
  
  public static ˑܘ[] ᐨẏ(String paramString) {
    int i;
    ˑܘ[] arrayOfˑܘ = new ˑܘ[i = ʾܪ(paramString)];
    int j = 1;
    byte b = 0;
    while (paramString.charAt(j) != ')') {
      int k = j;
      while (paramString.charAt(j) == '[')
        j++; 
      if (paramString.charAt(j++) == 'L') {
        int m = paramString.indexOf(';', j);
        j = Math.max(j, m + 1);
      } 
      arrayOfˑܘ[b++] = ᐨẏ(paramString, k, j);
    } 
    return arrayOfˑܘ;
  }
  
  private static ˑܘ[] ᐨẏ(Method paramMethod) {
    Class[] arrayOfClass;
    ˑܘ[] arrayOfˑܘ = new ˑܘ[(arrayOfClass = paramMethod.getParameterTypes()).length];
    for (int i = arrayOfClass.length - 1; i >= 0; i--)
      arrayOfˑܘ[i] = ᐨẏ(arrayOfClass[i]); 
    return arrayOfˑܘ;
  }
  
  private ˑܘ ˊ() {
    return ﾞл(ᴵʖ());
  }
  
  public static ˑܘ ﾞл(String paramString) {
    return ᐨẏ(paramString, ʽ(paramString), paramString.length());
  }
  
  private static ˑܘ ˊ(Method paramMethod) {
    return ᐨẏ(paramMethod.getReturnType());
  }
  
  public static int ʽ(String paramString) {
    int i = 1;
    while (paramString.charAt(i) != ')') {
      while (paramString.charAt(i) == '[')
        i++; 
      if (paramString.charAt(i++) == 'L') {
        int j = paramString.indexOf(';', i);
        i = Math.max(i, j + 1);
      } 
    } 
    return i + 1;
  }
  
  private static ˑܘ ᐨẏ(String paramString, int paramInt1, int paramInt2) {
    switch (paramString.charAt(paramInt1)) {
      case 'V':
        return ᐨẏ;
      case 'Z':
        return ˊ;
      case 'C':
        return ᴵʖ;
      case 'B':
        return ﾞл;
      case 'S':
        return ʿᵉ;
      case 'I':
        return ʹﮃ;
      case 'F':
        return ՙᗮ;
      case 'J':
        return ˍɫ;
      case 'D':
        return ʽ;
      case '[':
        return new ˑܘ(9, paramString, paramInt1, paramInt2);
      case 'L':
        return new ˑܘ(10, paramString, paramInt1 + 1, paramInt2 - 1);
      case '(':
        return new ˑܘ(11, paramString, paramInt1, paramInt2);
    } 
    "둫鉅ฌ䨦滎쬭춥Ꙝ㓧䡣脷쉵浅袅蘏Ⓔၦ".toCharArray()[15] = (char)("둫鉅ฌ䨦滎쬭춥Ꙝ㓧䡣脷쉵浅袅蘏Ⓔၦ".toCharArray()[15] ^ 0x7EFD);
    throw new IllegalArgumentException(ᐨẏ$ᐝт.W("둫鉅ฌ䨦滎쬭춥Ꙝ㓧䡣脷쉵浅袅蘏Ⓔၦ".toCharArray(), (short)3125, (byte)2, (short)5) + paramString);
  }
  
  public final String ᐨẏ() {
    StringBuilder stringBuilder;
    int i;
    switch (this.ᴵӴ) {
      case 0:
        "㡚쇖ﶸ盳ै".toCharArray()[3] = (char)("㡚쇖ﶸ盳ै".toCharArray()[3] ^ 0x718F);
        return ˉﻤ$ͺſ.v("㡚쇖ﶸ盳ै".toCharArray(), (short)30543, 3, (short)2);
      case 1:
        "䄭夈羠縸內⭾虫湾".toCharArray()[0] = (char)("䄭夈羠縸內⭾虫湾".toCharArray()[0] ^ 0x7F9A);
        return ˉﻤ$ͺſ.v("䄭夈羠縸內⭾虫湾".toCharArray(), (short)511, 4, (short)0);
      case 2:
        "翠圆ﱧ菸Ŝ".toCharArray()[0] = (char)("翠圆ﱧ菸Ŝ".toCharArray()[0] ^ 0x655D);
        return ˉﻤ$ͺſ.v("翠圆ﱧ菸Ŝ".toCharArray(), (short)26093, 4, (short)4);
      case 3:
        "疖緑祥".toCharArray()[0] = (char)("疖緑祥".toCharArray()[0] ^ 0x5AE);
        return ˉﻤ$ͺſ.v("疖緑祥".toCharArray(), (short)5725, 5, (short)5);
      case 4:
        "ሻ韸쇚덋樭籅".toCharArray()[0] = (char)("ሻ韸쇚덋樭籅".toCharArray()[0] ^ 0x4D7D);
        return ˉﻤ$ͺſ.v("ሻ韸쇚덋樭籅".toCharArray(), (short)11023, 4, (short)3);
      case 5:
        "?ʭ齠Ĭ".toCharArray()[1] = (char)("?ʭ齠Ĭ".toCharArray()[1] ^ 0x948);
        return ˉﻤ$ͺſ.v("?ʭ齠Ĭ".toCharArray(), (short)24593, 5, (short)4);
      case 6:
        "옭⯙水猉៺".toCharArray()[3] = (char)("옭⯙水猉៺".toCharArray()[3] ^ 0x534B);
        return ˉﻤ$ͺſ.v("옭⯙水猉៺".toCharArray(), (short)15148, 2, (short)1);
      case 7:
        "ꞩ꼨놤禀".toCharArray()[0] = (char)("ꞩ꼨놤禀".toCharArray()[0] ^ 0x409);
        return ˉﻤ$ͺſ.v("ꞩ꼨놤禀".toCharArray(), (short)21911, 0, (short)4);
      case 8:
        "庂聘暅뫵喫Ʃ".toCharArray()[5] = (char)("庂聘暅뫵喫Ʃ".toCharArray()[5] ^ 0x62);
        return ˉﻤ$ͺſ.v("庂聘暅뫵喫Ʃ".toCharArray(), (short)19708, 2, (short)1);
      case 9:
        stringBuilder = new StringBuilder(ᐨẏ().ᐨẏ());
        for (i = ʿপ(); i > 0; i--) {
          "簕假䰖".toCharArray()[0] = (char)("簕假䰖".toCharArray()[0] ^ 0x4896);
          stringBuilder.append(ˉﻤ$ͺſ.v("簕假䰖".toCharArray(), (short)19640, 2, (short)3));
        } 
        return stringBuilder.toString();
      case 10:
      case 12:
        return this.ˊɼ.substring(this.ʽｲ, this.ᒉ).replace('/', '.');
    } 
    throw new AssertionError();
  }
  
  public final String ՙᗮ() {
    return this.ˊɼ.substring(this.ʽｲ, this.ᒉ);
  }
  
  private static String ᐨẏ(Class<?> paramClass) {
    return paramClass.getName().replace('.', '/');
  }
  
  public final String ᴵʖ() {
    if (this.ᴵӴ == 10)
      return this.ˊɼ.substring(this.ʽｲ - 1, this.ᒉ + 1); 
    if (this.ᴵӴ == 12) {
      "劅䂩".toCharArray()[0] = (char)("劅䂩".toCharArray()[0] ^ 0x7D2);
      return ˉﻤ$ͺſ.v("劅䂩".toCharArray(), (short)9951, 1, (short)1) + this.ˊɼ.substring(this.ʽｲ, this.ᒉ) + ';';
    } 
    return this.ˊɼ.substring(this.ʽｲ, this.ᒉ);
  }
  
  private static String ˊ(Class<?> paramClass) {
    StringBuilder stringBuilder = new StringBuilder();
    ᐨẏ(paramClass, stringBuilder);
    return stringBuilder.toString();
  }
  
  public static String ᐨẏ(Constructor<?> paramConstructor) {
    StringBuilder stringBuilder;
    (stringBuilder = new StringBuilder()).append('(');
    Class[] arrayOfClass;
    int i = (arrayOfClass = arrayOfClass = paramConstructor.getParameterTypes()).length;
    for (byte b = 0; b < i; b++) {
      Class<?> clazz;
      ᐨẏ(clazz = arrayOfClass[b], stringBuilder);
    } 
    "팟䄃".toCharArray()[1] = (char)("팟䄃".toCharArray()[1] ^ 0x672F);
    return stringBuilder.append(ᐨẏ$ᐝт.W("팟䄃".toCharArray(), (short)29484, (byte)0, (short)3)).toString();
  }
  
  public static String ᐨẏ(ˑܘ paramˑܘ, ˑܘ... paramVarArgs) {
    StringBuilder stringBuilder;
    (stringBuilder = new StringBuilder()).append('(');
    int i = (paramVarArgs = paramVarArgs).length;
    for (byte b = 0; b < i; b++) {
      ˑܘ ˑܘ1;
      (ˑܘ1 = paramVarArgs[b]).ᐨẏ(stringBuilder);
    } 
    stringBuilder.append(')');
    paramˑܘ.ᐨẏ(stringBuilder);
    return stringBuilder.toString();
  }
  
  public static String ᐨẏ(Method paramMethod) {
    StringBuilder stringBuilder;
    (stringBuilder = new StringBuilder()).append('(');
    Class[] arrayOfClass;
    int i = (arrayOfClass = arrayOfClass = paramMethod.getParameterTypes()).length;
    for (byte b = 0; b < i; b++) {
      Class<?> clazz;
      ᐨẏ(clazz = arrayOfClass[b], stringBuilder);
    } 
    stringBuilder.append(')');
    ᐨẏ(paramMethod.getReturnType(), stringBuilder);
    return stringBuilder.toString();
  }
  
  private void ᐨẏ(StringBuilder paramStringBuilder) {
    if (this.ᴵӴ == 10) {
      paramStringBuilder.append(this.ˊɼ, this.ʽｲ - 1, this.ᒉ + 1);
      return;
    } 
    if (this.ᴵӴ == 12) {
      paramStringBuilder.append('L').append(this.ˊɼ, this.ʽｲ, this.ᒉ).append(';');
      return;
    } 
    paramStringBuilder.append(this.ˊɼ, this.ʽｲ, this.ᒉ);
  }
  
  private static void ᐨẏ(Class<?> paramClass, StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: aload_0
    //   1: astore_0
    //   2: aload_0
    //   3: invokevirtual isArray : ()Z
    //   6: ifeq -> 24
    //   9: aload_1
    //   10: bipush #91
    //   12: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   15: pop
    //   16: aload_0
    //   17: invokevirtual getComponentType : ()Ljava/lang/Class;
    //   20: astore_0
    //   21: goto -> 2
    //   24: aload_0
    //   25: invokevirtual isPrimitive : ()Z
    //   28: ifeq -> 190
    //   31: aload_0
    //   32: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   35: invokestatic G : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   38: ifeq -> 47
    //   41: bipush #73
    //   43: istore_0
    //   44: goto -> 183
    //   47: aload_0
    //   48: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   51: invokestatic G : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   54: ifeq -> 63
    //   57: bipush #86
    //   59: istore_0
    //   60: goto -> 183
    //   63: aload_0
    //   64: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   67: invokestatic G : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   70: ifeq -> 79
    //   73: bipush #90
    //   75: istore_0
    //   76: goto -> 183
    //   79: aload_0
    //   80: getstatic java/lang/Byte.TYPE : Ljava/lang/Class;
    //   83: invokestatic G : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   86: ifeq -> 95
    //   89: bipush #66
    //   91: istore_0
    //   92: goto -> 183
    //   95: aload_0
    //   96: getstatic java/lang/Character.TYPE : Ljava/lang/Class;
    //   99: invokestatic G : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   102: ifeq -> 111
    //   105: bipush #67
    //   107: istore_0
    //   108: goto -> 183
    //   111: aload_0
    //   112: getstatic java/lang/Short.TYPE : Ljava/lang/Class;
    //   115: invokestatic G : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   118: ifeq -> 127
    //   121: bipush #83
    //   123: istore_0
    //   124: goto -> 183
    //   127: aload_0
    //   128: getstatic java/lang/Double.TYPE : Ljava/lang/Class;
    //   131: invokestatic G : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   134: ifeq -> 143
    //   137: bipush #68
    //   139: istore_0
    //   140: goto -> 183
    //   143: aload_0
    //   144: getstatic java/lang/Float.TYPE : Ljava/lang/Class;
    //   147: invokestatic G : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   150: ifeq -> 159
    //   153: bipush #70
    //   155: istore_0
    //   156: goto -> 183
    //   159: aload_0
    //   160: getstatic java/lang/Long.TYPE : Ljava/lang/Class;
    //   163: invokestatic G : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   166: ifeq -> 175
    //   169: bipush #74
    //   171: istore_0
    //   172: goto -> 183
    //   175: new java/lang/AssertionError
    //   178: dup
    //   179: invokespecial <init> : ()V
    //   182: athrow
    //   183: aload_1
    //   184: iload_0
    //   185: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   188: pop
    //   189: return
    //   190: aload_1
    //   191: bipush #76
    //   193: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   196: aload_0
    //   197: dup
    //   198: astore_0
    //   199: invokevirtual getName : ()Ljava/lang/String;
    //   202: bipush #46
    //   204: bipush #47
    //   206: invokevirtual replace : (CC)Ljava/lang/String;
    //   209: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: bipush #59
    //   214: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   217: pop
    //   218: return
  }
  
  public final int ˉｓ() {
    return (this.ᴵӴ == 12) ? 10 : this.ᴵӴ;
  }
  
  public final int ʿপ() {
    byte b;
    for (b = 1; this.ˊɼ.charAt(this.ʽｲ + b) == '['; b++);
    return b;
  }
  
  public final int ˍɫ() {
    switch (this.ᴵӴ) {
      case 0:
        return 0;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 9:
      case 10:
      case 12:
        return 1;
      case 7:
      case 8:
        return 2;
    } 
    throw new AssertionError();
  }
  
  private int ʻล() {
    return ʾܪ(ᴵʖ());
  }
  
  public static int ʾܪ(String paramString) {
    byte b = 0;
    int i = 1;
    while (paramString.charAt(i) != ')') {
      while (paramString.charAt(i) == '[')
        i++; 
      if (paramString.charAt(i++) == 'L') {
        int j = paramString.indexOf(';', i);
        i = Math.max(i, j + 1);
      } 
      b++;
    } 
    return b;
  }
  
  private int ʹō() {
    return ᐨم(ᴵʖ());
  }
  
  public static int ᐨم(String paramString) {
    byte b = 1;
    int i = 1;
    char c;
    for (c = paramString.charAt(1); c != ')'; c = paramString.charAt(i)) {
      if (c == 'J' || c == 'D') {
        i++;
        b += true;
      } else {
        while (paramString.charAt(i) == '[')
          i++; 
        if (paramString.charAt(i++) == 'L') {
          int j = paramString.indexOf(';', i);
          i = Math.max(i, j + 1);
        } 
        b++;
      } 
    } 
    if ((c = paramString.charAt(i + 1)) == 'V')
      return b << 2; 
    c = (c == 'J' || c == 'D') ? '\002' : '\001';
    return b << 2 | c;
  }
  
  public final int ʹﮃ(int paramInt) {
    if (paramInt == 46 || paramInt == 79) {
      switch (this.ᴵӴ) {
        case 1:
        case 3:
          return paramInt + 5;
        case 2:
          return paramInt + 6;
        case 4:
          return paramInt + 7;
        case 5:
          return paramInt;
        case 6:
          return paramInt + 2;
        case 7:
          return paramInt + 1;
        case 8:
          return paramInt + 3;
        case 9:
        case 10:
        case 12:
          return paramInt + 4;
        case 0:
        case 11:
          throw new UnsupportedOperationException();
      } 
      throw new AssertionError();
    } 
    switch (this.ᴵӴ) {
      case 0:
        if (paramInt != 172)
          throw new UnsupportedOperationException(); 
        return 177;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        return paramInt;
      case 6:
        return paramInt + 2;
      case 7:
        return paramInt + 1;
      case 8:
        return paramInt + 3;
      case 9:
      case 10:
      case 12:
        if (paramInt != 21 && paramInt != 54 && paramInt != 172)
          throw new UnsupportedOperationException(); 
        return paramInt + 4;
      case 11:
        throw new UnsupportedOperationException();
    } 
    throw new AssertionError();
  }
  
  public final boolean equals(Object paramObject) {
    if (zubdqvgt.G(this, paramObject))
      return true; 
    if (!(paramObject instanceof ˑܘ))
      return false; 
    paramObject = paramObject;
    if (((this.ᴵӴ == 12) ? true : this.ᴵӴ) != ((((ˑܘ)paramObject).ᴵӴ == 12) ? true : ((ˑܘ)paramObject).ᴵӴ))
      return false; 
    int i = this.ʽｲ;
    int j = this.ᒉ;
    int k = ((ˑܘ)paramObject).ʽｲ;
    int m = ((ˑܘ)paramObject).ᒉ;
    if (j - i != m - k)
      return false; 
    i = i;
    for (k = k; i < j; k++) {
      if (this.ˊɼ.charAt(i) != ((ˑܘ)paramObject).ˊɼ.charAt(k))
        return false; 
      i++;
    } 
    return true;
  }
  
  public final int hashCode() {
    int i = 13 * ((this.ᴵӴ == 12) ? 10 : this.ᴵӴ);
    if (this.ᴵӴ >= 9) {
      int j = this.ʽｲ;
      int k = this.ᒉ;
      while (j < k) {
        i = 17 * (i + this.ˊɼ.charAt(j));
        j++;
      } 
    } 
    return i;
  }
  
  public final String toString() {
    return ᴵʖ();
  }
  
  static {
    "㮶꭯絥ꥶ죜㈞텍峎੷".toCharArray()[1] = (char)("㮶꭯絥ꥶ죜㈞텍峎੷".toCharArray()[1] ^ 0x3B1);
  }
  
  static {
    "㊬茰殎藠䚗Ừ䯴掏৥".toCharArray()[0] = (char)("㊬茰殎藠䚗Ừ䯴掏৥".toCharArray()[0] ^ 0x1B92);
  }
  
  static {
    "폣杍ៜ副?翓엞䈱?䂟".toCharArray()[0] = (char)("폣杍ៜ副?翓엞䈱?䂟".toCharArray()[0] ^ 0x1FEF);
  }
  
  static {
    "臝崓糉뱸譗泯冋㒸噅".toCharArray()[5] = (char)("臝崓糉뱸譗泯冋㒸噅".toCharArray()[5] ^ 0x4C42);
  }
  
  static {
    "Ⲅ粇໼画ᇁ鋎׳ꬬ흸橫".toCharArray()[5] = (char)("Ⲅ粇໼画ᇁ鋎׳ꬬ흸橫".toCharArray()[5] ^ 0x5953);
  }
  
  static {
    "쀨ᑔ浡粁툛趿騙刮".toCharArray()[8] = (char)("쀨ᑔ浡粁툛趿騙刮".toCharArray()[8] ^ 0x10);
  }
  
  static {
    "滚㩝藴㈛늨絑꣭᧪".toCharArray()[0] = (char)("滚㩝藴㈛늨絑꣭᧪".toCharArray()[0] ^ 0x17FD);
  }
  
  static {
    "ퟬ邵㪋듘举ﺥ翈ᵪ豑ᳬ".toCharArray()[8] = (char)("ퟬ邵㪋듘举ﺥ翈ᵪ豑ᳬ".toCharArray()[8] ^ 0x59FD);
  }
  
  static {
    "讀ᦓ㶂㋤놼ꟳ뱷㊳".toCharArray()[3] = (char)("讀ᦓ㶂㋤놼ꟳ뱷㊳".toCharArray()[3] ^ 0x1AD9);
  }
  
  static {
    "덈倐쎆䗔궐霡껶陖ႎ瑙".toCharArray()[7] = (char)("덈倐쎆䗔궐霡껶陖ႎ瑙".toCharArray()[7] ^ 0x467C);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˑܘ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */