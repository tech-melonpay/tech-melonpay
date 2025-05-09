package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzsg;
import com.google.android.gms.internal.gtm.zzsh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import s3.b;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public abstract class zzsh<MessageType extends zzsh<MessageType, BuilderType>, BuilderType extends zzsg<MessageType, BuilderType>> implements zzwk {
    protected int zzb = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void zzS(Iterable<T> iterable, List<? super T> list) {
        zzvi.zze(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
        }
        int size = list.size();
        for (T t3 : iterable) {
            if (t3 == null) {
                int size2 = list.size();
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Element at index ");
                sb2.append(size2 - size);
                sb2.append(" is null.");
                String sb3 = sb2.toString();
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(sb3);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(t3);
            }
        }
    }

    public int zzQ() {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zzwk
    public final zztd zzR() {
        try {
            int zzX = zzX();
            zztd zztdVar = zztd.zzb;
            byte[] bArr = new byte[zzX];
            zzto zzF = zzto.zzF(bArr);
            zzaq(zzF);
            zzF.zzG();
            return new zzta(bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException(b.n(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public void zzT(int i) {
        throw null;
    }
}
