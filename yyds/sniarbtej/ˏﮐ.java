package yyds.sniarbtej;

import java.lang.reflect.Type;
import java.util.Map;
import ylt.pmn.zubdqvgt;

final class ˏﮐ<K, V> extends ٴۉ<Map<K, V>> {
  private final ٴۉ<K> ʹﮃ;
  
  private final ٴۉ<V> ՙᗮ;
  
  private final ʿн<? extends Map<K, V>> ᐨẏ;
  
  public ˏﮐ(ˏﾁ paramˏﾁ, ˑĴ paramˑĴ, Type paramType1, ٴۉ<K> paramٴۉ, Type paramType2, ٴۉ<V> paramٴۉ1, ʿн<? extends Map<K, V>> paramʿн) {
    this.ʹﮃ = new ᐨⅬ<>(paramˑĴ, paramٴۉ, paramType1);
    this.ՙᗮ = new ᐨⅬ<>(paramˑĴ, paramٴۉ1, paramType2);
    this.ᐨẏ = (ˏﾁ)paramʿн;
  }
  
  private Map<K, V> ᐨẏ(יּ paramיּ) {
    כ כ;
    if (zubdqvgt.G(כ = paramיּ.ᐨẏ(), כ.ʽ)) {
      paramיּ.ۦ();
      return null;
    } 
    Map<כ, V> map = this.ᐨẏ.ʿᵉ();
    if (zubdqvgt.G(כ, כ.ᐨẏ)) {
      paramיּ.ᵘ();
      while (paramיּ.hasNext()) {
        paramיּ.ᵘ();
        כ = (כ)this.ʹﮃ.ᐨẏ(paramיּ);
        V v = this.ՙᗮ.ᐨẏ(paramיּ);
        if ((v = map.put(כ, v)) != null) {
          "媹癩裼捑攅ᥞ㊈ᖴ̩쮼頷犰럢ݯ".toCharArray()[4] = (char)("媹癩裼捑攅ᥞ㊈ᖴ̩쮼頷犰럢ݯ".toCharArray()[4] ^ 0x4660);
          throw new ՙĩ(ˉﻤ$ͺſ.v("媹癩裼捑攅ᥞ㊈ᖴ̩쮼頷犰럢ݯ".toCharArray(), (short)12781, 3, (short)5) + כ);
        } 
        paramיּ.ˑܥ();
      } 
      paramיּ.ˑܥ();
    } else {
      paramיּ.ᐨ();
      while (paramיּ.hasNext()) {
        ˋᕁ.ᐨẏ.ᐨẏ(paramיּ);
        כ = (כ)this.ʹﮃ.ᐨẏ(paramיּ);
        V v = this.ՙᗮ.ᐨẏ(paramיּ);
        if ((v = map.put(כ, v)) != null) {
          "ൂ៣輍깫鷺ꮓ鏢솞߽姙韡잇庺ᧃ縁".toCharArray()[8] = (char)("ൂ៣輍깫鷺ꮓ鏢솞߽姙韡잇庺ᧃ縁".toCharArray()[8] ^ 0x62A5);
          throw new ՙĩ(ˉﻤ$ͺſ.v("ൂ៣輍깫鷺ꮓ鏢솞߽姙韡잇庺ᧃ縁".toCharArray(), (short)9721, 5, (short)0) + כ);
        } 
      } 
      paramיּ.ﾞঽ();
    } 
    return (Map)map;
  }
  
  private void ᐨẏ(Ⴡ paramჁ, Map<K, V> paramMap) {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull -> 10
    //   4: aload_1
    //   5: invokevirtual ʿᵉ : ()Lyyds/sniarbtej/Ⴡ;
    //   8: pop
    //   9: return
    //   10: aload_0
    //   11: getfield ᐨẏ : Lyyds/sniarbtej/ˏﾁ;
    //   14: invokestatic ᐨẏ : (Lyyds/sniarbtej/ˏﾁ;)Z
    //   17: ifne -> 96
    //   20: aload_1
    //   21: invokevirtual ᴵʖ : ()Lyyds/sniarbtej/Ⴡ;
    //   24: pop
    //   25: aload_2
    //   26: invokeinterface entrySet : ()Ljava/util/Set;
    //   31: invokeinterface iterator : ()Ljava/util/Iterator;
    //   36: astore_3
    //   37: aload_3
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 90
    //   46: aload_3
    //   47: invokeinterface next : ()Ljava/lang/Object;
    //   52: checkcast java/util/Map$Entry
    //   55: astore #4
    //   57: aload_1
    //   58: aload #4
    //   60: invokeinterface getKey : ()Ljava/lang/Object;
    //   65: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   68: invokevirtual ᐨẏ : (Ljava/lang/String;)Lyyds/sniarbtej/Ⴡ;
    //   71: pop
    //   72: aload_0
    //   73: getfield ՙᗮ : Lyyds/sniarbtej/ٴۉ;
    //   76: aload_1
    //   77: aload #4
    //   79: invokeinterface getValue : ()Ljava/lang/Object;
    //   84: invokevirtual ᐨẏ : (Lyyds/sniarbtej/Ⴡ;Ljava/lang/Object;)V
    //   87: goto -> 37
    //   90: aload_1
    //   91: invokevirtual ﾞл : ()Lyyds/sniarbtej/Ⴡ;
    //   94: pop
    //   95: return
    //   96: iconst_0
    //   97: istore_3
    //   98: new java/util/ArrayList
    //   101: dup
    //   102: aload_2
    //   103: invokeinterface size : ()I
    //   108: invokespecial <init> : (I)V
    //   111: astore #4
    //   113: new java/util/ArrayList
    //   116: dup
    //   117: aload_2
    //   118: invokeinterface size : ()I
    //   123: invokespecial <init> : (I)V
    //   126: astore #5
    //   128: aload_2
    //   129: invokeinterface entrySet : ()Ljava/util/Set;
    //   134: invokeinterface iterator : ()Ljava/util/Iterator;
    //   139: astore_2
    //   140: aload_2
    //   141: invokeinterface hasNext : ()Z
    //   146: ifeq -> 234
    //   149: aload_2
    //   150: invokeinterface next : ()Ljava/lang/Object;
    //   155: checkcast java/util/Map$Entry
    //   158: astore #6
    //   160: aload_0
    //   161: getfield ʹﮃ : Lyyds/sniarbtej/ٴۉ;
    //   164: aload #6
    //   166: invokeinterface getKey : ()Ljava/lang/Object;
    //   171: invokevirtual ᐨẏ : (Ljava/lang/Object;)Lyyds/sniarbtej/ᐧｴ;
    //   174: astore #7
    //   176: aload #4
    //   178: aload #7
    //   180: invokeinterface add : (Ljava/lang/Object;)Z
    //   185: pop
    //   186: aload #5
    //   188: aload #6
    //   190: invokeinterface getValue : ()Ljava/lang/Object;
    //   195: invokeinterface add : (Ljava/lang/Object;)Z
    //   200: pop
    //   201: iload_3
    //   202: aload #7
    //   204: dup
    //   205: astore #6
    //   207: instanceof yyds/sniarbtej/ˋℷ
    //   210: ifne -> 224
    //   213: aload #7
    //   215: dup
    //   216: astore #6
    //   218: instanceof yyds/sniarbtej/ʻṪ
    //   221: ifeq -> 228
    //   224: iconst_1
    //   225: goto -> 229
    //   228: iconst_0
    //   229: ior
    //   230: istore_3
    //   231: goto -> 140
    //   234: iload_3
    //   235: ifeq -> 309
    //   238: aload_1
    //   239: invokevirtual ᐨẏ : ()Lyyds/sniarbtej/Ⴡ;
    //   242: pop
    //   243: iconst_0
    //   244: istore_2
    //   245: iload_2
    //   246: aload #4
    //   248: invokeinterface size : ()I
    //   253: if_icmpge -> 303
    //   256: aload_1
    //   257: invokevirtual ᐨẏ : ()Lyyds/sniarbtej/Ⴡ;
    //   260: pop
    //   261: aload #4
    //   263: iload_2
    //   264: invokeinterface get : (I)Ljava/lang/Object;
    //   269: checkcast yyds/sniarbtej/ᐧｴ
    //   272: aload_1
    //   273: invokestatic ˊ : (Lyyds/sniarbtej/ᐧｴ;Lyyds/sniarbtej/Ⴡ;)V
    //   276: aload_0
    //   277: getfield ՙᗮ : Lyyds/sniarbtej/ٴۉ;
    //   280: aload_1
    //   281: aload #5
    //   283: iload_2
    //   284: invokeinterface get : (I)Ljava/lang/Object;
    //   289: invokevirtual ᐨẏ : (Lyyds/sniarbtej/Ⴡ;Ljava/lang/Object;)V
    //   292: aload_1
    //   293: invokevirtual ˊ : ()Lyyds/sniarbtej/Ⴡ;
    //   296: pop
    //   297: iinc #2, 1
    //   300: goto -> 245
    //   303: aload_1
    //   304: invokevirtual ˊ : ()Lyyds/sniarbtej/Ⴡ;
    //   307: pop
    //   308: return
    //   309: aload_1
    //   310: invokevirtual ᴵʖ : ()Lyyds/sniarbtej/Ⴡ;
    //   313: pop
    //   314: iconst_0
    //   315: istore_2
    //   316: iload_2
    //   317: aload #4
    //   319: invokeinterface size : ()I
    //   324: if_icmpge -> 504
    //   327: aload #4
    //   329: iload_2
    //   330: invokeinterface get : (I)Ljava/lang/Object;
    //   335: checkcast yyds/sniarbtej/ᐧｴ
    //   338: astore #6
    //   340: aload_1
    //   341: aload #6
    //   343: dup
    //   344: astore_3
    //   345: dup
    //   346: astore #6
    //   348: instanceof yyds/sniarbtej/ﭘ
    //   351: ifeq -> 433
    //   354: aload_3
    //   355: invokevirtual ᐨẏ : ()Lyyds/sniarbtej/ﭘ;
    //   358: dup
    //   359: astore_3
    //   360: dup
    //   361: astore #6
    //   363: getfield ﾞл : Ljava/lang/Object;
    //   366: instanceof java/lang/Number
    //   369: ifeq -> 382
    //   372: aload_3
    //   373: invokevirtual ᐨẏ : ()Ljava/lang/Number;
    //   376: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   379: goto -> 478
    //   382: aload_3
    //   383: dup
    //   384: astore #6
    //   386: getfield ﾞл : Ljava/lang/Object;
    //   389: instanceof java/lang/Boolean
    //   392: ifeq -> 405
    //   395: aload_3
    //   396: invokevirtual ᴵƚ : ()Z
    //   399: invokestatic toString : (Z)Ljava/lang/String;
    //   402: goto -> 478
    //   405: aload_3
    //   406: dup
    //   407: astore #6
    //   409: getfield ﾞл : Ljava/lang/Object;
    //   412: instanceof java/lang/String
    //   415: ifeq -> 425
    //   418: aload_3
    //   419: invokevirtual ᐨم : ()Ljava/lang/String;
    //   422: goto -> 478
    //   425: new java/lang/AssertionError
    //   428: dup
    //   429: invokespecial <init> : ()V
    //   432: athrow
    //   433: aload_3
    //   434: dup
    //   435: astore #6
    //   437: instanceof yyds/sniarbtej/ڊ
    //   440: ifeq -> 470
    //   443: ldc '슟Ї蔣䋆ⵀ'
    //   445: invokevirtual toCharArray : ()[C
    //   448: dup
    //   449: dup
    //   450: iconst_3
    //   451: dup_x1
    //   452: caload
    //   453: sipush #12929
    //   456: ixor
    //   457: i2c
    //   458: castore
    //   459: sipush #12818
    //   462: iconst_4
    //   463: iconst_3
    //   464: invokestatic J : (Ljava/lang/Object;SSB)Ljava/lang/String;
    //   467: goto -> 478
    //   470: new java/lang/AssertionError
    //   473: dup
    //   474: invokespecial <init> : ()V
    //   477: athrow
    //   478: invokevirtual ᐨẏ : (Ljava/lang/String;)Lyyds/sniarbtej/Ⴡ;
    //   481: pop
    //   482: aload_0
    //   483: getfield ՙᗮ : Lyyds/sniarbtej/ٴۉ;
    //   486: aload_1
    //   487: aload #5
    //   489: iload_2
    //   490: invokeinterface get : (I)Ljava/lang/Object;
    //   495: invokevirtual ᐨẏ : (Lyyds/sniarbtej/Ⴡ;Ljava/lang/Object;)V
    //   498: iinc #2, 1
    //   501: goto -> 316
    //   504: aload_1
    //   505: invokevirtual ﾞл : ()Lyyds/sniarbtej/Ⴡ;
    //   508: pop
    //   509: return
  }
  
  private static String ˊ(ᐧｴ paramᐧｴ) {
    ᐧｴ ᐧｴ1;
    if (ᐧｴ1 = paramᐧｴ instanceof ﭘ) {
      if (((ﭘ)(ᐧｴ1 = paramᐧｴ = paramᐧｴ.ᐨẏ())).ﾞл instanceof Number)
        return String.valueOf(paramᐧｴ.ᐨẏ()); 
      if (((ﭘ)(ᐧｴ1 = paramᐧｴ)).ﾞл instanceof Boolean)
        return Boolean.toString(paramᐧｴ.ᴵƚ()); 
      if (((ﭘ)(ᐧｴ1 = paramᐧｴ)).ﾞл instanceof String)
        return paramᐧｴ.ᐨم(); 
      throw new AssertionError();
    } 
    if (ᐧｴ1 = paramᐧｴ instanceof ڊ) {
      "袞趉⿯䞳".toCharArray()[2] = (char)("袞趉⿯䞳".toCharArray()[2] ^ 0x1AFE);
      return ˉﻤ$ͺſ.v("袞趉⿯䞳".toCharArray(), (short)26116, 5, (short)2);
    } 
    throw new AssertionError();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˏﮐ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */