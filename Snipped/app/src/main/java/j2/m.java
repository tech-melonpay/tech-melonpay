package J2;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

/* compiled from: VisibilityAwareImageButton.java */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class m extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public int f2143a;

    public final void b(int i, boolean z10) {
        super.setVisibility(i);
        if (z10) {
            this.f2143a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f2143a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        b(i, true);
    }
}
