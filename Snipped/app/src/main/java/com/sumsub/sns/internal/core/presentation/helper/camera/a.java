package com.sumsub.sns.internal.core.presentation.helper.camera;

import O9.p;
import P9.s;
import ca.InterfaceC0646l;
import com.sumsub.sns.internal.core.analytics.GlobalStatePayload;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.IdentitySide;
import com.sumsub.sns.internal.core.data.model.g;
import com.sumsub.sns.internal.core.data.model.q;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import com.sumsub.sns.internal.core.presentation.helper.camera.b;
import com.sumsub.sns.internal.core.presentation.intro.f;
import java.util.Arrays;
import java.util.List;
import ka.C0967l;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.MessageBundle;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16589a = new a();

    /* renamed from: com.sumsub.sns.internal.core.presentation.helper.camera.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0245a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16590a;

        static {
            int[] iArr = new int[IdentitySide.values().length];
            iArr[IdentitySide.Front.ordinal()] = 1;
            iArr[IdentitySide.Back.ordinal()] = 2;
            f16590a = iArr;
        }
    }

    public static final class b extends Lambda implements InterfaceC0646l<q, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.c f16591a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b.c cVar) {
            super(1);
            this.f16591a = cVar;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(q qVar) {
            return q.a(qVar, this.f16591a, null, 2, null);
        }
    }

    public static final class c extends Lambda implements InterfaceC0646l<q, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.c f16592a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b.c cVar) {
            super(1);
            this.f16592a = cVar;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(q qVar) {
            return q.a(qVar, this.f16592a, null, 2, null);
        }
    }

    public final com.sumsub.sns.internal.core.presentation.helper.camera.b a(b.c cVar, DocumentType documentType, g.c.a aVar, f fVar, String str, List<? extends q> list, IdentitySide identitySide) {
        String value;
        if (!documentType.k()) {
            q qVar = list.size() == 1 ? (q) s.J(list) : null;
            if (identitySide != null && (value = identitySide.getValue()) != null) {
                com.sumsub.sns.internal.core.analytics.b.f14967a.a(GlobalStatePayload.IdDocSubType, value);
                p pVar = p.f3034a;
            }
            int i = identitySide == null ? -1 : C0245a.f16590a[identitySide.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return b.c.f16601a;
                }
                return new b.a(cVar.a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{documentType.c(), "scan", "backSide", MessageBundle.TITLE_ENTRY, qVar != null ? qVar.b() : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{documentType.c(), "scan", "backSide", MessageBundle.TITLE_ENTRY}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{"defaults", "scan", "backSide", MessageBundle.TITLE_ENTRY}, 4))), cVar.a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{documentType.c(), "scan", "backSide", "brief", qVar != null ? qVar.b() : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{documentType.c(), "scan", "backSide", "brief"}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{"defaults", "scan", "backSide", "brief"}, 4))), cVar.a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{documentType.c(), "scan", "backSide", ErrorBundle.DETAIL_ENTRY, qVar != null ? qVar.b() : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{documentType.c(), "scan", "backSide", ErrorBundle.DETAIL_ENTRY}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{"defaults", "scan", "backSide", ErrorBundle.DETAIL_ENTRY}, 4))), fVar, str);
            }
            String a10 = cVar.a("sns_iddoc_listing_join");
            String P4 = s.P(list, a10 == null ? "" : a10, null, null, new b(cVar), 30);
            String a11 = cVar.a("sns_iddoc_listing_join_details");
            return new b.a(cVar.a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{documentType.c(), "scan", "frontSide", MessageBundle.TITLE_ENTRY, qVar != null ? qVar.b() : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{documentType.c(), "scan", "frontSide", MessageBundle.TITLE_ENTRY}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{"defaults", "scan", "frontSide", MessageBundle.TITLE_ENTRY}, 4))), String.format(C0967l.X(cVar.a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{documentType.c(), "scan", "frontSide", "brief", qVar != null ? qVar.b() : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{documentType.c(), "scan", "frontSide", "brief"}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{"defaults", "scan", "frontSide", "brief"}, 4))), "{doctypes}", "%s", false), Arrays.copyOf(new Object[]{P4}, 1)), String.format(C0967l.X(cVar.a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{documentType.c(), "scan", "frontSide", ErrorBundle.DETAIL_ENTRY, qVar != null ? qVar.b() : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{documentType.c(), "scan", "frontSide", ErrorBundle.DETAIL_ENTRY}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{"defaults", "scan", "frontSide", ErrorBundle.DETAIL_ENTRY}, 4))), "{doctypes}", "%s", false), Arrays.copyOf(new Object[]{s.P(list, a11 == null ? "" : a11, null, null, new c(cVar), 30)}, 1)), fVar, str);
        }
        String str2 = (aVar == null || !aVar.v()) ? "photo" : "portrait";
        String a12 = cVar.a("sns_step_" + documentType.c() + '_' + str2 + "_title");
        String str3 = a12 == null ? "" : a12;
        String a13 = cVar.a("sns_step_" + documentType.c() + '_' + str2 + "_brief");
        String str4 = a13 == null ? "" : a13;
        String a14 = cVar.a("sns_step_" + documentType.c() + '_' + str2 + "_details");
        if (a14 == null) {
            a14 = "";
        }
        return new b.a(str3, str4, a14, fVar, str);
    }

    public static com.sumsub.sns.internal.core.presentation.helper.camera.b a(a aVar, b.c cVar, DocumentType documentType, g.c.a aVar2, f fVar, String str, List list, IdentitySide identitySide, int i, Object obj) {
        return aVar.a(cVar, documentType, aVar2, fVar, str, (i & 32) != 0 ? EmptyList.f23104a : list, (i & 64) != 0 ? null : identitySide);
    }
}
