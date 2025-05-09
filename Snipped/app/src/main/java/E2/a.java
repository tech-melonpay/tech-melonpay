package E2;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: InsetDialogOnTouchListener.java */
/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Dialog f1040a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1041b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1042c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1043d;

    public a(Dialog dialog, Rect rect) {
        this.f1040a = dialog;
        this.f1041b = rect.left;
        this.f1042c = rect.top;
        this.f1043d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f1041b;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f1042c, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f1043d;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f1040a.onTouchEvent(obtain);
    }
}
