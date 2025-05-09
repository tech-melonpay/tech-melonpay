package androidx.navigation;

import android.view.View;
import ca.InterfaceC0646l;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* compiled from: Navigation.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Navigation$findViewNavController$1 extends Lambda implements InterfaceC0646l<View, View> {

    /* renamed from: l, reason: collision with root package name */
    public static final Navigation$findViewNavController$1 f7249l = new Navigation$findViewNavController$1();

    public Navigation$findViewNavController$1() {
        super(1);
    }

    @Override // ca.InterfaceC0646l
    public final View invoke(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
