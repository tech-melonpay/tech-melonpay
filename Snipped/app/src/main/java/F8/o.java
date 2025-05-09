package F8;

import O9.p;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import ca.InterfaceC0635a;
import k0.C0913a;
import kotlin.jvm.internal.Ref$LongRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes2.dex */
public final class o {
    public static final int a(int i, View view) {
        return C0913a.getColor(view.getContext(), i);
    }

    public static final void b(View view) {
        view.setVisibility(8);
    }

    public static final void c(View view, long j10, InterfaceC0635a<p> interfaceC0635a) {
        if (interfaceC0635a != null) {
            view.setOnClickListener(new l(new Ref$LongRef(), j10, new m(0, interfaceC0635a), 1));
        }
    }

    public static final void e(View view) {
        float f10 = 0;
        view.setPadding(U4.b.C(Resources.getSystem().getDisplayMetrics().density * f10), U4.b.C(Resources.getSystem().getDisplayMetrics().density * f10), U4.b.C(Resources.getSystem().getDisplayMetrics().density * f10), U4.b.C(f10 * Resources.getSystem().getDisplayMetrics().density));
    }

    public static void f(View view, int i, int i9, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i = view.getPaddingStart();
        }
        if ((i12 & 2) != 0) {
            i9 = view.getPaddingTop();
        }
        if ((i12 & 4) != 0) {
            i10 = view.getPaddingEnd();
        }
        if ((i12 & 8) != 0) {
            i11 = view.getPaddingBottom();
        }
        view.setPadding(i, i9, i10, i11);
    }

    public static l g(View.OnClickListener onClickListener) {
        return new l(new Ref$LongRef(), 500L, onClickListener, 0);
    }

    public static final void h(TextView textView, int i) {
        textView.setTextColor(C0913a.getColor(textView.getContext(), i));
    }

    public static final void i(View view, boolean z10) {
        if (z10) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }
}
