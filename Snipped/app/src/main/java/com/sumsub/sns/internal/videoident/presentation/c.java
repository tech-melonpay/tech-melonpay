package com.sumsub.sns.internal.videoident.presentation;

import ca.InterfaceC0646l;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.IdentitySide;
import com.sumsub.sns.internal.core.data.model.q;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import java.util.Arrays;
import java.util.List;
import ka.C0967l;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f19224a = new c();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f19225a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f19226b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f19227c;

        public a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            this.f19225a = charSequence;
            this.f19226b = charSequence2;
            this.f19227c = charSequence3;
        }

        public final CharSequence d() {
            return this.f19226b;
        }

        public final CharSequence e() {
            return this.f19225a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f19225a, aVar.f19225a) && kotlin.jvm.internal.f.b(this.f19226b, aVar.f19226b) && kotlin.jvm.internal.f.b(this.f19227c, aVar.f19227c);
        }

        public final CharSequence f() {
            return this.f19227c;
        }

        public int hashCode() {
            int hashCode = (this.f19226b.hashCode() + (this.f19225a.hashCode() * 31)) * 31;
            CharSequence charSequence = this.f19227c;
            return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("State(title=");
            sb2.append((Object) this.f19225a);
            sb2.append(", text=");
            sb2.append((Object) this.f19226b);
            sb2.append(", uploadText=");
            return com.google.android.gms.measurement.internal.a.j(sb2, this.f19227c, ')');
        }
    }

    public static final class b extends Lambda implements InterfaceC0646l<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.c f19228a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b.c cVar) {
            super(1);
            this.f19228a = cVar;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            return this.f19228a.a(str);
        }
    }

    /* renamed from: com.sumsub.sns.internal.videoident.presentation.c$c, reason: collision with other inner class name */
    public static final class C0360c extends Lambda implements InterfaceC0646l<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.c f19229a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0360c(b.c cVar) {
            super(1);
            this.f19229a = cVar;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            return this.f19229a.a(str);
        }
    }

    public static final class d extends Lambda implements InterfaceC0646l<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.c f19230a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b.c cVar) {
            super(1);
            this.f19230a = cVar;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            return this.f19230a.a(str);
        }
    }

    public static final class e extends Lambda implements InterfaceC0646l<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.c f19231a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b.c cVar) {
            super(1);
            this.f19231a = cVar;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            return this.f19231a.a(str);
        }
    }

    public final a a(b.c cVar, String str, IdentitySide identitySide, String str2) {
        List b9;
        List b10;
        List b11;
        List b12;
        if (new DocumentType(str).k()) {
            String a10 = cVar.a(String.format("sns_step_%s_%s_%s", Arrays.copyOf(new Object[]{str, "videoident", MessageBundle.TITLE_ENTRY}, 3)));
            String a11 = cVar.a(String.format("sns_step_%s_%s_%s", Arrays.copyOf(new Object[]{str, "videoident", TextBundle.TEXT_ENTRY}, 3)));
            if (a10 == null) {
                a10 = "";
            }
            return new a(a10, a11 != null ? a11 : "", cVar.a("sns_videoident_action_upload"));
        }
        String a12 = cVar.a("sns_videoident_action_pickUp");
        String X = a12 == null ? str2 == null ? str : str2 : str2 != null ? C0967l.X(a12, "{doctype}", q.a(q.f15559c.a(str2), cVar, null, 2, null).toString(), false) : C0967l.X(a12, "{doctype}", new DocumentType(str).a(cVar).toString(), false);
        if (identitySide == null) {
            b9 = com.sumsub.sns.internal.videoident.presentation.d.b(str, "videoident", MessageBundle.TITLE_ENTRY);
            String str3 = (String) kotlin.sequences.a.h(kotlin.sequences.a.j(new P9.k(b9, 1), new e(cVar)));
            if (str3 == null) {
                str3 = "";
            }
            b10 = com.sumsub.sns.internal.videoident.presentation.d.b(str, "videoident", TextBundle.TEXT_ENTRY);
            String str4 = (String) kotlin.sequences.a.h(kotlin.sequences.a.j(new P9.k(b10, 1), new C0360c(cVar)));
            return new a(str3, str4 != null ? str4 : "", X);
        }
        String str5 = identitySide == IdentitySide.Back ? "backSide" : "frontSide";
        b11 = com.sumsub.sns.internal.videoident.presentation.d.b(str, "videoident", str5, MessageBundle.TITLE_ENTRY, str2);
        String str6 = (String) kotlin.sequences.a.h(kotlin.sequences.a.j(new P9.k(b11, 1), new d(cVar)));
        if (str6 == null) {
            str6 = "";
        }
        b12 = com.sumsub.sns.internal.videoident.presentation.d.b(str, "videoident", str5, TextBundle.TEXT_ENTRY, str2);
        String str7 = (String) kotlin.sequences.a.h(kotlin.sequences.a.j(new P9.k(b12, 1), new b(cVar)));
        return new a(str6, str7 != null ? str7 : "", X);
    }
}
