package yyds.sniarbtej;

final class ˏｔ extends ٴۉ<ᐧｴ> {
  private ᐧｴ ˊ(יּ paramיּ) {
    String str;
    ˋℷ ˋℷ;
    ʻṪ ʻṪ;
    switch (ᴵᔿ.ʹō[paramיּ.ᐨẏ().ordinal()]) {
      case 3:
        return new ﭘ(paramיּ.ٴӵ());
      case 1:
        str = paramיּ.ٴӵ();
        return new ﭘ(new ˌﺙ(str));
      case 2:
        return new ﭘ(Boolean.valueOf(str.ˈے()));
      case 4:
        str.ۦ();
        return ڊ.ᐨẏ;
      case 5:
        ˋℷ = new ˋℷ();
        str.ᵘ();
        while (str.hasNext())
          ˋℷ.ᐨẏ(ˊ((יּ)str)); 
        str.ˑܥ();
        return ˋℷ;
      case 6:
        ʻṪ = new ʻṪ();
        str.ᐨ();
        while (str.hasNext())
          ʻṪ.ᐨẏ(str.ͺо(), ˊ((יּ)str)); 
        str.ﾞঽ();
        return ʻṪ;
    } 
    throw new IllegalArgumentException();
  }
  
  private void ᐨẏ(Ⴡ paramჁ, ᐧｴ paramᐧｴ) {
    // Byte code:
    //   0: aload_2
    //   1: ifnull -> 13
    //   4: aload_2
    //   5: dup
    //   6: astore_3
    //   7: instanceof yyds/sniarbtej/ڊ
    //   10: ifeq -> 19
    //   13: aload_1
    //   14: invokevirtual ʿᵉ : ()Lyyds/sniarbtej/Ⴡ;
    //   17: pop
    //   18: return
    //   19: aload_2
    //   20: dup
    //   21: astore_3
    //   22: instanceof yyds/sniarbtej/ﭘ
    //   25: ifeq -> 91
    //   28: aload_2
    //   29: invokevirtual ᐨẏ : ()Lyyds/sniarbtej/ﭘ;
    //   32: dup
    //   33: astore_2
    //   34: dup
    //   35: astore_3
    //   36: getfield ﾞл : Ljava/lang/Object;
    //   39: instanceof java/lang/Number
    //   42: ifeq -> 57
    //   45: aload_1
    //   46: aload_2
    //   47: invokevirtual ᐨẏ : ()Ljava/lang/Number;
    //   50: invokevirtual ᐨẏ : (Ljava/lang/Number;)Lyyds/sniarbtej/Ⴡ;
    //   53: pop
    //   54: goto -> 392
    //   57: aload_2
    //   58: dup
    //   59: astore_3
    //   60: getfield ﾞл : Ljava/lang/Object;
    //   63: instanceof java/lang/Boolean
    //   66: ifeq -> 81
    //   69: aload_1
    //   70: aload_2
    //   71: invokevirtual ᴵƚ : ()Z
    //   74: invokevirtual ᐨẏ : (Z)Lyyds/sniarbtej/Ⴡ;
    //   77: pop
    //   78: goto -> 392
    //   81: aload_1
    //   82: aload_2
    //   83: invokevirtual ᐨم : ()Ljava/lang/String;
    //   86: invokevirtual ˊ : (Ljava/lang/String;)Lyyds/sniarbtej/Ⴡ;
    //   89: pop
    //   90: return
    //   91: aload_2
    //   92: dup
    //   93: astore_3
    //   94: instanceof yyds/sniarbtej/ˋℷ
    //   97: ifeq -> 194
    //   100: aload_1
    //   101: invokevirtual ᐨẏ : ()Lyyds/sniarbtej/Ⴡ;
    //   104: pop
    //   105: aload_2
    //   106: dup
    //   107: astore_2
    //   108: dup
    //   109: astore_3
    //   110: instanceof yyds/sniarbtej/ˋℷ
    //   113: ifeq -> 123
    //   116: aload_2
    //   117: checkcast yyds/sniarbtej/ˋℷ
    //   120: goto -> 156
    //   123: new java/lang/IllegalStateException
    //   126: dup
    //   127: ldc 'ƿׅ뗖巾Ꮴ㒤讱꽒陋孛蠇郢繻嶩⣒컓?↣摻ꋱ떊ᆺ彻'
    //   129: invokevirtual toCharArray : ()[C
    //   132: dup
    //   133: dup
    //   134: bipush #18
    //   136: dup_x1
    //   137: caload
    //   138: sipush #21716
    //   141: ixor
    //   142: i2c
    //   143: castore
    //   144: sipush #3195
    //   147: iconst_0
    //   148: iconst_3
    //   149: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   152: invokespecial <init> : (Ljava/lang/String;)V
    //   155: athrow
    //   156: invokevirtual iterator : ()Ljava/util/Iterator;
    //   159: astore_2
    //   160: aload_2
    //   161: invokeinterface hasNext : ()Z
    //   166: ifeq -> 188
    //   169: aload_2
    //   170: invokeinterface next : ()Ljava/lang/Object;
    //   175: checkcast yyds/sniarbtej/ᐧｴ
    //   178: astore_3
    //   179: aload_0
    //   180: aload_1
    //   181: aload_3
    //   182: invokevirtual ᐨẏ : (Lyyds/sniarbtej/Ⴡ;Lyyds/sniarbtej/ᐧｴ;)V
    //   185: goto -> 160
    //   188: aload_1
    //   189: invokevirtual ˊ : ()Lyyds/sniarbtej/Ⴡ;
    //   192: pop
    //   193: return
    //   194: aload_2
    //   195: dup
    //   196: astore_3
    //   197: instanceof yyds/sniarbtej/ʻṪ
    //   200: ifeq -> 343
    //   203: aload_1
    //   204: invokevirtual ᴵʖ : ()Lyyds/sniarbtej/Ⴡ;
    //   207: pop
    //   208: aload_2
    //   209: dup
    //   210: astore_2
    //   211: dup
    //   212: astore_3
    //   213: instanceof yyds/sniarbtej/ʻṪ
    //   216: ifeq -> 226
    //   219: aload_2
    //   220: checkcast yyds/sniarbtej/ʻṪ
    //   223: goto -> 273
    //   226: new java/lang/IllegalStateException
    //   229: dup
    //   230: new java/lang/StringBuilder
    //   233: dup
    //   234: ldc '禽槛벏⨶뒜㭩잮؍ךּ餑?鑏⦿蟗刓ｑ⽗'
    //   236: invokevirtual toCharArray : ()[C
    //   239: dup
    //   240: dup
    //   241: bipush #17
    //   243: dup_x1
    //   244: caload
    //   245: sipush #28571
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: sipush #1454
    //   254: iconst_0
    //   255: iconst_1
    //   256: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   259: invokespecial <init> : (Ljava/lang/String;)V
    //   262: aload_2
    //   263: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   266: invokevirtual toString : ()Ljava/lang/String;
    //   269: invokespecial <init> : (Ljava/lang/String;)V
    //   272: athrow
    //   273: dup
    //   274: astore_3
    //   275: getfield ᐨẏ : Lyyds/sniarbtej/ᐝʶ;
    //   278: invokevirtual entrySet : ()Ljava/util/Set;
    //   281: invokeinterface iterator : ()Ljava/util/Iterator;
    //   286: astore_2
    //   287: aload_2
    //   288: invokeinterface hasNext : ()Z
    //   293: ifeq -> 337
    //   296: aload_2
    //   297: invokeinterface next : ()Ljava/lang/Object;
    //   302: checkcast java/util/Map$Entry
    //   305: astore_3
    //   306: aload_1
    //   307: aload_3
    //   308: invokeinterface getKey : ()Ljava/lang/Object;
    //   313: checkcast java/lang/String
    //   316: invokevirtual ᐨẏ : (Ljava/lang/String;)Lyyds/sniarbtej/Ⴡ;
    //   319: pop
    //   320: aload_0
    //   321: aload_1
    //   322: aload_3
    //   323: invokeinterface getValue : ()Ljava/lang/Object;
    //   328: checkcast yyds/sniarbtej/ᐧｴ
    //   331: invokevirtual ᐨẏ : (Lyyds/sniarbtej/Ⴡ;Lyyds/sniarbtej/ᐧｴ;)V
    //   334: goto -> 287
    //   337: aload_1
    //   338: invokevirtual ﾞл : ()Lyyds/sniarbtej/Ⴡ;
    //   341: pop
    //   342: return
    //   343: new java/lang/IllegalArgumentException
    //   346: dup
    //   347: new java/lang/StringBuilder
    //   350: dup
    //   351: ldc 'ﾕ뿽瞭?Ɓ懷ꯐ䉏쥉ༀ䗝䥸澾免䩌'
    //   353: invokevirtual toCharArray : ()[C
    //   356: dup
    //   357: dup
    //   358: iconst_1
    //   359: dup_x1
    //   360: caload
    //   361: sipush #8673
    //   364: ixor
    //   365: i2c
    //   366: castore
    //   367: sipush #1516
    //   370: iconst_5
    //   371: iconst_0
    //   372: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   375: invokespecial <init> : (Ljava/lang/String;)V
    //   378: aload_2
    //   379: invokevirtual getClass : ()Ljava/lang/Class;
    //   382: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   385: invokevirtual toString : ()Ljava/lang/String;
    //   388: invokespecial <init> : (Ljava/lang/String;)V
    //   391: athrow
    //   392: return
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˏｔ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */