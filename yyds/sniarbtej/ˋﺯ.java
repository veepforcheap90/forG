package yyds.sniarbtej;

import java.io.File;
import java.io.IOException;
import java.lang.instrument.Instrumentation;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import java.util.Set;

public class ˋﺯ {
  private String ﾟ;
  
  private List<String> ʴ;
  
  public ˋﺯ() {}
  
  public static void ᐨẏ(ˌᒥ paramˌᒥ) {
    ﾞᔺ ﾞᔺ1;
    (ﾞᔺ1 = new ﾞᔺ(paramˌᒥ)).ᐨẏ(new ˌḮ());
    ﾞᔺ1.ᐨẏ(new ʾٵ());
    ﾞᔺ1.ᐨẏ(new י());
    ﾞᔺ1.ᐨẏ(new ٴƨ());
    ﾞᔺ1.ᐨẏ(new ᴵয());
    ﾞᔺ1.ᐨẏ(new ᵟ());
    ﾞᔺ1.ᐨẏ(new ʻڏ());
    ﾞᔺ1.ᐨẏ(new יｌ());
    Instrumentation instrumentation;
    ˌᒥ ˌᒥ1;
    (instrumentation = (ˌᒥ1 = paramˌᒥ).ᐨẏ).addTransformer(ﾞᔺ1, true);
    ﾞᔺ ﾞᔺ2;
    Set<String> set = (ﾞᔺ2 = ﾞᔺ1).ᴵʖ;
    Class[] arrayOfClass;
    int i = (arrayOfClass = instrumentation.getAllLoadedClasses()).length;
    for (byte b = 0; b < i; b++) {
      Class<?> clazz;
      String str = (clazz = arrayOfClass[b]).getName();
      if (set.contains(str))
        try {
          clazz.getGenericSuperclass();
          instrumentation.retransformClasses(new Class[] { clazz });
        } catch (Throwable throwable) {
          (clazz = null).printStackTrace();
        }  
    } 
    ـﭔ(null);
  }
  
  private static String ٴӵ(String paramString) {
    "ﴁಞ譀ﴆ惶ꆍ䵻".toCharArray()[2] = (char)("ﴁಞ譀ﴆ惶ꆍ䵻".toCharArray()[2] ^ 0x45DA);
    String str1 = System.getProperty(ᐨẏ$ᐝт.W("ﴁಞ譀ﴆ惶ꆍ䵻".toCharArray(), (short)4400, (byte)2, (short)1)).toLowerCase();
    "ㄇꚡቱ맱竔龾㻠崒".toCharArray()[8] = (char)("ㄇꚡቱ맱竔龾㻠崒".toCharArray()[8] ^ 0x7291);
    String str2 = System.getProperty(ᐨẏ$ᐝт.W("ㄇꚡቱ맱竔龾㻠崒".toCharArray(), (short)28453, (byte)4, (short)5));
    "ꍂ㕄䐋쾾夑ᦨ铦橐".toCharArray()[5] = (char)("ꍂ㕄䐋쾾夑ᦨ铦橐".toCharArray()[5] ^ 0x4EED);
    System.out.println(ᐨẏ$ᐝт.W("ꍂ㕄䐋쾾夑ᦨ铦橐".toCharArray(), (short)17742, (byte)0, (short)1) + str2);
    if (str2 == null)
      return null; 
    String str3 = null;
    "接?퇏塼".toCharArray()[0] = (char)("接?퇏塼".toCharArray()[0] ^ 0x7ED7);
    if (str1.contains(ᐨẏ$ᐝт.W("接?퇏塼".toCharArray(), (short)23166, (byte)0, (short)1))) {
      "Ʈ訐ꚁﱦ땢꺱呙䓮".toCharArray()[4] = (char)("Ʈ訐ꚁﱦ땢꺱呙䓮".toCharArray()[4] ^ 0x3AB9);
      (new String[3])[0] = ᐨẏ$ᐝт.W("Ʈ訐ꚁﱦ땢꺱呙䓮".toCharArray(), (short)4155, (byte)4, (short)5);
      "ೳ篅讠西晑뉎퉮二".toCharArray()[5] = (char)("ೳ篅讠西晑뉎퉮二".toCharArray()[5] ^ 0xB70);
      str3 = Paths.get(str2, new String[] { null, ᐨẏ$ᐝт.W("ೳ篅讠西晑뉎퉮二".toCharArray(), (short)14272, (byte)3, (short)4), paramString }).toString();
    } else {
      "㾝ꄙ舡寊".toCharArray()[1] = (char)("㾝ꄙ舡寊".toCharArray()[1] ^ 0x5D09);
      "Ա듶췂咻鯋崘䇪".toCharArray()[5] = (char)("Ա듶췂咻鯋崘䇪".toCharArray()[5] ^ 0x1B77);
      if (str1.contains(ᐨẏ$ᐝт.W("㾝ꄙ舡寊".toCharArray(), (short)12446, (byte)3, (short)1)) || str1.contains(ᐨẏ$ᐝт.W("Ա듶췂咻鯋崘䇪".toCharArray(), (short)5774, (byte)3, (short)3))) {
        "જ熓㴔ᙫ␂繼".toCharArray()[2] = (char)("જ熓㴔ᙫ␂繼".toCharArray()[2] ^ 0x1749);
        (new String[3])[0] = ᐨẏ$ᐝт.W("જ熓㴔ᙫ␂繼".toCharArray(), (short)29819, (byte)4, (short)2);
        "扥㟊坄쌌棑㯱⛂刜㺺?௴僯ᣁ͊妪⩕뫗ᯕ⡕".toCharArray()[15] = (char)("扥㟊坄쌌棑㯱⛂刜㺺?௴僯ᣁ͊妪⩕뫗ᯕ⡕".toCharArray()[15] ^ 0x57D8);
        str3 = Paths.get(str2, new String[] { null, ᐨẏ$ᐝт.W("扥㟊坄쌌棑㯱⛂刜㺺?௴僯ᣁ͊妪⩕뫗ᯕ⡕".toCharArray(), (short)11051, (byte)1, (short)4), paramString }).toString();
      } else {
        "ș奩꫉᏶".toCharArray()[1] = (char)("ș奩꫉᏶".toCharArray()[1] ^ 0x388C);
        if (str1.contains(ᐨẏ$ᐝт.W("ș奩꫉᏶".toCharArray(), (short)30365, (byte)1, (short)4))) {
          "젖윈玷?㍚헜좷䓸".toCharArray()[3] = (char)("젖윈玷?㍚헜좷䓸".toCharArray()[3] ^ 0x4EDB);
          str3 = Paths.get(str2, new String[] { ᐨẏ$ᐝт.W("젖윈玷?㍚헜좷䓸".toCharArray(), (short)32506, (byte)4, (short)2), paramString }).toString();
        } 
      } 
    } 
    return str3;
  }
  
  public static void ʹﮃ(String paramString1, String paramString2) {
    Path path2 = Paths.get(paramString2, new String[0]);
    Path path1 = Paths.get(paramString1, new String[0]);
    if (Files.notExists(path2, new java.nio.file.LinkOption[0]) || Files.notExists(path1, new java.nio.file.LinkOption[0]))
      return; 
    List<String> list = ﹳﹲ.ˊ();
    try {
      Files.walkFileTree(path2, new ᵨ(list, path1));
      return;
    } catch (Exception exception) {
      (path1 = null).printStackTrace();
      return;
    } 
  }
  
  public static void ـﭔ(String paramString) {
    try {
      ʼᵖ(paramString);
      return;
    } catch (Throwable throwable) {
      "讼䛥?鲁䰺㣐蟐紑ؾ訲ᠾ痌ʚ娦䮺鼴㰑耤嚈褮笤챷騐襰솆徏?趼啓?㯟⭠".toCharArray()[32] = (char)("讼䛥?鲁䰺㣐蟐紑ؾ訲ᠾ痌ʚ娦䮺鼴㰑耤嚈褮笤챷騐襰솆徏?趼啓?㯟⭠".toCharArray()[32] ^ 0x1A69);
      System.out.println(ˉﻤ$ͺſ.v("讼䛥?鲁䰺㣐蟐紑ؾ訲ᠾ痌ʚ娦䮺鼴㰑耤嚈褮笤챷騐襰솆徏?趼啓?㯟⭠".toCharArray(), (short)11339, 5, (short)5));
      throwable.printStackTrace();
      return;
    } 
  }
  
  private static void ʼᵖ(String paramString) {
    "络薲핑씤ꎘ쉯ᾁ駺?劚?⋷ⱌ솶籶척뮥ߑ㕚鹃梬".toCharArray()[18] = (char)("络薲핑씤ꎘ쉯ᾁ駺?劚?⋷ⱌ솶籶척뮥ߑ㕚鹃梬".toCharArray()[18] ^ 0x56F6);
    "졚⦭썠䷃".toCharArray()[0] = (char)("졚⦭썠䷃".toCharArray()[0] ^ 0x2F13);
    String str1 = System.getProperty(ᐝᵣ$ﾞﾇ.j("络薲핑씤ꎘ쉯ᾁ駺?劚?⋷ⱌ솶籶척뮥ߑ㕚鹃梬".toCharArray(), (short)20171, 1, (short)1), ᐝᵣ$ﾞﾇ.j("졚⦭썠䷃".toCharArray(), (short)2262, 5, (short)3)).toLowerCase();
    "஻䥧ꊓ淡ㄳ띧똏牊㟥ꚁ嫐낁瓤弉䉥掵".toCharArray()[2] = (char)("஻䥧ꊓ淡ㄳ띧똏牊㟥ꚁ嫐낁瓤弉䉥掵".toCharArray()[2] ^ 0x4135);
    System.out.println(ᐝᵣ$ﾞﾇ.j("஻䥧ꊓ淡ㄳ띧똏牊㟥ꚁ嫐낁瓤弉䉥掵".toCharArray(), (short)23078, 0, (short)5) + str1);
    if (paramString == null) {
      "苎緑ఞѩỷ륯쉔핚瓅帽".toCharArray()[0] = (char)("苎緑ఞѩỷ륯쉔핚瓅帽".toCharArray()[0] ^ 0x62B6);
      String str3 = ᐝᵣ$ﾞﾇ.j("苎緑ఞѩỷ륯쉔핚瓅帽".toCharArray(), (short)32001, 3, (short)3);
      "辪汤閗䛁Ჸ蕟胇﹉濷?㄃䍇㏆".toCharArray()[7] = (char)("辪汤閗䛁Ჸ蕟胇﹉濷?㄃䍇㏆".toCharArray()[7] ^ 0xBDD);
      if (str1.equals(ᐝᵣ$ﾞﾇ.j("辪汤閗䛁Ჸ蕟胇﹉濷?㄃䍇㏆".toCharArray(), (short)10228, 4, (short)2))) {
        "⧹搇忶堣遧路䁘".toCharArray()[1] = (char)("⧹搇忶堣遧路䁘".toCharArray()[1] ^ 0x2FC6);
        str3 = ᐝᵣ$ﾞﾇ.j("⧹搇忶堣遧路䁘".toCharArray(), (short)21850, 0, (short)2);
      } 
      String str4;
      if ((str4 = ٴӵ(str3)) == null || str4.isEmpty()) {
        "庎苪誢Პ倚ߓ┡땸嬰戣ઉ꭬뤳鯞亢전秠䬂g㩬諺润▶⤋㘙몄⯽౲ﮮ얰轲㥦뗙欢唠静䫀졹虑휓呸沲啗썠寁燌䃯㪌他".toCharArray()[24] = (char)("庎苪誢Პ倚ߓ┡땸嬰戣ઉ꭬뤳鯞亢전秠䬂g㩬諺润▶⤋㘙몄⯽౲ﮮ얰轲㥦뗙欢唠静䫀졹虑휓呸沲啗썠寁燌䃯㪌他".toCharArray()[24] ^ 0x510C);
        System.out.println(ᐝᵣ$ﾞﾇ.j("庎苪誢Პ倚ߓ┡땸嬰戣ઉ꭬뤳鯞亢전秠䬂g㩬諺润▶⤋㘙몄⯽౲ﮮ얰轲㥦뗙欢唠静䫀졹虑휓呸沲啗썠寁燌䃯㪌他".toCharArray(), (short)22669, 2, (short)0));
        "ⷄ뭠祑詷┗篲ꙥ㏖눝箖渞鎇㊩橯膹챃핺㹊토聓᾽낣淘摼艫曈ឝ逷䕩鉯밧臠䘁昪ꎟ녍?凜擝꽦䟵紖".toCharArray()[18] = (char)("ⷄ뭠祑詷┗篲ꙥ㏖눝箖渞鎇㊩橯膹챃핺㹊토聓᾽낣淘摼艫曈ឝ逷䕩鉯밧臠䘁昪ꎟ녍?凜擝꽦䟵紖".toCharArray()[18] ^ 0xB2A);
        System.out.println(ᐝᵣ$ﾞﾇ.j("ⷄ뭠祑詷┗篲ꙥ㏖눝箖渞鎇㊩橯膹챃핺㹊토聓᾽낣淘摼艫曈ឝ逷䕩鉯밧臠䘁昪ꎟ녍?凜擝꽦䟵紖".toCharArray(), (short)12853, 0, (short)4));
        return;
      } 
      "쨔猽⵴酐풄鴗惭㵫់腃둔ᜅ궬梣ꨴ?궊⾺".toCharArray()[12] = (char)("쨔猽⵴酐풄鴗惭㵫់腃둔ᜅ궬梣ꨴ?궊⾺".toCharArray()[12] ^ 0x5F54);
      Path path1;
      paramString = (path1 = Paths.get(str4, new String[] { System.getProperty(ᐝᵣ$ﾞﾇ.j("쨔猽⵴酐풄鴗惭㵫់腃둔ᜅ궬梣ꨴ?궊⾺".toCharArray(), (short)3949, 5, (short)0)) })).toString();
    } 
    Path path = Paths.get(paramString, new String[0]);
    "ꄇ蛪粢炥㌌矁䯻餿瘣댍䞙".toCharArray()[11] = (char)("ꄇ蛪粢炥㌌矁䯻餿瘣댍䞙".toCharArray()[11] ^ 0x42D8);
    System.out.println(ᐝᵣ$ﾞﾇ.j("ꄇ蛪粢炥㌌矁䯻餿瘣댍䞙".toCharArray(), (short)18792, 1, (short)5) + paramString);
    "?ꎞ?쫇㋱阿톓監䨗輱庩卜".toCharArray()[7] = (char)("?ꎞ?쫇㋱阿톓監䨗輱庩卜".toCharArray()[7] ^ 0x7567);
    String str2 = System.getProperty(str1 + ᐝᵣ$ﾞﾇ.j("?ꎞ?쫇㋱阿톓監䨗輱庩卜".toCharArray(), (short)31148, 2, (short)1));
    if (!paramString.equals(str2)) {
      if (!Files.exists(path, new java.nio.file.LinkOption[0]))
        return; 
    } else if (!Files.exists(path, new java.nio.file.LinkOption[0])) {
      try {
        Files.createDirectories(path, (FileAttribute<?>[])new FileAttribute[0]);
      } catch (IOException iOException) {
        throw new RuntimeException(iOException);
      } 
    } 
    if (!Files.exists((Path)iOException, new java.nio.file.LinkOption[0]))
      return; 
    "?埗㌓悼폾⠯".toCharArray()[3] = (char)("?埗㌓悼폾⠯".toCharArray()[3] ^ 0x48D1);
    if (str1.equals(ᐝᵣ$ﾞﾇ.j("?埗㌓悼폾⠯".toCharArray(), (short)1801, 1, (short)5))) {
      "郺䑩垌夶視筯".toCharArray()[0] = (char)("郺䑩垌夶視筯".toCharArray()[0] ^ 0x101A);
      str1 = ᐝᵣ$ﾞﾇ.j("郺䑩垌夶視筯".toCharArray(), (short)13389, 2, (short)1);
    } 
    "딪ᐼ窬粷".toCharArray()[0] = (char)("딪ᐼ窬粷".toCharArray()[0] ^ 0x5608);
    File file;
    ᐨп.ᐨẏ(file = new File(paramString, str1 + ᐝᵣ$ﾞﾇ.j("딪ᐼ窬粷".toCharArray(), (short)7943, 4, (short)2)));
    File[] arrayOfFile;
    if ((arrayOfFile = (new File(paramString)).listFiles((paramFile, paramString) -> {
          "攕曰飆?饁䐝楇憴".toCharArray()[4] = (char)("攕曰飆?饁䐝楇憴".toCharArray()[4] ^ 0x1AF6);
          "顤쵐森贬ᰥ?缼應́".toCharArray()[1] = (char)("顤쵐森贬ᰥ?缼應́".toCharArray()[1] ^ 0x1EFF);
          return (paramString.startsWith(ˍɫ$יς.J("攕曰飆?饁䐝楇憴".toCharArray(), (short)6449, (short)1, (byte)3)) && paramString.endsWith(ˍɫ$יς.J("顤쵐森贬ᰥ?缼應́".toCharArray(), (short)7971, (short)3, (byte)3)));
        })) != null) {
      int i = (arrayOfFile = arrayOfFile).length;
      for (byte b = 0; b < i; b++) {
        File file1;
        ᐨп.ᐨẏ(file1 = arrayOfFile[b]);
      } 
    } 
  }
  
  public ˋﺯ(String paramString, List<String> paramList) {
    this.ﾟ = paramString;
    this.ʴ = paramList;
  }
  
  public void ᐨẏ(ʻล paramʻล) {
    paramʻล.ᐨẏ(this.ﾟ, this.ʴ.<String>toArray(new String[0]));
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˋﺯ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */