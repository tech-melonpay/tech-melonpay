package com.sumsub.sns.internal.ml.core.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.tensorflow.lite.DataType;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0274a f17671c = new C0274a(null);

    /* renamed from: a, reason: collision with root package name */
    public final float[] f17672a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f17673b;

    /* renamed from: com.sumsub.sns.internal.ml.core.buffer.a$a, reason: collision with other inner class name */
    public static final class C0274a {
        public /* synthetic */ C0274a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(int[] iArr) {
            int i = 1;
            for (int i9 : iArr) {
                i *= i9;
            }
            return i;
        }

        public C0274a() {
        }
    }

    public a(float[] fArr, int[] iArr) {
        this.f17672a = fArr;
        this.f17673b = iArr;
    }

    public final ByteBuffer a() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(DataType.FLOAT32.byteSize() * f17671c.a(this.f17673b));
        allocateDirect.order(ByteOrder.nativeOrder());
        allocateDirect.asFloatBuffer().put(this.f17672a);
        return allocateDirect;
    }
}
