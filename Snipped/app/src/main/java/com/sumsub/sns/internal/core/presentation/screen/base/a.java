package com.sumsub.sns.internal.core.presentation.screen.base;

import androidx.lifecycle.G;
import ia.InterfaceC0840h;

/* loaded from: classes2.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final G f16621a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16622b;

    /* renamed from: c, reason: collision with root package name */
    public final T f16623c;

    public a(G g10, String str, T t3) {
        this.f16621a = g10;
        this.f16622b = str;
        this.f16623c = t3;
    }

    public final T a(Object obj, InterfaceC0840h<?> interfaceC0840h) {
        T t3 = (T) this.f16621a.b(this.f16622b);
        return t3 == null ? this.f16623c : t3;
    }

    public final void a(Object obj, InterfaceC0840h<?> interfaceC0840h, T t3) {
        this.f16621a.d(t3, this.f16622b);
    }
}
