package com.luminary.business.presentation.ui.fragments.cards.transactions;

import com.luminary.business.domain.entity.cards.CardTransactionDomain;
import kotlin.jvm.internal.f;

/* compiled from: CardTransactionItems.kt */
/* loaded from: classes2.dex */
public abstract class a {

    /* compiled from: CardTransactionItems.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.cards.transactions.a$a, reason: collision with other inner class name */
    public static final class C0117a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final CardTransactionDomain f11863a;

        public C0117a(CardTransactionDomain cardTransactionDomain) {
            this.f11863a = cardTransactionDomain;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0117a) && f.b(this.f11863a, ((C0117a) obj).f11863a);
        }

        public final int hashCode() {
            return this.f11863a.hashCode();
        }

        public final String toString() {
            return "Display(item=" + this.f11863a + ")";
        }
    }

    /* compiled from: CardTransactionItems.kt */
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f11864a;

        public b(String str) {
            this.f11864a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && f.b(this.f11864a, ((b) obj).f11864a);
        }

        public final int hashCode() {
            return this.f11864a.hashCode();
        }

        public final String toString() {
            return androidx.camera.core.impl.utils.a.n(new StringBuilder("Header(item="), this.f11864a, ")");
        }
    }
}
