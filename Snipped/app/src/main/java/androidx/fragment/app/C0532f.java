package androidx.fragment.app;

import android.content.Context;
import androidx.activity.ComponentActivity;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0532f implements d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f6857b;

    public /* synthetic */ C0532f(ComponentActivity componentActivity, int i) {
        this.f6856a = i;
        this.f6857b = componentActivity;
    }

    @Override // d.b
    public final void a(Context context) {
        switch (this.f6856a) {
            case 0:
                ((ActivityC0533g) this.f6857b).lambda$init$3(context);
                break;
            default:
                ComponentActivity._init_$lambda$5(this.f6857b, context);
                break;
        }
    }
}
