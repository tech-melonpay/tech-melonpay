package M6;

import ca.InterfaceC0635a;
import com.luminary.business.presentation.entity.company.UploadFileUI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f2673b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2674c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f2677f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f2678g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f2679h;
    public final /* synthetic */ String i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f2680j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2681k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UploadFileUI f2682l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2683m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2684n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2685o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f2686p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f2687q;

    public /* synthetic */ v(w wVar, String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, ArrayList arrayList, String str5) {
        this.f2672a = 0;
        this.f2673b = wVar;
        this.f2674c = str;
        this.f2675d = null;
        this.f2676e = str2;
        this.f2677f = str3;
        this.f2683m = null;
        this.f2678g = null;
        this.f2684n = bool;
        this.f2685o = bool2;
        this.f2679h = null;
        this.f2686p = null;
        this.i = str4;
        this.f2680j = null;
        this.f2687q = arrayList;
        this.f2681k = str5;
        this.f2682l = null;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f2672a) {
            case 0:
                w wVar = this.f2673b;
                wVar.l();
                wVar.f2703d1.a(new p(wVar, this.f2682l, 0), new I5.d(this.f2674c, this.f2675d, this.f2676e, this.f2677f, (Boolean) this.f2683m, this.f2678g, (Boolean) this.f2684n, (Boolean) this.f2685o, this.f2679h, (Float) this.f2686p, this.i, this.f2680j, (List) this.f2687q, this.f2681k));
                break;
            default:
                w wVar2 = this.f2673b;
                wVar2.l();
                Date date = (Date) this.f2683m;
                wVar2.f2706g1.a(new o(wVar2, this.f2682l, (UploadFileUI) this.f2687q), new I5.m(this.f2674c, this.f2675d, this.f2676e, this.f2677f, this.f2678g, this.f2679h, date != null ? Long.valueOf(date.getTime() / 1000) : null, this.i, this.f2680j, this.f2681k, (String) this.f2684n, (String) this.f2685o, (String) this.f2686p));
                break;
        }
        return O9.p.f3034a;
    }

    public /* synthetic */ v(w wVar, String str, String str2, String str3, String str4, String str5, String str6, Date date, String str7, String str8, String str9, String str10, String str11, String str12, UploadFileUI uploadFileUI, UploadFileUI uploadFileUI2) {
        this.f2672a = 1;
        this.f2673b = wVar;
        this.f2674c = str;
        this.f2675d = str2;
        this.f2676e = str3;
        this.f2677f = str4;
        this.f2678g = str5;
        this.f2679h = str6;
        this.f2683m = date;
        this.i = str7;
        this.f2680j = str8;
        this.f2681k = str9;
        this.f2684n = str10;
        this.f2685o = str11;
        this.f2686p = str12;
        this.f2682l = uploadFileUI;
        this.f2687q = uploadFileUI2;
    }
}
