package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;
import l.f;
import m.I;

/* compiled from: AppCompatSpinner.java */
/* loaded from: classes.dex */
public final class a extends I {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner.e f5101j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f5102k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AppCompatSpinner appCompatSpinner, View view, AppCompatSpinner.e eVar) {
        super(view);
        this.f5102k = appCompatSpinner;
        this.f5101j = eVar;
    }

    @Override // m.I
    public final f b() {
        return this.f5101j;
    }

    @Override // m.I
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.f5102k;
        if (appCompatSpinner.getInternalPopup().b()) {
            return true;
        }
        appCompatSpinner.f4940f.n(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        return true;
    }
}
