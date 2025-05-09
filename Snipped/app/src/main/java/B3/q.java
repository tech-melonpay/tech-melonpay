package b3;

import com.bumptech.glide.load.Key;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.proto.a;
import i3.z;
import java.nio.charset.Charset;

/* compiled from: Util.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8314a = 0;

    static {
        Charset.forName(Key.STRING_CHARSET_NAME);
    }

    public static z a(com.google.crypto.tink.proto.a aVar) {
        z.a w2 = z.w();
        int y10 = aVar.y();
        w2.i();
        z.t((z) w2.f10116b, y10);
        for (a.b bVar : aVar.x()) {
            z.b.a y11 = z.b.y();
            String y12 = bVar.x().y();
            y11.i();
            z.b.t((z.b) y11.f10116b, y12);
            KeyStatusType A10 = bVar.A();
            y11.i();
            z.b.v((z.b) y11.f10116b, A10);
            OutputPrefixType z10 = bVar.z();
            y11.i();
            z.b.u((z.b) y11.f10116b, z10);
            int y13 = bVar.y();
            y11.i();
            z.b.w((z.b) y11.f10116b, y13);
            z.b g10 = y11.g();
            w2.i();
            z.u((z) w2.f10116b, g10);
        }
        return w2.g();
    }
}
