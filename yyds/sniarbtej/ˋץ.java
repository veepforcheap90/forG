package yyds.sniarbtej;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class ˋץ {
  public abstract <T> T ᐨẏ(Class<T> paramClass);
  
  public static ˋץ ᐨẏ() {
    try {
      "젡䙸釹슬ᛏ㞶홝쉣縆漲㬊䕽?濖".toCharArray()[14] = (char)("젡䙸釹슬ᛏ㞶홝쉣縆漲㬊䕽?濖".toCharArray()[14] ^ 0x4B80);
      "榤䔆잰ꭄꝦ鬶㧙眨ᣜ犗".toCharArray()[4] = (char)("榤䔆잰ꭄꝦ鬶㧙眨ᣜ犗".toCharArray()[4] ^ 0x71CD);
      Class<?> clazz;
      Field field;
      (field = (clazz = Class.forName(ˏȓ$ᴵЃ.E("젡䙸釹슬ᛏ㞶홝쉣縆漲㬊䕽?濖".toCharArray(), (short)8077, (short)4, (short)2))).getDeclaredField(ˏȓ$ᴵЃ.E("榤䔆잰ꭄꝦ鬶㧙眨ᣜ犗".toCharArray(), (short)6519, (short)4, (short)5))).setAccessible(true);
      Object object = field.get((Object)null);
      "ﺡ㺤지鷿栴疱츩묧⹞剻⶗꒣沏᠎⛅".toCharArray()[2] = (char)("ﺡ㺤지鷿栴疱츩묧⹞剻⶗꒣沏᠎⛅".toCharArray()[2] ^ 0x6D56);
      Method method = clazz.getMethod(ˏȓ$ᴵЃ.E("ﺡ㺤지鷿栴疱츩묧⹞剻⶗꒣沏᠎⛅".toCharArray(), (short)30819, (short)5, (short)0), new Class[] { Class.class });
      return new ſ(method, object);
    } catch (Exception exception) {
      try {
        "兰⿅䶘ᶝ훞墜貽퇮먕햱넰Ṋ뗶鹊樼䛄".toCharArray()[14] = (char)("兰⿅䶘ᶝ훞墜貽퇮먕햱넰Ṋ뗶鹊樼䛄".toCharArray()[14] ^ 0x23BE);
        Method method1;
        (method1 = ObjectStreamClass.class.getDeclaredMethod(ˏȓ$ᴵЃ.E("兰⿅䶘ᶝ훞墜貽퇮먕햱넰Ṋ뗶鹊樼䛄".toCharArray(), (short)2278, (short)0, (short)0), new Class[] { Class.class })).setAccessible(true);
        int i = ((Integer)method1.invoke((Object)null, new Object[] { Object.class })).intValue();
        "ݾ쐴붷耆ᬻ葫냯㴐ﾰ◄患".toCharArray()[5] = (char)("ݾ쐴붷耆ᬻ葫냯㴐ﾰ◄患".toCharArray()[5] ^ 0x76DE);
        Method method2;
        (method2 = ObjectStreamClass.class.getDeclaredMethod(ˏȓ$ᴵЃ.E("ݾ쐴붷耆ᬻ葫냯㴐ﾰ◄患".toCharArray(), (short)8468, (short)0, (short)5), new Class[] { Class.class, int.class })).setAccessible(true);
        return new ʹĿ(method2, i);
      } catch (Exception exception1) {
        try {
          "ᴛ冾ᖂ咦㉈囂黑譐詐㳍ੌ".toCharArray()[5] = (char)("ᴛ冾ᖂ咦㉈囂黑譐詐㳍ੌ".toCharArray()[5] ^ 0x5C17);
          Method method;
          (method = ObjectInputStream.class.getDeclaredMethod(ˏȓ$ᴵЃ.E("ᴛ冾ᖂ咦㉈囂黑譐詐㳍ੌ".toCharArray(), (short)13575, (short)2, (short)0), new Class[] { Class.class, Class.class })).setAccessible(true);
          return new ᐝİ(method);
        } catch (Exception exception2) {
          return new ιТ();
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˋץ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */