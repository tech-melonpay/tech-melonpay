package com.luminary.business.presentation.ui.fragments.support;

import C.v;
import J7.b;
import O9.p;
import P9.m;
import android.content.Context;
import android.view.View;
import ca.InterfaceC0635a;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.luminary.mobile.R;
import g8.g;
import java.util.List;
import kotlin.jvm.internal.f;
import s6.m0;

/* compiled from: SupportController.kt */
/* loaded from: classes2.dex */
public final class SupportController extends Typed2EpoxyController<List<? extends a>, Integer> {
    private final Context context;

    /* compiled from: SupportController.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f13108a = "Email";

        /* renamed from: b, reason: collision with root package name */
        public final String f13109b = "Mon - Fri • 09:00 - 21:00";

        /* renamed from: c, reason: collision with root package name */
        public final int f13110c = R.drawable.icon_support_email;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC0635a<p> f13111d;

        public a(g gVar) {
            this.f13111d = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return f.b(this.f13108a, aVar.f13108a) && f.b(this.f13109b, aVar.f13109b) && this.f13110c == aVar.f13110c && f.b(this.f13111d, aVar.f13111d);
        }

        public final int hashCode() {
            return this.f13111d.hashCode() + v.b(this.f13110c, v.c(this.f13108a.hashCode() * 31, 31, this.f13109b), 31);
        }

        public final String toString() {
            return "SupportItem(title=" + this.f13108a + ", date=" + this.f13109b + ", image=" + this.f13110c + ", onClick=" + this.f13111d + ")";
        }
    }

    public SupportController(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$2$lambda$1$lambda$0(a aVar, View view) {
        aVar.f13111d.invoke();
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends a> list, Integer num) {
        buildModels2((List<a>) list, num);
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(List<a> list, Integer num) {
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i9 = i + 1;
                if (i < 0) {
                    m.t();
                    throw null;
                }
                a aVar = (a) obj;
                m0 m0Var = new m0();
                m0Var.b("support_item_id_" + i);
                m0Var.e(aVar.f13108a);
                m0Var.a(aVar.f13109b);
                m0Var.c(Integer.valueOf(aVar.f13110c));
                m0Var.d(new b(aVar, 23));
                add(m0Var);
                i = i9;
            }
        }
    }
}
