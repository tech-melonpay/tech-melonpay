package m;

import android.view.View;
import android.view.Window;
import l.C0971a;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public final class b0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0971a f23744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.c f23745b;

    public b0(androidx.appcompat.widget.c cVar) {
        this.f23745b = cVar;
        this.f23744a = new C0971a(cVar.f5103a.getContext(), cVar.i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        androidx.appcompat.widget.c cVar = this.f23745b;
        Window.Callback callback = cVar.f5113l;
        if (callback == null || !cVar.f5114m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f23744a);
    }
}
