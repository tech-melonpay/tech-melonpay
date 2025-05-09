package C;

import android.content.ContentValues;
import android.net.Uri;
import x0.InterfaceC1579a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class A implements InterfaceC1579a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f494a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0496l f495b;

    @Override // x0.InterfaceC1579a
    public final void accept(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f494a) {
            case 0:
                if (uri.equals(Uri.EMPTY)) {
                    return;
                }
                new ContentValues().put("is_pending", (Integer) 0);
                this.f495b.getClass();
                throw null;
            default:
                if (uri.equals(Uri.EMPTY)) {
                    return;
                }
                this.f495b.getClass();
                throw null;
        }
    }
}
