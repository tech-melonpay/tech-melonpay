package F0;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.luminary.mobile.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/* compiled from: ViewDataBinding.java */
/* loaded from: classes.dex */
public abstract class f extends F0.a {

    /* renamed from: k, reason: collision with root package name */
    public static final boolean f1142k = true;

    /* renamed from: a, reason: collision with root package name */
    public final b f1145a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1146b;

    /* renamed from: c, reason: collision with root package name */
    public final h[] f1147c;

    /* renamed from: d, reason: collision with root package name */
    public final View f1148d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1149e;

    /* renamed from: f, reason: collision with root package name */
    public final Choreographer f1150f;

    /* renamed from: g, reason: collision with root package name */
    public final g f1151g;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f1152h;
    public final c i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f1141j = Build.VERSION.SDK_INT;

    /* renamed from: l, reason: collision with root package name */
    public static final ReferenceQueue<f> f1143l = new ReferenceQueue<>();

    /* renamed from: m, reason: collision with root package name */
    public static final a f1144m = new a();

    /* compiled from: ViewDataBinding.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                f.this.f1146b = false;
            }
            while (true) {
                Reference<? extends f> poll = f.f1143l.poll();
                if (poll == null) {
                    break;
                } else if (poll instanceof h) {
                }
            }
            if (f.this.f1148d.isAttachedToWindow()) {
                f.this.c();
                return;
            }
            View view = f.this.f1148d;
            a aVar = f.f1144m;
            view.removeOnAttachStateChangeListener(aVar);
            f.this.f1148d.addOnAttachStateChangeListener(aVar);
        }
    }

    public f(Object obj, View view, int i) {
        c cVar;
        if (obj == null) {
            cVar = null;
        } else {
            if (!(obj instanceof c)) {
                throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
            }
            cVar = (c) obj;
        }
        this.f1145a = new b();
        this.f1146b = false;
        this.i = cVar;
        this.f1147c = new h[i];
        this.f1148d = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f1142k) {
            this.f1150f = Choreographer.getInstance();
            this.f1151g = new g(this);
        } else {
            this.f1151g = null;
            this.f1152h = new Handler(Looper.myLooper());
        }
    }

    public static int d(int i, View view) {
        return view.getContext().getColor(i);
    }

    public static <T extends f> T f(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z10, Object obj) {
        c cVar;
        if (obj == null) {
            cVar = null;
        } else {
            if (!(obj instanceof c)) {
                throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
            }
            cVar = (c) obj;
        }
        return (T) d.b(layoutInflater, i, viewGroup, z10, cVar);
    }

    public static void g(View view, Object[] objArr, SparseIntArray sparseIntArray, boolean z10) {
        int id;
        int i;
        int i9;
        int length;
        if ((view != null ? (f) view.getTag(R.id.dataBinding) : null) != null) {
            return;
        }
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (z10 && str != null && str.startsWith("layout")) {
            int lastIndexOf = str.lastIndexOf(95);
            if (lastIndexOf > 0 && (length = str.length()) != (i9 = lastIndexOf + 1)) {
                for (int i10 = i9; i10 < length; i10++) {
                    if (Character.isDigit(str.charAt(i10))) {
                    }
                }
                int i11 = 0;
                while (i9 < str.length()) {
                    i11 = (i11 * 10) + (str.charAt(i9) - '0');
                    i9++;
                }
                if (objArr[i11] == null) {
                    objArr[i11] = view;
                }
            }
            id = view.getId();
            if (id > 0) {
                objArr[i] = view;
            }
        } else {
            if (str != null && str.startsWith("binding_")) {
                int i12 = 0;
                for (int i13 = 8; i13 < str.length(); i13++) {
                    i12 = (i12 * 10) + (str.charAt(i13) - '0');
                }
                if (objArr[i12] == null) {
                    objArr[i12] = view;
                }
            }
            id = view.getId();
            if (id > 0 && sparseIntArray != null && (i = sparseIntArray.get(id, -1)) >= 0 && objArr[i] == null) {
                objArr[i] = view;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                g(viewGroup.getChildAt(i14), objArr, sparseIntArray, false);
            }
        }
    }

    public static Object[] h(View view, int i, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        g(view, objArr, sparseIntArray, true);
        return objArr;
    }

    public static int j(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static boolean k(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public abstract void b();

    public final void c() {
        if (this.f1149e) {
            i();
        } else if (e()) {
            this.f1149e = true;
            b();
            this.f1149e = false;
        }
    }

    public abstract boolean e();

    public final void i() {
        synchronized (this) {
            try {
                if (this.f1146b) {
                    return;
                }
                this.f1146b = true;
                if (f1142k) {
                    this.f1150f.postFrameCallback(this.f1151g);
                } else {
                    this.f1152h.post(this.f1145a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(View view) {
        view.setTag(R.id.dataBinding, this);
    }

    public abstract boolean m(int i, Object obj);

    /* compiled from: ViewDataBinding.java */
    public class a implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public final void onViewAttachedToWindow(View view) {
            (view != null ? (f) view.getTag(R.id.dataBinding) : null).f1145a.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
