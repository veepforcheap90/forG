package ylt.pmn;

import java.util.zip.Inflater;

public class srjflvmm extends Inflater {
  ofvanvcs G;
  
  public srjflvmm(ofvanvcs paramofvanvcs) {
    super(false);
    this.G = paramofvanvcs;
  }
  
  public void setInput(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.G.f(paramArrayOfbyte, paramInt1, paramInt2);
    super.setInput(paramArrayOfbyte, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\ylt\pmn\srjflvmm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */