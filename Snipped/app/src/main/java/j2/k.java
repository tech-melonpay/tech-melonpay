package J2;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import java.util.WeakHashMap;
import y0.C1596C;
import y0.E;
import y0.J;
import y0.p;

/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public final class k {

    /* compiled from: ViewUtils.java */
    public class a implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f2137a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f2138b;

        public a(b bVar, c cVar) {
            this.f2137a = bVar;
            this.f2138b = cVar;
        }

        @Override // y0.p
        public final J c(View view, J j10) {
            c cVar = new c();
            c cVar2 = this.f2138b;
            cVar.f2139a = cVar2.f2139a;
            cVar.f2140b = cVar2.f2140b;
            cVar.f2141c = cVar2.f2141c;
            cVar.f2142d = cVar2.f2142d;
            return this.f2137a.a(view, j10, cVar);
        }
    }

    /* compiled from: ViewUtils.java */
    public interface b {
        J a(View view, J j10, c cVar);
    }

    /* compiled from: ViewUtils.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f2139a;

        /* renamed from: b, reason: collision with root package name */
        public int f2140b;

        /* renamed from: c, reason: collision with root package name */
        public int f2141c;

        /* renamed from: d, reason: collision with root package name */
        public int f2142d;
    }

    public static void a(View view, b bVar) {
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        c cVar = new c();
        cVar.f2139a = paddingStart;
        cVar.f2140b = paddingTop;
        cVar.f2141c = paddingEnd;
        cVar.f2142d = paddingBottom;
        C1596C.d.m(view, new a(bVar, cVar));
        if (view.isAttachedToWindow()) {
            C1596C.c.c(view);
        } else {
            view.addOnAttachStateChangeListener(new l());
        }
    }

    public static float b(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static boolean c(View view) {
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode d(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
