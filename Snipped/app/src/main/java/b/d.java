package B;

import android.content.Context;
import androidx.camera.core.CameraX;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.view.PreviewView;
import p.InterfaceC1096a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC1096a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f177b;

    public /* synthetic */ d(Object obj, int i) {
        this.f176a = i;
        this.f177b = obj;
    }

    @Override // p.InterfaceC1096a
    public final Object apply(Object obj) {
        switch (this.f176a) {
            case 0:
                g gVar = g.f182g;
                gVar.f187e = (CameraX) obj;
                gVar.f188f = ContextUtil.getApplicationContext((Context) this.f177b);
                return gVar;
            default:
                ((androidx.camera.view.a) this.f177b).a(PreviewView.StreamState.f5828b);
                return null;
        }
    }
}
