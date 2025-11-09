package yyds.sniarbtej;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ᐨп {
  private String name;
  
  private int ᒬ;
  
  public ᐨп() {}
  
  private static boolean ᐨẏ(File paramFile) {
    if (!paramFile.exists())
      return false; 
    try {
      byte[] arrayOfByte;
      if ((arrayOfByte = Files.readAllBytes(Paths.get(paramFile.getAbsolutePath(), new String[0])))[0] != -1 || arrayOfByte[1] != -1)
        return false; 
      "ꡗ硳".toCharArray()[0] = (char)("ꡗ硳".toCharArray()[0] ^ 0x1CE4);
      "행枇".toCharArray()[0] = (char)("행枇".toCharArray()[0] ^ 0x325C);
      String str2;
      String[] arrayOfString;
      if ((arrayOfString = (str2 = (str2 = new String(arrayOfByte, 2, arrayOfByte.length - 2, StandardCharsets.UTF_16LE)).split(ᐨẏ$ᐝт.W("ꡗ硳".toCharArray(), (short)19719, (byte)3, (short)1))[1]).split(ᐨẏ$ᐝт.W("행枇".toCharArray(), (short)1213, (byte)5, (short)5))).length != 4)
        return false; 
      String str3 = new String(ڎ.ᐨẏ(arrayOfString[1]));
      String str1 = arrayOfString[2];
      if ((str3 = ﹳﹲ.ˍ(str3)).equals(str1))
        return true; 
    } catch (Exception exception) {
      (paramFile = null).printStackTrace();
    } 
    return false;
  }
  
  private static void ᐨẏ(File paramFile, String paramString) {
    try {
      "鍌ᡗṨ츈糎㵧ಐ딠鴅쒎쨛르?ꃷ碇箮".toCharArray()[5] = (char)("鍌ᡗṨ츈糎㵧ಐ딠鴅쒎쨛르?ꃷ碇箮".toCharArray()[5] ^ 0x17D6);
      byte[] arrayOfByte1;
      byte[] arrayOfByte2;
      (arrayOfByte2 = new byte[(arrayOfByte1 = (paramString = ᐨẏ$ᐝт.W("鍌ᡗṨ츈糎㵧ಐ딠鴅쒎쨛르?ꃷ碇箮".toCharArray(), (short)30030, (byte)5, (short)4) + paramString).getBytes(StandardCharsets.UTF_16LE)).length + 2])[0] = -1;
      arrayOfByte2[1] = -1;
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 2, arrayOfByte1.length);
      Files.write(Paths.get(paramFile.getAbsolutePath(), new String[0]), arrayOfByte2, new java.nio.file.OpenOption[0]);
      return;
    } catch (Exception exception) {
      (paramString = null).printStackTrace();
      return;
    } 
  }
  
  public static void ˊ(File paramFile, String paramString) {
    try {
      if (ﹳﹲ.ʻւ()) {
        "⸫쬟䫂쎵줓冦熃哬צ緺뛚诸蝔컜ݥᨵ㤄襯憵쟩쳈ફ糗骼답刻跁넱巁꾠ꆬ蜁?ಭ⢅Ċ諸뙋ྐྵ㠠荬䧦倇扳䂵唳".toCharArray()[21] = (char)("⸫쬟䫂쎵줓冦熃哬צ緺뛚诸蝔컜ݥᨵ㤄襯憵쟩쳈ફ糗骼답刻跁넱巁꾠ꆬ蜁?ಭ⢅Ċ諸뙋ྐྵ㠠荬䧦倇扳䂵唳".toCharArray()[21] ^ 0x186A);
        System.out.println(ᐝᵣ$ﾞﾇ.j("⸫쬟䫂쎵줓冦熃哬צ緺뛚诸蝔컜ݥᨵ㤄襯憵쟩쳈ફ糗骼답刻跁넱巁꾠ꆬ蜁?ಭ⢅Ċ諸뙋ྐྵ㠠荬䧦倇扳䂵唳".toCharArray(), (short)30208, 2, (short)1) + paramFile.getName());
        ᐨẏ(paramFile, paramString);
        return;
      } 
      if (!ᐨẏ(paramFile)) {
        "刔ᘐۡ㷗ƪꕁ䮰๴咾め趙Ⓖퟛ媧ꩽ캧灂悾밭将᷅ᰙ⮁鹒ꔖ쩽瑂쪀ਬ벢ꗏ뜬삡줟ᄯꤹ鱺䒖꩒ȓ".toCharArray()[26] = (char)("刔ᘐۡ㷗ƪꕁ䮰๴咾め趙Ⓖퟛ媧ꩽ캧灂悾밭将᷅ᰙ⮁鹒ꔖ쩽瑂쪀ਬ벢ꗏ뜬삡줟ᄯꤹ鱺䒖꩒ȓ".toCharArray()[26] ^ 0x5668);
        System.out.println(ᐝᵣ$ﾞﾇ.j("刔ᘐۡ㷗ƪꕁ䮰๴咾め趙Ⓖퟛ媧ꩽ캧灂悾밭将᷅ᰙ⮁鹒ꔖ쩽瑂쪀ਬ벢ꗏ뜬삡줟ᄯꤹ鱺䒖꩒ȓ".toCharArray(), (short)12441, 4, (short)3) + paramFile.getName());
        ᐨẏ(paramFile, paramString);
      } 
      return;
    } catch (Exception exception) {
      (paramFile = null).printStackTrace();
      return;
    } 
  }
  
  public static void ᐨẏ(File paramFile) {
    try {
      ˊ(paramFile, ﹳﹲ.ˈے());
      return;
    } catch (Exception exception) {
      (paramFile = null).printStackTrace();
      return;
    } 
  }
  
  public ᐨп(String paramString, int paramInt) {
    this.name = paramString;
    this.ᒬ = paramInt;
  }
  
  public void ᐨẏ(ˉｓ paramˉｓ) {
    paramˉｓ.ᐨẏ(this.name, this.ᒬ);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᐨп.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */