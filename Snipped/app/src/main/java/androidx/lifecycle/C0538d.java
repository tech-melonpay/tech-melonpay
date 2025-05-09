package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.HashMap;

/* compiled from: CompositeGeneratedAdaptersObserver.jvm.kt */
/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538d implements InterfaceC0550p {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0542h[] f7078a;

    public C0538d(InterfaceC0542h[] interfaceC0542hArr) {
        this.f7078a = interfaceC0542hArr;
    }

    @Override // androidx.lifecycle.InterfaceC0550p
    public final void d(r rVar, Lifecycle.Event event) {
        new HashMap();
        InterfaceC0542h[] interfaceC0542hArr = this.f7078a;
        for (InterfaceC0542h interfaceC0542h : interfaceC0542hArr) {
            interfaceC0542h.a();
        }
        for (InterfaceC0542h interfaceC0542h2 : interfaceC0542hArr) {
            interfaceC0542h2.a();
        }
    }
}
