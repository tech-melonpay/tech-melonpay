package w1;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import s1.AbstractC1197g;

/* compiled from: SystemJobInfoConverter.java */
/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1564a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f30810b = AbstractC1197g.e("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f30811a;

    public C1564a(Context context) {
        this.f30811a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
