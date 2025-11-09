package yyds.sniarbtej;

final class ˈے extends ʻล {
  final ˌх ᐨẏ;
  
  final int ʿʹ;
  
  final int ᵪ;
  
  final int ˎე;
  
  int ᐝᴾ;
  
  final ʿᵉ ͺо;
  
  int ˋᕁ;
  
  final ʿᵉ ٴӵ;
  
  int ˌﺙ;
  
  final ʿᵉ ᴵƚ;
  
  int ᐝᎫ;
  
  final ʿᵉ ˌ;
  
  int ͺᴘ;
  
  final ʿᵉ ˍ;
  
  int ˎᒩ;
  
  final ʿᵉ ʹō;
  
  int ـō;
  
  ˈے(ˌх paramˌх, int paramInt1, int paramInt2, int paramInt3) {
    super(589824);
    this.ᐨẏ = paramˌх;
    this.ʿʹ = paramInt1;
    this.ᵪ = paramInt2;
    this.ˎე = paramInt3;
    this.ͺо = new ʿᵉ();
    this.ٴӵ = new ʿᵉ();
    this.ᴵƚ = new ʿᵉ();
    this.ˌ = new ʿᵉ();
    this.ˍ = new ʿᵉ();
    this.ʹō = new ʿᵉ();
  }
  
  public final void ʿᵉ(String paramString) {
    String str = paramString;
    ˌх ˌх1;
    this.ـō = ((ˌх1 = this.ᐨẏ).ᐨẏ(7, str)).ͺᴲ;
  }
  
  public final void ʹﮃ(String paramString) {
    String str = paramString;
    ˌх ˌх1;
    this.ʹō.ˊ(((ˌх1 = this.ᐨẏ).ᐨẏ(20, str)).ͺᴲ);
    this.ˎᒩ++;
  }
  
  public final void ᐨẏ(String paramString1, int paramInt, String paramString2) {
    String str = paramString1;
    ˌх ˌх1;
    this.ͺо.ˊ(((ˌх1 = this.ᐨẏ).ᐨẏ(19, str)).ͺᴲ).ˊ(paramInt).ˊ((paramString2 == null) ? 0 : this.ᐨẏ.ՙᗮ(paramString2));
    this.ᐝᴾ++;
  }
  
  public final void ᐨẏ(String paramString, int paramInt, String... paramVarArgs) {
    String str = paramString;
    ˌх ˌх1;
    this.ٴӵ.ˊ(((ˌх1 = this.ᐨẏ).ᐨẏ(20, str)).ͺᴲ).ˊ(paramInt);
    if (paramVarArgs == null) {
      this.ٴӵ.ˊ(0);
    } else {
      this.ٴӵ.ˊ(paramVarArgs.length);
      String[] arrayOfString;
      paramInt = (arrayOfString = paramVarArgs).length;
      for (byte b = 0; b < paramInt; b++) {
        String str1 = arrayOfString[b];
        str = str1;
        ˌх ˌх2;
        this.ٴӵ.ˊ(((ˌх2 = this.ᐨẏ).ᐨẏ(19, str)).ͺᴲ);
      } 
    } 
    this.ˋᕁ++;
  }
  
  public final void ˊ(String paramString, int paramInt, String... paramVarArgs) {
    String str = paramString;
    ˌх ˌх1;
    this.ᴵƚ.ˊ(((ˌх1 = this.ᐨẏ).ᐨẏ(20, str)).ͺᴲ).ˊ(paramInt);
    if (paramVarArgs == null) {
      this.ᴵƚ.ˊ(0);
    } else {
      this.ᴵƚ.ˊ(paramVarArgs.length);
      String[] arrayOfString;
      paramInt = (arrayOfString = paramVarArgs).length;
      for (byte b = 0; b < paramInt; b++) {
        String str1 = arrayOfString[b];
        str = str1;
        ˌх ˌх2;
        this.ᴵƚ.ˊ(((ˌх2 = this.ᐨẏ).ᐨẏ(19, str)).ͺᴲ);
      } 
    } 
    this.ˌﺙ++;
  }
  
  public final void ՙᗮ(String paramString) {
    String str = paramString;
    ˌх ˌх1;
    this.ˌ.ˊ(((ˌх1 = this.ᐨẏ).ᐨẏ(7, str)).ͺᴲ);
    this.ᐝᎫ++;
  }
  
  public final void ᐨẏ(String paramString, String... paramVarArgs) {
    String str = paramString;
    ˌх ˌх1;
    this.ˍ.ˊ(((ˌх1 = this.ᐨẏ).ᐨẏ(7, str)).ͺᴲ);
    this.ˍ.ˊ(paramVarArgs.length);
    String[] arrayOfString;
    int i = (arrayOfString = paramVarArgs).length;
    for (byte b = 0; b < i; b++) {
      String str1 = arrayOfString[b];
      str = str1;
      ˌх ˌх2;
      this.ˍ.ˊ(((ˌх2 = this.ᐨẏ).ᐨẏ(7, str)).ͺᴲ);
    } 
    this.ͺᴘ++;
  }
  
  public final void ᐨẏ() {}
  
  final int ᐨẏ() {
    return 1 + ((this.ˎᒩ > 0) ? 1 : 0) + ((this.ـō > 0) ? 1 : 0);
  }
  
  final int ˌ() {
    "获塦딞阊ފ迟䒻".toCharArray()[5] = (char)("获塦딞阊ފ迟䒻".toCharArray()[5] ^ 0x51CF);
    this.ᐨẏ.ՙᗮ(ˍɫ$יς.J("获塦딞阊ފ迟䒻".toCharArray(), (short)11750, (short)2, (byte)4));
    int i = 22 + this.ͺо.ʹﮃ + this.ٴӵ.ʹﮃ + this.ᴵƚ.ʹﮃ + this.ˌ.ʹﮃ + this.ˍ.ʹﮃ;
    if (this.ˎᒩ > 0) {
      "἞箍钪警灢ⴖ謨董⣶셖ོ먚棢ڥಹ".toCharArray()[13] = (char)("἞箍钪警灢ⴖ謨董⣶셖ོ먚棢ڥಹ".toCharArray()[13] ^ 0x75B1);
      this.ᐨẏ.ՙᗮ(ˍɫ$יς.J("἞箍钪警灢ⴖ謨董⣶셖ོ먚棢ڥಹ".toCharArray(), (short)26625, (short)3, (byte)4));
      i += 8 + this.ʹō.ʹﮃ;
    } 
    if (this.ـō > 0) {
      "⅑曚䭨ᦒ௬쁩忩䜨裊鯟埞뭄臊ၓ彐".toCharArray()[1] = (char)("⅑曚䭨ᦒ௬쁩忩䜨裊鯟埞뭄臊ၓ彐".toCharArray()[1] ^ 0xCCF);
      this.ᐨẏ.ՙᗮ(ˍɫ$יς.J("⅑曚䭨ᦒ௬쁩忩䜨裊鯟埞뭄臊ၓ彐".toCharArray(), (short)18127, (short)3, (byte)5));
      i += 8;
    } 
    return i;
  }
  
  final void ﾞл(ʿᵉ paramʿᵉ) {
    int i = 16 + this.ͺо.ʹﮃ + this.ٴӵ.ʹﮃ + this.ᴵƚ.ʹﮃ + this.ˌ.ʹﮃ + this.ˍ.ʹﮃ;
    "쟾驋棕䒷齖㦽".toCharArray()[3] = (char)("쟾驋棕䒷齖㦽".toCharArray()[3] ^ 0x28D2);
    paramʿᵉ.ˊ(this.ᐨẏ.ՙᗮ(ˉﻤ$ͺſ.v("쟾驋棕䒷齖㦽".toCharArray(), (short)3384, 0, (short)2))).ᴵʖ(i).ˊ(this.ʿʹ).ˊ(this.ᵪ).ˊ(this.ˎე).ˊ(this.ᐝᴾ).ᐨẏ(this.ͺо.ˊ, 0, this.ͺо.ʹﮃ).ˊ(this.ˋᕁ).ᐨẏ(this.ٴӵ.ˊ, 0, this.ٴӵ.ʹﮃ).ˊ(this.ˌﺙ).ᐨẏ(this.ᴵƚ.ˊ, 0, this.ᴵƚ.ʹﮃ).ˊ(this.ᐝᎫ).ᐨẏ(this.ˌ.ˊ, 0, this.ˌ.ʹﮃ).ˊ(this.ͺᴘ).ᐨẏ(this.ˍ.ˊ, 0, this.ˍ.ʹﮃ);
    if (this.ˎᒩ > 0) {
      "꫐=칪¨嬷᱕㛐캺ⳤ狩☐啤⻱堚".toCharArray()[13] = (char)("꫐=칪¨嬷᱕㛐캺ⳤ狩☐啤⻱堚".toCharArray()[13] ^ 0x1E4E);
      paramʿᵉ.ˊ(this.ᐨẏ.ՙᗮ(ˉﻤ$ͺſ.v("꫐=칪¨嬷᱕㛐캺ⳤ狩☐啤⻱堚".toCharArray(), (short)29780, 4, (short)4))).ᴵʖ(2 + this.ʹō.ʹﮃ).ˊ(this.ˎᒩ).ᐨẏ(this.ʹō.ˊ, 0, this.ʹō.ʹﮃ);
    } 
    if (this.ـō > 0) {
      "㻅뉥⚢랶巑꿡??鮝灛枼ᣦ?➕".toCharArray()[4] = (char)("㻅뉥⚢랶巑꿡??鮝灛枼ᣦ?➕".toCharArray()[4] ^ 0x764D);
      paramʿᵉ.ˊ(this.ᐨẏ.ՙᗮ(ˉﻤ$ͺſ.v("㻅뉥⚢랶巑꿡??鮝灛枼ᣦ?➕".toCharArray(), (short)28743, 0, (short)3))).ᴵʖ(2).ˊ(this.ـō);
    } 
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˈے.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */