package H1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C0653a;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.luminary.mobile.R;
import t2.C1279a;

/* compiled from: ChuckerFragmentTransactionPayloadBinding.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1438a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1439b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1440c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1441d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1442e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1443f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1444g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1445h;

    public c(ConstraintLayout constraintLayout, TextView textView, Group group, CircularProgressIndicator circularProgressIndicator, RecyclerView recyclerView, LinearLayoutCompat linearLayoutCompat, ImageButton imageButton, ImageButton imageButton2, TextView textView2) {
        this.f1438a = textView;
        this.f1440c = group;
        this.f1441d = circularProgressIndicator;
        this.f1442e = recyclerView;
        this.f1443f = linearLayoutCompat;
        this.f1444g = imageButton;
        this.f1445h = imageButton2;
        this.f1439b = textView2;
    }

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(P2.b.c(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, C1279a.f27505w);
        this.f1438a = C0653a.a(context, obtainStyledAttributes.getResourceId(4, 0));
        this.f1444g = C0653a.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f1439b = C0653a.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f1440c = C0653a.a(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList b9 = P2.c.b(obtainStyledAttributes, context, 7);
        this.f1441d = C0653a.a(context, obtainStyledAttributes.getResourceId(9, 0));
        this.f1442e = C0653a.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1443f = C0653a.a(context, obtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.f1445h = paint;
        paint.setColor(b9.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
