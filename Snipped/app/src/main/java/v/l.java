package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import androidx.camera.camera2.internal.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import v.h;
import v.i;

/* compiled from: SessionConfigurationCompat.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final c f30502a;

    /* compiled from: SessionConfigurationCompat.java */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final SessionConfiguration f30503a;

        /* renamed from: b, reason: collision with root package name */
        public final List<f> f30504b;

        public a(ArrayList arrayList, Executor executor, q qVar) {
            f fVar;
            SessionConfiguration sessionConfiguration = new SessionConfiguration(0, l.a(arrayList), executor, qVar);
            this.f30503a = sessionConfiguration;
            List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
            ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
            for (OutputConfiguration outputConfiguration : outputConfigurations) {
                if (outputConfiguration == null) {
                    fVar = null;
                } else {
                    int i = Build.VERSION.SDK_INT;
                    fVar = new f(i >= 33 ? new j(outputConfiguration) : i >= 28 ? new i(new i.a(outputConfiguration)) : new h(new h.a(outputConfiguration)));
                }
                arrayList2.add(fVar);
            }
            this.f30504b = Collections.unmodifiableList(arrayList2);
        }

        @Override // v.l.c
        public final e a() {
            return e.a(this.f30503a.getInputConfiguration());
        }

        @Override // v.l.c
        public final CameraCaptureSession.StateCallback b() {
            return this.f30503a.getStateCallback();
        }

        @Override // v.l.c
        public final void c(e eVar) {
            this.f30503a.setInputConfiguration(eVar.f30491a.a());
        }

        @Override // v.l.c
        public final Object d() {
            return this.f30503a;
        }

        @Override // v.l.c
        public final Executor e() {
            return this.f30503a.getExecutor();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f30503a, ((a) obj).f30503a);
            }
            return false;
        }

        @Override // v.l.c
        public final int f() {
            return this.f30503a.getSessionType();
        }

        @Override // v.l.c
        public final List<f> g() {
            return this.f30504b;
        }

        @Override // v.l.c
        public final void h(CaptureRequest captureRequest) {
            this.f30503a.setSessionParameters(captureRequest);
        }

        public final int hashCode() {
            return this.f30503a.hashCode();
        }
    }

    /* compiled from: SessionConfigurationCompat.java */
    public interface c {
        e a();

        CameraCaptureSession.StateCallback b();

        void c(e eVar);

        Object d();

        Executor e();

        int f();

        List<f> g();

        void h(CaptureRequest captureRequest);
    }

    public l(ArrayList arrayList, Executor executor, q qVar) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f30502a = new b(arrayList, executor, qVar);
        } else {
            this.f30502a = new a(arrayList, executor, qVar);
        }
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((f) it.next()).f30493a.g());
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        return this.f30502a.equals(((l) obj).f30502a);
    }

    public final int hashCode() {
        return this.f30502a.hashCode();
    }

    /* compiled from: SessionConfigurationCompat.java */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final List<f> f30505a;

        /* renamed from: b, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f30506b;

        /* renamed from: c, reason: collision with root package name */
        public final Executor f30507c;

        /* renamed from: e, reason: collision with root package name */
        public e f30509e = null;

        /* renamed from: d, reason: collision with root package name */
        public final int f30508d = 0;

        public b(ArrayList arrayList, Executor executor, q qVar) {
            this.f30505a = Collections.unmodifiableList(new ArrayList(arrayList));
            this.f30506b = qVar;
            this.f30507c = executor;
        }

        @Override // v.l.c
        public final e a() {
            return this.f30509e;
        }

        @Override // v.l.c
        public final CameraCaptureSession.StateCallback b() {
            return this.f30506b;
        }

        @Override // v.l.c
        public final void c(e eVar) {
            if (this.f30508d == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f30509e = eVar;
        }

        @Override // v.l.c
        public final Object d() {
            return null;
        }

        @Override // v.l.c
        public final Executor e() {
            return this.f30507c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f30509e, bVar.f30509e) && this.f30508d == bVar.f30508d) {
                    List<f> list = this.f30505a;
                    int size = list.size();
                    List<f> list2 = bVar.f30505a;
                    if (size == list2.size()) {
                        for (int i = 0; i < list.size(); i++) {
                            if (!list.get(i).equals(list2.get(i))) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // v.l.c
        public final int f() {
            return this.f30508d;
        }

        @Override // v.l.c
        public final List<f> g() {
            return this.f30505a;
        }

        public final int hashCode() {
            int hashCode = this.f30505a.hashCode() ^ 31;
            int i = (hashCode << 5) - hashCode;
            e eVar = this.f30509e;
            int hashCode2 = (eVar == null ? 0 : eVar.f30491a.hashCode()) ^ i;
            return this.f30508d ^ ((hashCode2 << 5) - hashCode2);
        }

        @Override // v.l.c
        public final void h(CaptureRequest captureRequest) {
        }
    }
}
