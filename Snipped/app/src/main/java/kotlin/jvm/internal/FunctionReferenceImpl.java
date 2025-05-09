package kotlin.jvm.internal;

import ia.InterfaceC0835c;
import ia.InterfaceC0836d;

/* loaded from: classes2.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i, InterfaceC0836d interfaceC0836d, String str, String str2) {
        super(i, CallableReference.NO_RECEIVER, ((a) interfaceC0836d).g(), str, str2, !(interfaceC0836d instanceof InterfaceC0835c) ? 1 : 0);
    }

    public FunctionReferenceImpl(int i, Class cls, String str, String str2, int i9) {
        super(i, CallableReference.NO_RECEIVER, cls, str, str2, i9);
    }

    public FunctionReferenceImpl(int i, Object obj, Class cls, String str, String str2, int i9) {
        super(i, obj, cls, str, str2, i9);
    }
}
