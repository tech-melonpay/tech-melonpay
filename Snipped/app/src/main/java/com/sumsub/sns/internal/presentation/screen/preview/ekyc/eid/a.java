package com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid;

import C.v;
import O9.p;
import ca.InterfaceC0646l;
import de.authada.library.api.Can;
import de.authada.library.api.authentication.Pin;
import de.authada.library.api.authentication.StartCallback;
import de.authada.library.api.pinChanger.TPin;
import de.authada.library.api.unblock.Puk;
import de.authada.library.api.unblock.UnblockerCallback;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.a$a, reason: collision with other inner class name */
    public static final class C0300a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0300a f18184a = new C0300a();

        public C0300a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18185a = new b();

        public b() {
            super(null);
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f18186a = new c();

        public c() {
            super(null);
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Pin f18187a;

        /* renamed from: b, reason: collision with root package name */
        public final Can f18188b;

        /* renamed from: c, reason: collision with root package name */
        public final com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.b f18189c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC0646l<Throwable, p> f18190d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Pin pin, Can can, com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.b bVar, InterfaceC0646l<? super Throwable, p> interfaceC0646l) {
            super(null);
            this.f18187a = pin;
            this.f18188b = can;
            this.f18189c = bVar;
            this.f18190d = interfaceC0646l;
        }

        public final com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.b e() {
            return this.f18189c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.f.b(this.f18187a, dVar.f18187a) && kotlin.jvm.internal.f.b(this.f18188b, dVar.f18188b) && kotlin.jvm.internal.f.b(this.f18189c, dVar.f18189c) && kotlin.jvm.internal.f.b(this.f18190d, dVar.f18190d);
        }

        public final Can f() {
            return this.f18188b;
        }

        public final InterfaceC0646l<Throwable, p> g() {
            return this.f18190d;
        }

        public final Pin h() {
            return this.f18187a;
        }

        public int hashCode() {
            int hashCode = this.f18187a.hashCode() * 31;
            Can can = this.f18188b;
            return this.f18190d.hashCode() + ((this.f18189c.hashCode() + ((hashCode + (can == null ? 0 : can.hashCode())) * 31)) * 31);
        }

        public String toString() {
            return "PinAuthentication(pin=" + this.f18187a + ", can=" + this.f18188b + ", callback=" + this.f18189c + ", errorCallback=" + this.f18190d + ')';
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public final TPin f18191a;

        /* renamed from: b, reason: collision with root package name */
        public final Pin f18192b;

        /* renamed from: c, reason: collision with root package name */
        public final Can f18193c;

        /* renamed from: d, reason: collision with root package name */
        public final Integer f18194d;

        /* renamed from: e, reason: collision with root package name */
        public final com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.c f18195e;

        /* renamed from: f, reason: collision with root package name */
        public final InterfaceC0646l<Throwable, p> f18196f;

        /* JADX WARN: Multi-variable type inference failed */
        public e(TPin tPin, Pin pin, Can can, Integer num, com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.c cVar, InterfaceC0646l<? super Throwable, p> interfaceC0646l) {
            super(null);
            this.f18191a = tPin;
            this.f18192b = pin;
            this.f18193c = can;
            this.f18194d = num;
            this.f18195e = cVar;
            this.f18196f = interfaceC0646l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.f.b(this.f18191a, eVar.f18191a) && kotlin.jvm.internal.f.b(this.f18192b, eVar.f18192b) && kotlin.jvm.internal.f.b(this.f18193c, eVar.f18193c) && kotlin.jvm.internal.f.b(this.f18194d, eVar.f18194d) && kotlin.jvm.internal.f.b(this.f18195e, eVar.f18195e) && kotlin.jvm.internal.f.b(this.f18196f, eVar.f18196f);
        }

        public final com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.c g() {
            return this.f18195e;
        }

        public final Can h() {
            return this.f18193c;
        }

        public int hashCode() {
            int hashCode = (this.f18192b.hashCode() + (this.f18191a.hashCode() * 31)) * 31;
            Can can = this.f18193c;
            int hashCode2 = (hashCode + (can == null ? 0 : can.hashCode())) * 31;
            Integer num = this.f18194d;
            return this.f18196f.hashCode() + ((this.f18195e.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31)) * 31);
        }

        public final InterfaceC0646l<Throwable, p> i() {
            return this.f18196f;
        }

        public final Integer j() {
            return this.f18194d;
        }

        public final Pin k() {
            return this.f18192b;
        }

        public final TPin l() {
            return this.f18191a;
        }

        public String toString() {
            return "PinChange(oldPin=" + this.f18191a + ", newPin=" + this.f18192b + ", can=" + this.f18193c + ", lastPinDigit=" + this.f18194d + ", callback=" + this.f18195e + ", errorCallback=" + this.f18196f + ')';
        }
    }

    public static final class f extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Puk f18197a;

        /* renamed from: b, reason: collision with root package name */
        public final UnblockerCallback f18198b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC0646l<Throwable, p> f18199c;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Puk puk, UnblockerCallback unblockerCallback, InterfaceC0646l<? super Throwable, p> interfaceC0646l) {
            super(null);
            this.f18197a = puk;
            this.f18198b = unblockerCallback;
            this.f18199c = interfaceC0646l;
        }

        public final UnblockerCallback d() {
            return this.f18198b;
        }

        public final InterfaceC0646l<Throwable, p> e() {
            return this.f18199c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.f.b(this.f18197a, fVar.f18197a) && kotlin.jvm.internal.f.b(this.f18198b, fVar.f18198b) && kotlin.jvm.internal.f.b(this.f18199c, fVar.f18199c);
        }

        public final Puk f() {
            return this.f18197a;
        }

        public int hashCode() {
            return this.f18199c.hashCode() + ((this.f18198b.hashCode() + (this.f18197a.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "PinUnblock(puk=" + this.f18197a + ", callback=" + this.f18198b + ", errorCallback=" + this.f18199c + ')';
        }
    }

    public static final class g extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f18200a;

        /* renamed from: b, reason: collision with root package name */
        public final URL f18201b;

        /* renamed from: c, reason: collision with root package name */
        public final String f18202c;

        /* renamed from: d, reason: collision with root package name */
        public final StartCallback f18203d;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC0646l<Throwable, p> f18204e;

        /* JADX WARN: Multi-variable type inference failed */
        public g(String str, URL url, String str2, StartCallback startCallback, InterfaceC0646l<? super Throwable, p> interfaceC0646l) {
            super(null);
            this.f18200a = str;
            this.f18201b = url;
            this.f18202c = str2;
            this.f18203d = startCallback;
            this.f18204e = interfaceC0646l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.f.b(this.f18200a, gVar.f18200a) && kotlin.jvm.internal.f.b(this.f18201b, gVar.f18201b) && kotlin.jvm.internal.f.b(this.f18202c, gVar.f18202c) && kotlin.jvm.internal.f.b(this.f18203d, gVar.f18203d) && kotlin.jvm.internal.f.b(this.f18204e, gVar.f18204e);
        }

        public final StartCallback f() {
            return this.f18203d;
        }

        public final InterfaceC0646l<Throwable, p> g() {
            return this.f18204e;
        }

        public final String h() {
            return this.f18202c;
        }

        public int hashCode() {
            return this.f18204e.hashCode() + ((this.f18203d.hashCode() + v.c((this.f18201b.hashCode() + (this.f18200a.hashCode() * 31)) * 31, 31, this.f18202c)) * 31);
        }

        public final String i() {
            return this.f18200a;
        }

        public final URL j() {
            return this.f18201b;
        }

        public String toString() {
            return "Start(mobileToken=" + this.f18200a + ", url=" + this.f18201b + ", hash=" + this.f18202c + ", callback=" + this.f18203d + ", errorCallback=" + this.f18204e + ')';
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public a() {
    }
}
