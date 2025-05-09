package v2;

import android.view.View;
import java.util.WeakHashMap;
import y0.C1596C;
import y0.E;

/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final View f30557a;

    /* renamed from: b, reason: collision with root package name */
    public int f30558b;

    /* renamed from: c, reason: collision with root package name */
    public int f30559c;

    /* renamed from: d, reason: collision with root package name */
    public int f30560d;

    public g(View view) {
        this.f30557a = view;
    }

    public final void a() {
        int i = this.f30560d;
        View view = this.f30557a;
        int top = i - (view.getTop() - this.f30558b);
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f30559c));
    }

    public final boolean b(int i) {
        if (this.f30560d == i) {
            return false;
        }
        this.f30560d = i;
        a();
        return true;
    }
}
