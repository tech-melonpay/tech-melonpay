package n3;

import com.google.gson.reflect.TypeToken;
import java.util.Calendar;
import java.util.GregorianCalendar;
import n3.p;

/* compiled from: TypeAdapters.java */
/* loaded from: classes.dex */
public final class r implements com.google.gson.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f24210b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f24211c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.r f24212d;

    public r(Class cls, Class cls2, com.google.gson.r rVar) {
        this.f24209a = 0;
        this.f24210b = cls;
        this.f24211c = cls2;
        this.f24212d = rVar;
    }

    @Override // com.google.gson.s
    public final com.google.gson.r a(com.google.gson.g gVar, TypeToken typeToken) {
        switch (this.f24209a) {
            case 0:
                Class rawType = typeToken.getRawType();
                if (rawType == this.f24210b || rawType == this.f24211c) {
                    break;
                }
                break;
            default:
                Class rawType2 = typeToken.getRawType();
                if (rawType2 == this.f24210b || rawType2 == this.f24211c) {
                    break;
                }
                break;
        }
        return this.f24212d;
    }

    public final String toString() {
        switch (this.f24209a) {
            case 0:
                return "Factory[type=" + this.f24211c.getName() + "+" + this.f24210b.getName() + ",adapter=" + this.f24212d + "]";
            default:
                return "Factory[type=" + this.f24210b.getName() + "+" + this.f24211c.getName() + ",adapter=" + this.f24212d + "]";
        }
    }

    public r(p.r rVar) {
        this.f24209a = 1;
        this.f24210b = Calendar.class;
        this.f24211c = GregorianCalendar.class;
        this.f24212d = rVar;
    }
}
