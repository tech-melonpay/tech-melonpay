package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.b;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.d f4727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItem f4728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f4729c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.c f4730d;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.f4730d = cVar;
        this.f4727a = dVar;
        this.f4728b = hVar;
        this.f4729c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.d dVar = this.f4727a;
        if (dVar != null) {
            b.c cVar = this.f4730d;
            b.this.f4696A = true;
            dVar.f4725b.c(false);
            b.this.f4696A = false;
        }
        MenuItem menuItem = this.f4728b;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f4729c.q(menuItem, null, 4);
        }
    }
}
