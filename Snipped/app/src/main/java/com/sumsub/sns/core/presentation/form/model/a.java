package com.sumsub.sns.core.presentation.form.model;

import com.sumsub.sns.core.presentation.form.f;
import com.sumsub.sns.internal.core.data.model.FieldType;
import com.sumsub.sns.internal.core.data.model.p;
import com.sumsub.sns.internal.core.data.model.remote.c;
import com.sumsub.sns.internal.core.data.source.applicant.remote.h;
import com.sumsub.sns.internal.core.data.source.applicant.remote.k;
import com.sumsub.sns.internal.core.data.source.applicant.remote.r;
import com.sumsub.sns.internal.core.presentation.form.b;
import com.sumsub.sns.internal.core.presentation.form.model.FieldError;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import com.sumsub.sns.internal.core.presentation.form.model.g;
import java.util.List;
import ka.C0969n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: com.sumsub.sns.core.presentation.form.model.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0165a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14200a;

        static {
            int[] iArr = new int[FieldError.values().length];
            iArr[FieldError.REQUIRED.ordinal()] = 1;
            iArr[FieldError.NOT_VALID.ordinal()] = 2;
            f14200a = iArr;
        }
    }

    public static final String a(FormItem formItem, b.c cVar, f fVar) {
        if ((formItem instanceof FormItem.p) || (formItem instanceof FormItem.q) || (formItem instanceof FormItem.a) || (formItem instanceof FormItem.d) || (formItem instanceof FormItem.e) || (formItem instanceof FormItem.c) || (formItem instanceof FormItem.n)) {
            FieldError a10 = g.a(formItem.d(), fVar.a(formItem));
            if (a10 != null) {
                return a(a10, cVar);
            }
        } else if (formItem instanceof FormItem.k) {
            String a11 = fVar.a(a((FormItem.k) formItem));
            String a12 = fVar.a(formItem);
            if (a12 == null) {
                a12 = "";
            }
            FieldError a13 = g.a(formItem.d(), c.INSTANCE.a(a11, a12));
            if (a13 == null && !com.sumsub.sns.internal.core.widget.autocompletePhone.util.a.a(a12)) {
                return a(FieldError.NOT_VALID, cVar);
            }
            if (a13 != null) {
                return a(a13, cVar);
            }
        } else if ((formItem instanceof FormItem.j) || (formItem instanceof FormItem.m) || (formItem instanceof FormItem.g) || (formItem instanceof FormItem.i)) {
            String a14 = a(FieldError.REQUIRED, cVar);
            if (!a(formItem, fVar)) {
                return a14;
            }
        } else if (!(formItem instanceof FormItem.f) && !(formItem instanceof FormItem.h) && !(formItem instanceof FormItem.l) && !(formItem instanceof FormItem.o) && !(formItem instanceof FormItem.r)) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    public static final p b(FormItem.i iVar) {
        p a10;
        if (iVar == null || (a10 = g.a(iVar.d())) == null) {
            return null;
        }
        return ((a10 instanceof p.h) && iVar.j()) ? new p.d(new h(1.0d, ((p.h) a10).a())) : a10;
    }

    public static final FormItem b(FormItem.k kVar) {
        return new FormItem.h("internal." + kVar.e(), new k(kVar.d().p() + ".countryPhoneCode", (String) null, (String) null, FieldType.text.name(), Boolean.FALSE, (String) null, (String) null, (String) null, (List) null, 480, (DefaultConstructorMarker) null));
    }

    public static final boolean a(FormItem formItem, f fVar) {
        if ((formItem instanceof FormItem.p) || (formItem instanceof FormItem.q) || (formItem instanceof FormItem.a) || (formItem instanceof FormItem.d) || (formItem instanceof FormItem.e) || (formItem instanceof FormItem.c)) {
            return g.a(formItem.d(), fVar.a(formItem)) == null;
        }
        if (formItem instanceof FormItem.n) {
            k d10 = formItem.d();
            String a10 = fVar.a(formItem);
            List<r> r8 = formItem.d().r();
            if (r8 == null) {
                r8 = EmptyList.f23104a;
            }
            return g.a(d10, a10, r8) == null;
        }
        if (formItem instanceof FormItem.k) {
            String a11 = fVar.a(a((FormItem.k) formItem));
            String a12 = fVar.a(formItem);
            if (a12 == null) {
                a12 = "";
            }
            String a13 = c.INSTANCE.a(a11, a12);
            Object a14 = g.a(formItem.d(), a13);
            if (a14 == null) {
                a14 = (com.sumsub.sns.internal.core.widget.autocompletePhone.util.a.a(a12) || !(C0969n.i0(a13) ^ true)) ? null : formItem;
            }
            return !((kotlin.jvm.internal.f.b(formItem.d().v(), Boolean.TRUE) && C0969n.i0(a13)) || a14 != null);
        }
        if (formItem instanceof FormItem.m) {
            String a15 = fVar.a(formItem);
            boolean z10 = a15 == null || a15.length() == 0;
            if (kotlin.jvm.internal.f.b(formItem.d().v(), Boolean.TRUE) && z10) {
                return false;
            }
        } else if (formItem instanceof FormItem.j) {
            List<String> b9 = fVar.b(formItem);
            boolean z11 = b9 == null || b9.isEmpty();
            if (kotlin.jvm.internal.f.b(formItem.d().v(), Boolean.TRUE) && z11) {
                return false;
            }
        } else if (formItem instanceof FormItem.g) {
            String a16 = fVar.a(formItem);
            if (kotlin.jvm.internal.f.b(formItem.d().v(), Boolean.TRUE) && a16 == null) {
                return false;
            }
        } else if (formItem instanceof FormItem.i) {
            List<String> b10 = fVar.b(formItem);
            if (b10 == null) {
                b10 = EmptyList.f23104a;
            }
            boolean z12 = formItem.j() || ((b10.isEmpty() ^ true) && a((FormItem.i) formItem));
            String valueOf = String.valueOf(b10.size());
            p b11 = b((FormItem.i) formItem);
            if (z12 && !com.sumsub.sns.internal.core.presentation.util.a.a(b11, valueOf)) {
                return false;
            }
        } else if (!(formItem instanceof FormItem.f) && !(formItem instanceof FormItem.h) && !(formItem instanceof FormItem.l) && !(formItem instanceof FormItem.o) && !(formItem instanceof FormItem.r)) {
            throw new NoWhenBranchMatchedException();
        }
        return true;
    }

    public static final boolean a(FormItem.i iVar) {
        p a10 = g.a(iVar.d());
        if (a10 != null) {
            return ((a10 instanceof p.d) && ((int) ((p.d) a10).a().d()) > 0) || ((a10 instanceof p.j) && (((p.j) a10).a() > 0.0d ? 1 : (((p.j) a10).a() == 0.0d ? 0 : -1)) > 0);
        }
        return false;
    }

    public static final String a(FieldError fieldError, b.c cVar) {
        int i = C0165a.f14200a[fieldError.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (cVar != null) {
                return cVar.c();
            }
        } else if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public static final FormItem a(FormItem.k kVar) {
        return new FormItem.h("internal." + kVar.e(), new k(kVar.d().p() + ".countryCode", (String) null, (String) null, FieldType.text.name(), Boolean.FALSE, (String) null, (String) null, (String) null, (List) null, 480, (DefaultConstructorMarker) null));
    }
}
