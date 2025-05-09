package k1;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.luminary.mobile.R;
import java.util.ArrayList;

/* compiled from: GhostViewHolder.java */
@SuppressLint({"ViewConstructor"})
/* renamed from: k1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0936q extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f22906c = 0;

    /* renamed from: a, reason: collision with root package name */
    public ViewGroup f22907a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22908b;

    /* compiled from: GhostViewHolder.java */
    /* renamed from: k1.q$a */
    public static class a {
        public static float a(View view) {
            return view.getZ();
        }
    }

    public static void a(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (!this.f22908b) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            ViewGroup viewGroup = this.f22907a;
            viewGroup.setTag(R.id.ghost_view_holder, null);
            viewGroup.getOverlay().remove(this);
            this.f22908b = false;
        }
    }
}
