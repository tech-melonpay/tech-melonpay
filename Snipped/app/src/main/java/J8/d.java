package J8;

import androidx.lifecycle.A;
import androidx.lifecycle.C0559z;
import androidx.lifecycle.r;
import ca.InterfaceC0646l;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.f;

/* compiled from: SingleLiveEvent.kt */
/* loaded from: classes2.dex */
public final class d<T> extends C0559z<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f2206a = new AtomicBoolean(false);

    /* compiled from: SingleLiveEvent.kt */
    public static final class a implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f2207a;

        public a(c cVar) {
            this.f2207a = cVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f2207a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f2207a.invoke(obj);
        }
    }

    @Override // androidx.lifecycle.AbstractC0557x
    public final void observe(r rVar, A<? super T> a10) {
        super.observe(rVar, new a(new c(0, this, a10)));
    }

    @Override // androidx.lifecycle.C0559z, androidx.lifecycle.AbstractC0557x
    public final void setValue(T t3) {
        this.f2206a.set(true);
        super.setValue(t3);
    }
}
