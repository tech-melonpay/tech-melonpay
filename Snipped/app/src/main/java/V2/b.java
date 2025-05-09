package V2;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.luminary.mobile.R;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import y0.C1597a;
import z0.C1638d;

/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes.dex */
public final class b extends C1597a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3723e;

    public /* synthetic */ b(Object obj, int i) {
        this.f3722d = i;
        this.f3723e = obj;
    }

    @Override // y0.C1597a
    public final void d(View view, C1638d c1638d) {
        switch (this.f3722d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.f31046a;
                AccessibilityNodeInfo accessibilityNodeInfo = c1638d.f31219a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                c1638d.a(PKIFailureInfo.badCertTemplate);
                accessibilityNodeInfo.setDismissable(true);
                break;
            default:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f31046a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = c1638d.f31219a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                MaterialCalendar materialCalendar = (MaterialCalendar) this.f3723e;
                accessibilityNodeInfo2.setHintText(materialCalendar.s0.getVisibility() == 0 ? materialCalendar.getString(R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
        }
    }

    @Override // y0.C1597a
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f3722d) {
            case 0:
                if (i != 1048576) {
                    break;
                } else {
                    ((BaseTransientBottomBar) this.f3723e).a();
                    break;
                }
        }
        return super.g(view, i, bundle);
    }
}
