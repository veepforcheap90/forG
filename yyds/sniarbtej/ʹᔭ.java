package yyds.sniarbtej;

import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public final class ʹᔭ {
  private static final String ιᒶ = ˉﻤ$ͺſ.v("ಯ塶앭崸".toCharArray(), (short)24351, 5, (short)5).intern();
  
  private static final TimeZone ᐨẏ = TimeZone.getTimeZone(ˉﻤ$ͺſ.v("ꇲ묵初ဝ".toCharArray(), (short)3830, 4, (short)0).intern());
  
  private static String ᐨẏ(Date paramDate) {
    return ᐨẏ(paramDate, false, ᐨẏ);
  }
  
  private static String ᐨẏ(Date paramDate, boolean paramBoolean) {
    return ᐨẏ(paramDate, paramBoolean, ᐨẏ);
  }
  
  private static String ᐨẏ(Date paramDate, boolean paramBoolean, TimeZone paramTimeZone) {
    GregorianCalendar gregorianCalendar;
    (gregorianCalendar = new GregorianCalendar(paramTimeZone, Locale.US)).setTime(paramDate);
    int i = (i = (i = 19) + (paramBoolean ? 4 : 0)) + ((paramTimeZone.getRawOffset() == 0) ? 1 : 6);
    StringBuilder stringBuilder;
    ᐨẏ(stringBuilder = new StringBuilder(i), gregorianCalendar.get(1), 4);
    stringBuilder.append('-');
    ᐨẏ(stringBuilder, gregorianCalendar.get(2) + 1, 2);
    stringBuilder.append('-');
    ᐨẏ(stringBuilder, gregorianCalendar.get(5), 2);
    stringBuilder.append('T');
    ᐨẏ(stringBuilder, gregorianCalendar.get(11), 2);
    stringBuilder.append(':');
    ᐨẏ(stringBuilder, gregorianCalendar.get(12), 2);
    stringBuilder.append(':');
    ᐨẏ(stringBuilder, gregorianCalendar.get(13), 2);
    if (paramBoolean) {
      stringBuilder.append('.');
      ᐨẏ(stringBuilder, gregorianCalendar.get(14), 3);
    } 
    int j;
    if ((j = paramTimeZone.getOffset(gregorianCalendar.getTimeInMillis())) != 0) {
      int k = Math.abs(j / 60000 / 60);
      int m = Math.abs(j / 60000 % 60);
      stringBuilder.append((j < 0) ? 45 : 43);
      ᐨẏ(stringBuilder, k, 2);
      stringBuilder.append(':');
      ᐨẏ(stringBuilder, m, 2);
    } else {
      stringBuilder.append('Z');
    } 
    return stringBuilder.toString();
  }
  
  public static Date ᐨẏ(String paramString, ParsePosition paramParsePosition) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getIndex : ()I
    //   4: istore_3
    //   5: aload_0
    //   6: iload_3
    //   7: iinc #3, 4
    //   10: iload_3
    //   11: invokestatic ᐨẏ : (Ljava/lang/String;II)I
    //   14: istore #4
    //   16: aload_0
    //   17: iload_3
    //   18: bipush #45
    //   20: invokestatic ᐨẏ : (Ljava/lang/String;IC)Z
    //   23: ifeq -> 29
    //   26: iinc #3, 1
    //   29: aload_0
    //   30: iload_3
    //   31: iinc #3, 2
    //   34: iload_3
    //   35: invokestatic ᐨẏ : (Ljava/lang/String;II)I
    //   38: istore #5
    //   40: aload_0
    //   41: iload_3
    //   42: bipush #45
    //   44: invokestatic ᐨẏ : (Ljava/lang/String;IC)Z
    //   47: ifeq -> 53
    //   50: iinc #3, 1
    //   53: aload_0
    //   54: iload_3
    //   55: iinc #3, 2
    //   58: iload_3
    //   59: invokestatic ᐨẏ : (Ljava/lang/String;II)I
    //   62: istore_2
    //   63: iconst_0
    //   64: istore #6
    //   66: iconst_0
    //   67: istore #7
    //   69: iconst_0
    //   70: istore #8
    //   72: iconst_0
    //   73: istore #9
    //   75: aload_0
    //   76: iload_3
    //   77: bipush #84
    //   79: invokestatic ᐨẏ : (Ljava/lang/String;IC)Z
    //   82: dup
    //   83: istore #10
    //   85: ifne -> 123
    //   88: aload_0
    //   89: invokevirtual length : ()I
    //   92: iload_3
    //   93: if_icmpgt -> 123
    //   96: new java/util/GregorianCalendar
    //   99: dup
    //   100: iload #4
    //   102: iload #5
    //   104: iconst_1
    //   105: isub
    //   106: iload_2
    //   107: invokespecial <init> : (III)V
    //   110: astore #10
    //   112: aload_1
    //   113: iload_3
    //   114: invokevirtual setIndex : (I)V
    //   117: aload #10
    //   119: invokevirtual getTime : ()Ljava/util/Date;
    //   122: areturn
    //   123: iload #10
    //   125: ifeq -> 339
    //   128: aload_0
    //   129: iinc #3, 1
    //   132: iload_3
    //   133: iinc #3, 2
    //   136: iload_3
    //   137: invokestatic ᐨẏ : (Ljava/lang/String;II)I
    //   140: istore #6
    //   142: aload_0
    //   143: iload_3
    //   144: bipush #58
    //   146: invokestatic ᐨẏ : (Ljava/lang/String;IC)Z
    //   149: ifeq -> 155
    //   152: iinc #3, 1
    //   155: aload_0
    //   156: iload_3
    //   157: iinc #3, 2
    //   160: iload_3
    //   161: invokestatic ᐨẏ : (Ljava/lang/String;II)I
    //   164: istore #7
    //   166: aload_0
    //   167: iload_3
    //   168: bipush #58
    //   170: invokestatic ᐨẏ : (Ljava/lang/String;IC)Z
    //   173: ifeq -> 179
    //   176: iinc #3, 1
    //   179: aload_0
    //   180: invokevirtual length : ()I
    //   183: iload_3
    //   184: if_icmple -> 339
    //   187: aload_0
    //   188: iload_3
    //   189: invokevirtual charAt : (I)C
    //   192: dup
    //   193: istore #10
    //   195: bipush #90
    //   197: if_icmpeq -> 339
    //   200: iload #10
    //   202: bipush #43
    //   204: if_icmpeq -> 339
    //   207: iload #10
    //   209: bipush #45
    //   211: if_icmpeq -> 339
    //   214: aload_0
    //   215: iload_3
    //   216: iinc #3, 2
    //   219: iload_3
    //   220: invokestatic ᐨẏ : (Ljava/lang/String;II)I
    //   223: dup
    //   224: istore #8
    //   226: bipush #59
    //   228: if_icmple -> 242
    //   231: iload #8
    //   233: bipush #63
    //   235: if_icmpge -> 242
    //   238: bipush #59
    //   240: istore #8
    //   242: aload_0
    //   243: iload_3
    //   244: bipush #46
    //   246: invokestatic ᐨẏ : (Ljava/lang/String;IC)Z
    //   249: ifeq -> 339
    //   252: iinc #3, 1
    //   255: aload_0
    //   256: iload_3
    //   257: iconst_1
    //   258: iadd
    //   259: invokestatic ᐨم : (Ljava/lang/String;I)I
    //   262: dup
    //   263: istore #10
    //   265: iload_3
    //   266: iconst_3
    //   267: iadd
    //   268: invokestatic min : (II)I
    //   271: istore #11
    //   273: aload_0
    //   274: iload_3
    //   275: iload #11
    //   277: invokestatic ᐨẏ : (Ljava/lang/String;II)I
    //   280: istore #12
    //   282: iload #11
    //   284: iload_3
    //   285: isub
    //   286: lookupswitch default -> 332, 1 -> 322, 2 -> 312
    //   312: iload #12
    //   314: bipush #10
    //   316: imul
    //   317: istore #9
    //   319: goto -> 336
    //   322: iload #12
    //   324: bipush #100
    //   326: imul
    //   327: istore #9
    //   329: goto -> 336
    //   332: iload #12
    //   334: istore #9
    //   336: iload #10
    //   338: istore_3
    //   339: aload_0
    //   340: invokevirtual length : ()I
    //   343: iload_3
    //   344: if_icmpgt -> 380
    //   347: new java/lang/IllegalArgumentException
    //   350: dup
    //   351: ldc '⒧똮䜬䥌莃으婖Õ⋖ઋ邹媓Ⰼ夒ޟ酪ﱔ⹸ኽւ'
    //   353: invokevirtual toCharArray : ()[C
    //   356: dup
    //   357: dup
    //   358: bipush #21
    //   360: dup_x1
    //   361: caload
    //   362: sipush #3701
    //   365: ixor
    //   366: i2c
    //   367: castore
    //   368: sipush #27336
    //   371: iconst_3
    //   372: iconst_2
    //   373: invokestatic W : (Ljava/lang/Object;SBS)Ljava/lang/String;
    //   376: invokespecial <init> : (Ljava/lang/String;)V
    //   379: athrow
    //   380: aload_0
    //   381: iload_3
    //   382: invokevirtual charAt : (I)C
    //   385: dup
    //   386: istore #10
    //   388: bipush #90
    //   390: if_icmpne -> 404
    //   393: getstatic yyds/sniarbtej/ʹᔭ.ᐨẏ : Ljava/util/TimeZone;
    //   396: astore #10
    //   398: iinc #3, 1
    //   401: goto -> 771
    //   404: iload #10
    //   406: bipush #43
    //   408: if_icmpeq -> 418
    //   411: iload #10
    //   413: bipush #45
    //   415: if_icmpne -> 696
    //   418: aload_0
    //   419: iload_3
    //   420: invokevirtual substring : (I)Ljava/lang/String;
    //   423: astore #11
    //   425: iload_3
    //   426: aload #11
    //   428: invokevirtual length : ()I
    //   431: iadd
    //   432: istore_3
    //   433: ldc '噔굍㩟툺詔ႋ'
    //   435: invokevirtual toCharArray : ()[C
    //   438: dup
    //   439: dup
    //   440: iconst_2
    //   441: dup_x1
    //   442: caload
    //   443: sipush #15614
    //   446: ixor
    //   447: i2c
    //   448: castore
    //   449: sipush #32116
    //   452: iconst_2
    //   453: iconst_1
    //   454: invokestatic W : (Ljava/lang/Object;SBS)Ljava/lang/String;
    //   457: aload #11
    //   459: invokevirtual equals : (Ljava/lang/Object;)Z
    //   462: ifne -> 497
    //   465: ldc '쏜ᮢ?樜ꪳ爮䢄'
    //   467: invokevirtual toCharArray : ()[C
    //   470: dup
    //   471: dup
    //   472: iconst_0
    //   473: dup_x1
    //   474: caload
    //   475: sipush #26393
    //   478: ixor
    //   479: i2c
    //   480: castore
    //   481: sipush #28692
    //   484: iconst_2
    //   485: iconst_2
    //   486: invokestatic W : (Ljava/lang/Object;SBS)Ljava/lang/String;
    //   489: aload #11
    //   491: invokevirtual equals : (Ljava/lang/Object;)Z
    //   494: ifeq -> 505
    //   497: getstatic yyds/sniarbtej/ʹᔭ.ᐨẏ : Ljava/util/TimeZone;
    //   500: astore #10
    //   502: goto -> 771
    //   505: new java/lang/StringBuilder
    //   508: dup
    //   509: ldc '?䭵혱⪮'
    //   511: invokevirtual toCharArray : ()[C
    //   514: dup
    //   515: dup
    //   516: iconst_2
    //   517: dup_x1
    //   518: caload
    //   519: sipush #3873
    //   522: ixor
    //   523: i2c
    //   524: castore
    //   525: sipush #15357
    //   528: iconst_3
    //   529: iconst_1
    //   530: invokestatic W : (Ljava/lang/Object;SBS)Ljava/lang/String;
    //   533: invokespecial <init> : (Ljava/lang/String;)V
    //   536: aload #11
    //   538: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   541: invokevirtual toString : ()Ljava/lang/String;
    //   544: dup
    //   545: astore #12
    //   547: invokestatic getTimeZone : (Ljava/lang/String;)Ljava/util/TimeZone;
    //   550: dup
    //   551: astore #10
    //   553: invokevirtual getID : ()Ljava/lang/String;
    //   556: dup
    //   557: astore #11
    //   559: aload #12
    //   561: invokevirtual equals : (Ljava/lang/Object;)Z
    //   564: ifne -> 693
    //   567: aload #11
    //   569: ldc '齬ḧ'
    //   571: invokevirtual toCharArray : ()[C
    //   574: dup
    //   575: dup
    //   576: iconst_0
    //   577: dup_x1
    //   578: caload
    //   579: sipush #25664
    //   582: ixor
    //   583: i2c
    //   584: castore
    //   585: sipush #30018
    //   588: iconst_4
    //   589: iconst_5
    //   590: invokestatic W : (Ljava/lang/Object;SBS)Ljava/lang/String;
    //   593: ldc ''
    //   595: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   598: dup
    //   599: astore #11
    //   601: aload #12
    //   603: invokevirtual equals : (Ljava/lang/Object;)Z
    //   606: ifne -> 693
    //   609: new java/lang/IndexOutOfBoundsException
    //   612: dup
    //   613: new java/lang/StringBuilder
    //   616: dup
    //   617: ldc '甸耏ꏨ잮Ꝉ?鞀綆솖魋‫Ⳑ葎Ⴧ靲䴚?苹✹仏㺵刚邪棊ᆚ粒韰貔쵍範풬輾䌘'
    //   619: invokevirtual toCharArray : ()[C
    //   622: dup
    //   623: dup
    //   624: bipush #8
    //   626: dup_x1
    //   627: caload
    //   628: sipush #1589
    //   631: ixor
    //   632: i2c
    //   633: castore
    //   634: sipush #27314
    //   637: iconst_0
    //   638: iconst_3
    //   639: invokestatic W : (Ljava/lang/Object;SBS)Ljava/lang/String;
    //   642: invokespecial <init> : (Ljava/lang/String;)V
    //   645: aload #12
    //   647: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   650: ldc '㚝瀡쏑⫒㈕揦聥㲦?њ┢乚鱉㲸ᓕ⨢慤炔䃬'
    //   652: invokevirtual toCharArray : ()[C
    //   655: dup
    //   656: dup
    //   657: bipush #12
    //   659: dup_x1
    //   660: caload
    //   661: sipush #13784
    //   664: ixor
    //   665: i2c
    //   666: castore
    //   667: sipush #29029
    //   670: iconst_0
    //   671: iconst_1
    //   672: invokestatic W : (Ljava/lang/Object;SBS)Ljava/lang/String;
    //   675: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   678: aload #10
    //   680: invokevirtual getID : ()Ljava/lang/String;
    //   683: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   686: invokevirtual toString : ()Ljava/lang/String;
    //   689: invokespecial <init> : (Ljava/lang/String;)V
    //   692: athrow
    //   693: goto -> 771
    //   696: new java/lang/IndexOutOfBoundsException
    //   699: dup
    //   700: new java/lang/StringBuilder
    //   703: dup
    //   704: ldc '꣤쏁轅絚ꗖⷖᷠ឴㉥볈冾衡㱬芞슲⟺ᛪ⤸島ኚ݌ャ餺뉅뎡縗'
    //   706: invokevirtual toCharArray : ()[C
    //   709: dup
    //   710: dup
    //   711: bipush #19
    //   713: dup_x1
    //   714: caload
    //   715: sipush #18869
    //   718: ixor
    //   719: i2c
    //   720: castore
    //   721: sipush #29685
    //   724: iconst_2
    //   725: iconst_5
    //   726: invokestatic W : (Ljava/lang/Object;SBS)Ljava/lang/String;
    //   729: invokespecial <init> : (Ljava/lang/String;)V
    //   732: iload #10
    //   734: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   737: ldc '[⶗'
    //   739: invokevirtual toCharArray : ()[C
    //   742: dup
    //   743: dup
    //   744: iconst_0
    //   745: dup_x1
    //   746: caload
    //   747: sipush #8848
    //   750: ixor
    //   751: i2c
    //   752: castore
    //   753: sipush #13929
    //   756: iconst_5
    //   757: iconst_2
    //   758: invokestatic W : (Ljava/lang/Object;SBS)Ljava/lang/String;
    //   761: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   764: invokevirtual toString : ()Ljava/lang/String;
    //   767: invokespecial <init> : (Ljava/lang/String;)V
    //   770: athrow
    //   771: new java/util/GregorianCalendar
    //   774: dup
    //   775: aload #10
    //   777: invokespecial <init> : (Ljava/util/TimeZone;)V
    //   780: dup
    //   781: astore #11
    //   783: iconst_0
    //   784: invokevirtual setLenient : (Z)V
    //   787: aload #11
    //   789: iconst_1
    //   790: iload #4
    //   792: invokevirtual set : (II)V
    //   795: aload #11
    //   797: iconst_2
    //   798: iload #5
    //   800: iconst_1
    //   801: isub
    //   802: invokevirtual set : (II)V
    //   805: aload #11
    //   807: iconst_5
    //   808: iload_2
    //   809: invokevirtual set : (II)V
    //   812: aload #11
    //   814: bipush #11
    //   816: iload #6
    //   818: invokevirtual set : (II)V
    //   821: aload #11
    //   823: bipush #12
    //   825: iload #7
    //   827: invokevirtual set : (II)V
    //   830: aload #11
    //   832: bipush #13
    //   834: iload #8
    //   836: invokevirtual set : (II)V
    //   839: aload #11
    //   841: bipush #14
    //   843: iload #9
    //   845: invokevirtual set : (II)V
    //   848: aload_1
    //   849: iload_3
    //   850: invokevirtual setIndex : (I)V
    //   853: aload #11
    //   855: invokevirtual getTime : ()Ljava/util/Date;
    //   858: areturn
    //   859: dup
    //   860: astore_3
    //   861: astore_2
    //   862: goto -> 874
    //   865: dup
    //   866: astore_3
    //   867: astore_2
    //   868: goto -> 874
    //   871: dup
    //   872: astore_3
    //   873: astore_2
    //   874: aload_0
    //   875: ifnonnull -> 882
    //   878: aconst_null
    //   879: goto -> 947
    //   882: new java/lang/StringBuilder
    //   885: dup
    //   886: ldc '흉扭'
    //   888: invokevirtual toCharArray : ()[C
    //   891: dup
    //   892: dup
    //   893: iconst_0
    //   894: dup_x1
    //   895: caload
    //   896: sipush #29957
    //   899: ixor
    //   900: i2c
    //   901: castore
    //   902: sipush #11540
    //   905: iconst_1
    //   906: iconst_5
    //   907: invokestatic W : (Ljava/lang/Object;SBS)Ljava/lang/String;
    //   910: invokespecial <init> : (Ljava/lang/String;)V
    //   913: aload_0
    //   914: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   917: ldc '崐'
    //   919: invokevirtual toCharArray : ()[C
    //   922: dup
    //   923: dup
    //   924: iconst_0
    //   925: dup_x1
    //   926: caload
    //   927: sipush #5930
    //   930: ixor
    //   931: i2c
    //   932: castore
    //   933: sipush #21233
    //   936: iconst_0
    //   937: iconst_1
    //   938: invokestatic W : (Ljava/lang/Object;SBS)Ljava/lang/String;
    //   941: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   944: invokevirtual toString : ()Ljava/lang/String;
    //   947: astore_3
    //   948: aload_2
    //   949: invokevirtual getMessage : ()Ljava/lang/String;
    //   952: dup
    //   953: astore #4
    //   955: ifnull -> 966
    //   958: aload #4
    //   960: invokevirtual isEmpty : ()Z
    //   963: ifeq -> 1039
    //   966: new java/lang/StringBuilder
    //   969: dup
    //   970: ldc '✆䦹'
    //   972: invokevirtual toCharArray : ()[C
    //   975: dup
    //   976: dup
    //   977: iconst_0
    //   978: dup_x1
    //   979: caload
    //   980: sipush #20290
    //   983: ixor
    //   984: i2c
    //   985: castore
    //   986: sipush #27189
    //   989: iconst_5
    //   990: iconst_2
    //   991: invokestatic W : (Ljava/lang/Object;SBS)Ljava/lang/String;
    //   994: invokespecial <init> : (Ljava/lang/String;)V
    //   997: aload_2
    //   998: invokevirtual getClass : ()Ljava/lang/Class;
    //   1001: invokevirtual getName : ()Ljava/lang/String;
    //   1004: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1007: ldc '뎳ਾ'
    //   1009: invokevirtual toCharArray : ()[C
    //   1012: dup
    //   1013: dup
    //   1014: iconst_0
    //   1015: dup_x1
    //   1016: caload
    //   1017: sipush #6605
    //   1020: ixor
    //   1021: i2c
    //   1022: castore
    //   1023: sipush #17040
    //   1026: iconst_5
    //   1027: iconst_4
    //   1028: invokestatic W : (Ljava/lang/Object;SBS)Ljava/lang/String;
    //   1031: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1034: invokevirtual toString : ()Ljava/lang/String;
    //   1037: astore #4
    //   1039: new java/text/ParseException
    //   1042: dup
    //   1043: new java/lang/StringBuilder
    //   1046: dup
    //   1047: ldc '蓩趐㊪ᩞ相毚⤔⤵瑸㗮腌ﳾ颗탢ѾǗ怇戉猝'
    //   1049: invokevirtual toCharArray : ()[C
    //   1052: dup
    //   1053: dup
    //   1054: iconst_4
    //   1055: dup_x1
    //   1056: caload
    //   1057: sipush #9952
    //   1060: ixor
    //   1061: i2c
    //   1062: castore
    //   1063: sipush #21161
    //   1066: iconst_5
    //   1067: iconst_1
    //   1068: invokestatic W : (Ljava/lang/Object;SBS)Ljava/lang/String;
    //   1071: invokespecial <init> : (Ljava/lang/String;)V
    //   1074: aload_3
    //   1075: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1078: ldc '筪螹ᒨ㸟'
    //   1080: invokevirtual toCharArray : ()[C
    //   1083: dup
    //   1084: dup
    //   1085: iconst_1
    //   1086: dup_x1
    //   1087: caload
    //   1088: sipush #8803
    //   1091: ixor
    //   1092: i2c
    //   1093: castore
    //   1094: sipush #1547
    //   1097: iconst_4
    //   1098: iconst_3
    //   1099: invokestatic W : (Ljava/lang/Object;SBS)Ljava/lang/String;
    //   1102: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1105: aload #4
    //   1107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1110: invokevirtual toString : ()Ljava/lang/String;
    //   1113: aload_1
    //   1114: invokevirtual getIndex : ()I
    //   1117: invokespecial <init> : (Ljava/lang/String;I)V
    //   1120: dup
    //   1121: astore #5
    //   1123: aload_2
    //   1124: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1127: pop
    //   1128: aload #5
    //   1130: athrow
    // Exception table:
    //   from	to	target	type
    //   0	122	859	java/lang/IndexOutOfBoundsException
    //   0	122	865	java/lang/NumberFormatException
    //   0	122	871	java/lang/IllegalArgumentException
    //   123	858	859	java/lang/IndexOutOfBoundsException
    //   123	858	865	java/lang/NumberFormatException
    //   123	858	871	java/lang/IllegalArgumentException
  }
  
  private static boolean ᐨẏ(String paramString, int paramInt, char paramChar) {
    return (paramInt < paramString.length() && paramString.charAt(paramInt) == paramChar);
  }
  
  private static int ᐨẏ(String paramString, int paramInt1, int paramInt2) {
    if (paramInt1 < 0 || paramInt2 > paramString.length() || paramInt1 > paramInt2)
      throw new NumberFormatException(paramString); 
    int i = paramInt1;
    int j = 0;
    if (i < paramInt2) {
      int k;
      if ((k = Character.digit(paramString.charAt(i++), 10)) < 0) {
        "軌ኝ巇䠾ꙙ뽀?䫎ᩝ㽙ᬭ쾚㝞?▗㹧砛".toCharArray()[1] = (char)("軌ኝ巇䠾ꙙ뽀?䫎ᩝ㽙ᬭ쾚㝞?▗㹧砛".toCharArray()[1] ^ 0x5D30);
        throw new NumberFormatException(ᐨẏ$ᐝт.W("軌ኝ巇䠾ꙙ뽀?䫎ᩝ㽙ᬭ쾚㝞?▗㹧砛".toCharArray(), (short)23612, (byte)5, (short)5) + paramString.substring(paramInt1, paramInt2));
      } 
      j = -k;
    } 
    while (i < paramInt2) {
      int k;
      if ((k = Character.digit(paramString.charAt(i++), 10)) < 0) {
        "᳋ᰉⅽ㊨鈷␸鱇ꆴ옐屢笾捔┆쨑ڂ吤".toCharArray()[14] = (char)("᳋ᰉⅽ㊨鈷␸鱇ꆴ옐屢笾捔┆쨑ڂ吤".toCharArray()[14] ^ 0x2380);
        throw new NumberFormatException(ᐨẏ$ᐝт.W("᳋ᰉⅽ㊨鈷␸鱇ꆴ옐屢笾捔┆쨑ڂ吤".toCharArray(), (short)24972, (byte)5, (short)3) + paramString.substring(paramInt1, paramInt2));
      } 
      j = (j *= 10) - k;
    } 
    return -j;
  }
  
  private static void ᐨẏ(StringBuilder paramStringBuilder, int paramInt1, int paramInt2) {
    String str = Integer.toString(paramInt1);
    for (paramInt2 -= str.length(); paramInt2 > 0; paramInt2--)
      paramStringBuilder.append('0'); 
    paramStringBuilder.append(str);
  }
  
  private static int ᐨم(String paramString, int paramInt) {
    for (paramInt = paramInt; paramInt < paramString.length(); paramInt++) {
      char c;
      if ((c = paramString.charAt(paramInt)) < '0' || c > '9')
        return paramInt; 
    } 
    return paramString.length();
  }
  
  static {
    "ಯ塶앭崸".toCharArray()[0] = (char)("ಯ塶앭崸".toCharArray()[0] ^ 0x74C3);
  }
  
  static {
    "ꇲ묵初ဝ".toCharArray()[2] = (char)("ꇲ묵初ဝ".toCharArray()[2] ^ 0x69CE);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ʹᔭ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */