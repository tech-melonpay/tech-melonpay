package H1;

import O9.f;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;
import com.google.android.material.appbar.MaterialToolbar;
import ia.InterfaceC0835c;

/* compiled from: ChuckerActivityMainBinding.java */
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1417a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1418b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1419c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1420d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1421e;

    public a(kotlin.jvm.internal.b bVar, InterfaceC0635a interfaceC0635a, InterfaceC0635a interfaceC0635a2, InterfaceC0635a interfaceC0635a3) {
        this.f1417a = bVar;
        this.f1418b = interfaceC0635a;
        this.f1419c = interfaceC0635a2;
        this.f1420d = interfaceC0635a3;
    }

    @Override // O9.f
    public boolean c() {
        throw null;
    }

    @Override // O9.f
    public Object getValue() {
        Q q10 = (Q) this.f1421e;
        if (q10 != null) {
            return q10;
        }
        R0.e eVar = new R0.e((W) ((InterfaceC0635a) this.f1418b).invoke(), (T) ((InterfaceC0635a) this.f1419c).invoke(), (R0.a) ((InterfaceC0635a) this.f1420d).invoke());
        InterfaceC0835c interfaceC0835c = (InterfaceC0835c) this.f1417a;
        String b9 = interfaceC0835c.b();
        if (b9 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        Q a10 = eVar.a(interfaceC0835c, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b9));
        this.f1421e = a10;
        return a10;
    }

    public a(ConstraintLayout constraintLayout, MaterialToolbar materialToolbar, RecyclerView recyclerView, Group group, TextView textView) {
        this.f1417a = constraintLayout;
        this.f1418b = materialToolbar;
        this.f1419c = recyclerView;
        this.f1420d = group;
        this.f1421e = textView;
    }
}
