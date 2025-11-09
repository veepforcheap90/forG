package yyds.sniarbtej;

import ylt.pmn.zubdqvgt;

public class ʻᒱ extends ˉｓ {
  private static final ˑܘ ͺо = ˑܘ.ˊ(ˏȓ$ᴵЃ.E("觻材ゞ㪫뒘ﮏ᫁묒莆቗ꬕ쒜塈釕嘺䴼㗿".toCharArray(), (short)29718, (short)4, (short)1));
  
  private int[] ˌ = new int[40];
  
  private Object[] ﾞл = new Object[20];
  
  protected final int ﮊ;
  
  private int ˑḸ;
  
  private ʻᒱ(int paramInt, String paramString, ˉｓ paramˉｓ) {
    this(589824, paramInt, paramString, paramˉｓ);
    if (!zubdqvgt.G(getClass(), ʻᒱ.class))
      throw new IllegalStateException(); 
  }
  
  protected ʻᒱ(int paramInt1, int paramInt2, String paramString, ˉｓ paramˉｓ) {
    super(paramInt1, paramˉｓ);
    this.ˑḸ = ((0x8 & paramInt2) == 0) ? 1 : 0;
    ˑܘ[] arrayOfˑܘ;
    paramInt2 = (arrayOfˑܘ = ˑܘ.ᐨẏ(paramString)).length;
    for (byte b = 0; b < paramInt2; b++) {
      ˑܘ ˑܘ1 = arrayOfˑܘ[b];
      this.ˑḸ += ˑܘ1.ˍɫ();
    } 
    this.ﮊ = this.ˑḸ;
  }
  
  public void ᴵʖ(int paramInt1, int paramInt2) {
    ˑܘ ˑܘ1;
    switch (paramInt1) {
      case 22:
      case 55:
        ˑܘ1 = ˑܘ.ˍɫ;
        break;
      case 24:
      case 57:
        ˑܘ1 = ˑܘ.ʽ;
        break;
      case 23:
      case 56:
        ˑܘ1 = ˑܘ.ՙᗮ;
        break;
      case 21:
      case 54:
        ˑܘ1 = ˑܘ.ʹﮃ;
        break;
      case 25:
      case 58:
      case 169:
        ˑܘ1 = ͺо;
        break;
      default:
        "ẳԞ퍘鿹鲐酞ứ钶༂繽?兤ἣ䙫".toCharArray()[11] = (char)("ẳԞ퍘鿹鲐酞ứ钶༂繽?兤ἣ䙫".toCharArray()[11] ^ 0x736);
        throw new IllegalArgumentException(ᐝᵣ$ﾞﾇ.j("ẳԞ퍘鿹鲐酞ứ钶༂繽?兤ἣ䙫".toCharArray(), (short)21028, 5, (short)5) + paramInt1);
    } 
    super.ᴵʖ(paramInt1, ᐨẏ(paramInt2, ˑܘ1));
  }
  
  public final void ﾞл(int paramInt1, int paramInt2) {
    super.ﾞл(ᐨẏ(paramInt1, ˑܘ.ʹﮃ), paramInt2);
  }
  
  public final void ʿᵉ(int paramInt1, int paramInt2) {
    super.ʿᵉ(paramInt1, this.ˑḸ);
  }
  
  public final void ᐨẏ(String paramString1, String paramString2, String paramString3, ᔪ paramᔪ1, ᔪ paramᔪ2, int paramInt) {
    paramInt = ᐨẏ(paramInt, ˑܘ.ᐨẏ(paramString2));
    super.ᐨẏ(paramString1, paramString2, paramString3, paramᔪ1, paramᔪ2, paramInt);
  }
  
  public final ᐨẏ ᐨẏ(int paramInt, ˏɪ paramˏɪ, ᔪ[] paramArrayOfᔪ1, ᔪ[] paramArrayOfᔪ2, int[] paramArrayOfint, String paramString, boolean paramBoolean) {
    ˑܘ ˑܘ1 = ˑܘ.ᐨẏ(paramString);
    int[] arrayOfInt = new int[paramArrayOfint.length];
    for (byte b = 0; b < arrayOfInt.length; b++)
      arrayOfInt[b] = ᐨẏ(paramArrayOfint[b], ˑܘ1); 
    return super.ᐨẏ(paramInt, paramˏɪ, paramArrayOfᔪ1, paramArrayOfᔪ2, arrayOfInt, paramString, paramBoolean);
  }
  
  public final void ᐨẏ(int paramInt1, int paramInt2, Object[] paramArrayOfObject1, int paramInt3, Object[] paramArrayOfObject2) {
    if (paramInt1 != -1) {
      "偔༻淜됏욗ྔ欱?듛懇ꑺ蕡⋉啖䷰睧햗꿀쩣द韝檘撘帿鰰얟걢㉄鵬쎇ʍၴ楥?绬⯃迡趛큸ᯨ䣟?凯줠囒Ѳ?ᔄ琔莌휡躄ᾬ鳓ྒྷ눬”♲⏗Ꚃの?ᣠ謙毩궮浩ㆾ뎦㨁⻱".toCharArray()[2] = (char)("偔༻淜됏욗ྔ欱?듛懇ꑺ蕡⋉啖䷰睧햗꿀쩣द韝檘撘帿鰰얟걢㉄鵬쎇ʍၴ楥?绬⯃迡趛큸ᯨ䣟?凯줠囒Ѳ?ᔄ琔莌휡躄ᾬ鳓ྒྷ눬”♲⏗Ꚃの?ᣠ謙毩궮浩ㆾ뎦㨁⻱".toCharArray()[2] ^ 0x5BD);
      throw new IllegalArgumentException(ˏȓ$ᴵЃ.E("偔༻淜됏욗ྔ欱?듛懇ꑺ蕡⋉啖䷰睧햗꿀쩣द韝檘撘帿鰰얟걢㉄鵬쎇ʍၴ楥?绬⯃迡趛큸ᯨ䣟?凯줠囒Ѳ?ᔄ琔莌휡躄ᾬ鳓ྒྷ눬”♲⏗Ꚃの?ᣠ謙毩궮浩ㆾ뎦㨁⻱".toCharArray(), (short)12075, (short)3, (short)1));
    } 
    Object[] arrayOfObject = new Object[this.ﾞл.length];
    System.arraycopy(this.ﾞл, 0, arrayOfObject, 0, arrayOfObject.length);
    int i = 0;
    byte b1;
    for (b1 = 0; b1 < paramInt2; b1++) {
      Object object;
      if (!zubdqvgt.G(object = paramArrayOfObject1[b1], ـﭔ.ᐨẏ)) {
        ˑܘ ˑܘ1 = ͺо;
        if (zubdqvgt.G(object, ـﭔ.ˊ)) {
          ˑܘ1 = ˑܘ.ʹﮃ;
        } else if (zubdqvgt.G(object, ـﭔ.ᴵʖ)) {
          ˑܘ1 = ˑܘ.ՙᗮ;
        } else if (zubdqvgt.G(object, ـﭔ.ʿᵉ)) {
          ˑܘ1 = ˑܘ.ˍɫ;
        } else if (zubdqvgt.G(object, ـﭔ.ﾞл)) {
          ˑܘ1 = ˑܘ.ʽ;
        } else if (object instanceof String) {
          ˑܘ1 = ˑܘ.ˊ((String)object);
        } 
        ˊ(ᐨẏ(i, ˑܘ1), object);
      } 
      i += (zubdqvgt.G(object, ـﭔ.ʿᵉ) || zubdqvgt.G(object, ـﭔ.ﾞл)) ? 2 : 1;
    } 
    i = 0;
    b1 = 0;
    byte b2 = 0;
    while (i < this.ﾞл.length) {
      Object object = this.ﾞл[i];
      i += (zubdqvgt.G(object, ـﭔ.ʿᵉ) || zubdqvgt.G(object, ـﭔ.ﾞл)) ? 2 : 1;
      if (object != null && !zubdqvgt.G(object, ـﭔ.ᐨẏ)) {
        this.ﾞл[b1++] = object;
        b2 = b1;
        continue;
      } 
      this.ﾞл[b1++] = ـﭔ.ᐨẏ;
    } 
    super.ᐨẏ(paramInt1, b2, this.ﾞл, paramInt3, paramArrayOfObject2);
    this.ﾞл = arrayOfObject;
  }
  
  private int ᐨẏ(ˑܘ paramˑܘ) {
    Integer integer;
    String str;
    int i;
    switch (paramˑܘ.ˉｓ()) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        integer = ـﭔ.ˊ;
        i = ˊ(paramˑܘ);
        ᐨẏ(i, paramˑܘ);
        ˊ(i, integer);
        return i;
      case 6:
        integer = ـﭔ.ᴵʖ;
        i = ˊ(paramˑܘ);
        ᐨẏ(i, paramˑܘ);
        ˊ(i, integer);
        return i;
      case 7:
        integer = ـﭔ.ʿᵉ;
        i = ˊ(paramˑܘ);
        ᐨẏ(i, paramˑܘ);
        ˊ(i, integer);
        return i;
      case 8:
        integer = ـﭔ.ﾞл;
        i = ˊ(paramˑܘ);
        ᐨẏ(i, paramˑܘ);
        ˊ(i, integer);
        return i;
      case 9:
        str = paramˑܘ.ᴵʖ();
        i = ˊ(paramˑܘ);
        ᐨẏ(i, paramˑܘ);
        ˊ(i, str);
        return i;
      case 10:
        str = paramˑܘ.ՙᗮ();
        i = ˊ(paramˑܘ);
        ᐨẏ(i, paramˑܘ);
        ˊ(i, str);
        return i;
    } 
    throw new AssertionError();
  }
  
  private static void ˌᵋ() {}
  
  protected void ᐨẏ(int paramInt, ˑܘ paramˑܘ) {}
  
  private void ˊ(int paramInt, Object paramObject) {
    int i = this.ﾞл.length;
    if (paramInt >= i) {
      Object[] arrayOfObject = new Object[Math.max(2 * i, paramInt + 1)];
      System.arraycopy(this.ﾞл, 0, arrayOfObject, 0, i);
      this.ﾞл = arrayOfObject;
    } 
    this.ﾞл[paramInt] = paramObject;
  }
  
  private int ᐨẏ(int paramInt, ˑܘ paramˑܘ) {
    if (paramInt + paramˑܘ.ˍɫ() <= this.ﮊ)
      return paramInt; 
    paramInt = 2 * paramInt + paramˑܘ.ˍɫ() - 1;
    int i = this.ˌ.length;
    if (paramInt >= i) {
      int[] arrayOfInt = new int[Math.max(2 * i, paramInt + 1)];
      System.arraycopy(this.ˌ, 0, arrayOfInt, 0, i);
      this.ˌ = arrayOfInt;
    } 
    int j;
    if ((j = this.ˌ[paramInt]) == 0) {
      j = ˊ(paramˑܘ);
      ᐨẏ(j, paramˑܘ);
      this.ˌ[paramInt] = j + 1;
    } else {
      j--;
    } 
    return j;
  }
  
  private int ˊ(ˑܘ paramˑܘ) {
    int i = this.ˑḸ;
    this.ˑḸ += paramˑܘ.ˍɫ();
    return i;
  }
  
  static {
    "觻材ゞ㪫뒘ﮏ᫁묒莆቗ꬕ쒜塈釕嘺䴼㗿".toCharArray()[1] = (char)("觻材ゞ㪫뒘ﮏ᫁묒莆቗ꬕ쒜塈釕嘺䴼㗿".toCharArray()[1] ^ 0x274D);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ʻᒱ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */