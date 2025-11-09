package yyds.sniarbtej;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ylt.pmn.zubdqvgt;

public class ـไ extends ᐧє implements ـﭔ {
  private final BitSet ᐨẏ = new BitSet();
  
  private final Map<λ, BitSet> ᴵʖ = new HashMap<>();
  
  final BitSet ˊ = new BitSet();
  
  private ـไ(ˉｓ paramˉｓ, int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
    this(589824, paramˉｓ, paramInt, paramString1, paramString2, paramString3, paramArrayOfString);
    if (!zubdqvgt.G(getClass(), ـไ.class))
      throw new IllegalStateException(); 
  }
  
  private ـไ(int paramInt1, ˉｓ paramˉｓ, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
    super(589824, paramInt2, paramString1, paramString2, paramString3, paramArrayOfString);
    this.ᐨẏ = (BitSet)paramˉｓ;
  }
  
  public final void ᐨẏ(int paramInt, ᔪ paramᔪ) {
    super.ᐨẏ(paramInt, paramᔪ);
    BitSet bitSet;
    λ λ = ((ʿশ)((ـс)(bitSet = this.ˊ)).ﾞл).ˊ;
    if (paramInt == 168 && !this.ᴵʖ.containsKey(λ))
      this.ᴵʖ.put(λ, new BitSet()); 
  }
  
  public final void ᐨẏ() {
    if (!this.ᴵʖ.isEmpty()) {
      ـไ ـไ1 = this;
      BitSet bitSet = new BitSet();
      ـไ1.ᐨẏ(0, ـไ1.ᐨẏ, bitSet);
      Iterator<Map.Entry> iterator = ـไ1.ᴵʖ.entrySet().iterator();
      while (iterator.hasNext()) {
        Map.Entry<λ, ?> entry;
        λ λ = (entry = iterator.next()).getKey();
        BitSet bitSet1 = (BitSet)entry.getValue();
        ـไ1.ᐨẏ(ـไ1.ˊ.ᐨẏ(λ), bitSet1, bitSet);
      } 
      ʴ();
    } 
    if (this.ᐨẏ != null)
      ᐨẏ((ˉｓ)this.ᐨẏ); 
  }
  
  private void ﹳיִ() {
    BitSet bitSet = new BitSet();
    ᐨẏ(0, this.ᐨẏ, bitSet);
    Iterator<Map.Entry> iterator = this.ᴵʖ.entrySet().iterator();
    while (iterator.hasNext()) {
      Map.Entry<λ, ?> entry;
      λ λ = (entry = iterator.next()).getKey();
      BitSet bitSet1 = (BitSet)entry.getValue();
      ᐨẏ(this.ˊ.ᐨẏ(λ), bitSet1, bitSet);
    } 
  }
  
  private void ᐨẏ(int paramInt, BitSet paramBitSet1, BitSet paramBitSet2) {
    ˊ(paramInt, paramBitSet1, paramBitSet2);
    do {
      paramInt = 0;
      for (ˌț ˌț : this.ﾞǰ) {
        int j = this.ˊ.ᐨẏ(ˌț.ʹﮃ);
        int k = this.ˊ.ᐨẏ(ˌț.ᴵʖ);
        int i = this.ˊ.ᐨẏ(ˌț.ﾞл);
        int m;
        if (!paramBitSet1.get(j) && (m = paramBitSet1.nextSetBit(k)) >= k && m < i) {
          ˊ(j, paramBitSet1, paramBitSet2);
          paramInt = 1;
        } 
      } 
    } while (paramInt != 0);
  }
  
  private void ˊ(int paramInt, BitSet paramBitSet1, BitSet paramBitSet2) {
    BitSet bitSet;
    for (paramInt = paramInt; paramInt < ((ـс)(bitSet = this.ˊ)).ʿᵉ; paramInt++) {
      if (paramBitSet1.get(paramInt))
        return; 
      paramBitSet1.set(paramInt);
      if (paramBitSet2.get(paramInt))
        this.ˊ.set(paramInt); 
      paramBitSet2.set(paramInt);
      Ӏ ӏ;
      if ((ӏ = this.ˊ.ᐨẏ(paramInt)).ﹳיִ() == 7 && ӏ.ˈהּ() != 168) {
        ӏ = ӏ;
        ˊ(this.ˊ.ᐨẏ(((ʿশ)ӏ).ˊ), paramBitSet1, paramBitSet2);
      } else if (ӏ.ﹳיִ() == 11) {
        ӏ = ӏ;
        ˊ(this.ˊ.ᐨẏ(((יᔭ)ӏ).ʿᵉ), paramBitSet1, paramBitSet2);
        for (λ λ : ((יᔭ)ӏ).ﾞл)
          ˊ(this.ˊ.ᐨẏ(λ), paramBitSet1, paramBitSet2); 
      } else if (ӏ.ﹳיִ() == 12) {
        ӏ = ӏ;
        ˊ(this.ˊ.ᐨẏ(((ﹳڐ)ӏ).ʿᵉ), paramBitSet1, paramBitSet2);
        for (λ λ : ((ﹳڐ)ӏ).ﾞл)
          ˊ(this.ˊ.ᐨẏ(λ), paramBitSet1, paramBitSet2); 
      } 
      switch (this.ˊ.ᐨẏ(paramInt).ˈהּ()) {
        case 167:
        case 169:
        case 170:
        case 171:
        case 172:
        case 173:
        case 174:
        case 175:
        case 176:
        case 177:
        case 191:
          return;
      } 
    } 
  }
  
  private void ʴ() {
    LinkedList<ˊᴬ> linkedList;
    (linkedList = new LinkedList<>()).add(new ˊᴬ(this, null, this.ᐨẏ));
    ـс ـс = new ـс();
    ArrayList<ˌț> arrayList = new ArrayList();
    ArrayList<ᕻ> arrayList1 = new ArrayList();
    while (!linkedList.isEmpty()) {
      ˊᴬ ˊᴬ = linkedList.removeFirst();
      ᐨẏ(ˊᴬ, linkedList, ـс, arrayList, arrayList1);
    } 
    this.ˊ = (BitSet)ـс;
    this.ﾞǰ = arrayList;
    this.ˊᵃ = arrayList1;
  }
  
  private void ᐨẏ(ˊᴬ paramˊᴬ, List<ˊᴬ> paramList, ـс paramـс, List<ˌț> paramList1, List<ᕻ> paramList2) {
    λ λ = null;
    BitSet bitSet;
    for (byte b = 0; b < ((ـс)(bitSet = this.ˊ)).ʿᵉ; b++) {
      Ӏ ӏ;
      if ((ӏ = this.ˊ.ᐨẏ(b)).ﹳיִ() == 8) {
        λ λ1 = (λ)ӏ;
        λ λ2;
        if (!zubdqvgt.G(λ2 = paramˊᴬ.ˊ(λ1), λ)) {
          paramـс.ᐨẏ(λ2);
          λ = λ2;
        } 
      } else if (zubdqvgt.G(paramˊᴬ.ᐨẏ(b), paramˊᴬ)) {
        if (ӏ.ˈהּ() == 169) {
          ـไ ـไ1 = null;
          ˊᴬ ˊᴬ1 = paramˊᴬ;
          while (ˊᴬ1 != null) {
            if (ˊᴬ1.ᴵʖ.get(b))
              ـไ1 = ˊᴬ1.ᐨẏ; 
            ـไ ـไ2 = ˊᴬ1.ᐨẏ;
          } 
          if (ـไ1 == null) {
            "ᘕꯔﻖ剴ᙢ⮄ꎦ箞綅눉맮ᑎꦻ䏕".toCharArray()[5] = (char)("ᘕꯔﻖ剴ᙢ⮄ꎦ箞綅눉맮ᑎꦻ䏕".toCharArray()[5] ^ 0x3E43);
            "✭鰷?䪸䪔鶹⒣䴫䃰⣷ꨉ廖ꓳ㔔袩棿ⷀｑ쾔䪟쉪睚꺴ⴔ祽艉ഝ䥃笽ߦἭ虺椸޿歩".toCharArray()[13] = (char)("✭鰷?䪸䪔鶹⒣䴫䃰⣷ꨉ廖ꓳ㔔袩棿ⷀｑ쾔䪟쉪睚꺴ⴔ祽艉ഝ䥃笽ߦἭ虺椸޿歩".toCharArray()[13] ^ 0x1547);
            throw new IllegalArgumentException(ˏȓ$ᴵЃ.E("ᘕꯔﻖ剴ᙢ⮄ꎦ箞綅눉맮ᑎꦻ䏕".toCharArray(), (short)25671, (short)3, (short)2) + b + ˏȓ$ᴵЃ.E("✭鰷?䪸䪔鶹⒣䴫䃰⣷ꨉ廖ꓳ㔔袩棿ⷀｑ쾔䪟쉪睚꺴ⴔ祽艉ഝ䥃笽ߦἭ虺椸޿歩".toCharArray(), (short)21461, (short)1, (short)0));
          } 
          paramـс.ᐨẏ(new ʿশ(167, (λ)ـไ1));
        } else if (ӏ.ˈהּ() == 168) {
          λ λ1 = ((ʿশ)ӏ).ˊ;
          BitSet bitSet1 = this.ᴵʖ.get(λ1);
          ˊᴬ ˊᴬ1;
          ӏ = (ˊᴬ1 = new ˊᴬ(this, paramˊᴬ, bitSet1)).ᐨẏ(λ1);
          paramـс.ᐨẏ(new ˏﾚ(1));
          paramـс.ᐨẏ(new ʿশ(167, (λ)ӏ));
          paramـс.ᐨẏ((Ӏ)ˊᴬ1.ᐨẏ);
          paramList.add(ˊᴬ1);
        } else {
          paramـс.ᐨẏ(ӏ.ᐨẏ(paramˊᴬ));
        } 
      } 
    } 
    for (ˌț ˌț : this.ﾞǰ) {
      λ λ1 = paramˊᴬ.ˊ(ˌț.ᴵʖ);
      λ λ2 = paramˊᴬ.ˊ(ˌț.ﾞл);
      if (!zubdqvgt.G(λ1, λ2)) {
        λ λ3 = paramˊᴬ.ᐨẏ(ˌț.ʹﮃ);
        if (λ1 == null || λ2 == null || λ3 == null) {
          "м濮჎⻩瑯ᑯꚱ鑬㰴谰띜屃勳쁮䎊".toCharArray()[12] = (char)("м濮჎⻩瑯ᑯꚱ鑬㰴谰띜屃勳쁮䎊".toCharArray()[12] ^ 0x4A57);
          throw new AssertionError(ˏȓ$ᴵЃ.E("м濮჎⻩瑯ᑯꚱ鑬㰴谰띜屃勳쁮䎊".toCharArray(), (short)31329, (short)2, (short)3));
        } 
        paramList1.add(new ˌț(λ1, λ2, λ3, ˌț.ᐨẏ));
      } 
    } 
    for (ᕻ ᕻ : this.ˊᵃ) {
      λ λ1 = paramˊᴬ.ˊ(ᕻ.ᴵʖ);
      λ λ2 = paramˊᴬ.ˊ(ᕻ.ﾞл);
      if (!zubdqvgt.G(λ1, λ2))
        paramList2.add(new ᕻ(ᕻ.name, ᕻ.ˎᴗ, ᕻ.ˊﮈ, λ1, λ2, ᕻ.ͺᴲ)); 
    } 
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ـไ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */