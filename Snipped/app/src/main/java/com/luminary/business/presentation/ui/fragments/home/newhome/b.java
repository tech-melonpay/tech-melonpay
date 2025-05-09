package com.luminary.business.presentation.ui.fragments.home.newhome;

import com.luminary.business.domain.entity.account.FeeDomain;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import kotlin.jvm.internal.f;

/* compiled from: TransactionItems.kt */
/* loaded from: classes2.dex */
public abstract class b {

    /* compiled from: TransactionItems.kt */
    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final TransactionUI f12265a;

        public a(TransactionUI transactionUI) {
            this.f12265a = transactionUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && f.b(this.f12265a, ((a) obj).f12265a);
        }

        public final int hashCode() {
            return this.f12265a.hashCode();
        }

        public final String toString() {
            return "Display(item=" + this.f12265a + ")";
        }
    }

    /* compiled from: TransactionItems.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.home.newhome.b$b, reason: collision with other inner class name */
    public static final class C0130b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final FeeDomain f12266a;

        public C0130b(FeeDomain feeDomain) {
            this.f12266a = feeDomain;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0130b) && f.b(this.f12266a, ((C0130b) obj).f12266a);
        }

        public final int hashCode() {
            return this.f12266a.hashCode();
        }

        public final String toString() {
            return "DisplayFee(item=" + this.f12266a + ")";
        }
    }

    /* compiled from: TransactionItems.kt */
    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f12267a;

        public c(String str) {
            this.f12267a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && f.b(this.f12267a, ((c) obj).f12267a);
        }

        public final int hashCode() {
            return this.f12267a.hashCode();
        }

        public final String toString() {
            return androidx.camera.core.impl.utils.a.n(new StringBuilder("Header(item="), this.f12267a, ")");
        }
    }
}
