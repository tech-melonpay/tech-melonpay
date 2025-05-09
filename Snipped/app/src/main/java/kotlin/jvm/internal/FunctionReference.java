package kotlin.jvm.internal;

import ia.InterfaceC0834b;
import ia.InterfaceC0837e;

/* loaded from: classes2.dex */
public class FunctionReference extends CallableReference implements e, InterfaceC0837e {
    private final int arity;
    private final int flags;

    public FunctionReference(int i) {
        this(i, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC0834b computeReflected() {
        h.f23186a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && f.b(getBoundReceiver(), functionReference.getBoundReceiver()) && f.b(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof InterfaceC0837e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.e
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // ia.InterfaceC0837e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // ia.InterfaceC0837e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // ia.InterfaceC0837e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // ia.InterfaceC0837e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, ia.InterfaceC0834b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC0834b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public FunctionReference(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC0837e getReflected() {
        return (InterfaceC0837e) super.getReflected();
    }

    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i9) {
        super(obj, cls, str, str2, (i9 & 1) == 1);
        this.arity = i;
        this.flags = i9 >> 1;
    }
}
