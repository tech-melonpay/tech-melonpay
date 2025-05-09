package q1;

import O9.p;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public final class b extends FragmentManager.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f25846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f25847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f25848c;

    public b(a aVar, Fragment fragment, FrameLayout frameLayout) {
        this.f25848c = aVar;
        this.f25846a = fragment;
        this.f25847b = frameLayout;
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void j(FragmentManager fragmentManager, Fragment fragment, View view) {
        if (fragment == this.f25846a) {
            n nVar = fragmentManager.f6747p;
            synchronized (nVar.f6876b) {
                try {
                    int size = nVar.f6876b.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (nVar.f6876b.get(i).f6877a == this) {
                            nVar.f6876b.remove(i);
                            break;
                        }
                        i++;
                    }
                    p pVar = p.f3034a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            a aVar = this.f25848c;
            FrameLayout frameLayout = this.f25847b;
            aVar.getClass();
            a.d(view, frameLayout);
        }
    }
}
