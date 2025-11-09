package yyds.sniarbtej;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ʹﮃ {
  private static int ՙᗮ = 1;
  
  private static int ˍɫ = 2;
  
  private static int ʽ = 4;
  
  private static int ʾܪ = 8;
  
  private static int ᐨم = 256;
  
  private static final int ʾ = 1048576;
  
  private static final int ͺо = 4096;
  
  @Deprecated
  private byte[] ᴵʖ;
  
  private int ٴӵ;
  
  private byte[] ﾞл;
  
  private final int[] ᐨẏ;
  
  private final String[] ᐨẏ;
  
  private final ʾܪ[] ᐨẏ;
  
  private final int[] ˊ;
  
  private final int ᴵƚ;
  
  public ʹﮃ(byte[] paramArrayOfbyte) {
    this(paramArrayOfbyte, 0);
  }
  
  private ʹﮃ(byte[] paramArrayOfbyte, int paramInt) {
    this(paramArrayOfbyte, 0, true);
  }
  
  ʹﮃ(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    this.ﾞл = paramArrayOfbyte;
    if (paramBoolean && ᐨẏ(paramInt + 6) > 67) {
      "ƣ︤즪ᳺڀ鎙り嫜帶ݲ굁冷䑁?쳏㛵꾭橻ꑯꫡ꺀핟헠ꗌ?೾엷♩儜⦑终ど馅潲䩸꾤扅".toCharArray()[1] = (char)("ƣ︤즪ᳺڀ鎙り嫜帶ݲ굁冷䑁?쳏㛵꾭橻ꑯꫡ꺀핟헠ꗌ?೾엷♩儜⦑终ど馅潲䩸꾤扅".toCharArray()[1] ^ 0x3839);
      throw new IllegalArgumentException(ˉﻤ$ͺſ.v("ƣ︤즪ᳺڀ鎙り嫜帶ݲ굁冷䑁?쳏㛵꾭橻ꑯꫡ꺀핟헠ꗌ?೾엷♩儜⦑终ど馅潲䩸꾤扅".toCharArray(), (short)20787, 2, (short)0) + ᐨẏ(paramInt + 6));
    } 
    int i = ᴵʖ(paramInt + 8);
    this.ᐨẏ = (ʾܪ[])new int[i];
    this.ᐨẏ = (ʾܪ[])new String[i];
    byte b = 1;
    paramInt += 10;
    int j = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    while (b < i) {
      int k;
      this.ᐨẏ[b++] = paramInt + 1;
      switch (paramArrayOfbyte[paramInt]) {
        case 3:
        case 4:
        case 9:
        case 10:
        case 11:
        case 12:
          k = 5;
          break;
        case 17:
          k = 5;
          bool1 = true;
          bool2 = true;
          break;
        case 18:
          k = 5;
          bool1 = true;
          break;
        case 5:
        case 6:
          k = 9;
          b++;
          break;
        case 1:
          if ((k = 3 + ᴵʖ(paramInt + 1)) > j)
            j = k; 
          break;
        case 15:
          k = 4;
          break;
        case 7:
        case 8:
        case 16:
        case 19:
        case 20:
          k = 3;
          break;
        default:
          throw new IllegalArgumentException();
      } 
      paramInt += k;
    } 
    this.ᴵƚ = j;
    this.ٴӵ = paramInt;
    this.ᐨẏ = bool2 ? new ʾܪ[i] : null;
    this.ˊ = bool1 ? ᐨẏ(j) : null;
  }
  
  public ʹﮃ(InputStream paramInputStream) {
    this(ᐨẏ(paramInputStream, false));
  }
  
  public ʹﮃ(String paramString) {
    this(ᐨẏ(ClassLoader.getSystemResourceAsStream(paramString.replace('.', '/') + ˍɫ$יς.J("禙䊂ᐼ멈?ὦ".toCharArray(), (short)16227, (short)3, (byte)4)), true));
  }
  
  private static byte[] ᐨẏ(InputStream paramInputStream, boolean paramBoolean) {
    if (paramInputStream == null) {
      "晸鉯呰㛓쥝ꩭ醗ṕ鏶헠쎓迶枲ٗ᫼".toCharArray()[1] = (char)("晸鉯呰㛓쥝ꩭ醗ṕ鏶헠쎓迶枲ٗ᫼".toCharArray()[1] ^ 0x6778);
      throw new IOException(ˍɫ$יς.J("晸鉯呰㛓쥝ꩭ醗ṕ鏶헠쎓迶枲ٗ᫼".toCharArray(), (short)20271, (short)1, (byte)5));
    } 
    InputStream inputStream;
    int i = ((i = (inputStream = paramInputStream).available()) < 256) ? 4096 : Math.min(i, 1048576);
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    } finally {
      if (paramBoolean)
        paramInputStream.close(); 
    } 
  }
  
  private static int ᐨẏ(InputStream paramInputStream) {
    int i;
    return ((i = paramInputStream.available()) < 256) ? 4096 : Math.min(i, 1048576);
  }
  
  public final int ˊ() {
    return ᴵʖ(this.ٴӵ);
  }
  
  public final String ᐨẏ() {
    char[] arrayOfChar = new char[this.ᴵƚ];
    int i = this.ٴӵ + 2;
    ʹﮃ ʹﮃ1;
    return (ʹﮃ1 = this).ᴵʖ(i, arrayOfChar);
  }
  
  public final String ˊ() {
    char[] arrayOfChar = new char[this.ᴵƚ];
    int i = this.ٴӵ + 4;
    ʹﮃ ʹﮃ1;
    return (ʹﮃ1 = this).ᴵʖ(i, arrayOfChar);
  }
  
  public final String[] ᐨẏ() {
    int i = this.ٴӵ + 6;
    int j;
    String[] arrayOfString = new String[j = ᴵʖ(i)];
    if (j > 0) {
      char[] arrayOfChar = new char[this.ᴵƚ];
      for (byte b = 0; b < j; b++) {
        i += 2;
        char[] arrayOfChar1 = arrayOfChar;
        int k = i;
        ʹﮃ ʹﮃ1;
        arrayOfString[b] = (ʹﮃ1 = this).ᴵʖ(k, arrayOfChar1);
      } 
    } 
    return arrayOfString;
  }
  
  public final void ᐨẏ(ˍɫ paramˍɫ, int paramInt) {
    ᐨẏ(paramˍɫ, new ᴵʖ[0], paramInt);
  }
  
  public final void ᐨẏ(ˍɫ paramˍɫ, ᴵʖ[] paramArrayOfᴵʖ, int paramInt) {
    ʾ ʾ;
    (ʾ = new ʾ()).ˊ = (Object[])paramArrayOfᴵʖ;
    ʾ.ᕁ = paramInt;
    ʾ.ᐨẏ = (ˏɪ)new char[this.ᴵƚ];
    ˏɪ ˏɪ1 = ʾ.ᐨẏ;
    int i = this.ٴӵ;
    int j = ᴵʖ(i);
    ˏɪ ˏɪ2 = ˏɪ1;
    int i12 = i + 2;
    ʹﮃ ʹﮃ1;
    String str1 = (ʹﮃ1 = this).ᴵʖ(i12, (char[])ˏɪ2);
    ˏɪ2 = ˏɪ1;
    i12 = i + 4;
    String str2 = (ʹﮃ1 = this).ᴵʖ(i12, (char[])ˏɪ2);
    String[] arrayOfString = new String[ᴵʖ(i + 6)];
    i += 8;
    int k;
    for (k = 0; k < arrayOfString.length; k++) {
      ˏɪ2 = ˏɪ1;
      i12 = i;
      arrayOfString[k] = (ʹﮃ1 = this).ᴵʖ(i12, (char[])ˏɪ2);
      i += 2;
    } 
    k = 0;
    int m = 0;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    String str6 = null;
    String str7 = null;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    ᴵʖ ᴵʖ1 = null;
    int i9 = ᴵʖ();
    int i10;
    for (i10 = ᴵʖ(i9 - 2); i10 > 0; i10--) {
      String str = ᐨẏ(i9, (char[])ˏɪ1);
      int i13 = ﾞл(i9 + 2);
      i9 += 6;
      "ᶻ⺇ᑣ?꧑왳𢡊㦚⣯".toCharArray()[8] = (char)("ᶻ⺇ᑣ?꧑왳𢡊㦚⣯".toCharArray()[8] ^ 0x5AE1);
      if (ᐨẏ$ᐝт.W("ᶻ⺇ᑣ?꧑왳𢡊㦚⣯".toCharArray(), (short)18256, (byte)5, (short)0).equals(str)) {
        str4 = ᐨẏ(i9, (char[])ˏɪ1);
      } else {
        "̢썜쯉敢쭜‛䀛롛ꗴ係钨寕䈏".toCharArray()[2] = (char)("̢썜쯉敢쭜‛䀛롛ꗴ係钨寕䈏".toCharArray()[2] ^ 0xC68);
        if (ᐨẏ$ᐝт.W("̢썜쯉敢쭜‛䀛롛ꗴ係钨寕䈏".toCharArray(), (short)7595, (byte)3, (short)4).equals(str)) {
          k = i9;
        } else {
          "쓬ৣৎ膑泗Śᳲ톧㍎瘉ᅼ㞛뺙৳".toCharArray()[2] = (char)("쓬ৣৎ膑泗Śᳲ톧㍎瘉ᅼ㞛뺙৳".toCharArray()[2] ^ 0x881);
          if (ᐨẏ$ᐝт.W("쓬ৣৎ膑泗Śᳲ톧㍎瘉ᅼ㞛뺙৳".toCharArray(), (short)30555, (byte)0, (short)3).equals(str)) {
            m = i9;
          } else {
            "龋㑸렾즔伛管⌮匎燢".toCharArray()[5] = (char)("龋㑸렾즔伛管⌮匎燢".toCharArray()[5] ^ 0x939);
            if (ᐨẏ$ᐝт.W("龋㑸렾즔伛管⌮匎燢".toCharArray(), (short)25475, (byte)5, (short)5).equals(str)) {
              ˏɪ2 = ˏɪ1;
              i12 = i9;
              str7 = (ʹﮃ1 = this).ᴵʖ(i12, (char[])ˏɪ2);
            } else {
              "⺢蠉̓쌻㷡곜焪혳葒鸖話偦".toCharArray()[5] = (char)("⺢蠉̓쌻㷡곜焪혳葒鸖話偦".toCharArray()[5] ^ 0xEB4);
              if (ᐨẏ$ᐝт.W("⺢蠉̓쌻㷡곜焪혳葒鸖話偦".toCharArray(), (short)614, (byte)2, (short)1).equals(str)) {
                i6 = i9;
              } else {
                "鹡৏த脅澮ﮟ쒻맖䁡议몮荗즠↑㳢嶊쑍ゝ䔂".toCharArray()[3] = (char)("鹡৏த脅澮ﮟ쒻맖䁡议몮荗즠↑㳢嶊쑍ゝ䔂".toCharArray()[3] ^ 0x4841);
                if (ᐨẏ$ᐝт.W("鹡৏த脅澮ﮟ쒻맖䁡议몮荗즠↑㳢嶊쑍ゝ䔂".toCharArray(), (short)16871, (byte)2, (short)3).equals(str)) {
                  i7 = i9;
                } else {
                  "뫰㝥ិ䇻峚菷萄귨ٛ".toCharArray()[4] = (char)("뫰㝥ិ䇻峚菷萄귨ٛ".toCharArray()[4] ^ 0x7660);
                  if (ᐨẏ$ᐝт.W("뫰㝥ិ䇻峚菷萄귨ٛ".toCharArray(), (short)23020, (byte)0, (short)2).equals(str)) {
                    str3 = ᐨẏ(i9, (char[])ˏɪ1);
                  } else {
                    "싖.憟憷샹쯟冤밹敖勣ᩲꗖ管?쓅뷴ሻ猘唣ᗤ뵋㚠听".toCharArray()[7] = (char)("싖.憟憷샹쯟冤밹敖勣ᩲꗖ管?쓅뷴ሻ猘唣ᗤ뵋㚠听".toCharArray()[7] ^ 0x5B97);
                    if (ᐨẏ$ᐝт.W("싖.憟憷샹쯟冤밹敖勣ᩲꗖ管?쓅뷴ሻ猘唣ᗤ뵋㚠听".toCharArray(), (short)24914, (byte)2, (short)3).equals(str)) {
                      n = i9;
                    } else {
                      "羃⋿֫彞鲮砇䥳悏㲄﯀췣齥裖萱ૺ⦋䴟쐿픻죤ע얘㓿⛳㲎".toCharArray()[18] = (char)("羃⋿֫彞鲮砇䥳悏㲄﯀췣齥裖萱ૺ⦋䴟쐿픻죤ע얘㓿⛳㲎".toCharArray()[18] ^ 0x14C8);
                      if (ᐨẏ$ᐝт.W("羃⋿֫彞鲮砇䥳悏㲄﯀췣齥裖萱ૺ⦋䴟쐿픻죤ע얘㓿⛳㲎".toCharArray(), (short)19126, (byte)0, (short)4).equals(str)) {
                        i2 = i9;
                      } else {
                        "苷줓ᎅǌ⢪֩ᡊ⛲佸㸵".toCharArray()[8] = (char)("苷줓ᎅǌ⢪֩ᡊ⛲佸㸵".toCharArray()[8] ^ 0x699D);
                        if (ᐨẏ$ᐝт.W("苷줓ᎅǌ⢪֩ᡊ⛲佸㸵".toCharArray(), (short)25778, (byte)3, (short)1).equals(str)) {
                          j |= 0x20000;
                        } else {
                          "侳촎鼨좨곌汸䴧뇖㰵䍣".toCharArray()[2] = (char)("侳촎鼨좨곌汸䴧뇖㰵䍣".toCharArray()[2] ^ 0xAE9);
                          if (ᐨẏ$ᐝт.W("侳촎鼨좨곌汸䴧뇖㰵䍣".toCharArray(), (short)358, (byte)4, (short)5).equals(str)) {
                            j |= 0x1000;
                          } else {
                            "⁁꺥?䊹☆鍴Ἤ娔秮婲ఞ䨢㌞퉿醒玡憄紛".toCharArray()[11] = (char)("⁁꺥?䊹☆鍴Ἤ娔秮婲ఞ䨢㌞퉿醒玡憄紛".toCharArray()[11] ^ 0x167C);
                            if (ᐨẏ$ᐝт.W("⁁꺥?䊹☆鍴Ἤ娔秮婲ఞ䨢㌞퉿醒玡憄紛".toCharArray(), (short)8029, (byte)5, (short)2).equals(str)) {
                              if (i13 > this.ﾞл.length - i9)
                                throw new IllegalArgumentException(); 
                              str5 = ᐨẏ(i9, i13, new char[i13]);
                            } else {
                              "觜ឹ鮳側牔郋㭑ͼ슨＞쓿羓ﶜ홍悂㪟朐䧃睨銪⨋ᓸ䫿㇁".toCharArray()[2] = (char)("觜ឹ鮳側牔郋㭑ͼ슨＞쓿羓ﶜ홍悂㪟朐䧃睨銪⨋ᓸ䫿㇁".toCharArray()[2] ^ 0x1F53);
                              if (ᐨẏ$ᐝт.W("觜ឹ鮳側牔郋㭑ͼ슨＞쓿羓ﶜ홍悂㪟朐䧃睨銪⨋ᓸ䫿㇁".toCharArray(), (short)31966, (byte)1, (short)3).equals(str)) {
                                i1 = i9;
                              } else {
                                "ᬒ⏺ㅂ쾪??詁䂾萅쑙㦷結ٝ䁒襌벮歾彜䂪䐼⃭楤ΰ喒╝饘ᄷ՟".toCharArray()[2] = (char)("ᬒ⏺ㅂ쾪??詁䂾萅쑙㦷結ٝ䁒襌벮歾彜䂪䐼⃭楤ΰ喒╝饘ᄷ՟".toCharArray()[2] ^ 0x34A4);
                                if (ᐨẏ$ᐝт.W("ᬒ⏺ㅂ쾪??詁䂾萅쑙㦷結ٝ䁒襌벮歾彜䂪䐼⃭楤ΰ喒╝饘ᄷ՟".toCharArray(), (short)4715, (byte)2, (short)5).equals(str)) {
                                  i3 = i9;
                                } else {
                                  "㎿綸뉔㻭㪪㫸撸".toCharArray()[0] = (char)("㎿綸뉔㻭㪪㫸撸".toCharArray()[0] ^ 0x1728);
                                  if (ᐨẏ$ᐝт.W("㎿綸뉔㻭㪪㫸撸".toCharArray(), (short)387, (byte)5, (short)1).equals(str)) {
                                    i8 = i9;
                                    j |= 0x10000;
                                  } else {
                                    "㽖?芟劀鸢烢".toCharArray()[3] = (char)("㽖?芟劀鸢烢".toCharArray()[3] ^ 0x4B2F);
                                    if (ᐨẏ$ᐝт.W("㽖?芟劀鸢烢".toCharArray(), (short)3955, (byte)0, (short)5).equals(str)) {
                                      i4 = i9;
                                    } else {
                                      "ꡋ黤뭐䱗→뚡唫튙씅彗̩ු?䌯㬙".toCharArray()[14] = (char)("ꡋ黤뭐䱗→뚡唫튙씅彗̩ු?䌯㬙".toCharArray()[14] ^ 0x9AC);
                                      if (ᐨẏ$ᐝт.W("ꡋ黤뭐䱗→뚡唫튙씅彗̩ු?䌯㬙".toCharArray(), (short)18076, (byte)4, (short)2).equals(str)) {
                                        ˏɪ2 = ˏɪ1;
                                        i12 = i9;
                                        str6 = (ʹﮃ1 = this).ᴵʖ(i12, (char[])ˏɪ2);
                                      } else {
                                        "┕擄뀬盅칷琏舢漓鰅츨듵㕥撆".toCharArray()[0] = (char)("┕擄뀬盅칷琏舢漓鰅츨듵㕥撆".toCharArray()[0] ^ 0x1143);
                                        if (ᐨẏ$ᐝт.W("┕擄뀬盅칷琏舢漓鰅츨듵㕥撆".toCharArray(), (short)31201, (byte)5, (short)5).equals(str)) {
                                          i5 = i9;
                                        } else {
                                          "꣋柹曅ꏈ犧匐徲䝵䄉ᴠ쾄蚿縔敤⃟ⵙ".toCharArray()[12] = (char)("꣋柹曅ꏈ犧匐徲䝵䄉ᴠ쾄蚿縔敤⃟ⵙ".toCharArray()[12] ^ 0x7B14);
                                          if (!ᐨẏ$ᐝт.W("꣋柹曅ꏈ犧匐徲䝵䄉ᴠ쾄蚿縔敤⃟ⵙ".toCharArray(), (short)3188, (byte)4, (short)3).equals(str)) {
                                            ᴵʖ ᴵʖ2;
                                            (ᴵʖ2 = ᐨẏ(paramArrayOfᴵʖ, str, i9, i13, (char[])ˏɪ1, -1, null)).ᐨẏ = ᴵʖ1;
                                            ᴵʖ1 = ᴵʖ2;
                                          } 
                                        } 
                                      } 
                                    } 
                                  } 
                                } 
                              } 
                            } 
                          } 
                        } 
                      } 
                    } 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
      i9 += i13;
    } 
    paramˍɫ.ᐨẏ(ﾞл(this.ᐨẏ[1] - 7), j, str1, str3, str2, arrayOfString);
    if ((paramInt & 0x2) == 0 && (str4 != null || str5 != null))
      paramˍɫ.ᐨẏ(str4, str5); 
    if (i4 != 0)
      ᐨẏ(paramˍɫ, ʾ, i4, i5, str6); 
    if (str7 != null)
      paramˍɫ.ᐨẏ(str7); 
    if (m != 0) {
      ˏɪ2 = ˏɪ1;
      i12 = m;
      String str8 = (ʹﮃ1 = this).ᴵʖ(i12, (char[])ˏɪ2);
      int i13;
      String str10 = ((i13 = ᴵʖ(m + 2)) == 0) ? null : ᐨẏ(this.ᐨẏ[i13], (char[])ˏɪ1);
      String str9 = (i13 == 0) ? null : ᐨẏ(this.ᐨẏ[i13] + 2, (char[])ˏɪ1);
      paramˍɫ.ˊ(str8, str10, str9);
    } 
    if (n != 0) {
      i10 = ᴵʖ(n);
      int i13;
      for (i13 = n + 2; i10-- > 0; i13 = ᐨẏ(paramˍɫ.ᐨẏ(str, true), i13, true, (char[])ˏɪ1)) {
        String str = ᐨẏ(i13, (char[])ˏɪ1);
        i13 += 2;
      } 
    } 
    if (i1 != 0) {
      i10 = ᴵʖ(i1);
      int i13;
      for (i13 = i1 + 2; i10-- > 0; i13 = ᐨẏ(paramˍɫ.ᐨẏ(str, false), i13, true, (char[])ˏɪ1)) {
        String str = ᐨẏ(i13, (char[])ˏɪ1);
        i13 += 2;
      } 
    } 
    if (i2 != 0) {
      i10 = ᴵʖ(i2);
      int i13;
      for (i13 = i2 + 2; i10-- > 0; i13 = ᐨẏ(paramˍɫ.ᐨẏ(ʾ.ιƚ, ʾ.ᐨẏ, str, true), i13, true, (char[])ˏɪ1)) {
        i13 = ᐨẏ(ʾ, i13);
        String str = ᐨẏ(i13, (char[])ˏɪ1);
        i13 += 2;
      } 
    } 
    if (i3 != 0) {
      i10 = ᴵʖ(i3);
      int i13;
      for (i13 = i3 + 2; i10-- > 0; i13 = ᐨẏ(paramˍɫ.ᐨẏ(ʾ.ιƚ, ʾ.ᐨẏ, str, false), i13, true, (char[])ˏɪ1)) {
        i13 = ᐨẏ(ʾ, i13);
        String str = ᐨẏ(i13, (char[])ˏɪ1);
        i13 += 2;
      } 
    } 
    while (ᴵʖ1 != null) {
      ᴵʖ ᴵʖ2 = ᴵʖ1.ᐨẏ;
      ᴵʖ1.ᐨẏ = null;
      paramˍɫ.ᴵʖ(ᴵʖ1);
      ᴵʖ1 = ᴵʖ2;
    } 
    if (i6 != 0) {
      i10 = ᴵʖ(i6);
      for (int i13 = i6 + 2; i10-- > 0; i13 += 2) {
        ˏɪ2 = ˏɪ1;
        i12 = i13;
        paramˍɫ.ˊ((ʹﮃ1 = this).ᴵʖ(i12, (char[])ˏɪ2));
      } 
    } 
    if (i7 != 0) {
      i10 = ᴵʖ(i7);
      for (int i13 = i7 + 2; i10-- > 0; i13 += 2) {
        ˏɪ2 = ˏɪ1;
        i12 = i13;
        paramˍɫ.ᴵʖ((ʹﮃ1 = this).ᴵʖ(i12, (char[])ˏɪ2));
      } 
    } 
    if (k != 0) {
      i10 = ᴵʖ(k);
      for (int i13 = k + 2; i10-- > 0; i13 += 8) {
        ˏɪ2 = ˏɪ1;
        i12 = i13;
        ˏɪ2 = ˏɪ1;
        i12 = i13 + 2;
        paramˍɫ.ᐨẏ((ʹﮃ1 = this).ᴵʖ(i12, (char[])ˏɪ2), (ʹﮃ1 = this).ᴵʖ(i12, (char[])ˏɪ2), ᐨẏ(i13 + 4, (char[])ˏɪ1), ᴵʖ(i13 + 6));
      } 
    } 
    if (i8 != 0) {
      i10 = ᴵʖ(i8);
      for (i8 += 2; i10-- > 0; i8 = ᐨẏ(paramˍɫ, ʾ, i8));
    } 
    i10 = ᴵʖ(i);
    for (i += 2; i10-- > 0; i = ˊ(paramˍɫ, ʾ, i));
    int i11 = ᴵʖ(i);
    for (i += 2; i11-- > 0; i = ᴵʖ(paramˍɫ, ʾ, i));
    paramˍɫ.ᐨẏ();
  }
  
  private void ᐨẏ(ˍɫ paramˍɫ, ʾ paramʾ, int paramInt1, int paramInt2, String paramString) {
    ˏɪ ˏɪ1 = paramʾ.ᐨẏ;
    paramInt1 = paramInt1;
    ˏɪ ˏɪ2 = ˏɪ1;
    int m = paramInt1;
    ʹﮃ ʹﮃ1;
    String str1 = (ʹﮃ1 = this).ᴵʖ(m, (char[])ˏɪ2);
    int k = ᴵʖ(paramInt1 + 2);
    String str2 = ᐨẏ(paramInt1 + 4, (char[])ˏɪ1);
    paramInt1 += 6;
    ʻล ʻล;
    if ((ʻล = paramˍɫ.ᐨẏ(str1, k, str2)) == null)
      return; 
    if (paramString != null)
      ʻล.ʿᵉ(paramString); 
    if (paramInt2 != 0) {
      int n = ᴵʖ(paramInt2);
      for (paramInt2 += 2; n-- > 0; paramInt2 += 2) {
        ˏɪ2 = ˏɪ1;
        m = paramInt2;
        ʻล.ʹﮃ((ʹﮃ1 = this).ᴵʖ(m, (char[])ˏɪ2));
      } 
    } 
    int i = ᴵʖ(paramInt1);
    paramInt1 += 2;
    while (i-- > 0) {
      ˏɪ2 = ˏɪ1;
      m = paramInt1;
      String str3 = (ʹﮃ1 = this).ᴵʖ(m, (char[])ˏɪ2);
      int n = ᴵʖ(paramInt1 + 2);
      String str4 = ᐨẏ(paramInt1 + 4, (char[])ˏɪ1);
      paramInt1 += 6;
      ʻล.ᐨẏ(str3, n, str4);
    } 
    paramInt2 = ᴵʖ(paramInt1);
    paramInt1 += 2;
    while (paramInt2-- > 0) {
      String[] arrayOfString;
      ˏɪ2 = ˏɪ1;
      m = paramInt1;
      str1 = (ʹﮃ1 = this).ᴵʖ(m, (char[])ˏɪ2);
      k = ᴵʖ(paramInt1 + 2);
      i = ᴵʖ(paramInt1 + 4);
      paramInt1 += 6;
      str2 = null;
      if (i != 0) {
        arrayOfString = new String[i];
        for (byte b = 0; b < i; b++) {
          ˏɪ2 = ˏɪ1;
          m = paramInt1;
          arrayOfString[b] = (ʹﮃ1 = this).ᴵʖ(m, (char[])ˏɪ2);
          paramInt1 += 2;
        } 
      } 
      ʻล.ᐨẏ(str1, k, arrayOfString);
    } 
    int j = ᴵʖ(paramInt1);
    paramInt1 += 2;
    while (j-- > 0) {
      ˏɪ2 = ˏɪ1;
      m = paramInt1;
      String str = (ʹﮃ1 = this).ᴵʖ(m, (char[])ˏɪ2);
      i = ᴵʖ(paramInt1 + 2);
      int n = ᴵʖ(paramInt1 + 4);
      paramInt1 += 6;
      String[] arrayOfString = null;
      if (n != 0) {
        arrayOfString = new String[n];
        for (paramInt2 = 0; paramInt2 < n; paramInt2++) {
          ˏɪ2 = ˏɪ1;
          m = paramInt1;
          arrayOfString[paramInt2] = (ʹﮃ1 = this).ᴵʖ(m, (char[])ˏɪ2);
          paramInt1 += 2;
        } 
      } 
      ʻล.ˊ(str, i, arrayOfString);
    } 
    k = ᴵʖ(paramInt1);
    for (paramInt1 += 2; k-- > 0; paramInt1 += 2) {
      ˏɪ2 = ˏɪ1;
      m = paramInt1;
      ʻล.ՙᗮ((ʹﮃ1 = this).ᴵʖ(m, (char[])ˏɪ2));
    } 
    i = ᴵʖ(paramInt1);
    paramInt1 += 2;
    while (i-- > 0) {
      ˏɪ2 = ˏɪ1;
      m = paramInt1;
      str2 = (ʹﮃ1 = this).ᴵʖ(m, (char[])ˏɪ2);
      int n = ᴵʖ(paramInt1 + 2);
      paramInt1 += 4;
      String[] arrayOfString = new String[n];
      for (j = 0; j < n; j++) {
        ˏɪ2 = ˏɪ1;
        m = paramInt1;
        arrayOfString[j] = (ʹﮃ1 = this).ᴵʖ(m, (char[])ˏɪ2);
        paramInt1 += 2;
      } 
      ʻล.ᐨẏ(str2, arrayOfString);
    } 
    ʻล.ᐨẏ();
  }
  
  private int ᐨẏ(ˍɫ paramˍɫ, ʾ paramʾ, int paramInt) {
    ˏɪ ˏɪ = paramʾ.ᐨẏ;
    paramInt = paramInt;
    String str1 = ᐨẏ(paramInt, (char[])ˏɪ);
    String str2 = ᐨẏ(paramInt + 2, (char[])ˏɪ);
    paramInt += 4;
    String str3 = null;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    ᴵʖ ᴵʖ = null;
    int n = ᴵʖ(paramInt);
    for (paramInt += 2; n-- > 0; paramInt += i1) {
      String str = ᐨẏ(paramInt, (char[])ˏɪ);
      int i1 = ﾞл(paramInt + 2);
      paramInt += 6;
      "侯럌렐ﶌః潑앞ڊ譚㪚".toCharArray()[0] = (char)("侯럌렐ﶌః潑앞ڊ譚㪚".toCharArray()[0] ^ 0x39F7);
      if (ˏȓ$ᴵЃ.E("侯럌렐ﶌః潑앞ڊ譚㪚".toCharArray(), (short)1403, (short)2, (short)3).equals(str)) {
        str3 = ᐨẏ(paramInt, (char[])ˏɪ);
      } else {
        "졷絹왂஖鵄뫱㬸痱鰃눭濥礲䢃ꈾ瑇빗簵霻뼊䚝硇屢㹒".toCharArray()[11] = (char)("졷絹왂஖鵄뫱㬸痱鰃눭濥礲䢃ꈾ瑇빗簵霻뼊䚝硇屢㹒".toCharArray()[11] ^ 0x3EDD);
        if (ˏȓ$ᴵЃ.E("졷絹왂஖鵄뫱㬸痱鰃눭濥礲䢃ꈾ瑇빗簵霻뼊䚝硇屢㹒".toCharArray(), (short)19014, (short)1, (short)0).equals(str)) {
          i = paramInt;
        } else {
          "℆᎕⪇ꖾᣅ䔧婏ଙ徤獌뾊᝗ヽ栃틯ቮ䠼⇝辟鑚푂拎เ䯠ꖰƂ".toCharArray()[9] = (char)("℆᎕⪇ꖾᣅ䔧婏ଙ徤獌뾊᝗ヽ栃틯ቮ䠼⇝辟鑚푂拎เ䯠ꖰƂ".toCharArray()[9] ^ 0x776F);
          if (ˏȓ$ᴵЃ.E("℆᎕⪇ꖾᣅ䔧婏ଙ徤獌뾊᝗ヽ栃틯ቮ䠼⇝辟鑚푂拎เ䯠ꖰƂ".toCharArray(), (short)6835, (short)4, (short)4).equals(str)) {
            k = paramInt;
          } else {
            "ಱ˘┫?ꊚ篞ᦺ荊믆練棧틾ӵ⍆뽟맡૗﹅⎆攼㜔檓".toCharArray()[2] = (char)("ಱ˘┫?ꊚ篞ᦺ荊믆練棧틾ӵ⍆뽟맡૗﹅⎆攼㜔檓".toCharArray()[2] ^ 0x5B50);
            if (ˏȓ$ᴵЃ.E("ಱ˘┫?ꊚ篞ᦺ荊믆練棧틾ӵ⍆뽟맡૗﹅⎆攼㜔檓".toCharArray(), (short)9355, (short)2, (short)4).equals(str)) {
              j = paramInt;
            } else {
              "뗝풳寬﷤矈㼰㪵몃།焺亞㾖ਂ鵶쌡픳뚮儉㙯し䘢?ぉᠸ?ﮢ䶦⳩㧰".toCharArray()[12] = (char)("뗝풳寬﷤矈㼰㪵몃།焺亞㾖ਂ鵶쌡픳뚮儉㙯し䘢?ぉᠸ?ﮢ䶦⳩㧰".toCharArray()[12] ^ 0x6A9F);
              if (ˏȓ$ᴵЃ.E("뗝풳寬﷤矈㼰㪵몃།焺亞㾖ਂ鵶쌡픳뚮儉㙯し䘢?ぉᠸ?ﮢ䶦⳩㧰".toCharArray(), (short)13010, (short)4, (short)0).equals(str)) {
                m = paramInt;
              } else {
                ᴵʖ ᴵʖ1;
                (ᴵʖ1 = ᐨẏ((ᴵʖ[])paramʾ.ˊ, str, paramInt, i1, (char[])ˏɪ, -1, null)).ᐨẏ = ᴵʖ;
                ᴵʖ = ᴵʖ1;
              } 
            } 
          } 
        } 
      } 
    } 
    ʼᵖ ʼᵖ;
    if ((ʼᵖ = paramˍɫ.ᐨẏ(str1, str2, str3)) == null)
      return paramInt; 
    if (i != 0) {
      int i1 = ᴵʖ(i);
      int i2;
      for (i2 = i + 2; i1-- > 0; i2 = ᐨẏ(ʼᵖ.ᐨẏ(str, true), i2, true, (char[])ˏɪ)) {
        String str = ᐨẏ(i2, (char[])ˏɪ);
        i2 += 2;
      } 
    } 
    if (j != 0) {
      int i1 = ᴵʖ(j);
      int i2;
      for (i2 = j + 2; i1-- > 0; i2 = ᐨẏ(ʼᵖ.ᐨẏ(str, false), i2, true, (char[])ˏɪ)) {
        String str = ᐨẏ(i2, (char[])ˏɪ);
        i2 += 2;
      } 
    } 
    if (k != 0) {
      int i1 = ᴵʖ(k);
      int i2;
      for (i2 = k + 2; i1-- > 0; i2 = ᐨẏ(ʼᵖ.ᐨẏ(paramʾ.ιƚ, paramʾ.ᐨẏ, str, true), i2, true, (char[])ˏɪ)) {
        i2 = ᐨẏ(paramʾ, i2);
        String str = ᐨẏ(i2, (char[])ˏɪ);
        i2 += 2;
      } 
    } 
    if (m != 0) {
      int i1 = ᴵʖ(m);
      int i2;
      for (i2 = m + 2; i1-- > 0; i2 = ᐨẏ(ʼᵖ.ᐨẏ(paramʾ.ιƚ, paramʾ.ᐨẏ, str, false), i2, true, (char[])ˏɪ)) {
        i2 = ᐨẏ(paramʾ, i2);
        String str = ᐨẏ(i2, (char[])ˏɪ);
        i2 += 2;
      } 
    } 
    while (ᴵʖ != null) {
      ᴵʖ ᴵʖ1 = ᴵʖ.ᐨẏ;
      ᴵʖ.ᐨẏ = null;
      ʼᵖ.ᴵʖ(ᴵʖ);
      ᴵʖ = ᴵʖ1;
    } 
    ʼᵖ.ᐨẏ();
    return paramInt;
  }
  
  private int ˊ(ˍɫ paramˍɫ, ʾ paramʾ, int paramInt) {
    ˏɪ ˏɪ = paramʾ.ᐨẏ;
    paramInt = paramInt;
    int i = ᴵʖ(paramInt);
    String str1 = ᐨẏ(paramInt + 2, (char[])ˏɪ);
    String str2 = ᐨẏ(paramInt + 4, (char[])ˏɪ);
    paramInt += 6;
    Object object = null;
    String str3 = null;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    ᴵʖ ᴵʖ = null;
    int i1 = ᴵʖ(paramInt);
    for (paramInt += 2; i1-- > 0; paramInt += i2) {
      String str = ᐨẏ(paramInt, (char[])ˏɪ);
      int i2 = ﾞл(paramInt + 2);
      paramInt += 6;
      "ห?薄놭짚斬?淲醴瓲".toCharArray()[9] = (char)("ห?薄놭짚斬?淲醴瓲".toCharArray()[9] ^ 0x503C);
      if (ˍɫ$יς.J("ห?薄놭짚斬?淲醴瓲".toCharArray(), (short)21287, (short)4, (byte)5).equals(str)) {
        int i3;
        object = ((i3 = ᴵʖ(paramInt)) == 0) ? null : ᐨẏ(i3, (char[])ˏɪ);
      } else {
        "ꠗ፭놂໩㵜鏳趞쾮摓".toCharArray()[6] = (char)("ꠗ፭놂໩㵜鏳趞쾮摓".toCharArray()[6] ^ 0x1319);
        if (ˍɫ$יς.J("ꠗ፭놂໩㵜鏳趞쾮摓".toCharArray(), (short)11423, (short)1, (byte)2).equals(str)) {
          str3 = ᐨẏ(paramInt, (char[])ˏɪ);
        } else {
          "탸ힺ芏롤䐦Ɽ쁭儕⇞".toCharArray()[0] = (char)("탸ힺ芏롤䐦Ɽ쁭儕⇞".toCharArray()[0] ^ 0x4BA3);
          if (ˍɫ$יς.J("탸ힺ芏롤䐦Ɽ쁭儕⇞".toCharArray(), (short)31406, (short)3, (byte)1).equals(str)) {
            i |= 0x20000;
          } else {
            "磻脣顒倅鸓泆㭪泥咉".toCharArray()[2] = (char)("磻脣顒倅鸓泆㭪泥咉".toCharArray()[2] ^ 0x2CF4);
            if (ˍɫ$יς.J("磻脣顒倅鸓泆㭪泥咉".toCharArray(), (short)2359, (short)0, (byte)3).equals(str)) {
              i |= 0x1000;
            } else {
              "獒ⓓ藈荝첖ᶉ嘁耡꠵虈鑁밳콷?겥꿀惻Თኲ?䴘̆?▹".toCharArray()[0] = (char)("獒ⓓ藈荝첖ᶉ嘁耡꠵虈鑁밳콷?겥꿀惻Თኲ?䴘̆?▹".toCharArray()[0] ^ 0x462C);
              if (ˍɫ$יς.J("獒ⓓ藈荝첖ᶉ嘁耡꠵虈鑁밳콷?겥꿀惻Თኲ?䴘̆?▹".toCharArray(), (short)3313, (short)2, (byte)0).equals(str)) {
                j = paramInt;
              } else {
                "눵蘄窇ᓡ?อឋꆩ?朜搟瀪놌ꭑ䢑욈䛢퍜ᔮ翢䞫?涨㯏盢".toCharArray()[28] = (char)("눵蘄窇ᓡ?อឋꆩ?朜搟瀪놌ꭑ䢑욈䛢퍜ᔮ翢䞫?涨㯏盢".toCharArray()[28] ^ 0x5A92);
                if (ˍɫ$יς.J("눵蘄窇ᓡ?อឋꆩ?朜搟瀪놌ꭑ䢑욈䛢퍜ᔮ翢䞫?涨㯏盢".toCharArray(), (short)14755, (short)5, (byte)3).equals(str)) {
                  m = paramInt;
                } else {
                  "┞ὶ㌷ﻶꟗ㫎쨵Ꚃꓱ临ﰴ큾?卸멘瘎왱觚☓껋劲瘰㋰䧯䍫誜མ".toCharArray()[6] = (char)("┞ὶ㌷ﻶꟗ㫎쨵Ꚃꓱ临ﰴ큾?卸멘瘎왱觚☓껋劲瘰㋰䧯䍫誜མ".toCharArray()[6] ^ 0x44BD);
                  if (ˍɫ$יς.J("┞ὶ㌷ﻶꟗ㫎쨵Ꚃꓱ临ﰴ큾?卸멘瘎왱觚☓껋劲瘰㋰䧯䍫誜མ".toCharArray(), (short)11028, (short)0, (byte)5).equals(str)) {
                    k = paramInt;
                  } else {
                    "芖イ먟眍ꝏꅊ쿲劋萆꒛坆뀏듢蛲왯鵄慄ﲓꋹ萋⚜탃秙ꡎ⍀ᲁ".toCharArray()[29] = (char)("芖イ먟眍ꝏꅊ쿲劋萆꒛坆뀏듢蛲왯鵄慄ﲓꋹ萋⚜탃秙ꡎ⍀ᲁ".toCharArray()[29] ^ 0x6C01);
                    if (ˍɫ$יς.J("芖イ먟眍ꝏꅊ쿲劋萆꒛坆뀏듢蛲왯鵄慄ﲓꋹ萋⚜탃秙ꡎ⍀ᲁ".toCharArray(), (short)26246, (short)2, (byte)0).equals(str)) {
                      n = paramInt;
                    } else {
                      ᴵʖ ᴵʖ1;
                      (ᴵʖ1 = ᐨẏ((ᴵʖ[])paramʾ.ˊ, str, paramInt, i2, (char[])ˏɪ, -1, null)).ᐨẏ = ᴵʖ;
                      ᴵʖ = ᴵʖ1;
                    } 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
    } 
    ᴵƚ ᴵƚ;
    if ((ᴵƚ = paramˍɫ.ᐨẏ(i, str1, str2, str3, object)) == null)
      return paramInt; 
    if (j != 0) {
      int i2 = ᴵʖ(j);
      int i3;
      for (i3 = j + 2; i2-- > 0; i3 = ᐨẏ(ᴵƚ.ᐨẏ(str, true), i3, true, (char[])ˏɪ)) {
        String str = ᐨẏ(i3, (char[])ˏɪ);
        i3 += 2;
      } 
    } 
    if (k != 0) {
      int i2 = ᴵʖ(k);
      int i3;
      for (i3 = k + 2; i2-- > 0; i3 = ᐨẏ(ᴵƚ.ᐨẏ(str, false), i3, true, (char[])ˏɪ)) {
        String str = ᐨẏ(i3, (char[])ˏɪ);
        i3 += 2;
      } 
    } 
    if (m != 0) {
      int i2 = ᴵʖ(m);
      int i3;
      for (i3 = m + 2; i2-- > 0; i3 = ᐨẏ(ᴵƚ.ᐨẏ(paramʾ.ιƚ, paramʾ.ᐨẏ, str, true), i3, true, (char[])ˏɪ)) {
        i3 = ᐨẏ(paramʾ, i3);
        String str = ᐨẏ(i3, (char[])ˏɪ);
        i3 += 2;
      } 
    } 
    if (n != 0) {
      int i2 = ᴵʖ(n);
      int i3;
      for (i3 = n + 2; i2-- > 0; i3 = ᐨẏ(ᴵƚ.ᐨẏ(paramʾ.ιƚ, paramʾ.ᐨẏ, str, false), i3, true, (char[])ˏɪ)) {
        i3 = ᐨẏ(paramʾ, i3);
        String str = ᐨẏ(i3, (char[])ˏɪ);
        i3 += 2;
      } 
    } 
    while (ᴵʖ != null) {
      ᴵʖ ᴵʖ1 = ᴵʖ.ᐨẏ;
      ᴵʖ.ᐨẏ = null;
      ᴵƚ.ᴵʖ(ᴵʖ);
      ᴵʖ = ᴵʖ1;
    } 
    ᴵƚ.ᐨẏ();
    return paramInt;
  }
  
  private int ᴵʖ(ˍɫ paramˍɫ, ʾ paramʾ, int paramInt) {
    // Byte code:
    //   0: aload_2
    //   1: getfield ᐨẏ : [C
    //   4: astore #4
    //   6: iload_3
    //   7: istore #5
    //   9: aload_2
    //   10: aload_0
    //   11: iload #5
    //   13: invokevirtual ᴵʖ : (I)I
    //   16: putfield ιᒶ : I
    //   19: aload_2
    //   20: aload_0
    //   21: iload #5
    //   23: iconst_2
    //   24: iadd
    //   25: aload #4
    //   27: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   30: putfield ᐧפ : Ljava/lang/String;
    //   33: aload_2
    //   34: aload_0
    //   35: iload #5
    //   37: iconst_4
    //   38: iadd
    //   39: aload #4
    //   41: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   44: putfield ιˠ : Ljava/lang/String;
    //   47: iinc #5, 6
    //   50: iconst_0
    //   51: istore #6
    //   53: iconst_0
    //   54: istore #7
    //   56: aconst_null
    //   57: astore #8
    //   59: iconst_0
    //   60: istore #9
    //   62: iconst_0
    //   63: istore #10
    //   65: iconst_0
    //   66: istore #11
    //   68: iconst_0
    //   69: istore #12
    //   71: iconst_0
    //   72: istore #13
    //   74: iconst_0
    //   75: istore #14
    //   77: iconst_0
    //   78: istore #15
    //   80: iconst_0
    //   81: istore #16
    //   83: iconst_0
    //   84: istore #17
    //   86: iconst_0
    //   87: istore #18
    //   89: aconst_null
    //   90: astore #19
    //   92: aload_0
    //   93: iload #5
    //   95: invokevirtual ᴵʖ : (I)I
    //   98: istore #20
    //   100: iinc #5, 2
    //   103: iload #20
    //   105: iinc #20, -1
    //   108: ifle -> 792
    //   111: aload_0
    //   112: iload #5
    //   114: aload #4
    //   116: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   119: astore #21
    //   121: aload_0
    //   122: iload #5
    //   124: iconst_2
    //   125: iadd
    //   126: invokevirtual ﾞл : (I)I
    //   129: istore #22
    //   131: iinc #5, 6
    //   134: ldc_w '┺ꬷ싨Ꞥ೹'
    //   137: invokevirtual toCharArray : ()[C
    //   140: dup
    //   141: dup
    //   142: iconst_1
    //   143: dup_x1
    //   144: caload
    //   145: sipush #4266
    //   148: ixor
    //   149: i2c
    //   150: castore
    //   151: sipush #19718
    //   154: iconst_3
    //   155: iconst_3
    //   156: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   159: aload #21
    //   161: invokevirtual equals : (Ljava/lang/Object;)Z
    //   164: ifeq -> 183
    //   167: aload_2
    //   168: getfield ᕁ : I
    //   171: iconst_1
    //   172: iand
    //   173: ifne -> 782
    //   176: iload #5
    //   178: istore #6
    //   180: goto -> 782
    //   183: ldc_w '⾌⤘蚻廑갱넩틑縵槽ក㭖'
    //   186: invokevirtual toCharArray : ()[C
    //   189: dup
    //   190: dup
    //   191: iconst_0
    //   192: dup_x1
    //   193: caload
    //   194: sipush #27922
    //   197: ixor
    //   198: i2c
    //   199: castore
    //   200: sipush #21078
    //   203: iconst_3
    //   204: iconst_1
    //   205: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   208: aload #21
    //   210: invokevirtual equals : (Ljava/lang/Object;)Z
    //   213: ifeq -> 284
    //   216: iload #5
    //   218: istore #7
    //   220: aload_0
    //   221: iload #7
    //   223: invokevirtual ᴵʖ : (I)I
    //   226: anewarray java/lang/String
    //   229: astore #8
    //   231: iload #7
    //   233: iconst_2
    //   234: iadd
    //   235: istore #23
    //   237: iconst_0
    //   238: istore #24
    //   240: iload #24
    //   242: aload #8
    //   244: arraylength
    //   245: if_icmpge -> 281
    //   248: aload #8
    //   250: iload #24
    //   252: aload_0
    //   253: iload #23
    //   255: aload #4
    //   257: astore #72
    //   259: istore #71
    //   261: dup
    //   262: astore #70
    //   264: iload #71
    //   266: aload #72
    //   268: invokespecial ᴵʖ : (I[C)Ljava/lang/String;
    //   271: aastore
    //   272: iinc #23, 2
    //   275: iinc #24, 1
    //   278: goto -> 240
    //   281: goto -> 782
    //   284: ldc_w '䢋?픚抾謢粴Ჺꈜ垍⿲'
    //   287: invokevirtual toCharArray : ()[C
    //   290: dup
    //   291: dup
    //   292: bipush #7
    //   294: dup_x1
    //   295: caload
    //   296: sipush #21383
    //   299: ixor
    //   300: i2c
    //   301: castore
    //   302: sipush #31998
    //   305: iconst_5
    //   306: iconst_0
    //   307: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   310: aload #21
    //   312: invokevirtual equals : (Ljava/lang/Object;)Z
    //   315: ifeq -> 329
    //   318: aload_0
    //   319: iload #5
    //   321: invokevirtual ᴵʖ : (I)I
    //   324: istore #10
    //   326: goto -> 782
    //   329: ldc_w 'ꯒ櫽ы鄪뽯鱪淑骶뇐帷'
    //   332: invokevirtual toCharArray : ()[C
    //   335: dup
    //   336: dup
    //   337: bipush #8
    //   339: dup_x1
    //   340: caload
    //   341: sipush #12987
    //   344: ixor
    //   345: i2c
    //   346: castore
    //   347: sipush #10683
    //   350: iconst_0
    //   351: iconst_4
    //   352: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   355: aload #21
    //   357: invokevirtual equals : (Ljava/lang/Object;)Z
    //   360: ifeq -> 377
    //   363: aload_2
    //   364: dup
    //   365: getfield ιᒶ : I
    //   368: ldc 131072
    //   370: ior
    //   371: putfield ιᒶ : I
    //   374: goto -> 782
    //   377: ldc_w 'ᗜ跋ѡ￞趻乲赤ꚫ㓀ᾓ풥쯄毽릗圀壒㲷㙓脍慴㜛篝彍坢'
    //   380: invokevirtual toCharArray : ()[C
    //   383: dup
    //   384: dup
    //   385: iconst_2
    //   386: dup_x1
    //   387: caload
    //   388: sipush #23576
    //   391: ixor
    //   392: i2c
    //   393: castore
    //   394: sipush #14973
    //   397: iconst_1
    //   398: iconst_5
    //   399: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   402: aload #21
    //   404: invokevirtual equals : (Ljava/lang/Object;)Z
    //   407: ifeq -> 417
    //   410: iload #5
    //   412: istore #11
    //   414: goto -> 782
    //   417: ldc_w '죝螳摞漽혖ꀙ㔌ᦇ䟬ꃋ৭샆ᅹⲗ?⏘瘯䳳ꕑ읱줢﨔ℳ둔믓ꬣ╢'
    //   420: invokevirtual toCharArray : ()[C
    //   423: dup
    //   424: dup
    //   425: iconst_2
    //   426: dup_x1
    //   427: caload
    //   428: sipush #24152
    //   431: ixor
    //   432: i2c
    //   433: castore
    //   434: sipush #28913
    //   437: iconst_2
    //   438: iconst_5
    //   439: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   442: aload #21
    //   444: invokevirtual equals : (Ljava/lang/Object;)Z
    //   447: ifeq -> 457
    //   450: iload #5
    //   452: istore #15
    //   454: goto -> 782
    //   457: ldc_w '擃പ희햚樾儲쏳판ᠳ賞鸎쇬煕셅熹柶昨'
    //   460: invokevirtual toCharArray : ()[C
    //   463: dup
    //   464: dup
    //   465: iconst_2
    //   466: dup_x1
    //   467: caload
    //   468: sipush #6572
    //   471: ixor
    //   472: i2c
    //   473: castore
    //   474: sipush #28980
    //   477: iconst_5
    //   478: iconst_5
    //   479: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   482: aload #21
    //   484: invokevirtual equals : (Ljava/lang/Object;)Z
    //   487: ifeq -> 497
    //   490: iload #5
    //   492: istore #17
    //   494: goto -> 782
    //   497: ldc_w '噹槏盻⮠Ŭᬯꋤ좿艘渆'
    //   500: invokevirtual toCharArray : ()[C
    //   503: dup
    //   504: dup
    //   505: iconst_0
    //   506: dup_x1
    //   507: caload
    //   508: sipush #7514
    //   511: ixor
    //   512: i2c
    //   513: castore
    //   514: sipush #8950
    //   517: iconst_1
    //   518: iconst_2
    //   519: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   522: aload #21
    //   524: invokevirtual equals : (Ljava/lang/Object;)Z
    //   527: ifeq -> 548
    //   530: iconst_1
    //   531: istore #9
    //   533: aload_2
    //   534: dup
    //   535: getfield ιᒶ : I
    //   538: sipush #4096
    //   541: ior
    //   542: putfield ιᒶ : I
    //   545: goto -> 782
    //   548: ldc_w '萑왟挃ᪧ遡曼頌탧Ꙥ㿧ﳔ짠㛳鯟⩒ꘑ◞꦳螓ꇄƙ♞툀ឌῼ㉅'
    //   551: invokevirtual toCharArray : ()[C
    //   554: dup
    //   555: dup
    //   556: bipush #23
    //   558: dup_x1
    //   559: caload
    //   560: sipush #28095
    //   563: ixor
    //   564: i2c
    //   565: castore
    //   566: sipush #6726
    //   569: iconst_2
    //   570: iconst_0
    //   571: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   574: aload #21
    //   576: invokevirtual equals : (Ljava/lang/Object;)Z
    //   579: ifeq -> 589
    //   582: iload #5
    //   584: istore #12
    //   586: goto -> 782
    //   589: ldc_w '杜ጮⰏຯ距侏䤇뫎ᯌ?꾯喇影䁮栐澩橯禯閹ࡦ樿螥노褝忦美哇ଌ䰃'
    //   592: invokevirtual toCharArray : ()[C
    //   595: dup
    //   596: dup
    //   597: bipush #18
    //   599: dup_x1
    //   600: caload
    //   601: sipush #644
    //   604: ixor
    //   605: i2c
    //   606: castore
    //   607: sipush #16626
    //   610: iconst_1
    //   611: iconst_1
    //   612: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   615: aload #21
    //   617: invokevirtual equals : (Ljava/lang/Object;)Z
    //   620: ifeq -> 630
    //   623: iload #5
    //   625: istore #16
    //   627: goto -> 782
    //   630: ldc_w 'ˑᦹࣁꈐ娑幊騍㯄名◿䲏ĳ䆤톌롫␲㽘䬣໕Ꝼ⎞踔⌜㺘닠⪢❪純Ⱪ櫿'
    //   633: invokevirtual toCharArray : ()[C
    //   636: dup
    //   637: dup
    //   638: bipush #14
    //   640: dup_x1
    //   641: caload
    //   642: sipush #5907
    //   645: ixor
    //   646: i2c
    //   647: castore
    //   648: sipush #771
    //   651: iconst_1
    //   652: iconst_2
    //   653: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   656: aload #21
    //   658: invokevirtual equals : (Ljava/lang/Object;)Z
    //   661: ifeq -> 671
    //   664: iload #5
    //   666: istore #13
    //   668: goto -> 782
    //   671: ldc_w 'ዼ恀躂醲鱯爡ﶃꥡ骘骙ﾓ?횕醅훚薨鄭㌔솖㱧穄胟શ퀟䆸媷옆咵￬㤆역꛶˜檦'
    //   674: invokevirtual toCharArray : ()[C
    //   677: dup
    //   678: dup
    //   679: iconst_0
    //   680: dup_x1
    //   681: caload
    //   682: sipush #11864
    //   685: ixor
    //   686: i2c
    //   687: castore
    //   688: sipush #6390
    //   691: iconst_4
    //   692: iconst_4
    //   693: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   696: aload #21
    //   698: invokevirtual equals : (Ljava/lang/Object;)Z
    //   701: ifeq -> 711
    //   704: iload #5
    //   706: istore #14
    //   708: goto -> 782
    //   711: ldc_w '汶嚒쭒凥侈晟㍀﹛귔餸됙厄ೌ碓蹡ذ'
    //   714: invokevirtual toCharArray : ()[C
    //   717: dup
    //   718: dup
    //   719: bipush #13
    //   721: dup_x1
    //   722: caload
    //   723: sipush #29598
    //   726: ixor
    //   727: i2c
    //   728: castore
    //   729: sipush #16680
    //   732: iconst_5
    //   733: iconst_5
    //   734: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   737: aload #21
    //   739: invokevirtual equals : (Ljava/lang/Object;)Z
    //   742: ifeq -> 752
    //   745: iload #5
    //   747: istore #18
    //   749: goto -> 782
    //   752: aload_0
    //   753: aload_2
    //   754: getfield ˊ : [Lyyds/sniarbtej/ᴵʖ;
    //   757: aload #21
    //   759: iload #5
    //   761: iload #22
    //   763: aload #4
    //   765: iconst_m1
    //   766: aconst_null
    //   767: invokespecial ᐨẏ : ([Lyyds/sniarbtej/ᴵʖ;Ljava/lang/String;II[CI[Lyyds/sniarbtej/ᔪ;)Lyyds/sniarbtej/ᴵʖ;
    //   770: dup
    //   771: astore #23
    //   773: aload #19
    //   775: putfield ᐨẏ : Lyyds/sniarbtej/ᴵʖ;
    //   778: aload #23
    //   780: astore #19
    //   782: iload #5
    //   784: iload #22
    //   786: iadd
    //   787: istore #5
    //   789: goto -> 103
    //   792: aload_1
    //   793: aload_2
    //   794: getfield ιᒶ : I
    //   797: aload_2
    //   798: getfield ᐧפ : Ljava/lang/String;
    //   801: aload_2
    //   802: getfield ιˠ : Ljava/lang/String;
    //   805: iload #10
    //   807: ifne -> 814
    //   810: aconst_null
    //   811: goto -> 822
    //   814: aload_0
    //   815: iload #10
    //   817: aload #4
    //   819: invokevirtual ˊ : (I[C)Ljava/lang/String;
    //   822: aload #8
    //   824: invokevirtual ᐨẏ : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lyyds/sniarbtej/ˉｓ;
    //   827: dup
    //   828: astore #21
    //   830: ifnonnull -> 836
    //   833: iload #5
    //   835: ireturn
    //   836: aload #21
    //   838: instanceof yyds/sniarbtej/ʿপ
    //   841: ifeq -> 1113
    //   844: aload #21
    //   846: checkcast yyds/sniarbtej/ʿপ
    //   849: dup
    //   850: astore #22
    //   852: aload_0
    //   853: iload #9
    //   855: aload_2
    //   856: getfield ιᒶ : I
    //   859: ldc 131072
    //   861: iand
    //   862: ifeq -> 869
    //   865: iconst_1
    //   866: goto -> 870
    //   869: iconst_0
    //   870: aload_0
    //   871: iload_3
    //   872: iconst_4
    //   873: iadd
    //   874: invokevirtual ᴵʖ : (I)I
    //   877: iload #10
    //   879: iload #7
    //   881: istore #23
    //   883: istore #20
    //   885: istore #10
    //   887: istore #9
    //   889: istore #8
    //   891: astore #7
    //   893: astore_1
    //   894: aload #7
    //   896: aload_1
    //   897: getfield ᐨẏ : Lyyds/sniarbtej/ˌх;
    //   900: dup
    //   901: astore #70
    //   903: getfield ᐨẏ : Lyyds/sniarbtej/ᐨم;
    //   906: invokestatic G : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   909: ifeq -> 950
    //   912: iload #10
    //   914: aload_1
    //   915: getfield ɟ : I
    //   918: if_icmpne -> 950
    //   921: iload #20
    //   923: aload_1
    //   924: getfield ﾞǰ : I
    //   927: if_icmpne -> 950
    //   930: iload #9
    //   932: aload_1
    //   933: getfield ʿλ : I
    //   936: ldc 131072
    //   938: iand
    //   939: ifeq -> 946
    //   942: iconst_1
    //   943: goto -> 947
    //   946: iconst_0
    //   947: if_icmpeq -> 954
    //   950: iconst_0
    //   951: goto -> 1077
    //   954: aload_1
    //   955: getfield ᐨẏ : Lyyds/sniarbtej/ˌх;
    //   958: dup
    //   959: astore #70
    //   961: getfield Ԇ : I
    //   964: bipush #49
    //   966: if_icmpge -> 984
    //   969: aload_1
    //   970: getfield ʿλ : I
    //   973: sipush #4096
    //   976: iand
    //   977: ifeq -> 984
    //   980: iconst_1
    //   981: goto -> 985
    //   984: iconst_0
    //   985: istore #24
    //   987: iload #8
    //   989: iload #24
    //   991: if_icmpeq -> 998
    //   994: iconst_0
    //   995: goto -> 1077
    //   998: iload #23
    //   1000: ifne -> 1014
    //   1003: aload_1
    //   1004: getfield ٴῪ : I
    //   1007: ifeq -> 1076
    //   1010: iconst_0
    //   1011: goto -> 1077
    //   1014: aload #7
    //   1016: iload #23
    //   1018: invokevirtual ᴵʖ : (I)I
    //   1021: aload_1
    //   1022: getfield ٴῪ : I
    //   1025: if_icmpne -> 1076
    //   1028: iload #23
    //   1030: iconst_2
    //   1031: iadd
    //   1032: istore #25
    //   1034: iconst_0
    //   1035: istore #26
    //   1037: iload #26
    //   1039: aload_1
    //   1040: getfield ٴῪ : I
    //   1043: if_icmpge -> 1076
    //   1046: aload #7
    //   1048: iload #25
    //   1050: invokevirtual ᴵʖ : (I)I
    //   1053: aload_1
    //   1054: getfield ͺо : [I
    //   1057: iload #26
    //   1059: iaload
    //   1060: if_icmpeq -> 1067
    //   1063: iconst_0
    //   1064: goto -> 1077
    //   1067: iinc #25, 2
    //   1070: iinc #26, 1
    //   1073: goto -> 1037
    //   1076: iconst_1
    //   1077: ifeq -> 1113
    //   1080: aload #22
    //   1082: iload_3
    //   1083: iload #5
    //   1085: iload_3
    //   1086: isub
    //   1087: istore #8
    //   1089: istore #7
    //   1091: dup
    //   1092: astore_1
    //   1093: iload #7
    //   1095: bipush #6
    //   1097: iadd
    //   1098: putfield ᴵ氵 : I
    //   1101: aload_1
    //   1102: iload #8
    //   1104: bipush #6
    //   1106: isub
    //   1107: putfield ᵊ : I
    //   1110: iload #5
    //   1112: ireturn
    //   1113: iload #18
    //   1115: ifeq -> 1176
    //   1118: aload_2
    //   1119: getfield ᕁ : I
    //   1122: iconst_2
    //   1123: iand
    //   1124: ifne -> 1176
    //   1127: aload_0
    //   1128: iload #18
    //   1130: invokevirtual ˊ : (I)I
    //   1133: istore #22
    //   1135: iload #18
    //   1137: iconst_1
    //   1138: iadd
    //   1139: istore #23
    //   1141: iload #22
    //   1143: iinc #22, -1
    //   1146: ifle -> 1176
    //   1149: aload #21
    //   1151: aload_0
    //   1152: iload #23
    //   1154: aload #4
    //   1156: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   1159: aload_0
    //   1160: iload #23
    //   1162: iconst_2
    //   1163: iadd
    //   1164: invokevirtual ᴵʖ : (I)I
    //   1167: invokevirtual ᐨẏ : (Ljava/lang/String;I)V
    //   1170: iinc #23, 4
    //   1173: goto -> 1141
    //   1176: iload #17
    //   1178: ifeq -> 1210
    //   1181: aload #21
    //   1183: invokevirtual ˊ : ()Lyyds/sniarbtej/ᐨẏ;
    //   1186: astore #22
    //   1188: aload_0
    //   1189: aload #22
    //   1191: iload #17
    //   1193: aconst_null
    //   1194: aload #4
    //   1196: invokespecial ᐨẏ : (Lyyds/sniarbtej/ᐨẏ;ILjava/lang/String;[C)I
    //   1199: pop
    //   1200: aload #22
    //   1202: ifnull -> 1210
    //   1205: aload #22
    //   1207: invokevirtual ᐨẏ : ()V
    //   1210: iload #11
    //   1212: ifeq -> 1272
    //   1215: aload_0
    //   1216: iload #11
    //   1218: invokevirtual ᴵʖ : (I)I
    //   1221: istore #22
    //   1223: iload #11
    //   1225: iconst_2
    //   1226: iadd
    //   1227: istore #23
    //   1229: iload #22
    //   1231: iinc #22, -1
    //   1234: ifle -> 1272
    //   1237: aload_0
    //   1238: iload #23
    //   1240: aload #4
    //   1242: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   1245: astore #24
    //   1247: iinc #23, 2
    //   1250: aload_0
    //   1251: aload #21
    //   1253: aload #24
    //   1255: iconst_1
    //   1256: invokevirtual ᐨẏ : (Ljava/lang/String;Z)Lyyds/sniarbtej/ᐨẏ;
    //   1259: iload #23
    //   1261: iconst_1
    //   1262: aload #4
    //   1264: invokespecial ᐨẏ : (Lyyds/sniarbtej/ᐨẏ;IZ[C)I
    //   1267: istore #23
    //   1269: goto -> 1229
    //   1272: iload #12
    //   1274: ifeq -> 1334
    //   1277: aload_0
    //   1278: iload #12
    //   1280: invokevirtual ᴵʖ : (I)I
    //   1283: istore #22
    //   1285: iload #12
    //   1287: iconst_2
    //   1288: iadd
    //   1289: istore #23
    //   1291: iload #22
    //   1293: iinc #22, -1
    //   1296: ifle -> 1334
    //   1299: aload_0
    //   1300: iload #23
    //   1302: aload #4
    //   1304: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   1307: astore #24
    //   1309: iinc #23, 2
    //   1312: aload_0
    //   1313: aload #21
    //   1315: aload #24
    //   1317: iconst_0
    //   1318: invokevirtual ᐨẏ : (Ljava/lang/String;Z)Lyyds/sniarbtej/ᐨẏ;
    //   1321: iload #23
    //   1323: iconst_1
    //   1324: aload #4
    //   1326: invokespecial ᐨẏ : (Lyyds/sniarbtej/ᐨẏ;IZ[C)I
    //   1329: istore #23
    //   1331: goto -> 1291
    //   1334: iload #15
    //   1336: ifeq -> 1413
    //   1339: aload_0
    //   1340: iload #15
    //   1342: invokevirtual ᴵʖ : (I)I
    //   1345: istore #22
    //   1347: iload #15
    //   1349: iconst_2
    //   1350: iadd
    //   1351: istore #23
    //   1353: iload #22
    //   1355: iinc #22, -1
    //   1358: ifle -> 1413
    //   1361: aload_0
    //   1362: aload_2
    //   1363: iload #23
    //   1365: invokespecial ᐨẏ : (Lyyds/sniarbtej/ʾ;I)I
    //   1368: istore #23
    //   1370: aload_0
    //   1371: iload #23
    //   1373: aload #4
    //   1375: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   1378: astore #24
    //   1380: iinc #23, 2
    //   1383: aload_0
    //   1384: aload #21
    //   1386: aload_2
    //   1387: getfield ιƚ : I
    //   1390: aload_2
    //   1391: getfield ᐨẏ : Lyyds/sniarbtej/ˏɪ;
    //   1394: aload #24
    //   1396: iconst_1
    //   1397: invokevirtual ᐨẏ : (ILyyds/sniarbtej/ˏɪ;Ljava/lang/String;Z)Lyyds/sniarbtej/ᐨẏ;
    //   1400: iload #23
    //   1402: iconst_1
    //   1403: aload #4
    //   1405: invokespecial ᐨẏ : (Lyyds/sniarbtej/ᐨẏ;IZ[C)I
    //   1408: istore #23
    //   1410: goto -> 1353
    //   1413: iload #16
    //   1415: ifeq -> 1492
    //   1418: aload_0
    //   1419: iload #16
    //   1421: invokevirtual ᴵʖ : (I)I
    //   1424: istore #22
    //   1426: iload #16
    //   1428: iconst_2
    //   1429: iadd
    //   1430: istore #23
    //   1432: iload #22
    //   1434: iinc #22, -1
    //   1437: ifle -> 1492
    //   1440: aload_0
    //   1441: aload_2
    //   1442: iload #23
    //   1444: invokespecial ᐨẏ : (Lyyds/sniarbtej/ʾ;I)I
    //   1447: istore #23
    //   1449: aload_0
    //   1450: iload #23
    //   1452: aload #4
    //   1454: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   1457: astore #24
    //   1459: iinc #23, 2
    //   1462: aload_0
    //   1463: aload #21
    //   1465: aload_2
    //   1466: getfield ιƚ : I
    //   1469: aload_2
    //   1470: getfield ᐨẏ : Lyyds/sniarbtej/ˏɪ;
    //   1473: aload #24
    //   1475: iconst_0
    //   1476: invokevirtual ᐨẏ : (ILyyds/sniarbtej/ˏɪ;Ljava/lang/String;Z)Lyyds/sniarbtej/ᐨẏ;
    //   1479: iload #23
    //   1481: iconst_1
    //   1482: aload #4
    //   1484: invokespecial ᐨẏ : (Lyyds/sniarbtej/ᐨẏ;IZ[C)I
    //   1487: istore #23
    //   1489: goto -> 1432
    //   1492: iload #13
    //   1494: ifeq -> 1507
    //   1497: aload_0
    //   1498: aload #21
    //   1500: aload_2
    //   1501: iload #13
    //   1503: iconst_1
    //   1504: invokespecial ᐨẏ : (Lyyds/sniarbtej/ˉｓ;Lyyds/sniarbtej/ʾ;IZ)V
    //   1507: iload #14
    //   1509: ifeq -> 1522
    //   1512: aload_0
    //   1513: aload #21
    //   1515: aload_2
    //   1516: iload #14
    //   1518: iconst_0
    //   1519: invokespecial ᐨẏ : (Lyyds/sniarbtej/ˉｓ;Lyyds/sniarbtej/ʾ;IZ)V
    //   1522: aload #19
    //   1524: ifnull -> 1554
    //   1527: aload #19
    //   1529: getfield ᐨẏ : Lyyds/sniarbtej/ᴵʖ;
    //   1532: astore #22
    //   1534: aload #19
    //   1536: aconst_null
    //   1537: putfield ᐨẏ : Lyyds/sniarbtej/ᴵʖ;
    //   1540: aload #21
    //   1542: aload #19
    //   1544: invokevirtual ᴵʖ : (Lyyds/sniarbtej/ᴵʖ;)V
    //   1547: aload #22
    //   1549: astore #19
    //   1551: goto -> 1522
    //   1554: iload #6
    //   1556: ifeq -> 7079
    //   1559: aload #21
    //   1561: invokevirtual ᴵʖ : ()V
    //   1564: aload_0
    //   1565: aload #21
    //   1567: aload_2
    //   1568: iload #6
    //   1570: istore #9
    //   1572: astore #8
    //   1574: astore #7
    //   1576: astore_1
    //   1577: iload #9
    //   1579: istore #10
    //   1581: aload_1
    //   1582: getfield ﾞл : [B
    //   1585: astore #20
    //   1587: aload #8
    //   1589: getfield ᐨẏ : [C
    //   1592: astore #23
    //   1594: aload_1
    //   1595: iload #10
    //   1597: invokevirtual ᴵʖ : (I)I
    //   1600: istore #24
    //   1602: aload_1
    //   1603: iload #10
    //   1605: iconst_2
    //   1606: iadd
    //   1607: invokevirtual ᴵʖ : (I)I
    //   1610: istore #25
    //   1612: aload_1
    //   1613: iload #10
    //   1615: iconst_4
    //   1616: iadd
    //   1617: invokevirtual ﾞл : (I)I
    //   1620: istore #26
    //   1622: iinc #10, 8
    //   1625: iload #26
    //   1627: aload_1
    //   1628: getfield ﾞл : [B
    //   1631: arraylength
    //   1632: iload #10
    //   1634: isub
    //   1635: if_icmple -> 1646
    //   1638: new java/lang/IllegalArgumentException
    //   1641: dup
    //   1642: invokespecial <init> : ()V
    //   1645: athrow
    //   1646: iload #10
    //   1648: istore_2
    //   1649: iload #10
    //   1651: iload #26
    //   1653: iadd
    //   1654: istore_3
    //   1655: aload #8
    //   1657: iload #26
    //   1659: iconst_1
    //   1660: iadd
    //   1661: anewarray yyds/sniarbtej/ᔪ
    //   1664: dup_x1
    //   1665: putfield ᐨẏ : [Lyyds/sniarbtej/ᔪ;
    //   1668: astore #4
    //   1670: iload #10
    //   1672: iload_3
    //   1673: if_icmpge -> 2997
    //   1676: iload #10
    //   1678: iload_2
    //   1679: isub
    //   1680: istore #6
    //   1682: aload #20
    //   1684: iload #10
    //   1686: baload
    //   1687: sipush #255
    //   1690: iand
    //   1691: dup
    //   1692: istore #11
    //   1694: tableswitch default -> 2986, 0 -> 2592, 1 -> 2592, 2 -> 2592, 3 -> 2592, 4 -> 2592, 5 -> 2592, 6 -> 2592, 7 -> 2592, 8 -> 2592, 9 -> 2592, 10 -> 2592, 11 -> 2592, 12 -> 2592, 13 -> 2592, 14 -> 2592, 15 -> 2592, 16 -> 2962, 17 -> 2968, 18 -> 2962, 19 -> 2968, 20 -> 2968, 21 -> 2962, 22 -> 2962, 23 -> 2962, 24 -> 2962, 25 -> 2962, 26 -> 2592, 27 -> 2592, 28 -> 2592, 29 -> 2592, 30 -> 2592, 31 -> 2592, 32 -> 2592, 33 -> 2592, 34 -> 2592, 35 -> 2592, 36 -> 2592, 37 -> 2592, 38 -> 2592, 39 -> 2592, 40 -> 2592, 41 -> 2592, 42 -> 2592, 43 -> 2592, 44 -> 2592, 45 -> 2592, 46 -> 2592, 47 -> 2592, 48 -> 2592, 49 -> 2592, 50 -> 2592, 51 -> 2592, 52 -> 2592, 53 -> 2592, 54 -> 2962, 55 -> 2962, 56 -> 2962, 57 -> 2962, 58 -> 2962, 59 -> 2592, 60 -> 2592, 61 -> 2592, 62 -> 2592, 63 -> 2592, 64 -> 2592, 65 -> 2592, 66 -> 2592, 67 -> 2592, 68 -> 2592, 69 -> 2592, 70 -> 2592, 71 -> 2592, 72 -> 2592, 73 -> 2592, 74 -> 2592, 75 -> 2592, 76 -> 2592, 77 -> 2592, 78 -> 2592, 79 -> 2592, 80 -> 2592, 81 -> 2592, 82 -> 2592, 83 -> 2592, 84 -> 2592, 85 -> 2592, 86 -> 2592, 87 -> 2592, 88 -> 2592, 89 -> 2592, 90 -> 2592, 91 -> 2592, 92 -> 2592, 93 -> 2592, 94 -> 2592, 95 -> 2592, 96 -> 2592, 97 -> 2592, 98 -> 2592, 99 -> 2592, 100 -> 2592, 101 -> 2592, 102 -> 2592, 103 -> 2592, 104 -> 2592, 105 -> 2592, 106 -> 2592, 107 -> 2592, 108 -> 2592, 109 -> 2592, 110 -> 2592, 111 -> 2592, 112 -> 2592, 113 -> 2592, 114 -> 2592, 115 -> 2592, 116 -> 2592, 117 -> 2592, 118 -> 2592, 119 -> 2592, 120 -> 2592, 121 -> 2592, 122 -> 2592, 123 -> 2592, 124 -> 2592, 125 -> 2592, 126 -> 2592, 127 -> 2592, 128 -> 2592, 129 -> 2592, 130 -> 2592, 131 -> 2592, 132 -> 2968, 133 -> 2592, 134 -> 2592, 135 -> 2592, 136 -> 2592, 137 -> 2592, 138 -> 2592, 139 -> 2592, 140 -> 2592, 141 -> 2592, 142 -> 2592, 143 -> 2592, 144 -> 2592, 145 -> 2592, 146 -> 2592, 147 -> 2592, 148 -> 2592, 149 -> 2592, 150 -> 2592, 151 -> 2592, 152 -> 2592, 153 -> 2598, 154 -> 2598, 155 -> 2598, 156 -> 2598, 157 -> 2598, 158 -> 2598, 159 -> 2598, 160 -> 2598, 161 -> 2598, 162 -> 2598, 163 -> 2598, 164 -> 2598, 165 -> 2598, 166 -> 2598, 167 -> 2598, 168 -> 2598, 169 -> 2962, 170 -> 2808, 171 -> 2890, 172 -> 2592, 173 -> 2592, 174 -> 2592, 175 -> 2592, 176 -> 2592, 177 -> 2592, 178 -> 2968, 179 -> 2968, 180 -> 2968, 181 -> 2968, 182 -> 2968, 183 -> 2968, 184 -> 2968, 185 -> 2974, 186 -> 2974, 187 -> 2968, 188 -> 2962, 189 -> 2968, 190 -> 2592, 191 -> 2592, 192 -> 2968, 193 -> 2968, 194 -> 2592, 195 -> 2592, 196 -> 2670, 197 -> 2980, 198 -> 2598, 199 -> 2598, 200 -> 2646, 201 -> 2646, 202 -> 2622, 203 -> 2622, 204 -> 2622, 205 -> 2622, 206 -> 2622, 207 -> 2622, 208 -> 2622, 209 -> 2622, 210 -> 2622, 211 -> 2622, 212 -> 2622, 213 -> 2622, 214 -> 2622, 215 -> 2622, 216 -> 2622, 217 -> 2622, 218 -> 2622, 219 -> 2622, 220 -> 2646
    //   2592: iinc #10, 1
    //   2595: goto -> 1670
    //   2598: aload_1
    //   2599: iload #6
    //   2601: aload_1
    //   2602: iload #10
    //   2604: iconst_1
    //   2605: iadd
    //   2606: invokevirtual ᐨẏ : (I)S
    //   2609: iadd
    //   2610: aload #4
    //   2612: invokespecial ˊ : (I[Lyyds/sniarbtej/ᔪ;)Lyyds/sniarbtej/ᔪ;
    //   2615: pop
    //   2616: iinc #10, 3
    //   2619: goto -> 1670
    //   2622: aload_1
    //   2623: iload #6
    //   2625: aload_1
    //   2626: iload #10
    //   2628: iconst_1
    //   2629: iadd
    //   2630: invokevirtual ᴵʖ : (I)I
    //   2633: iadd
    //   2634: aload #4
    //   2636: invokespecial ˊ : (I[Lyyds/sniarbtej/ᔪ;)Lyyds/sniarbtej/ᔪ;
    //   2639: pop
    //   2640: iinc #10, 3
    //   2643: goto -> 1670
    //   2646: aload_1
    //   2647: iload #6
    //   2649: aload_1
    //   2650: iload #10
    //   2652: iconst_1
    //   2653: iadd
    //   2654: invokevirtual ﾞл : (I)I
    //   2657: iadd
    //   2658: aload #4
    //   2660: invokespecial ˊ : (I[Lyyds/sniarbtej/ᔪ;)Lyyds/sniarbtej/ᔪ;
    //   2663: pop
    //   2664: iinc #10, 5
    //   2667: goto -> 1670
    //   2670: aload #20
    //   2672: iload #10
    //   2674: iconst_1
    //   2675: iadd
    //   2676: baload
    //   2677: sipush #255
    //   2680: iand
    //   2681: lookupswitch default -> 2800, 21 -> 2788, 22 -> 2788, 23 -> 2788, 24 -> 2788, 25 -> 2788, 54 -> 2788, 55 -> 2788, 56 -> 2788, 57 -> 2788, 58 -> 2788, 132 -> 2794, 169 -> 2788
    //   2788: iinc #10, 4
    //   2791: goto -> 1670
    //   2794: iinc #10, 6
    //   2797: goto -> 1670
    //   2800: new java/lang/IllegalArgumentException
    //   2803: dup
    //   2804: invokespecial <init> : ()V
    //   2807: athrow
    //   2808: iload #10
    //   2810: iconst_4
    //   2811: iload #6
    //   2813: iconst_3
    //   2814: iand
    //   2815: isub
    //   2816: iadd
    //   2817: istore #10
    //   2819: aload_1
    //   2820: iload #6
    //   2822: aload_1
    //   2823: iload #10
    //   2825: invokevirtual ﾞл : (I)I
    //   2828: iadd
    //   2829: aload #4
    //   2831: invokespecial ˊ : (I[Lyyds/sniarbtej/ᔪ;)Lyyds/sniarbtej/ᔪ;
    //   2834: pop
    //   2835: aload_1
    //   2836: iload #10
    //   2838: bipush #8
    //   2840: iadd
    //   2841: invokevirtual ﾞл : (I)I
    //   2844: aload_1
    //   2845: iload #10
    //   2847: iconst_4
    //   2848: iadd
    //   2849: invokevirtual ﾞл : (I)I
    //   2852: isub
    //   2853: iconst_1
    //   2854: iadd
    //   2855: istore #12
    //   2857: iinc #10, 12
    //   2860: iload #12
    //   2862: iinc #12, -1
    //   2865: ifle -> 2994
    //   2868: aload_1
    //   2869: iload #6
    //   2871: aload_1
    //   2872: iload #10
    //   2874: invokevirtual ﾞл : (I)I
    //   2877: iadd
    //   2878: aload #4
    //   2880: invokespecial ˊ : (I[Lyyds/sniarbtej/ᔪ;)Lyyds/sniarbtej/ᔪ;
    //   2883: pop
    //   2884: iinc #10, 4
    //   2887: goto -> 2860
    //   2890: iload #10
    //   2892: iconst_4
    //   2893: iload #6
    //   2895: iconst_3
    //   2896: iand
    //   2897: isub
    //   2898: iadd
    //   2899: istore #10
    //   2901: aload_1
    //   2902: iload #6
    //   2904: aload_1
    //   2905: iload #10
    //   2907: invokevirtual ﾞл : (I)I
    //   2910: iadd
    //   2911: aload #4
    //   2913: invokespecial ˊ : (I[Lyyds/sniarbtej/ᔪ;)Lyyds/sniarbtej/ᔪ;
    //   2916: pop
    //   2917: aload_1
    //   2918: iload #10
    //   2920: iconst_4
    //   2921: iadd
    //   2922: invokevirtual ﾞл : (I)I
    //   2925: istore #13
    //   2927: iinc #10, 8
    //   2930: iload #13
    //   2932: iinc #13, -1
    //   2935: ifle -> 2994
    //   2938: aload_1
    //   2939: iload #6
    //   2941: aload_1
    //   2942: iload #10
    //   2944: iconst_4
    //   2945: iadd
    //   2946: invokevirtual ﾞл : (I)I
    //   2949: iadd
    //   2950: aload #4
    //   2952: invokespecial ˊ : (I[Lyyds/sniarbtej/ᔪ;)Lyyds/sniarbtej/ᔪ;
    //   2955: pop
    //   2956: iinc #10, 8
    //   2959: goto -> 2930
    //   2962: iinc #10, 2
    //   2965: goto -> 1670
    //   2968: iinc #10, 3
    //   2971: goto -> 1670
    //   2974: iinc #10, 5
    //   2977: goto -> 1670
    //   2980: iinc #10, 4
    //   2983: goto -> 1670
    //   2986: new java/lang/IllegalArgumentException
    //   2989: dup
    //   2990: invokespecial <init> : ()V
    //   2993: athrow
    //   2994: goto -> 1670
    //   2997: aload_1
    //   2998: iload #10
    //   3000: invokevirtual ᴵʖ : (I)I
    //   3003: istore #6
    //   3005: iinc #10, 2
    //   3008: iload #6
    //   3010: iinc #6, -1
    //   3013: ifle -> 3103
    //   3016: aload_1
    //   3017: dup
    //   3018: iload #10
    //   3020: invokevirtual ᴵʖ : (I)I
    //   3023: aload #4
    //   3025: invokespecial ˊ : (I[Lyyds/sniarbtej/ᔪ;)Lyyds/sniarbtej/ᔪ;
    //   3028: astore #11
    //   3030: aload_1
    //   3031: dup
    //   3032: iload #10
    //   3034: iconst_2
    //   3035: iadd
    //   3036: invokevirtual ᴵʖ : (I)I
    //   3039: aload #4
    //   3041: invokespecial ˊ : (I[Lyyds/sniarbtej/ᔪ;)Lyyds/sniarbtej/ᔪ;
    //   3044: astore #12
    //   3046: aload_1
    //   3047: dup
    //   3048: iload #10
    //   3050: iconst_4
    //   3051: iadd
    //   3052: invokevirtual ᴵʖ : (I)I
    //   3055: aload #4
    //   3057: invokespecial ˊ : (I[Lyyds/sniarbtej/ᔪ;)Lyyds/sniarbtej/ᔪ;
    //   3060: astore #13
    //   3062: aload_1
    //   3063: dup
    //   3064: getfield ᐨẏ : [I
    //   3067: aload_1
    //   3068: iload #10
    //   3070: bipush #6
    //   3072: iadd
    //   3073: invokevirtual ᴵʖ : (I)I
    //   3076: iaload
    //   3077: aload #23
    //   3079: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   3082: astore #14
    //   3084: iinc #10, 8
    //   3087: aload #7
    //   3089: aload #11
    //   3091: aload #12
    //   3093: aload #13
    //   3095: aload #14
    //   3097: invokevirtual ᐨẏ : (Lyyds/sniarbtej/ᔪ;Lyyds/sniarbtej/ᔪ;Lyyds/sniarbtej/ᔪ;Ljava/lang/String;)V
    //   3100: goto -> 3008
    //   3103: iconst_0
    //   3104: istore #11
    //   3106: iconst_0
    //   3107: istore #12
    //   3109: iconst_1
    //   3110: istore #13
    //   3112: iconst_0
    //   3113: istore #14
    //   3115: iconst_0
    //   3116: istore #6
    //   3118: aconst_null
    //   3119: astore #15
    //   3121: aconst_null
    //   3122: astore #16
    //   3124: aconst_null
    //   3125: astore #17
    //   3127: aload_1
    //   3128: iload #10
    //   3130: invokevirtual ᴵʖ : (I)I
    //   3133: istore #18
    //   3135: iinc #10, 2
    //   3138: iload #18
    //   3140: iinc #18, -1
    //   3143: ifle -> 3826
    //   3146: aload_1
    //   3147: iload #10
    //   3149: aload #23
    //   3151: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   3154: astore #19
    //   3156: aload_1
    //   3157: iload #10
    //   3159: iconst_2
    //   3160: iadd
    //   3161: invokevirtual ﾞл : (I)I
    //   3164: istore #22
    //   3166: iinc #10, 6
    //   3169: ldc_w '忧㡙㓪垭왜姎訴됰㼶஍餔슩塔泌빧礮汔㪌'
    //   3172: invokevirtual toCharArray : ()[C
    //   3175: dup
    //   3176: dup
    //   3177: bipush #7
    //   3179: dup_x1
    //   3180: caload
    //   3181: sipush #27544
    //   3184: ixor
    //   3185: i2c
    //   3186: castore
    //   3187: sipush #16930
    //   3190: iconst_3
    //   3191: iconst_1
    //   3192: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   3195: aload #19
    //   3197: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3200: ifeq -> 3286
    //   3203: aload #8
    //   3205: getfield ᕁ : I
    //   3208: iconst_2
    //   3209: iand
    //   3210: ifne -> 3816
    //   3213: iload #10
    //   3215: istore #14
    //   3217: iload #10
    //   3219: istore #27
    //   3221: aload_1
    //   3222: iload #27
    //   3224: invokevirtual ᴵʖ : (I)I
    //   3227: istore #28
    //   3229: iinc #27, 2
    //   3232: iload #28
    //   3234: iinc #28, -1
    //   3237: ifle -> 3283
    //   3240: aload_1
    //   3241: iload #27
    //   3243: invokevirtual ᴵʖ : (I)I
    //   3246: istore #29
    //   3248: aload_1
    //   3249: iload #29
    //   3251: aload #4
    //   3253: invokespecial ᐨẏ : (I[Lyyds/sniarbtej/ᔪ;)V
    //   3256: aload_1
    //   3257: iload #27
    //   3259: iconst_2
    //   3260: iadd
    //   3261: invokevirtual ᴵʖ : (I)I
    //   3264: istore #30
    //   3266: aload_1
    //   3267: iload #29
    //   3269: iload #30
    //   3271: iadd
    //   3272: aload #4
    //   3274: invokespecial ᐨẏ : (I[Lyyds/sniarbtej/ᔪ;)V
    //   3277: iinc #27, 10
    //   3280: goto -> 3232
    //   3283: goto -> 3816
    //   3286: ldc_w 'ꊽ痔抈㢽ज़廝쯃ꉎ㌲斚㜅邓ځ┋ꝸƊᝨ䟡䮁ԟ칽檿'
    //   3289: invokevirtual toCharArray : ()[C
    //   3292: dup
    //   3293: dup
    //   3294: iconst_2
    //   3295: dup_x1
    //   3296: caload
    //   3297: sipush #17889
    //   3300: ixor
    //   3301: i2c
    //   3302: castore
    //   3303: sipush #32368
    //   3306: iconst_1
    //   3307: iconst_1
    //   3308: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   3311: aload #19
    //   3313: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3316: ifeq -> 3326
    //   3319: iload #10
    //   3321: istore #6
    //   3323: goto -> 3816
    //   3326: ldc_w '󸉼ძ㝀퇍劰╆ꛤ↘?鱖ꑉ껇儧偃䐢'
    //   3329: invokevirtual toCharArray : ()[C
    //   3332: dup
    //   3333: dup
    //   3334: iconst_3
    //   3335: dup_x1
    //   3336: caload
    //   3337: sipush #27384
    //   3340: ixor
    //   3341: i2c
    //   3342: castore
    //   3343: sipush #19490
    //   3346: iconst_4
    //   3347: iconst_4
    //   3348: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   3351: aload #19
    //   3353: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3356: ifeq -> 3561
    //   3359: aload #8
    //   3361: getfield ᕁ : I
    //   3364: iconst_2
    //   3365: iand
    //   3366: ifne -> 3816
    //   3369: iload #10
    //   3371: istore #27
    //   3373: aload_1
    //   3374: iload #27
    //   3376: invokevirtual ᴵʖ : (I)I
    //   3379: istore #28
    //   3381: iinc #27, 2
    //   3384: iload #28
    //   3386: iinc #28, -1
    //   3389: ifle -> 3558
    //   3392: aload_1
    //   3393: iload #27
    //   3395: invokevirtual ᴵʖ : (I)I
    //   3398: istore #29
    //   3400: aload_1
    //   3401: iload #27
    //   3403: iconst_2
    //   3404: iadd
    //   3405: invokevirtual ᴵʖ : (I)I
    //   3408: istore #30
    //   3410: iinc #27, 4
    //   3413: aload_1
    //   3414: iload #29
    //   3416: aload #4
    //   3418: invokespecial ᐨẏ : (I[Lyyds/sniarbtej/ᔪ;)V
    //   3421: aload #4
    //   3423: iload #29
    //   3425: aaload
    //   3426: iload #30
    //   3428: istore #67
    //   3430: dup
    //   3431: astore #66
    //   3433: getfield ᴵʖ : S
    //   3436: sipush #128
    //   3439: iand
    //   3440: ifne -> 3468
    //   3443: aload #66
    //   3445: dup
    //   3446: getfield ᴵʖ : S
    //   3449: sipush #128
    //   3452: ior
    //   3453: i2s
    //   3454: putfield ᴵʖ : S
    //   3457: aload #66
    //   3459: iload #67
    //   3461: i2s
    //   3462: putfield ﾞл : S
    //   3465: goto -> 3384
    //   3468: aload #66
    //   3470: getfield ʾܪ : [I
    //   3473: ifnonnull -> 3484
    //   3476: aload #66
    //   3478: iconst_4
    //   3479: newarray int
    //   3481: putfield ʾܪ : [I
    //   3484: aload #66
    //   3486: getfield ʾܪ : [I
    //   3489: iconst_0
    //   3490: dup2
    //   3491: iaload
    //   3492: iconst_1
    //   3493: iadd
    //   3494: dup_x2
    //   3495: iastore
    //   3496: dup
    //   3497: istore #68
    //   3499: aload #66
    //   3501: getfield ʾܪ : [I
    //   3504: arraylength
    //   3505: if_icmplt -> 3545
    //   3508: aload #66
    //   3510: getfield ʾܪ : [I
    //   3513: arraylength
    //   3514: iconst_4
    //   3515: iadd
    //   3516: newarray int
    //   3518: astore #69
    //   3520: aload #66
    //   3522: getfield ʾܪ : [I
    //   3525: iconst_0
    //   3526: aload #69
    //   3528: iconst_0
    //   3529: aload #66
    //   3531: getfield ʾܪ : [I
    //   3534: arraylength
    //   3535: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   3538: aload #66
    //   3540: aload #69
    //   3542: putfield ʾܪ : [I
    //   3545: aload #66
    //   3547: getfield ʾܪ : [I
    //   3550: iload #68
    //   3552: iload #67
    //   3554: iastore
    //   3555: goto -> 3384
    //   3558: goto -> 3816
    //   3561: ldc_w 'ꤲ뙀럹⯨荒㖆稡놴ይｋ襤䪑豦䂆튣뉰걮⢃∖톮鸃鄶؝ณ삊텣렿噤'
    //   3564: invokevirtual toCharArray : ()[C
    //   3567: dup
    //   3568: dup
    //   3569: bipush #12
    //   3571: dup_x1
    //   3572: caload
    //   3573: sipush #21824
    //   3576: ixor
    //   3577: i2c
    //   3578: castore
    //   3579: sipush #18300
    //   3582: iconst_3
    //   3583: iconst_5
    //   3584: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   3587: aload #19
    //   3589: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3592: ifeq -> 3611
    //   3595: aload_1
    //   3596: aload #7
    //   3598: aload #8
    //   3600: iload #10
    //   3602: iconst_1
    //   3603: invokespecial ᐨẏ : (Lyyds/sniarbtej/ˉｓ;Lyyds/sniarbtej/ʾ;IZ)[I
    //   3606: astore #15
    //   3608: goto -> 3816
    //   3611: ldc_w 'ꩯ뎪훙绖䄓㗨ʂ儨棺珜἞䖽⊯땺ꀁ堖뵡꿛磊?➴⣁຋䷷ျ?룙蘐䩫渵'
    //   3614: invokevirtual toCharArray : ()[C
    //   3617: dup
    //   3618: dup
    //   3619: bipush #12
    //   3621: dup_x1
    //   3622: caload
    //   3623: sipush #16675
    //   3626: ixor
    //   3627: i2c
    //   3628: castore
    //   3629: sipush #29528
    //   3632: iconst_3
    //   3633: iconst_5
    //   3634: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   3637: aload #19
    //   3639: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3642: ifeq -> 3661
    //   3645: aload_1
    //   3646: aload #7
    //   3648: aload #8
    //   3650: iload #10
    //   3652: iconst_0
    //   3653: invokespecial ᐨẏ : (Lyyds/sniarbtej/ˉｓ;Lyyds/sniarbtej/ʾ;IZ)[I
    //   3656: astore #16
    //   3658: goto -> 3816
    //   3661: ldc_w '㑏繲憋騇都犃륔ᴧ駇ꊂﶼ↛'
    //   3664: invokevirtual toCharArray : ()[C
    //   3667: dup
    //   3668: dup
    //   3669: bipush #11
    //   3671: dup_x1
    //   3672: caload
    //   3673: sipush #990
    //   3676: ixor
    //   3677: i2c
    //   3678: castore
    //   3679: sipush #24629
    //   3682: iconst_0
    //   3683: iconst_1
    //   3684: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   3687: aload #19
    //   3689: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3692: ifeq -> 3721
    //   3695: aload #8
    //   3697: getfield ᕁ : I
    //   3700: iconst_4
    //   3701: iand
    //   3702: ifne -> 3816
    //   3705: iload #10
    //   3707: iconst_2
    //   3708: iadd
    //   3709: istore #11
    //   3711: iload #10
    //   3713: iload #22
    //   3715: iadd
    //   3716: istore #12
    //   3718: goto -> 3816
    //   3721: ldc_w 'Ƴ䈰륳瑩ᐠ聀䶘ꍡ筵'
    //   3724: invokevirtual toCharArray : ()[C
    //   3727: dup
    //   3728: dup
    //   3729: iconst_3
    //   3730: dup_x1
    //   3731: caload
    //   3732: sipush #17991
    //   3735: ixor
    //   3736: i2c
    //   3737: castore
    //   3738: sipush #28224
    //   3741: iconst_5
    //   3742: iconst_0
    //   3743: invokestatic v : (Ljava/lang/Object;SIS)Ljava/lang/String;
    //   3746: aload #19
    //   3748: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3751: ifeq -> 3783
    //   3754: aload #8
    //   3756: getfield ᕁ : I
    //   3759: iconst_4
    //   3760: iand
    //   3761: ifne -> 3816
    //   3764: iload #10
    //   3766: iconst_2
    //   3767: iadd
    //   3768: istore #11
    //   3770: iload #10
    //   3772: iload #22
    //   3774: iadd
    //   3775: istore #12
    //   3777: iconst_0
    //   3778: istore #13
    //   3780: goto -> 3816
    //   3783: aload_1
    //   3784: aload #8
    //   3786: getfield ˊ : [Lyyds/sniarbtej/ᴵʖ;
    //   3789: aload #19
    //   3791: iload #10
    //   3793: iload #22
    //   3795: aload #23
    //   3797: iload #9
    //   3799: aload #4
    //   3801: invokespecial ᐨẏ : ([Lyyds/sniarbtej/ᴵʖ;Ljava/lang/String;II[CI[Lyyds/sniarbtej/ᔪ;)Lyyds/sniarbtej/ᴵʖ;
    //   3804: dup
    //   3805: astore #27
    //   3807: aload #17
    //   3809: putfield ᐨẏ : Lyyds/sniarbtej/ᴵʖ;
    //   3812: aload #27
    //   3814: astore #17
    //   3816: iload #10
    //   3818: iload #22
    //   3820: iadd
    //   3821: istore #10
    //   3823: goto -> 3138
    //   3826: aload #8
    //   3828: getfield ᕁ : I
    //   3831: bipush #8
    //   3833: iand
    //   3834: ifeq -> 3841
    //   3837: iconst_1
    //   3838: goto -> 3842
    //   3841: iconst_0
    //   3842: istore #19
    //   3844: iload #11
    //   3846: ifeq -> 3986
    //   3849: aload #8
    //   3851: iconst_m1
    //   3852: putfield ʽו : I
    //   3855: aload #8
    //   3857: iconst_0
    //   3858: putfield ﹳه : I
    //   3861: aload #8
    //   3863: iconst_0
    //   3864: putfield ᐧǏ : I
    //   3867: aload #8
    //   3869: iconst_0
    //   3870: putfield ιՆ : I
    //   3873: aload #8
    //   3875: iload #25
    //   3877: anewarray java/lang/Object
    //   3880: putfield ˊ : [Ljava/lang/Object;
    //   3883: aload #8
    //   3885: iconst_0
    //   3886: putfield וּ : I
    //   3889: aload #8
    //   3891: iload #24
    //   3893: anewarray java/lang/Object
    //   3896: putfield ᴵʖ : [Ljava/lang/Object;
    //   3899: iload #19
    //   3901: ifeq -> 3910
    //   3904: aload_1
    //   3905: aload #8
    //   3907: invokespecial ᐨẏ : (Lyyds/sniarbtej/ʾ;)V
    //   3910: iload #11
    //   3912: istore #22
    //   3914: iload #22
    //   3916: iload #12
    //   3918: iconst_2
    //   3919: isub
    //   3920: if_icmpge -> 3986
    //   3923: aload #20
    //   3925: iload #22
    //   3927: baload
    //   3928: bipush #8
    //   3930: if_icmpne -> 3980
    //   3933: aload_1
    //   3934: iload #22
    //   3936: iconst_1
    //   3937: iadd
    //   3938: invokevirtual ᴵʖ : (I)I
    //   3941: dup
    //   3942: istore #27
    //   3944: iflt -> 3980
    //   3947: iload #27
    //   3949: iload #26
    //   3951: if_icmpge -> 3980
    //   3954: aload #20
    //   3956: iload_2
    //   3957: iload #27
    //   3959: iadd
    //   3960: baload
    //   3961: sipush #255
    //   3964: iand
    //   3965: sipush #187
    //   3968: if_icmpne -> 3980
    //   3971: aload_1
    //   3972: iload #27
    //   3974: aload #4
    //   3976: invokespecial ˊ : (I[Lyyds/sniarbtej/ᔪ;)Lyyds/sniarbtej/ᔪ;
    //   3979: pop
    //   3980: iinc #22, 1
    //   3983: goto -> 3914
    //   3986: iload #19
    //   3988: ifeq -> 4014
    //   3991: aload #8
    //   3993: getfield ᕁ : I
    //   3996: sipush #256
    //   3999: iand
    //   4000: ifeq -> 4014
    //   4003: aload #7
    //   4005: iconst_m1
    //   4006: iload #25
    //   4008: aconst_null
    //   4009: iconst_0
    //   4010: aconst_null
    //   4011: invokevirtual ᐨẏ : (II[Ljava/lang/Object;I[Ljava/lang/Object;)V
    //   4014: iconst_0
    //   4015: istore #22
    //   4017: aload_1
    //   4018: aload #15
    //   4020: iconst_0
    //   4021: invokespecial ᐨẏ : ([II)I
    //   4024: istore #27
    //   4026: iconst_0
    //   4027: istore #28
    //   4029: aload_1
    //   4030: aload #16
    //   4032: iconst_0
    //   4033: invokespecial ᐨẏ : ([II)I
    //   4036: istore #29
    //   4038: iconst_0
    //   4039: istore #30
    //   4041: aload #8
    //   4043: getfield ᕁ : I
    //   4046: sipush #256
    //   4049: iand
    //   4050: ifne -> 4058
    //   4053: bipush #33
    //   4055: goto -> 4059
    //   4058: iconst_0
    //   4059: istore #9
    //   4061: iload_2
    //   4062: istore #10
    //   4064: iload #10
    //   4066: iload_3
    //   4067: if_icmpge -> 6500
    //   4070: iload #10
    //   4072: iload_2
    //   4073: isub
    //   4074: istore #18
    //   4076: aload #4
    //   4078: iload #18
    //   4080: aaload
    //   4081: dup
    //   4082: astore #31
    //   4084: ifnull -> 4109
    //   4087: aload #31
    //   4089: aload #7
    //   4091: aload #8
    //   4093: getfield ᕁ : I
    //   4096: iconst_2
    //   4097: iand
    //   4098: ifne -> 4105
    //   4101: iconst_1
    //   4102: goto -> 4106
    //   4105: iconst_0
    //   4106: invokevirtual ᐨẏ : (Lyyds/sniarbtej/ˉｓ;Z)V
    //   4109: iload #11
    //   4111: ifeq -> 4244
    //   4114: aload #8
    //   4116: getfield ʽו : I
    //   4119: iload #18
    //   4121: if_icmpeq -> 4133
    //   4124: aload #8
    //   4126: getfield ʽו : I
    //   4129: iconst_m1
    //   4130: if_icmpne -> 4244
    //   4133: aload #8
    //   4135: getfield ʽו : I
    //   4138: iconst_m1
    //   4139: if_icmpeq -> 4214
    //   4142: iload #13
    //   4144: ifeq -> 4152
    //   4147: iload #19
    //   4149: ifeq -> 4181
    //   4152: aload #7
    //   4154: iconst_m1
    //   4155: aload #8
    //   4157: getfield ᐧǏ : I
    //   4160: aload #8
    //   4162: getfield ˊ : [Ljava/lang/Object;
    //   4165: aload #8
    //   4167: getfield וּ : I
    //   4170: aload #8
    //   4172: getfield ᴵʖ : [Ljava/lang/Object;
    //   4175: invokevirtual ᐨẏ : (II[Ljava/lang/Object;I[Ljava/lang/Object;)V
    //   4178: goto -> 4211
    //   4181: aload #7
    //   4183: aload #8
    //   4185: getfield ﹳه : I
    //   4188: aload #8
    //   4190: getfield ιՆ : I
    //   4193: aload #8
    //   4195: getfield ˊ : [Ljava/lang/Object;
    //   4198: aload #8
    //   4200: getfield וּ : I
    //   4203: aload #8
    //   4205: getfield ᴵʖ : [Ljava/lang/Object;
    //   4208: invokevirtual ᐨẏ : (II[Ljava/lang/Object;I[Ljava/lang/Object;)V
    //   4211: iconst_0
    //   4212: istore #30
    //   4214: iload #11
    //   4216: iload #12
    //   4218: if_icmpge -> 4238
    //   4221: aload_1
    //   4222: iload #11
    //   4224: iload #13
    //   4226: iload #19
    //   4228: aload #8
    //   4230: invokespecial ᐨẏ : (IZZLyyds/sniarbtej/ʾ;)I
    //   4233: istore #11
    //   4235: goto -> 4109
    //   4238: iconst_0
    //   4239: istore #11
    //   4241: goto -> 4109
    //   4244: iload #30
    //   4246: ifeq -> 4275
    //   4249: aload #8
    //   4251: getfield ᕁ : I
    //   4254: bipush #8
    //   4256: iand
    //   4257: ifeq -> 4272
    //   4260: aload #7
    //   4262: sipush #256
    //   4265: iconst_0
    //   4266: aconst_null
    //   4267: iconst_0
    //   4268: aconst_null
    //   4269: invokevirtual ᐨẏ : (II[Ljava/lang/Object;I[Ljava/lang/Object;)V
    //   4272: iconst_0
    //   4273: istore #30
    //   4275: aload #20
    //   4277: iload #10
    //   4279: baload
    //   4280: sipush #255
    //   4283: iand
    //   4284: dup
    //   4285: istore #32
    //   4287: tableswitch default -> 6295, 0 -> 5184, 1 -> 5184, 2 -> 5184, 3 -> 5184, 4 -> 5184, 5 -> 5184, 6 -> 5184, 7 -> 5184, 8 -> 5184, 9 -> 5184, 10 -> 5184, 11 -> 5184, 12 -> 5184, 13 -> 5184, 14 -> 5184, 15 -> 5184, 16 -> 5790, 17 -> 5810, 18 -> 5831, 19 -> 5859, 20 -> 5859, 21 -> 5766, 22 -> 5766, 23 -> 5766, 24 -> 5766, 25 -> 5766, 26 -> 5197, 27 -> 5197, 28 -> 5197, 29 -> 5197, 30 -> 5197, 31 -> 5197, 32 -> 5197, 33 -> 5197, 34 -> 5197, 35 -> 5197, 36 -> 5197, 37 -> 5197, 38 -> 5197, 39 -> 5197, 40 -> 5197, 41 -> 5197, 42 -> 5197, 43 -> 5197, 44 -> 5197, 45 -> 5197, 46 -> 5184, 47 -> 5184, 48 -> 5184, 49 -> 5184, 50 -> 5184, 51 -> 5184, 52 -> 5184, 53 -> 5184, 54 -> 5766, 55 -> 5766, 56 -> 5766, 57 -> 5766, 58 -> 5766, 59 -> 5222, 60 -> 5222, 61 -> 5222, 62 -> 5222, 63 -> 5222, 64 -> 5222, 65 -> 5222, 66 -> 5222, 67 -> 5222, 68 -> 5222, 69 -> 5222, 70 -> 5222, 71 -> 5222, 72 -> 5222, 73 -> 5222, 74 -> 5222, 75 -> 5222, 76 -> 5222, 77 -> 5222, 78 -> 5222, 79 -> 5184, 80 -> 5184, 81 -> 5184, 82 -> 5184, 83 -> 5184, 84 -> 5184, 85 -> 5184, 86 -> 5184, 87 -> 5184, 88 -> 5184, 89 -> 5184, 90 -> 5184, 91 -> 5184, 92 -> 5184, 93 -> 5184, 94 -> 5184, 95 -> 5184, 96 -> 5184, 97 -> 5184, 98 -> 5184, 99 -> 5184, 100 -> 5184, 101 -> 5184, 102 -> 5184, 103 -> 5184, 104 -> 5184, 105 -> 5184, 106 -> 5184, 107 -> 5184, 108 -> 5184, 109 -> 5184, 110 -> 5184, 111 -> 5184, 112 -> 5184, 113 -> 5184, 114 -> 5184, 115 -> 5184, 116 -> 5184, 117 -> 5184, 118 -> 5184, 119 -> 5184, 120 -> 5184, 121 -> 5184, 122 -> 5184, 123 -> 5184, 124 -> 5184, 125 -> 5184, 126 -> 5184, 127 -> 5184, 128 -> 5184, 129 -> 5184, 130 -> 5184, 131 -> 5184, 132 -> 6223, 133 -> 5184, 134 -> 5184, 135 -> 5184, 136 -> 5184, 137 -> 5184, 138 -> 5184, 139 -> 5184, 140 -> 5184, 141 -> 5184, 142 -> 5184, 143 -> 5184, 144 -> 5184, 145 -> 5184, 146 -> 5184, 147 -> 5184, 148 -> 5184, 149 -> 5184, 150 -> 5184, 151 -> 5184, 152 -> 5184, 153 -> 5247, 154 -> 5247, 155 -> 5247, 156 -> 5247, 157 -> 5247, 158 -> 5247, 159 -> 5247, 160 -> 5247, 161 -> 5247, 162 -> 5247, 163 -> 5247, 164 -> 5247, 165 -> 5247, 166 -> 5247, 167 -> 5247, 168 -> 5247, 169 -> 5766, 170 -> 5538, 171 -> 5652, 172 -> 5184, 173 -> 5184, 174 -> 5184, 175 -> 5184, 176 -> 5184, 177 -> 5184, 178 -> 5884, 179 -> 5884, 180 -> 5884, 181 -> 5884, 182 -> 5884, 183 -> 5884, 184 -> 5884, 185 -> 5884, 186 -> 6035, 187 -> 6189, 188 -> 5790, 189 -> 6189, 190 -> 5184, 191 -> 5184, 192 -> 6189, 193 -> 6189, 194 -> 5184, 195 -> 5184, 196 -> 5470, 197 -> 6252, 198 -> 5247, 199 -> 5247, 200 -> 5274, 201 -> 5274, 202 -> 5304, 203 -> 5304, 204 -> 5304, 205 -> 5304, 206 -> 5304, 207 -> 5304, 208 -> 5304, 209 -> 5304, 210 -> 5304, 211 -> 5304, 212 -> 5304, 213 -> 5304, 214 -> 5304, 215 -> 5304, 216 -> 5304, 217 -> 5304, 218 -> 5304, 219 -> 5304, 220 -> 5439
    //   5184: aload #7
    //   5186: iload #32
    //   5188: invokevirtual ʹﮃ : (I)V
    //   5191: iinc #10, 1
    //   5194: goto -> 6303
    //   5197: iinc #32, -26
    //   5200: aload #7
    //   5202: bipush #21
    //   5204: iload #32
    //   5206: iconst_2
    //   5207: ishr
    //   5208: iadd
    //   5209: iload #32
    //   5211: iconst_3
    //   5212: iand
    //   5213: invokevirtual ᴵʖ : (II)V
    //   5216: iinc #10, 1
    //   5219: goto -> 6303
    //   5222: iinc #32, -59
    //   5225: aload #7
    //   5227: bipush #54
    //   5229: iload #32
    //   5231: iconst_2
    //   5232: ishr
    //   5233: iadd
    //   5234: iload #32
    //   5236: iconst_3
    //   5237: iand
    //   5238: invokevirtual ᴵʖ : (II)V
    //   5241: iinc #10, 1
    //   5244: goto -> 6303
    //   5247: aload #7
    //   5249: iload #32
    //   5251: aload #4
    //   5253: iload #18
    //   5255: aload_1
    //   5256: iload #10
    //   5258: iconst_1
    //   5259: iadd
    //   5260: invokevirtual ᐨẏ : (I)S
    //   5263: iadd
    //   5264: aaload
    //   5265: invokevirtual ᐨẏ : (ILyyds/sniarbtej/ᔪ;)V
    //   5268: iinc #10, 3
    //   5271: goto -> 6303
    //   5274: aload #7
    //   5276: iload #32
    //   5278: iload #9
    //   5280: isub
    //   5281: aload #4
    //   5283: iload #18
    //   5285: aload_1
    //   5286: iload #10
    //   5288: iconst_1
    //   5289: iadd
    //   5290: invokevirtual ﾞл : (I)I
    //   5293: iadd
    //   5294: aaload
    //   5295: invokevirtual ᐨẏ : (ILyyds/sniarbtej/ᔪ;)V
    //   5298: iinc #10, 5
    //   5301: goto -> 6303
    //   5304: iload #32
    //   5306: sipush #218
    //   5309: if_icmpge -> 5320
    //   5312: iload #32
    //   5314: bipush #49
    //   5316: isub
    //   5317: goto -> 5325
    //   5320: iload #32
    //   5322: bipush #20
    //   5324: isub
    //   5325: istore #32
    //   5327: aload #4
    //   5329: iload #18
    //   5331: aload_1
    //   5332: iload #10
    //   5334: iconst_1
    //   5335: iadd
    //   5336: invokevirtual ᴵʖ : (I)I
    //   5339: iadd
    //   5340: aaload
    //   5341: astore #33
    //   5343: iload #32
    //   5345: sipush #167
    //   5348: if_icmpeq -> 5359
    //   5351: iload #32
    //   5353: sipush #168
    //   5356: if_icmpne -> 5374
    //   5359: aload #7
    //   5361: iload #32
    //   5363: bipush #33
    //   5365: iadd
    //   5366: aload #33
    //   5368: invokevirtual ᐨẏ : (ILyyds/sniarbtej/ᔪ;)V
    //   5371: goto -> 5433
    //   5374: iload #32
    //   5376: sipush #167
    //   5379: if_icmpge -> 5393
    //   5382: iload #32
    //   5384: iconst_1
    //   5385: iadd
    //   5386: iconst_1
    //   5387: ixor
    //   5388: iconst_1
    //   5389: isub
    //   5390: goto -> 5397
    //   5393: iload #32
    //   5395: iconst_1
    //   5396: ixor
    //   5397: istore #32
    //   5399: aload_1
    //   5400: iload #18
    //   5402: iconst_3
    //   5403: iadd
    //   5404: aload #4
    //   5406: invokespecial ˊ : (I[Lyyds/sniarbtej/ᔪ;)Lyyds/sniarbtej/ᔪ;
    //   5409: astore #34
    //   5411: aload #7
    //   5413: iload #32
    //   5415: aload #34
    //   5417: invokevirtual ᐨẏ : (ILyyds/sniarbtej/ᔪ;)V
    //   5420: aload #7
    //   5422: sipush #200
    //   5425: aload #33
    //   5427: invokevirtual ᐨẏ : (ILyyds/sniarbtej/ᔪ;)V
    //   5430: iconst_1
    //   5431: istore #30
    //   5433: iinc #10, 3
    //   5436: goto -> 6303
    //   5439: aload #7
    //   5441: sipush #200
    //   5444: aload #4
    //   5446: iload #18
    //   5448: aload_1
    //   5449: iload #10
    //   5451: iconst_1
    //   5452: iadd
    //   5453: invokevirtual ﾞл : (I)I
    //   5456: iadd
    //   5457: aaload
    //   5458: invokevirtual ᐨẏ : (ILyyds/sniarbtej/ᔪ;)V
    //   5461: iconst_1
    //   5462: istore #30
    //   5464: iinc #10, 5
    //   5467: goto -> 6303
    //   5470: aload #20
    //   5472: iload #10
    //   5474: iconst_1
    //   5475: iadd
    //   5476: baload
    //   5477: sipush #255
    //   5480: iand
    //   5481: dup
    //   5482: istore #32
    //   5484: sipush #132
    //   5487: if_icmpne -> 5517
    //   5490: aload #7
    //   5492: aload_1
    //   5493: iload #10
    //   5495: iconst_2
    //   5496: iadd
    //   5497: invokevirtual ᴵʖ : (I)I
    //   5500: aload_1
    //   5501: iload #10
    //   5503: iconst_4
    //   5504: iadd
    //   5505: invokevirtual ᐨẏ : (I)S
    //   5508: invokevirtual ﾞл : (II)V
    //   5511: iinc #10, 6
    //   5514: goto -> 6303
    //   5517: aload #7
    //   5519: iload #32
    //   5521: aload_1
    //   5522: iload #10
    //   5524: iconst_2
    //   5525: iadd
    //   5526: invokevirtual ᴵʖ : (I)I
    //   5529: invokevirtual ᴵʖ : (II)V
    //   5532: iinc #10, 4
    //   5535: goto -> 6303
    //   5538: iload #10
    //   5540: iconst_4
    //   5541: iload #18
    //   5543: iconst_3
    //   5544: iand
    //   5545: isub
    //   5546: iadd
    //   5547: istore #10
    //   5549: aload #4
    //   5551: iload #18
    //   5553: aload_1
    //   5554: iload #10
    //   5556: invokevirtual ﾞл : (I)I
    //   5559: iadd
    //   5560: aaload
    //   5561: astore #33
    //   5563: aload_1
    //   5564: iload #10
    //   5566: iconst_4
    //   5567: iadd
    //   5568: invokevirtual ﾞл : (I)I
    //   5571: istore #34
    //   5573: aload_1
    //   5574: iload #10
    //   5576: bipush #8
    //   5578: iadd
    //   5579: invokevirtual ﾞл : (I)I
    //   5582: istore #35
    //   5584: iinc #10, 12
    //   5587: iload #35
    //   5589: iload #34
    //   5591: isub
    //   5592: iconst_1
    //   5593: iadd
    //   5594: anewarray yyds/sniarbtej/ᔪ
    //   5597: astore #36
    //   5599: iconst_0
    //   5600: istore #37
    //   5602: iload #37
    //   5604: aload #36
    //   5606: arraylength
    //   5607: if_icmpge -> 5636
    //   5610: aload #36
    //   5612: iload #37
    //   5614: aload #4
    //   5616: iload #18
    //   5618: aload_1
    //   5619: iload #10
    //   5621: invokevirtual ﾞл : (I)I
    //   5624: iadd
    //   5625: aaload
    //   5626: aastore
    //   5627: iinc #10, 4
    //   5630: iinc #37, 1
    //   5633: goto -> 5602
    //   5636: aload #7
    //   5638: iload #34
    //   5640: iload #35
    //   5642: aload #33
    //   5644: aload #36
    //   5646: invokevirtual ᐨẏ : (IILyyds/sniarbtej/ᔪ;[Lyyds/sniarbtej/ᔪ;)V
    //   5649: goto -> 6303
    //   5652: iload #10
    //   5654: iconst_4
    //   5655: iload #18
    //   5657: iconst_3
    //   5658: iand
    //   5659: isub
    //   5660: iadd
    //   5661: istore #10
    //   5663: aload #4
    //   5665: iload #18
    //   5667: aload_1
    //   5668: iload #10
    //   5670: invokevirtual ﾞл : (I)I
    //   5673: iadd
    //   5674: aaload
    //   5675: astore #33
    //   5677: aload_1
    //   5678: iload #10
    //   5680: iconst_4
    //   5681: iadd
    //   5682: invokevirtual ﾞл : (I)I
    //   5685: istore #34
    //   5687: iinc #10, 8
    //   5690: iload #34
    //   5692: newarray int
    //   5694: astore #35
    //   5696: iload #34
    //   5698: anewarray yyds/sniarbtej/ᔪ
    //   5701: astore #36
    //   5703: iconst_0
    //   5704: istore #37
    //   5706: iload #37
    //   5708: iload #34
    //   5710: if_icmpge -> 5752
    //   5713: aload #35
    //   5715: iload #37
    //   5717: aload_1
    //   5718: iload #10
    //   5720: invokevirtual ﾞл : (I)I
    //   5723: iastore
    //   5724: aload #36
    //   5726: iload #37
    //   5728: aload #4
    //   5730: iload #18
    //   5732: aload_1
    //   5733: iload #10
    //   5735: iconst_4
    //   5736: iadd
    //   5737: invokevirtual ﾞл : (I)I
    //   5740: iadd
    //   5741: aaload
    //   5742: aastore
    //   5743: iinc #10, 8
    //   5746: iinc #37, 1
    //   5749: goto -> 5706
    //   5752: aload #7
    //   5754: aload #33
    //   5756: aload #35
    //   5758: aload #36
    //   5760: invokevirtual ᐨẏ : (Lyyds/sniarbtej/ᔪ;[I[Lyyds/sniarbtej/ᔪ;)V
    //   5763: goto -> 6303
    //   5766: aload #7
    //   5768: iload #32
    //   5770: aload #20
    //   5772: iload #10
    //   5774: iconst_1
    //   5775: iadd
    //   5776: baload
    //   5777: sipush #255
    //   5780: iand
    //   5781: invokevirtual ᴵʖ : (II)V
    //   5784: iinc #10, 2
    //   5787: goto -> 6303
    //   5790: aload #7
    //   5792: iload #32
    //   5794: aload #20
    //   5796: iload #10
    //   5798: iconst_1
    //   5799: iadd
    //   5800: baload
    //   5801: invokevirtual ˊ : (II)V
    //   5804: iinc #10, 2
    //   5807: goto -> 6303
    //   5810: aload #7
    //   5812: iload #32
    //   5814: aload_1
    //   5815: iload #10
    //   5817: iconst_1
    //   5818: iadd
    //   5819: invokevirtual ᐨẏ : (I)S
    //   5822: invokevirtual ˊ : (II)V
    //   5825: iinc #10, 3
    //   5828: goto -> 6303
    //   5831: aload #7
    //   5833: aload_1
    //   5834: aload #20
    //   5836: iload #10
    //   5838: iconst_1
    //   5839: iadd
    //   5840: baload
    //   5841: sipush #255
    //   5844: iand
    //   5845: aload #23
    //   5847: invokevirtual ᐨẏ : (I[C)Ljava/lang/Object;
    //   5850: invokevirtual ˊ : (Ljava/lang/Object;)V
    //   5853: iinc #10, 2
    //   5856: goto -> 6303
    //   5859: aload #7
    //   5861: aload_1
    //   5862: dup
    //   5863: iload #10
    //   5865: iconst_1
    //   5866: iadd
    //   5867: invokevirtual ᴵʖ : (I)I
    //   5870: aload #23
    //   5872: invokevirtual ᐨẏ : (I[C)Ljava/lang/Object;
    //   5875: invokevirtual ˊ : (Ljava/lang/Object;)V
    //   5878: iinc #10, 3
    //   5881: goto -> 6303
    //   5884: aload_1
    //   5885: getfield ᐨẏ : [I
    //   5888: aload_1
    //   5889: iload #10
    //   5891: iconst_1
    //   5892: iadd
    //   5893: invokevirtual ᴵʖ : (I)I
    //   5896: iaload
    //   5897: istore #33
    //   5899: aload_1
    //   5900: getfield ᐨẏ : [I
    //   5903: aload_1
    //   5904: iload #33
    //   5906: iconst_2
    //   5907: iadd
    //   5908: invokevirtual ᴵʖ : (I)I
    //   5911: iaload
    //   5912: istore #34
    //   5914: aload_1
    //   5915: iload #33
    //   5917: aload #23
    //   5919: astore #72
    //   5921: istore #71
    //   5923: dup
    //   5924: astore #70
    //   5926: iload #71
    //   5928: aload #72
    //   5930: invokespecial ᴵʖ : (I[C)Ljava/lang/String;
    //   5933: astore #35
    //   5935: aload_1
    //   5936: iload #34
    //   5938: aload #23
    //   5940: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   5943: astore #36
    //   5945: aload_1
    //   5946: iload #34
    //   5948: iconst_2
    //   5949: iadd
    //   5950: aload #23
    //   5952: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   5955: astore #37
    //   5957: iload #32
    //   5959: sipush #182
    //   5962: if_icmpge -> 5981
    //   5965: aload #7
    //   5967: iload #32
    //   5969: aload #35
    //   5971: aload #36
    //   5973: aload #37
    //   5975: invokevirtual ᐨẏ : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   5978: goto -> 6015
    //   5981: aload #20
    //   5983: iload #33
    //   5985: iconst_1
    //   5986: isub
    //   5987: baload
    //   5988: bipush #11
    //   5990: if_icmpne -> 5997
    //   5993: iconst_1
    //   5994: goto -> 5998
    //   5997: iconst_0
    //   5998: istore #38
    //   6000: aload #7
    //   6002: iload #32
    //   6004: aload #35
    //   6006: aload #36
    //   6008: aload #37
    //   6010: iload #38
    //   6012: invokevirtual ᐨẏ : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    //   6015: iload #32
    //   6017: sipush #185
    //   6020: if_icmpne -> 6029
    //   6023: iinc #10, 5
    //   6026: goto -> 6303
    //   6029: iinc #10, 3
    //   6032: goto -> 6303
    //   6035: aload_1
    //   6036: getfield ᐨẏ : [I
    //   6039: aload_1
    //   6040: iload #10
    //   6042: iconst_1
    //   6043: iadd
    //   6044: invokevirtual ᴵʖ : (I)I
    //   6047: iaload
    //   6048: istore #33
    //   6050: aload_1
    //   6051: getfield ᐨẏ : [I
    //   6054: aload_1
    //   6055: iload #33
    //   6057: iconst_2
    //   6058: iadd
    //   6059: invokevirtual ᴵʖ : (I)I
    //   6062: iaload
    //   6063: istore #34
    //   6065: aload_1
    //   6066: iload #34
    //   6068: aload #23
    //   6070: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   6073: astore #35
    //   6075: aload_1
    //   6076: iload #34
    //   6078: iconst_2
    //   6079: iadd
    //   6080: aload #23
    //   6082: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   6085: astore #36
    //   6087: aload_1
    //   6088: getfield ˊ : [I
    //   6091: aload_1
    //   6092: iload #33
    //   6094: invokevirtual ᴵʖ : (I)I
    //   6097: iaload
    //   6098: istore #37
    //   6100: aload_1
    //   6101: dup
    //   6102: iload #37
    //   6104: invokevirtual ᴵʖ : (I)I
    //   6107: aload #23
    //   6109: invokevirtual ᐨẏ : (I[C)Ljava/lang/Object;
    //   6112: checkcast yyds/sniarbtej/ʹō
    //   6115: astore #38
    //   6117: aload_1
    //   6118: iload #37
    //   6120: iconst_2
    //   6121: iadd
    //   6122: invokevirtual ᴵʖ : (I)I
    //   6125: anewarray java/lang/Object
    //   6128: astore #64
    //   6130: iinc #37, 4
    //   6133: iconst_0
    //   6134: istore #65
    //   6136: iload #65
    //   6138: aload #64
    //   6140: arraylength
    //   6141: if_icmpge -> 6170
    //   6144: aload #64
    //   6146: iload #65
    //   6148: aload_1
    //   6149: dup
    //   6150: iload #37
    //   6152: invokevirtual ᴵʖ : (I)I
    //   6155: aload #23
    //   6157: invokevirtual ᐨẏ : (I[C)Ljava/lang/Object;
    //   6160: aastore
    //   6161: iinc #37, 2
    //   6164: iinc #65, 1
    //   6167: goto -> 6136
    //   6170: aload #7
    //   6172: aload #35
    //   6174: aload #36
    //   6176: aload #38
    //   6178: aload #64
    //   6180: invokevirtual ᐨẏ : (Ljava/lang/String;Ljava/lang/String;Lyyds/sniarbtej/ʹō;[Ljava/lang/Object;)V
    //   6183: iinc #10, 5
    //   6186: goto -> 6303
    //   6189: aload #7
    //   6191: iload #32
    //   6193: aload_1
    //   6194: iload #10
    //   6196: iconst_1
    //   6197: iadd
    //   6198: aload #23
    //   6200: astore #72
    //   6202: istore #71
    //   6204: dup
    //   6205: astore #70
    //   6207: iload #71
    //   6209: aload #72
    //   6211: invokespecial ᴵʖ : (I[C)Ljava/lang/String;
    //   6214: invokevirtual ᐨẏ : (ILjava/lang/String;)V
    //   6217: iinc #10, 3
    //   6220: goto -> 6303
    //   6223: aload #7
    //   6225: aload #20
    //   6227: iload #10
    //   6229: iconst_1
    //   6230: iadd
    //   6231: baload
    //   6232: sipush #255
    //   6235: iand
    //   6236: aload #20
    //   6238: iload #10
    //   6240: iconst_2
    //   6241: iadd
    //   6242: baload
    //   6243: invokevirtual ﾞл : (II)V
    //   6246: iinc #10, 3
    //   6249: goto -> 6303
    //   6252: aload #7
    //   6254: aload_1
    //   6255: iload #10
    //   6257: iconst_1
    //   6258: iadd
    //   6259: aload #23
    //   6261: astore #72
    //   6263: istore #71
    //   6265: dup
    //   6266: astore #70
    //   6268: iload #71
    //   6270: aload #72
    //   6272: invokespecial ᴵʖ : (I[C)Ljava/lang/String;
    //   6275: aload #20
    //   6277: iload #10
    //   6279: iconst_3
    //   6280: iadd
    //   6281: baload
    //   6282: sipush #255
    //   6285: iand
    //   6286: invokevirtual ˊ : (Ljava/lang/String;I)V
    //   6289: iinc #10, 4
    //   6292: goto -> 6303
    //   6295: new java/lang/AssertionError
    //   6298: dup
    //   6299: invokespecial <init> : ()V
    //   6302: athrow
    //   6303: aload #15
    //   6305: ifnull -> 6400
    //   6308: iload #22
    //   6310: aload #15
    //   6312: arraylength
    //   6313: if_icmpge -> 6400
    //   6316: iload #27
    //   6318: iload #18
    //   6320: if_icmpgt -> 6400
    //   6323: iload #27
    //   6325: iload #18
    //   6327: if_icmpne -> 6384
    //   6330: aload_1
    //   6331: aload #8
    //   6333: aload #15
    //   6335: iload #22
    //   6337: iaload
    //   6338: invokespecial ᐨẏ : (Lyyds/sniarbtej/ʾ;I)I
    //   6341: istore #33
    //   6343: aload_1
    //   6344: iload #33
    //   6346: aload #23
    //   6348: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   6351: astore #34
    //   6353: iinc #33, 2
    //   6356: aload_1
    //   6357: aload #7
    //   6359: aload #8
    //   6361: getfield ιƚ : I
    //   6364: aload #8
    //   6366: getfield ᐨẏ : Lyyds/sniarbtej/ˏɪ;
    //   6369: aload #34
    //   6371: iconst_1
    //   6372: invokevirtual ˊ : (ILyyds/sniarbtej/ˏɪ;Ljava/lang/String;Z)Lyyds/sniarbtej/ᐨẏ;
    //   6375: iload #33
    //   6377: iconst_1
    //   6378: aload #23
    //   6380: invokespecial ᐨẏ : (Lyyds/sniarbtej/ᐨẏ;IZ[C)I
    //   6383: pop
    //   6384: aload_1
    //   6385: aload #15
    //   6387: iinc #22, 1
    //   6390: iload #22
    //   6392: invokespecial ᐨẏ : ([II)I
    //   6395: istore #27
    //   6397: goto -> 6303
    //   6400: aload #16
    //   6402: ifnull -> 6497
    //   6405: iload #28
    //   6407: aload #16
    //   6409: arraylength
    //   6410: if_icmpge -> 6497
    //   6413: iload #29
    //   6415: iload #18
    //   6417: if_icmpgt -> 6497
    //   6420: iload #29
    //   6422: iload #18
    //   6424: if_icmpne -> 6481
    //   6427: aload_1
    //   6428: aload #8
    //   6430: aload #16
    //   6432: iload #28
    //   6434: iaload
    //   6435: invokespecial ᐨẏ : (Lyyds/sniarbtej/ʾ;I)I
    //   6438: istore #33
    //   6440: aload_1
    //   6441: iload #33
    //   6443: aload #23
    //   6445: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   6448: astore #34
    //   6450: iinc #33, 2
    //   6453: aload_1
    //   6454: aload #7
    //   6456: aload #8
    //   6458: getfield ιƚ : I
    //   6461: aload #8
    //   6463: getfield ᐨẏ : Lyyds/sniarbtej/ˏɪ;
    //   6466: aload #34
    //   6468: iconst_0
    //   6469: invokevirtual ˊ : (ILyyds/sniarbtej/ˏɪ;Ljava/lang/String;Z)Lyyds/sniarbtej/ᐨẏ;
    //   6472: iload #33
    //   6474: iconst_1
    //   6475: aload #23
    //   6477: invokespecial ᐨẏ : (Lyyds/sniarbtej/ᐨẏ;IZ[C)I
    //   6480: pop
    //   6481: aload_1
    //   6482: aload #16
    //   6484: iinc #28, 1
    //   6487: iload #28
    //   6489: invokespecial ᐨẏ : ([II)I
    //   6492: istore #29
    //   6494: goto -> 6400
    //   6497: goto -> 4064
    //   6500: aload #4
    //   6502: iload #26
    //   6504: aaload
    //   6505: ifnull -> 6518
    //   6508: aload #7
    //   6510: aload #4
    //   6512: iload #26
    //   6514: aaload
    //   6515: invokevirtual ˊ : (Lyyds/sniarbtej/ᔪ;)V
    //   6518: iload #14
    //   6520: ifeq -> 6792
    //   6523: aload #8
    //   6525: getfield ᕁ : I
    //   6528: iconst_2
    //   6529: iand
    //   6530: ifne -> 6792
    //   6533: aconst_null
    //   6534: astore #18
    //   6536: iload #6
    //   6538: ifeq -> 6619
    //   6541: aload_1
    //   6542: iload #6
    //   6544: invokevirtual ᴵʖ : (I)I
    //   6547: iconst_3
    //   6548: imul
    //   6549: newarray int
    //   6551: astore #18
    //   6553: iload #6
    //   6555: iconst_2
    //   6556: iadd
    //   6557: istore #10
    //   6559: aload #18
    //   6561: arraylength
    //   6562: istore #31
    //   6564: iload #31
    //   6566: ifle -> 6619
    //   6569: aload #18
    //   6571: iinc #31, -1
    //   6574: iload #31
    //   6576: iload #10
    //   6578: bipush #6
    //   6580: iadd
    //   6581: iastore
    //   6582: aload #18
    //   6584: iinc #31, -1
    //   6587: iload #31
    //   6589: aload_1
    //   6590: iload #10
    //   6592: bipush #8
    //   6594: iadd
    //   6595: invokevirtual ᴵʖ : (I)I
    //   6598: iastore
    //   6599: aload #18
    //   6601: iinc #31, -1
    //   6604: iload #31
    //   6606: aload_1
    //   6607: iload #10
    //   6609: invokevirtual ᴵʖ : (I)I
    //   6612: iastore
    //   6613: iinc #10, 10
    //   6616: goto -> 6564
    //   6619: aload_1
    //   6620: iload #14
    //   6622: invokevirtual ᴵʖ : (I)I
    //   6625: istore #31
    //   6627: iload #14
    //   6629: iconst_2
    //   6630: iadd
    //   6631: istore #10
    //   6633: iload #31
    //   6635: iinc #31, -1
    //   6638: ifle -> 6792
    //   6641: aload_1
    //   6642: iload #10
    //   6644: invokevirtual ᴵʖ : (I)I
    //   6647: istore #32
    //   6649: aload_1
    //   6650: iload #10
    //   6652: iconst_2
    //   6653: iadd
    //   6654: invokevirtual ᴵʖ : (I)I
    //   6657: istore #33
    //   6659: aload_1
    //   6660: iload #10
    //   6662: iconst_4
    //   6663: iadd
    //   6664: aload #23
    //   6666: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   6669: astore #34
    //   6671: aload_1
    //   6672: iload #10
    //   6674: bipush #6
    //   6676: iadd
    //   6677: aload #23
    //   6679: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   6682: astore #35
    //   6684: aload_1
    //   6685: iload #10
    //   6687: bipush #8
    //   6689: iadd
    //   6690: invokevirtual ᴵʖ : (I)I
    //   6693: istore #36
    //   6695: iinc #10, 10
    //   6698: aconst_null
    //   6699: astore #37
    //   6701: aload #18
    //   6703: ifnull -> 6763
    //   6706: iconst_0
    //   6707: istore #38
    //   6709: iload #38
    //   6711: aload #18
    //   6713: arraylength
    //   6714: if_icmpge -> 6763
    //   6717: aload #18
    //   6719: iload #38
    //   6721: iaload
    //   6722: iload #32
    //   6724: if_icmpne -> 6757
    //   6727: aload #18
    //   6729: iload #38
    //   6731: iconst_1
    //   6732: iadd
    //   6733: iaload
    //   6734: iload #36
    //   6736: if_icmpne -> 6757
    //   6739: aload_1
    //   6740: aload #18
    //   6742: iload #38
    //   6744: iconst_2
    //   6745: iadd
    //   6746: iaload
    //   6747: aload #23
    //   6749: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   6752: astore #37
    //   6754: goto -> 6763
    //   6757: iinc #38, 3
    //   6760: goto -> 6709
    //   6763: aload #7
    //   6765: aload #34
    //   6767: aload #35
    //   6769: aload #37
    //   6771: aload #4
    //   6773: iload #32
    //   6775: aaload
    //   6776: aload #4
    //   6778: iload #32
    //   6780: iload #33
    //   6782: iadd
    //   6783: aaload
    //   6784: iload #36
    //   6786: invokevirtual ᐨẏ : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyyds/sniarbtej/ᔪ;Lyyds/sniarbtej/ᔪ;I)V
    //   6789: goto -> 6633
    //   6792: aload #15
    //   6794: ifnull -> 6915
    //   6797: aload #15
    //   6799: dup
    //   6800: astore #18
    //   6802: arraylength
    //   6803: istore #31
    //   6805: iconst_0
    //   6806: istore #32
    //   6808: iload #32
    //   6810: iload #31
    //   6812: if_icmpge -> 6915
    //   6815: aload #18
    //   6817: iload #32
    //   6819: iaload
    //   6820: istore #33
    //   6822: aload_1
    //   6823: iload #33
    //   6825: invokevirtual ˊ : (I)I
    //   6828: dup
    //   6829: istore #34
    //   6831: bipush #64
    //   6833: if_icmpeq -> 6843
    //   6836: iload #34
    //   6838: bipush #65
    //   6840: if_icmpne -> 6909
    //   6843: aload_1
    //   6844: aload #8
    //   6846: iload #33
    //   6848: invokespecial ᐨẏ : (Lyyds/sniarbtej/ʾ;I)I
    //   6851: istore #10
    //   6853: aload_1
    //   6854: iload #10
    //   6856: aload #23
    //   6858: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   6861: astore #35
    //   6863: iinc #10, 2
    //   6866: aload_1
    //   6867: aload #7
    //   6869: aload #8
    //   6871: getfield ιƚ : I
    //   6874: aload #8
    //   6876: getfield ᐨẏ : Lyyds/sniarbtej/ˏɪ;
    //   6879: aload #8
    //   6881: getfield ˊ : [Lyyds/sniarbtej/ᔪ;
    //   6884: aload #8
    //   6886: getfield ᴵʖ : [Lyyds/sniarbtej/ᔪ;
    //   6889: aload #8
    //   6891: getfield ﾞл : [I
    //   6894: aload #35
    //   6896: iconst_1
    //   6897: invokevirtual ᐨẏ : (ILyyds/sniarbtej/ˏɪ;[Lyyds/sniarbtej/ᔪ;[Lyyds/sniarbtej/ᔪ;[ILjava/lang/String;Z)Lyyds/sniarbtej/ᐨẏ;
    //   6900: iload #10
    //   6902: iconst_1
    //   6903: aload #23
    //   6905: invokespecial ᐨẏ : (Lyyds/sniarbtej/ᐨẏ;IZ[C)I
    //   6908: pop
    //   6909: iinc #32, 1
    //   6912: goto -> 6808
    //   6915: aload #16
    //   6917: ifnull -> 7038
    //   6920: aload #16
    //   6922: dup
    //   6923: astore #18
    //   6925: arraylength
    //   6926: istore #31
    //   6928: iconst_0
    //   6929: istore #32
    //   6931: iload #32
    //   6933: iload #31
    //   6935: if_icmpge -> 7038
    //   6938: aload #18
    //   6940: iload #32
    //   6942: iaload
    //   6943: istore #33
    //   6945: aload_1
    //   6946: iload #33
    //   6948: invokevirtual ˊ : (I)I
    //   6951: dup
    //   6952: istore #34
    //   6954: bipush #64
    //   6956: if_icmpeq -> 6966
    //   6959: iload #34
    //   6961: bipush #65
    //   6963: if_icmpne -> 7032
    //   6966: aload_1
    //   6967: aload #8
    //   6969: iload #33
    //   6971: invokespecial ᐨẏ : (Lyyds/sniarbtej/ʾ;I)I
    //   6974: istore #10
    //   6976: aload_1
    //   6977: iload #10
    //   6979: aload #23
    //   6981: invokevirtual ᐨẏ : (I[C)Ljava/lang/String;
    //   6984: astore #35
    //   6986: iinc #10, 2
    //   6989: aload_1
    //   6990: aload #7
    //   6992: aload #8
    //   6994: getfield ιƚ : I
    //   6997: aload #8
    //   6999: getfield ᐨẏ : Lyyds/sniarbtej/ˏɪ;
    //   7002: aload #8
    //   7004: getfield ˊ : [Lyyds/sniarbtej/ᔪ;
    //   7007: aload #8
    //   7009: getfield ᴵʖ : [Lyyds/sniarbtej/ᔪ;
    //   7012: aload #8
    //   7014: getfield ﾞл : [I
    //   7017: aload #35
    //   7019: iconst_0
    //   7020: invokevirtual ᐨẏ : (ILyyds/sniarbtej/ˏɪ;[Lyyds/sniarbtej/ᔪ;[Lyyds/sniarbtej/ᔪ;[ILjava/lang/String;Z)Lyyds/sniarbtej/ᐨẏ;
    //   7023: iload #10
    //   7025: iconst_1
    //   7026: aload #23
    //   7028: invokespecial ᐨẏ : (Lyyds/sniarbtej/ᐨẏ;IZ[C)I
    //   7031: pop
    //   7032: iinc #32, 1
    //   7035: goto -> 6931
    //   7038: aload #17
    //   7040: ifnull -> 7070
    //   7043: aload #17
    //   7045: getfield ᐨẏ : Lyyds/sniarbtej/ᴵʖ;
    //   7048: astore #18
    //   7050: aload #17
    //   7052: aconst_null
    //   7053: putfield ᐨẏ : Lyyds/sniarbtej/ᴵʖ;
    //   7056: aload #7
    //   7058: aload #17
    //   7060: invokevirtual ᴵʖ : (Lyyds/sniarbtej/ᴵʖ;)V
    //   7063: aload #18
    //   7065: astore #17
    //   7067: goto -> 7038
    //   7070: aload #7
    //   7072: iload #24
    //   7074: iload #25
    //   7076: invokevirtual ʿᵉ : (II)V
    //   7079: aload #21
    //   7081: invokevirtual ᐨẏ : ()V
    //   7084: iload #5
    //   7086: ireturn
  }
  
  private void ᐨẏ(ˉｓ paramˉｓ, ʾ paramʾ, int paramInt) {
    int i = paramInt;
    byte[] arrayOfByte = this.ﾞл;
    ˏɪ ˏɪ1 = paramʾ.ᐨẏ;
    int j = ᴵʖ(i);
    int k = ᴵʖ(i + 2);
    int m = ﾞл(i + 4);
    i += 8;
    if (m > this.ﾞл.length - i)
      throw new IllegalArgumentException(); 
    int n = i;
    int i1 = i + m;
    ˏɪ ˏɪ2 = paramʾ.ᐨẏ = (ˏɪ)new ᔪ[m + 1];
    while (i < i1) {
      int i11;
      int i12;
      int i9 = i - n;
      int i10;
      switch (i10 = arrayOfByte[i] & 0xFF) {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
        case 26:
        case 27:
        case 28:
        case 29:
        case 30:
        case 31:
        case 32:
        case 33:
        case 34:
        case 35:
        case 36:
        case 37:
        case 38:
        case 39:
        case 40:
        case 41:
        case 42:
        case 43:
        case 44:
        case 45:
        case 46:
        case 47:
        case 48:
        case 49:
        case 50:
        case 51:
        case 52:
        case 53:
        case 59:
        case 60:
        case 61:
        case 62:
        case 63:
        case 64:
        case 65:
        case 66:
        case 67:
        case 68:
        case 69:
        case 70:
        case 71:
        case 72:
        case 73:
        case 74:
        case 75:
        case 76:
        case 77:
        case 78:
        case 79:
        case 80:
        case 81:
        case 82:
        case 83:
        case 84:
        case 85:
        case 86:
        case 87:
        case 88:
        case 89:
        case 90:
        case 91:
        case 92:
        case 93:
        case 94:
        case 95:
        case 96:
        case 97:
        case 98:
        case 99:
        case 100:
        case 101:
        case 102:
        case 103:
        case 104:
        case 105:
        case 106:
        case 107:
        case 108:
        case 109:
        case 110:
        case 111:
        case 112:
        case 113:
        case 114:
        case 115:
        case 116:
        case 117:
        case 118:
        case 119:
        case 120:
        case 121:
        case 122:
        case 123:
        case 124:
        case 125:
        case 126:
        case 127:
        case 128:
        case 129:
        case 130:
        case 131:
        case 133:
        case 134:
        case 135:
        case 136:
        case 137:
        case 138:
        case 139:
        case 140:
        case 141:
        case 142:
        case 143:
        case 144:
        case 145:
        case 146:
        case 147:
        case 148:
        case 149:
        case 150:
        case 151:
        case 152:
        case 172:
        case 173:
        case 174:
        case 175:
        case 176:
        case 177:
        case 190:
        case 191:
        case 194:
        case 195:
          i++;
          continue;
        case 153:
        case 154:
        case 155:
        case 156:
        case 157:
        case 158:
        case 159:
        case 160:
        case 161:
        case 162:
        case 163:
        case 164:
        case 165:
        case 166:
        case 167:
        case 168:
        case 198:
        case 199:
          ˊ(i9 + ᐨẏ(i + 1), (ᔪ[])ˏɪ2);
          i += 3;
          continue;
        case 202:
        case 203:
        case 204:
        case 205:
        case 206:
        case 207:
        case 208:
        case 209:
        case 210:
        case 211:
        case 212:
        case 213:
        case 214:
        case 215:
        case 216:
        case 217:
        case 218:
        case 219:
          ˊ(i9 + ᴵʖ(i + 1), (ᔪ[])ˏɪ2);
          i += 3;
          continue;
        case 200:
        case 201:
        case 220:
          ˊ(i9 + ﾞл(i + 1), (ᔪ[])ˏɪ2);
          i += 5;
          continue;
        case 196:
          switch (arrayOfByte[i + 1] & 0xFF) {
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 169:
              i += 4;
              continue;
            case 132:
              i += 6;
              continue;
          } 
          throw new IllegalArgumentException();
        case 170:
          i += 4 - (i9 & 0x3);
          ˊ(i9 + ﾞл(i), (ᔪ[])ˏɪ2);
          i11 = ﾞл(i + 8) - ﾞл(i + 4) + 1;
          for (i += 12; i11-- > 0; i += 4)
            ˊ(i9 + ﾞл(i), (ᔪ[])ˏɪ2); 
          continue;
        case 171:
          i += 4 - (i9 & 0x3);
          ˊ(i9 + ﾞл(i), (ᔪ[])ˏɪ2);
          i12 = ﾞл(i + 4);
          for (i += 8; i12-- > 0; i += 8)
            ˊ(i9 + ﾞл(i + 4), (ᔪ[])ˏɪ2); 
          continue;
        case 16:
        case 18:
        case 21:
        case 22:
        case 23:
        case 24:
        case 25:
        case 54:
        case 55:
        case 56:
        case 57:
        case 58:
        case 169:
        case 188:
          i += 2;
          continue;
        case 17:
        case 19:
        case 20:
        case 132:
        case 178:
        case 179:
        case 180:
        case 181:
        case 182:
        case 183:
        case 184:
        case 187:
        case 189:
        case 192:
        case 193:
          i += 3;
          continue;
        case 185:
        case 186:
          i += 5;
          continue;
        case 197:
          i += 4;
          continue;
      } 
      throw new IllegalArgumentException();
    } 
    int i2 = ᴵʖ(i);
    i += 2;
    while (i2-- > 0) {
      ᔪ ᔪ1 = ˊ(ᴵʖ(i), (ᔪ[])ˏɪ2);
      ᔪ ᔪ2 = ˊ(ᴵʖ(i + 2), (ᔪ[])ˏɪ2);
      ᔪ ᔪ3 = ˊ(ᴵʖ(i + 4), (ᔪ[])ˏɪ2);
      String str = ᐨẏ(this.ᐨẏ[ᴵʖ(i + 6)], (char[])ˏɪ1);
      i += 8;
      paramˉｓ.ᐨẏ(ᔪ1, ᔪ2, ᔪ3, str);
    } 
    int i3 = 0;
    int i4 = 0;
    boolean bool1 = true;
    int i5 = 0;
    i2 = 0;
    int[] arrayOfInt1 = null;
    int[] arrayOfInt2 = null;
    ᴵʖ ᴵʖ = null;
    int i6 = ᴵʖ(i);
    for (i += 2; i6-- > 0; i += i9) {
      String str = ᐨẏ(i, (char[])ˏɪ1);
      int i9 = ﾞл(i + 2);
      i += 6;
      "蛲榘凧ị惃繟㵈냳쓞?Ꮦﲐ圚⣃".toCharArray()[3] = (char)("蛲榘凧ị惃繟㵈냳쓞?Ꮦﲐ圚⣃".toCharArray()[3] ^ 0x4AB4);
      if (ˏȓ$ᴵЃ.E("蛲榘凧ị惃繟㵈냳쓞?Ꮦﲐ圚⣃".toCharArray(), (short)27312, (short)2, (short)3).equals(str)) {
        if ((paramʾ.ᕁ & 0x2) == 0) {
          i5 = i;
          int i10 = i;
          int i11 = ᴵʖ(i10);
          for (i10 += 2; i11-- > 0; i10 += 10) {
            int i12 = ᴵʖ(i10);
            ᐨẏ(i12, (ᔪ[])ˏɪ2);
            int i13 = ᴵʖ(i10 + 2);
            ᐨẏ(i12 + i13, (ᔪ[])ˏɪ2);
          } 
        } 
      } else {
        "雞먵?蹋䂌?뢷龈亟촉줝杌㏂츛菅ﲬ匯⑉᷾댦൥".toCharArray()[4] = (char)("雞먵?蹋䂌?뢷龈亟촉줝杌㏂츛菅ﲬ匯⑉᷾댦൥".toCharArray()[4] ^ 0x7B19);
        if (ˏȓ$ᴵЃ.E("雞먵?蹋䂌?뢷龈亟촉줝杌㏂츛菅ﲬ匯⑉᷾댦൥".toCharArray(), (short)17864, (short)3, (short)3).equals(str)) {
          i2 = i;
        } else {
          "襗흨㩒敥虬괪怃?ᅽ舥㩔霖嘐灷".toCharArray()[3] = (char)("襗흨㩒敥虬괪怃?ᅽ舥㩔霖嘐灷".toCharArray()[3] ^ 0x435F);
          if (ˏȓ$ᴵЃ.E("襗흨㩒敥虬괪怃?ᅽ舥㩔霖嘐灷".toCharArray(), (short)15276, (short)4, (short)2).equals(str)) {
            if ((paramʾ.ᕁ & 0x2) == 0) {
              int i10 = i;
              int i11 = ᴵʖ(i10);
              i10 += 2;
              while (i11-- > 0) {
                int i12 = ᴵʖ(i10);
                int i13 = ᴵʖ(i10 + 2);
                i10 += 4;
                ᐨẏ(i12, (ᔪ[])ˏɪ2);
                ˏɪ2[i12].ʿᵉ(i13);
              } 
            } 
          } else {
            "尚?Ꝛ⩵뮚晨Ꜫ귫?⍃憜ꭤ象膽Ꝇ힁ἱ?굺♐⧜驠⻕眯寃㧰".toCharArray()[22] = (char)("尚?Ꝛ⩵뮚晨Ꜫ귫?⍃憜ꭤ象膽Ꝇ힁ἱ?굺♐⧜驠⻕眯寃㧰".toCharArray()[22] ^ 0xFAE);
            if (ˏȓ$ᴵЃ.E("尚?Ꝛ⩵뮚晨Ꜫ귫?⍃憜ꭤ象膽Ꝇ힁ἱ?굺♐⧜驠⻕眯寃㧰".toCharArray(), (short)14250, (short)2, (short)5).equals(str)) {
              arrayOfInt1 = ᐨẏ(paramˉｓ, paramʾ, i, true);
            } else {
              "痱?䒚읹﷥妈썜꼏퇰晆ꮂ鋜⻃㛲᪢矦粄賡ㅜ䪂꽘Ꮨ壉쌨㲝栕냣遨沚稆".toCharArray()[0] = (char)("痱?䒚읹﷥妈썜꼏퇰晆ꮂ鋜⻃㛲᪢矦粄賡ㅜ䪂꽘Ꮨ壉쌨㲝栕냣遨沚稆".toCharArray()[0] ^ 0x1BF1);
              if (ˏȓ$ᴵЃ.E("痱?䒚읹﷥妈썜꼏퇰晆ꮂ鋜⻃㛲᪢矦粄賡ㅜ䪂꽘Ꮨ壉쌨㲝栕냣遨沚稆".toCharArray(), (short)23212, (short)2, (short)3).equals(str)) {
                arrayOfInt2 = ᐨẏ(paramˉｓ, paramʾ, i, false);
              } else {
                " 휼㥨텴搁ꆆℊ豸朕圖䉒梢".toCharArray()[11] = (char)(" 휼㥨텴搁ꆆℊ豸朕圖䉒梢".toCharArray()[11] ^ 0x4450);
                if (ˏȓ$ᴵЃ.E(" 휼㥨텴搁ꆆℊ豸朕圖䉒梢".toCharArray(), (short)21722, (short)0, (short)3).equals(str)) {
                  if ((paramʾ.ᕁ & 0x4) == 0) {
                    i3 = i + 2;
                    i4 = i + i9;
                  } 
                } else {
                  "먁Ἰ愇谣絕醿䆽埥᰻".toCharArray()[7] = (char)("먁Ἰ愇谣絕醿䆽埥᰻".toCharArray()[7] ^ 0x119B);
                  if (ˏȓ$ᴵЃ.E("먁Ἰ愇谣絕醿䆽埥᰻".toCharArray(), (short)20881, (short)3, (short)4).equals(str)) {
                    if ((paramʾ.ᕁ & 0x4) == 0) {
                      i3 = i + 2;
                      i4 = i + i9;
                      bool1 = false;
                    } 
                  } else {
                    ᴵʖ ᴵʖ1;
                    (ᴵʖ1 = ᐨẏ((ᴵʖ[])paramʾ.ˊ, str, i, i9, (char[])ˏɪ1, paramInt, (ᔪ[])ˏɪ2)).ᐨẏ = ᴵʖ;
                    ᴵʖ = ᴵʖ1;
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
    } 
    boolean bool2 = ((paramʾ.ᕁ & 0x8) != 0) ? true : false;
    if (i3 != 0) {
      paramʾ.ʽו = -1;
      paramʾ.ﹳه = 0;
      paramʾ.ᐧǏ = 0;
      paramʾ.ιՆ = 0;
      paramʾ.ˊ = new Object[k];
      paramʾ.וּ = 0;
      paramʾ.ᴵʖ = new Object[j];
      if (bool2)
        ᐨẏ(paramʾ); 
      for (int i9 = i3; i9 < i4 - 2; i9++) {
        int i10;
        if (arrayOfByte[i9] == 8 && (i10 = ᴵʖ(i9 + 1)) >= 0 && i10 < m && (arrayOfByte[n + i10] & 0xFF) == 187)
          ˊ(i10, (ᔪ[])ˏɪ2); 
      } 
    } 
    if (bool2 && (paramʾ.ᕁ & 0x100) != 0)
      paramˉｓ.ᐨẏ(-1, k, (Object[])null, 0, (Object[])null); 
    byte b1 = 0;
    int i7 = ᐨẏ(arrayOfInt1, 0);
    byte b2 = 0;
    int i8 = ᐨẏ(arrayOfInt2, 0);
    boolean bool3 = false;
    paramInt = ((paramʾ.ᕁ & 0x100) == 0) ? 33 : 0;
    i = n;
    while (i < i1) {
      ʹﮃ ʹﮃ2;
      Object[] arrayOfObject;
      ʹﮃ ʹﮃ1;
      ˏɪ ˏɪ4;
      ʾܪ ʾܪ1;
      int i10;
      ʾܪ ʾܪ2;
      int i12;
      int[] arrayOfInt;
      ʾܪ ʾܪ3;
      String str1;
      int i11;
      ᔪ[] arrayOfᔪ;
      ˏɪ ˏɪ6;
      String str2;
      ˏɪ ˏɪ5;
      byte b;
      String str3;
      int i13;
      ʹō ʹō;
      i6 = i - n;
      ˏɪ ˏɪ3;
      if ((ˏɪ3 = ˏɪ2[i6]) != null)
        ˏɪ3.ᐨẏ(paramˉｓ, ((paramʾ.ᕁ & 0x2) == 0)); 
      while (i3 != 0 && (paramʾ.ʽו == i6 || paramʾ.ʽו == -1)) {
        if (paramʾ.ʽו != -1) {
          if (!bool1 || bool2) {
            paramˉｓ.ᐨẏ(-1, paramʾ.ᐧǏ, paramʾ.ˊ, paramʾ.וּ, paramʾ.ᴵʖ);
          } else {
            paramˉｓ.ᐨẏ(paramʾ.ﹳه, paramʾ.ιՆ, paramʾ.ˊ, paramʾ.וּ, paramʾ.ᴵʖ);
          } 
          bool3 = false;
        } 
        if (i3 < i4) {
          i3 = ᐨẏ(i3, bool1, bool2, paramʾ);
          continue;
        } 
        i3 = 0;
      } 
      if (bool3) {
        if ((paramʾ.ᕁ & 0x8) != 0)
          paramˉｓ.ᐨẏ(256, 0, (Object[])null, 0, (Object[])null); 
        bool3 = false;
      } 
      int i9;
      switch (i9 = arrayOfByte[i] & 0xFF) {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
        case 46:
        case 47:
        case 48:
        case 49:
        case 50:
        case 51:
        case 52:
        case 53:
        case 79:
        case 80:
        case 81:
        case 82:
        case 83:
        case 84:
        case 85:
        case 86:
        case 87:
        case 88:
        case 89:
        case 90:
        case 91:
        case 92:
        case 93:
        case 94:
        case 95:
        case 96:
        case 97:
        case 98:
        case 99:
        case 100:
        case 101:
        case 102:
        case 103:
        case 104:
        case 105:
        case 106:
        case 107:
        case 108:
        case 109:
        case 110:
        case 111:
        case 112:
        case 113:
        case 114:
        case 115:
        case 116:
        case 117:
        case 118:
        case 119:
        case 120:
        case 121:
        case 122:
        case 123:
        case 124:
        case 125:
        case 126:
        case 127:
        case 128:
        case 129:
        case 130:
        case 131:
        case 133:
        case 134:
        case 135:
        case 136:
        case 137:
        case 138:
        case 139:
        case 140:
        case 141:
        case 142:
        case 143:
        case 144:
        case 145:
        case 146:
        case 147:
        case 148:
        case 149:
        case 150:
        case 151:
        case 152:
        case 172:
        case 173:
        case 174:
        case 175:
        case 176:
        case 177:
        case 190:
        case 191:
        case 194:
        case 195:
          paramˉｓ.ʹﮃ(i9);
          i++;
          break;
        case 26:
        case 27:
        case 28:
        case 29:
        case 30:
        case 31:
        case 32:
        case 33:
        case 34:
        case 35:
        case 36:
        case 37:
        case 38:
        case 39:
        case 40:
        case 41:
        case 42:
        case 43:
        case 44:
        case 45:
          i9 -= 26;
          paramˉｓ.ᴵʖ(21 + (i9 >> 2), i9 & 0x3);
          i++;
          break;
        case 59:
        case 60:
        case 61:
        case 62:
        case 63:
        case 64:
        case 65:
        case 66:
        case 67:
        case 68:
        case 69:
        case 70:
        case 71:
        case 72:
        case 73:
        case 74:
        case 75:
        case 76:
        case 77:
        case 78:
          i9 -= 59;
          paramˉｓ.ᴵʖ(54 + (i9 >> 2), i9 & 0x3);
          i++;
          break;
        case 153:
        case 154:
        case 155:
        case 156:
        case 157:
        case 158:
        case 159:
        case 160:
        case 161:
        case 162:
        case 163:
        case 164:
        case 165:
        case 166:
        case 167:
        case 168:
        case 198:
        case 199:
          paramˉｓ.ᐨẏ(i9, (ᔪ)ˏɪ2[i6 + ᐨẏ(i + 1)]);
          i += 3;
          break;
        case 200:
        case 201:
          paramˉｓ.ᐨẏ(i9 - paramInt, (ᔪ)ˏɪ2[i6 + ﾞл(i + 1)]);
          i += 5;
          break;
        case 202:
        case 203:
        case 204:
        case 205:
        case 206:
        case 207:
        case 208:
        case 209:
        case 210:
        case 211:
        case 212:
        case 213:
        case 214:
        case 215:
        case 216:
        case 217:
        case 218:
        case 219:
          i9 = (i9 < 218) ? (i9 - 49) : (i9 - 20);
          ˏɪ4 = ˏɪ2[i6 + ᴵʖ(i + 1)];
          if (i9 == 167 || i9 == 168) {
            paramˉｓ.ᐨẏ(i9 + 33, (ᔪ)ˏɪ4);
          } else {
            i9 = (i9 < 167) ? ((i9 + 1 ^ 0x1) - 1) : (i9 ^ 0x1);
            ᔪ ᔪ = ˊ(i6 + 3, (ᔪ[])ˏɪ2);
            paramˉｓ.ᐨẏ(i9, ᔪ);
            paramˉｓ.ᐨẏ(200, (ᔪ)ˏɪ4);
            bool3 = true;
          } 
          i += 3;
          break;
        case 220:
          paramˉｓ.ᐨẏ(200, (ᔪ)ˏɪ2[i6 + ﾞл(i + 1)]);
          bool3 = true;
          i += 5;
          break;
        case 196:
          if ((i9 = arrayOfByte[i + 1] & 0xFF) == 132) {
            paramˉｓ.ﾞл(ᴵʖ(i + 2), ᐨẏ(i + 4));
            i += 6;
            break;
          } 
          paramˉｓ.ᴵʖ(i9, ᴵʖ(i + 2));
          i += 4;
          break;
        case 170:
          i += 4 - (i6 & 0x3);
          ˏɪ4 = ˏɪ2[i6 + ﾞл(i)];
          i10 = ﾞл(i + 4);
          i12 = ﾞл(i + 8);
          i += 12;
          arrayOfᔪ = new ᔪ[i12 - i10 + 1];
          for (b = 0; b < arrayOfᔪ.length; b++) {
            arrayOfᔪ[b] = (ᔪ)ˏɪ2[i6 + ﾞл(i)];
            i += 4;
          } 
          paramˉｓ.ᐨẏ(i10, i12, (ᔪ)ˏɪ4, arrayOfᔪ);
          break;
        case 171:
          i += 4 - (i6 & 0x3);
          ˏɪ4 = ˏɪ2[i6 + ﾞл(i)];
          i10 = ﾞл(i + 4);
          i += 8;
          arrayOfInt = new int[i10];
          arrayOfᔪ = new ᔪ[i10];
          for (b = 0; b < i10; b++) {
            arrayOfInt[b] = ﾞл(i);
            arrayOfᔪ[b] = (ᔪ)ˏɪ2[i6 + ﾞл(i + 4)];
            i += 8;
          } 
          paramˉｓ.ᐨẏ((ᔪ)ˏɪ4, arrayOfInt, arrayOfᔪ);
          break;
        case 21:
        case 22:
        case 23:
        case 24:
        case 25:
        case 54:
        case 55:
        case 56:
        case 57:
        case 58:
        case 169:
          paramˉｓ.ᴵʖ(i9, arrayOfByte[i + 1] & 0xFF);
          i += 2;
          break;
        case 16:
        case 188:
          paramˉｓ.ˊ(i9, arrayOfByte[i + 1]);
          i += 2;
          break;
        case 17:
          paramˉｓ.ˊ(i9, ᐨẏ(i + 1));
          i += 3;
          break;
        case 18:
          paramˉｓ.ˊ(ᐨẏ(arrayOfByte[i + 1] & 0xFF, (char[])ˏɪ1));
          i += 2;
          break;
        case 19:
        case 20:
          paramˉｓ.ˊ(ᐨẏ(ᴵʖ(i + 1), (char[])ˏɪ1));
          i += 3;
          break;
        case 178:
        case 179:
        case 180:
        case 181:
        case 182:
        case 183:
        case 184:
        case 185:
          ʾܪ1 = this.ᐨẏ[ᴵʖ(i + 1)];
          ʾܪ2 = this.ᐨẏ[ᴵʖ(ʾܪ1 + 2)];
          ˏɪ6 = ˏɪ1;
          ʾܪ3 = ʾܪ1;
          str1 = (ʹﮃ2 = this).ᴵʖ(ʾܪ3, (char[])ˏɪ6);
          str2 = ᐨẏ(ʾܪ2, (char[])ˏɪ1);
          str3 = ᐨẏ(ʾܪ2 + 2, (char[])ˏɪ1);
          if (i9 < 182) {
            paramˉｓ.ᐨẏ(i9, str1, str2, str3);
          } else {
            boolean bool = (arrayOfByte[ʾܪ1 - 1] == 11) ? true : false;
            paramˉｓ.ᐨẏ(i9, str1, str2, str3, bool);
          } 
          if (i9 == 185) {
            i += 5;
            break;
          } 
          i += 3;
          break;
        case 186:
          ʾܪ1 = this.ᐨẏ[ᴵʖ(i + 1)];
          ʾܪ2 = this.ᐨẏ[ᴵʖ(ʾܪ1 + 2)];
          str1 = ᐨẏ(ʾܪ2, (char[])ˏɪ1);
          str2 = ᐨẏ(ʾܪ2 + 2, (char[])ˏɪ1);
          i13 = this.ˊ[ᴵʖ(ʾܪ1)];
          ʹō = (ʹō)ᐨẏ(ᴵʖ(i13), (char[])ˏɪ1);
          arrayOfObject = new Object[ᴵʖ(i13 + 2)];
          i13 += 4;
          for (i9 = 0; i9 < arrayOfObject.length; i9++) {
            arrayOfObject[i9] = ᐨẏ(ᴵʖ(i13), (char[])ˏɪ1);
            i13 += 2;
          } 
          paramˉｓ.ᐨẏ(str1, str2, ʹō, arrayOfObject);
          i += 5;
          break;
        case 187:
        case 189:
        case 192:
        case 193:
          ˏɪ5 = ˏɪ1;
          i11 = i + 1;
          paramˉｓ.ᐨẏ(i9, (ʹﮃ1 = this).ᴵʖ(i11, (char[])ˏɪ5));
          i += 3;
          break;
        case 132:
          paramˉｓ.ﾞл(arrayOfByte[i + 1] & 0xFF, arrayOfByte[i + 2]);
          i += 3;
          break;
        case 197:
          ˏɪ5 = ˏɪ1;
          i11 = i + 1;
          paramˉｓ.ˊ((ʹﮃ1 = this).ᴵʖ(i11, (char[])ˏɪ5), arrayOfByte[i + 3] & 0xFF);
          i += 4;
          break;
        default:
          throw new AssertionError();
      } 
      while (arrayOfInt1 != null && b1 < arrayOfInt1.length && i7 <= i6) {
        if (i7 == i6) {
          int i14 = ᐨẏ(paramʾ, arrayOfInt1[b1]);
          String str = ᐨẏ(i14, (char[])ˏɪ1);
          i14 += 2;
          ᐨẏ(paramˉｓ.ˊ(paramʾ.ιƚ, paramʾ.ᐨẏ, str, true), i14, true, (char[])ˏɪ1);
        } 
        i7 = ᐨẏ(arrayOfInt1, ++b1);
      } 
      while (arrayOfInt2 != null && b2 < arrayOfInt2.length && i8 <= i6) {
        if (i8 == i6) {
          int i14 = ᐨẏ(paramʾ, arrayOfInt2[b2]);
          String str = ᐨẏ(i14, (char[])ˏɪ1);
          i14 += 2;
          ᐨẏ(paramˉｓ.ˊ(paramʾ.ιƚ, paramʾ.ᐨẏ, str, false), i14, true, (char[])ˏɪ1);
        } 
        i8 = ᐨẏ(arrayOfInt2, ++b2);
      } 
    } 
    if (ˏɪ2[m] != null)
      paramˉｓ.ˊ((ᔪ)ˏɪ2[m]); 
    if (i5 != 0 && (paramʾ.ᕁ & 0x2) == 0) {
      int[] arrayOfInt = null;
      if (i2 != 0) {
        arrayOfInt = new int[ᴵʖ(i2) * 3];
        i = i2 + 2;
        int i10 = arrayOfInt.length;
        while (i10 > 0) {
          arrayOfInt[--i10] = i + 6;
          arrayOfInt[--i10] = ᴵʖ(i + 8);
          arrayOfInt[--i10] = ᴵʖ(i);
          i += 10;
        } 
      } 
      int i9 = ᴵʖ(i5);
      i = i5 + 2;
      while (i9-- > 0) {
        int i10 = ᴵʖ(i);
        int i11 = ᴵʖ(i + 2);
        String str1 = ᐨẏ(i + 4, (char[])ˏɪ1);
        String str2 = ᐨẏ(i + 6, (char[])ˏɪ1);
        int i12 = ᴵʖ(i + 8);
        i += 10;
        String str3 = null;
        if (arrayOfInt != null)
          for (byte b = 0; b < arrayOfInt.length; b += 3) {
            if (arrayOfInt[b] == i10 && arrayOfInt[b + 1] == i12) {
              str3 = ᐨẏ(arrayOfInt[b + 2], (char[])ˏɪ1);
              break;
            } 
          }  
        paramˉｓ.ᐨẏ(str1, str2, str3, (ᔪ)ˏɪ2[i10], (ᔪ)ˏɪ2[i10 + i11], i12);
      } 
    } 
    if (arrayOfInt1 != null) {
      int[] arrayOfInt;
      int i9 = (arrayOfInt = arrayOfInt1).length;
      for (byte b = 0; b < i9; b++) {
        int i10 = arrayOfInt[b];
        int i11;
        if ((i11 = ˊ(i10)) == 64 || i11 == 65) {
          i = ᐨẏ(paramʾ, i10);
          String str = ᐨẏ(i, (char[])ˏɪ1);
          i += 2;
          ᐨẏ(paramˉｓ.ᐨẏ(paramʾ.ιƚ, paramʾ.ᐨẏ, (ᔪ[])paramʾ.ˊ, (ᔪ[])paramʾ.ᴵʖ, paramʾ.ﾞл, str, true), i, true, (char[])ˏɪ1);
        } 
      } 
    } 
    if (arrayOfInt2 != null) {
      int[] arrayOfInt;
      int i9 = (arrayOfInt = arrayOfInt2).length;
      for (byte b = 0; b < i9; b++) {
        int i10 = arrayOfInt[b];
        int i11;
        if ((i11 = ˊ(i10)) == 64 || i11 == 65) {
          i = ᐨẏ(paramʾ, i10);
          String str = ᐨẏ(i, (char[])ˏɪ1);
          i += 2;
          ᐨẏ(paramˉｓ.ᐨẏ(paramʾ.ιƚ, paramʾ.ᐨẏ, (ᔪ[])paramʾ.ˊ, (ᔪ[])paramʾ.ᴵʖ, paramʾ.ﾞл, str, false), i, true, (char[])ˏɪ1);
        } 
      } 
    } 
    while (ᴵʖ != null) {
      ᴵʖ ᴵʖ1 = ᴵʖ.ᐨẏ;
      ᴵʖ.ᐨẏ = null;
      paramˉｓ.ᴵʖ(ᴵʖ);
      ᴵʖ = ᴵʖ1;
    } 
    paramˉｓ.ʿᵉ(j, k);
  }
  
  private static void ˊ() {}
  
  private static ᔪ ᐨẏ(int paramInt, ᔪ[] paramArrayOfᔪ) {
    if (paramArrayOfᔪ[paramInt] == null)
      paramArrayOfᔪ[paramInt] = new ᔪ(); 
    return paramArrayOfᔪ[paramInt];
  }
  
  private ᔪ ˊ(int paramInt, ᔪ[] paramArrayOfᔪ) {
    ᔪ ᔪ1;
    (ᔪ1 = ᐨẏ(paramInt, paramArrayOfᔪ)).ᴵʖ = (short)((ᔪ1 = ᐨẏ(paramInt, paramArrayOfᔪ)).ᴵʖ & 0xFFFFFFFE);
    return ᔪ1;
  }
  
  private void ᐨẏ(int paramInt, ᔪ[] paramArrayOfᔪ) {
    if (paramArrayOfᔪ[paramInt] == null)
      (ᐨẏ(paramInt, paramArrayOfᔪ)).ᴵʖ = (short)((ᐨẏ(paramInt, paramArrayOfᔪ)).ᴵʖ | 0x1); 
  }
  
  private int[] ᐨẏ(ˉｓ paramˉｓ, ʾ paramʾ, int paramInt, boolean paramBoolean) {
    ˏɪ ˏɪ = paramʾ.ᐨẏ;
    paramInt = paramInt;
    int[] arrayOfInt = new int[ᴵʖ(paramInt)];
    paramInt += 2;
    for (byte b = 0; b < arrayOfInt.length; b++) {
      arrayOfInt[b] = paramInt;
      int i;
      switch ((i = ﾞл(paramInt)) >>> 24) {
        case 64:
        case 65:
          j = ᴵʖ(paramInt + 1);
          paramInt += 3;
          while (j-- > 0) {
            int k = ᴵʖ(paramInt);
            int m = ᴵʖ(paramInt + 2);
            paramInt += 6;
            ˊ(k, (ᔪ[])paramʾ.ᐨẏ);
            ˊ(k + m, (ᔪ[])paramʾ.ᐨẏ);
          } 
          break;
        case 71:
        case 72:
        case 73:
        case 74:
        case 75:
          paramInt += 4;
          break;
        case 16:
        case 17:
        case 18:
        case 23:
        case 66:
        case 67:
        case 68:
        case 69:
        case 70:
          paramInt += 3;
          break;
        default:
          throw new IllegalArgumentException();
      } 
      int j = ˊ(paramInt);
      if (i >>> 24 == 66) {
        ᐧפ ᐧפ = (j == 0) ? null : new ᐧפ(this.ﾞл, paramInt);
        paramInt += 1 + 2 * j;
        String str = ᐨẏ(paramInt, (char[])ˏɪ);
        paramInt += 2;
        paramInt = ᐨẏ(paramˉｓ.ᴵʖ(i & 0xFFFFFF00, (ˏɪ)ᐧפ, str, paramBoolean), paramInt, true, (char[])ˏɪ);
      } else {
        paramInt += 3 + 2 * j;
        paramInt = ᐨẏ((ᐨẏ)null, paramInt, true, (char[])ˏɪ);
      } 
    } 
    return arrayOfInt;
  }
  
  private int ᐨẏ(int[] paramArrayOfint, int paramInt) {
    return (paramArrayOfint == null || paramInt >= paramArrayOfint.length || ˊ(paramArrayOfint[paramInt]) < 67) ? -1 : ᴵʖ(paramArrayOfint[paramInt] + 1);
  }
  
  private int ᐨẏ(ʾ paramʾ, int paramInt) {
    byte b;
    int i = paramInt;
    switch ((paramInt = ﾞл(paramInt)) >>> 24) {
      case 0:
      case 1:
      case 22:
        paramInt &= 0xFFFF0000;
        i += 2;
        break;
      case 19:
      case 20:
      case 21:
        paramInt &= 0xFF000000;
        i++;
        break;
      case 64:
      case 65:
        paramInt &= 0xFF000000;
        j = ᴵʖ(i + 1);
        i += 3;
        paramʾ.ˊ = (Object[])new ᔪ[j];
        paramʾ.ᴵʖ = (Object[])new ᔪ[j];
        paramʾ.ﾞл = new int[j];
        for (b = 0; b < j; b++) {
          int k = ᴵʖ(i);
          int m = ᴵʖ(i + 2);
          int n = ᴵʖ(i + 4);
          i += 6;
          paramʾ.ˊ[b] = ˊ(k, (ᔪ[])paramʾ.ᐨẏ);
          paramʾ.ᴵʖ[b] = ˊ(k + m, (ᔪ[])paramʾ.ᐨẏ);
          paramʾ.ﾞл[b] = n;
        } 
        break;
      case 71:
      case 72:
      case 73:
      case 74:
      case 75:
        paramInt &= 0xFF0000FF;
        i += 4;
        break;
      case 16:
      case 17:
      case 18:
      case 23:
      case 66:
        paramInt &= 0xFFFFFF00;
        i += 3;
        break;
      case 67:
      case 68:
      case 69:
      case 70:
        paramInt &= 0xFF000000;
        i += 3;
        break;
      default:
        throw new IllegalArgumentException();
    } 
    paramʾ.ιƚ = paramInt;
    int j = ˊ(i);
    paramʾ.ᐨẏ = (j == 0) ? null : (ˏɪ)new ᐧפ(this.ﾞл, i);
    return i + 1 + 2 * j;
  }
  
  private void ᐨẏ(ˉｓ paramˉｓ, ʾ paramʾ, int paramInt, boolean paramBoolean) {
    paramInt = paramInt;
    int i = this.ﾞл[paramInt++] & 0xFF;
    paramˉｓ.ᐨẏ(i, paramBoolean);
    ˏɪ ˏɪ = paramʾ.ᐨẏ;
    for (byte b = 0; b < i; b++) {
      int j = ᴵʖ(paramInt);
      for (paramInt += 2; j-- > 0; paramInt = ᐨẏ(paramˉｓ.ᐨẏ(b, str, paramBoolean), paramInt, true, (char[])ˏɪ)) {
        String str = ᐨẏ(paramInt, (char[])ˏɪ);
        paramInt += 2;
      } 
    } 
  }
  
  private int ᐨẏ(ᐨẏ paramᐨẏ, int paramInt, boolean paramBoolean, char[] paramArrayOfchar) {
    paramInt = paramInt;
    int i = ᴵʖ(paramInt);
    paramInt += 2;
    if (paramBoolean) {
      while (i-- > 0) {
        String str = ᐨẏ(paramInt, paramArrayOfchar);
        paramInt = ᐨẏ(paramᐨẏ, paramInt + 2, str, paramArrayOfchar);
      } 
    } else {
      while (i-- > 0)
        paramInt = ᐨẏ(paramᐨẏ, paramInt, (String)null, paramArrayOfchar); 
    } 
    if (paramᐨẏ != null)
      paramᐨẏ.ᐨẏ(); 
    return paramInt;
  }
  
  private int ᐨẏ(ᐨẏ paramᐨẏ, int paramInt, String paramString, char[] paramArrayOfchar) {
    byte[] arrayOfByte;
    byte b4;
    short[] arrayOfShort;
    byte b3;
    int[] arrayOfInt;
    byte b2;
    float[] arrayOfFloat;
    byte b1;
    int i;
    byte b8;
    boolean[] arrayOfBoolean;
    byte b7;
    char[] arrayOfChar;
    byte b6;
    long[] arrayOfLong;
    byte b5;
    double[] arrayOfDouble;
    paramInt = paramInt;
    if (paramᐨẏ == null) {
      switch (this.ﾞл[paramInt] & 0xFF) {
        case 101:
          return paramInt + 5;
        case 64:
          return ᐨẏ((ᐨẏ)null, paramInt + 3, true, paramArrayOfchar);
        case 91:
          return ᐨẏ((ᐨẏ)null, paramInt + 1, false, paramArrayOfchar);
      } 
      return paramInt + 3;
    } 
    switch (this.ﾞл[paramInt++] & 0xFF) {
      case 66:
        paramᐨẏ.ᐨẏ(paramString, Byte.valueOf((byte)ﾞл(this.ᐨẏ[ᴵʖ(paramInt)])));
        paramInt += 2;
        return paramInt;
      case 67:
        paramᐨẏ.ᐨẏ(paramString, Character.valueOf((char)ﾞл(this.ᐨẏ[ᴵʖ(paramInt)])));
        paramInt += 2;
        return paramInt;
      case 68:
      case 70:
      case 73:
      case 74:
        paramᐨẏ.ᐨẏ(paramString, ᐨẏ(ᴵʖ(paramInt), paramArrayOfchar));
        paramInt += 2;
        return paramInt;
      case 83:
        paramᐨẏ.ᐨẏ(paramString, Short.valueOf((short)ﾞл(this.ᐨẏ[ᴵʖ(paramInt)])));
        paramInt += 2;
        return paramInt;
      case 90:
        paramᐨẏ.ᐨẏ(paramString, (ﾞл(this.ᐨẏ[ᴵʖ(paramInt)]) == 0) ? Boolean.FALSE : Boolean.TRUE);
        paramInt += 2;
        return paramInt;
      case 115:
        paramᐨẏ.ᐨẏ(paramString, ᐨẏ(paramInt, paramArrayOfchar));
        paramInt += 2;
        return paramInt;
      case 101:
        paramᐨẏ.ᐨẏ(paramString, ᐨẏ(paramInt, paramArrayOfchar), ᐨẏ(paramInt + 2, paramArrayOfchar));
        paramInt += 4;
        return paramInt;
      case 99:
        paramᐨẏ.ᐨẏ(paramString, ˑܘ.ᐨẏ(ᐨẏ(paramInt, paramArrayOfchar)));
        paramInt += 2;
        return paramInt;
      case 64:
        return ᐨẏ(paramᐨẏ.ᐨẏ(paramString, ᐨẏ(paramInt, paramArrayOfchar)), paramInt + 2, true, paramArrayOfchar);
      case 91:
        i = ᴵʖ(paramInt);
        paramInt += 2;
        if (i == 0)
          return ᐨẏ(paramᐨẏ.ᐨẏ(paramString), paramInt - 2, false, paramArrayOfchar); 
        switch (this.ﾞл[paramInt] & 0xFF) {
          case 66:
            arrayOfByte = new byte[i];
            for (b8 = 0; b8 < i; b8++) {
              arrayOfByte[b8] = (byte)ﾞл(this.ᐨẏ[ᴵʖ(paramInt + 1)]);
              paramInt += 3;
            } 
            paramᐨẏ.ᐨẏ(paramString, arrayOfByte);
            return paramInt;
          case 90:
            arrayOfBoolean = new boolean[i];
            for (b4 = 0; b4 < i; b4++) {
              arrayOfBoolean[b4] = (ﾞл(this.ᐨẏ[ᴵʖ(paramInt + 1)]) != 0);
              paramInt += 3;
            } 
            paramᐨẏ.ᐨẏ(paramString, arrayOfBoolean);
            return paramInt;
          case 83:
            arrayOfShort = new short[i];
            for (b7 = 0; b7 < i; b7++) {
              arrayOfShort[b7] = (short)ﾞл(this.ᐨẏ[ᴵʖ(paramInt + 1)]);
              paramInt += 3;
            } 
            paramᐨẏ.ᐨẏ(paramString, arrayOfShort);
            return paramInt;
          case 67:
            arrayOfChar = new char[i];
            for (b3 = 0; b3 < i; b3++) {
              arrayOfChar[b3] = (char)ﾞл(this.ᐨẏ[ᴵʖ(paramInt + 1)]);
              paramInt += 3;
            } 
            paramᐨẏ.ᐨẏ(paramString, arrayOfChar);
            return paramInt;
          case 73:
            arrayOfInt = new int[i];
            for (b6 = 0; b6 < i; b6++) {
              arrayOfInt[b6] = ﾞл(this.ᐨẏ[ᴵʖ(paramInt + 1)]);
              paramInt += 3;
            } 
            paramᐨẏ.ᐨẏ(paramString, arrayOfInt);
            return paramInt;
          case 74:
            arrayOfLong = new long[i];
            for (b2 = 0; b2 < i; b2++) {
              arrayOfLong[b2] = ᐨẏ(this.ᐨẏ[ᴵʖ(paramInt + 1)]);
              paramInt += 3;
            } 
            paramᐨẏ.ᐨẏ(paramString, arrayOfLong);
            return paramInt;
          case 70:
            arrayOfFloat = new float[i];
            for (b5 = 0; b5 < i; b5++) {
              arrayOfFloat[b5] = Float.intBitsToFloat(ﾞл(this.ᐨẏ[ᴵʖ(paramInt + 1)]));
              paramInt += 3;
            } 
            paramᐨẏ.ᐨẏ(paramString, arrayOfFloat);
            return paramInt;
          case 68:
            arrayOfDouble = new double[i];
            for (b1 = 0; b1 < i; b1++) {
              arrayOfDouble[b1] = Double.longBitsToDouble(ᐨẏ(this.ᐨẏ[ᴵʖ(paramInt + 1)]));
              paramInt += 3;
            } 
            paramᐨẏ.ᐨẏ(paramString, arrayOfDouble);
            return paramInt;
        } 
        return ᐨẏ(paramᐨẏ.ᐨẏ(paramString), paramInt - 2, false, b1);
    } 
    throw new IllegalArgumentException();
  }
  
  private void ᐨẏ(ʾ paramʾ) {
    String str = paramʾ.ιˠ;
    Object[] arrayOfObject = paramʾ.ˊ;
    byte b1 = 0;
    if ((paramʾ.ιᒶ & 0x8) == 0) {
      "䡕䎈⎎쑞㿛ၢ޹".toCharArray()[2] = (char)("䡕䎈⎎쑞㿛ၢ޹".toCharArray()[2] ^ 0x341);
      if (ˍɫ$יς.J("䡕䎈⎎쑞㿛ၢ޹".toCharArray(), (short)21787, (short)5, (byte)5).equals(paramʾ.ᐧפ)) {
        b1++;
        arrayOfObject[0] = ـﭔ.ՙᗮ;
      } else {
        b1++;
        ˏɪ ˏɪ = paramʾ.ᐨẏ;
        int i = this.ٴӵ + 2;
        ʹﮃ ʹﮃ1;
        arrayOfObject[0] = (ʹﮃ1 = this).ᴵʖ(i, (char[])ˏɪ);
      } 
    } 
    byte b2 = 1;
    while (true) {
      byte b = b2;
      switch (str.charAt(b2++)) {
        case 'B':
        case 'C':
        case 'I':
        case 'S':
        case 'Z':
          arrayOfObject[b1++] = ـﭔ.ˊ;
          continue;
        case 'F':
          arrayOfObject[b1++] = ـﭔ.ᴵʖ;
          continue;
        case 'J':
          arrayOfObject[b1++] = ـﭔ.ʿᵉ;
          continue;
        case 'D':
          arrayOfObject[b1++] = ـﭔ.ﾞл;
          continue;
        case '[':
          while (str.charAt(b2) == '[')
            b2++; 
          if (str.charAt(b2) == 'L')
            while (str.charAt(++b2) != ';')
              b2++;  
          arrayOfObject[b1++] = str.substring(b, ++b2);
          continue;
        case 'L':
          while (str.charAt(b2) != ';')
            b2++; 
          arrayOfObject[b1++] = str.substring(b + 1, b2++);
          continue;
      } 
      paramʾ.ᐧǏ = b1;
      return;
    } 
  }
  
  private int ᐨẏ(int paramInt, boolean paramBoolean1, boolean paramBoolean2, ʾ paramʾ) {
    char c;
    int i;
    paramInt = paramInt;
    ˏɪ ˏɪ1 = paramʾ.ᐨẏ;
    ˏɪ ˏɪ2 = paramʾ.ᐨẏ;
    if (paramBoolean1) {
      c = this.ﾞл[paramInt++] & 0xFF;
    } else {
      c = 'ÿ';
      paramʾ.ʽו = -1;
    } 
    paramʾ.ιՆ = 0;
    if (c < '@') {
      i = c;
      paramʾ.ﹳه = 3;
      paramʾ.וּ = 0;
    } else if (c < '') {
      i = c - 64;
      paramInt = ᐨẏ(paramInt, paramʾ.ᴵʖ, 0, (char[])ˏɪ1, (ᔪ[])ˏɪ2);
      paramʾ.ﹳه = 4;
      paramʾ.וּ = 1;
    } else if (c >= '÷') {
      i = ᴵʖ(paramInt);
      paramInt += 2;
      if (c == '÷') {
        paramInt = ᐨẏ(paramInt, paramʾ.ᴵʖ, 0, (char[])ˏɪ1, (ᔪ[])ˏɪ2);
        paramʾ.ﹳه = 4;
        paramʾ.וּ = 1;
      } else if (c >= 'ø' && c < 'û') {
        paramʾ.ﹳه = 2;
        paramʾ.ιՆ = 251 - c;
        paramʾ.ᐧǏ -= paramʾ.ιՆ;
        paramʾ.וּ = 0;
      } else if (c == 'û') {
        paramʾ.ﹳه = 3;
        paramʾ.וּ = 0;
      } else if (c < 'ÿ') {
        paramBoolean2 = paramBoolean2 ? paramʾ.ᐧǏ : false;
        for (int j = c - 251; j > 0; j--)
          paramInt = ᐨẏ(paramInt, paramʾ.ˊ, paramBoolean2++, (char[])ˏɪ1, (ᔪ[])ˏɪ2); 
        paramʾ.ﹳه = 1;
        paramʾ.ιՆ = c - 251;
        paramʾ.ᐧǏ += paramʾ.ιՆ;
        paramʾ.וּ = 0;
      } else {
        int j = ᴵʖ(paramInt);
        paramInt += 2;
        paramʾ.ﹳه = 0;
        paramʾ.ιՆ = j;
        paramʾ.ᐧǏ = j;
        int k;
        for (k = 0; k < j; k++)
          paramInt = ᐨẏ(paramInt, paramʾ.ˊ, k, (char[])ˏɪ1, (ᔪ[])ˏɪ2); 
        k = ᴵʖ(paramInt);
        paramInt += 2;
        paramʾ.וּ = k;
        for (c = Character.MIN_VALUE; c < k; c++)
          paramInt = ᐨẏ(paramInt, paramʾ.ᴵʖ, c, (char[])ˏɪ1, (ᔪ[])ˏɪ2); 
      } 
    } else {
      throw new IllegalArgumentException();
    } 
    paramʾ.ʽו += i + 1;
    ˊ(paramʾ.ʽו, (ᔪ[])ˏɪ2);
    return paramInt;
  }
  
  private int ᐨẏ(int paramInt1, Object[] paramArrayOfObject, int paramInt2, char[] paramArrayOfchar, ᔪ[] paramArrayOfᔪ) {
    ʹﮃ ʹﮃ1;
    paramInt1 = paramInt1;
    int i;
    switch (i = this.ﾞл[paramInt1++] & 0xFF) {
      case 0:
        paramArrayOfObject[paramInt2] = ـﭔ.ᐨẏ;
        return paramInt1;
      case 1:
        paramArrayOfObject[paramInt2] = ـﭔ.ˊ;
        return paramInt1;
      case 2:
        paramArrayOfObject[paramInt2] = ـﭔ.ᴵʖ;
        return paramInt1;
      case 3:
        paramArrayOfObject[paramInt2] = ـﭔ.ﾞл;
        return paramInt1;
      case 4:
        paramArrayOfObject[paramInt2] = ـﭔ.ʿᵉ;
        return paramInt1;
      case 5:
        paramArrayOfObject[paramInt2] = ـﭔ.ʹﮃ;
        return paramInt1;
      case 6:
        paramArrayOfObject[paramInt2] = ـﭔ.ՙᗮ;
        return paramInt1;
      case 7:
        paramArrayOfchar = paramArrayOfchar;
        paramInt2 = paramInt1;
        paramArrayOfObject[paramInt2] = (ʹﮃ1 = this).ᴵʖ(paramInt2, paramArrayOfchar);
        paramInt1 += 2;
        return paramInt1;
      case 8:
        ʹﮃ1[paramInt2] = (ʹﮃ)ˊ(ᴵʖ(paramInt1), paramArrayOfᔪ);
        paramInt1 += 2;
        return paramInt1;
    } 
    throw new IllegalArgumentException();
  }
  
  final int ᴵʖ() {
    int i = this.ٴӵ + 8 + (ᴵʖ(this.ٴӵ + 6) << 1);
    int j = ᴵʖ(i);
    i += 2;
    while (j-- > 0) {
      int m = ᴵʖ(i + 6);
      for (i += 8; m-- > 0; i += 6 + ﾞл(i + 2));
    } 
    int k = ᴵʖ(i);
    i += 2;
    while (k-- > 0) {
      j = ᴵʖ(i + 6);
      for (i += 8; j-- > 0; i += 6 + ﾞл(i + 2));
    } 
    return i + 2;
  }
  
  private int[] ᐨẏ(int paramInt) {
    char[] arrayOfChar = new char[paramInt];
    int i = ᴵʖ();
    for (int j = ᴵʖ(i - 2); j > 0; j--) {
      String str = ᐨẏ(i, arrayOfChar);
      int k = ﾞл(i + 2);
      i += 6;
      "䩜䱘얧⩣?념ꍹ兺ᗌ檬좀☌ኾ䞓㡿跥⋽".toCharArray()[0] = (char)("䩜䱘얧⩣?념ꍹ兺ᗌ檬좀☌ኾ䞓㡿跥⋽".toCharArray()[0] ^ 0x4A5E);
      if (ᐨẏ$ᐝт.W("䩜䱘얧⩣?념ꍹ兺ᗌ檬좀☌ኾ䞓㡿跥⋽".toCharArray(), (short)2452, (byte)2, (short)3).equals(str)) {
        int[] arrayOfInt = new int[ᴵʖ(i)];
        i += 2;
        for (j = 0; j < arrayOfInt.length; j++) {
          arrayOfInt[j] = i;
          i += 4 + (ᴵʖ(i + 2) << 1);
        } 
        return arrayOfInt;
      } 
      i += k;
    } 
    throw new IllegalArgumentException();
  }
  
  private ᴵʖ ᐨẏ(ᴵʖ[] paramArrayOfᴵʖ, String paramString, int paramInt1, int paramInt2, char[] paramArrayOfchar, int paramInt3, ᔪ[] paramArrayOfᔪ) {
    paramInt3 = (paramArrayOfᴵʖ = paramArrayOfᴵʖ).length;
    for (byte b = 0; b < paramInt3; b++) {
      ᴵʖ ᴵʖ1;
      if ((ᴵʖ1 = paramArrayOfᴵʖ[b]).ᐨẏ.equals(paramString))
        return ᴵʖ1.ᐨẏ((ᐨم)this, paramInt1, paramInt2, paramArrayOfchar); 
    } 
    return (new ᴵʖ(paramString)).ᐨẏ((ᐨم)this, paramInt1, paramInt2, (char[])null);
  }
  
  public final int ﾞл() {
    return this.ᐨẏ.length;
  }
  
  public final int ᐨẏ(int paramInt) {
    return this.ᐨẏ[paramInt];
  }
  
  public final int ʿᵉ() {
    return this.ᴵƚ;
  }
  
  public final int ˊ(int paramInt) {
    return this.ﾞл[paramInt] & 0xFF;
  }
  
  public final int ᴵʖ(int paramInt) {
    byte[] arrayOfByte;
    return ((arrayOfByte = this.ﾞл)[paramInt] & 0xFF) << 8 | arrayOfByte[paramInt + 1] & 0xFF;
  }
  
  public final short ᐨẏ(int paramInt) {
    byte[] arrayOfByte;
    return (short)(((arrayOfByte = this.ﾞл)[paramInt] & 0xFF) << 8 | arrayOfByte[paramInt + 1] & 0xFF);
  }
  
  public final int ﾞл(int paramInt) {
    byte[] arrayOfByte;
    return ((arrayOfByte = this.ﾞл)[paramInt] & 0xFF) << 24 | (arrayOfByte[paramInt + 1] & 0xFF) << 16 | (arrayOfByte[paramInt + 2] & 0xFF) << 8 | arrayOfByte[paramInt + 3] & 0xFF;
  }
  
  public final long ᐨẏ(int paramInt) {
    long l1 = ﾞл(paramInt);
    long l2 = ﾞл(paramInt + 4) & 0xFFFFFFFFL;
    return l1 << 32L | l2;
  }
  
  public final String ᐨẏ(int paramInt, char[] paramArrayOfchar) {
    int i = ᴵʖ(paramInt);
    return (paramInt == 0 || i == 0) ? null : ˊ(i, paramArrayOfchar);
  }
  
  final String ˊ(int paramInt, char[] paramArrayOfchar) {
    ʾܪ ʾܪ1;
    if ((ʾܪ1 = this.ᐨẏ[paramInt]) != null)
      return (String)ʾܪ1; 
    ʾܪ1 = this.ᐨẏ[paramInt];
    this.ᐨẏ[paramInt] = (ʾܪ)ᐨẏ(ʾܪ1 + 2, ᴵʖ(ʾܪ1), paramArrayOfchar);
    return ᐨẏ(ʾܪ1 + 2, ᴵʖ(ʾܪ1), paramArrayOfchar);
  }
  
  private String ᐨẏ(int paramInt1, int paramInt2, char[] paramArrayOfchar) {
    paramInt2 = (paramInt1 = paramInt1) + paramInt2;
    byte b = 0;
    byte[] arrayOfByte = this.ﾞл;
    while (paramInt1 < paramInt2) {
      byte b1;
      if (((b1 = arrayOfByte[paramInt1++]) & 0x80) == 0) {
        paramArrayOfchar[b++] = (char)(b1 & Byte.MAX_VALUE);
        continue;
      } 
      if ((b1 & 0xE0) == 192) {
        paramArrayOfchar[b++] = (char)(((b1 & 0x1F) << 6) + (arrayOfByte[paramInt1++] & 0x3F));
        continue;
      } 
      paramArrayOfchar[b++] = (char)(((b1 & 0xF) << 12) + ((arrayOfByte[paramInt1++] & 0x3F) << 6) + (arrayOfByte[paramInt1++] & 0x3F));
    } 
    return new String(paramArrayOfchar, 0, b);
  }
  
  private String ᴵʖ(int paramInt, char[] paramArrayOfchar) {
    return ᐨẏ(this.ᐨẏ[ᴵʖ(paramInt)], paramArrayOfchar);
  }
  
  public final String ﾞл(int paramInt, char[] paramArrayOfchar) {
    return ᴵʖ(paramInt, paramArrayOfchar);
  }
  
  public final String ʿᵉ(int paramInt, char[] paramArrayOfchar) {
    return ᴵʖ(paramInt, paramArrayOfchar);
  }
  
  public final String ʹﮃ(int paramInt, char[] paramArrayOfchar) {
    return ᴵʖ(paramInt, paramArrayOfchar);
  }
  
  private ʾܪ ᐨẏ(int paramInt, char[] paramArrayOfchar) {
    ʾܪ ʾܪ1;
    if ((ʾܪ1 = this.ᐨẏ[paramInt]) != null)
      return ʾܪ1; 
    ʾܪ1 = this.ᐨẏ[paramInt];
    ʾܪ ʾܪ2 = this.ᐨẏ[ᴵʖ(ʾܪ1 + 2)];
    String str2 = ᐨẏ(ʾܪ2, paramArrayOfchar);
    String str1 = ᐨẏ(ʾܪ2 + 2, paramArrayOfchar);
    int i = this.ˊ[ᴵʖ(ʾܪ1)];
    ʹō ʹō = (ʹō)ᐨẏ(ᴵʖ(i), paramArrayOfchar);
    Object[] arrayOfObject = new Object[ᴵʖ(i + 2)];
    i += 4;
    for (byte b = 0; b < arrayOfObject.length; b++) {
      arrayOfObject[b] = ᐨẏ(ᴵʖ(i), paramArrayOfchar);
      i += 2;
    } 
    this.ᐨẏ[paramInt] = new ʾܪ(str2, str1, ʹō, arrayOfObject);
    return new ʾܪ(str2, str1, ʹō, arrayOfObject);
  }
  
  public final Object ᐨẏ(int paramInt, char[] paramArrayOfchar) {
    String str1;
    boolean bool;
    ʾܪ ʾܪ2;
    ʹﮃ ʹﮃ1;
    String str2;
    ʾܪ ʾܪ3;
    String str3;
    char[] arrayOfChar;
    ʾܪ ʾܪ1 = this.ᐨẏ[paramInt];
    switch (this.ﾞл[ʾܪ1 - 1]) {
      case 3:
        return Integer.valueOf(ﾞл(ʾܪ1));
      case 4:
        return Float.valueOf(Float.intBitsToFloat(ﾞл(ʾܪ1)));
      case 5:
        return Long.valueOf(ᐨẏ(ʾܪ1));
      case 6:
        return Double.valueOf(Double.longBitsToDouble(ᐨẏ(ʾܪ1)));
      case 7:
        return ˑܘ.ˊ(ᐨẏ(ʾܪ1, paramArrayOfchar));
      case 8:
        return ᐨẏ(ʾܪ1, paramArrayOfchar);
      case 16:
        return ˑܘ.ᴵʖ(ᐨẏ(ʾܪ1, paramArrayOfchar));
      case 15:
        paramInt = ˊ(ʾܪ1);
        ʾܪ1 = this.ᐨẏ[ᴵʖ(ʾܪ1 + 1)];
        ʾܪ2 = this.ᐨẏ[ᴵʖ(ʾܪ1 + 2)];
        arrayOfChar = paramArrayOfchar;
        ʾܪ3 = ʾܪ1;
        str2 = (ʹﮃ1 = this).ᴵʖ(ʾܪ3, arrayOfChar);
        str3 = ᐨẏ(ʾܪ2, paramArrayOfchar);
        str1 = ᐨẏ(ʾܪ2 + 2, paramArrayOfchar);
        bool = (this.ﾞл[ʾܪ1 - 1] == 11) ? true : false;
        return new ʹō(paramInt, str2, str3, str1, bool);
      case 17:
        return ᐨẏ(paramInt, (char[])str1);
    } 
    throw new IllegalArgumentException();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ʹﮃ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */