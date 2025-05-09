package M2;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;

/* compiled from: NavigationBarMenu.java */
/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: A, reason: collision with root package name */
    public final int f2566A;

    /* renamed from: z, reason: collision with root package name */
    public final Class<?> f2567z;

    public c(Context context, Class<?> cls, int i) {
        super(context);
        this.f2567z = cls;
        this.f2566A = i;
    }

    @Override // androidx.appcompat.view.menu.f
    public final h a(int i, int i9, int i10, CharSequence charSequence) {
        int size = this.f4751f.size() + 1;
        int i11 = this.f2566A;
        if (size <= i11) {
            w();
            h a10 = super.a(i, i9, i10, charSequence);
            a10.g(true);
            v();
            return a10;
        }
        String simpleName = this.f2567z.getSimpleName();
        StringBuilder sb2 = new StringBuilder("Maximum number of items supported by ");
        sb2.append(simpleName);
        sb2.append(" is ");
        sb2.append(i11);
        sb2.append(". Limit can be checked with ");
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.n(sb2, simpleName, "#getMaxItemCount()"));
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final SubMenu addSubMenu(int i, int i9, int i10, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f2567z.getSimpleName().concat(" does not support submenus"));
    }
}
