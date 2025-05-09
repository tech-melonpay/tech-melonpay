package com.sumsub.sns.internal.core.presentation.helper;

import P9.s;
import ca.InterfaceC0646l;
import com.sumsub.sns.internal.core.data.model.ApplicantStatus;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.ReviewAnswerType;
import com.sumsub.sns.internal.core.data.model.g;
import com.sumsub.sns.internal.core.data.model.q;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import com.sumsub.sns.internal.core.presentation.base.adapter.SNSDocumentViewTypeInfo;
import com.sumsub.sns.internal.core.presentation.base.adapter.c;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ka.C0967l;
import ka.C0969n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: com.sumsub.sns.internal.core.presentation.helper.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0244a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16584a;

        static {
            int[] iArr = new int[ApplicantStatus.values().length];
            iArr[ApplicantStatus.Reviewing.ordinal()] = 1;
            iArr[ApplicantStatus.Submitting.ordinal()] = 2;
            iArr[ApplicantStatus.Reviewed.ordinal()] = 3;
            f16584a = iArr;
        }
    }

    public static final class b extends Lambda implements InterfaceC0646l<String, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.c f16585a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b.c cVar) {
            super(1);
            this.f16585a = cVar;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String str) {
            return q.a(q.f15559c.a(str), this.f16585a, null, 2, null);
        }
    }

    public static /* synthetic */ c a(b.c cVar, Document document, ApplicantStatus applicantStatus, boolean z10, com.sumsub.sns.internal.core.presentation.helper.b bVar, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i & 32) != 0) {
            str = null;
        }
        return a(cVar, document, applicantStatus, z11, bVar, str);
    }

    public static final c a(b.c cVar, Document document, ApplicantStatus applicantStatus, boolean z10, com.sumsub.sns.internal.core.presentation.helper.b bVar, String str) {
        CharSequence a10;
        CharSequence a11;
        int i = C0244a.f16584a[applicantStatus.ordinal()];
        SNSStepState a12 = i != 1 ? i != 2 ? i != 3 ? a(document) : (document.isSubmitted() || !z10) ? a(document) : SNSStepState.REJECTED : !document.isSubmitted() ? SNSStepState.INIT : SNSStepState.PENDING : SNSStepState.PENDING;
        CharSequence a13 = document.getType().a(cVar);
        if (a12 == SNSStepState.PENDING) {
            a10 = cVar.a("sns_iddoc_status_reviewing");
        } else if (a12 == SNSStepState.REJECTED && !document.isSubmitted()) {
            a10 = cVar.a("sns_iddoc_status_notSubmitted");
        } else if (document.isRejected()) {
            Document.b.C0198b review = document.getReview();
            if (review == null || (a11 = a(review)) == null) {
                a10 = cVar.a("sns_iddoc_status_declined");
                if (a10 == null) {
                    a10 = "Rejected";
                }
            } else {
                a10 = a11;
            }
        } else if (document.isApproved()) {
            a10 = cVar.a("sns_iddoc_status_approved");
        } else if (document.isReviewing() || document.isSubmitted()) {
            a10 = cVar.a("sns_iddoc_status_submitted");
        } else if (document.getType().h()) {
            a10 = a(cVar, document, bVar.d());
        } else {
            List<g.c.a> g10 = bVar.d().I().g();
            ArrayList arrayList = new ArrayList();
            for (Object obj : g10) {
                if (f.b(((g.c.a) obj).m(), document.getType())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                P9.q.x(arrayList2, ((g.c.a) it.next()).q());
            }
            String P4 = s.P(arrayList2, ", ", null, null, new b(cVar), 30);
            a10 = (f.b(str, "videoident") && (C0969n.i0(P4) ^ true)) ? C0967l.X(document.getType().a(cVar, str).toString(), "{doctypes}", P4, false) : document.getType().a(cVar, (String) null).toString();
        }
        return new c(a12, a13, a10, a12 == SNSStepState.REJECTED, new SNSDocumentViewTypeInfo(SNSDocumentViewTypeInfo.Type.DOCUMENT, document));
    }

    public static final CharSequence a(b.c cVar, Document document, g gVar) {
        g.c.a a10;
        boolean z10 = (gVar == null || (a10 = gVar.a(document.getType())) == null || !a10.t()) ? false : true;
        String c2 = document.getType().c();
        String format = String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{c2}, 1));
        return cVar.a(z10 ? String.format("sns_step_%s_geolocation_prompt", Arrays.copyOf(new Object[]{c2}, 1)) : format, format, "sns_step_defaults_prompt");
    }

    public static final CharSequence a(Document.b.C0198b c0198b) {
        String str;
        String g10 = c0198b.g();
        if (g10 != null) {
            int c02 = C0969n.c0(g10);
            while (true) {
                if (-1 < c02) {
                    if (g10.charAt(c02) != '\n') {
                        str = g10.substring(0, c02 + 1);
                        break;
                    }
                    c02--;
                } else {
                    str = "";
                    break;
                }
            }
            if (str != null) {
                return C0969n.u0(str).toString();
            }
        }
        return null;
    }

    public static final SNSStepState a(Document document) {
        if (!document.isSubmitted()) {
            return SNSStepState.INIT;
        }
        Document.b.C0198b review = document.getReview();
        if ((review != null ? review.e() : null) == ReviewAnswerType.Red) {
            return SNSStepState.REJECTED;
        }
        Document.b.C0198b review2 = document.getReview();
        if ((review2 != null ? review2.e() : null) == ReviewAnswerType.Green) {
            return SNSStepState.APPROVED;
        }
        if (document.isRejected()) {
            return SNSStepState.REJECTED;
        }
        if (document.isApproved()) {
            return SNSStepState.APPROVED;
        }
        if (!document.isSubmitted() && !document.isReviewing()) {
            return SNSStepState.INIT;
        }
        return SNSStepState.PENDING;
    }
}
