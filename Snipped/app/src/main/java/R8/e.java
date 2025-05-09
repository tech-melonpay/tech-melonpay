package R8;

import O9.p;
import android.database.DataSetObserver;
import ca.InterfaceC0635a;

/* compiled from: ViewPagerAttacher.kt */
/* loaded from: classes2.dex */
public final class e extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0635a<p> f3316a;

    public e(InterfaceC0635a<p> interfaceC0635a) {
        this.f3316a = interfaceC0635a;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        super.onChanged();
        this.f3316a.invoke();
    }
}
