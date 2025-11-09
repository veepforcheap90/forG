package yyds.sniarbtej;

final class ˊ extends ᐨẏ {
  private final ˌх ᐨẏ;
  
  private final boolean ᐨẏ;
  
  private final ʿᵉ ᐨẏ;
  
  private final int ˊ;
  
  private int ᴵʖ;
  
  private final ˊ ᐨẏ;
  
  private ˊ ˊ;
  
  ˊ(ˌх paramˌх, boolean paramBoolean, ʿᵉ paramʿᵉ, ˊ paramˊ) {
    super(589824);
    this.ᐨẏ = (ˊ)paramˌх;
    this.ᐨẏ = paramBoolean;
    this.ᐨẏ = (ˊ)paramʿᵉ;
    this.ˊ = (paramʿᵉ.ʹﮃ == 0) ? -1 : (paramʿᵉ.ʹﮃ - 2);
    this.ᐨẏ = paramˊ;
    if (paramˊ != null)
      paramˊ.ˊ = this; 
  }
  
  static ˊ ᐨẏ(ˌх paramˌх, String paramString, ˊ paramˊ) {
    ʿᵉ ʿᵉ1;
    (ʿᵉ1 = new ʿᵉ()).ˊ(paramˌх.ՙᗮ(paramString)).ˊ(0);
    return new ˊ(paramˌх, true, ʿᵉ1, paramˊ);
  }
  
  static ˊ ᐨẏ(ˌх paramˌх, int paramInt, ˏɪ paramˏɪ, String paramString, ˊ paramˊ) {
    ʿᵉ ʿᵉ1 = new ʿᵉ();
    ʿᵉ ʿᵉ2 = ʿᵉ1;
    switch ((paramInt = paramInt) >>> 24) {
      case 0:
      case 1:
      case 22:
        ʿᵉ2.ˊ(paramInt >>> 16);
        ˏɪ.ᐨẏ(paramˏɪ, ʿᵉ1);
        ʿᵉ1.ˊ(paramˌх.ՙᗮ(paramString)).ˊ(0);
        return new ˊ(paramˌх, true, ʿᵉ1, paramˊ);
      case 19:
      case 20:
      case 21:
        ʿᵉ2.ᐨẏ(paramInt >>> 24);
        ˏɪ.ᐨẏ(paramˏɪ, ʿᵉ1);
        ʿᵉ1.ˊ(paramˌх.ՙᗮ(paramString)).ˊ(0);
        return new ˊ(paramˌх, true, ʿᵉ1, paramˊ);
      case 71:
      case 72:
      case 73:
      case 74:
      case 75:
        ʿᵉ2.ᴵʖ(paramInt);
        ˏɪ.ᐨẏ(paramˏɪ, ʿᵉ1);
        ʿᵉ1.ˊ(paramˌх.ՙᗮ(paramString)).ˊ(0);
        return new ˊ(paramˌх, true, ʿᵉ1, paramˊ);
      case 16:
      case 17:
      case 18:
      case 23:
      case 66:
      case 67:
      case 68:
      case 69:
      case 70:
        ʿᵉ2.ˊ(paramInt >>> 24, (paramInt & 0xFFFF00) >> 8);
        ˏɪ.ᐨẏ(paramˏɪ, ʿᵉ1);
        ʿᵉ1.ˊ(paramˌх.ՙᗮ(paramString)).ˊ(0);
        return new ˊ(paramˌх, true, ʿᵉ1, paramˊ);
    } 
    throw new IllegalArgumentException();
  }
  
  public final void ᐨẏ(String paramString, Object paramObject) {
    int i;
    this.ᴵʖ++;
    if (this.ᐨẏ != null)
      this.ᐨẏ.ˊ(this.ᐨẏ.ՙᗮ(paramString)); 
    if (paramObject instanceof String) {
      this.ᐨẏ.ˊ(115, this.ᐨẏ.ՙᗮ((String)paramObject));
      return;
    } 
    if (paramObject instanceof Byte) {
      byte b = ((Byte)paramObject).byteValue();
      ˊ ˊ1;
      this.ᐨẏ.ˊ(66, ((ˊ1 = this.ᐨẏ).ᐨẏ(3, b)).ͺᴲ);
      return;
    } 
    if (paramObject instanceof Boolean) {
      boolean bool1 = ((Boolean)paramObject).booleanValue() ? true : false;
      boolean bool2 = bool1;
      ˊ ˊ1;
      this.ᐨẏ.ˊ(90, ((ˊ1 = this.ᐨẏ).ᐨẏ(3, bool2)).ͺᴲ);
      return;
    } 
    if (paramObject instanceof Character) {
      char c = ((Character)paramObject).charValue();
      ˊ ˊ1;
      this.ᐨẏ.ˊ(67, ((ˊ1 = this.ᐨẏ).ᐨẏ(3, c)).ͺᴲ);
      return;
    } 
    if (paramObject instanceof Short) {
      short s = ((Short)paramObject).shortValue();
      ˊ ˊ1;
      this.ᐨẏ.ˊ(83, ((ˊ1 = this.ᐨẏ).ᐨẏ(3, s)).ͺᴲ);
      return;
    } 
    if (paramObject instanceof ˑܘ) {
      this.ᐨẏ.ˊ(99, this.ᐨẏ.ՙᗮ(((ˑܘ)paramObject).ᴵʖ()));
      return;
    } 
    if (paramObject instanceof byte[]) {
      byte[] arrayOfByte = (byte[])paramObject;
      this.ᐨẏ.ˊ(91, arrayOfByte.length);
      i = (arrayOfByte = arrayOfByte).length;
      for (byte b = 0; b < i; b++) {
        byte b1 = arrayOfByte[b];
        byte b2 = b1;
        ˊ ˊ1;
        this.ᐨẏ.ˊ(66, ((ˊ1 = this.ᐨẏ).ᐨẏ(3, b2)).ͺᴲ);
      } 
      return;
    } 
    if (i instanceof boolean[]) {
      boolean[] arrayOfBoolean = (boolean[])i;
      this.ᐨẏ.ˊ(91, arrayOfBoolean.length);
      i = (arrayOfBoolean = arrayOfBoolean).length;
      for (byte b = 0; b < i; b++) {
        boolean bool = arrayOfBoolean[b];
        boolean bool1 = bool ? true : false;
        ˊ ˊ1;
        this.ᐨẏ.ˊ(90, ((ˊ1 = this.ᐨẏ).ᐨẏ(3, bool1)).ͺᴲ);
      } 
      return;
    } 
    if (i instanceof short[]) {
      short[] arrayOfShort = (short[])i;
      this.ᐨẏ.ˊ(91, arrayOfShort.length);
      i = (arrayOfShort = arrayOfShort).length;
      for (byte b = 0; b < i; b++) {
        short s = arrayOfShort[b];
        short s1 = s;
        ˊ ˊ1;
        this.ᐨẏ.ˊ(83, ((ˊ1 = this.ᐨẏ).ᐨẏ(3, s1)).ͺᴲ);
      } 
      return;
    } 
    if (i instanceof char[]) {
      char[] arrayOfChar = (char[])i;
      this.ᐨẏ.ˊ(91, arrayOfChar.length);
      i = (arrayOfChar = arrayOfChar).length;
      for (byte b = 0; b < i; b++) {
        char c = arrayOfChar[b];
        char c1 = c;
        ˊ ˊ1;
        this.ᐨẏ.ˊ(67, ((ˊ1 = this.ᐨẏ).ᐨẏ(3, c1)).ͺᴲ);
      } 
      return;
    } 
    if (i instanceof int[]) {
      int[] arrayOfInt = (int[])i;
      this.ᐨẏ.ˊ(91, arrayOfInt.length);
      i = (arrayOfInt = arrayOfInt).length;
      for (byte b = 0; b < i; b++) {
        int j = arrayOfInt[b];
        int k = j;
        ˊ ˊ1;
        this.ᐨẏ.ˊ(73, ((ˊ1 = this.ᐨẏ).ᐨẏ(3, k)).ͺᴲ);
      } 
      return;
    } 
    if (i instanceof long[]) {
      long[] arrayOfLong = (long[])i;
      this.ᐨẏ.ˊ(91, arrayOfLong.length);
      i = (arrayOfLong = arrayOfLong).length;
      for (byte b = 0; b < i; b++) {
        long l1 = arrayOfLong[b];
        long l2 = l1;
        ˊ ˊ1;
        this.ᐨẏ.ˊ(74, ((ˊ1 = this.ᐨẏ).ᐨẏ(5, l2)).ͺᴲ);
      } 
      return;
    } 
    if (i instanceof float[]) {
      float[] arrayOfFloat = (float[])i;
      this.ᐨẏ.ˊ(91, arrayOfFloat.length);
      i = (arrayOfFloat = arrayOfFloat).length;
      for (byte b = 0; b < i; b++) {
        float f = arrayOfFloat[b];
        this.ᐨẏ.ˊ(70, (this.ᐨẏ.ᐨẏ(f)).ͺᴲ);
      } 
      return;
    } 
    if (i instanceof double[]) {
      double[] arrayOfDouble = (double[])i;
      this.ᐨẏ.ˊ(91, arrayOfDouble.length);
      i = (arrayOfDouble = arrayOfDouble).length;
      for (byte b = 0; b < i; b++) {
        double d = arrayOfDouble[b];
        this.ᐨẏ.ˊ(68, (this.ᐨẏ.ᐨẏ(d)).ͺᴲ);
      } 
      return;
    } 
    ˊᵃ ˊᵃ = this.ᐨẏ.ᐨẏ(i);
    "蝁仪๋踅倥倫巆".toCharArray()[1] = (char)("蝁仪๋踅倥倫巆".toCharArray()[1] ^ 0xDDB);
    this.ᐨẏ.ˊ(ˏȓ$ᴵЃ.E("蝁仪๋踅倥倫巆".toCharArray(), (short)11136, (short)3, (short)5).charAt(ˊᵃ.ᙆ), ˊᵃ.ͺᴲ);
  }
  
  public final void ᐨẏ(String paramString1, String paramString2, String paramString3) {
    this.ᴵʖ++;
    if (this.ᐨẏ != null)
      this.ᐨẏ.ˊ(this.ᐨẏ.ՙᗮ(paramString1)); 
    this.ᐨẏ.ˊ(101, this.ᐨẏ.ՙᗮ(paramString2)).ˊ(this.ᐨẏ.ՙᗮ(paramString3));
  }
  
  public final ᐨẏ ᐨẏ(String paramString1, String paramString2) {
    this.ᴵʖ++;
    if (this.ᐨẏ != null)
      this.ᐨẏ.ˊ(this.ᐨẏ.ՙᗮ(paramString1)); 
    this.ᐨẏ.ˊ(64, this.ᐨẏ.ՙᗮ(paramString2)).ˊ(0);
    return new ˊ((ˌх)this.ᐨẏ, true, (ʿᵉ)this.ᐨẏ, null);
  }
  
  public final ᐨẏ ᐨẏ(String paramString) {
    this.ᴵʖ++;
    if (this.ᐨẏ != null)
      this.ᐨẏ.ˊ(this.ᐨẏ.ՙᗮ(paramString)); 
    this.ᐨẏ.ˊ(91, 0);
    return new ˊ((ˌх)this.ᐨẏ, false, (ʿᵉ)this.ᐨẏ, null);
  }
  
  public final void ᐨẏ() {
    if (this.ˊ != -1) {
      byte[] arrayOfByte;
      (arrayOfByte = ((ʿᵉ)this.ᐨẏ).ˊ)[this.ˊ] = (byte)(this.ᴵʖ >>> 8);
      arrayOfByte[this.ˊ + 1] = (byte)this.ᴵʖ;
    } 
  }
  
  final int ᐨẏ(String paramString) {
    if (paramString != null)
      this.ᐨẏ.ՙᗮ(paramString); 
    int i = 8;
    for (ˊ ˊ1 = this; ˊ1 != null; ˊ1 = ˊ1.ᐨẏ)
      i += ((ʿᵉ)ˊ1.ᐨẏ).ʹﮃ; 
    return i;
  }
  
  static int ᐨẏ(ˊ paramˊ1, ˊ paramˊ2, ˊ paramˊ3, ˊ paramˊ4) {
    int i = 0;
    if (paramˊ1 != null) {
      "狻黔?◔靃䁼딅表녂꒎朌䂈規즹骎뾹?컳凔㑲整鹺䵘ບ".toCharArray()[4] = (char)("狻黔?◔靃䁼딅表녂꒎朌䂈規즹骎뾹?컳凔㑲整鹺䵘ບ".toCharArray()[4] ^ 0x22BE);
      i = 0 + paramˊ1.ᐨẏ(ᐨẏ$ᐝт.W("狻黔?◔靃䁼딅表녂꒎朌䂈規즹骎뾹?컳凔㑲整鹺䵘ບ".toCharArray(), (short)25886, (byte)5, (short)1));
    } 
    if (paramˊ2 != null) {
      "큟ꯠ狊뗩?௡䰛戒띱凒昙誥䥉낒ᚻ앦絽␍줾䠏㪤䮴솦ꋴည".toCharArray()[22] = (char)("큟ꯠ狊뗩?௡䰛戒띱凒昙誥䥉낒ᚻ앦絽␍줾䠏㪤䮴솦ꋴည".toCharArray()[22] ^ 0x1ABF);
      i += paramˊ2.ᐨẏ(ᐨẏ$ᐝт.W("큟ꯠ狊뗩?௡䰛戒띱凒昙誥䥉낒ᚻ앦絽␍줾䠏㪤䮴솦ꋴည".toCharArray(), (short)30402, (byte)1, (short)0));
    } 
    if (paramˊ3 != null) {
      "찜굈꿌㡯塧岸倗䑩䢭䭤웆믨ᴉ⑞઱䈥䈞쒳㤾나럫?ൄ䁴㲱㛀᷏ඩ㈬".toCharArray()[10] = (char)("찜굈꿌㡯塧岸倗䑩䢭䭤웆믨ᴉ⑞઱䈥䈞쒳㤾나럫?ൄ䁴㲱㛀᷏ඩ㈬".toCharArray()[10] ^ 0x64A6);
      i += paramˊ3.ᐨẏ(ᐨẏ$ᐝт.W("찜굈꿌㡯塧岸倗䑩䢭䭤웆믨ᴉ⑞઱䈥䈞쒳㤾나럫?ൄ䁴㲱㛀᷏ඩ㈬".toCharArray(), (short)22984, (byte)4, (short)3));
    } 
    if (paramˊ4 != null) {
      "ߏ䧮楛㠗⣵憖蘆漣돞⼳ៀ?贴屠ᚷ喠ꧢ⚍뢙䢫緊㬍ꀓ₷ꋞ䃫ꋝ萋⅂ඇ".toCharArray()[12] = (char)("ߏ䧮楛㠗⣵憖蘆漣돞⼳ៀ?贴屠ᚷ喠ꧢ⚍뢙䢫緊㬍ꀓ₷ꋞ䃫ꋝ萋⅂ඇ".toCharArray()[12] ^ 0x5F0D);
      i += paramˊ4.ᐨẏ(ᐨẏ$ᐝт.W("ߏ䧮楛㠗⣵憖蘆漣돞⼳ៀ?贴屠ᚷ喠ꧢ⚍뢙䢫緊㬍ꀓ₷ꋞ䃫ꋝ萋⅂ඇ".toCharArray(), (short)26366, (byte)0, (short)2));
    } 
    return i;
  }
  
  final void ᐨẏ(int paramInt, ʿᵉ paramʿᵉ) {
    int i = 2;
    byte b = 0;
    ˊ ˊ1 = this;
    ˊ ˊ2 = null;
    while (ˊ1 != null) {
      ˊ1.ᐨẏ();
      i += ((ʿᵉ)ˊ1.ᐨẏ).ʹﮃ;
      b++;
      ˊ2 = ˊ1;
      ˊ1 = ˊ1.ᐨẏ;
    } 
    paramʿᵉ.ˊ(paramInt);
    paramʿᵉ.ᴵʖ(i);
    paramʿᵉ.ˊ(b);
    for (ˊ1 = ˊ2; ˊ1 != null; ˊ1 = ˊ1.ˊ)
      paramʿᵉ.ᐨẏ(((ʿᵉ)ˊ1.ᐨẏ).ˊ, 0, ((ʿᵉ)ˊ1.ᐨẏ).ʹﮃ); 
  }
  
  static void ᐨẏ(ˌх paramˌх, ˊ paramˊ1, ˊ paramˊ2, ˊ paramˊ3, ˊ paramˊ4, ʿᵉ paramʿᵉ) {
    if (paramˊ1 != null) {
      "꘭칖㫸댤鬃囅य剆ㅙ巫祈贕푴寵侑格ꦱ몘خ㈭䳲︥탲딟㋧".toCharArray()[20] = (char)("꘭칖㫸댤鬃囅य剆ㅙ巫祈贕푴寵侑格ꦱ몘خ㈭䳲︥탲딟㋧".toCharArray()[20] ^ 0x6576);
      paramˊ1.ᐨẏ(paramˌх.ՙᗮ(ˍɫ$יς.J("꘭칖㫸댤鬃囅य剆ㅙ巫祈贕푴寵侑格ꦱ몘خ㈭䳲︥탲딟㋧".toCharArray(), (short)29649, (short)4, (byte)0)), paramʿᵉ);
    } 
    if (paramˊ2 != null) {
      "Ȿ孼⫈⻎鮯ᓖ殡썹ᱧ✠䐢촐漖▇愴ﶷस᧬햚趯톭䐷꥞䥖⥏".toCharArray()[3] = (char)("Ȿ孼⫈⻎鮯ᓖ殡썹ᱧ✠䐢촐漖▇愴ﶷस᧬햚趯톭䐷꥞䥖⥏".toCharArray()[3] ^ 0x3CD7);
      paramˊ2.ᐨẏ(paramˌх.ՙᗮ(ˍɫ$יς.J("Ȿ孼⫈⻎鮯ᓖ殡썹ᱧ✠䐢촐漖▇愴ﶷस᧬햚趯톭䐷꥞䥖⥏".toCharArray(), (short)16603, (short)3, (byte)2)), paramʿᵉ);
    } 
    if (paramˊ3 != null) {
      "♞暑꺄䠎헰◧䡏볬첕ी蒋㭬뗿ꪊ间豹䍭摏᧒莋賬萺漻㞇ꜩࠁ".toCharArray()[14] = (char)("♞暑꺄䠎헰◧䡏볬첕ी蒋㭬뗿ꪊ间豹䍭摏᧒莋賬萺漻㞇ꜩࠁ".toCharArray()[14] ^ 0x75BC);
      paramˊ3.ᐨẏ(paramˌх.ՙᗮ(ˍɫ$יς.J("♞暑꺄䠎헰◧䡏볬첕ी蒋㭬뗿ꪊ间豹䍭摏᧒莋賬萺漻㞇ꜩࠁ".toCharArray(), (short)3040, (short)4, (byte)2)), paramʿᵉ);
    } 
    if (paramˊ4 != null) {
      "榬췙烒閍ꟕ씱ฬ浔ⱕ䍅伳笗풅촮왾ꗒḶ㯵ﬅ?嶌詍巨ꞝ꿨憣䎤疵且䆊".toCharArray()[4] = (char)("榬췙烒閍ꟕ씱ฬ浔ⱕ䍅伳笗풅촮왾ꗒḶ㯵ﬅ?嶌詍巨ꞝ꿨憣䎤疵且䆊".toCharArray()[4] ^ 0x3FCF);
      paramˊ4.ᐨẏ(paramˌх.ՙᗮ(ˍɫ$יς.J("榬췙烒閍ꟕ씱ฬ浔ⱕ䍅伳笗풅촮왾ꗒḶ㯵ﬅ?嶌詍巨ꞝ꿨憣䎤疵且䆊".toCharArray(), (short)23045, (short)2, (byte)3)), paramʿᵉ);
    } 
  }
  
  static int ᐨẏ(String paramString, ˊ[] paramArrayOfˊ, int paramInt) {
    int i = 7 + 2 * paramInt;
    for (byte b = 0; b < paramInt; b++) {
      ˊ ˊ1 = paramArrayOfˊ[b];
      i += (ˊ1 == null) ? 0 : (ˊ1.ᐨẏ(paramString) - 8);
    } 
    return i;
  }
  
  static void ᐨẏ(int paramInt1, ˊ[] paramArrayOfˊ, int paramInt2, ʿᵉ paramʿᵉ) {
    int i = 1 + 2 * paramInt2;
    byte b;
    for (b = 0; b < paramInt2; b++) {
      ˊ ˊ1 = paramArrayOfˊ[b];
      i += (ˊ1 == null) ? 0 : (ˊ1.ᐨẏ((String)null) - 8);
    } 
    paramʿᵉ.ˊ(paramInt1);
    paramʿᵉ.ᴵʖ(i);
    paramʿᵉ.ᐨẏ(paramInt2);
    for (b = 0; b < paramInt2; b++) {
      ˊ ˊ2 = paramArrayOfˊ[b];
      ˊ ˊ1 = null;
      i = 0;
      while (ˊ2 != null) {
        ˊ2.ᐨẏ();
        i++;
        ˊ1 = ˊ2;
        ˊ2 = ˊ2.ᐨẏ;
      } 
      paramʿᵉ.ˊ(i);
      for (ˊ2 = ˊ1; ˊ2 != null; ˊ2 = ˊ2.ˊ)
        paramʿᵉ.ᐨẏ(((ʿᵉ)ˊ2.ᐨẏ).ˊ, 0, ((ʿᵉ)ˊ2.ᐨẏ).ʹﮃ); 
    } 
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˊ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */