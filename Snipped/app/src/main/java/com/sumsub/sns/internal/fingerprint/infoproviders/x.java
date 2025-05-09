package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.hardware.input.InputManager;
import android.view.InputDevice;
import ca.InterfaceC0635a;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    public final InputManager f17354a;

    public static final class a extends Lambda implements InterfaceC0635a<List<? extends v>> {
        public a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<v> invoke() {
            int[] inputDeviceIds;
            InputManager inputManager = x.this.f17354a;
            if (inputManager == null || (inputDeviceIds = inputManager.getInputDeviceIds()) == null) {
                return EmptyList.f23104a;
            }
            x xVar = x.this;
            ArrayList arrayList = new ArrayList(inputDeviceIds.length);
            for (int i : inputDeviceIds) {
                InputDevice inputDevice = xVar.f17354a.getInputDevice(i);
                String valueOf = String.valueOf(inputDevice != null ? Integer.valueOf(inputDevice.getVendorId()) : null);
                String name = inputDevice != null ? inputDevice.getName() : null;
                if (name == null) {
                    name = "";
                }
                arrayList.add(new v(name, valueOf));
            }
            return arrayList;
        }
    }

    public x(InputManager inputManager) {
        this.f17354a = inputManager;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.w
    public List<v> a() {
        Object a10 = c.a(0L, new a(), 1, null);
        EmptyList emptyList = EmptyList.f23104a;
        if (a10 instanceof Result.Failure) {
            a10 = emptyList;
        }
        return (List) a10;
    }
}
