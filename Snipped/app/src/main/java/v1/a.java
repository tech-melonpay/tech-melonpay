package V1;

import W1.d;
import android.view.MotionEvent;
import android.view.View;
import com.futuremind.recyclerviewfastscroll.FastScroller;

/* compiled from: FastScroller.java */
/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FastScroller f3719a;

    public a(FastScroller fastScroller) {
        this.f3719a = fastScroller;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f10;
        int width;
        int width2;
        FastScroller fastScroller = this.f3719a;
        fastScroller.requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            fastScroller.f8797l = false;
            if (fastScroller.f8799n != null) {
                W1.b bVar = fastScroller.f8798m;
                bVar.getClass();
                if (bVar.a() != null) {
                    d dVar = (d) bVar.a().f535b;
                    dVar.a();
                    dVar.f3800b.start();
                }
            }
            return true;
        }
        if (fastScroller.f8799n != null && motionEvent.getAction() == 0) {
            W1.b bVar2 = fastScroller.f8798m;
            bVar2.getClass();
            if (bVar2.a() != null) {
                bVar2.a().n();
            }
        }
        fastScroller.f8797l = true;
        if (fastScroller.c()) {
            float rawY = motionEvent.getRawY();
            View view2 = fastScroller.f8790d;
            ((View) view2.getParent()).getLocationInWindow(new int[]{0, (int) view2.getY()});
            f10 = rawY - r2[1];
            width = fastScroller.getHeight();
            width2 = fastScroller.f8790d.getHeight();
        } else {
            float rawX = motionEvent.getRawX();
            View view3 = fastScroller.f8790d;
            ((View) view3.getParent()).getLocationInWindow(new int[]{(int) view3.getX(), 0});
            f10 = rawX - r3[0];
            width = fastScroller.getWidth();
            width2 = fastScroller.f8790d.getWidth();
        }
        float f11 = f10 / (width - width2);
        fastScroller.setScrollerPosition(f11);
        fastScroller.setRecyclerViewPosition(f11);
        return true;
    }
}
