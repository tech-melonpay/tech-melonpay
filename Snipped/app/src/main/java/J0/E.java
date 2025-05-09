package j0;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RemoteInput.java */
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final String f22236a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f22237b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence[] f22238c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22239d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22240e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f22241f;

    /* renamed from: g, reason: collision with root package name */
    public final Set<String> f22242g;

    /* compiled from: RemoteInput.java */
    public static class a {
        public static int a(RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        public static void b(RemoteInput.Builder builder, int i) {
            builder.setEditChoicesBeforeSending(i);
        }
    }

    public E(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i, Bundle bundle, HashSet hashSet) {
        this.f22236a = str;
        this.f22237b = charSequence;
        this.f22238c = charSequenceArr;
        this.f22239d = z10;
        this.f22240e = i;
        this.f22241f = bundle;
        this.f22242g = hashSet;
        if (i == 2 && !z10) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }
}
