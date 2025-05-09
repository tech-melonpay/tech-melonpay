package t0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper.java */
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f27404a;

    public i(Object obj) {
        this.f27404a = (LocaleList) obj;
    }

    @Override // t0.h
    public final String a() {
        return this.f27404a.toLanguageTags();
    }

    @Override // t0.h
    public final Object b() {
        return this.f27404a;
    }

    public final boolean equals(Object obj) {
        return this.f27404a.equals(((h) obj).b());
    }

    @Override // t0.h
    public final Locale get(int i) {
        return this.f27404a.get(i);
    }

    public final int hashCode() {
        return this.f27404a.hashCode();
    }

    @Override // t0.h
    public final boolean isEmpty() {
        return this.f27404a.isEmpty();
    }

    @Override // t0.h
    public final int size() {
        return this.f27404a.size();
    }

    public final String toString() {
        return this.f27404a.toString();
    }
}
