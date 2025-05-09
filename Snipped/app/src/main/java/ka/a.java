package Ka;

import Ka.f;
import org.jmrtd.PassportService;

/* compiled from: Util.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final f.a f2278a = new f.a();

    /* renamed from: b, reason: collision with root package name */
    public static final int f2279b = -1234567890;

    public static final void a(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final String b(byte b9) {
        char[] cArr = La.b.f2501a;
        return new String(new char[]{cArr[(b9 >> 4) & 15], cArr[b9 & PassportService.SFI_DG15]});
    }
}
