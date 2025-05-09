package com.sumsub.sns.core.presentation.support;

import C.v;
import O9.p;
import P9.n;
import P9.s;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import ca.InterfaceC0650p;
import com.sumsub.sns.core.data.model.SNSSupportItem;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class b extends com.sumsub.sns.core.presentation.base.a<C0170b> {

    /* renamed from: q, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.extensions.a f14336q;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final SNSSupportItem f14337a;

        /* renamed from: b, reason: collision with root package name */
        public final SNSStepState f14338b;

        /* renamed from: c, reason: collision with root package name */
        public final Drawable f14339c;

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f14340d;

        /* renamed from: e, reason: collision with root package name */
        public final CharSequence f14341e;

        public a(SNSSupportItem sNSSupportItem, SNSStepState sNSStepState, Drawable drawable, CharSequence charSequence, CharSequence charSequence2) {
            this.f14337a = sNSSupportItem;
            this.f14338b = sNSStepState;
            this.f14339c = drawable;
            this.f14340d = charSequence;
            this.f14341e = charSequence2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return f.b(this.f14337a, aVar.f14337a) && this.f14338b == aVar.f14338b && f.b(this.f14339c, aVar.f14339c) && f.b(this.f14340d, aVar.f14340d) && f.b(this.f14341e, aVar.f14341e);
        }

        public final Drawable f() {
            return this.f14339c;
        }

        public final SNSSupportItem g() {
            return this.f14337a;
        }

        public final SNSStepState h() {
            return this.f14338b;
        }

        public int hashCode() {
            int hashCode = (this.f14338b.hashCode() + (this.f14337a.hashCode() * 31)) * 31;
            Drawable drawable = this.f14339c;
            int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
            CharSequence charSequence = this.f14340d;
            int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.f14341e;
            return hashCode3 + (charSequence2 != null ? charSequence2.hashCode() : 0);
        }

        public final CharSequence i() {
            return this.f14341e;
        }

        public final CharSequence j() {
            return this.f14340d;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SupportItem(item=");
            sb2.append(this.f14337a);
            sb2.append(", stepState=");
            sb2.append(this.f14338b);
            sb2.append(", icon=");
            sb2.append(this.f14339c);
            sb2.append(", title=");
            sb2.append((Object) this.f14340d);
            sb2.append(", subtitle=");
            return com.google.android.gms.measurement.internal.a.j(sb2, this.f14341e, ')');
        }
    }

    /* renamed from: com.sumsub.sns.core.presentation.support.b$b, reason: collision with other inner class name */
    public static final class C0170b implements a.l {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f14342a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f14343b;

        /* renamed from: c, reason: collision with root package name */
        public final List<a> f14344c;

        public C0170b() {
            this(null, null, null, 7, null);
        }

        public final C0170b a(CharSequence charSequence, CharSequence charSequence2, List<a> list) {
            return new C0170b(charSequence, charSequence2, list);
        }

        public final CharSequence d() {
            return this.f14343b;
        }

        public final List<a> e() {
            return this.f14344c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0170b)) {
                return false;
            }
            C0170b c0170b = (C0170b) obj;
            return f.b(this.f14342a, c0170b.f14342a) && f.b(this.f14343b, c0170b.f14343b) && f.b(this.f14344c, c0170b.f14344c);
        }

        public final CharSequence f() {
            return this.f14342a;
        }

        public int hashCode() {
            CharSequence charSequence = this.f14342a;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f14343b;
            return this.f14344c.hashCode() + ((hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(title=");
            sb2.append((Object) this.f14342a);
            sb2.append(", subtitle=");
            sb2.append((Object) this.f14343b);
            sb2.append(", supportItems=");
            return v.r(sb2, this.f14344c, ')');
        }

        public C0170b(CharSequence charSequence, CharSequence charSequence2, List<a> list) {
            this.f14342a = charSequence;
            this.f14343b = charSequence2;
            this.f14344c = list;
        }

        public C0170b(CharSequence charSequence, CharSequence charSequence2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? EmptyList.f23104a : list);
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.support.SNSSupportViewModel", f = "SNSSupportViewModel.kt", l = {24}, m = "onPrepare")
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14345a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14346b;

        /* renamed from: d, reason: collision with root package name */
        public int f14348d;

        public c(T9.a<? super c> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14346b = obj;
            this.f14348d |= Integer.MIN_VALUE;
            return b.this.c(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.support.SNSSupportViewModel$onPrepare$2", f = "SNSSupportViewModel.kt", l = {41, 42}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements InterfaceC0650p<C0170b, T9.a<? super C0170b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14349a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14350b;

        /* renamed from: c, reason: collision with root package name */
        public int f14351c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14352d;

        public d(T9.a<? super d> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C0170b c0170b, T9.a<? super C0170b> aVar) {
            return ((d) create(c0170b, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            d dVar = b.this.new d(aVar);
            dVar.f14352d = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<a> list;
            C0170b c0170b;
            List<a> list2;
            CharSequence charSequence;
            List<a> list3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14351c;
            if (i == 0) {
                kotlin.b.b(obj);
                C0170b c0170b2 = (C0170b) this.f14352d;
                List<SNSSupportItem> supportItems = e0.f15081a.getSupportItems();
                if (supportItems != null) {
                    b bVar = b.this;
                    ArrayList arrayList = new ArrayList(n.u(supportItems, 10));
                    for (SNSSupportItem sNSSupportItem : supportItems) {
                        String isValid = sNSSupportItem.isValid();
                        a aVar = null;
                        if (isValid == null || isValid.length() == 0) {
                            SNSStepState sNSStepState = SNSStepState.INIT;
                            Drawable iconDrawable = sNSSupportItem.getIconDrawable();
                            String title = sNSSupportItem.getTitle();
                            Spanned a10 = title != null ? bVar.f14336q.a(title) : null;
                            String subtitle = sNSSupportItem.getSubtitle();
                            aVar = new a(sNSSupportItem, sNSStepState, iconDrawable, a10, subtitle != null ? bVar.f14336q.a(subtitle) : null);
                        }
                        arrayList.add(aVar);
                    }
                    list = s.H(arrayList);
                } else {
                    list = EmptyList.f23104a;
                }
                b bVar2 = b.this;
                this.f14352d = list;
                this.f14349a = c0170b2;
                this.f14351c = 1;
                Object a11 = bVar2.a("sns_support_title", this);
                if (a11 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                List<a> list4 = list;
                c0170b = c0170b2;
                obj = a11;
                list2 = list4;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    charSequence = (CharSequence) this.f14350b;
                    c0170b = (C0170b) this.f14349a;
                    list3 = (List) this.f14352d;
                    kotlin.b.b(obj);
                    return c0170b.a(charSequence, (CharSequence) obj, list3);
                }
                c0170b = (C0170b) this.f14349a;
                list2 = (List) this.f14352d;
                kotlin.b.b(obj);
            }
            CharSequence charSequence2 = (CharSequence) obj;
            b bVar3 = b.this;
            this.f14352d = list2;
            this.f14349a = c0170b;
            this.f14350b = charSequence2;
            this.f14351c = 2;
            Object a12 = bVar3.a("sns_support_subtitle", this);
            if (a12 == coroutineSingletons) {
                return coroutineSingletons;
            }
            charSequence = charSequence2;
            obj = a12;
            list3 = list2;
            return c0170b.a(charSequence, (CharSequence) obj, list3);
        }
    }

    public b(com.sumsub.sns.internal.core.data.source.extensions.a aVar, com.sumsub.sns.internal.core.data.source.common.a aVar2, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        super(aVar2, bVar);
        this.f14336q = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.sumsub.sns.core.presentation.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(T9.a<? super O9.p> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.sumsub.sns.core.presentation.support.b.c
            if (r0 == 0) goto L13
            r0 = r5
            com.sumsub.sns.core.presentation.support.b$c r0 = (com.sumsub.sns.core.presentation.support.b.c) r0
            int r1 = r0.f14348d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14348d = r1
            goto L18
        L13:
            com.sumsub.sns.core.presentation.support.b$c r0 = new com.sumsub.sns.core.presentation.support.b$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f14346b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f14348d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f14345a
            com.sumsub.sns.core.presentation.support.b r0 = (com.sumsub.sns.core.presentation.support.b) r0
            kotlin.b.b(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.b.b(r5)
            r0.f14345a = r4
            r0.f14348d = r3
            java.lang.Object r5 = super.c(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            com.sumsub.sns.core.presentation.support.b$d r5 = new com.sumsub.sns.core.presentation.support.b$d
            r1 = 0
            r5.<init>(r1)
            r2 = 0
            com.sumsub.sns.core.presentation.base.a.a(r0, r2, r5, r3, r1)
            O9.p r5 = O9.p.f3034a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.presentation.support.b.c(T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C0170b e() {
        return new C0170b(null, null, null, 7, null);
    }
}
