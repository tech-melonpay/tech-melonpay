package I0;

import android.annotation.SuppressLint;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* compiled from: EmojiExclusions.java */
/* loaded from: classes.dex */
public final class d {
    @SuppressLint({"BanUncheckedReflection"})
    public static Set a() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static J0.b b(MappedByteBuffer mappedByteBuffer) {
        long j10;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i9 = 0;
        while (true) {
            if (i9 >= i) {
                j10 = -1;
                break;
            }
            int i10 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j10 = duplicate.getInt() & BodyPartID.bodyIdMax;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i10) {
                break;
            }
            i9++;
        }
        if (j10 != -1) {
            duplicate.position(duplicate.position() + ((int) (j10 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j11 = duplicate.getInt() & BodyPartID.bodyIdMax;
            for (int i11 = 0; i11 < j11; i11++) {
                int i12 = duplicate.getInt();
                long j12 = duplicate.getInt() & BodyPartID.bodyIdMax;
                duplicate.getInt();
                if (1164798569 == i12 || 1701669481 == i12) {
                    duplicate.position((int) (j12 + j10));
                    J0.b bVar = new J0.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f2099b = duplicate;
                    bVar.f2098a = position;
                    int i13 = position - duplicate.getInt(position);
                    bVar.f2100c = i13;
                    bVar.f2101d = bVar.f2099b.getShort(i13);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
