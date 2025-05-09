package b3;

import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import i3.x;

/* compiled from: KeyTemplate.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final x f8291a;

    public e(x xVar) {
        this.f8291a = xVar;
    }

    public static e a(String str, byte[] bArr) {
        x.a A10 = x.A();
        A10.i();
        x.t((x) A10.f10116b, str);
        ByteString c2 = ByteString.c(0, bArr.length, bArr);
        A10.i();
        x.u((x) A10.f10116b, c2);
        OutputPrefixType outputPrefixType = OutputPrefixType.TINK;
        A10.i();
        x.v((x) A10.f10116b, outputPrefixType);
        return new e(A10.g());
    }
}
