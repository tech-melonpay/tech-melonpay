package A0;

import A0.d;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import y0.C1596C;
import y0.C1599c;

/* compiled from: InputConnectionCompat.java */
/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f15a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InputConnection inputConnection, b bVar) {
        super(inputConnection, false);
        this.f15a = bVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        C1599c.b bVar;
        d dVar = inputContentInfo == null ? null : new d(new d.a(inputContentInfo));
        b bVar2 = this.f15a;
        bVar2.getClass();
        if ((i & 1) != 0) {
            try {
                ((d.a) dVar.f16a).a();
                InputContentInfo inputContentInfo2 = ((d.a) dVar.f16a).f17a;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((d.a) dVar.f16a).f17a.getDescription();
        d.a aVar = (d.a) dVar.f16a;
        ClipData clipData = new ClipData(description, new ClipData.Item(aVar.f17a.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            bVar = new C1599c.a(clipData, 2);
        } else {
            C1599c.C0482c c0482c = new C1599c.C0482c();
            c0482c.f31052a = clipData;
            c0482c.f31053b = 2;
            bVar = c0482c;
        }
        bVar.a(aVar.f17a.getLinkUri());
        bVar.setExtras(bundle2);
        if (C1596C.k((View) bVar2.f14b, bVar.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
