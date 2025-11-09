package yyds.sniarbtej;

import ylt.pmn.zubdqvgt;

public final class ˌх {
  final ʽ ᐨẏ;
  
  final ᐨم ᐨẏ;
  
  int Ԇ;
  
  public String ˊ;
  
  private int ʾļ;
  
  private ιﾌ[] ᐨẏ;
  
  int ˌ;
  
  ʿᵉ ᐝᵣ;
  
  int ՙῑ;
  
  ʿᵉ ᔪ;
  
  public int ʿᖨ;
  
  public ιﾌ[] ˊ;
  
  int ˉﮞ;
  
  ʻւ[] ᐨẏ;
  
  ʻւ[] ˊ;
  
  ˌх(ʽ paramʽ) {
    this.ᐨẏ = (ʻւ[])paramʽ;
    this.ᐨẏ = null;
    this.ᐨẏ = (ʻւ[])new ιﾌ[256];
    this.ˌ = 1;
    this.ᐝᵣ = new ʿᵉ();
  }
  
  ˌх(ʽ paramʽ, ᐨم paramᐨم) {
    this.ᐨẏ = (ʻւ[])paramʽ;
    this.ᐨẏ = (ʻւ[])paramᐨم;
    byte[] arrayOfByte = paramᐨم.ﾞл;
    int i = paramᐨم.ᐨẏ(1) - 1;
    int j = paramᐨم.ٴӵ - i;
    this.ˌ = paramᐨم.ﾞл();
    this.ᐝᵣ = new ʿᵉ(j);
    this.ᐝᵣ.ᐨẏ(arrayOfByte, i, j);
    this.ᐨẏ = (ʻւ[])new ιﾌ[this.ˌ << 1];
    char[] arrayOfChar = new char[paramᐨم.ʿᵉ()];
    j = 0;
    int k;
    for (k = 1; k < this.ˌ; k += (b == 5 || b == 6) ? 2 : 1) {
      ˌх ˌх2;
      byte b1;
      ˌх ˌх1;
      int n;
      byte b3;
      String str2;
      byte b2;
      String str1;
      int i1;
      String str3;
      int i2;
      int i3;
      String str6;
      int i4;
      String str5;
      long l;
      String str4;
      String str7;
      int m = paramᐨم.ᐨẏ(k);
      byte b;
      switch (b = arrayOfByte[m - 1]) {
        case 9:
        case 10:
        case 11:
          n = paramᐨم.ᐨẏ(paramᐨم.ᴵʖ(m + 2));
          str3 = paramᐨم.ᐨẏ(n + 2, arrayOfChar);
          str7 = paramᐨم.ᐨẏ(n, arrayOfChar);
          str6 = paramᐨم.ﾞл(m, arrayOfChar);
          b3 = b;
          n = k;
          (ˌх2 = this).ᐨẏ(new ιﾌ(n, b3, str6, str7, str3, 0L, ˊ(b3, str6, str7, str3)));
          break;
        case 3:
        case 4:
          i4 = paramᐨم.ﾞл(ˌх2);
          b3 = b;
          n = k;
          n = i4;
          b1 = b3;
          (ˌх2 = this).ᐨẏ(new ιﾌ(n, b3, i4, Integer.MAX_VALUE & b1 + n));
          break;
        case 12:
          str5 = paramᐨم.ᐨẏ(b1 + 2, arrayOfChar);
          str2 = paramᐨم.ᐨẏ(b1, arrayOfChar);
          n = k;
          (ˌх1 = this).ᐨẏ(new ιﾌ(n, 12, str2, str5, ᐨẏ(12, str2, str5)));
          break;
        case 5:
        case 6:
          l = paramᐨم.ᐨẏ(ˌх1);
          b2 = b;
          n = k;
          (ˌх1 = this).ᐨẏ(new ιﾌ(n, b2, l, ᐨẏ(b2, l)));
          break;
        case 1:
          str1 = paramᐨم.ˊ(k, arrayOfChar);
          n = k;
          (ˌх1 = this).ᐨẏ(new ιﾌ(n, 1, str1, ˊ(1, str1)));
          break;
        case 15:
          i1 = paramᐨم.ᐨẏ(paramᐨم.ᴵʖ(ˌх1 + 1));
          n = paramᐨم.ᐨẏ(paramᐨم.ᴵʖ(i1 + 2));
          str3 = paramᐨم.ᐨẏ(n + 2, arrayOfChar);
          str7 = paramᐨم.ᐨẏ(n, arrayOfChar);
          str4 = paramᐨم.ﾞл(i1, arrayOfChar);
          i1 = paramᐨم.ˊ(ˌх1);
          n = k;
          ˌх1 = this;
          i3 = ᐨẏ(15, str4, str7, str3, i1);
          ˌх1.ᐨẏ(new ιﾌ(n, 15, str4, str7, str3, i1, i3));
          break;
        case 17:
        case 18:
          j = 1;
          n = paramᐨم.ᐨẏ(paramᐨم.ᴵʖ(ˌх1 + 2));
          i2 = paramᐨم.ᴵʖ(ˌх1);
          str7 = paramᐨم.ᐨẏ(n + 2, arrayOfChar);
          str4 = paramᐨم.ᐨẏ(n, arrayOfChar);
          i1 = k;
          n = b;
          ˌх1 = this;
          i3 = ᐨẏ(n, str4, str7, i2);
          ˌх1.ᐨẏ(new ιﾌ(i1, n, null, str4, str7, i2, i3));
          break;
        case 7:
        case 8:
        case 16:
        case 19:
        case 20:
          str4 = paramᐨم.ᐨẏ(ˌх1, arrayOfChar);
          i1 = b;
          n = k;
          (ˌх1 = this).ᐨẏ(new ιﾌ(n, i1, str4, ˊ(i1, str4)));
          break;
        default:
          throw new IllegalArgumentException();
      } 
    } 
    if (j != 0)
      ᐨẏ(paramᐨم, arrayOfChar); 
  }
  
  private void ᐨẏ(ᐨم paramᐨم, char[] paramArrayOfchar) {
    byte[] arrayOfByte = paramᐨم.ﾞл;
    int i = paramᐨم.ᴵʖ();
    int j;
    for (j = paramᐨم.ᴵʖ(i - 2); j > 0; j--) {
      String str = paramᐨم.ᐨẏ(i, paramArrayOfchar);
      "뿸먺䲣읁肀祭ㇹ좺㲘ႊꀵㅡ많懊鴻?᳸".toCharArray()[11] = (char)("뿸먺䲣읁肀祭ㇹ좺㲘ႊꀵㅡ많懊鴻?᳸".toCharArray()[11] ^ 0x3BE5);
      if (ˍɫ$יς.J("뿸먺䲣읁肀祭ㇹ좺㲘ႊꀵㅡ많懊鴻?᳸".toCharArray(), (short)30982, (short)0, (byte)2).equals(str)) {
        this.ՙῑ = paramᐨم.ᴵʖ(i + 6);
        break;
      } 
      i += 6 + paramᐨم.ﾞл(i + 2);
    } 
    if (this.ՙῑ > 0) {
      j = i + 8;
      int m = paramᐨم.ﾞл(i + 2) - 2;
      this.ᔪ = new ʿᵉ(m);
      this.ᔪ.ᐨẏ(arrayOfByte, j, m);
      int k = j;
      for (i = 0; i < this.ՙῑ; i++) {
        m = k - j;
        int n = paramᐨم.ᴵʖ(k);
        k += 2;
        int i1 = paramᐨم.ᴵʖ(k);
        k += 2;
        for (n = paramᐨم.ᐨẏ(n, paramArrayOfchar).hashCode(); i1-- > 0; n ^= paramᐨم.ᐨẏ(i2, paramArrayOfchar).hashCode()) {
          int i2 = paramᐨم.ᴵʖ(k);
          k += 2;
        } 
        ᐨẏ(new ιﾌ(i, 64, m, n & Integer.MAX_VALUE));
      } 
    } 
  }
  
  final ᐨم ᐨẏ() {
    return (ᐨم)this.ᐨẏ;
  }
  
  final int ᐝᵣ() {
    return this.Ԇ;
  }
  
  public final String ᐨẏ() {
    return (String)this.ˊ;
  }
  
  final int ᐨẏ(int paramInt, String paramString) {
    this.Ԇ = paramInt;
    this.ˊ = (ʻւ[])paramString;
    paramString = paramString;
    ˌх ˌх1;
    return ((ˌх1 = this).ᐨẏ(7, paramString)).ͺᴲ;
  }
  
  final int ʹﮃ() {
    return this.ˌ;
  }
  
  final int ᔪ() {
    return this.ᐝᵣ.ʹﮃ;
  }
  
  final void ʹﮃ(ʿᵉ paramʿᵉ) {
    paramʿᵉ.ˊ(this.ˌ).ᐨẏ(this.ᐝᵣ.ˊ, 0, this.ᐝᵣ.ʹﮃ);
  }
  
  final int ʿλ() {
    if (this.ᔪ != null) {
      "숊꛱˚㹨ᥧ蘙筈쨆诲혱⒲비?ꩵ瑁".toCharArray()[10] = (char)("숊꛱˚㹨ᥧ蘙筈쨆诲혱⒲비?ꩵ瑁".toCharArray()[10] ^ 0x7584);
      ՙᗮ(ˉﻤ$ͺſ.v("숊꛱˚㹨ᥧ蘙筈쨆诲혱⒲비?ꩵ瑁".toCharArray(), (short)26641, 5, (short)5));
      return 8 + this.ᔪ.ʹﮃ;
    } 
    return 0;
  }
  
  final void ՙᗮ(ʿᵉ paramʿᵉ) {
    if (this.ᔪ != null) {
      "狴⳽⑅梴誩妝㭫⣝?ῑ㇦럮咭杉⤰".toCharArray()[12] = (char)("狴⳽⑅梴誩妝㭫⣝?ῑ㇦럮咭杉⤰".toCharArray()[12] ^ 0x6FBD);
      paramʿᵉ.ˊ(ՙᗮ(ᐨẏ$ᐝт.W("狴⳽⑅梴誩妝㭫⣝?ῑ㇦럮咭杉⤰".toCharArray(), (short)16759, (byte)5, (short)2))).ᴵʖ(this.ᔪ.ʹﮃ + 2).ˊ(this.ՙῑ).ᐨẏ(this.ᔪ.ˊ, 0, this.ᔪ.ʹﮃ);
    } 
  }
  
  public ιﾌ ᐨẏ(int paramInt) {
    return (ιﾌ)this.ᐨẏ[paramInt % this.ᐨẏ.length];
  }
  
  private ιﾌ ᐨẏ(ιﾌ paramιﾌ) {
    if (this.ʾļ > this.ᐨẏ.length * 3 / 4) {
      int j;
      int k;
      ιﾌ[] arrayOfΙﾌ = new ιﾌ[k = ((j = this.ᐨẏ.length) << 1) + 1];
      while (--j >= 0) {
        ʻւ ʻւ1 = this.ᐨẏ[j];
        while (ʻւ1 != null) {
          int m = ((ιﾌ)ʻւ1).ʹｨ % k;
          ιﾌ ιﾌ2 = ((ιﾌ)ʻւ1).ᐨẏ;
          ((ιﾌ)ʻւ1).ᐨẏ = arrayOfΙﾌ[m];
          arrayOfΙﾌ[m] = (ιﾌ)ʻւ1;
          ιﾌ ιﾌ1 = ιﾌ2;
        } 
        j--;
      } 
      this.ᐨẏ = (ʻւ[])arrayOfΙﾌ;
    } 
    this.ʾļ++;
    int i = paramιﾌ.ʹｨ % this.ᐨẏ.length;
    paramιﾌ.ᐨẏ = (ιﾌ)this.ᐨẏ[i];
    this.ᐨẏ[i] = (ʻւ)paramιﾌ;
    return paramιﾌ;
  }
  
  private void ᐨẏ(ιﾌ paramιﾌ) {
    this.ʾļ++;
    int i = paramιﾌ.ʹｨ % this.ᐨẏ.length;
    paramιﾌ.ᐨẏ = (ιﾌ)this.ᐨẏ[i];
    this.ᐨẏ[i] = (ʻւ)paramιﾌ;
  }
  
  final ˊᵃ ᐨẏ(Object paramObject) {
    if (paramObject instanceof Integer) {
      int i = ((Integer)paramObject).intValue();
      ˌх ˌх1;
      return (ˌх1 = this).ᐨẏ(3, i);
    } 
    if (paramObject instanceof Byte) {
      int i = ((Byte)paramObject).intValue();
      ˌх ˌх1;
      return (ˌх1 = this).ᐨẏ(3, i);
    } 
    if (paramObject instanceof Character) {
      char c = ((Character)paramObject).charValue();
      ˌх ˌх1;
      return (ˌх1 = this).ᐨẏ(3, c);
    } 
    if (paramObject instanceof Short) {
      int i = ((Short)paramObject).intValue();
      ˌх ˌх1;
      return (ˌх1 = this).ᐨẏ(3, i);
    } 
    if (paramObject instanceof Boolean) {
      boolean bool = ((Boolean)paramObject).booleanValue() ? true : false;
      ˌх ˌх1;
      return (ˌх1 = this).ᐨẏ(3, bool);
    } 
    if (paramObject instanceof Float)
      return ᐨẏ(((Float)paramObject).floatValue()); 
    if (paramObject instanceof Long) {
      long l = ((Long)paramObject).longValue();
      ˌх ˌх1;
      return (ˌх1 = this).ᐨẏ(5, l);
    } 
    if (paramObject instanceof Double)
      return ᐨẏ(((Double)paramObject).doubleValue()); 
    if (paramObject instanceof String) {
      String str = (String)paramObject;
      ˌх ˌх1;
      return (ˌх1 = this).ᐨẏ(8, str);
    } 
    if (paramObject instanceof ˑܘ) {
      int i;
      if ((i = (paramObject = paramObject).ˉｓ()) == 10) {
        String str1 = paramObject.ՙᗮ();
        return (ˌх1 = this).ᐨẏ(7, str1);
      } 
      if (ˌх1 == 11) {
        String str1 = paramObject.ᴵʖ();
        return (ˌх1 = this).ᐨẏ(16, str1);
      } 
      String str = paramObject.ᴵʖ();
      ˌх ˌх1;
      return (ˌх1 = this).ᐨẏ(7, str);
    } 
    if (paramObject instanceof ʹō) {
      paramObject = paramObject;
      Object object;
      return ᐨẏ(((ʹō)(object = paramObject)).ᙆ, ((ʹō)(object = paramObject)).ˈהּ, ((ʹō)(object = paramObject)).name, ((ʹō)(object = paramObject)).ᴵʖ, ((ʹō)(object = paramObject)).ˊ);
    } 
    if (paramObject instanceof ʾܪ) {
      paramObject = paramObject;
      Object object;
      return ᐨẏ(((ʾܪ)(object = paramObject)).name, ((ʾܪ)(object = paramObject)).ᴵʖ, (ʹō)((ʾܪ)(object = paramObject)).ᐨẏ, ((ʾܪ)(object = paramObject)).ᐨẏ);
    } 
    "ᕤ꘸ೖꄽ盡崇".toCharArray()[0] = (char)("ᕤ꘸ೖꄽ盡崇".toCharArray()[0] ^ 0x4AEF);
    throw new IllegalArgumentException(ˉﻤ$ͺſ.v("ᕤ꘸ೖꄽ盡崇".toCharArray(), (short)9733, 1, (short)0) + paramObject);
  }
  
  public final ˊᵃ ᐨẏ(String paramString) {
    return ᐨẏ(7, paramString);
  }
  
  final ˊᵃ ᐨẏ(String paramString1, String paramString2, String paramString3) {
    return ᐨẏ(9, paramString1, paramString2, paramString3);
  }
  
  final ˊᵃ ᐨẏ(String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    byte b = paramBoolean ? 11 : 10;
    return ᐨẏ(b, paramString1, paramString2, paramString3);
  }
  
  private ιﾌ ᐨẏ(int paramInt, String paramString1, String paramString2, String paramString3) {
    int i = ˊ(paramInt, paramString1, paramString2, paramString3);
    for (ιﾌ ιﾌ1 = ᐨẏ(i); ιﾌ1 != null; ιﾌ1 = ιﾌ1.ᐨẏ) {
      if (ιﾌ1.ᙆ == paramInt && ιﾌ1.ʹｨ == i && ιﾌ1.ˈהּ.equals(paramString1) && ιﾌ1.name.equals(paramString2) && ιﾌ1.ʹл.equals(paramString3))
        return ιﾌ1; 
    } 
    String str = paramString1;
    ˌх ˌх1;
    this.ᐝᵣ.ˊ(paramInt, ((ˌх1 = this).ᐨẏ(7, str)).ͺᴲ, ˊ(paramString2, paramString3));
    return ᐨẏ(new ιﾌ(this.ˌ++, paramInt, paramString1, paramString2, paramString3, 0L, i));
  }
  
  private void ᐨẏ(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3) {
    ᐨẏ(new ιﾌ(paramInt1, paramInt2, paramString1, paramString2, paramString3, 0L, ˊ(paramInt2, paramString1, paramString2, paramString3)));
  }
  
  private ˊᵃ ˊ(String paramString) {
    return ᐨẏ(8, paramString);
  }
  
  final ˊᵃ ᐨẏ(int paramInt) {
    return ᐨẏ(3, paramInt);
  }
  
  final ˊᵃ ᐨẏ(float paramFloat) {
    return ᐨẏ(4, Float.floatToRawIntBits(paramFloat));
  }
  
  ˊᵃ ᐨẏ(int paramInt1, int paramInt2) {
    int j = paramInt2;
    int i = paramInt1;
    i = Integer.MAX_VALUE & i + j;
    for (ιﾌ ιﾌ1 = ᐨẏ(i); ιﾌ1 != null; ιﾌ1 = ιﾌ1.ᐨẏ) {
      if (ιﾌ1.ᙆ == paramInt1 && ιﾌ1.ʹｨ == i && ιﾌ1.ˊ == paramInt2)
        return ιﾌ1; 
    } 
    this.ᐝᵣ.ᐨẏ(paramInt1).ᴵʖ(paramInt2);
    return ᐨẏ(new ιﾌ(this.ˌ++, paramInt1, paramInt2, i));
  }
  
  private void ˊ(int paramInt1, int paramInt2, int paramInt3) {
    paramInt2 = paramInt3;
    paramInt1 = paramInt2;
    ᐨẏ(new ιﾌ(paramInt1, paramInt2, paramInt3, Integer.MAX_VALUE & paramInt1 + paramInt2));
  }
  
  final ˊᵃ ᐨẏ(long paramLong) {
    return ᐨẏ(5, paramLong);
  }
  
  final ˊᵃ ᐨẏ(double paramDouble) {
    return ᐨẏ(6, Double.doubleToRawLongBits(paramDouble));
  }
  
  ˊᵃ ᐨẏ(int paramInt, long paramLong) {
    int i = ᐨẏ(paramInt, paramLong);
    for (ιﾌ ιﾌ1 = ᐨẏ(i); ιﾌ1 != null; ιﾌ1 = ιﾌ1.ᐨẏ) {
      if (ιﾌ1.ᙆ == paramInt && ιﾌ1.ʹｨ == i && ιﾌ1.ˊ == paramLong)
        return ιﾌ1; 
    } 
    int j = this.ˌ;
    this.ᐝᵣ.ᐨẏ(paramInt).ᐨẏ(paramLong);
    this.ˌ += 2;
    return ᐨẏ(new ιﾌ(j, paramInt, paramLong, i));
  }
  
  private void ᐨẏ(int paramInt1, int paramInt2, long paramLong) {
    ᐨẏ(new ιﾌ(paramInt1, paramInt2, paramLong, ᐨẏ(paramInt2, paramLong)));
  }
  
  final int ˊ(String paramString1, String paramString2) {
    int i = ᐨẏ(12, paramString1, paramString2);
    for (ιﾌ ιﾌ1 = ᐨẏ(i); ιﾌ1 != null; ιﾌ1 = ιﾌ1.ᐨẏ) {
      if (ιﾌ1.ᙆ == 12 && ιﾌ1.ʹｨ == i && ιﾌ1.name.equals(paramString1) && ιﾌ1.ʹл.equals(paramString2))
        return ιﾌ1.ͺᴲ; 
    } 
    this.ᐝᵣ.ˊ(12, ՙᗮ(paramString1), ՙᗮ(paramString2));
    return (ᐨẏ(new ιﾌ(this.ˌ++, 12, paramString1, paramString2, i))).ͺᴲ;
  }
  
  private void ᐨẏ(int paramInt, String paramString1, String paramString2) {
    ᐨẏ(new ιﾌ(paramInt, 12, paramString1, paramString2, ᐨẏ(12, paramString1, paramString2)));
  }
  
  final int ՙᗮ(String paramString) {
    int i = ˊ(1, paramString);
    for (ιﾌ ιﾌ1 = ᐨẏ(i); ιﾌ1 != null; ιﾌ1 = ιﾌ1.ᐨẏ) {
      if (ιﾌ1.ᙆ == 1 && ιﾌ1.ʹｨ == i && ιﾌ1.ʹл.equals(paramString))
        return ιﾌ1.ͺᴲ; 
    } 
    this.ᐝᵣ.ᐨẏ(1).ᐨẏ(paramString);
    return (ᐨẏ(new ιﾌ(this.ˌ++, 1, paramString, i))).ͺᴲ;
  }
  
  private void ˊ(int paramInt, String paramString) {
    ᐨẏ(new ιﾌ(paramInt, 1, paramString, ˊ(1, paramString)));
  }
  
  final ˊᵃ ᐨẏ(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    int i = ᐨẏ(15, paramString1, paramString2, paramString3, paramInt);
    for (ιﾌ ιﾌ1 = ᐨẏ(i); ιﾌ1 != null; ιﾌ1 = ιﾌ1.ᐨẏ) {
      if (ιﾌ1.ᙆ == 15 && ιﾌ1.ʹｨ == i && ιﾌ1.ˊ == paramInt && ιﾌ1.ˈהּ.equals(paramString1) && ιﾌ1.name.equals(paramString2) && ιﾌ1.ʹл.equals(paramString3))
        return ιﾌ1; 
    } 
    if (paramInt <= 4) {
      this.ᐝᵣ.ᐨẏ(15, paramInt, (ᐨẏ(paramString1, paramString2, paramString3)).ͺᴲ);
    } else {
      this.ᐝᵣ.ᐨẏ(15, paramInt, (ᐨẏ(paramString1, paramString2, paramString3, paramBoolean)).ͺᴲ);
    } 
    return ᐨẏ(new ιﾌ(this.ˌ++, 15, paramString1, paramString2, paramString3, paramInt, i));
  }
  
  private void ˊ(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3) {
    int i = ᐨẏ(15, paramString1, paramString2, paramString3, paramInt2);
    ᐨẏ(new ιﾌ(paramInt1, 15, paramString1, paramString2, paramString3, paramInt2, i));
  }
  
  final ˊᵃ ᴵʖ(String paramString) {
    return ᐨẏ(16, paramString);
  }
  
  final ˊᵃ ᐨẏ(String paramString1, String paramString2, ʹō paramʹō, Object... paramVarArgs) {
    ˊᵃ ˊᵃ = ᐨẏ(paramʹō, paramVarArgs);
    return ᐨẏ(17, paramString1, paramString2, ˊᵃ.ͺᴲ);
  }
  
  final ˊᵃ ˊ(String paramString1, String paramString2, ʹō paramʹō, Object... paramVarArgs) {
    ˊᵃ ˊᵃ = ᐨẏ(paramʹō, paramVarArgs);
    return ᐨẏ(18, paramString1, paramString2, ˊᵃ.ͺᴲ);
  }
  
  private ˊᵃ ᐨẏ(int paramInt1, String paramString1, String paramString2, int paramInt2) {
    int i = ᐨẏ(paramInt1, paramString1, paramString2, paramInt2);
    for (ιﾌ ιﾌ1 = ᐨẏ(i); ιﾌ1 != null; ιﾌ1 = ιﾌ1.ᐨẏ) {
      if (ιﾌ1.ᙆ == paramInt1 && ιﾌ1.ʹｨ == i && ιﾌ1.ˊ == paramInt2 && ιﾌ1.name.equals(paramString1) && ιﾌ1.ʹл.equals(paramString2))
        return ιﾌ1; 
    } 
    this.ᐝᵣ.ˊ(paramInt1, paramInt2, ˊ(paramString1, paramString2));
    return ᐨẏ(new ιﾌ(this.ˌ++, paramInt1, null, paramString1, paramString2, paramInt2, i));
  }
  
  private void ᐨẏ(int paramInt1, int paramInt2, String paramString1, String paramString2, int paramInt3) {
    int i = ᐨẏ(paramInt1, paramString1, paramString2, paramInt3);
    ᐨẏ(new ιﾌ(paramInt2, paramInt1, null, paramString1, paramString2, paramInt3, i));
  }
  
  final ˊᵃ ﾞл(String paramString) {
    return ᐨẏ(19, paramString);
  }
  
  final ˊᵃ ʿᵉ(String paramString) {
    return ᐨẏ(20, paramString);
  }
  
  public ˊᵃ ᐨẏ(int paramInt, String paramString) {
    int i = ˊ(paramInt, paramString);
    for (ιﾌ ιﾌ1 = ᐨẏ(i); ιﾌ1 != null; ιﾌ1 = ιﾌ1.ᐨẏ) {
      if (ιﾌ1.ᙆ == paramInt && ιﾌ1.ʹｨ == i && ιﾌ1.ʹл.equals(paramString))
        return ιﾌ1; 
    } 
    this.ᐝᵣ.ˊ(paramInt, ՙᗮ(paramString));
    return ᐨẏ(new ιﾌ(this.ˌ++, paramInt, paramString, i));
  }
  
  private void ᐨẏ(int paramInt1, int paramInt2, String paramString) {
    ᐨẏ(new ιﾌ(paramInt1, paramInt2, paramString, ˊ(paramInt2, paramString)));
  }
  
  private ˊᵃ ᐨẏ(ʹō paramʹō, Object... paramVarArgs) {
    ʿᵉ ʿᵉ1;
    if ((ʿᵉ1 = this.ᔪ) == null)
      ʿᵉ1 = this.ᔪ = new ʿᵉ(); 
    int k;
    int[] arrayOfInt = new int[k = paramVarArgs.length];
    int m;
    for (m = 0; m < k; m++)
      arrayOfInt[m] = (ᐨẏ(paramVarArgs[m])).ͺᴲ; 
    m = ʿᵉ1.ʹﮃ;
    ʹō ʹō1;
    ʿᵉ1.ˊ((ᐨẏ((ʹō1 = paramʹō).ᙆ, (ʹō1 = paramʹō).ˈהּ, (ʹō1 = paramʹō).name, (ʹō1 = paramʹō).ᴵʖ, (ʹō1 = paramʹō).ˊ)).ͺᴲ);
    ʿᵉ1.ˊ(k);
    int n;
    for (n = 0; n < k; n++)
      ʿᵉ1.ˊ(arrayOfInt[n]); 
    n = ʿᵉ1.ʹﮃ - m;
    int i = paramʹō.hashCode();
    int j = (paramVarArgs = paramVarArgs).length;
    for (k = 0; k < j; k++) {
      Object object = paramVarArgs[k];
      i ^= object.hashCode();
    } 
    i &= Integer.MAX_VALUE;
    return ᐨẏ(m, n, i);
  }
  
  private ˊᵃ ᐨẏ(int paramInt1, int paramInt2, int paramInt3) {
    byte[] arrayOfByte = this.ᔪ.ˊ;
    for (ιﾌ ιﾌ1 = ᐨẏ(paramInt3); ιﾌ1 != null; ιﾌ1 = ιﾌ1.ᐨẏ) {
      if (ιﾌ1.ᙆ == 64 && ιﾌ1.ʹｨ == paramInt3) {
        int i = (int)ιﾌ1.ˊ;
        boolean bool = true;
        for (byte b = 0; b < paramInt2; b++) {
          if (arrayOfByte[paramInt1 + b] != arrayOfByte[i + b]) {
            bool = false;
            break;
          } 
        } 
        if (bool) {
          this.ᔪ.ʹﮃ = paramInt1;
          return ιﾌ1;
        } 
      } 
    } 
    return ᐨẏ(new ιﾌ(this.ՙῑ++, 64, paramInt1, paramInt3));
  }
  
  public final ˊᵃ ˊ(int paramInt) {
    return (ˊᵃ)this.ˊ[paramInt];
  }
  
  public final ᔪ ᐨẏ(int paramInt) {
    return (this.ᐨẏ[(int)((ιﾌ)this.ˊ[paramInt]).ˊ]).ʾ;
  }
  
  public final int ˍɫ(String paramString) {
    int i = ˊ(128, paramString);
    for (ιﾌ ιﾌ1 = ᐨẏ(i); ιﾌ1 != null; ιﾌ1 = ιﾌ1.ᐨẏ) {
      if (ιﾌ1.ᙆ == 128 && ιﾌ1.ʹｨ == i && ιﾌ1.ʹл.equals(paramString))
        return ιﾌ1.ͺᴲ; 
    } 
    return ᐨẏ(new ιﾌ(this.ʿᖨ, 128, paramString, i));
  }
  
  public final int ᐨẏ(String paramString, int paramInt) {
    int i = ᐨẏ(129, paramString, paramInt);
    for (ιﾌ ιﾌ1 = ᐨẏ(i); ιﾌ1 != null; ιﾌ1 = ιﾌ1.ᐨẏ) {
      if (ιﾌ1.ᙆ == 129 && ιﾌ1.ʹｨ == i && ιﾌ1.ˊ == paramInt && ιﾌ1.ʹл.equals(paramString))
        return ιﾌ1.ͺᴲ; 
    } 
    return ᐨẏ(new ιﾌ(this.ʿᖨ, 129, paramString, paramInt, i));
  }
  
  public final int ᐨẏ(String paramString, ᔪ paramᔪ) {
    int i = (ᐨẏ(paramᔪ)).ͺᴲ;
    int j = ᐨẏ(130, paramString, i);
    for (ιﾌ ιﾌ1 = ᐨẏ(j); ιﾌ1 != null; ιﾌ1 = ιﾌ1.ᐨẏ) {
      if (ιﾌ1.ᙆ == 130 && ιﾌ1.ʹｨ == j && ιﾌ1.ˊ == i && ιﾌ1.ʹл.equals(paramString))
        return ιﾌ1.ͺᴲ; 
    } 
    return ᐨẏ(new ιﾌ(this.ʿᖨ, 130, paramString, i, j));
  }
  
  public final int ˊ(int paramInt1, int paramInt2) {
    long l = (paramInt1 < paramInt2) ? (paramInt1 | paramInt2 << 32L) : (paramInt2 | paramInt1 << 32L);
    int k = paramInt1 + paramInt2;
    int j = 131;
    j = Integer.MAX_VALUE & j + k;
    for (ιﾌ ιﾌ1 = ᐨẏ(j); ιﾌ1 != null; ιﾌ1 = ιﾌ1.ᐨẏ) {
      if (ιﾌ1.ᙆ == 131 && ιﾌ1.ʹｨ == j && ιﾌ1.ˊ == l)
        return ιﾌ1.ᐨḶ; 
    } 
    String str1 = ((ιﾌ)this.ˊ[paramInt1]).ʹл;
    String str2 = ((ιﾌ)this.ˊ[paramInt2]).ʹл;
    int i = ˍɫ(this.ᐨẏ.ᐨẏ(str1, str2));
    (ᐨẏ(new ιﾌ(this.ʿᖨ, 131, l, j))).ᐨḶ = i;
    return i;
  }
  
  public int ᐨẏ(ιﾌ paramιﾌ) {
    if (this.ˊ == null)
      this.ˊ = (ʻւ[])new ιﾌ[16]; 
    if (this.ʿᖨ == this.ˊ.length) {
      ιﾌ[] arrayOfΙﾌ = new ιﾌ[2 * this.ˊ.length];
      System.arraycopy(this.ˊ, 0, arrayOfΙﾌ, 0, this.ˊ.length);
      this.ˊ = (ʻւ[])arrayOfΙﾌ;
    } 
    this.ˊ[this.ʿᖨ++] = (ʻւ)paramιﾌ;
    return (ᐨẏ(paramιﾌ)).ͺᴲ;
  }
  
  public ʻւ ᐨẏ(ᔪ paramᔪ) {
    if (this.ˊ == null) {
      this.ˊ = new ʻւ[16];
      this.ᐨẏ = new ʻւ[16];
    } 
    int i = System.identityHashCode(paramᔪ);
    ʻւ ʻւ1;
    for (ʻւ1 = this.ˊ[i % this.ˊ.length]; ʻւ1 != null && !zubdqvgt.G(ʻւ1.ʾ, paramᔪ); ʻւ1 = ʻւ1.ᐨẏ);
    if (ʻւ1 != null)
      return ʻւ1; 
    if (this.ˉﮞ > this.ˊ.length * 3 / 4) {
      int k;
      int m;
      ʻւ[] arrayOfʻւ = new ʻւ[k = ((m = this.ˊ.length) << 1) + 1];
      while (--m >= 0) {
        for (ʻւ ʻւ2 = this.ˊ[m]; ʻւ2 != null; ʻւ2 = ʻւ3) {
          int n = System.identityHashCode(ʻւ2.ʾ) % k;
          ʻւ ʻւ3 = ʻւ2.ᐨẏ;
          ʻւ2.ᐨẏ = arrayOfʻւ[n];
          arrayOfʻւ[n] = ʻւ2;
        } 
        m--;
      } 
      this.ˊ = arrayOfʻւ;
    } 
    if (this.ˉﮞ == this.ᐨẏ.length) {
      ʻւ[] arrayOfʻւ = new ʻւ[2 * this.ᐨẏ.length];
      System.arraycopy(this.ᐨẏ, 0, arrayOfʻւ, 0, this.ᐨẏ.length);
      this.ᐨẏ = arrayOfʻւ;
    } 
    ʻւ1 = new ʻւ(this.ˉﮞ, paramᔪ);
    int j = i % this.ˊ.length;
    ʻւ1.ᐨẏ = this.ˊ[j];
    this.ˊ[j] = ʻւ1;
    this.ᐨẏ[this.ˉﮞ++] = ʻւ1;
    return ʻւ1;
  }
  
  private static int ᴵʖ(int paramInt1, int paramInt2) {
    return Integer.MAX_VALUE & paramInt1 + paramInt2;
  }
  
  private static int ᐨẏ(int paramInt, long paramLong) {
    return Integer.MAX_VALUE & paramInt + (int)paramLong + (int)(paramLong >>> 32L);
  }
  
  private static int ˊ(int paramInt, String paramString) {
    return Integer.MAX_VALUE & paramInt + paramString.hashCode();
  }
  
  public static int ᐨẏ(int paramInt1, String paramString, int paramInt2) {
    return Integer.MAX_VALUE & paramInt1 + paramString.hashCode() + paramInt2;
  }
  
  private static int ᐨẏ(int paramInt, String paramString1, String paramString2) {
    return Integer.MAX_VALUE & 12 + paramString1.hashCode() * paramString2.hashCode();
  }
  
  private static int ᐨẏ(int paramInt1, String paramString1, String paramString2, int paramInt2) {
    return Integer.MAX_VALUE & paramInt1 + paramString1.hashCode() * paramString2.hashCode() * (paramInt2 + 1);
  }
  
  private static int ˊ(int paramInt, String paramString1, String paramString2, String paramString3) {
    return Integer.MAX_VALUE & paramInt + paramString1.hashCode() * paramString2.hashCode() * paramString3.hashCode();
  }
  
  private static int ᐨẏ(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2) {
    return Integer.MAX_VALUE & 15 + paramString1.hashCode() * paramString2.hashCode() * paramString3.hashCode() * paramInt2;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˌх.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */