package x2;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: BottomAppBar.java */
/* renamed from: x2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1585b extends FloatingActionButton.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f30919b;

    /* compiled from: BottomAppBar.java */
    /* renamed from: x2.b$a */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            BottomAppBar bottomAppBar = C1585b.this.f30919b;
            int i = BottomAppBar.f9129k0;
            bottomAppBar.getClass();
        }
    }

    public C1585b(BottomAppBar bottomAppBar, int i) {
        this.f30919b = bottomAppBar;
        this.f30918a = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f30919b.B(this.f30918a));
        floatingActionButton.k(new a(), true);
    }
}
