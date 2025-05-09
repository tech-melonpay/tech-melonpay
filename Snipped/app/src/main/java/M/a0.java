package m;

import androidx.appcompat.widget.Toolbar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f23742b;

    public /* synthetic */ a0(Toolbar toolbar, int i) {
        this.f23741a = i;
        this.f23742b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23741a) {
            case 0:
                Toolbar.f fVar = this.f23742b.f5057M;
                androidx.appcompat.view.menu.h hVar = fVar == null ? null : fVar.f5094b;
                if (hVar != null) {
                    hVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f23742b.n();
                break;
        }
    }
}
