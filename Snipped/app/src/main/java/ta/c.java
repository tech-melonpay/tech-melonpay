package ta;

import ka.C0966k;
import kotlin.Result;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* compiled from: ArrayPools.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f29980a;

    static {
        Object failure;
        try {
            failure = C0966k.S(System.getProperty("kotlinx.serialization.json.pool.size"));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Integer num = (Integer) failure;
        f29980a = num != null ? num.intValue() : PKIFailureInfo.badSenderNonce;
    }
}
