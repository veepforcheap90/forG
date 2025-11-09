package yyds.sniarbtej;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

public class ʻɬ {
  private final Field ᐨẏ;
  
  public ʻɬ() {}
  
  public static URI ᐨẏ() {
    URL uRL = ˈᕻ.class.getProtectionDomain().getCodeSource().getLocation();
    if (uRL != null)
      return uRL.toURI(); 
    "בּ鼣蝬꭯僪범羂≣毄龩뼅?렄ׅ♼볗鷄ᒚ剜齐좪ꕘ뺂踔?絧蠑㛺佦瑦⎉ቱ忂蔂㹀ᴍᾟꋵ㲿\r躖䖖㠲".toCharArray()[44] = (char)("בּ鼣蝬꭯僪범羂≣毄龩뼅?렄ׅ♼볗鷄ᒚ剜齐좪ꕘ뺂踔?絧蠑㛺佦瑦⎉ቱ忂蔂㹀ᴍᾟꋵ㲿\r躖䖖㠲".toCharArray()[44] ^ 0x4D45);
    String str2 = ˏȓ$ᴵЃ.E("בּ鼣蝬꭯僪범羂≣毄龩뼅?렄ׅ♼볗鷄ᒚ剜齐좪ꕘ뺂踔?絧蠑㛺佦瑦⎉ቱ忂蔂㹀ᴍᾟꋵ㲿\r躖䖖㠲".toCharArray(), (short)10066, (short)5, (short)2);
    uRL = ˈᕻ.class.getResource(str2);
    if (uRL == null) {
      "楒퍨硨碚㤓⪝Ի?븺別娡䥜Ե裐ᆨ傺掁띃Ꞹ픁㮐㇇硰?鲮䄻᪝堀".toCharArray()[11] = (char)("楒퍨硨碚㤓⪝Ի?븺別娡䥜Ե裐ᆨ傺掁띃Ꞹ픁㮐㇇硰?鲮䄻᪝堀".toCharArray()[11] ^ 0x73A8);
      throw new Exception(ˏȓ$ᴵЃ.E("楒퍨硨碚㤓⪝Ի?븺別娡䥜Ե裐ᆨ傺掁띃Ꞹ픁㮐㇇硰?鲮䄻᪝堀".toCharArray(), (short)4493, (short)3, (short)4));
    } 
    "댑噰".toCharArray()[0] = (char)("댑噰".toCharArray()[0] ^ 0x4AB9);
    String str1;
    if (!(str1 = uRL.getPath()).endsWith(ˏȓ$ᴵЃ.E("댑噰".toCharArray(), (short)9635, (short)3, (short)3) + str2)) {
      "軗婪쑰䲲䚉庀ⅨǮ猧궊絾Ꙧ䈂쒮枘⤮Ǫ렵鿫町".toCharArray()[20] = (char)("軗婪쑰䲲䚉庀ⅨǮ猧궊絾Ꙧ䈂쒮枘⤮Ǫ렵鿫町".toCharArray()[20] ^ 0x47D9);
      throw new Exception(ˏȓ$ᴵЃ.E("軗婪쑰䲲䚉庀ⅨǮ猧궊絾Ꙧ䈂쒮枘⤮Ǫ렵鿫町".toCharArray(), (short)1486, (short)0, (short)3));
    } 
    str1 = str1.substring(0, str1.length() - str2.length() - 1);
    return new URI(str1);
  }
  
  public static boolean ՙᗮ(String paramString) {
    return (paramString == null || paramString.isEmpty());
  }
  
  private static Long ᐨẏ(String paramString) {
    if (paramString == null)
      return null; 
    try {
      return Long.valueOf(Long.parseLong(paramString));
    } catch (NumberFormatException numberFormatException) {
      return null;
    } 
  }
  
  public ʻɬ(Field paramField) {
    ˌᑦ.ˊ(paramField);
    this.ᐨẏ = paramField;
  }
  
  public Class<?> ᐨẏ() {
    return this.ᐨẏ.getDeclaringClass();
  }
  
  public String getName() {
    return this.ᐨẏ.getName();
  }
  
  public Type ᐨẏ() {
    return this.ᐨẏ.getGenericType();
  }
  
  public Class<?> ˊ() {
    return this.ᐨẏ.getType();
  }
  
  public <T extends Annotation> T ᐨẏ(Class<T> paramClass) {
    return this.ᐨẏ.getAnnotation(paramClass);
  }
  
  public Collection<Annotation> ᐨẏ() {
    return Arrays.asList(this.ᐨẏ.getAnnotations());
  }
  
  public boolean ᴵʖ(int paramInt) {
    return ((this.ᐨẏ.getModifiers() & paramInt) != 0);
  }
  
  Object get(Object paramObject) {
    return this.ᐨẏ.get(paramObject);
  }
  
  boolean ٴӵ() {
    return this.ᐨẏ.isSynthetic();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ʻɬ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */