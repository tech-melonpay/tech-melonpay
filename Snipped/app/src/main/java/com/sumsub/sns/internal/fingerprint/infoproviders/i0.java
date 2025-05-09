package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import ca.InterfaceC0635a;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class i0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f17323a;

    public static final class a extends Lambda implements InterfaceC0635a<List<? extends g0>> {
        public a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<g0> invoke() {
            List<Sensor> sensorList;
            SensorManager sensorManager = i0.this.f17323a;
            if (sensorManager == null || (sensorList = sensorManager.getSensorList(-1)) == null) {
                return EmptyList.f23104a;
            }
            ArrayList arrayList = new ArrayList(P9.n.u(sensorList, 10));
            for (Sensor sensor : sensorList) {
                arrayList.add(new g0(sensor.getName(), sensor.getVendor()));
            }
            return arrayList;
        }
    }

    public i0(SensorManager sensorManager) {
        this.f17323a = sensorManager;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.h0
    public List<g0> a() {
        Object a10 = c.a(0L, new a(), 1, null);
        EmptyList emptyList = EmptyList.f23104a;
        if (a10 instanceof Result.Failure) {
            a10 = emptyList;
        }
        return (List) a10;
    }
}
