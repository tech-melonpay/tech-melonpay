package com.sumsub.sns.internal.core.analytics;

import P9.s;
import ca.InterfaceC0646l;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.model.SNSTrackEvents;
import com.sumsub.sns.internal.core.data.model.p;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class e implements h, n, i, g, com.sumsub.sns.internal.core.analytics.a, j, l {

    /* renamed from: d, reason: collision with root package name */
    public static final a f14985d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final SimpleDateFormat f14986e;

    /* renamed from: a, reason: collision with root package name */
    public final long f14987a;

    /* renamed from: b, reason: collision with root package name */
    public final List<m> f14988b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public Map<String, ? extends Object> f14989c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends Lambda implements InterfaceC0646l<m, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f14990a = new b();

        public b() {
            super(1);
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(m mVar) {
            return mVar.getText();
        }
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f14986e = simpleDateFormat;
    }

    public e(long j10) {
        this.f14987a = j10;
    }

    @Override // com.sumsub.sns.internal.core.analytics.n
    public i a() {
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.i
    public j b() {
        this.f14988b.add(NavigationAction.Open);
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.j
    public l c() {
        this.f14989c = com.sumsub.sns.internal.ff.a.f16930a.c();
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.a
    public j d() {
        this.f14988b.add(ActionState.Failed);
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.a
    public j e() {
        this.f14988b.add(ActionState.Completed);
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.g
    public j g() {
        this.f14988b.add(ControlAction.Clicked);
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.g
    public j h() {
        this.f14988b.add(ControlAction.Changed);
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.g
    public j i() {
        this.f14988b.add(ControlAction.Expanded);
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.i
    public j j() {
        this.f14988b.add(NavigationAction.Appear);
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.g
    public j k() {
        this.f14988b.add(ControlAction.Collapsed);
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.a
    public j l() {
        this.f14988b.add(ActionState.Started);
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.i
    public j m() {
        this.f14988b.add(NavigationAction.Cancel);
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.i
    public j o() {
        this.f14988b.add(NavigationAction.Close);
        return this;
    }

    public final SNSTrackEvents p() {
        String str = "msdk:" + s.P(this.f14988b, p.f15541a, null, null, b.f14990a, 30);
        com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
        StringBuilder r8 = androidx.camera.core.impl.utils.a.r(str, " payload: ");
        r8.append(this.f14989c);
        Logger.d$default(aVar, "Analytics", r8.toString(), null, 4, null);
        return new SNSTrackEvents(str, f14986e.format(new Date()), this.f14989c);
    }

    @Override // com.sumsub.sns.internal.core.analytics.h
    public j a(SdkEvent sdkEvent) {
        this.f14988b.add(sdkEvent);
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.h
    public n a(Screen screen) {
        this.f14988b.add(Domain.Ui);
        this.f14988b.add(screen);
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.h
    public com.sumsub.sns.internal.core.analytics.a a(Action action) {
        this.f14988b.add(Domain.PrimaryAction);
        this.f14988b.add(action);
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.n
    public g a(Control control) {
        this.f14988b.add(control);
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.j
    public l a(Map<String, ? extends Object> map) {
        this.f14989c = kotlin.collections.a.t(kotlin.collections.a.w(map), com.sumsub.sns.internal.ff.a.f16930a.c());
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.j
    public l a(Pair<String, ? extends Object>... pairArr) {
        this.f14989c = kotlin.collections.a.t(kotlin.collections.a.x(pairArr), com.sumsub.sns.internal.ff.a.f16930a.c());
        return this;
    }

    @Override // com.sumsub.sns.internal.core.analytics.l
    public void a(boolean z10) {
        com.sumsub.sns.internal.core.analytics.b.f14967a.a(p(), z10);
    }
}
