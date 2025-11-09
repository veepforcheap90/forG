package yyds.sniarbtej;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import ylt.pmn.zubdqvgt;

public class ᐧṙ extends ˍɫ {
  private static final String ˎאּ = ˏȓ$ᴵЃ.E("ꄆῺ鼀欄껠堮夎昋盨".toCharArray(), (short)15091, (short)0, (short)4).intern();
  
  private boolean ՙᗮ;
  
  private boolean ˍɫ;
  
  private int ᒬ;
  
  private String name;
  
  private String[] ˊ;
  
  private Collection<ᐨר> ᐨẏ;
  
  private boolean ʽ;
  
  private Collection<ᐨר> ˊ;
  
  private Collection<ᐨר> ᴵʖ;
  
  private ᐧṙ(ˍɫ paramˍɫ) {
    this(589824, paramˍɫ);
    if (!zubdqvgt.G(getClass(), ᐧṙ.class))
      throw new IllegalStateException(); 
  }
  
  private ᐧṙ(int paramInt, ˍɫ paramˍɫ) {
    super(589824, paramˍɫ);
  }
  
  public final void ᐨẏ(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
    this.ՙᗮ = ((paramInt2 & 0x4000) == 0);
    if (this.ՙᗮ) {
      this.name = paramString1;
      this.ᒬ = paramInt2;
      this.ˊ = (Collection<ᐨר>)paramArrayOfString.clone();
      this.ᐨẏ = new ArrayList<>();
      this.ˊ = new ArrayList<>();
      this.ᴵʖ = new ArrayList<>();
    } 
    super.ᐨẏ(paramInt1, paramInt2, paramString1, paramString2, paramString3, paramArrayOfString);
  }
  
  public final ˉｓ ᐨẏ(int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
    if (this.ՙᗮ) {
      "셍ﺦժ剪鮉꪿乛浩团".toCharArray()[5] = (char)("셍ﺦժ剪鮉꪿乛浩团".toCharArray()[5] ^ 0x76F3);
      if (ᐝᵣ$ﾞﾇ.j("셍ﺦժ剪鮉꪿乛浩团".toCharArray(), (short)6987, 1, (short)1).intern().equals(paramString1))
        this.ʽ = true; 
      int i = paramInt & 0xD3F;
      if ((paramInt & 0x2) == 0) {
        "泐ؿ?偓ࣳ㐶畨".toCharArray()[5] = (char)("泐ؿ?偓ࣳ㐶畨".toCharArray()[5] ^ 0x8CA);
        if (ᐝᵣ$ﾞﾇ.j("泐ؿ?偓ࣳ㐶畨".toCharArray(), (short)12641, 3, (short)0).equals(paramString1)) {
          this.ˊ.add(new ᐨר(paramString1, i, paramString2));
        } else {
          "귌춺?住ᘧ哅ꔯӧ".toCharArray()[7] = (char)("귌춺?住ᘧ哅ꔯӧ".toCharArray()[7] ^ 0x4F22);
          if (!ᐝᵣ$ﾞﾇ.j("귌춺?住ᘧ哅ꔯӧ".toCharArray(), (short)20915, 3, (short)0).intern().equals(paramString1))
            this.ᴵʖ.add(new ᐨר(paramString1, i, paramString2)); 
        } 
      } 
    } 
    return super.ᐨẏ(paramInt, paramString1, paramString2, paramString3, paramArrayOfString);
  }
  
  public final ᴵƚ ᐨẏ(int paramInt, String paramString1, String paramString2, String paramString3, Object paramObject) {
    if (this.ՙᗮ) {
      "㇙珙㰴灅숆粗㛮灪楉㗓쮻ұṸ勏".toCharArray()[6] = (char)("㇙珙㰴灅숆粗㛮灪楉㗓쮻ұṸ勏".toCharArray()[6] ^ 0x64EF);
      if (ˍɫ$יς.J("㇙珙㰴灅숆粗㛮灪楉㗓쮻ұṸ勏".toCharArray(), (short)16581, (short)3, (byte)3).equals(paramString1)) {
        this.ՙᗮ = false;
        this.ˍɫ = true;
      } 
      if ((paramInt & 0x2) == 0 || (paramInt & 0x88) == 0) {
        int i = paramInt & 0xDF;
        this.ᐨẏ.add(new ᐨר(paramString1, i, paramString2));
      } 
    } 
    return super.ᐨẏ(paramInt, paramString1, paramString2, paramString3, paramObject);
  }
  
  public final void ᐨẏ(String paramString1, String paramString2, String paramString3, int paramInt) {
    if (this.name != null && this.name.equals(paramString1))
      this.ᒬ = paramInt; 
    super.ᐨẏ(paramString1, paramString2, paramString3, paramInt);
  }
  
  public final void ᐨẏ() {
    if (this.ՙᗮ && !this.ˍɫ)
      try {
        long l = ᐨẏ();
        "࿎ṡⷤ鐅䧇펇ꊧ꭯ᤅस଻ﳿ㨡ᔽ髬꼵⓱".toCharArray()[10] = (char)("࿎ṡⷤ鐅䧇펇ꊧ꭯ᤅस଻ﳿ㨡ᔽ髬꼵⓱".toCharArray()[10] ^ 0x79C8);
        "ᇉ佝".toCharArray()[0] = (char)("ᇉ佝".toCharArray()[0] ^ 0x385A);
        ᴵƚ ᴵƚ;
        ᐧṙ ᐧṙ1;
        if ((ᴵƚ = (ᐧṙ1 = this).ᐨẏ(24, ˏȓ$ᴵЃ.E("࿎ṡⷤ鐅䧇펇ꊧ꭯ᤅस଻ﳿ㨡ᔽ髬꼵⓱".toCharArray(), (short)14978, (short)1, (short)1), ˏȓ$ᴵЃ.E("ᇉ佝".toCharArray(), (short)15609, (short)0, (short)2), (String)null, Long.valueOf(l))) != null)
          ᴵƚ.ᐨẏ(); 
      } catch (IOException iOException) {
        "犉슻攮ꯜ圂ꈳ媱હ숥苎㘝娳竦㬶친忊ᰬ罦↖荨谠澸ᧆ뚠黔䰅䥃援".toCharArray()[20] = (char)("犉슻攮ꯜ圂ꈳ媱હ숥苎㘝娳竦㬶친忊ᰬ罦↖荨谠澸ᧆ뚠黔䰅䥃援".toCharArray()[20] ^ 0x178D);
        throw new IllegalStateException(ˏȓ$ᴵЃ.E("犉슻攮ꯜ圂ꈳ媱હ숥苎㘝娳竦㬶친忊ᰬ罦↖荨谠澸ᧆ뚠黔䰅䥃援".toCharArray(), (short)25001, (short)4, (short)3) + this.name, iOException);
      }  
    super.ᐨẏ();
  }
  
  private boolean ʹﮃ() {
    return this.ˍɫ;
  }
  
  private void ᴵʖ(long paramLong) {
    "긹첣멛贲片ᢍ枘堌⭹混⭣笂᳿?짔㚾".toCharArray()[15] = (char)("긹첣멛贲片ᢍ枘堌⭹混⭣笂᳿?짔㚾".toCharArray()[15] ^ 0x2FF4);
    "殐佒".toCharArray()[0] = (char)("殐佒".toCharArray()[0] ^ 0x7597);
    ᴵƚ ᴵƚ;
    if ((ᴵƚ = super.ᐨẏ(24, ˍɫ$יς.J("긹첣멛贲片ᢍ枘堌⭹混⭣笂᳿?짔㚾".toCharArray(), (short)15556, (short)1, (byte)4), ˍɫ$יς.J("殐佒".toCharArray(), (short)1104, (short)2, (byte)2), (String)null, Long.valueOf(paramLong))) != null)
      ᴵƚ.ᐨẏ(); 
  }
  
  private long ᐨẏ() {
    long l = 0L;
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
      try {
        dataOutputStream.writeUTF(this.name.replace('/', '.'));
        int i;
        if (((i = this.ᒬ) & 0x200) != 0)
          i = this.ᴵʖ.isEmpty() ? (i & 0xFFFFFBFF) : (i | 0x400); 
        dataOutputStream.writeInt(i & 0x611);
        Arrays.sort((Object[])this.ˊ);
        Collection<ᐨר> collection;
        i = (collection = this.ˊ).length;
        for (byte b = 0; b < i; b++) {
          Collection<ᐨר> collection1 = collection[b];
          dataOutputStream.writeUTF(collection1.replace('/', '.'));
        } 
        ᐨẏ(this.ᐨẏ, dataOutputStream, false);
        if (this.ʽ) {
          "啑两苙蘵쩩㼵뱄㻾".toCharArray()[6] = (char)("啑两苙蘵쩩㼵뱄㻾".toCharArray()[6] ^ 0x67DE);
          dataOutputStream.writeUTF(ᐝᵣ$ﾞﾇ.j("啑两苙蘵쩩㼵뱄㻾".toCharArray(), (short)7657, 2, (short)1).intern());
          dataOutputStream.writeInt(8);
          "ꉛ끾鱦䡱".toCharArray()[1] = (char)("ꉛ끾鱦䡱".toCharArray()[1] ^ 0x5B51);
          dataOutputStream.writeUTF(ᐝᵣ$ﾞﾇ.j("ꉛ끾鱦䡱".toCharArray(), (short)20458, 4, (short)1));
        } 
        ᐨẏ(this.ˊ, dataOutputStream, true);
        ᐨẏ(this.ᴵʖ, dataOutputStream, true);
        dataOutputStream.flush();
        byte[] arrayOfByte;
        for (i = Math.min((arrayOfByte = ᐨẏ(byteArrayOutputStream.toByteArray())).length, 8) - 1; i >= 0; i--)
          l = l << 8L | (arrayOfByte[i] & 0xFF); 
        dataOutputStream.close();
      } catch (Throwable throwable) {
        try {
          dataOutputStream.close();
        } catch (Throwable throwable1) {
          throwable.addSuppressed(throwable1);
        } 
        throw throwable;
      } 
      byteArrayOutputStream.close();
    } catch (Throwable throwable) {
      try {
        byteArrayOutputStream.close();
      } catch (Throwable throwable1) {
        throwable.addSuppressed(throwable1);
      } 
      throw throwable;
    } 
    return l;
  }
  
  private static byte[] ᐨẏ(byte[] paramArrayOfbyte) {
    try {
      "Ԇ㓫䭪Ꮸ".toCharArray()[0] = (char)("Ԇ㓫䭪Ꮸ".toCharArray()[0] ^ 0x248A);
      return MessageDigest.getInstance(ˏȓ$ᴵЃ.E("Ԇ㓫䭪Ꮸ".toCharArray(), (short)32407, (short)3, (short)5)).digest(paramArrayOfbyte);
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      throw new UnsupportedOperationException(noSuchAlgorithmException);
    } 
  }
  
  private static void ᐨẏ(Collection<ᐨר> paramCollection, DataOutput paramDataOutput, boolean paramBoolean) {
    ᐨר[] arrayOfᐨר;
    Arrays.sort((Object[])(arrayOfᐨר = paramCollection.toArray(new ᐨר[0])));
    int i = (arrayOfᐨר = arrayOfᐨר).length;
    for (byte b = 0; b < i; b++) {
      ᐨר ᐨר = arrayOfᐨר[b];
      paramDataOutput.writeUTF(ᐨר.name);
      paramDataOutput.writeInt(ᐨר.ᒬ);
      paramDataOutput.writeUTF(paramBoolean ? ᐨר.ᴵʖ.replace('/', '.') : ᐨר.ᴵʖ);
    } 
  }
  
  static {
    "ꄆῺ鼀欄껠堮夎昋盨".toCharArray()[0] = (char)("ꄆῺ鼀欄껠堮夎昋盨".toCharArray()[0] ^ 0x5B4);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᐧṙ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */