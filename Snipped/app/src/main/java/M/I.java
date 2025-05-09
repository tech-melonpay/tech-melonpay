package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* compiled from: ForwardingListener.java */
/* loaded from: classes.dex */
public abstract class I implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f23629a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23630b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23631c;

    /* renamed from: d, reason: collision with root package name */
    public final View f23632d;

    /* renamed from: e, reason: collision with root package name */
    public a f23633e;

    /* renamed from: f, reason: collision with root package name */
    public b f23634f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23635g;

    /* renamed from: h, reason: collision with root package name */
    public int f23636h;
    public final int[] i = new int[2];

    /* compiled from: ForwardingListener.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = I.this.f23632d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            I i = I.this;
            i.a();
            View view = i.f23632d;
            if (view.isEnabled() && !view.isLongClickable() && i.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                i.f23635g = true;
            }
        }
    }

    public I(View view) {
        this.f23632d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f23629a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f23630b = tapTimeout;
        this.f23631c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f23634f;
        View view = this.f23632d;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        a aVar = this.f23633e;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
    }

    public abstract l.f b();

    public abstract boolean c();

    public boolean d() {
        l.f b9 = b();
        if (b9 == null || !b9.b()) {
            return true;
        }
        b9.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.I.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f23635g = false;
        this.f23636h = -1;
        a aVar = this.f23633e;
        if (aVar != null) {
            this.f23632d.removeCallbacks(aVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
