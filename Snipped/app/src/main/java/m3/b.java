package m3;

import com.google.gson.JsonIOException;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f23896a;

    public /* synthetic */ b(String str, boolean z10) {
        this.f23896a = str;
    }

    @Override // m3.i
    public Object a() {
        throw new JsonIOException(this.f23896a);
    }

    public String b(Object obj) {
        String obj2 = obj.toString();
        if (obj2 != null && obj2.length() != 0) {
            int length = obj2.length();
            int i = 0;
            while (i < length) {
                int codePointAt = obj2.codePointAt(i);
                if (Character.isLetterOrDigit(codePointAt)) {
                    i += Character.charCount(codePointAt);
                }
            }
            return this.f23896a + obj;
        }
        throw new IllegalArgumentException(s3.b.j("Invalid key: ", obj2));
    }

    public b(String str) {
        this.f23896a = str.concat("_");
    }
}
