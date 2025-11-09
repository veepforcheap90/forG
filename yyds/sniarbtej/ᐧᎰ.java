package yyds.sniarbtej;

import java.io.OutputStream;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ylt.pmn.zubdqvgt;

public class ᐧᎰ {
  private static String ـｊ;
  
  public final λ ᴵʖ;
  
  public final boolean[] ˊ;
  
  public final List<ʿশ> ʹл;
  
  public ᐧᎰ() {}
  
  public static synchronized String ـﭔ() {
    if (ـｊ == null) {
      "落۰".toCharArray()[0] = (char)("落۰".toCharArray()[0] ^ 0x35AD);
      "恻ļ".toCharArray()[0] = (char)("恻ļ".toCharArray()[0] ^ 0x71DA);
      String str;
      ـｊ = (str = ManagementFactory.getRuntimeMXBean().getName() + ᐝᵣ$ﾞﾇ.j("落۰".toCharArray(), (short)8430, 3, (short)0)).split(ᐝᵣ$ﾞﾇ.j("恻ļ".toCharArray(), (short)24298, 2, (short)2), 2)[0];
    } 
    return ـｊ;
  }
  
  private static int ᐨẏ(ProcessBuilder paramProcessBuilder) {
    return ᐨẏ(paramProcessBuilder, System.out, System.err);
  }
  
  private static int ᐨẏ(ProcessBuilder paramProcessBuilder, OutputStream paramOutputStream) {
    return ᐨẏ(paramProcessBuilder, paramOutputStream, null);
  }
  
  private static int ᐨẏ(ProcessBuilder paramProcessBuilder, OutputStream paramOutputStream1, OutputStream paramOutputStream2) {
    Process process = paramProcessBuilder.start();
    ArrayList<Thread> arrayList = new ArrayList();
    if (paramOutputStream1 != null)
      arrayList.add(new Thread(new ﹳ宀(process.getInputStream(), paramOutputStream1))); 
    if (paramOutputStream2 != null)
      arrayList.add(new Thread(new ﹳ宀(process.getErrorStream(), paramOutputStream2))); 
    Iterator<Thread> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      Thread thread;
      (thread = iterator.next()).start();
    } 
    iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      Thread thread;
      (thread = iterator.next()).join();
    } 
    return process.waitFor();
  }
  
  public ᐧᎰ(λ paramλ, int paramInt, ʿশ paramʿশ) {
    this.ᴵʖ = paramλ;
    this.ˊ = new boolean[paramInt];
    this.ʹл = new ArrayList<>();
    this.ʹл.add(paramʿশ);
  }
  
  public ᐧᎰ(ᐧᎰ paramᐧᎰ) {
    this.ᴵʖ = paramᐧᎰ.ᴵʖ;
    this.ˊ = (boolean[])paramᐧᎰ.ˊ.clone();
    this.ʹл = new ArrayList<>(paramᐧᎰ.ʹл);
  }
  
  public boolean ᐨẏ(ᐧᎰ paramᐧᎰ) {
    boolean bool = false;
    byte b;
    for (b = 0; b < this.ˊ.length; b++) {
      if (paramᐧᎰ.ˊ[b] && !this.ˊ[b]) {
        this.ˊ[b] = true;
        bool = true;
      } 
    } 
    if (zubdqvgt.G(paramᐧᎰ.ᴵʖ, this.ᴵʖ))
      for (b = 0; b < paramᐧᎰ.ʹл.size(); b++) {
        ʿশ ʿশ = paramᐧᎰ.ʹл.get(b);
        if (!this.ʹл.contains(ʿশ)) {
          this.ʹл.add(ʿশ);
          bool = true;
        } 
      }  
    return bool;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᐧᎰ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */